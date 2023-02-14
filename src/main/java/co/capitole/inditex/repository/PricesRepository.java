package co.capitole.inditex.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.capitole.inditex.entity.PricesEntity;

@Repository
public interface PricesRepository extends CrudRepository<PricesEntity, String> {
}
