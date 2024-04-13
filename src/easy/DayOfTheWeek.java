package easy;

public class DayOfTheWeek {
    public String dayOfTheWeek(int day, int month, int year) {
        int sum=0;
        int month2[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String days2[]={"Thursday","Friday","Saturday","Sunday", "Monday", "Tuesday", "Wednesday"};
        for(int i=1971;i<year;i++)
        {
            if((i%4==0&&(i%100!=0)||i%400==0)) sum+=366;
            else sum+=365;
        }
        for (int i=1;i<month;i++){
            if(i==2&&(year%4==0&&(year%100!=0||year%400==0))) sum+=29;
            else sum+=month2[i-1];
        }
        sum+=day;
        return days2[sum%7];
    }
}
