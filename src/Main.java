public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight_kg = 58;
        double height_m = 1.64;
        double BodyMassIndex = service.calculate(weight_kg, height_m);
        System.out.println(BodyMassIndex);
    }
}
