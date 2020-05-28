package calc;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller {
    private float summ = 0;
    private String action = "+";

    @FXML
    public GridPane gridPane;
    @FXML
    public TextField textFieldSumm;
    @FXML
    public TextField textFieldHistory;


    public void keyPress1() {
        textFieldSumm.appendText("1");
    }

    public void keyPress2() {
        textFieldSumm.appendText("2");
    }

    public void keyPress3() {
        textFieldSumm.appendText("3");
    }

    public void keyPress4() {
        textFieldSumm.appendText("4");
    }

    public void keyPress5() {
        textFieldSumm.appendText("5");
    }

    public void keyPress6() {
        textFieldSumm.appendText("6");
    }

    public void keyPress7() {
        textFieldSumm.appendText("7");
    }

    public void keyPress8() {
        textFieldSumm.appendText("8");
    }

    public void keyPress9() {
        textFieldSumm.appendText("9");
    }

    public void keyPress0() {
        textFieldSumm.appendText("0");
    }

    public void keyPressTk() {
        textFieldSumm.appendText(".");
    }

    public void keyPressRavn() {
        textFieldSumm.setText(actionMethod("="));
    }

    public void keyPressRst() {
        summ = 0;
        action = "+";
        textFieldSumm.clear();
        textFieldHistory.clear();
    }

    public void keyPressDel() {
        textFieldSumm.setText(actionMethod("/"));
    }

    public void keyPressYmn() {
        textFieldSumm.setText(actionMethod("*"));
    }

    public void keyPressMinus() {
        textFieldSumm.setText(actionMethod("-"));
    }

    public void keyPressPlus() {
        textFieldSumm.setText(actionMethod("+"));
    }

    private String actionMethod(String meth) {
        if(action.equals("+")) {
            summ = summ + Float.parseFloat(textFieldSumm.getText());
            textFieldHistory.appendText(textFieldSumm.getText()+meth);
        } else if(action.equals("-")) {
            summ = summ - Float.parseFloat(textFieldSumm.getText());
            textFieldHistory.appendText(textFieldSumm.getText()+meth);
        } else if(action.equals("*")) {
            summ = summ * Float.parseFloat(textFieldSumm.getText());
            textFieldHistory.appendText(textFieldSumm.getText()+meth);
        } else if(action.equals("/")) {
            summ = summ / Float.parseFloat(textFieldSumm.getText());
            textFieldHistory.appendText(textFieldSumm.getText()+meth);
        } else if(action.equals("=")) {
            textFieldHistory.appendText(meth);
        }
        action = meth;
        if(meth == "=") {
            textFieldHistory.appendText(""+summ);
            return String.valueOf(summ);
        } else {
            return "";
        }

    }


}
