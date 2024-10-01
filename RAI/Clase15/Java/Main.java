public class Main {
    public static void main(String[] args) {
        Vehiculo autito = new Vehiculo("1234567", "Nissan", "Kicks");
        Vehiculo autito2 = new Vehiculo("Volvo", "CX30");
        Vehiculo autito3 = new Vehiculo();

        System.out.println(autito);
        System.out.println(autito2.toString(1));
        System.out.println(autito3.toString(0));
    }
}
