package com.example.user.aliceprototype.Database;

import java.sql.*;
/*
import com.microsoft.sqlserver.*;
*/

public class ConnectionClass
{
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args)
    {
        String connectionString =
                "jdbc:sqlserver:/myalice.database.windows.net,1433;" +
                        "Data Source=myalice.database.windows.net;" +
                        "Initial Catalog=AliceDatabase;" +
                        "Persist Security Info=False;" +
                        "User ID=Alice;" +
                        "Password=BITSplease1234;" +
                        "Pooling=False;" +
                        "MultipleActiveResultSets=False;" +
                        "Encrypt=True;" +
                        "TrustServerCertificate=False;" +
                        "Connection Timeout=30;";

        // Replace server name, username, and password with your credentials
        /*String connectionString =
                "jdbc:sqlserver://yourserver.database.windows.net:1433;"
                        + "database=AdventureWorks;"
                        + "user=yourusername@yourserver;"
                        + "password=yourpassword;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "hostNameInCertificate=*.database.windows.net;"
                        + "loginTimeout=30;";*/

        // Declare the JDBC objects.
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(connectionString);

            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT * from User";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            while (resultSet.next())
            {
                System.out.println(resultSet.getString(2) + " "
                        + resultSet.getString(3));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            // Close the connections after the data has been handled.
            if (resultSet != null) try { resultSet.close(); } catch(Exception e) {}
            if (statement != null) try { statement.close(); } catch(Exception e) {}
            if (connection != null) try { connection.close(); } catch(Exception e) {}
        }
    }
}