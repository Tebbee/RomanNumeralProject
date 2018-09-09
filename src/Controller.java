
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller {
    @FXML private Button ExitButton;
    @FXML public TextField InputTextField;
    @FXML public TextField OutputTextField;

    public void Convert() {
        String input = InputTextField.getText();
        if (input.equals("") || input.equals(" ")){
            OutputTextField.setText("Please insert a value");
        }
        //Tests for Roman Numerals
        input = input.toUpperCase();
        if (input.startsWith("C" ) || input.startsWith("D") || input.startsWith("M")|| input.startsWith("X")|| input.startsWith("V")|| input.startsWith("I")||input.startsWith("L")){
            OutputTextField.setText(Integer.toString(numeralToInteger.numeralToInteger(input)));
            return;}

        if (input.startsWith("A")||input.startsWith("B")||input.startsWith("E")||input.startsWith("F")
                ||input.startsWith("G")||input.startsWith("H")||input.startsWith("J")||input.startsWith("K")
                ||input.startsWith("N")||input.startsWith("O") ||input.startsWith("P")||input.startsWith("Q")
                ||input.startsWith("R")||input.startsWith("S") ||input.startsWith("T") ||input.startsWith("U")
                ||input.startsWith("W")||input.startsWith("Y")||input.startsWith("Z")){
            OutputTextField.setText("Please insert a REAL number/Roman Numeral");
            return;
        }
        OutputTextField.setText(IntegerToNumeral.Convert(Integer.parseInt(input)));


    }

    public void Exit() {
        Stage stage = (Stage) ExitButton.getScene().getWindow();
        stage.close();
    }
}