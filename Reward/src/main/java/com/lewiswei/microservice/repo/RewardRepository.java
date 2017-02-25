package com.lewiswei.microservice.repo;

import com.lewiswei.microservice.model.Reward;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Lewis Wei on 17/2/25.
 */
public interface RewardRepository extends MongoRepository<Reward, String> {
}
