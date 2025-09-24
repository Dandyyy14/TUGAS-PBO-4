public class Main {
    public static void main(String[] args) {
        Balok blk = new Balok(10, 5, 8);
        Kubus kbs = new Kubus(10);

        System.out.println("BALOK");
        System.out.println("Volume balok adalah = " + blk.Volume());
        System.out.println("Luas balok adalah = " + blk.Luas());

        System.out.println("KUBUS");
        System.out.println("Volume kubus adalah = " + kbs.Volume());
        System.out.println("Luas kubus adalah = " + kbs.Luas());
    }
}
