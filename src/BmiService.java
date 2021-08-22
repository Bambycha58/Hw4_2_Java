public class BmiService {
    public double calculate(double weight, double height) {
        // Переводим сантиметры в метры
        height = height / 100;
        double index = weight / (height * height);
        return index;
    }
}
