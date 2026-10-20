module com.dmd.gastos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dmd.gastos to javafx.fxml;
    exports com.dmd.gastos;
}
