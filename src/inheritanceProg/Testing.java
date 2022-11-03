package inheritanceProg;

	public class Testing extends Development
	{
		public void WBT()
		{
			System.out.println("firstly perform WBT by developer in postive flow only/it is unit level testing");

		}
		public void BBT()
		{
			System.out.println("then perform BBT by testers in positive and negative flows/reprt bug to dev");
	
		}
		public void GBT()
		{
			System.out.println("Combination of WBT and BBT.prositve and negative both flows tested by tester");

		}
		public void reportBug()
		{
			System.out.println("if any bug or issue occur raise bug to the developer");

		}
	}
