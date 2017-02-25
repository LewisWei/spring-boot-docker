package com.lewiswei.microservice.controller;

import com.lewiswei.microservice.model.Reward;
import com.lewiswei.microservice.repo.RewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Lewis Wei on 17/2/25.
 */
@RestController
@RequestMapping(value = "/rewards")
public class RewardController {

    @Autowired
    RewardRepository rewardRepository;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Reward> save(@RequestBody Reward reward) {
        Reward created = rewardRepository.save(reward);
        return ResponseEntity.ok(created);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Reward> get(@PathVariable String id) {
        Reward reward = rewardRepository.findOne(id);
        return ResponseEntity.ok(reward);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Reward>> getAll() {
        List<Reward> rewards = rewardRepository.findAll();
        return ResponseEntity.ok(rewards);
    }
}
