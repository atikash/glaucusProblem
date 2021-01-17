package com.glaucus.problem.dao;

import com.glaucus.problem.model.Number;
import org.hibernate.HibernateException;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.hibernate.exception.SQLGrammarException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.orm.hibernate5.HibernateJdbcException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.sql.SQLSyntaxErrorException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * This is the implementation class for {@link NumberCrud}
 *
 * @author Atikash
 * @since 17-01-2021
 */
@Service
public class NumberCrudImpl implements NumberCrud {



    Logger logger = LoggerFactory.getLogger(NumberCrudImpl.class);

    @Autowired
    NumberJpa numberJpa;
    AtomicInteger numb = new AtomicInteger(0);

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void updateNumber() throws RuntimeException {

        try {
            numberJpa.save(new Number(0, numb.incrementAndGet()));
        }catch(RuntimeException e)
        {
            logger.error("Sql Exception occurred because {} ",e.getCause().getCause().getMessage());
            throw new RuntimeException(e.getCause().getCause().getMessage());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getNumber() {
        return numb.get();
    }
}
