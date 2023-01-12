package repository;

import model.Administrator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TurnPointRepository extends CrudRepository<Administrator, Long> {
}