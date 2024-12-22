module org.example.eltctodevice {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.eltctodevice to javafx.fxml;
    exports org.example.eltctodevice;
}