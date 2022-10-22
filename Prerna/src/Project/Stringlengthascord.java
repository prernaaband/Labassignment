package Project;

public class Stringlengthascord {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s = "This is easiest example";
		String[]s1=s.split("\\s");
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].length()>s1[j].length())
				{
					String temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
		}
	}
		for(int i=0;i<s1.length;i++)
		{System.out.print(s1[i]+" ");}
		}
}