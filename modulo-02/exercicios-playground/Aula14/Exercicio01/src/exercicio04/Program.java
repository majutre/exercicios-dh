package exercicio04;

import java.util.Scanner;

public class Program {

	public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        int i = 0, x = 0, y = 0;
        
        do{
            System.out.print("Digite o valor de x: ");
            x = sc.nextInt();
            
            System.out.print("Digite o valor de y: ");
            y = sc.nextInt();
            

            while(x <= y){
   
                if(x % 2 == 0){
                    System.out.println(x);
                }
               
                x++;
            }
         
            i++;
        }while(i < 5);
        
        sc.close();
    }
}
