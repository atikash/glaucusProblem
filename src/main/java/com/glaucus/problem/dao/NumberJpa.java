package com.glaucus.problem.dao;

import com.glaucus.problem.model.Number;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * {@link NumberJpa}
 * Interface that extends {@link JpaRepository} to perform CRUD operations on DB.
 *
 * @author Atikash
 * @since 17-01-2021
 */

@Repository
public interface NumberJpa extends JpaRepository<Number,Long> {
}
