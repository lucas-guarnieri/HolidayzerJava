public class App {
    public static void main(String[] args) throws Exception {

        HolidayList holidays = new HolidayList();
        Holiday hol1 = new Holiday("Confraternização mundial", "01/01/2023");
        Holiday hol2 = new Holiday("Carnaval", "21/02/2023");
        Holiday hol3 = new Holiday("Páscoa", "17/04/2023");
        Holiday hol4 = new Holiday("Tiradentes", "21/04/2023");
        Holiday hol5 = new Holiday("Dia do trabalho", "01/05/2023");

        holidays.addHoliday(hol1);
        holidays.addHoliday(hol2);
        holidays.addHoliday(hol3);
        holidays.addHoliday(hol4);
        holidays.addHoliday(hol5);
        holidays.printHolidays();
    }
}
