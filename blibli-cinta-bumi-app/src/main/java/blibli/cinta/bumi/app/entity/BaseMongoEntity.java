package blibli.cinta.bumi.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseMongoEntity implements Serializable {
  private static final long serialVersionUID = -1275268235476196775L;

  @Id
  @Field(value = "_id")
  private String id;
}
