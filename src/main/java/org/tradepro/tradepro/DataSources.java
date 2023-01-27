package org.tradepro.tradepro;

import java.sql.SQLException;

public interface DataSources {
boolean connect();

    boolean connect(String host, int port, String dbName) ;

    boolean findOne(String table , String name, String value);
    boolean findById(String table ,long id ,String name, String value);
    boolean findAll(String table ,String name, String value);
    boolean findAllById(String table ,long id ,String name, String value);
    boolean update(String table ,String name ,String value);
    boolean updateById(String table ,long id ,String name ,String value);
    boolean updateAll(String table ,String name ,String value);
    boolean delete (String table ,String name ,String value);
    boolean deleteById(String table ,long id ,String name ,String value);

    boolean create(String table ,String name ,String value) throws SQLException;



}
