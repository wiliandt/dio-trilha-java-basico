     import java.util.Scanner;
     public class ContaTerminal{
         public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite sua conta: ");
        String conta = scanner.nextLine();

        System.out.print("Por favor, digite sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor,digite nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
     
        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
             
        scanner.close();

         System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
         + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

     


    }
}
