class ArithmeticDemo{
	public void cal(){
	int a=100;
	int b=50;
	System.out.println("Addition: "+(a+b));
	System.out.println("Substraction: "+(a-b));
	System.out.println("Multiplicaction: "+(a*b));
	System.out.println("Division: "+(a/b));
	System.out.println("Modulus: "+(a%b));
}
	public static void main(String aegs[]){
	ArithmeticDemo obj = new ArithmeticDemo();
	obj.cal();
}
}