package Match_Box;
	public abstract class Box 
	{
		private float width;
		private float height;
		private float length;
		
		Box()
		{
			
		}
		
		Box(float w, float h, float l)
		{
			width =w;
			height=h;
			length=l;
		}
		
		final void PrintVolume()
		{
			float volume;
			volume= width*height*length;
			System.out.println("The volume of the Box is:" +volume);
		}
		
		abstract void PrintApplication();
		
		void PrintDetail()
		{
			System.out.println("The width of this box is:" +width);
			System.out.println("The height of this box is:" +height);
			System.out.println("The length of this box is:" +length);
		}
	}

