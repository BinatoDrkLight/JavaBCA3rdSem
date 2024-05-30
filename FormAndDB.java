import javax.swing.*;
import java.sql.*;
public class FormAndDB extends JFrame{
    JLabel idLabel, nameLabel, genderLabel, facultyLabel;
    JTextField idField, nameField;
    JRadioButton genderRadio1, genderRadio2;
    ButtonGroup genders;
    JComboBox facultyCombo;
    String[] facultyGroup;
    JButton btnInsert, btnRetrieve, btnUpdate, btnDelete, btnReset;
    int id;
    String name, gender, faculty;


    public FormAndDB(){
        idLabel = new JLabel("Id");
        idLabel.setBounds(50, 50, 50, 50);

        idField = new JTextField();
        idField.setBounds(120, 60, 150, 30);

        nameLabel = new JLabel("Name");
        nameLabel.setBounds(50, 100, 50, 50);

        nameField = new JTextField();
        nameField.setBounds(120, 110, 150, 30);

        genderLabel = new JLabel("Gender");
        genderLabel.setBounds(50, 150, 50, 50);

        genderRadio1 = new JRadioButton("Male");
        genderRadio1.setBounds(120, 150, 80, 50);

        genderRadio2 = new JRadioButton("Female");
        genderRadio2.setBounds(200, 150, 80, 50);

        genders = new ButtonGroup();
        genders.add(genderRadio1);
        genders.add(genderRadio2);

        facultyLabel = new JLabel("faculty");
        facultyLabel.setBounds(50, 200, 50, 50);

        facultyGroup = new String[]{"BCA", "CSIT", "BBM", "BIM"};
        facultyCombo = new JComboBox(facultyGroup);
        facultyCombo.setBounds(120, 200, 150, 50);

        btnInsert = new JButton("Insert");
        btnInsert.setBounds(55, 280, 100,40);

        btnRetrieve = new JButton("Retrieve");
        btnRetrieve.setBounds(165, 280, 100, 40 );

        btnDelete = new JButton("Delete");
        btnDelete.setBounds(55, 330, 100, 40 );

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(165, 330, 100, 40);

        btnReset = new JButton("Reset");
        btnReset.setBounds(110, 380, 100, 40);

        btnInsert.addActionListener(e->{
            int id = Integer.parseInt(idField.getText());
            name = nameField.getText();
            gender = genderRadio1.isSelected() ? "Male" : "Female";
            faculty = String.valueOf(facultyCombo.getSelectedItem());
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student",
                        "root","");
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate("INSERT INTO studentInfo(id, name, gender, faculty) VALUES(" + id +
                        ", '" + name + "', '" + gender + "', '" + faculty + "');");
                con.close();
            }catch(Exception ex){
                System.out.println(ex.getClass() + ex.getMessage());
            }
        });

        btnRetrieve.addActionListener(e->{
            int id = Integer.parseInt(idField.getText());
            name = nameField.getText();
            gender = genderRadio1.isSelected() ? "Male" : "Female";
            faculty = String.valueOf(facultyCombo.getSelectedItem());
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student",
                        "root","");
                Statement stmt = con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from studentInfo");
                while(rs.next())
                    System.out.println(rs.getInt("id")+"  "+rs.getString("name")+
                            "  "+rs.getString("gender" + " " + rs.getString("faculty")));
                con.close();
            }catch(Exception ex){
                System.out.println(ex.getClass() + ex.getMessage());
            }
        });

        btnDelete.addActionListener(e->{
            int id = Integer.parseInt(idField.getText());
            name = nameField.getText();
            gender = genderRadio1.isSelected() ? "Male" : "Female";
            faculty = String.valueOf(facultyCombo.getSelectedItem());
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://loacalhost:3306/student",
                        "root", "");
                Statement stmt = con.createStatement();
                int rs = stmt.executeUpdate("DELETE FROM studentInfo where id = " + id);
                con.close();
            } catch(Exception ex){
                System.out.println(ex.getClass() + ex.getMessage());
            }
        });

        btnUpdate.addActionListener(e->{
            int id = Integer.parseInt(idField.getText());
            name = nameField.getText();
            gender = genderRadio1.isSelected() ? "Male" : "Female";
            faculty = String.valueOf(facultyCombo.getSelectedItem());
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student");
                Statement stmt = con.createStatement();
                int rs = stmt.executeUpdate("UPDATE studentInfo SET id = " + id + "name = '" + name + "' ,'"
                        + gender + "', '" + faculty + "';");
                con.close();
            } catch(Exception ex){
                System.out.println(ex.getClass() + ex.getMessage());
            }
        });

        btnReset.addActionListener(e->{
            idField.setText("");
            nameField.setText("");
        });

        add(idLabel);
        add(nameLabel);
        add(genderLabel);
        add(facultyLabel);
        add(idField);
        add(nameField);
        add(genderRadio1);
        add(genderRadio2);
        add(facultyCombo);
        add(btnInsert);
        add(btnDelete);
        add(btnRetrieve);
        add(btnUpdate);
        add(btnReset);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new FormAndDB();
    }
}
