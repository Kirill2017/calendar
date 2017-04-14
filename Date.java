/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.time.LocalDate;
import java.time.Month;


public class Date {
    private int day; 
    private int month;
    private int year;
    
    public int getDay()
    {
        return this.day;
    }
    public int getMonth()
    {
        return this.month;
    }
    public int getYear()
    {
        return this.year;
    }
    public int numOfDays()
    {
        LocalDate date = LocalDate.of(year, month, day);
        return date.lengthOfMonth();
    }
    public String dayName()
    {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }
    public int dayNum()
    {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().getValue();
        
    }
    
     public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;     
    }
     public Date(String dateISO8601)  {
        String[] s = dateISO8601.split("-");
        int yy = Integer.parseInt(s[0]);
        int mm = Integer.parseInt(s[1]);
        int dd = Integer.parseInt(s[2]);
        this.year = yy;
        this.month = mm;
        this.day = dd;
    }
      public Date() {
        LocalDate currentDate = LocalDate.now();
        this.year = currentDate.getYear();
        this.month = currentDate.getMonth().getValue();     
        this.day = currentDate.getDayOfMonth();       
    }
}
