
package javaapplication2;

import java.time.*;


public class Month {
    public int NumOfDays;
    public int monthNumber;
    public int year;
    
    
    
    public Month(int yearNumber, int monthNumber)
    {
        LocalDate date = LocalDate.of(yearNumber, monthNumber, 1);
        this.NumOfDays = date.lengthOfMonth();
        this.monthNumber = monthNumber;
        this.year = yearNumber;
    }
    
    public String print()
    {
        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(year, monthNumber, 1);
        String daysNames = "Mon\tTue\tWed\tThu\tFri\tSat\tSun\n";
        int firstDay = date.getDayOfWeek().getValue();
        int col = firstDay - 1;
            for (int j=1; j<=col; j++)
            {
                daysNames += "    \t";
            }
            
        for (int i = 1; i <= date.lengthOfMonth(); i++)
        {
            if (i < 10)
                daysNames += " ";
            
               if (col == 6 || col == 5 || (date.getYear()==today.getYear()&&
                       date.getMonth().getValue()==today.getMonth().getValue()&&
                       i == today.getDayOfMonth()))
                 {
                    daysNames += (char) 27 + "[31m" + i + "   \t";
                 }
                else
                    daysNames += (char) 27 + "[30m" + i + "   \t";
           
            
            
            
            col++;
            if (col == 7)
            {
                col = 0;
                daysNames += "\n";
            }
        }
        return daysNames;
    }
    
    
}
