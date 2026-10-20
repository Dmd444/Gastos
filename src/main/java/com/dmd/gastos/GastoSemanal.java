package com.dmd.gastos;

public class GastoSemanal {
    
    private double alimentacion;
    private double refrigerios;
    private double transporte;
    private double telefonia;
    private double otros;
    private double totalSemanal;
    private String gastoAlto;

    public GastoSemanal() {
    }

    public GastoSemanal(double alimentacion, double refrigerios, double transporte, double telefonia, double otros, double totalSemanal, String gastoAlto) {
        this.alimentacion = alimentacion;
        this.refrigerios = refrigerios;
        this.transporte = transporte;
        this.telefonia = telefonia;
        this.otros = otros;
        this.totalSemanal = totalSemanal;
        this.gastoAlto = gastoAlto;
    }

    public double getAlimentacion() {
        return alimentacion;
    }
    public void setAlimentacion(double alimentacion) {
        this.alimentacion = alimentacion;
    }
    public double getRefrigerios() {
        return refrigerios;
    }
    public void setRefrigerios(double refrigerios) {
        this.refrigerios = refrigerios;
    }
    public double getTransporte() {
        return transporte;
    }
    public void setTransporte(double transporte) {
        this.transporte = transporte;
    }
    public double getTelefonia() {
        return telefonia;
    }
    public void setTelefonia(double telefonia) {
        this.telefonia = telefonia;
    }
    public double getOtros() {
        return otros;
    }
    public void setOtros(double otros) {
        this.otros = otros;
    }
    public double getTotalSemanal() {
        return totalSemanal;
    }
    public void setTotalSemanal(double totalSemanal) {
        this.totalSemanal = totalSemanal;
    }
    public String getGastoAlto() {
        return gastoAlto;
    }
    public void setGastoAlto(String gastoAlto) {
        this.gastoAlto = gastoAlto;
    }

    @Override
    public String toString() {
        return "GastoSemanal{" + "alimentacion=" + alimentacion + ", refrigerios=" + refrigerios + ", transporte=" + transporte + ", telefonia=" + telefonia + ", otros=" + otros + ", totalSemanal=" + totalSemanal + ", gastoAlto=" + gastoAlto + '}';
    }
    
    
}
