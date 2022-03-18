package org.apache.commons.lang3.time;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class FastDateFormat extends Format {
    private static final AbstractC69932b<FastDateFormat> cache = new AbstractC69932b<FastDateFormat>() {
        /* class org.apache.commons.lang3.time.FastDateFormat.C698951 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public FastDateFormat mo245676b(String str, TimeZone timeZone, Locale locale) {
            return new FastDateFormat(str, timeZone, locale);
        }
    };
    private static final long serialVersionUID = 2;
    private final FastDateParser parser;
    private final FastDatePrinter printer;

    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        return this.printer.format(date, stringBuffer);
    }

    public Locale getLocale() {
        return this.printer.getLocale();
    }

    public int getMaxLengthEstimate() {
        return this.printer.getMaxLengthEstimate();
    }

    public String getPattern() {
        return this.printer.getPattern();
    }

    public TimeZone getTimeZone() {
        return this.printer.getTimeZone();
    }

    public int hashCode() {
        return this.printer.hashCode();
    }

    public static FastDateFormat getInstance() {
        return cache.mo245727a();
    }

    public String toString() {
        return "FastDateFormat[" + this.printer.getPattern() + "," + this.printer.getLocale() + "," + this.printer.getTimeZone().getID() + "]";
    }

    public Date parse(String str) throws ParseException {
        return this.parser.parse(str);
    }

    public static FastDateFormat getDateInstance(int i) {
        return cache.mo245729a(i, (TimeZone) null, (Locale) null);
    }

    public static FastDateFormat getTimeInstance(int i) {
        return cache.mo245730b(i, (TimeZone) null, (Locale) null);
    }

    public static FastDateFormat getInstance(String str) {
        return cache.mo245731c(str, null, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDateFormat)) {
            return false;
        }
        return this.printer.equals(((FastDateFormat) obj).printer);
    }

    public String format(long j) {
        return this.printer.format(j);
    }

    public String format(Calendar calendar) {
        return this.printer.format(calendar);
    }

    public String format(Date date) {
        return this.printer.format(date);
    }

    /* access modifiers changed from: protected */
    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        return this.printer.applyRules(calendar, stringBuffer);
    }

    public <B extends Appendable> B format(long j, B b) {
        return (B) this.printer.format(j, b);
    }

    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.parser.parseObject(str, parsePosition);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2) {
        return cache.mo245728a(i, i2, (TimeZone) null, (Locale) null);
    }

    public <B extends Appendable> B format(Calendar calendar, B b) {
        return (B) this.printer.format(calendar, b);
    }

    public Date parse(String str, ParsePosition parsePosition) {
        return this.parser.parse(str, parsePosition);
    }

    public static FastDateFormat getDateInstance(int i, Locale locale) {
        return cache.mo245729a(i, (TimeZone) null, locale);
    }

    public static FastDateFormat getTimeInstance(int i, Locale locale) {
        return cache.mo245730b(i, (TimeZone) null, locale);
    }

    public <B extends Appendable> B format(Date date, B b) {
        return (B) this.printer.format(date, b);
    }

    public static FastDateFormat getDateInstance(int i, TimeZone timeZone) {
        return cache.mo245729a(i, timeZone, (Locale) null);
    }

    public static FastDateFormat getInstance(String str, Locale locale) {
        return cache.mo245731c(str, null, locale);
    }

    public static FastDateFormat getTimeInstance(int i, TimeZone timeZone) {
        return cache.mo245730b(i, timeZone, (Locale) null);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone) {
        return cache.mo245731c(str, timeZone, null);
    }

    public StringBuffer format(long j, StringBuffer stringBuffer) {
        return this.printer.format(j, stringBuffer);
    }

    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return this.printer.format(calendar, stringBuffer);
    }

    protected FastDateFormat(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, TimeZone timeZone) {
        return getDateTimeInstance(i, i2, timeZone, null);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, Locale locale) {
        return cache.mo245728a(i, i2, (TimeZone) null, locale);
    }

    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        return this.parser.parse(str, parsePosition, calendar);
    }

    public static FastDateFormat getDateInstance(int i, TimeZone timeZone, Locale locale) {
        return cache.mo245729a(i, timeZone, locale);
    }

    public static FastDateFormat getTimeInstance(int i, TimeZone timeZone, Locale locale) {
        return cache.mo245730b(i, timeZone, locale);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone, Locale locale) {
        return cache.mo245731c(str, timeZone, locale);
    }

    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.printer.format(obj));
        return stringBuffer;
    }

    protected FastDateFormat(String str, TimeZone timeZone, Locale locale, Date date) {
        this.printer = new FastDatePrinter(str, timeZone, locale);
        this.parser = new FastDateParser(str, timeZone, locale, date);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, TimeZone timeZone, Locale locale) {
        return cache.mo245728a(i, i2, timeZone, locale);
    }
}
