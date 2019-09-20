package Question_6;
import java.util.*;

public class question_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        double[] a = new double[size];
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println("Original array:" + Arrays.toString(a));
        for(int i=0; i<size; i++){
            for(int j=0; j<size-1;j++){
                if(a[j]>=a[j+1]){
                    double c = a[j];
                    a[j]=a[j+1];
                    a[j+1]=c;
                    c--;
                }if(a[j]<=a[j+1]) {
                    double c = a[j];
                    c++;
                }
            }
        }
        for(int i=0; i<size; i++){
        }
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
