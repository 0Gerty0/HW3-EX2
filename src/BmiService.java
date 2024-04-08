public class BmiService {
    public int calculate (int WeightKg, double HeightMeter){
        double heightMeter = HeightMeter;
        double bmi = WeightKg/ Math.pow (HeightMeter,2);
        return (int) bmi;
    }
}
