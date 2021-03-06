package io.github.anass_abea;

import io.github.anass_abea.enumClasses.Languages;
import io.github.anass_abea.impl.DurationImpl;
import io.github.anass_abea.impl.StringFormatImpl;
import io.github.anass_abea.interf.Duration;
import io.github.anass_abea.interf.Language;
import io.github.anass_abea.interf.StringFormat;
import io.github.anass_abea.lang.EnglishDefault;

import java.time.Instant;
import java.util.Date;

public class TimeAgo {
    private Long fromDate;
    private Language language = new EnglishDefault();

    public TimeAgo language(Languages language){
        this.language = language.getLanguageClass();
        return this;
    }
    public TimeAgo language(Language language){
        this.language = language;
        return this;
    }

    public TimeAgo(Date from) {
       this(from !=null ? from.getTime(): new Date().getTime());
    }
    public TimeAgo(long from) {
       this.fromDate = from;
    }
    public TimeAgo(Instant instant){
        this(instant!=null? Date.from(instant) : new Date());
    }
    public TimeAgo(){
        this.fromDate = new Date().getTime();
    }

    public String timeUntil(long targetDate){
        Duration duration = new DurationImpl(fromDate-targetDate);
        StringFormat format = new StringFormatImpl(language);
        return format.getResult(duration);
    }
    public String timeUntil(Date targetDate){
        return timeUntil(targetDate!=null ? targetDate.getTime() : new Date().getTime());
    }
    public String timeUntil(Instant targetDate){
        return timeUntil(targetDate!=null ? Date.from(targetDate) : new Date());
    }
}
