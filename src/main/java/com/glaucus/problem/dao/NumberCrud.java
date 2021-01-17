package com.glaucus.problem.dao;

/**
 * {@link NumberCrud}
 * Interface that has the following methods.
 *
 * @author Atikash
 * @since 17-01-2021
 */
public interface NumberCrud {

    /**
     * This methods is used to perform business logic to update the 'Number' filed in 'Number' table in Database.
     * might throw RunTimeException in case some problem occurs during accessing DB.
     * @throws RuntimeException in case of Data Access Failure.
     */
    public void updateNumber() throws RuntimeException;

    /**
     * This method is used to get the counter value which will be incremented each time update api is called
     *
     * @return Integer
     */
    public Integer getNumber();

}
