import java.util.Scanner;

public class WasteCalculator {
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Waste Collected at Point 1 (kg): ");
        double point1Waste = sc.nextDouble();

        System.out.print("Enter Waste Collected at Point 2 (kg): ");
        double point2Waste = sc.nextDouble();
        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println(" Waste Collection Summary");
        System.out.println("Point 1 Waste(kg): " + point1Waste);
        System.out.println("Point 2 Waste(kg): " + point2Waste);
        System.out.println("Total Waste Collected(kg): " + totalWaste);


    }
}
