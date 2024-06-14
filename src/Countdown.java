public class Countdown {

    public static void main(String[] args) {
        
        
        System.out.println("Countdown to Launch: ");

        //contagem regressiva de 5 a 0
        for(int i = 5; i >= 0; i--) {
            System.out.print(i +" "); 
        }

        System.out.println("Blast Off!");
        
        
         //contagem regressiva de 0 a 5
        for(int i2 = 0; i2 <= 5; i2++)
        {
            System.out.print(i2 +" ");
        }
        
         System.out.println("Blast Off!");
         
         
         //contagem de numeros pares de 0 a 20
         System.out.print("números pares: ");
         for(int i3 = 0; i3 <= 20; i3 += 2)
         {
             System.out.print(i3 +" ");
         }
         
    }
}
