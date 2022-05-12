package pe.com.nttdata.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import pe.com.nttdata.model.Bank;

@Repository
public interface BankRepository extends ReactiveMongoRepository<Bank, String>{
	
}
