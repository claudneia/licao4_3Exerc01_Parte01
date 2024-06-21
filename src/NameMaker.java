import java.util.Scanner;
public class NameMaker {
    
    public static void main(String args[])
    {
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Insira seu primeiro nome: ");
        String firstName = ler.nextLine();
        System.out.println("Insira seu nome do meio: ");
        String middleName = ler.nextLine();
        System.out.println("Insita seu Sobrenome: ");
        String lastName = ler.nextLine();
        
        String fullName = firstName+" "+middleName+ " "+lastName;
        System.out.println(fullName);
        
        
        
        
    }
    
}
