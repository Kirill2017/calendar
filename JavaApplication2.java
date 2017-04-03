
package javaapplication2;

import java.time.*;


public class JavaApplication2 {

   
    public static void main(String[] args) {
        LocalDate date =  LocalDate.now();
        int m = date.getMonthValue();
        int y = date.getYear();
        
        if (args.length > 1)
        {
            m = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        }
        
        LocalDate firstDay = LocalDate.of(y, m, 1);
        int day_of_week = firstDay.getDayOfWeek().getValue();
        int LengthOfMonth = firstDay.lengthOfMonth();
        int col = day_of_week - 1;
        System.out.println("Mon   Tue   Wed   Thu   Fri   Sat   Sun");
        for (int i = 0; i < col; i++)
            System.out.print("      ");
        for (int i = 1; i <= LengthOfMonth; i++)
        {
            if (i < 10)
                System.out.print(" ");
            System.out.print(" " + i + "   ");
            col++;
            if (col == 7)
            {
                col = 0;
                System.out.println();
            }
        }
        System.out.println();
    }
    
}
