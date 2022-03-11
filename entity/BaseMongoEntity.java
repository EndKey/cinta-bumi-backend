package entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data

public class BaseMongoEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Field(value = "_id")
  private String id;
}
