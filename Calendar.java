

package calendar;

import java.time.*;

public class Calendar {

    
    public static void main(String[] args) {
        
        Date date = new Date();
        
        
        
        int dayOfWeek = date.dayNum();
        int LengthOfMonth = date.numOfDays();
        int col = dayOfWeek - 1;
        
        

        System.out.print(DayOfWeek.MONDAY.toString().substring(0, 3) + "\t");
        System.out.print(DayOfWeek.TUESDAY.toString().substring(0, 3) + "\t");
        System.out.print(DayOfWeek.WEDNESDAY.toString().substring(0, 3) + "\t");
        System.out.print(DayOfWeek.THURSDAY.toString().substring(0, 3) + "\t");
        System.out.print(DayOfWeek.FRIDAY.toString().substring(0, 3) + "\t");
        System.out.print(DayOfWeek.SATURDAY.toString().substring(0, 3) + "\t");
        System.out.println(DayOfWeek.SUNDAY.toString().substring(0, 3));
        
        for (int j=1; j<=col; j++)
            System.out.print("    \t");
            
        for (int i = 1; i <= LengthOfMonth; i++)
        {
            if (i < 10)
                System.out.print(" ");

            if (col == 6 || col == 5 || (date.getYear()==LocalDate.now().getYear()&&
                date.getMonth()==LocalDate.now().getMonth().getValue()&&
                i == LocalDate.now().getDayOfMonth()))

                    System.out.print((char) 27 + "[31m" + i + "   \t");

                else
                    System.out.print((char) 27 + "[30m" + i + "   \t");
                            
            col++;
            if (col == 7)
            {
                col = 0;
                System.out.println();
            }



            
        }
        
    }
    
    
}
