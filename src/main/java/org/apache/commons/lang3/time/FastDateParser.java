package org.apache.commons.lang3.time;

import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.maps.model.CameraPosition;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FastDateParser implements Serializable {
    private static final AbstractC69907f ABBREVIATED_YEAR_STRATEGY = new C69905d(1) {
        /* class org.apache.commons.lang3.time.FastDateParser.C698972 */

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.lang3.time.FastDateParser.C69905d
        /* renamed from: a */
        public int mo245692a(FastDateParser fastDateParser, int i) {
            if (i < 100) {
                return fastDateParser.adjustYear(i);
            }
            return i;
        }
    };
    private static final AbstractC69907f DAY_OF_MONTH_STRATEGY = new C69905d(5);
    private static final AbstractC69907f DAY_OF_WEEK_IN_MONTH_STRATEGY = new C69905d(8);
    private static final AbstractC69907f DAY_OF_WEEK_STRATEGY = new C69905d(7) {
        /* class org.apache.commons.lang3.time.FastDateParser.C698994 */

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.lang3.time.FastDateParser.C69905d
        /* renamed from: a */
        public int mo245692a(FastDateParser fastDateParser, int i) {
            if (i != 7) {
                return 1 + i;
            }
            return 1;
        }
    };
    private static final AbstractC69907f DAY_OF_YEAR_STRATEGY = new C69905d(6);
    private static final AbstractC69907f HOUR12_STRATEGY = new C69905d(10) {
        /* class org.apache.commons.lang3.time.FastDateParser.C699016 */

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.lang3.time.FastDateParser.C69905d
        /* renamed from: a */
        public int mo245692a(FastDateParser fastDateParser, int i) {
            if (i == 12) {
                return 0;
            }
            return i;
        }
    };
    private static final AbstractC69907f HOUR24_OF_DAY_STRATEGY = new C69905d(11) {
        /* class org.apache.commons.lang3.time.FastDateParser.C699005 */

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.lang3.time.FastDateParser.C69905d
        /* renamed from: a */
        public int mo245692a(FastDateParser fastDateParser, int i) {
            if (i == 24) {
                return 0;
            }
            return i;
        }
    };
    private static final AbstractC69907f HOUR_OF_DAY_STRATEGY = new C69905d(11);
    private static final AbstractC69907f HOUR_STRATEGY = new C69905d(10);
    static final Locale JAPANESE_IMPERIAL = new Locale("ja", "JP", "JP");
    private static final AbstractC69907f LITERAL_YEAR_STRATEGY = new C69905d(1);
    public static final Comparator<String> LONGER_FIRST_LOWERCASE = new Comparator<String>() {
        /* class org.apache.commons.lang3.time.FastDateParser.C698961 */

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str2.compareTo(str);
        }
    };
    private static final AbstractC69907f MILLISECOND_STRATEGY = new C69905d(14);
    private static final AbstractC69907f MINUTE_STRATEGY = new C69905d(12);
    private static final AbstractC69907f NUMBER_MONTH_STRATEGY = new C69905d(2) {
        /* class org.apache.commons.lang3.time.FastDateParser.C698983 */

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.lang3.time.FastDateParser.C69905d
        /* renamed from: a */
        public int mo245692a(FastDateParser fastDateParser, int i) {
            return i - 1;
        }
    };
    private static final AbstractC69907f SECOND_STRATEGY = new C69905d(13);
    private static final AbstractC69907f WEEK_OF_MONTH_STRATEGY = new C69905d(4);
    private static final AbstractC69907f WEEK_OF_YEAR_STRATEGY = new C69905d(3);
    private static final ConcurrentMap<Locale, AbstractC69907f>[] caches = new ConcurrentMap[17];
    private static final long serialVersionUID = 3;
    private final int century;
    private final Locale locale;
    public final String pattern;
    private transient List<C69908g> patterns;
    private final int startYear;
    private final TimeZone timeZone;

    public static boolean isFormatLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDateParser$f */
    public static abstract class AbstractC69907f {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo245694a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo245695a(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i);

        private AbstractC69907f() {
        }
    }

    public Locale getLocale() {
        return this.locale;
    }

    public String getPattern() {
        return this.pattern;
    }

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    /* renamed from: org.apache.commons.lang3.time.FastDateParser$e */
    private static abstract class AbstractC69906e extends AbstractC69907f {

        /* renamed from: a */
        private Pattern f174760a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo245693a(FastDateParser fastDateParser, Calendar calendar, String str);

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.lang3.time.FastDateParser.AbstractC69907f
        /* renamed from: a */
        public boolean mo245694a() {
            return false;
        }

        private AbstractC69906e() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo245696a(String str) {
            this.f174760a = Pattern.compile(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo245697a(StringBuilder sb) {
            mo245696a(sb.toString());
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.lang3.time.FastDateParser.AbstractC69907f
        /* renamed from: a */
        public boolean mo245695a(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            Matcher matcher = this.f174760a.matcher(str.substring(parsePosition.getIndex()));
            if (!matcher.lookingAt()) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return false;
            }
            parsePosition.setIndex(parsePosition.getIndex() + matcher.end(1));
            mo245693a(fastDateParser, calendar, matcher.group(1));
            return true;
        }
    }

    public int hashCode() {
        return this.pattern.hashCode() + ((this.timeZone.hashCode() + (this.locale.hashCode() * 13)) * 13);
    }

    public String toString() {
        return "FastDateParser[" + this.pattern + "," + this.locale + "," + this.timeZone.getID() + "]";
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDateParser$h */
    public class C69909h {

        /* renamed from: b */
        private final Calendar f174764b;

        /* renamed from: c */
        private int f174765c;

        /* renamed from: b */
        private C69908g m268253b() {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (this.f174765c < FastDateParser.this.pattern.length()) {
                char charAt = FastDateParser.this.pattern.charAt(this.f174765c);
                if (!z && FastDateParser.isFormatLetter(charAt)) {
                    break;
                }
                if (charAt == '\'') {
                    int i = this.f174765c + 1;
                    this.f174765c = i;
                    if (i == FastDateParser.this.pattern.length() || FastDateParser.this.pattern.charAt(this.f174765c) != '\'') {
                        z = !z;
                    }
                }
                this.f174765c++;
                sb.append(charAt);
            }
            if (!z) {
                String sb2 = sb.toString();
                return new C69908g(new C69903b(sb2), sb2.length());
            }
            throw new IllegalArgumentException("Unterminated quote");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C69908g mo245699a() {
            if (this.f174765c >= FastDateParser.this.pattern.length()) {
                return null;
            }
            char charAt = FastDateParser.this.pattern.charAt(this.f174765c);
            if (FastDateParser.isFormatLetter(charAt)) {
                return m268252a(charAt);
            }
            return m268253b();
        }

        /* renamed from: a */
        private C69908g m268252a(char c) {
            int i = this.f174765c;
            do {
                int i2 = this.f174765c + 1;
                this.f174765c = i2;
                if (i2 >= FastDateParser.this.pattern.length()) {
                    break;
                }
            } while (FastDateParser.this.pattern.charAt(this.f174765c) == c);
            int i3 = this.f174765c - i;
            return new C69908g(FastDateParser.this.getStrategy(c, i3, this.f174764b), i3);
        }

        C69909h(Calendar calendar) {
            this.f174764b = calendar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDateParser$b */
    public static class C69903b extends AbstractC69907f {

        /* renamed from: a */
        private final String f174755a;

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.lang3.time.FastDateParser.AbstractC69907f
        /* renamed from: a */
        public boolean mo245694a() {
            return false;
        }

        C69903b(String str) {
            super();
            this.f174755a = str;
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.lang3.time.FastDateParser.AbstractC69907f
        /* renamed from: a */
        public boolean mo245695a(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            for (int i2 = 0; i2 < this.f174755a.length(); i2++) {
                int index = parsePosition.getIndex() + i2;
                if (index == str.length()) {
                    parsePosition.setErrorIndex(index);
                    return false;
                } else if (this.f174755a.charAt(i2) != str.charAt(index)) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
            }
            parsePosition.setIndex(this.f174755a.length() + parsePosition.getIndex());
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDateParser$c */
    public static class C69904c extends AbstractC69906e {

        /* renamed from: a */
        public static final AbstractC69907f f174756a = new C69904c("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        /* renamed from: b */
        private static final AbstractC69907f f174757b = new C69904c("(Z|(?:[+-]\\d{2}))");

        /* renamed from: c */
        private static final AbstractC69907f f174758c = new C69904c("(Z|(?:[+-]\\d{2}\\d{2}))");

        C69904c(String str) {
            super();
            mo245696a(str);
        }

        /* renamed from: a */
        static AbstractC69907f m268239a(int i) {
            if (i == 1) {
                return f174757b;
            }
            if (i == 2) {
                return f174758c;
            }
            if (i == 3) {
                return f174756a;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.lang3.time.FastDateParser.AbstractC69906e
        /* renamed from: a */
        public void mo245693a(FastDateParser fastDateParser, Calendar calendar, String str) {
            calendar.setTimeZone(C69931a.m268302a(str));
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDateParser$d */
    private static class C69905d extends AbstractC69907f {

        /* renamed from: a */
        private final int f174759a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo245692a(FastDateParser fastDateParser, int i) {
            return i;
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.lang3.time.FastDateParser.AbstractC69907f
        /* renamed from: a */
        public boolean mo245694a() {
            return true;
        }

        C69905d(int i) {
            super();
            this.f174759a = i;
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.lang3.time.FastDateParser.AbstractC69907f
        /* renamed from: a */
        public boolean mo245695a(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            int index = parsePosition.getIndex();
            int length = str.length();
            if (i == 0) {
                while (index < length && Character.isWhitespace(str.charAt(index))) {
                    index++;
                }
                parsePosition.setIndex(index);
            } else {
                int i2 = i + index;
                if (length > i2) {
                    length = i2;
                }
            }
            while (index < length && Character.isDigit(str.charAt(index))) {
                index++;
            }
            if (parsePosition.getIndex() == index) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            int parseInt = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
            parsePosition.setIndex(index);
            calendar.set(this.f174759a, mo245692a(fastDateParser, parseInt));
            return true;
        }
    }

    public Object parseObject(String str) throws ParseException {
        return parse(str);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init(Calendar.getInstance(this.timeZone, this.locale));
    }

    public int adjustYear(int i) {
        int i2 = this.century + i;
        if (i >= this.startYear) {
            return i2;
        }
        return i2 + 100;
    }

    private static ConcurrentMap<Locale, AbstractC69907f> getCache(int i) {
        ConcurrentMap<Locale, AbstractC69907f> concurrentMap;
        ConcurrentMap<Locale, AbstractC69907f>[] concurrentMapArr = caches;
        synchronized (concurrentMapArr) {
            if (concurrentMapArr[i] == null) {
                concurrentMapArr[i] = new ConcurrentHashMap(3);
            }
            concurrentMap = concurrentMapArr[i];
        }
        return concurrentMap;
    }

    private void init(Calendar calendar) {
        this.patterns = new ArrayList();
        C69909h hVar = new C69909h(calendar);
        while (true) {
            C69908g a = hVar.mo245699a();
            if (a != null) {
                this.patterns.add(a);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDateParser$g */
    public static class C69908g {

        /* renamed from: a */
        final AbstractC69907f f174761a;

        /* renamed from: b */
        final int f174762b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo245698a(ListIterator<C69908g> listIterator) {
            if (!this.f174761a.mo245694a() || !listIterator.hasNext()) {
                return 0;
            }
            AbstractC69907f fVar = listIterator.next().f174761a;
            listIterator.previous();
            if (fVar.mo245694a()) {
                return this.f174762b;
            }
            return 0;
        }

        C69908g(AbstractC69907f fVar, int i) {
            this.f174761a = fVar;
            this.f174762b = i;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDateParser)) {
            return false;
        }
        FastDateParser fastDateParser = (FastDateParser) obj;
        if (!this.pattern.equals(fastDateParser.pattern) || !this.timeZone.equals(fastDateParser.timeZone) || !this.locale.equals(fastDateParser.locale)) {
            return false;
        }
        return true;
    }

    public Date parse(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = parse(str, parsePosition);
        if (parse != null) {
            return parse;
        }
        if (this.locale.equals(JAPANESE_IMPERIAL)) {
            throw new ParseException("(The " + this.locale + " locale does not support dates before 1868 AD)\n" + "Unparseable date: \"" + str, parsePosition.getErrorIndex());
        }
        throw new ParseException("Unparseable date: " + str, parsePosition.getErrorIndex());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.apache.commons.lang3.time.FastDateParser$i */
    public static class C69910i extends AbstractC69906e {

        /* renamed from: a */
        private final Locale f174766a;

        /* renamed from: b */
        private final Map<String, C69911a> f174767b = new HashMap();

        C69910i(Locale locale) {
            super();
            this.f174766a = locale;
            StringBuilder sb = new StringBuilder();
            sb.append("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
            TreeSet<String> treeSet = new TreeSet(FastDateParser.LONGER_FIRST_LOWERCASE);
            String[][] zoneStrings = DateFormatSymbols.getInstance(locale).getZoneStrings();
            for (String[] strArr : zoneStrings) {
                String str = strArr[0];
                if (!str.equalsIgnoreCase("GMT")) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    C69911a aVar = new C69911a(timeZone, false);
                    C69911a aVar2 = aVar;
                    for (int i = 1; i < strArr.length; i++) {
                        if (i == 3) {
                            aVar2 = new C69911a(timeZone, true);
                        } else if (i == 5) {
                            aVar2 = aVar;
                        }
                        if (strArr[i] != null) {
                            String lowerCase = strArr[i].toLowerCase(locale);
                            if (treeSet.add(lowerCase)) {
                                this.f174767b.put(lowerCase, aVar2);
                            }
                        }
                    }
                }
            }
            for (String str2 : treeSet) {
                sb.append('|');
                FastDateParser.simpleQuote(sb, str2);
            }
            sb.append(")");
            mo245697a(sb);
        }

        /* renamed from: org.apache.commons.lang3.time.FastDateParser$i$a */
        private static class C69911a {

            /* renamed from: a */
            TimeZone f174768a;

            /* renamed from: b */
            int f174769b;

            C69911a(TimeZone timeZone, boolean z) {
                int i;
                this.f174768a = timeZone;
                if (z) {
                    i = timeZone.getDSTSavings();
                } else {
                    i = 0;
                }
                this.f174769b = i;
            }
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.lang3.time.FastDateParser.AbstractC69906e
        /* renamed from: a */
        public void mo245693a(FastDateParser fastDateParser, Calendar calendar, String str) {
            TimeZone a = C69931a.m268302a(str);
            if (a != null) {
                calendar.setTimeZone(a);
                return;
            }
            C69911a aVar = this.f174767b.get(str.toLowerCase(this.f174766a));
            calendar.set(16, aVar.f174769b);
            calendar.set(15, aVar.f174768a.getRawOffset());
        }
    }

    public Object parseObject(String str, ParsePosition parsePosition) {
        return parse(str, parsePosition);
    }

    public Date parse(String str, ParsePosition parsePosition) {
        Calendar instance = Calendar.getInstance(this.timeZone, this.locale);
        instance.clear();
        if (parse(str, parsePosition, instance)) {
            return instance.getTime();
        }
        return null;
    }

    private AbstractC69907f getLocaleSpecificStrategy(int i, Calendar calendar) {
        ConcurrentMap<Locale, AbstractC69907f> cache = getCache(i);
        AbstractC69907f fVar = cache.get(this.locale);
        if (fVar == null) {
            if (i == 15) {
                fVar = new C69910i(this.locale);
            } else {
                fVar = new C69902a(i, calendar, this.locale);
            }
            AbstractC69907f putIfAbsent = cache.putIfAbsent(this.locale, fVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return fVar;
    }

    public static StringBuilder simpleQuote(StringBuilder sb, String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!(charAt == '$' || charAt == '.' || charAt == '?' || charAt == '^' || charAt == '[' || charAt == '\\' || charAt == '{' || charAt == '|')) {
                switch (charAt) {
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                        break;
                    default:
                        sb.append(charAt);
                }
            }
            sb.append('\\');
            sb.append(charAt);
        }
        return sb;
    }

    protected FastDateParser(String str, TimeZone timeZone2, Locale locale2) {
        this(str, timeZone2, locale2, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDateParser$a */
    public static class C69902a extends AbstractC69906e {

        /* renamed from: a */
        final Locale f174752a;

        /* renamed from: b */
        private final int f174753b;

        /* renamed from: c */
        private final Map<String, Integer> f174754c;

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.lang3.time.FastDateParser.AbstractC69906e
        /* renamed from: a */
        public void mo245693a(FastDateParser fastDateParser, Calendar calendar, String str) {
            calendar.set(this.f174753b, this.f174754c.get(str.toLowerCase(this.f174752a)).intValue());
        }

        C69902a(int i, Calendar calendar, Locale locale) {
            super();
            this.f174753b = i;
            this.f174752a = locale;
            StringBuilder sb = new StringBuilder();
            sb.append("((?iu)");
            this.f174754c = FastDateParser.appendDisplayNames(calendar, locale, i, sb);
            sb.setLength(sb.length() - 1);
            sb.append(")");
            mo245697a(sb);
        }
    }

    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        ListIterator<C69908g> listIterator = this.patterns.listIterator();
        while (listIterator.hasNext()) {
            C69908g next = listIterator.next();
            if (!next.f174761a.mo245695a(this, calendar, str, parsePosition, next.mo245698a(listIterator))) {
                return false;
            }
        }
        return true;
    }

    public AbstractC69907f getStrategy(char c, int i, Calendar calendar) {
        if (c != 'y') {
            if (c != 'z') {
                switch (c) {
                    case 'D':
                        return DAY_OF_YEAR_STRATEGY;
                    case 'E':
                        return getLocaleSpecificStrategy(7, calendar);
                    case 'F':
                        return DAY_OF_WEEK_IN_MONTH_STRATEGY;
                    case 'G':
                        return getLocaleSpecificStrategy(0, calendar);
                    case 'H':
                        return HOUR_OF_DAY_STRATEGY;
                    default:
                        switch (c) {
                            case 'K':
                                return HOUR_STRATEGY;
                            case 'M':
                                if (i >= 3) {
                                    return getLocaleSpecificStrategy(2, calendar);
                                }
                                return NUMBER_MONTH_STRATEGY;
                            case 'S':
                                return MILLISECOND_STRATEGY;
                            case 'a':
                                return getLocaleSpecificStrategy(9, calendar);
                            case 'd':
                                return DAY_OF_MONTH_STRATEGY;
                            case 'h':
                                return HOUR12_STRATEGY;
                            case ActivityIdentificationData.WALKING:
                                return HOUR24_OF_DAY_STRATEGY;
                            case SmEvents.EVENT_NR:
                                return MINUTE_STRATEGY;
                            case 's':
                                return SECOND_STRATEGY;
                            case 'u':
                                return DAY_OF_WEEK_STRATEGY;
                            case 'w':
                                return WEEK_OF_YEAR_STRATEGY;
                            default:
                                switch (c) {
                                    case 'W':
                                        return WEEK_OF_MONTH_STRATEGY;
                                    case 'X':
                                        return C69904c.m268239a(i);
                                    case 'Y':
                                        break;
                                    case CameraPosition.TILT_90:
                                        if (i == 2) {
                                            return C69904c.f174756a;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Format '" + c + "' not supported");
                                }
                        }
                }
            }
            return getLocaleSpecificStrategy(15, calendar);
        }
        if (i > 2) {
            return LITERAL_YEAR_STRATEGY;
        }
        return ABBREVIATED_YEAR_STRATEGY;
    }

    protected FastDateParser(String str, TimeZone timeZone2, Locale locale2, Date date) {
        int i;
        this.pattern = str;
        this.timeZone = timeZone2;
        this.locale = locale2;
        Calendar instance = Calendar.getInstance(timeZone2, locale2);
        if (date != null) {
            instance.setTime(date);
            i = instance.get(1);
        } else if (locale2.equals(JAPANESE_IMPERIAL)) {
            i = 0;
        } else {
            instance.setTime(new Date());
            i = instance.get(1) - 80;
        }
        int i2 = (i / 100) * 100;
        this.century = i2;
        this.startYear = i - i2;
        init(instance);
    }

    public static Map<String, Integer> appendDisplayNames(Calendar calendar, Locale locale2, int i, StringBuilder sb) {
        HashMap hashMap = new HashMap();
        Map<String, Integer> displayNames = calendar.getDisplayNames(i, 0, locale2);
        TreeSet treeSet = new TreeSet(LONGER_FIRST_LOWERCASE);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(locale2);
            if (treeSet.add(lowerCase)) {
                hashMap.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            simpleQuote(sb, (String) it.next()).append('|');
        }
        return hashMap;
    }
}
