package formsAreaAndCalculator;
import javax.swing.*;

public class FormCalc extends JFrame {
    JLabel num1Label, num2Label, addLabel, mulLabel, divLabel;
    JTextField num1Field, num2Field, addField, mulField, divField;
    JButton btnCalc, btnClear;

    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int mul(int n1, int n2){
        return n1 * n2;
    }

    public double div(double n1, double n2){
        return n1 / n2;
    }
    public FormCalc(){
        //Num1
        num1Label = new JLabel("Num1");
        num1Label.setBounds(50, 50, 100, 30);
        num1Field = new JTextField();
        num1Field.setBounds(150, 50, 150, 30);

        //Num2
        num2Label = new JLabel("Num2");
        num2Label.setBounds(50, 100, 100, 30);
        num2Field = new JTextField();
        num2Field.setBounds(150, 100, 150, 30);

        //Add
        addLabel = new JLabel("Addition");
        addLabel.setBounds(50, 150, 100, 30);
        addField = new JTextField("————————————————————");
        addField.setBounds(150, 150, 150, 30);

        //Mul
        mulLabel = new JLabel("Multiplication");
        mulLabel.setBounds(50, 200, 100, 30);
        mulField = new JTextField("————————————————————");
        mulField.setBounds(150, 200, 150, 30);

        //Div
        divLabel = new JLabel("Division");
        divLabel.setBounds(50, 250, 100, 30);
        divField = new JTextField("————————————————————");
        divField.setBounds(150, 250, 150, 30);

        //Button
        btnCalc = new JButton("Calculate");
        btnCalc.setBounds(150, 320, 100, 30);
        btnClear = new JButton("Clear");
        btnClear.setBounds(270, 320, 100, 30);

        //--------------------------------------------------------------------------//
        //btnClear
        btnClear.addActionListener(e -> {
            System.exit(0);
        });

        //btnDisplay
        btnCalc.addActionListener(e -> {
            String num1 = num1Field.getText();
            int n1 = Integer.parseInt(num1);
            String num2 = num2Field.getText();
            int n2 = Integer.parseInt(num2);
            int addRes = add(n1, n2);
            int mulRes = mul(n1, n2);
            double divRes = div(n1, n2);

            System.out.println("Ans");
            System.out.println("Addition: " + addRes);
            System.out.println("Multiplication: " + mulRes);
            System.out.println("Division: " + divRes);

            addField.setText(String.valueOf(addRes));
            mulField.setText(String.valueOf(mulRes));
            divField.setText(String.valueOf(divRes));

//            JOptionPane.showMessageDialog(btnCalc, "Ans\n Addition:" + addRes +
//                    "\nMultiplication: " + mulRes + "\nDivision: " + divRes);
        });

        //adding into frame
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(addLabel);
        add(addField);
        add(mulLabel);
        add(mulField);
        add(divLabel);
        add(divField);
        add(btnCalc);
        add(btnClear);
        setSize(500, 500);
        setLayout(null);
        //setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FormCalc();
    }
}
