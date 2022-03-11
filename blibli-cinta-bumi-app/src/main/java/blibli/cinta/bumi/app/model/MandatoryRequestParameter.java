package blibli.cinta.bumi.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class MandatoryRequestParameter implements Serializable {

  private static final long serialVersionUID = 5811082163776658872L;

  @NotBlank
  private String storeId;

  @NotBlank
  private String channelId;

  @NotBlank
  private String clientId;

  @NotBlank
  private String requestId;

  @NotBlank
  private String username;
}
