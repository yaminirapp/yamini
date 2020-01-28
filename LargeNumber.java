import java.util.scanner;
public class LargeNumber
{
public static void main(String[] args)
{
int max;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows : ");
    int n = sc.nextInt();
    System.out.println("Enter number of columns : ");
    int m = sc.nextInt();
    int[][] array = new int[n][m];
    System.out.println("Enter the elements of array : ");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print("X[" + i + "," + j + "]" + "=");
            array[i][j] = sc.nextInt();
        }
    }
}
}
    max = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (array[i][j] > max) {
                max = array[i][j];
            }
        }
    }
    System.out.println("Max value of the array is " + max);
}