package com.glaucus.problem.dao;

import com.glaucus.problem.model.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * This is the implementation class for {@link NumberCrud}
 *
 * @author Atikash
 * @since 17-01-2021
 */
@Service
public class NumberCrudImpl implements NumberCrud {

    @Autowired
    NumberJpa numberJpa;
    AtomicInteger numb = new AtomicInteger(0);

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void updateNumber() {
        numberJpa.save(new Number(0, numb.incrementAndGet()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getNumber() {
        return numb.get();
    }
}
