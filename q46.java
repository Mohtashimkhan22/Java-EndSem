import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class q46 {

    // Database credentials
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/employee_db";
    private static final String USER = "your_username";
    private static final String PASS = "your_password";

    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("org.postgresql.Driver");

            // Create a connection to the database
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
                if (conn != null) {
                    // Create the employee table
                    createTable(conn);

                    // Insert sample records
                    insertEmployee(conn, "John Doe", "E001", "Manager", 60000);
                    insertEmployee(conn, "Jane Smith", "E002", "Developer", 50000);
                    insertEmployee(conn, "Mike Johnson", "E003", "Analyst", 55000);

                    // Query and display the records
                    displayEmployees(conn);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS employee ("
                   + "name VARCHAR(100) NOT NULL, "
                   + "code VARCHAR(10) PRIMARY KEY, "
                   + "designation VARCHAR(100) NOT NULL, "
                   + "salary NUMERIC(10, 2) NOT NULL)";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
    }

    private static void insertEmployee(Connection conn, String name, String code, String designation, double salary) throws SQLException {
        String sql = "INSERT INTO employee (name, code, designation, salary) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, code);
            pstmt.setString(3, designation);
            pstmt.setDouble(4, salary);
            pstmt.executeUpdate();
        }
    }

    private static void displayEmployees(Connection conn) throws SQLException {
        String sql = "SELECT * FROM employee";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Code: " + rs.getString("code"));
                System.out.println("Designation: " + rs.getString("designation"));
                System.out.println("Salary: " + rs.getDouble("salary"));
                System.out.println();
            }
        }
    }
}
