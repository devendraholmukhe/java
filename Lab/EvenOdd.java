class EvenOdd
{
   public static void main(String[] args)
   {
      System.out.println("Even numbers between 1 and 200: ");
      for(int a = 1; a <= 200; a++)
      {
         if(a % 2 == 0)   //condition
         {
            System.out.print(a + " ");
         }
      }
      System.out.println("\nOdd numbers between 1 and 200: ");
      for(int a = 1; a<=200; a++)
      {
         if(a % 2 != 0)
         {
            System.out.print(a + " ");
         }
      }
   }
}