package com.blog.spring6.jdbc;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class TestJdbc{


    public static void main(String[] args) throws SQLException  {

        DriverManager.registerDriver(new Driver());
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jeecg-boot","root","root");
        Statement statement = connection.createStatement();
        String sql="select * from b_article where create_by= ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"admin");
        ResultSet resultSet = preparedStatement.executeQuery();
        //
        if(resultSet.next()){
            System.out.println("查询成功");
        }else{
            System.out.println("查询失败");
        }

    }

}
