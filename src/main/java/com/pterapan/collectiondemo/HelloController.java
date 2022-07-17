package com.pterapan.collectiondemo;

import com.pterapan.collectiondemo.Model.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public TableView table1;
    public TableColumn column1;
    public TableColumn column2;
    public TableColumn column3;
    public TableColumn column4;

    public TextField txtNrp;
    public TextField txtNama;
    public TextField txtIpa;
    public TextField txtIps;
    
    private ObservableList<Student> oList;

    @FXML
    public void initialize() {
        oList = FXCollections.observableArrayList();
        table1.setItems(oList);
        column1.setText("NRP");
        column1.setCellValueFactory(new PropertyValueFactory<>("nrp"));
        column2.setText("Nama");
        column2.setCellValueFactory(new PropertyValueFactory<>("nama"));
        column3.setText("IPA");
        column3.setCellValueFactory(new PropertyValueFactory<>("ipa"));
        column4.setText("IPS");
        column4.setCellValueFactory(new PropertyValueFactory<>("ips"));
    }

    public void onHapus(ActionEvent actionEvent) {
        oList.remove(table1.getSelectionModel().getSelectedItem());
        txtNrp.clear();
        txtNama.clear();
        txtIpa.clear();
        txtIps.clear();
    }
    
    public void onTambah(ActionEvent actionEvent) {
        String nrp = txtNrp.getText();
        String nama = txtNama.getText();
        String ipa = txtIpa.getText();
        String ips = txtIps.getText();
        oList.add(new Student(nrp, nama, ipa, ips));
        txtNrp.clear();
        txtNama.clear();
        txtIpa.clear();
        txtIps.clear();
    }

    public void onUpdate(ActionEvent actionEvent) {
        table1.getSelectionModel().getSelectedItem().setNama(txtNama.getText());
        table1.getSelectionModel().getSelectedItem().setNrp(txtNrp.getText());
        table1.getSelectionModel().getSelectedItem().setIpa(txtIpa.getText());
        table1.getSelectionModel().getSelectedItem().setIps(txtIps.getText());
        txtNrp.clear();
        txtNama.clear();
        txtIpa.clear();
        txtIps.clear();
    }

    public void getSelectedItem(MouseEvent mouseEvent) {
        txtNrp.setText(table1.getSelectionModel().getSelectedItem().getNrp());
        txtNama.setText(table1.getSelectionModel().getSelectedItem().getNama());
        txtIpa.setText(table1.getSelectionModel().getSelectedItem().getIpa());
        txtIps.setText(table1.getSelectionModel().getSelectedItem().getIps());
    }
}