package exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOStreanEx {
public static void main(String[] args) {
		
		try 
		{
			FileOutputStream f=new FileOutputStream("C:\\Users\\Devendra\\java\\DevendraHolmukhe\\DevendraHolmukhe\\src\\exception\\demo.txt");
			String name="We are Learnning java IO";
			byte arr[]=name.getBytes();//converting string to byte array
		
			f.write(arr);
			
			f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		//reading 
		try 
		{
			FileInputStream f1=new FileInputStream("C:\\Users\\Devendra\\java\\DevendraHolmukhe\\DevendraHolmukhe\\src\\exception\\demo.txt");
			int i=0;
			while((i=f1.read())!=-1) 
			{
				System.out.print((char)i);
			
			}

			f1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
