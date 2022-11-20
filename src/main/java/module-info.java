module com.gminaclient.gmina_client {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.gminaclient.gmina_client to javafx.fxml;
    exports com.gminaclient.gmina_client;
}