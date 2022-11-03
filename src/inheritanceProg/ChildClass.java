package inheritanceProg;

	public class ChildClass extends ParentClass
	{
		public void mobile()
		{
			System.out.println("Son has own phone");
		}
		public void  bike()
		{
			System.out.println("Son has own bike");
		}
		public static void main(String args[])
		{
			ChildClass child=new ChildClass();
			child.mobile();
			child.bike();
			child.home();
			child.farm();
		}
	}