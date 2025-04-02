import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sayilar[] = new int[5];
        sayilar[0] = 5;
        sayilar[1] = 3;
        sayilar[2] = 6;
        sayilar[3] = 1;
        sayilar[4] = 50;
        int sayilar2[] = Arrays.copyOf(sayilar,14);
        //sayilar2[] = sayilar[];
        for (int i = 0; i < sayilar2.length; i++) {
            System.out.println(sayilar2[i]);
        }
        System.out.println();
        for (int i: sayilar2){
            System.out.println(i);
        }
        System.out.println();
        Arrays.stream(sayilar2).forEach(System.out::println);

        System.out.println("sayilar2 nin dizi uzunluğu: " + sayilar2.length);
    }
}