package io.github.anass_abea.impl;

import io.github.anass_abea.enumClasses.UnitValue;
import io.github.anass_abea.interf.Unit;

public class UnitImpl implements Unit {
    private UnitValue value;

    public UnitImpl(long diff) {
        long absDiff = Math.abs(diff);
        for (UnitValue unitValue : UnitValue.values()) {
            if (unitValue.diffInDomain(absDiff)) {
                this.value = unitValue;

            }
        }
    }


    @Override
    public long getMsPerUnit() {
        return value.getValueInMilliSeconds();
    }

    @Override
    public long getMaxValue() {
        return value.getMaxVal();
    }

    @Override
    public UnitValue getUnitValue() {
        return this.value;
    }

    @Override
    public float getQuotient() {
        return value.getValueInMilliSeconds();
    }

    @Override
    public String toString() {
        return "UnitImpl{" +
                "value=" + value +", max="+value.getMaxVal()+", min="+value.getValueInSeconds()+
                '}';
    }
}
