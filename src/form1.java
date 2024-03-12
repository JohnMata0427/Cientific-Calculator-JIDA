import org.python.util.PythonInterpreter;
import javax.swing.*;

public class form1 {
    private JButton senButton, cosButton, tanButton, absoluteButton, percentageButton, logButton, suma, rest, multiplication, squareRoot, square, division, negative, DELButton, ACButton, a7Button, a8Button, a9Button, a1Button, a2Button, a6Button, a4Button, a5Button, a3Button, a0Button, point, igual;
    JPanel calculator;
    private JLabel saveOperations, calculate;
    private JCheckBox shiftCheckBox;

    private void numberButton (JButton button, String number){
        button.addActionListener(_ -> {
            calculate.setText(calculate.getText() + number);
            igual.doClick();
        });
    }

    private void basicOperationButton (JButton button, String operation){
        button.addActionListener(_ -> calculate.setText(calculate.getText() + operation));
    }

    public form1() {
        PythonInterpreter interpreter = new PythonInterpreter();

        numberButton(a0Button, "0");
        numberButton(a1Button, "1");
        numberButton(a2Button, "2");
        numberButton(a3Button, "3");
        numberButton(a4Button, "4");
        numberButton(a5Button, "5");
        numberButton(a6Button, "6");
        numberButton(a7Button, "7");
        numberButton(a8Button, "8");
        numberButton(a9Button, "9");

        basicOperationButton(suma, "+");
        basicOperationButton(rest, "-");
        basicOperationButton(multiplication, "*");
        basicOperationButton(division, "/");

        senButton.addActionListener(_ -> {
            double x = !saveOperations.getText().isEmpty() ? Double.parseDouble(saveOperations.getText()) : Double.parseDouble(calculate.getText());

            if (shiftCheckBox.isSelected()) {
                calculate.setText("sin⁻¹(" + calculate.getText() + ")");
                saveOperations.setText(Math.asin(Math.toRadians(x)) + "");
            } else {
                calculate.setText("sin(" + calculate.getText() + ")");
                saveOperations.setText(Math.sin(Math.toRadians(x)) + "");
            }
        });
        
        cosButton.addActionListener(_ -> {
            double x = !saveOperations.getText().isEmpty() ? Double.parseDouble(saveOperations.getText()) : Double.parseDouble(calculate.getText());

            if (shiftCheckBox.isSelected()) {
                calculate.setText("cos⁻¹(" + calculate.getText() + ")");
                saveOperations.setText(Math.acos(Math.toRadians(x)) + "");
            } else {
                calculate.setText("cos(" + calculate.getText() + ")");
                saveOperations.setText(Math.cos(Math.toRadians(x)) + "");
            }
        });

        tanButton.addActionListener(_ -> {
            double x = !saveOperations.getText().isEmpty() ? Double.parseDouble(saveOperations.getText()) : Double.parseDouble(calculate.getText());

            if (shiftCheckBox.isSelected()) {
                calculate.setText("tan⁻¹(" + calculate.getText() + ")");
                saveOperations.setText(Math.atan(Math.toRadians(x)) + "");
            } else {
                calculate.setText("tan(" + calculate.getText() + ")");
                saveOperations.setText(Math.tan(Math.toRadians(x)) + "");
            }
        });

        absoluteButton.addActionListener(_ -> {
            double x = !saveOperations.getText().isEmpty() ? Double.parseDouble(saveOperations.getText()) : Double.parseDouble(calculate.getText());

            if (shiftCheckBox.isSelected()) {
                calculate.setText("(" + calculate.getText() + ")!");
                int factorial = 1;
                for (int i = 1; i <= x; i++) {
                    factorial = factorial * i;
                }
                saveOperations.setText(factorial + "");
            } else {
                calculate.setText("|" + calculate.getText() + "|");
                saveOperations.setText(Math.abs(x) + "");
            }
        });

        percentageButton.addActionListener(_ -> {
            double x = !saveOperations.getText().isEmpty() ? Double.parseDouble(saveOperations.getText()) : Double.parseDouble(calculate.getText());

            if (shiftCheckBox.isSelected()) {
                calculate.setText("Mod(" + calculate.getText() + ")");
                saveOperations.setText(x/100 + "");
            } else {
                calculate.setText("(" + calculate.getText() + ")%");
                saveOperations.setText(x/100 + "");
            }
        });

        logButton.addActionListener(_ -> {
            double x = !saveOperations.getText().isEmpty() ? Double.parseDouble(saveOperations.getText()) : Double.parseDouble(calculate.getText());

            if (shiftCheckBox.isSelected()) {
                calculate.setText("ln(" + calculate.getText() + ")");
                saveOperations.setText(Math.log1p(x) + "");
            } else {
                calculate.setText("log(" + calculate.getText() + ")");
                saveOperations.setText(Math.log10(x) + "");
            }
        });

        squareRoot.addActionListener(_ -> {
            double x = !saveOperations.getText().isEmpty() ? Double.parseDouble(saveOperations.getText()) : Double.parseDouble(calculate.getText());

            if (x>=0){
                calculate.setText("√("+ calculate.getText() + ")");
            }
            saveOperations.setText(String.valueOf(Math.sqrt(x)));
        });

        square.addActionListener(_ -> {
            double x = !saveOperations.getText().isEmpty() ? Double.parseDouble(saveOperations.getText()) : Double.parseDouble(calculate.getText());

            calculate.setText("(" + calculate.getText()+")²");
            saveOperations.setText(String.valueOf(Math.pow(x,2)));
        });

        negative.addActionListener(_ -> {
            double x = !saveOperations.getText().isEmpty() ? Double.parseDouble(saveOperations.getText()) : Double.parseDouble(calculate.getText());

            calculate.setText("-("+ calculate.getText()+")");
            saveOperations.setText(String.valueOf(x * -1));
        });

        DELButton.addActionListener(_ -> {
            calculate.setText(calculate.getText().substring(0, calculate.getText().length() - 1));
            igual.doClick();
        });

        ACButton.addActionListener(_ -> {
            saveOperations.setText("");
            calculate.setText("");
        });

        point.addActionListener(_ -> {
            if (!calculate.getText().contains(".")) calculate.setText(calculate.getText() + ".");
        });

        igual.addActionListener(_ -> {
            try {
                interpreter.exec("result = " + calculate.getText());
                saveOperations.setText(interpreter.get("result").toString());
            } catch (Exception exception) {
                saveOperations.setText("Error");
            }
        });

        shiftCheckBox.addActionListener(_ -> {
            if (shiftCheckBox.isSelected()){
                senButton.setText("sin⁻¹");
                cosButton.setText("cos⁻¹");
                tanButton.setText("tan⁻¹");
                absoluteButton.setText("x!");
                percentageButton.setText("Mod");
                logButton.setText("ln");
            } else {
                senButton.setText("sin");
                cosButton.setText("cos");
                tanButton.setText("tan");
                absoluteButton.setText("|x|");
                percentageButton.setText("%");
                logButton.setText("log");
            }
        });
    }
}