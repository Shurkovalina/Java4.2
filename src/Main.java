public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 58;
        double heightM = 1.64;
        double bodyMassIndex = service.calculate(weightKg, heightM);
        System.out.println(bodyMassIndex);
    }
}
