public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

while(n!=0)
{

    System.out.print(" 1.insert student details\n2.display student details \n 3.getstudent details by bithdate   ");
    Scanner sn=new Scanner(System.in);

    n=sn.nextInt();

     if(n==1)
      {
    
    setstudent();  
      }

     if(n==2)
      {
       getstudent();
      }
     if(n==3)
      {
       getbybirthdate();
      } 
    
    
}
}


	}

}
