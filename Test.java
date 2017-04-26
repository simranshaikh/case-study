import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		DataOutputStream dos=null ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of objects u wanna create....");
		int n=sc.nextInt();

		Employee e[]=new Employee[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Emp Id : ");
			int n1=sc.nextInt();

			System.out.println("Enter Emp Salary: ");
			int n2=sc.nextInt();

			System.out.println("Enter Emp Name : ");
			String n3=sc.next();
			e[i]= new Employee(n1,n2,n3);
		}  
		
		try {
			fos = new FileOutputStream("source.txt");
			 dos=new DataOutputStream(fos);
			 
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		

		for(int i=0;i<n;i++)
		{
			char ch='\n';
			int j=ch;
			try {
				
				dos.writeBytes(e[i].toString()); 
				dos.writeByte(j);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
		
}
}

