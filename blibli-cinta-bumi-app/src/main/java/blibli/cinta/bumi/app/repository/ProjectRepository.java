package blibli.cinta.bumi.app.repository;

import blibli.cinta.bumi.app.entity.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends MongoRepository<Project, String> {
}
