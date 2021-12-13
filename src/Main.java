public class Main {
    public static void main(String[] args) {
        PC pc = new PC("Hp",
                new CPU("intel", 2, 43, "HP"),
                new Motherboard("hp", "HP"),
                new Ram(2, "Samsung", "DDR3", 23),
                new HardDrive("Samsung", 7, Type.hdd));
    }
}
