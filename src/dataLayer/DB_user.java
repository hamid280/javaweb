package dataLayer;

import java.sql.*;

public class DB_user {

    //JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/webapp";

    //Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public boolean isValidUserLogin(String userName, String userPassword)
    {

        boolean isValidUser = false;

        Connection connection = null;
        Statement stmt = null;
        String sql = "";

        try {
            //step2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //step3 Open a connection
            System.out.println("Connecting to database...");
            connection  = DriverManager.getConnection(DB_URL, USER, PASS);

            //step4 Execute a query
            System.out.println("Creating statement");
            stmt = connection.createStatement();

            sql = "SELECT *FROM users WHERE user_name = \"" +
                    userName +"\" AND user_password = \"" + userPassword + "\"";

            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);

            //step5 Extract data from result set
            if (rs.next()){
                isValidUser = true;
            }

            //step6 clean up environment
            rs.close();
            stmt.close();
            connection.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Closing DB connections...");

        return isValidUser;
    }
}
