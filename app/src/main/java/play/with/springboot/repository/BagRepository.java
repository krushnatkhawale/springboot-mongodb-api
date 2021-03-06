package play.with.springboot.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import play.with.springboot.model.Bag;

import java.util.UUID;

@Repository
public interface BagRepository extends MongoRepository<Bag, Integer> {
}