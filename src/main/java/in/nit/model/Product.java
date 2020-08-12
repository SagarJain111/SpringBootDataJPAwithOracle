package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Product {
	@Id
	private Integer prodId;
	private String prodCode;
	private Double prodCost;
}
