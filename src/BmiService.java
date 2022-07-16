public class BmiService {
    public int calculate(int m, int h) {
        int a = h * h / 10000;
        int result = m / a;
        return result;
    }
}
