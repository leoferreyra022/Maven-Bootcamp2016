package com.maventest.weather.DAO;
import com.maventest.weather.Domain.*;
import com.maventest.weather.DAO.singletonConnection;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
/**
 * Created by Leo on 04/10/2016.
 */
public class ExtendedForecastDAO implements DAI<ExtendedForecast>
{
    //private Connection connection = singletonConnection.getConnection();

    public ExtendedForecastDAO() throws SQLException {
    }

    @Override
    public ExtendedForecast getById(int id){return null;}

    @Override
    public List<ExtendedForecast> getList(){return null;}

    @Override
    public String insert(ExtendedForecast entity) {
        return null;
    }

    @Override
    public String delete(int id) {
        return null;
    }
}
