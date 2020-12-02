public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService();
        float bmi = service.calculate(80f, 1.7f);

        System.out.println(bmi);

    }
}
