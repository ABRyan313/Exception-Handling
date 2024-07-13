package nestedTry;
import java.util.*;

public class NestedTry {

	public static void main(String[] args) {
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		int[][]b=new int[2][3];
		int [][]c=new int[5][];
		 c[0]=new int[5];
		 c[1]=new int[4];
		 c[2]=new int[3];
		 c[3]=new int[2];
		 c[4]=new int[1];
		
		
		
		int sum=0;
		try {
			
			for(int i=0;i<a.length;++i)
				a[i]=sc.nextInt();
			sc.close();
			for(int i=0;i<a.length;++i)
				sum+=a[i];
				System.out.println("Sum of the numbers:"+sum+"\n");
			
			try {
				
				for(int i=0;i<b.length;++i)
					for(int j=0;j<b[i].length;++j)
						b[i][j]=rand.nextInt(10)+1;
				
				for(int[]row:b)
					System.out.println(Arrays.toString(row));
						
		
				
				try {
					for(int i=0;i<c.length;++i)
						for(int j=0;j<c[i].length;++j)
							c[i][j]=rand.nextInt(10)+1;
					
					for(int[]row:c)
						System.out.println(Arrays.toString(row));
				}
				catch(Exception e2) {
					System.out.println("out of bound");
				}
				
			}
			catch(Exception e1) {
				System.out.println("out of bound again");
			}
			
		}
		
		catch(Exception e){
			System.out.println("variable assign fail");
		}

	}

}
