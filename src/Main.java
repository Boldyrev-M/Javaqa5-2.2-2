public class Main {
    public static void main(String[] args) {
        /*
         body mass index calculating
         Индекс_массы_тела
         https://ru.wikipedia.org/wiki/%D0%98%D0%BD%D0%B4%D0%B5%D0%BA%D1%81_%D0%BC%D0%B0%D1%81%D1%81%D1%8B_%D1%82%D0%B5%D0%BB%D0%B0
        */
        float weight = 70; // вес в килограммах
        float height = (float) 1.70; // рост в метрах
        BmiService service = new BmiService();
        float bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}

