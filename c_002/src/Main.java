import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // MAPS
        // key and value
        System.out.println("HASHMAP");
        HashMap<String,String> h = new HashMap<>();
        //h.put("Brazil","Brasilia");
        h.put("Brazil", "Brasilia");
        h.put("Türkiye","Ankara");
        h.put("France","Paris");
        h.put("Spain","Madrid");
        System.out.println(h);

        System.out.println("LINKED HASHMAP");
        LinkedHashMap<Integer,String> h2 = new LinkedHashMap<>();
        h2.put(1,"Ahmet");
        h2.put(2,"Fatih");
        h2.put(3,"Ayşe");
        h2.put(4,"Mehmet");
        h2.put(2,"Sadık");
        h2.remove(1);
        System.out.println(h2);
        System.out.println(h2.reversed());

        System.out.println("LINKED HASHMAP 2");
        LinkedHashMap<String,Integer> h22 = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> m: h2.entrySet()){
            h22.put(m.getValue(),m.getKey());
        }
        System.out.println(h22);
        h22.clear();
        System.out.println(h22);

        for (int key: h2.keySet()){
            for (String value: h2.values()){
                h22.put(value,key);
            }
        }
        System.out.println(h22);
        System.out.println("TREEMAP");
        TreeMap<Integer,String> h3 = new TreeMap<>();
        h3.put(1,"Salih");
        h3.put(3,"Enes");
        h3.put(2,"Tuba");
        h3.put(4,"Semra");
        System.out.println(h3);
        System.out.println(h3.reversed());

        for (int i: h3.keySet()){
            System.out.println(i);
        }
        for (String s: h3.values()){
            System.out.println(s);
        }

        h3.put(5,"Salih");
        TreeMap<String,Integer> h33 = new TreeMap<>();

        for (Map.Entry<Integer, String> m: h3.entrySet()){
            h33.put(m.getValue(),m.getKey());
        }
        System.out.println(h3);
        System.out.println("*********");
        System.out.println(h33);
    }
}