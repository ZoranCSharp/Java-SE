
public class TestThreads2 {
	
	public static void main(String args[])
	{
		MarketNews2 mn2 = new MarketNews2();
		//constructor
		Thread mn = new Thread(mn2, "Market News");
		mn.start();
		
		Runnable p2 = new Portfolio2();
		//runnable object in constructor
		Thread p = new Thread(p2, "Portfolio data");
		p.start();
		
		System.out.println("TestThreads2 is finished");
	}

}
