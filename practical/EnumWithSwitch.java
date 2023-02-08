enum Fruits
{
  APPLE,
  BANANA,
  CHERRY,
  MANGO;
}

 public class EnumWithSwitch{
    public static void main(String args[]){
        Fruits fru=Fruits.MANGO;
        switch(fru)
        {
        case APPLE: System.out.println("I am apple!!!!!!!!!");
                    break;
        case CHERRY: System.out.println("I am CHERRY!!!!!!!!!");
                    break;
        case BANANA: System.out.println("I am BANANA!!!!!!!!!");
                    break;
        case MANGO: System.out.println("I am MANGO!!!!!!!!!");
                    break;
        }
}
}
