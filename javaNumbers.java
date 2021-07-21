public class javaNumbers {

	public static void main(String args[]) {
		/*
		 
		 //swap 2 numbers without using 3rd
		 int a = 5;
		int b = 2;

		a = a + b;
		b = a - b;
		a = a - b;

		
		System.out.println(a);
		System.out.println(b);
		
		*/
		//reverse an array
		int a[] = {2,3,4,4,7,8,9};
		
		int len=a.length;
		
		for (int i=0; i< len /2 ; i++ )
		{
			int temp = a[len-1-i];
			a[len-1-i] = a[i];
			a[i]=temp;
		}
		for (int j=0; j<len ;j++)
		System.out.println(a[j]);
	
		
		System.out.println(15%2);
	}
}
