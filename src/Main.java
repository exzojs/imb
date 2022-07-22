public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 90;
        double growth = 1.84;
        int index = service.calculate(weight, growth);
        System.out.println(index);
    }
}