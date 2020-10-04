package it.fago.lambdapatterns.defender.adapter;

public class UsageWorker {

	static class Countdown implements Runnable
	{
		private final int start;
		
		public Countdown(int start)
		{
			this.start=start;
		}
		
		@Override
		public void run() {
			int count = start;
			while(count-->0)
			{
				System.out.println(count);
			}	
		}
		
	}
	
	public static void main(String[] args) {
		
		Countdown c = new Countdown(10);
		Worker worker = Worker.of(c::run);
		worker.work();
		
		
	}
}
