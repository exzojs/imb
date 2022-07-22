public class BmiService {
    public int calculate(int weight, double growth) {
        int result = (int) (weight /(growth*growth));
        return result;
    }
}
