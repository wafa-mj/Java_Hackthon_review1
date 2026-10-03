import java.util.Scanner;
public class MunicipalWasteCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE COLLECTED KG : ");
        double n = sc.nextDouble();
        if (n >= 100) {
            System.out.println("COLLECTION TARGET ACHIEVED");}
            else {
                System.out.println("MORE WASTE COLLECTED REQUIRED");
        }
    }
}
