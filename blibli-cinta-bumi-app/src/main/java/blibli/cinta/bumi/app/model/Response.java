package blibli.cinta.bumi.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response<T> {

  private static final long serialVersionUID = -5856468469967267309L;

  private boolean success;
  private String errorMessage;
  private T content;

  public Response(T content) {
    this.success = true;
    this.content = content;
  }
}
