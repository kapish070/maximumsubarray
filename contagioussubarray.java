import java.util.*;
public class contagioussubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++)
        {
        	a[i]=sc.nextInt();
        }
        int b=a[0];
        for(int i=1;i<a.length;i++)
        {
        	b=b+a[i];
        	if(b>a[i-1])
        	{
        		b=b;
        	}
        	else
        	{
        		b=b-a[i];
        	}
        }
        System.out.print(b);
	}

}
