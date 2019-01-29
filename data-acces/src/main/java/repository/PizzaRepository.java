package repository;

import model.entity.PizzaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by  eric.nyandwi on Jan,28/01/2019
 */
@Repository
public interface PizzaRepository extends JpaRepository<PizzaEntity, Long> {
}
