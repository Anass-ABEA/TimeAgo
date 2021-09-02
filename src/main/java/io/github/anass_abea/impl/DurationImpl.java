package io.github.anass_abea.impl;

import io.github.anass_abea.interf.Duration;
import io.github.anass_abea.interf.Unit;

public class DurationImpl implements Duration {
    private final long diff;
    private final boolean isPast;
    private final Unit unit;
    private final long numberOfUnits;

    public DurationImpl(long diff, boolean isPast, Unit unit) {
        this.diff = diff;
        this.isPast = isPast;
        this.unit = unit;
        this.numberOfUnits = (long) (diff/unit.getQuotient());
    }

    public DurationImpl(long diff, Unit unit){
        this(Math.abs(diff),diff<=0,unit);
    }

    public DurationImpl(long diff){
        this(diff,new UnitImpl(diff));
    }

    @Override
    public long getDiff() {
        return diff;
    }

    @Override
    public boolean isPast() {
        return isPast;
    }

    @Override
    public Unit getUnit() {
        return unit;
    }

    @Override
    public long getNumberOfUnits() {
        return numberOfUnits;
    }
}
