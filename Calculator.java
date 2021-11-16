import java.util.Scanner;
class Simplecal{
	public static void show()
	{
	System.out.println("\n1=SIMPLE CALCULATOR\n2=SCIENTIFIC CALCULATOR\n3=UNIT CONVERTERS");
	System.out.println("Press (1) If You Want To Use Simple Calculator");
	System.out.println("Press (2) If You Want To Use Scientific Calculator");
	System.out.println("Press (3) If You Want To Use Unit Converters");
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if(a==1)
    { 
    	char op;
    	double n1,n2,result;
    	for(int i=0;i<=10;i++)
    	{
    		System.out.println("\t\t\t\t\t\t-----------------");
    		System.out.println("\t\t\t\t\t\tSIMPLE CALCULATOR"); 
    		System.out.println("\t\t\t\t\t\t-----------------");
    	System.out.println("CHOOSE AN OPERATOR: +, -, *, /");
    	Scanner input = new Scanner(System.in);
        op = input.next().charAt(0);
        System.out.println("Enter First Number");
        n1 = input.nextDouble();
        System.out.println("Enter Second Number");
        n2 = input.nextDouble();
        switch (op)
        {
        case '+':
          result = n1 + n2;
          System.out.println(n1 + " + " + n2 + " = " + result);
          break;
        case '-':
          result = n1 - n2;
          System.out.println(n1 + " - " + n2 + " = " + result);
          break;
        case '*':
          result = n1 * n2;
          System.out.println(n1 + " * " + n2 + " = " + result);
          break;
        case '/':
            result = n1 / n2;
            System.out.println(n1 + " / " + n2 + " = " + result);
            break;
            default:
            System.out.println("Invalid operator!");
            break;
        }}}
            if(a==2)
            {
            	for(int i=0;i<=10;i++)
            {
            System.out.println("\t\t\t\t\t\t---------------------");
    	    System.out.println("\t\t\t\t\t\tSCIENTIFIC CALCULATOR");
    	    System.out.println("\t\t\t\t\t\t---------------------");
		    System.out.println("1=PERCENTAGE \t\t\t\t\t2=SQUARE \t\t\t\t\t3=CUBE");
		    System.out.println("4=Sin        \t\t\t\t\t5=Cos    \t\t\t\t\t6=Tan");
		    System.out.println("7=Square Root\t\t\t\t\t8=log    \t\t\t\t\t9=ln");
		    System.out.println("Press Number Which Action You Want To Perform");
		    Scanner a1=new Scanner(System.in);
		    int x=a1.nextInt();
		    if(x==1)
		    {
		    System.out.println("\n**PERCENATGE**");
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter obtained marks:");
	        double obtained = in.nextDouble();
	        System.out.println("Enter total marks:");
	        double total = in.nextDouble();
	        double per=obtained/total*100;
	        System.out.println("Percentage obtained: "+per+"%" );
	        }	
		    if(x==2)
		    {
		    	System.out.println("\n**SQUARE**");
		    	System.out.println("Enter Any Number");
		    	Scanner b=new Scanner(System.in);
		    	double b1=b.nextDouble();
		    	double square=b1*b1;
		    	System.out.println("The Square Of "+b1+" is="+square);
		    }
		    if(x==3)
		    {
		    	System.out.println("\n**CUBE**");
		    	System.out.println("Enter Any Number");
		    	Scanner b=new Scanner(System.in);
		    	double b2=b.nextDouble();
		    	double cube=b2*b2*b2;
		    	System.out.println("The Cube Of "+b2+" is="+cube);
		    }
		    if(x==4)
		    {
		    	System.out.println("\n**Sin**");
		    	System.out.println("Enter Any Degree");
		    	Scanner b=new Scanner(System.in);
		    	double b3=b.nextDouble();
		        System.out.println("Sin of "+b3+" is="+Math.sin(Math.toRadians(b3)));
		    }
		    if(x==5)
		    {
		    	System.out.println("\n**Cos**");
		    	System.out.println("Enter Any Degree");
		    	Scanner b=new Scanner(System.in);
		    	double b4=b.nextDouble();
		        System.out.println("Cos of "+b4+" is="+Math.cos(Math.toRadians(b4)));
		    }
		    if(x==6)
		    {
		    	System.out.println("\n**Tan**");
		    	System.out.println("Enter Any Degree");
		    	Scanner b=new Scanner(System.in);
		    	double b5=b.nextDouble();
		        System.out.println("Cos of "+b5+" is="+Math.tan(Math.toRadians(b5)));
		    }
		    if(x==7)
		    {
		    	System.out.println("\n**SQUARE ROOT**");
		    	System.out.println("Enter Any Number");
		    	Scanner b=new Scanner(System.in);
		    	double b6=b.nextDouble();
		    	System.out.println("The square root of "+b6+ " is: "+Math.sqrt(b6));	    	
		    }
		    if(x==8)
		    {
		    	System.out.println("\n**COMMON LOGARITHM(log)**");
		    	System.out.println("Enter Any Number");
		    	Scanner b=new Scanner(System.in);
		    	double b7=b.nextDouble();
		    	System.out.println("Common Logarithm Value Of"+b7+" is="+(Math.log10(b7)));
		    }
		    if(x==9)
		    {
		    	System.out.println("\n**NATURAL LOGARITHM(ln)**");
		    	System.out.println("Enter Any Number");
		    	Scanner b=new Scanner(System.in);
		    	double b8=b.nextDouble();
		    	System.out.println("Natural Logarithm Of "+b8+" is="+Math.log(b8));
		    }		    
            }}  
            if(a==3)
            {
            	for(int i=0;i<=10;i++)
            	{
            		System.out.println("\t\t\t\t\t\t---------------");
            		System.out.println("\t\t\t\t\t\tUNIT CONVERTERS"); 
            		System.out.println("\t\t\t\t\t\t---------------");
            		System.out.println("1=AREA    \t\t\t\t\t2=VOLUME \t\t\t\t\t3=MASS");
        		    System.out.println("4=DISTANCE\t\t\t\t\t5=TIME");
        		    System.out.println("Press Number Which Unit You Want To Convert");
        		    Scanner w=new Scanner(System.in);
        		    int v=w.nextInt();
        		    if(v==1)
        		    {
        		    	System.out.println("AREA");
        		    	System.out.println("a=Square Millimeters\nb=Square kilometers");
        		    	System.out.println("Press An Alphabet In Which You Want To Convert An Area");
        		    	Scanner ww=new Scanner(System.in);
        		    	char cc=ww.next().charAt(0);System.out.println();
        		    	if(cc=='a')
        		    	{
        		    		System.out.println("\t\tArea Into Square Millimeters");
        		    		System.out.println("Enter Number Which You Want To Convert");
        		    		Scanner as=new Scanner(System.in);
        		    		int sa=as.nextInt();
                            double sqmilli=sa*1000000;
                            System.out.println("Answer is="+sqmilli+" square millimeters");
        		    	}
        		    	if(cc=='b')
        		    	{
        		    		System.out.println("\t\tArea Into Square Kilometers");
        		    		System.out.println("Enter Number Which You Want To Convert");
        		    		Scanner as=new Scanner(System.in);
        		    		int sa=as.nextInt();
                            double sqcenti=sa*0.000001;
                            System.out.println("Answer is="+sqcenti+" square kilometer");
        		    	}
        		    }
        		    if(v==2)
        		      {System.out.println("VOLUME");
    		    	  System.out.println("a=MilliLitres\nb=CUBIC METERS");
    		    	  System.out.println("Press An Alphabet In Which You Want To Convert An Area");
    		    	  Scanner ww=new Scanner(System.in);
    		    	char cc=ww.next().charAt(0);System.out.println();
    		    	if(cc=='a')
    		    	{
    		    		System.out.println("\t\tVolume Into Millimeters");
    		    		System.out.println("Enter Number Which You Want To Convert");
    		    		Scanner as=new Scanner(System.in);
    		    		int sa=as.nextInt();
                        double sqmilli=sa*1000;
                        System.out.println("Answer is="+sqmilli+" millimeters");
    		    	}
    		    	if(cc=='b')
    		    	{
    		    		System.out.println("\t\tVolume Into Cubic Meters");
    		    		System.out.println("Enter Number Which You Want To Convert");
    		    		Scanner as=new Scanner(System.in);
    		    		int sa=as.nextInt();
                        double sqcenti=sa*0.001;
                        System.out.println("Answer is="+sqcenti+" cubic meters");
    		    	}}
    		    	if(v==3)
    		    		{System.out.println("MASS");
  		    	        System.out.println("a=GRAM\nb=MILLIGRAMS");
  		    	        System.out.println("Press An Alphabet In Which You Want To Convert An Area");
  		    	        Scanner ww=new Scanner(System.in);
  		    	       char cc=ww.next().charAt(0);System.out.println();
  		    	        if(cc=='a')
  		    	{
  		    		  System.out.println("\t\tMASS Into GRAM");
  		    		  System.out.println("Enter Number Which You Want To Convert");
  		    		  Scanner as=new Scanner(System.in);
  		    		  int sa=as.nextInt();
                      double sqmilli=sa*1000;
                      System.out.println("Answer is="+sqmilli+" gram");
  		    	}
  		    	if(cc=='b')
  		    	{
  		    		System.out.println("\t\tMASS Into MILLIGRAM");
  		    		System.out.println("Enter Number Which You Want To Convert");
  		    		Scanner as=new Scanner(System.in);
  		    		int sa=as.nextInt();
                      double sqcenti=sa*1000000;
                      System.out.println("Answer is="+sqcenti+" milligram");
  		    	}}
    		    	if(v==4)
    		    	{
    		    		System.out.println("DISTANCE");
  		    	        System.out.println("a=CENTIMETER\nb=MILLIMETER");
  		    	        System.out.println("Press An Alphabet In Which You Want To Convert An Area");
  		    	        Scanner ww=new Scanner(System.in);
  		    	       char cc=ww.next().charAt(0);System.out.println();
  		    	        if(cc=='a')
  		    	{
  		    		   System.out.println("\t\tDISTANCE Into CENTIMETER");
  		    		   System.out.println("Enter Number Which You Want To Convert");
  		    		   Scanner as=new Scanner(System.in);
  		    		   int sa=as.nextInt();
                       double sqmilli=sa*100;
                       System.out.println("Answer is="+sqmilli+" cm");
  		    	}
  		    	if(cc=='b')
  		    	{
  		    		  System.out.println("\t\tDISTANCE Into MILLIMETER");
  		    		  System.out.println("Enter Number Which You Want To Convert");
  		    		  Scanner as=new Scanner(System.in);
  		    		  int sa=as.nextInt();
                      double sqcenti=sa*1000;
                      System.out.println("Answer is="+sqcenti+" mm");
  		    	}}
    		    if(v==5)
    		    {
    		    	System.out.println("TIME");
		    	        System.out.println("a=MINUTE\nb=MILLISECOND");
		    	        System.out.println("Press An Alphabet In Which You Want To Convert An Area");
		    	        Scanner ww=new Scanner(System.in);
		    	       char cc=ww.next().charAt(0);System.out.println();
		    	        if(cc=='a')
		    	{
		    		   System.out.println("\t\tSecond Into Minute");
		    		   System.out.println("Enter Number Which You Want To Convert");
		    		   Scanner as=new Scanner(System.in);
		    		   int sa=as.nextInt();
                   double sqmilli=sa*0.0166667;
                   System.out.println("Answer is="+sqmilli+" m");
		    	}
		    	if(cc=='b')
		    	{
		    		  System.out.println("\t\tSecond Into MilliSecond");
		    		  System.out.println("Enter Number Which You Want To Convert");
		    		  Scanner as=new Scanner(System.in);
		    		  int sa=as.nextInt();
                  double sqcenti=sa*1000;
                  System.out.println("Answer is="+sqcenti+" ms");
		    	}
    		    }	    	
            }}           
}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simplecal c=new Simplecal();
    System.out.println("\t\t\t\t\t\t|----------------------------|");
    System.out.println("\t\t\t\t\t\t|WELCOME TO ONLINE CALCULATOR|");
    System.out.println("\t\t\t\t\t\t|----------------------------|");
    c.show();
	}}