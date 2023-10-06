package data;

import lombok.SneakyThrows;
import lombok.val;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SQLHelper {
    public SQLHelper() {

    }

    private static Connection getConn() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/app", "app", "pass");
    }

    @SneakyThrows
    public static String getPaymentStatus() {
        String statusSQL = "SELECT status FROM payment_entity";
        return getStatus(statusSQL);
    }

    @SneakyThrows
    private static String getStatus(String query) {
        val runner = new QueryRunner();
        var connection = getConn();
        String status = runner.query(connection, query, new ScalarHandler<String>());
        System.out.println(status);
        return status;
    }
}