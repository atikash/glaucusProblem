package com.glaucus.problem.model;

import com.glaucus.problem.dao.NumberCrud;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 *{@link Number}
 *
 * @author Atikash
 * @since 17-01-2021
 */

@Entity
public class Number {
    /**
     * unique id of the record present in DB for {@link Number}
     */
    @Id
    private Integer id;
    /**
     * the number field for  {@link Number}
     */
    private Integer number;

    /**
     * parameterized constructor for {@link Number}
     * @param id for the object being created
     * @param number for the object being created
     */
    public Number(Integer id,Integer number){
        this.number = number;
        this.id = id;
    }

    /**
     * default constructor for {@link Number}
     */
    public Number(){
    }

}

