package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarbonFootprintVO {

  private static final long serialVersionUID = -5856468469967267309L;

  private double carbonOffset;
  private double trees;
  private double price;
}
