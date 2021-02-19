package helloworld;
import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.println("I am AJ Dela Cruz");     
 
 //      Answer for number 1:
//	      A.0
//	      b.2.0
//	      c.0.25
//        d. the answer is	error
//	      e. 0.0
	  
          System.out.println(1/4);
	      System.out.println(4.0/2);
	      System.out.println(1.0/4.0);
	      // int x = 4.0 / 2;
	      double x = 1/4;
	      System.out.println(x);

//        Answer for number 2:
//        int y = (int) math.pi; 
//        System.out.println(y) =3
//        int d = (int) (Math.PI*20);
//        System.out.println(d); =62
	      
	      int y = (int) Math.PI;
	      System.out.println(y);
	      int d = (int) (Math.PI*20); 
	      System.out.println(d);
	      
	      
//        Answer for number 3:
//        A. 4
//	      B. 0.0
//	      C. the answer is syntax error because the (double) should be (int).
//	      D. 2
//	      E. 5
	      
	      int z =(int)4.99;
	      System.out.println(z);
	      double m = (int) 0.999;
	      System.out.println(m);
	      //int l = (double)8;
	      //System.out.println(l);
	      int v = (int) 4.999 / (int) 2.5;
	      System.out.println(v);
	      int q = (int) (4.5 / 0.9);
	      System.out.println(q);
	      
//        Answer for number 4:
//	   A.     
	    Scanner K = new Scanner(System.in);
	    System.out.println("Enter the radius:");
	    double k= K.nextDouble();
	    double area=Math.PI *k*k;
	    System.out.println("area of cicrle is: " + area);
	    
//	   B. 
	    int x1,x2,y1,y2;
	    double dis;
	    Scanner B = new Scanner(System.in);
	    System.out.println("enter x1 point");
	    x1=B.nextInt();
	    System.out.println("enter y1 point");
	    y1=B.nextInt();
	    System.out.println("enter x2 point");
	    x2=B.nextInt();
	    System.out.println("enter y2 point");
	    y2=B.nextInt();
	    dis=Math.sqrt(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
	    System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")==>"+dis);
	    
//	   C.
	    double f=20;
	    double e=60;
	    double o=80;
	    double u=100;
	    Scanner c=new Scanner(System.in);
	    System.out.println("enter f");
		f=B.nextInt();
		System.out.println("enter e");
		e=B.nextInt();
		System.out.println("enter o");
		o=B.nextInt();
		System.out.println("enter u");
		u=B.nextInt();


        

	    
	    
	    
	    
	    
	    
	    
	 
	
	    
	    
	    
	    
	}
	
	
}
	      
	      
	      
	      
	      
	      
	  
	
	
	

