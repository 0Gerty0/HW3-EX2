public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        int weight = 70;
        double height = 1.78;
        int result = bmi.calculate(weight, height);
        System.out.println("Индекс массы тела - " + result);
    }
}

