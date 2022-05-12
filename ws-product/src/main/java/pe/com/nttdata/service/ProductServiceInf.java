package pe.com.nttdata.service;

import pe.com.nttdata.model.Bank;
import pe.com.nttdata.model.Product;
import pe.com.nttdata.model.ProductRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductServiceInf {
	public Mono<Product>  save(Mono<Product> product);
	public Flux<Product>findAll();
	public Mono<Product>  findById(String id);
	public Mono<Void> delete(Product producto);
	public Flux<Product>findTop10ByOrderByIdCustomerDesc(String idCustomer);
	public Flux<Product>  findByIdCustomers(String id);
	public Mono<Product>  findByIdAndIdTypeProduct(ProductRequest request);
	
	public Mono<Bank>  saveBank(Mono<Bank> bank);
	public Flux<Bank>findAllBank();
	public Mono<Bank>  findByIdBank(String id);
	
}
