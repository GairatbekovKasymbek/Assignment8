package org.example.eltctodevice;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class MainController {
    @FXML
    private ListView<Device> listview;
    private ObservableList<Device> devices;
    @FXML
    private Label label3;
    @FXML
    private RadioButton radioSmartphone;
    @FXML
    private RadioButton radioLaptop;
    @FXML
    private RadioButton radioTablet;

    @FXML
    private TextField nameoutput;
    @FXML
    private TextField priceoutput;
    @FXML
    private TextField weightoutput;
    @FXML
    private TextField lab1output;
    @FXML
    private TextField lab2output;

    @FXML
    private Label lab1;
    @FXML
    private Label lab2;

    @FXML
    public void initialize() {
        devices = FXCollections.observableArrayList();
        listview.setItems(devices);
        handleDeviceSelection();
    }

    @FXML
    public void add(ActionEvent event) {
        if (nameoutput.getText().isEmpty() || priceoutput.getText().isEmpty() || weightoutput.getText().isEmpty()) {
            label3.setText("Please fill in all required fields.");
            return;
        }
        Device device = null;
        try {
            String name = nameoutput.getText();
            double price = Double.parseDouble(priceoutput.getText());
            double weight = Double.parseDouble(weightoutput.getText());
            if (radioSmartphone.isSelected()) {
                double size = Double.parseDouble(lab1output.getText());
                double hz = Double.parseDouble(lab2output.getText());
                device = new Smartphone(name, price, weight, size, hz);
            } else if (radioLaptop.isSelected()) {
                int ramSize = Integer.parseInt(lab1output.getText());
                String processorType = lab2output.getText();
                device = new Laptop(name, price, weight, ramSize, processorType);
            } else if (radioTablet.isSelected()) {
                double batteryLife = Double.parseDouble(lab1output.getText());
                boolean hasStylus = Boolean.parseBoolean(lab2output.getText());
                device = new Tablet(name, price, weight, batteryLife, hasStylus);
            }
            if (device != null) {
                devices.add(device);
                label3.setText(name + " added successfully.");
            }
        } catch (NumberFormatException e) {
            label3.setText("Please enter valid numerical values.");
        }
        listview.setItems(devices);
    }

    @FXML
    public void delete(ActionEvent event) {
        int id = listview.getSelectionModel().getSelectedIndex();
        if (id >= 0) {
            label3.setText(devices.get(id).getName() + " is removed.");
            devices.remove(id);
        } else {
            label3.setText("No item selected.");
        }
    }

    @FXML
    public void handleDeviceSelection() {
        boolean isLaptop = radioLaptop.isSelected();
        boolean isTablet = radioTablet.isSelected();
        boolean isSmartphone = radioSmartphone.isSelected();

        if (isLaptop) {
            lab1.setVisible(true);
            lab1output.setVisible(true);
            lab2.setVisible(true);
            lab2output.setVisible(true);
            lab1.setText("RAM Size (GB):");
            lab2.setText("Processor Type:");
        } else if (isTablet) {
            lab1.setVisible(true);
            lab1output.setVisible(true);
            lab2.setVisible(true);
            lab2output.setVisible(true);
            lab1.setText("Battery Life (hrs):");
            lab2.setText("Has Stylus (true/false):");
        } else if (isSmartphone) {
            lab1.setVisible(true);
            lab1output.setVisible(true);
            lab2.setVisible(true);
            lab2output.setVisible(true);
            lab1.setText("size:");
            lab2.setText("hz:");
        }
    }

    @FXML
    public void onListClicked(MouseEvent mouseEvent) {
        int id = listview.getSelectionModel().getSelectedIndex();
        if (id >= 0) {
            label3.setText(devices.get(id).toString());
        }
    }
}
