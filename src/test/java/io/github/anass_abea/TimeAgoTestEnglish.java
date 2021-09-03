package io.github.anass_abea;

import io.github.anass_abea.interf.Language;
import io.github.anass_abea.lang.EnglishDefault;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class TimeAgoTestEnglish {
    Language values = new EnglishDefault();
    final static long NOW = new Date().getTime();
    final static long SECOND = 1000;
    final static long MINUTE = SECOND * 60;
    final static long HOUR = MINUTE * 60;
    final static long DAY = HOUR * 24;
    final static long MONTH = DAY * 30;
    final static long YEAR = MONTH * 12;


    final TimeAgo timeAgo = new TimeAgo(NOW).language(values);

    static TimeAgo generateTimeSingular(long unit) {
        return new TimeAgo(NOW - (unit));
    }

    static TimeAgo generateTimePlural(long unit) {
        return new TimeAgo(NOW - (3 * unit));
    }

    void testOnUnit(String expected, long unit, boolean isSingular) {
        if (!isSingular) {
            assertEquals("in 3 " + expected, timeAgo.timeUntil(NOW - (3 * unit)));
            assertEquals("3 " + expected + " ago", generateTimePlural(unit).timeUntil(NOW));
        } else {
            assertEquals("in 1 " + expected, timeAgo.timeUntil(NOW - (unit)));
            assertEquals("1 " + expected + " ago", generateTimeSingular(unit).timeUntil(NOW));
        }
    }

    @Test
    public void testNow() throws Exception {
        assertEquals(values.keyWord_Now(), timeAgo.timeUntil(NOW));
    }

    @Test
    public void testSeconds() throws Exception {
        testOnUnit(values.keyWord_Seconds(), SECOND, false);
    }

    @Test
    public void testMinutes() throws Exception {
        testOnUnit(values.keyWord_Minutes(), MINUTE, false);
    }

    @Test
    public void testHours() throws Exception {
        testOnUnit(values.keyWord_Hours(), HOUR, false);
    }

    @Test
    public void testDays() throws Exception {
        testOnUnit(values.keyWord_Days(), DAY, false);
    }

    @Test
    public void testMonths() throws Exception {
        testOnUnit(values.keyWord_Months(), MONTH, false);
    }

    @Test
    public void testYears() throws Exception {
        testOnUnit(values.keyWord_Years(), YEAR, false);
    }

    @Test
    public void testSecond() throws Exception {
        testOnUnit(values.keyWord_Second(), SECOND, true);
    }

    @Test
    public void testMinute() throws Exception {
        testOnUnit(values.keyWord_Minute(), MINUTE, true);
    }

    @Test
    public void testHour() throws Exception {
        testOnUnit(values.keyWord_Hour(), HOUR, true);
    }

    @Test
    public void testDay() throws Exception {
        testOnUnit(values.keyWord_Day(), DAY, true);
    }

    @Test
    public void testMonth() throws Exception {
        testOnUnit(values.keyWord_Month(), MONTH, true);
    }

    @Test
    public void testYear() throws Exception {
        testOnUnit(values.keyWord_Year(), YEAR, true);
    }

    @Test
    public void testNull(){
        Date d = null;
        assertEquals(values.keyWord_Now(),new TimeAgo(d).timeUntil(new Date()));
        assertEquals(values.keyWord_Now(),new TimeAgo().timeUntil(d));
        assertEquals(values.keyWord_Now(),new TimeAgo(d).timeUntil(d));
    }
}
