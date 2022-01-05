import java.util.Scanner;
class Zadaniea{
    public static void main(String[] args){
        final String hasloa = "haslo123";
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj Hasło: ");
        String haslob = sc.nextLine();
        if(haslob.equals(hasloa)){
            System.out.print("hasła się zgadzają \n Witamy!");
        }
        else{
            System.out.println("Hasła się nie zgadzają!");
        }
    }
}