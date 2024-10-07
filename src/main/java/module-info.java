module jun.blackjackfx {
    requires transitive javafx.controls;
    requires javafx.fxml;

    requires core.fx;

    opens dev.jun to javafx.fxml;

    exports dev.jun;
}
