package com.glaucus.problem.controller;

import com.glaucus.problem.dao.NumberCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@link Controller} class for the spring application
 *
 * @author Atikash
 * @since 17-01-2021
 */

@RestController
public class Controller {

    @Autowired
    NumberCrud numberCrud;

    /**
     * This is a controller method for update number API
     *
     * @return ResponseEntity
     */
    @PutMapping("/update")
    public ResponseEntity updateNumber() {

        numberCrud.updateNumber();
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    /**
     * This is a controller method for get number API
     *
     * @return Integer
     */
    @GetMapping("/getnumber")
    public Integer getNumber() {
        return numberCrud.getNumber();
    }
}
