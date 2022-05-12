package pe.com.nttdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.nttdata.model.Bank;
import pe.com.nttdata.model.Product;
import pe.com.nttdata.model.ProductRequest;
import pe.com.nttdata.repository.BankRepository;
import pe.com.nttdata.repository.ProductRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class ProductServiceImpl implements  ProductServiceInf {
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private BankRepository bankRepository;

	@Override
	public Mono<Product> save( Mono<Product> product) {
		return product.flatMap(this.productRepository::save);
		
	}

	@Override
	public Flux<Product> findAll() {
		return this.productRepository.findAll();
	}

	@Override
	public Mono<Product> findById(String id) {
		return this.productRepository.findById(id);
	}

	@Override
	public Mono<Void> delete(Product producto) {
		return this.productRepository.delete(producto);
	}

	@Override
	public Flux<Product> findTop10ByOrderByIdCustomerDesc(String idCustomer) {
		return this.productRepository.findTop10ByOrderByIdCustomerDesc(idCustomer);
	}

	@Override
	public Flux<Product> findByIdCustomers(String id) {
		return this.productRepository.findByIdCustomer(id);
	}

	@Override
	public Mono<Product> findByIdAndIdTypeProduct(ProductRequest request) {
		return this.productRepository.findByIdAndIdTypeProduct(request.getId(), request.getIdTypeProduct());
	}

	@Override
	public Mono<Bank> saveBank(Mono<Bank> bank) {
		return bank.flatMap(this.bankRepository::save);
	}

	@Override
	public Flux<Bank> findAllBank() {
		return this.bankRepository.findAll();
	}

	@Override
	public Mono<Bank> findByIdBank(String id) {
		return this.bankRepository.findById(id);
	}
	



}
