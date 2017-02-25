package com.lewiswei.microservice.controller;

import com.lewiswei.microservice.repo.MissionRepository;
import com.lewiswei.microservice.model.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Lewis Wei on 17/2/25.
 */
@RestController
@RequestMapping(value = "/missions")
public class MissionController {


    @Autowired
    MissionRepository missionRepository;


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Mission> create(@RequestBody Mission mission) {
        Mission created = missionRepository.save(mission);
        return ResponseEntity.ok(created);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Mission> get(@PathVariable String id) {
        Mission mission = missionRepository.findOne(id);
        return ResponseEntity.ok(mission);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Mission>> getAll() {
        List<Mission> missions = missionRepository.findAll();
        return ResponseEntity.ok(missions);
    }

}
