public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 84;
        int h = 184;
        int result = service.calculate(m, h);
        System.out.println("Ваш индекс массы тела " + result);
    }
}
