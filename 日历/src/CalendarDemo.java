import java.util.Calendar;  
import java.util.GregorianCalendar;  
  
public class CalendarDemo {  
    
    public static void calendarDisplay(Calendar c) {      
          
        Calendar ca = new GregorianCalendar(c.get(Calendar.YEAR),c.get(Calendar.MONTH),1);  
        Calendar temp = new GregorianCalendar(ca.get(Calendar.YEAR),ca.get(Calendar.MONTH)+1,1);  
  
          
        System.out.println("\t\t"+ca.get(Calendar.YEAR)+"��\t"+(ca.get(Calendar.MONTH)+1)+"��");  
        System.out.println();  
        System.out.println("��\tһ\t��\t��\t��\t��\t��");  
          
        for(int i =1; i<ca.get(Calendar.DAY_OF_WEEK);i++)  
            System.out.print("\t");  
        do{  
            if(ca.get(Calendar.DAY_OF_WEEK)==7)  
                System.out.println(ca.get(Calendar.DAY_OF_MONTH)+"\t");  
            else   
                System.out.print(ca.get(Calendar.DAY_OF_MONTH)+"\t");  
              
            ca.add(Calendar.DAY_OF_MONTH, 1);  
        }while(ca.get(Calendar.MONTH) != temp.get(Calendar.MONTH));  
          
    } 
 
    public static void main(String[] args) {  
        Calendar cc = new GregorianCalendar(2005,7,1);//��������һ��ʱ��  
        calendarDisplay(cc);  
  
    }  
 
  
}  