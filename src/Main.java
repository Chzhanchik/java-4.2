public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 20.5;
        double height = 1.5;
        double index = service.calculate(weight, height);
        System.out.println(index);
    }
}