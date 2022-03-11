package controller;

import entity.History;
import entity.Project;
import entity.User;
import model.CarbonFootprintVO;
import model.ListResponse;
import model.RecycleVO;
import model.Response;
import repository.HistoryRepository;
import repository.ProjectRepository;
import repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class BlibliCintaBumiController {

  @Autowired
  private HistoryRepository historyRepository;

  @Autowired
  private ProjectRepository projectRepository;

  @Autowired
  private UserRepository userRepository;

  @RequestMapping(value = "/api/user/findDetailById",
      produces = MediaType.APPLICATION_JSON_VALUE,
      method = RequestMethod.GET)
  @ResponseBody
  public Response findUserDetailById(
      @RequestParam String userId) throws Exception {
    try {
      User user = this.userRepository.findById(userId).get();
      return new Response(user);
    } catch (Exception e) {
      return new Response(false, e.getMessage(), null);
    }
  }

  @RequestMapping(value = "/api/projects/getList",
      produces = MediaType.APPLICATION_JSON_VALUE,
      method = RequestMethod.POST)
  @ResponseBody
  public ListResponse getProjectList() throws Exception {
    try {
      List<Project> projects = this.projectRepository.findAll();
      return new ListResponse(projects);
    } catch (Exception e) {
      return new ListResponse(false, e.getMessage(), null);
    }
  }

  @RequestMapping(value = "/api/history/findListByUserId",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE,
      method = RequestMethod.POST)
  @ResponseBody
  public ListResponse findHistoryListByUserId(
      @RequestParam String userId)
      throws Exception {
    try {
      List<History> historyList = this.historyRepository.findAllByUserId(userId);
      return new ListResponse(historyList);
    } catch (Exception e) {
      return new ListResponse(false, e.getMessage(), null);
    }
  }

  @RequestMapping(value = "/api/rewards/claim",
      method = {RequestMethod.POST},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ResponseBody
  public Response claimUnclaimedRewards(
      @RequestParam String userId) {
    try {
      User user = this.userRepository.findById(userId).get();
      // this.rewardService.addUnclaimedPoints(user);
      user.setUnclaimedPoints(0);
      this.userRepository.save(user);
      return new Response(user);
    } catch (Exception e) {
      return new Response(false, e.getMessage(), null);
    }
  }

  @RequestMapping(value = "/api/order/calculateOrderCarbonFootprint",
      method = {RequestMethod.GET},
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ResponseBody
  public Response calculateOrderCarbonFootprint(
      @RequestParam double distanceInM) {
    double avgFuelDistanceInKmPerL = 52.6;
    double carbonProducedInKgCO2PerFuel = 2.66;
    double carbonOffsetInKgCO2PerTree = 31.5;
    int moneySpentPerTree = 45000;

    double fuelNeeded = distanceInM / avgFuelDistanceInKmPerL;
    double carbonProduced = fuelNeeded * carbonProducedInKgCO2PerFuel;
    double treesNeeded = carbonProduced / carbonOffsetInKgCO2PerTree;
    double moneySpent = moneySpentPerTree * treesNeeded;
    CarbonFootprintVO result = new CarbonFootprintVO(carbonProduced, treesNeeded, moneySpent);
    return new Response(result);
  }

  @RequestMapping(value = "/api/order/calculateOrderRecyclePrice",
      method = {RequestMethod.GET},
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ResponseBody
  public Response calculateOrderRecyclePrice(
      @RequestParam int cardboardAmount) {
    int pricePerCardboard = 2500;
    double weightInKgPerCardboard = 0.5;

    double weight = weightInKgPerCardboard * cardboardAmount;
    double price = pricePerCardboard * cardboardAmount;
    RecycleVO result = new RecycleVO(weight, price);
    return new Response(result);
  }
}
