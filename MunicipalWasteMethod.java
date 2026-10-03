import java.util.Scanner;
public class MunicipalWasteMethod {
        void calculateTotalWaste(double point1Waste, double point2Waste) {
        double Total = point1Waste+ point2Waste;
         System.out.println("TOTAL:" +Total);
    }
    public static void main (String args[]){
        MunicipalWasteMethod obj = new MunicipalWasteMethod();
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER P1=");
        double point1Waste= sc.nextDouble();
        System.out.println("ENTER P2=");
        double point2Waste= sc.nextDouble();

        obj.calculateTotalWaste(point1Waste,point2Waste);
    } 
}
