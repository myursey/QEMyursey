package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<Respone> update(@RequestBody Student student) {
        Respone respone = new Respone();
        respone.setId(student.getId());
        respone.setStatus("OK");
        respone.setDescription("New student added");
        return new ResponseEntity<Respone>(respone, HttpStatus.OK);
    }
}
