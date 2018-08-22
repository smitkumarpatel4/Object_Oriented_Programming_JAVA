package A_LAB_9.Neg_Exception;

public class NegException extends Exception{

int num;
NegException(int a)
{
	num=a;
}
	public String toString()
	{
     return("number is negative"+num);
	}

}
