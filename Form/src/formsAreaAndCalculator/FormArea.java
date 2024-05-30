package formsAreaAndCalculator;
import javax.swing.*;

public class FormArea extends JFrame {
    JLabel lengthLabel, breadthLabel, heightLabel, areaLabel, periLabel, volLabel;
    JTextField lengthField, breadthField, heightField, areaField, periField, volField;
    JButton btnCalc, btnClear;

    public int area(int l, int b){
        return l * b;
    }

    public int peri(int l, int b){
        return 2 * (l+b);
    }

    public double vol(double l, double b, double h){
        return l * b * h;
    }
    public FormArea(){
        //Num1
        lengthLabel = new JLabel("length");
        lengthLabel.setBounds(50, 50, 100, 30);
        lengthField = new JTextField();
        lengthField.setBounds(150, 50, 150, 30);

        //Num2
        breadthLabel = new JLabel("breadth");
        breadthLabel.setBounds(50, 100, 100, 30);
        breadthField = new JTextField();
        breadthField.setBounds(150, 100, 150, 30);

        //Add
        heightLabel = new JLabel("height");
        heightLabel.setBounds(50, 150, 100, 30);
        heightField = new JTextField();
        heightField.setBounds(150, 150, 150, 30);

        //Mul
        areaLabel = new JLabel("area");
        areaLabel.setBounds(50, 200, 100, 30);
        areaField = new JTextField("————————————————————");
        areaField.setBounds(150, 200, 150, 30);

        //Div
        periLabel = new JLabel("peri");
        periLabel.setBounds(50, 250, 100, 30);
        periField = new JTextField("————————————————————");
        periField.setBounds(150, 250, 150, 30);

        volLabel = new JLabel("vol");
        volLabel.setBounds(50, 300, 100, 30);
        volField = new JTextField("————————————————————");
        volField.setBounds(150, 300, 150, 30);

        //Button
        btnCalc = new JButton("Calculate");
        btnCalc.setBounds(150, 370, 100, 30);
        btnClear = new JButton("Clear");
        btnClear.setBounds(270, 370, 100, 30);

        //--------------------------------------------------------------------------//
        //btnClear
        btnClear.addActionListener(e -> {
            System.exit(0);
        });

        //btnDisplay
        btnCalc.addActionListener(e -> {
            String length = lengthField.getText();
            int n1 = Integer.parseInt(length);
            String breadth = breadthField.getText();
            int n2 = Integer.parseInt(breadth);
            String height = heightField.getText();
            int n3 = Integer.parseInt(height);
            int areaRes = area(n1, n2);
            int periRes = peri(n1, n2);
            double volRes = vol(n1, n2, n3);

            System.out.println("Ans");
            System.out.println("Addition: " + areaRes);
            System.out.println("Multiplication: " + periRes);
            System.out.println("Division: " + volRes);

            areaField.setText(String.valueOf(areaRes));
            periField.setText(String.valueOf(periRes));
            volField.setText(String.valueOf(volRes));

//            JOptionPane.showMessageDialog(btnCalc, "Ans\n Addition:" + addRes +
//                    "\nMultiplication: " + mulRes + "\nDivision: " + divRes);
        });

        //adding into frame
        add(lengthLabel);
        add(lengthField);
        add(breadthLabel);
        add(breadthField);
        add(heightLabel);
        add(heightField);
        add(areaLabel);
        add(areaField);
        add(periLabel);
        add(periField);
        add(volLabel);
        add(volField);
        add(btnCalc);
        add(btnClear);
        setSize(500, 500);
        setLayout(null);
        //setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FormArea();
    }
}
