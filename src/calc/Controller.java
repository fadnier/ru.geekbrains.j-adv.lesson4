package calc;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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

    public void keyPress(ActionEvent actionEvent) {
        Button btn = (Button) actionEvent.getSource();
        textFieldSumm.appendText(btn.getText());
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
