public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(55, 1.6);
        System.out.println(bmi);

    }
}