package com.blog.spring6.jdbc;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class TestJdbc{


    public static void main(String[] args) throws SQLException  {

        DriverManager.registerDriver(new Driver());
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jeecg-boot","root","root");
        String sql="select * from b_article";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
      //  preparedStatement.setString(1,"17690181138918031381");
        ResultSet resultSet = preparedStatement.executeQuery();
        /**
         * TODO:
         *
         */


    }

}
