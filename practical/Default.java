class Default
{
      Default(){
                System.out.println("xyz");
	     }
	      int a;
	      String name;
	      public void display(){
		      System.out.println(a+" "+ name);
	      }
	      public static void main(String[] args){
		  System.out.println("ree");
		  Default b= new Default();
		  b.display();
	      }

}