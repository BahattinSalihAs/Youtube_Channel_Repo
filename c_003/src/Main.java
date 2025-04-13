public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("main metodu çalışıyor");
        main.ikisayiyitopla(5,6);

        Main2.ikisayiyitopla(5,6);

    }
    public void ikisayiyitopla(
            final int a,
            final int b
    ){
        System.out.println("Sonuç: " + (a+b));
    }
}