public class BmiService {

    public int calculate(int bodyMass, double height) {
        double paymentHeight;
        double bmi;
        paymentHeight = height * 2;
        bmi = bodyMass / paymentHeight;

        return (int) bmi;
    }
}

