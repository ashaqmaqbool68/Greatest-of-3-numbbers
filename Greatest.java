package basics;

public class Greatest {
	public static void main(String[] args) {
		int a=4,b=7,c=2;
   if(a>b)
   {
	   if(a>c) {
		   System.out.println("a is greatest");
	   }
	   else{
		   System.out.println("c is greatest");
	   }
   }
   else {
	   if(b>c) {
		   System.out.println("b is greatest");
	   }
	   else {
		  System.out.println("c is greatest"); 
	   }
   }
	}
}

