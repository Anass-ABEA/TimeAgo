package io.github.anass_abea.lang;

import io.github.anass_abea.interf.Language;

public class EnglishDefault implements Language {
    @Override
    public String keyWord_Now() {
        return "just now";
    }

    @Override
    public String keyWord_Ago() {
        return "ago";
    }

    @Override
    public String keyWord_In() {
        return "in";
    }

    @Override
    public boolean keyWord_In_ShownAtBeginning() {
        return true;
    }

    @Override
    public boolean keyWord_Ago_ShownAtBeginning() {
        return false;
    }

    @Override
    public String keyWord_Hours() {
        return "hours";
    }

    @Override
    public String keyWord_Hour() {
        return "hour";
    }

    @Override
    public String keyWord_Minutes() {
        return "minutes";
    }

    @Override
    public String keyWord_Minute() {
        return "minute";
    }

    @Override
    public String keyWord_Seconds() {
        return "seconds";
    }

    @Override
    public String keyWord_Second() {
        return "second";
    }

    @Override
    public String keyWord_Days() {
        return "days";
    }

    @Override
    public String keyWord_Day() {
        return "day";
    }

    @Override
    public String keyWord_Months() {
        return "months";
    }

    @Override
    public String keyWord_Month() {
        return "month";
    }

    @Override
    public String keyWord_Years() {
        return "years";
    }

    @Override
    public String keyWord_Year() {
        return "year";
    }
}
