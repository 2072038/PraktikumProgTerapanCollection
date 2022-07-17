module com.pterapan.collectiondemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pterapan.collectiondemo to javafx.fxml;
    exports com.pterapan.collectiondemo;
    exports com.pterapan.collectiondemo.Model;
    opens com.pterapan.collectiondemo.Model to javafx.fxml;
}