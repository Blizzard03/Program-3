/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package program3.Controller;

import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import program3.Model.Model;

/**
 *
 * @author Muhamad Ariq Rasyid
 */
public class Program3Controller implements Initializable {

    Model md = new Model();
    Locale Indonesia = new Locale("in", "ID");
    NumberFormat formater = NumberFormat.getCurrencyInstance(Indonesia);

    @FXML
    private Button Calculate_Button;
    @FXML
    private Button Reset_Button;
    @FXML
    private Button Quick_Button;
    @FXML
    private TextField UMR_Text;
    @FXML
    private TextField Produce_Text;
    @FXML
    private TextField Incentive_Text;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
    }

    @FXML
    private void Calculate_Button_Click(ActionEvent event) {

        md.setSalary(Double.parseDouble(UMR_Text.getText()));
        md.setProduce(Integer.parseInt(Produce_Text.getText()));
        md.setIncentive((md.getSalary() / 2) + (md.getProduce() * 500));
        Incentive_Text.setText(formater.format(md.getIncentive()));

    }

    @FXML
    private void Reset_Button_Click(ActionEvent event) {
        UMR_Text.setText("");
        Produce_Text.setText("");
        Incentive_Text.setText("");
    }

    @FXML
    private void Quit_Button_Click(ActionEvent event) {
        System.exit(0);
    }

}
