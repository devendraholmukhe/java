class UnaryExample{

    public  void calcIncrement(){ //non static method
       int x=10;
       System.out.println(x++);
       System.out.println(x++);
       System.out.println(++x);
       System.out.println(x++);
       System.out.println(x);
}
    public  void calcDecrement(){ //non static method
       int x=10;
       System.out.println(x--);
       System.out.println(x--);
       System.out.println(--x);
       System.out.println(x--);
       System.out.println(x);
}
   public static void main(String args[]){
      UnaryExample id = new UnaryExample(); //
      id.calcIncrement();
      id.calcDecrement();
}
}
    