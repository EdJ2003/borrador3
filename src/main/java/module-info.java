module com.borrador.borrador3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.borrador.borrador3 to javafx.fxml;
    exports com.borrador.borrador3;
}