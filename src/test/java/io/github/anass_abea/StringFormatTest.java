package io.github.anass_abea;

import io.github.anass_abea.impl.DurationImpl;
import io.github.anass_abea.impl.StringFormatImpl;
import io.github.anass_abea.interf.Duration;
import io.github.anass_abea.interf.Language;
import io.github.anass_abea.interf.StringFormat;
import io.github.anass_abea.lang.EnglishDefault;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringFormatTest {
    static final Language language = new EnglishDefault();
    final StringFormat stringFormat = new StringFormatImpl(language);

    @Test
    public void testResult(){
        Duration duration = new DurationImpl(-3601000);
        assertEquals("1 hour ago",stringFormat.getResult(duration));
        duration = new DurationImpl(3601000);
        assertEquals("in 1 hour",stringFormat.getResult(duration));
    }
}
