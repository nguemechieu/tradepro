package org.tradepro.tradepro;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Logger;

public class DataSourceManager implements DataSources{
    Logger log = Logger.getLogger(String.valueOf(DataSourceManager.class));
    DataSource dataSource= new DataSource() {
        /**
         * @param iface A Class defining an interface that the result must implement.
         * @param <T>
         * @return
         * @throws SQLException
         */
        @Contract(pure = true)
        @Override
        public <T> @Nullable T unwrap(Class<T> iface) throws SQLException {
            return null;
        }

        /**
         * @param iface a Class defining an interface.
         * @return
         * @throws SQLException
         */
        @Override
        public boolean isWrapperFor(Class<?> iface) throws SQLException {
            return false;
        }

        /**
         * @return
         * @throws SQLException
         */
        @Contract(pure = true)
        @Override
        public @Nullable Connection getConnection() throws SQLException {
            return null;
        }

        /**
         * @param username the database user on whose behalf the connection is
         *                 being made
         * @param password the user's password
         * @return
         * @throws SQLException
         */
        @Contract(pure = true)
        @Override
        public @Nullable Connection getConnection(String username, String password) throws SQLException {
            return null;
        }

        /**
         * @return
         * @throws SQLException
         */
        @Contract(pure = true)
        @Override
        public @Nullable PrintWriter getLogWriter() throws SQLException {
            return null;
        }

        /**
         * @param out the new log writer; to disable logging, set to null
         * @throws SQLException
         */
        @Override
        public void setLogWriter(PrintWriter out) throws SQLException {

        }

        /**
         * @param seconds the data source login time limit
         * @throws SQLException
         */
        @Override
        public void setLoginTimeout(int seconds) throws SQLException {

        }

        /**
         * @return
         * @throws SQLException
         */
        @Override
        public int getLoginTimeout() throws SQLException {
            return 0;
        }

        /**
         * @return
         * @throws SQLException
         */
        @Override
        public ConnectionBuilder createConnectionBuilder() throws SQLException {
            return DataSource.super.createConnectionBuilder();
        }

        /**
         * @return
         * @throws SQLFeatureNotSupportedException
         */
        @Contract(pure = true)
        @Override
        public @Nullable Logger getParentLogger() throws SQLFeatureNotSupportedException {
            return null;
        }

        /**
         * @return
         * @throws SQLException
         */
        @Override
        public ShardingKeyBuilder createShardingKeyBuilder() throws SQLException {
            return DataSource.super.createShardingKeyBuilder();
        }
    };

    @Override
    public boolean connect() {
        return false;
    }

    @Override
  public   boolean connect(String host, int port, String dbName)  {
    try {
         dataSource.createConnectionBuilder().user(dbName).password(dbName).build();
         return true;
    }
    catch (Exception e) {

        log.info("Error connecting"+ e);
    }

    return false;

}
    public boolean findOne(String table, String name, String value) {










        return false;
    }

    @Override
    public boolean findById(String table, long id, String name, String value) {
        return false;
    }

    @Override
    public boolean findAll(String table, String name, String value) {
        return false;
    }

    @Override
    public boolean findAllById(String table, long id, String name, String value) {
        return false;
    }

    @Override
    public boolean update(String table, String name, String value) {
        return false;
    }

    @Override
    public boolean updateById(String table, long id, String name, String value) {
        return false;
    }

    @Override
    public boolean updateAll(String table, String name, String value) {
        return false;
    }

    @Override
    public boolean delete(String table, String name, String value) {
        return false;
    }

    @Override
    public boolean deleteById(String table, long id, String name, String value) {
        return false;
    }

    @Override
    public boolean create(String table, String name, String value) throws SQLException {

        dataSource.getConnection().createStatement().execute(value);





        return false;
    }
}
