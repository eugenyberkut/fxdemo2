package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;


public class Controller {

    @FXML
    Canvas canvas;

    public void drawBorder(ActionEvent actionEvent) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double width = canvas.getWidth();
        double height = canvas.getHeight();
        int gap = 10;
        gc.strokeRect(gap,gap,width-2*gap,height-2*gap);
    }
}
