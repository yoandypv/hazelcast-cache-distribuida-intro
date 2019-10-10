package com.yoandypv.hazelcast.web;

import com.yoandypv.hazelcast.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaResource {

    @Autowired
    private PruebaService pruebaService;

    @GetMapping("/prueba")
    public ResponseEntity<String> getResult() {
        return new ResponseEntity<>(pruebaService.getData("test"), HttpStatus.OK);
    }

}
