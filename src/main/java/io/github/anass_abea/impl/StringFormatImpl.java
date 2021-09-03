package io.github.anass_abea.impl;

import io.github.anass_abea.interf.Duration;
import io.github.anass_abea.interf.Language;
import io.github.anass_abea.interf.StringFormat;
import io.github.anass_abea.interf.Unit;

public class StringFormatImpl implements StringFormat {
    private final Language outputLanguage;

    public StringFormatImpl(Language outputLanguage) {
        this.outputLanguage = outputLanguage;
    }

    @Override
    public String getResult(Duration duration) {
        if (duration.getDiff()<1000) return outputLanguage.keyWord_Now();

        String res = "";
        long unitNumber = duration.getNumberOfUnits();
        res+=unitNumber+" "+getUnitFromString((unitNumber==1),duration.getUnit());

        if(duration.isPast()){
            return addKeyWordAgo(res);
        }
        return addKeyWordIn(res);
    }

    private String addKeyWordAgo(String res) {
        if (outputLanguage.keyWord_Ago_ShownAtBeginning()){
            return outputLanguage.keyWord_Ago()+ " "+res;
        }
        return res+" "+outputLanguage.keyWord_Ago();
    }

    private String addKeyWordIn(String res) {
        if (outputLanguage.keyWord_In_ShownAtBeginning()){
            return outputLanguage.keyWord_In()+ " "+res;
        }
        return res+" "+outputLanguage.keyWord_In();
    }

    private String getUnitFromString(boolean singular, Unit unit){
        if(singular){
            return getSingularUnitValue(unit);
        }else{
            return getPluralUnitValue(unit);
        }
    }

    private String getPluralUnitValue(Unit unit) {
        switch (unit.getUnitValue()) {
            case SECONDS : return  outputLanguage.keyWord_Seconds();
            case DAYS : return  outputLanguage.keyWord_Days();
            case YEARS : return  outputLanguage.keyWord_Years();
            case MINUTES : return  outputLanguage.keyWord_Minutes();
            case MONTHS : return  outputLanguage.keyWord_Months();
            default: return  outputLanguage.keyWord_Hours();
        }
    }

    private String getSingularUnitValue(Unit unit) {
        switch (unit.getUnitValue()) {
            case SECONDS : return  outputLanguage.keyWord_Second();
            case DAYS : return  outputLanguage.keyWord_Day();
            case YEARS : return  outputLanguage.keyWord_Year();
            case MINUTES : return  outputLanguage.keyWord_Minute();
            case MONTHS : return  outputLanguage.keyWord_Month();
            default:  return  outputLanguage.keyWord_Hour();
        }
    }


}
