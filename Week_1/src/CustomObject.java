
import java.util.*;

public class CustomObject {

    private String customProperty;

    public CustomObject(String property) {
        this.customProperty = property;
    }

    public String getCustomProperty() {
        return this.customProperty;
    }

    public static void main(String[] args) {

        ArrayList<CustomObject> list = new ArrayList<>();
        list.add(new CustomObject("h"));
        list.add(new CustomObject("e"));
        list.add(new CustomObject("l"));
        list.add(new CustomObject("L"));
        list.add(new CustomObject("o"));

        list.sort((o1, o2) -> o1.getCustomProperty().compareTo(o2.getCustomProperty()));

        for (CustomObject obj : list) {
            System.out.println(obj.getCustomProperty());
        }
    }
}
