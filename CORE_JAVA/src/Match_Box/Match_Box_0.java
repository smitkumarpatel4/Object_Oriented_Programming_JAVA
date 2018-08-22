package Match_Box;
	import java.util.Scanner;
	public class Match_Box_0 extends Box
	{
		float weight;
		int no_sticks;
		
		Match_Box_0(float w, float h, float l, float wei, int n)
		{
			super(w, h, l);
			weight=wei;
			no_sticks=n;
		}
		
		void PrintApplication()
		{
			System.out.println("This box is used as Match Box...");
		}
		
		{
			super.PrintVolume();
		}
		
		void PrintDetails()
		{
			super.PrintDetail();
			System.out.println("The weight of this Box is:" +weight);
			System.out.println("This box contains total " +no_sticks +" sticks in the box.");
		}
		
		void UpdatedSticks(int NewSticks)
		{
			if(NewSticks>no_sticks)
			{
				int flag;
				System.out.println("Sorry this operation can not be performed...");
				System.out.println("Please Enter the New Sticks again:");
				flag=1;
				while(flag==1)
				{
				     Scanner Input=new Scanner(System.in);
					 NewSticks=Input.nextInt();
					 no_sticks=no_sticks-NewSticks;
					 System.out.println("Congrats... Sticks had been updated. Now remaining Sticks in the Box is:" +no_sticks);
				}
			}
			else
			{
			no_sticks=no_sticks-NewSticks;
			System.out.println("Congrats... Sticks had been updated. Now remaining Sticks in the Box is:" +no_sticks);
			}
		}
	}

