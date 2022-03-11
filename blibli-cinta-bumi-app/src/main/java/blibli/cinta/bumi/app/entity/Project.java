package blibli.cinta.bumi.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Document(collection = "projects")
public class Project extends BaseMongoEntity {
  private String name;
  private String address;
  private double numberOfTreesNeeded;
  private double currentTreesPlanted;
  private long deadlineTimestamp;
}
