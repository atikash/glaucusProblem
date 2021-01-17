package com.glaucus.problem;

import com.glaucus.problem.dao.NumberCrudImpl;
import com.glaucus.problem.dao.NumberJpa;
import com.glaucus.problem.model.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@link ProblemApplication}
 * starting point for the spring application that has main method
 */
@SpringBootApplication
public class ProblemApplication {
	/**
     * main method
	 * @param args the command line arguments
     */
public static void main(String[] args) {
		SpringApplication.run(ProblemApplication.class, args);
		}

}
