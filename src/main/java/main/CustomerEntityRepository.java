package main;

import org.springframework.data.repository.CrudRepository;

public interface CustomerEntityRepository extends CrudRepository<CustomerEntity, Integer> {
}
