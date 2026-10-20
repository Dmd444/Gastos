package com.dmd.gastos;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtRefrigerios;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;
    @FXML private TextField txtTotal;
    @FXML private TextField txtGastoAlto;

    private GastoSemanal gastoObj;

    @FXML
    public void calcularEstadisticas() {
        double alimentacion = Double.parseDouble(txtAlimentacion.getText());
        double refrigerios = Double.parseDouble(txtRefrigerios.getText());
        double transporte = Double.parseDouble(txtTransporte.getText());
        double telefonia = Double.parseDouble(txtTelefonia.getText());
        double otros = Double.parseDouble(txtOtros.getText());

        double total = alimentacion + refrigerios + transporte + telefonia + otros;

        String mayor = "Alimentación";
        double maxValor = alimentacion;

        if (refrigerios > maxValor) {
            maxValor = refrigerios;
            mayor = "Refrigerios";
        }
        if (transporte > maxValor) {
            maxValor = transporte;
            mayor = "Transporte";
        }
        if (telefonia > maxValor) {
            maxValor = telefonia;
            mayor = "Telefonía";
        }
        if (otros > maxValor) {
            maxValor = otros;
            mayor = "Otros";
        }

        gastoObj = new GastoSemanal(alimentacion, refrigerios, transporte, telefonia, otros, total, mayor);

        txtTotal.setText(String.valueOf(gastoObj.getTotalSemanal()));
        txtGastoAlto.setText(gastoObj.getGastoAlto());
    }

    @FXML
    public void limpiar() {
        txtAlimentacion.setText("");
        txtRefrigerios.setText("");
        txtTransporte.setText("");
        txtTelefonia.setText("");
        txtOtros.setText("");
        txtTotal.setText("");
        txtGastoAlto.setText("");
        gastoObj = null;
    }
}
