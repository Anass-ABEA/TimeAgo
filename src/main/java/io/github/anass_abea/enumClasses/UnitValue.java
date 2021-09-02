package io.github.anass_abea.enumClasses;

public enum UnitValue {

    SECONDS(1, 60), MINUTES(60, 60), HOURS(3600, 24), DAYS(86400, 30), MONTHS(2592000, 12), YEARS(31104000, Long.MAX_VALUE);

    private final long maxVal;
    private final long inS;

    UnitValue(long inS, long maxVal) {
        this.maxVal = maxVal;
        this.inS = inS;
    }

    public long getMaxVal() {
        return maxVal;
    }

    public long getMaxValInMilliSeconds() {
        if (maxVal == Long.MAX_VALUE) return maxVal;
        return getMaxVal() * getValueInMilliSeconds();
    }

    public long getValueInSeconds() {
        return inS;
    }

    public long getValueInMilliSeconds() {
        return getValueInSeconds() * 1000;
    }

    public boolean diffInDomain(long diff) {
        return (diff < getMaxValInMilliSeconds() && diff >= getValueInMilliSeconds()) || (this.equals(SECONDS) && diff <= 1000);
    }

}
