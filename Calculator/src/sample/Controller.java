package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static java.lang.Double.parseDouble;


public class Controller {
    @FXML
    private TextField textArea;
    @FXML
    private Button clear;
    @FXML
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPoint, buttonDivide, buttonCompare,buttonMulti;

    private double a;

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    private double b;

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    private String operator = "";

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }


    @FXML
    public void actionButton0() {
        String value = textArea.getText();
        String set = "0";
        textArea.setText(value + set);
    }

    @FXML
    public void actionButton1() {
        String value = textArea.getText();
        String set = "1";
        textArea.setText(value + set);
    }

    @FXML
    public void actionButton2() {
        String value = textArea.getText();
        String set = "2";
        textArea.setText(value + set);
    }

    @FXML
    public void actionButton3() {
        String value = textArea.getText();
        String set = "3";
        textArea.setText(value + set);
    }

    @FXML
    public void actionButton4() {
        String value = textArea.getText();
        String set = "4";
        textArea.setText(value + set);
    }

    @FXML
    public void actionButton5() {
        String value = textArea.getText();
        String set = "5";
        textArea.setText(value + set);
    }

    @FXML
    public void actionButton6() {
        String value = textArea.getText();
        String set = "6";
        textArea.setText(value + set);
    }

    @FXML
    public void actionButton7() {
        String value = textArea.getText();
        String set = "7";
        textArea.setText(value + set);
    }

    @FXML
    public void actionButton8() {
        String value = textArea.getText();
        String set = "8";
        textArea.setText(value + set);
    }

    @FXML
    public void actionButton9() {
        String value = textArea.getText();
        String set = "9";
        textArea.setText(value + set);
    }

    @FXML
    public void actionClear() {
        String value;
        value = "";
        textArea.setText(value);
    }

    @FXML
    public void actionPoint() {
        String value = textArea.getText();
        textArea.setText(value + ".");
    }

    @FXML
    public void buttonDivide() {
        if (!textArea.toString().isEmpty()) {
            String value = textArea.getText();
            Double x;
            x = parseDouble(value);
            setA(x);
            textArea.setText("");
            setOperator("/");
        }
    }

    @FXML
    public void buttonCompare() {
        if (!textArea.toString().isEmpty()) {
            String value = textArea.getText();
            Double x;
            x = parseDouble(value);
            setB(x);
            textArea.setText("");
            OperatorChoice operatorChoice = new OperatorChoice();
            textArea.setText(String.valueOf(operatorChoice.Calculate(getA(),getB(),getOperator())));

        }
    }
    @FXML
    public void buttonMulti(){
        if (!textArea.toString().isEmpty()) {
            String value = textArea.getText();
            Double x;
            x = parseDouble(value);
            setA(x);
            textArea.setText("");
            setOperator("*");
        }
    }
    @FXML
    public void buttonSub(){
        if (!textArea.toString().isEmpty()) {
            String value = textArea.getText();
            Double x;
            x = parseDouble(value);
            setA(x);
            textArea.setText("");
            setOperator("-");
        }
    }
    @FXML
    public void buttonAdd(){
        if (!textArea.toString().isEmpty()) {
            String value = textArea.getText();
            Double x;
            x = parseDouble(value);
            setA(x);
            textArea.setText("");
            setOperator("+");
        }
    }
}
