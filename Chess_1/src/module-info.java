module chess {
    requires javafx.fxml;
    requires javafx.controls;
    requires junit;
    opens main.java.com.company.chess to javafx.fxml;
    exports main.java.com.company.chess;
    exports main.java.com.company.chess.Exception;
    opens main.java.com.company.chess.Exception to javafx.fxml;
}