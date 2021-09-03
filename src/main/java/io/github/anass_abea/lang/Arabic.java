package io.github.anass_abea.lang;

import io.github.anass_abea.interf.Language;

public class Arabic implements Language {
    @Override
    public String keyWord_Now() {
        return "في لحظات";
    }

    @Override
    public String keyWord_Ago() {
        return "منذ";
    }

    @Override
    public String keyWord_In() {
        return "بعد";
    }

    @Override
    public boolean keyWord_In_ShownAtBeginning() {
        return true;
    }

    @Override
    public boolean keyWord_Ago_ShownAtBeginning() {
        return true;
    }

    @Override
    public String keyWord_Hours() {
        return "ساعات";
    }

    @Override
    public String keyWord_Hour() {
        return "ساعة";
    }

    @Override
    public String keyWord_Minutes() {
        return "دقائق";
    }

    @Override
    public String keyWord_Minute() {
        return "دقيقة";
    }

    @Override
    public String keyWord_Seconds() {
        return "ثوان";
    }

    @Override
    public String keyWord_Second() {
        return "ثانية";
    }

    @Override
    public String keyWord_Days() {
        return "ايام";
    }

    @Override
    public String keyWord_Day() {
        return "يوم";
    }

    @Override
    public String keyWord_Months() {
        return "أشهر";
    }

    @Override
    public String keyWord_Month() {
        return "شهر";
    }

    @Override
    public String keyWord_Years() {
        return "سنوات";
    }

    @Override
    public String keyWord_Year() {
        return "سنة";
    }
}
