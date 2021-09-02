package io.github.anass_abea.interf;

public interface Duration {
    long getDiff();
    boolean isPast();
    Unit getUnit();
    long getNumberOfUnits();
}
