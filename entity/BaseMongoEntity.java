package entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

@Data

public class BaseMongoEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Field(value = "_id")
  private String id;

  private String storeId;

  @Version
  private Long version;

  @CreatedDate
  private Date createdDate;

  @CreatedBy
  private String createdBy;

  @LastModifiedDate
  private Date updatedDate;

  @LastModifiedBy
  private String updatedBy;

  private boolean markForDelete;
}
