import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Array 
{
	static int []Array1 =new int[1024] ;
	static int []Array2 =new int[1024] ;
	static int []ArraySynthesis=new int[1024] ;
	static int cnt1=0;
	static int cnt2=0;
	
	static void  GetTwoArray()
	{
	    Scanner scanner=new Scanner(System.in);
	   
	    int Buffer1 = 0;
	    int Buffer2=  0;
	    String Buffer;
	    System.out.println("�����һ������,�� ; ��������");//////////Array1 input
	    for(int i =0;i<1024;i++)//Ŀǰ�����Ϊ1024  ��Ҫ�����޸Ĵ˴�
	    {
	    Buffer=scanner.nextLine();
	    if(Buffer.equals(";"))
	    {
	    	break;
	    }
	    else
	    {
	    Buffer1=Integer.parseInt(Buffer);
    	Array1[i]=Buffer1;
    	cnt1++;
	    //System.out.println("��һ������Ϊ��"+Arrays.toString(Array1));
	    }
	    }
	    System.out.println("��һ������Ϊ��");//////display Array1
	    for(int j=0;j<cnt1;j++)
	    {
	    	if(j<cnt1-1)
	    System.out.print(Array1[j]+",");
	    	else
	    System.out.print(Array1[j]+";");
		}
	    System.out.print("\n");
	    
	    System.out.println("����ڶ�������,�� ; ��������");
	    for(int i =0;i<1024;i++)//Ŀǰ�����Ϊ1024  ��Ҫ�����޸Ĵ˴�
	    {
	    Buffer=scanner.nextLine();
	    if(Buffer.equals(";"))
	    {
	    	break;
	    }
	    else
	    {
	    Buffer2=Integer.parseInt(Buffer);
    	Array2[i]=Buffer2;
    	cnt2++;
	    //System.out.println("��һ������Ϊ��"+Arrays.toString(Array1));
	    }
	    }
	    System.out.println("�ڶ�������Ϊ��");//////display Array2
		  for(int j=0;j<cnt2;j++)
	    {
	    	if(j<cnt2-1)
	    System.out.print(Array2[j]+",");
	    	else
	    System.out.print(Array2[j]+";");
		}
	    System.out.print("\n");

	}
	

	 static void MultipleTwoArray()
	 {
		 int cntSynthesis=0;
		 if(cnt1>cnt2)
			 cntSynthesis=cnt1;
		 else
			 cntSynthesis=cnt2; 
			 
		 for(int i=0;i<cntSynthesis;i++)
		 ArraySynthesis[i]=Array1[i]*Array2[i];
		 
		 
		  System.out.println("��һ������Ϊ��");//////display Array1
		    for(int j=0;j<cnt1;j++)
		    {
		    	if(j<cnt1-1)
		    System.out.print(Array1[j]+",");
		    	else
		    System.out.print(Array1[j]+";");
			}
		    System.out.print("\n");
		 
		 
		    System.out.println("�ڶ�������Ϊ��");//////display Array2
			  for(int j=0;j<cnt2;j++)
		    {
		    	if(j<cnt2-1)
		    System.out.print(Array2[j]+",");
		    	else
		    System.out.print(Array2[j]+";");
			}
		    System.out.print("\n");
		 
		 
		 
		    System.out.println("�ϳɸ�����Ϊ��");//////display Array2
			  for(int j=0;j<cntSynthesis ;j++)
		    {
		    	if(j<cntSynthesis -1)
		    System.out.print(ArraySynthesis [j]+",");
		    	else 
		    System.out.print(ArraySynthesis [j]+";");
			}
		    System.out.print("\n");
	 }
	
	 public static void main (String[] args) 
	 {
		 System.out.println("Ŀǰ���鳤��Ϊ1024������Ҫ�޸ĳ�����47�д��޸�1024�ĳ���Ҫֵ");
		 GetTwoArray();
		 MultipleTwoArray();
	 }
}
