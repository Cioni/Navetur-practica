public class Main {

    public static void main(String[] args) {
        Capitan c1 = new Capitan("Nacho", "Garcia", "PAR1D");
        Capitan c2 = new Capitan("Pepe", "Ernestin", "PAR2G");
        Yate y1= new Yate(c1, 10.5, 10.0,2021,10.0, (byte) 6);
        Yate y2= new Yate(c2, 10.8,5.0, 2019,9.8, (byte) 3);

    int test;

    test = y1.compareTo(y2);
    System.out.println(test);


    }
}
