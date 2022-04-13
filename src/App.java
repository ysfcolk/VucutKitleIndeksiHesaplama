import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Double size,weight,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuz: ");
        size = input.nextDouble();
        System.out.println("Kilonuz: ");
        weight = input.nextDouble();
        input.close();
        result = weight / size * size;

        System.out.println("Kilonuz: "+weight+"\n"+"Boyunuz: "+size+"\n"+"Hesaplanan vücut kitle indeksiniz: "+result);

    }
}
