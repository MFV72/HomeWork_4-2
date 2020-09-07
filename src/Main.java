public class Main {
    public static void main(String[] args) {
        BmiService calcBMI = new BmiService();
        float height = 1.85f;
        float weight = 90;
        float bmi = calcBMI.calculate(weight, height);
        System.out.println(bmi);
    }
}
