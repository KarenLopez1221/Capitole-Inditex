package co.capitole.inditex.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.capitole.inditex.entity.BrandsEntity;

@Repository
public interface BrandsRepository extends CrudRepository<BrandsEntity, String> {
}
