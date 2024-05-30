import java.sql.*;
import javax.swing.*;
public class FormDatabase extends JFrame{
JLabel rollLabel, userLabel, passwordLabel;
JTextField rollField, userField, passwordField;
JButton btnInsert, btnRetrieve;
public FormDatabase() {
    //rollNo
    rollLabel = new JLabel("Roll No:");
    rollLabel.setBounds(50, 50, 100, 30);
    rollField = new JTextField();
    rollField.setBounds(150, 50, 150, 30);

    //userName
    userLabel = new JLabel("Username: ");
    userLabel.setBounds(50, 100, 100, 30);
    userField = new JTextField();
    userField.setBounds(150, 100, 150, 30);

    //password
    passwordLabel = new JLabel("Password");
    passwordLabel.setBounds(50, 150, 100, 30);
    passwordField = new JPasswordField();
    passwordField.setBounds(150, 150, 150, 30);

    //Button
    btnInsert = new JButton("Insert");
    btnInsert.setBounds(100, 220, 100, 30);

    btnRetrieve = new JButton("Retrieve");
    btnRetrieve.setBounds(200, 220, 100, 30);

    //-------------------------------------------------------------------------------------------//
    btnInsert.addActionListener(e -> {
//        String roll = rollLabel.getText();
        int rollNo = Integer.parseInt(rollLabel.getText());
        String username = userLabel.getText();
        String password = passwordLabel.getText();
        // ======================================================================================= //
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/empdatabase",
                    "root", "");
            Statement stmtt = conn.createStatement();
            int rs=0;
            rs=stmtt.executeUpdate("INSERT INTO emptable1( Roll, UserName, Password) " +
                    "VALUES(" + rollNo + ", '" + username + "', '" + password + "') ");
        } catch (Exception g) {
            System.out.println(g.getClass() + g.getMessage());
        }
    });

        //-------------------------------------------------------------------------------------------//
        btnRetrieve.addActionListener(h -> {
            // ============================= Adding into the DB ==================================== //
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/empdatabase",
                        "root", "");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from emptable1");
                while (rs.next())
                    JOptionPane.showMessageDialog(btnRetrieve, rs.getInt("Roll") + "  " + rs.getString("UserName")
                            + "  " + rs.getString("Password"));
                con.close();
            } catch (Exception f) {
                System.out.println(f.getClass() + f.getMessage());
            }
        });

        add(rollLabel);
        add(rollField);
        add(userLabel);
        add(userField);
        add(passwordLabel);
        add(passwordField);
        add(btnInsert);
        add(btnRetrieve);
        setSize(400, 360);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {new FormDatabase();}
}
