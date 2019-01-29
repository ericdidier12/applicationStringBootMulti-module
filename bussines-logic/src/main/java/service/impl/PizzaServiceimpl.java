package service.impl;

import model.entity.PizzaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.PizzaRepository;
import service.PizzaService;

import java.util.List;

/**
 * created by  eric.nyandwi on Jan,28/01/2019
 */

@Service
@Transactional
public class PizzaServiceimpl  implements PizzaService {

    PizzaRepository pizzaRepository ;

    @Autowired
    public PizzaServiceimpl(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @Override
    public List<PizzaEntity> listPizza() {
        return  pizzaRepository.findAll();
    }
}
