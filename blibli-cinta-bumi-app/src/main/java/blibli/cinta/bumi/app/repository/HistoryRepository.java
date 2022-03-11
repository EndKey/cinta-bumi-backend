package blibli.cinta.bumi.app.repository;

import blibli.cinta.bumi.app.entity.History;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryRepository extends MongoRepository<History, String> {

  List<History> findAllByUserId(String userId);
}
