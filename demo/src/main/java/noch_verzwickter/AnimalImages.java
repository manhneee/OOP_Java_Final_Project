package noch_verzwickter;

import java.util.HashMap;

public class AnimalImages {
    private HashMap<Integer, String> imageMap;

    public AnimalImages() {
        imageMap = new HashMap<>();
        initializeImageMap();
    }

    public HashMap<Integer, String> getImageMap() {
        return imageMap;
    }

    private void initializeImageMap() {
        imageMap.put(-4, "Images\\cat_left.png");
        imageMap.put(-3, "Images\\elephant_left.png");
        imageMap.put(-2, "Images\\mouse_left.png");
        imageMap.put(-1, "Images\\pig_left.png");
        imageMap.put(1, "Images\\pig_right.png");
        imageMap.put(2, "Images\\mouse_right.png");
        imageMap.put(3, "Images\\elephant_right.png");
        imageMap.put(4, "Images\\cat_right.png");
    }
}
