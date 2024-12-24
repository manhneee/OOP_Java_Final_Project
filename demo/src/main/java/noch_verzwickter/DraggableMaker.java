package noch_verzwickter;

import javafx.scene.Node;

public class DraggableMaker {
    private double mouseAnchorX;
    private double mouseAnchorY;

    public void makeDraggable(@SuppressWarnings("exports") Node node) {
        node.setOnMousePressed(mouseEvent -> {
            mouseAnchorX = mouseEvent.getX();
            mouseAnchorY = mouseEvent.getY();
        });

        node.setOnMouseDragged(mouseEvent -> {
            node.setLayoutX(mouseEvent.getSceneX() - mouseAnchorX);
            node.setLayoutY(mouseEvent.getSceneY() - mouseAnchorY);
        });
    }
}
