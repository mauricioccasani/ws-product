package pe.com.nttdata.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Document(collection = "bank")
public class Bank {
	@Id
	private String id;
	//nombre bank
	private String nameBank;
	//moneda virtual
	private Double virtualCurrency;
	
}
