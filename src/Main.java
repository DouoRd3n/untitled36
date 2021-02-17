import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        MapTest<String, String> mapTest = new MapTest<>();
        mapTest.put("1", "1");
        mapTest.put("22", "2");
        mapTest.put("333", "3");
        mapTest.put("4444", "4");
        System.out.println(mapTest.get("4444").toString());
        mapTest.remove("333");
        mapTest.put("55555", "5");


    }
}
