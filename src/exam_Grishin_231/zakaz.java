package exam_Grishin_231;

import java.sql.*;

public class zakaz {
    private final String host = "localhost";
    private final String port = "5432";
    private final String dbName = "postgres";
    private final String login = "postgres";
    private final String password = "123";

    private Connection dbcon;

    private Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String str ="jdbc:postgresql://" + host + ":" + port + "/" + dbName;
        Class.forName("org.postgresql.Driver");
        dbcon = DriverManager.getConnection(str, login, password);
        return dbcon;
    }

    public void isConnection() throws SQLException, ClassNotFoundException {
        dbcon = getDbConnection();
        System.out.println(dbcon.isValid(1000));
    }

    public void createTable(String tableName) throws SQLException, ClassNotFoundException {
        String sql = "CREATE TABLE IF NOT EXISTS " + tableName +
                "(id INT PRIMARY KEY, location VARCHAR(50), sum INT, status VARCHAR(50))";
        Statement statement = getDbConnection().createStatement();
        statement.executeUpdate(sql);
    }

    public void addTable(String table, int id, String location, int sum, String status) throws ClassNotFoundException {
        try {
            Statement statement = getDbConnection().createStatement();
            int rows = statement.executeUpdate("INSERT INTO " + table +
                    " (id, location, sum, status) " +
                    " VALUES (" + id + ", '" + location + "', '" + sum + "', '" + status + "');");
            System.out.printf("Добавлено %d строк\n", rows);
        } catch (SQLException e) {
            System.out.printf("Ошибка\n");
        }
    }

    public void selectFree(String Colomn,String tableName) throws SQLException, ClassNotFoundException {
        try {
            Statement statement = getDbConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from " + tableName + " WHERE " + Colomn + " = 'free';");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String location = resultSet.getString(2);
                String sum = resultSet.getString(3);
                String status = resultSet.getString(4);
                System.out.printf("%d, %s, %s, %s. \n", id, location, sum, status);
            }
        } catch (SQLException e) {
            System.out.printf("Ошибка\n");
        }
    }

    public void selectTable(String tableName) throws SQLException, ClassNotFoundException {
        Statement statement = getDbConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from " + tableName);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String location = resultSet.getString(2);
            String sum = resultSet.getString(3);
            String status = resultSet.getString(4);
            System.out.printf("%d, %s, %s, %s. \n", id, location, sum, status);
        }
    }
}