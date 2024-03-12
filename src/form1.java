import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JButton senButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton Absoluto;
    private JButton porcentajeButton;
    private JButton logButton;
    private JButton suma;
    private JButton resta;
    private JButton multiplicacion;
    private JButton raiz;
    private JButton cuadrado;
    private JButton division;
    private JButton negativo;
    private JButton DELButton;
    private JButton ACButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a6Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a3Button;
    private JButton a0Button;
    private JButton point;
    private JButton igual;
    JPanel calculadora;
    private JPanel interfazCalculo;
    private JLabel guardarOperaciones;
    private JLabel calcular;
    private JCheckBox shiftCheckBox;

    public form1() {
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine se = sem.getEngineByName("JavaScript");
        senButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = 0;
                if (!guardarOperaciones.getText().equals("")) {
                    x = Double.parseDouble(guardarOperaciones.getText());
                } else {
                    x = Double.parseDouble(calcular.getText());
                }

                if (shiftCheckBox.isSelected()){
                    calcular.setText("sin⁻¹(" + calcular.getText() + ")");
                    guardarOperaciones.setText(Math.asin(Math.toRadians(x)) + "");
                }else{
                    calcular.setText("sin(" + calcular.getText() + ")");
                    guardarOperaciones.setText(Math.sin(Math.toRadians(x)) + "");
                }
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = 0;
                if (!guardarOperaciones.getText().equals("")) {
                    x = Double.parseDouble(guardarOperaciones.getText());
                } else {
                    x = Double.parseDouble(calcular.getText());
                }
                if (shiftCheckBox.isSelected()){
                    calcular.setText("cos⁻¹(" + calcular.getText() + ")");
                    guardarOperaciones.setText(Math.acos(Math.toRadians(x)) + "");
                }else{
                    calcular.setText("cos(" + calcular.getText() + ")");
                    guardarOperaciones.setText(Math.cos(Math.toRadians(x)) + "");
                }
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = 0;
                if (!guardarOperaciones.getText().equals("")) {
                    x = Double.parseDouble(guardarOperaciones.getText());
                } else {
                    x = Double.parseDouble(calcular.getText());
                }
                if (shiftCheckBox.isSelected()){
                    calcular.setText("tan⁻¹(" + calcular.getText() + ")");
                    guardarOperaciones.setText(Math.atan(Math.toRadians(x)) + "");
                }else{
                    calcular.setText("tan(" + calcular.getText() + ")");
                    guardarOperaciones.setText(Math.tan(Math.toRadians(x)) + "");
                }
            }
        });
        Absoluto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = 0;

                if (!guardarOperaciones.getText().equals("")) {
                    x = Double.parseDouble(guardarOperaciones.getText());
                } else {
                    x = Double.parseDouble(calcular.getText());
                }

                if (shiftCheckBox.isSelected()){
                    calcular.setText("(" + calcular.getText() + ")!");
                    int factorial = 1;
                    for (int i = 1; i <= x; i++) {
                        factorial = factorial * i;
                    }
                    guardarOperaciones.setText(factorial + "");
                }else{
                    calcular.setText("|" + calcular.getText() + "|");
                    guardarOperaciones.setText(Math.abs(x) + "");
                }
            }
        });
        porcentajeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = 0;
                if (!guardarOperaciones.getText().equals("")) {
                    x = Double.parseDouble(guardarOperaciones.getText());
                } else {
                    x = Double.parseDouble(calcular.getText());
                }
                if (shiftCheckBox.isSelected()){
                    calcular.setText("Mod(" + calcular.getText() + ")");
                    guardarOperaciones.setText(x/100 + "");
                }else{
                    calcular.setText("(" + calcular.getText() + ")%");
                    guardarOperaciones.setText(x/100 + "");
                }
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = 0;
                if (!guardarOperaciones.getText().equals("")) {
                    x = Double.parseDouble(guardarOperaciones.getText());
                } else {
                    x = Double.parseDouble(calcular.getText());
                }

                if (shiftCheckBox.isSelected()){
                    calcular.setText("ln(" + calcular.getText() + ")");
                    guardarOperaciones.setText(Math.log1p(x) + "");
                }else{
                    calcular.setText("log(" + calcular.getText() + ")");
                    guardarOperaciones.setText(Math.log10(x) + "");
                }
            }
        });
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!guardarOperaciones.getText().equals("")) {
                    calcular.setText(guardarOperaciones.getText() + "+");
                } else  {
                    calcular.setText(calcular.getText() + "+");
                }
            }
        });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!guardarOperaciones.getText().equals("")) {
                    calcular.setText(guardarOperaciones.getText() + "-");
                } else  {
                    calcular.setText(calcular.getText() + "-");
                }
            }
        });
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!guardarOperaciones.getText().equals("")) {
                    calcular.setText(guardarOperaciones.getText() + "*");
                } else  {
                    calcular.setText(calcular.getText() + "*");
                }
            }
        });
        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = 0;
                if (!guardarOperaciones.getText().equals("")) {
                    x = Double.parseDouble(guardarOperaciones.getText());
                } else {
                    x = Double.parseDouble(calcular.getText());
                }
                if (x>=0){
                    calcular.setText("√"+calcular.getText());
                }
                guardarOperaciones.setText(String.valueOf(Math.sqrt(x)));
            }
        });
        cuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = 0;
                if (!guardarOperaciones.getText().equals("")) {
                    x = Double.parseDouble(guardarOperaciones.getText());
                } else {
                    x = Double.parseDouble(calcular.getText());
                }
                calcular.setText("(" + calcular.getText()+")²");
                guardarOperaciones.setText(String.valueOf(Math.pow(x,2)));
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!guardarOperaciones.getText().equals("")) {
                    calcular.setText(guardarOperaciones.getText() + "/");
                } else  {
                    calcular.setText(calcular.getText() + "/");
                }
            }
        });
        negativo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = 0;
                if (!guardarOperaciones.getText().equals("")) {
                    x = Double.parseDouble(guardarOperaciones.getText());
                } else {
                    x = Double.parseDouble(calcular.getText());
                }
                calcular.setText("-("+calcular.getText()+")");
                guardarOperaciones.setText(String.valueOf(x*-1));
            }
        });
        DELButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText().substring(0, calcular.getText().length() - 1));
                igual.doClick();
            }
        });
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarOperaciones.setText("");
                calcular.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "7");
                igual.doClick();
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "8");
                igual.doClick();
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "9");
                igual.doClick();
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "0");
                igual.doClick();
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "1");
                igual.doClick();
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "2");
                igual.doClick();
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "6");
                igual.doClick();
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "4");
                igual.doClick();
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "5");
                igual.doClick();
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "3");
                igual.doClick();
            }
        });
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calcular.getText().contains(".")) {
                    return;
                } else {
                    calcular.setText(calcular.getText() + ".");
                }
            }
        });
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calcular.getText().contains("/0")) {
                    guardarOperaciones.setText("Syntax Error");
                    return;
                } else {
                    try {
                        String resultado = se.eval(calcular.getText()).toString();
                        guardarOperaciones.setText(resultado);
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }
            }
        });
        shiftCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (shiftCheckBox.isSelected()){
                    senButton.setText("sin⁻¹");
                    cosButton.setText("cos⁻¹");
                    tanButton.setText("tan⁻¹");
                    Absoluto.setText("x!");
                    porcentajeButton.setText("Mod");
                    logButton.setText("ln");
                }else{
                    senButton.setText("sin");
                    cosButton.setText("cos");
                    tanButton.setText("tan");
                    Absoluto.setText("|x|");
                    porcentajeButton.setText("%");
                    logButton.setText("log");
                }
            }
        });
    }
}
