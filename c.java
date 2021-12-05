

 class Coin
{
	
	   private static int H = 1; //H=head

	   // current value of the c=coin
	   private int value = 0;

	   
	   public void flip()
	   {
	      if (Math.random() < 0.5)
	      {
	          value = 0;
	      }
	      else
	      {
	         value = 1;
	      }
	   }

	  
	   public boolean isTails()
	   {
	      return value != H;
	   }

	   // convert the value to a string
	   public String toString()
	   {
	      if (value == H) return "Heads";
	      else return "T";
	   }

	   // test the class
	   public static void main(String[] args)
	   {

	      Coin myCoin = new Coin();
	      for (int i = 0; i < 1; i++)
	      {
	         myCoin.flip();
	         System.out.println(myCoin);
	         System.out.println(myCoin.isTails());
	      }
	   }


}
    

