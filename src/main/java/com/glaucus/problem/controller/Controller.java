package com.glaucus.problem.controller;

import com.glaucus.problem.dao.NumberCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.TransactionRolledbackException;

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
     *return HTTP status 200 in case of successful execution or else return HTTP Status 500 with error message..
     * @return ResponseEntity
     */
    @PutMapping("/update")
    public ResponseEntity updateNumber() {

        try {
            numberCrud.updateNumber();
            return ResponseEntity.status(HttpStatus.OK).build();
        }catch (RuntimeException e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
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
