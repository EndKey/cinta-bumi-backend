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
@Document(collection = "histories")
public class History extends BaseMongoEntity {
  private String userId;
  private String description;
  private int amount;
  private long timestamp;
  private long price;
  private double trees;
}
