package io.github.anass_abea.interf;

import io.github.anass_abea.enumClasses.UnitValue;

public interface Unit {
    long getMsPerUnit();
    long getMaxValue();
    UnitValue getUnitValue();

    float getQuotient();
}
