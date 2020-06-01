package chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    private Button btnSend;
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;


    public void sendText() {
        textArea.appendText(textField.getText());
        textField.clear();
    }

    public void sendTextField(KeyEvent keyEvent) {
        if(keyEvent.getCode().getName()=="Enter") {
            sendText();
        }
    }
}