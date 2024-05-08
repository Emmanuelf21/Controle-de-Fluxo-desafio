import java.util.Scanner;

public class desafio {
    public static void main(String[] args) { 
      Scanner scanner = new Scanner(System.in); 

      double limiteDiario = scanner.nextDouble();
      double saque = 0;

      for (double i  = 0; limiteDiario>i ;limiteDiario-=i){
        saque = scanner.nextDouble();
        if(saque>0 && limiteDiario>=saque){
          limiteDiario-=saque;
          System.out.println("Saque realizado. Limite restante: "+limiteDiario);
        }
        
        else if(saque==0){
          System.out.println("Transacoes encerradas.");
          return;
        }
        else{
          System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
          return;
        }
      
      }
        scanner.close();
    } 
  }


