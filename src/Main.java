public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double w = 95.5; //введите свой вес в килограммах
        double h = 1.85; //введите свой рост в метрах
        double bmi = service.calculate(w, h);
        System.out.println(bmi);
    }
}