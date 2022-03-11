package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ListResponse<T> {

  private static final long serialVersionUID = 1L;

  private boolean success;
  private String errorMessage;
  private List<T> content;

  public ListResponse(List<T> content) {
    this.success = true;
    this.content = content;
  }
}
