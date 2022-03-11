package repository;

import com.gdn.product.data.synchronize.entity.History;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryRepository extends MongoRepository<History, String> {
  List<History> findAllByUserId(String userId);
}
