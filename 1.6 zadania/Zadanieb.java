import java.util.Scanner;
class Zadanieb{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Napisz wyraz");
        String wyraz = sc.nextLine();
        int dlugosc = wyraz.lenght();
        System.out.println("Długość twojego wyrazu to: "+dlugosc);
    }
}