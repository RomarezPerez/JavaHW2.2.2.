public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 95.5; //введите свой вес в килограммах
        double height = 1.85; //введите свой рост в метрах
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}