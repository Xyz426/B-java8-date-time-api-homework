package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    LocalDate laborDay = LocalDate.of(date.getYear(), 5, 1);
    if(date.getMonthValue() > 4){
      return laborDay.plusYears(1).toEpochDay() - date.toEpochDay();
    }
    return laborDay.toEpochDay() - date.toEpochDay();
  }
}
