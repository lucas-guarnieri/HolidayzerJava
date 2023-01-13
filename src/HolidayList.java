import java.util.ArrayList;

import java.util.*;

public class HolidayList {
    private List<Holiday> holidayList = new ArrayList<>();

    public HolidayList() {
    }

    public void addHoliday(Holiday holiday) {
        if (this.holidayList.contains(holiday)) {
            System.out.println("Feridado já incluso");
        } else {
            this.holidayList.add(holiday);
        }
    }

    public void deleteHoliday(Holiday holiday) {
        if (!this.holidayList.contains(holiday)) {
            System.out.println("Feriado não cadastrado");
        } else {
            int holidayIndex = this.holidayList.indexOf(holiday);
            this.holidayList.remove(holidayIndex);
        }
    }

    public void getHolidayByDate(String date) {
        for (int i = 0; i < this.holidayList.size(); i++) {
            if (this.holidayList.get(i).getDate() == date) {
                System.out.println("Esse feriado é o(a):" + this.holidayList.get(i).getName());
                return;
            }
        }
        System.out.println("Não existe feriado cadastrado nessa data");
    }

    public void printHolidays() {
        int cont = 0;
        while (cont < this.holidayList.size()) {
            Holiday temp = this.holidayList.get(cont);
            System.out.println(temp.getName() + "=>" + temp.getDate());
            cont++;
        }
    }

}
