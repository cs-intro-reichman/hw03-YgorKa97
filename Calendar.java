public class Calendar {
    // Starting the calendar on 1/1/1900
    static int dayOfMonth = 1;
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 2;     // 1.1.1900 was a Monday
    static int nDaysInMonth = 31; // Number of days in January
    static int dayCounter = 1;
    static int inputYear;


    public static void main(String args[]) {
        inputYear = Integer.parseInt(args[0]);
        int debugDaysCounter = 1;
        while (true) {
            advance();
            if (year>inputYear) {
                break;
            }
        }
    }

    private static void advance() {
        dayCounter++;
        dayOfMonth ++;
        if(nDaysInMonth(month,year) == (dayOfMonth - 1)){
            month++;
            dayOfMonth = 1;
            if(month > 12){
                year++;
                month = 1;
            }

        }
        if (year == inputYear){
            boolean sunday = dayCounter % 7 == 0;
        if(sunday){
            System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
        }else{
            System.out.println(dayOfMonth + "/" + month + "/" + year);
        }
        }

    }

    private static boolean isLeapYear(int year) {
        if (((year % 4 == 0) && (year%100 != 0)) || (year % 400 == 0)){
            return true;
        }
        return false;
    }

    private static int nDaysInMonth(int month, int year) {
        // Replace the following statement with your code
        switch(month){
            case (1):
                return 31;
            case (2):
                if(isLeapYear(year)){
                    return 29;
                }
                return 28;
            case (3):
                return 31;
            case (4):
                return 30;
            case (5):
                return 31;
            case (6):
                return 30;
            case (7):
                return 31;
            case (8):
                return 31;
            case (9):
                return 30;
            case (10):
                return 31;
            case (11):
                return 30;
            case (12):
                return 31;
        }
        return 0;
    }
}
