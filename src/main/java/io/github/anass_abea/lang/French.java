package io.github.anass_abea.lang;

import io.github.anass_abea.interf.Language;

public class French implements Language {
    @Override
    public String keyWord_Now() {
        return "maintenant";
    }

    @Override
    public String keyWord_Ago() {
        return "il y a";
    }

    @Override
    public String keyWord_In() {
        return "dans";
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
        return "heures";
    }

    @Override
    public String keyWord_Hour() {
        return "heure";
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
        return "secondes";
    }

    @Override
    public String keyWord_Second() {
        return "seconde";
    }

    @Override
    public String keyWord_Days() {
        return "jours";
    }

    @Override
    public String keyWord_Day() {
        return "jour";
    }

    @Override
    public String keyWord_Months() {
        return "mois";
    }

    @Override
    public String keyWord_Month() {
        return "moi";
    }

    @Override
    public String keyWord_Years() {
        return "années";
    }

    @Override
    public String keyWord_Year() {
        return "année";
    }
}
