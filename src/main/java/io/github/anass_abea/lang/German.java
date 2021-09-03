package io.github.anass_abea.lang;

import io.github.anass_abea.interf.Language;

public class German implements Language {
    @Override
    public String keyWord_Now() {
        return "Jetzt";
    }

    @Override
    public String keyWord_Ago() {
        return "vor";
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
        return true;
    }

    @Override
    public String keyWord_Hours() {
        return "Stunden";
    }

    @Override
    public String keyWord_Hour() {
        return "Stunde";
    }

    @Override
    public String keyWord_Minutes() {
        return "Minuten";
    }

    @Override
    public String keyWord_Minute() {
        return "Minute";
    }

    @Override
    public String keyWord_Seconds() {
        return "Stunde";
    }

    @Override
    public String keyWord_Second() {
        return "Stunden";
    }

    @Override
    public String keyWord_Days() {
        return "Tage";
    }

    @Override
    public String keyWord_Day() {
        return "Tag";
    }

    @Override
    public String keyWord_Months() {
        return "Monate";
    }

    @Override
    public String keyWord_Month() {
        return "Monat";
    }

    @Override
    public String keyWord_Years() {
        return "Jahre";
    }

    @Override
    public String keyWord_Year() {
        return "Jahr";
    }
}
