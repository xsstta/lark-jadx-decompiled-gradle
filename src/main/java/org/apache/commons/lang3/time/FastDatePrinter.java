package org.apache.commons.lang3.time;

import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.lang3.exception.C69880b;

public class FastDatePrinter implements Serializable {
    private static final ConcurrentMap<C69920i, String> cTimeZoneDisplayCache = new ConcurrentHashMap(7);
    private static final long serialVersionUID = 1;
    private final Locale mLocale;
    private transient int mMaxLengthEstimate;
    private final String mPattern;
    private transient AbstractC69917f[] mRules;
    private final TimeZone mTimeZone;

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$d */
    public interface AbstractC69915d extends AbstractC69917f {
        /* renamed from: a */
        void mo245724a(Appendable appendable, int i) throws IOException;
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$f */
    public interface AbstractC69917f {
        /* renamed from: a */
        int mo245722a();

        /* renamed from: a */
        void mo245723a(Appendable appendable, Calendar calendar) throws IOException;
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$c */
    public static class C69914c implements AbstractC69917f {

        /* renamed from: a */
        static final C69914c f174772a = new C69914c(3);

        /* renamed from: b */
        static final C69914c f174773b = new C69914c(5);

        /* renamed from: c */
        static final C69914c f174774c = new C69914c(6);

        /* renamed from: d */
        final int f174775d;

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return this.f174775d;
        }

        C69914c(int i) {
            this.f174775d = i;
        }

        /* renamed from: a */
        static C69914c m268261a(int i) {
            if (i == 1) {
                return f174772a;
            }
            if (i == 2) {
                return f174773b;
            }
            if (i == 3) {
                return f174774c;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(15) + calendar.get(16);
            if (i == 0) {
                appendable.append("Z");
                return;
            }
            if (i < 0) {
                appendable.append('-');
                i = -i;
            } else {
                appendable.append('+');
            }
            int i2 = i / 3600000;
            FastDatePrinter.appendDigits(appendable, i2);
            int i3 = this.f174775d;
            if (i3 >= 5) {
                if (i3 == 6) {
                    appendable.append(':');
                }
                FastDatePrinter.appendDigits(appendable, (i / CalendarSearchResultRv.f82652c) - (i2 * 60));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$e */
    public static class C69916e implements AbstractC69915d {

        /* renamed from: a */
        private final int f174776a;

        /* renamed from: b */
        private final int f174777b;

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return this.f174777b;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69915d
        /* renamed from: a */
        public final void mo245724a(Appendable appendable, int i) throws IOException {
            FastDatePrinter.appendFullDigits(appendable, i, this.f174777b);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            mo245724a(appendable, calendar.get(this.f174776a));
        }

        C69916e(int i, int i2) {
            if (i2 >= 3) {
                this.f174776a = i;
                this.f174777b = i2;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$n */
    public static class C69925n implements AbstractC69915d {

        /* renamed from: a */
        static final C69925n f174793a = new C69925n();

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return 2;
        }

        C69925n() {
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69915d
        /* renamed from: a */
        public final void mo245724a(Appendable appendable, int i) throws IOException {
            FastDatePrinter.appendDigits(appendable, i);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            mo245724a(appendable, calendar.get(2) + 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$p */
    public static class C69927p implements AbstractC69915d {

        /* renamed from: a */
        static final C69927p f174795a = new C69927p();

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return 2;
        }

        C69927p() {
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69915d
        /* renamed from: a */
        public final void mo245724a(Appendable appendable, int i) throws IOException {
            FastDatePrinter.appendDigits(appendable, i);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            mo245724a(appendable, calendar.get(1) % 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$q */
    public static class C69928q implements AbstractC69915d {

        /* renamed from: a */
        static final C69928q f174796a = new C69928q();

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return 2;
        }

        C69928q() {
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69915d
        /* renamed from: a */
        public final void mo245724a(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else {
                FastDatePrinter.appendDigits(appendable, i);
            }
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            mo245724a(appendable, calendar.get(2) + 1);
        }
    }

    public Locale getLocale() {
        return this.mLocale;
    }

    public int getMaxLengthEstimate() {
        return this.mMaxLengthEstimate;
    }

    public String getPattern() {
        return this.mPattern;
    }

    public TimeZone getTimeZone() {
        return this.mTimeZone;
    }

    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (obj instanceof Date) {
            return format((Date) obj, stringBuffer);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj, stringBuffer);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue(), stringBuffer);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown class: ");
        sb.append(obj == null ? "<null>" : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        Calendar newCalendar = newCalendar();
        newCalendar.setTime(date);
        return (StringBuffer) applyRules(newCalendar, (Appendable) stringBuffer);
    }

    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return format(calendar.getTime(), stringBuffer);
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$b */
    public static class C69913b implements AbstractC69915d {

        /* renamed from: a */
        private final AbstractC69915d f174771a;

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return this.f174771a.mo245722a();
        }

        C69913b(AbstractC69915d dVar) {
            this.f174771a = dVar;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69915d
        /* renamed from: a */
        public void mo245724a(Appendable appendable, int i) throws IOException {
            this.f174771a.mo245724a(appendable, i);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            int i = 7;
            int i2 = calendar.get(7);
            AbstractC69915d dVar = this.f174771a;
            if (i2 != 1) {
                i = i2 - 1;
            }
            dVar.mo245724a(appendable, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$g */
    public static class C69918g implements AbstractC69917f {

        /* renamed from: a */
        private final String f174778a;

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return this.f174778a.length();
        }

        C69918g(String str) {
            this.f174778a = str;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f174778a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$l */
    public static class C69923l implements AbstractC69915d {

        /* renamed from: a */
        private final AbstractC69915d f174791a;

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return this.f174791a.mo245722a();
        }

        C69923l(AbstractC69915d dVar) {
            this.f174791a = dVar;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69915d
        /* renamed from: a */
        public void mo245724a(Appendable appendable, int i) throws IOException {
            this.f174791a.mo245724a(appendable, i);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(10);
            if (i == 0) {
                i = calendar.getLeastMaximum(10) + 1;
            }
            this.f174791a.mo245724a(appendable, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$m */
    public static class C69924m implements AbstractC69915d {

        /* renamed from: a */
        private final AbstractC69915d f174792a;

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return this.f174792a.mo245722a();
        }

        C69924m(AbstractC69915d dVar) {
            this.f174792a = dVar;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69915d
        /* renamed from: a */
        public void mo245724a(Appendable appendable, int i) throws IOException {
            this.f174792a.mo245724a(appendable, i);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(11);
            if (i == 0) {
                i = calendar.getMaximum(11) + 1;
            }
            this.f174792a.mo245724a(appendable, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$s */
    public static class C69930s implements AbstractC69915d {

        /* renamed from: a */
        private final AbstractC69915d f174798a;

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return this.f174798a.mo245722a();
        }

        C69930s(AbstractC69915d dVar) {
            this.f174798a = dVar;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69915d
        /* renamed from: a */
        public void mo245724a(Appendable appendable, int i) throws IOException {
            this.f174798a.mo245724a(appendable, i);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            this.f174798a.mo245724a(appendable, calendar.getWeekYear());
        }
    }

    private Calendar newCalendar() {
        return Calendar.getInstance(this.mTimeZone, this.mLocale);
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$h */
    public static class C69919h implements AbstractC69917f {

        /* renamed from: a */
        private final int f174779a;

        /* renamed from: b */
        private final String[] f174780b;

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            int length = this.f174780b.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.f174780b[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }

        C69919h(int i, String[] strArr) {
            this.f174779a = i;
            this.f174780b = strArr;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f174780b[calendar.get(this.f174779a)]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$i */
    public static class C69920i {

        /* renamed from: a */
        private final TimeZone f174781a;

        /* renamed from: b */
        private final int f174782b;

        /* renamed from: c */
        private final Locale f174783c;

        public int hashCode() {
            return (((this.f174782b * 31) + this.f174783c.hashCode()) * 31) + this.f174781a.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C69920i)) {
                return false;
            }
            C69920i iVar = (C69920i) obj;
            if (!this.f174781a.equals(iVar.f174781a) || this.f174782b != iVar.f174782b || !this.f174783c.equals(iVar.f174783c)) {
                return false;
            }
            return true;
        }

        C69920i(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.f174781a = timeZone;
            if (z) {
                this.f174782b = Integer.MIN_VALUE | i;
            } else {
                this.f174782b = i;
            }
            this.f174783c = locale;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$j */
    public static class C69921j implements AbstractC69917f {

        /* renamed from: a */
        private final Locale f174784a;

        /* renamed from: b */
        private final int f174785b;

        /* renamed from: c */
        private final String f174786c;

        /* renamed from: d */
        private final String f174787d;

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return Math.max(this.f174786c.length(), this.f174787d.length());
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            TimeZone timeZone = calendar.getTimeZone();
            if (calendar.get(16) != 0) {
                appendable.append(FastDatePrinter.getTimeZoneDisplay(timeZone, true, this.f174785b, this.f174784a));
            } else {
                appendable.append(FastDatePrinter.getTimeZoneDisplay(timeZone, false, this.f174785b, this.f174784a));
            }
        }

        C69921j(TimeZone timeZone, Locale locale, int i) {
            this.f174784a = locale;
            this.f174785b = i;
            this.f174786c = FastDatePrinter.getTimeZoneDisplay(timeZone, false, i, locale);
            this.f174787d = FastDatePrinter.getTimeZoneDisplay(timeZone, true, i, locale);
        }
    }

    public int hashCode() {
        return this.mPattern.hashCode() + ((this.mTimeZone.hashCode() + (this.mLocale.hashCode() * 13)) * 13);
    }

    private void init() {
        List<AbstractC69917f> parsePattern = parsePattern();
        AbstractC69917f[] fVarArr = (AbstractC69917f[]) parsePattern.toArray(new AbstractC69917f[parsePattern.size()]);
        this.mRules = fVarArr;
        int length = fVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length >= 0) {
                i += this.mRules[length].mo245722a();
            } else {
                this.mMaxLengthEstimate = i;
                return;
            }
        }
    }

    public String toString() {
        return "FastDatePrinter[" + this.mPattern + "," + this.mLocale + "," + this.mTimeZone.getID() + "]";
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x017f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [org.apache.commons.lang3.time.FastDatePrinter$j] */
    /* JADX WARN: Type inference failed for: r9v8, types: [org.apache.commons.lang3.time.FastDatePrinter$j] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.apache.commons.lang3.time.FastDatePrinter$g] */
    /* JADX WARN: Type inference failed for: r9v13, types: [org.apache.commons.lang3.time.FastDatePrinter$a] */
    /* JADX WARN: Type inference failed for: r9v15, types: [org.apache.commons.lang3.time.FastDatePrinter$d] */
    /* JADX WARN: Type inference failed for: r9v17, types: [org.apache.commons.lang3.time.FastDatePrinter$q] */
    /* JADX WARN: Type inference failed for: r9v18, types: [org.apache.commons.lang3.time.FastDatePrinter$n] */
    /* JADX WARN: Type inference failed for: r9v19, types: [org.apache.commons.lang3.time.FastDatePrinter$h] */
    /* JADX WARN: Type inference failed for: r9v20, types: [org.apache.commons.lang3.time.FastDatePrinter$h] */
    /* JADX WARN: Type inference failed for: r9v22, types: [org.apache.commons.lang3.time.FastDatePrinter$d] */
    /* JADX WARN: Type inference failed for: r9v23, types: [org.apache.commons.lang3.time.FastDatePrinter$h] */
    /* JADX WARN: Type inference failed for: r9v25, types: [org.apache.commons.lang3.time.FastDatePrinter$d] */
    /* JADX WARN: Type inference failed for: r9v26, types: [org.apache.commons.lang3.time.FastDatePrinter$l] */
    /* JADX WARN: Type inference failed for: r9v27, types: [org.apache.commons.lang3.time.FastDatePrinter$m] */
    /* JADX WARN: Type inference failed for: r9v29, types: [org.apache.commons.lang3.time.FastDatePrinter$d] */
    /* JADX WARN: Type inference failed for: r9v31, types: [org.apache.commons.lang3.time.FastDatePrinter$d] */
    /* JADX WARN: Type inference failed for: r9v32, types: [org.apache.commons.lang3.time.FastDatePrinter$b] */
    /* JADX WARN: Type inference failed for: r9v34, types: [org.apache.commons.lang3.time.FastDatePrinter$d] */
    /* JADX WARN: Type inference failed for: r9v36, types: [org.apache.commons.lang3.time.FastDatePrinter$d] */
    /* JADX WARN: Type inference failed for: r12v18, types: [org.apache.commons.lang3.time.FastDatePrinter$h] */
    /* JADX WARN: Type inference failed for: r9v41, types: [org.apache.commons.lang3.time.FastDatePrinter$d] */
    /* JADX WARN: Type inference failed for: r9v42, types: [org.apache.commons.lang3.time.FastDatePrinter$h] */
    /* JADX WARN: Type inference failed for: r9v45, types: [org.apache.commons.lang3.time.FastDatePrinter$d] */
    /* JADX WARN: Type inference failed for: r9v46, types: [org.apache.commons.lang3.time.FastDatePrinter$d] */
    /* JADX WARN: Type inference failed for: r9v47, types: [org.apache.commons.lang3.time.FastDatePrinter$c] */
    /* JADX WARN: Type inference failed for: r9v50, types: [org.apache.commons.lang3.time.FastDatePrinter$k] */
    /* JADX WARN: Type inference failed for: r9v51, types: [org.apache.commons.lang3.time.FastDatePrinter$c] */
    /* JADX WARN: Type inference failed for: r9v52, types: [org.apache.commons.lang3.time.FastDatePrinter$k] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f> parsePattern() {
        /*
        // Method dump skipped, instructions count: 468
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.FastDatePrinter.parsePattern():java.util.List");
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$a */
    public static class C69912a implements AbstractC69917f {

        /* renamed from: a */
        private final char f174770a;

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return 1;
        }

        C69912a(char c) {
            this.f174770a = c;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f174770a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$k */
    public static class C69922k implements AbstractC69917f {

        /* renamed from: a */
        static final C69922k f174788a = new C69922k(true);

        /* renamed from: b */
        static final C69922k f174789b = new C69922k(false);

        /* renamed from: c */
        final boolean f174790c;

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return 5;
        }

        C69922k(boolean z) {
            this.f174790c = z;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(15) + calendar.get(16);
            if (i < 0) {
                appendable.append('-');
                i = -i;
            } else {
                appendable.append('+');
            }
            int i2 = i / 3600000;
            FastDatePrinter.appendDigits(appendable, i2);
            if (this.f174790c) {
                appendable.append(':');
            }
            FastDatePrinter.appendDigits(appendable, (i / CalendarSearchResultRv.f82652c) - (i2 * 60));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$o */
    public static class C69926o implements AbstractC69915d {

        /* renamed from: a */
        private final int f174794a;

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return 2;
        }

        C69926o(int i) {
            this.f174794a = i;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69915d
        /* renamed from: a */
        public final void mo245724a(Appendable appendable, int i) throws IOException {
            if (i < 100) {
                FastDatePrinter.appendDigits(appendable, i);
            } else {
                FastDatePrinter.appendFullDigits(appendable, i, 2);
            }
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            mo245724a(appendable, calendar.get(this.f174794a));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$r */
    public static class C69929r implements AbstractC69915d {

        /* renamed from: a */
        private final int f174797a;

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public int mo245722a() {
            return 4;
        }

        C69929r(int i) {
            this.f174797a = i;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69917f
        /* renamed from: a */
        public void mo245723a(Appendable appendable, Calendar calendar) throws IOException {
            mo245724a(appendable, calendar.get(this.f174797a));
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.AbstractC69915d
        /* renamed from: a */
        public final void mo245724a(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else if (i < 100) {
                FastDatePrinter.appendDigits(appendable, i);
            } else {
                FastDatePrinter.appendFullDigits(appendable, i, 1);
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init();
    }

    private String applyRulesToString(Calendar calendar) {
        return ((StringBuilder) applyRules(calendar, new StringBuilder(this.mMaxLengthEstimate))).toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDatePrinter)) {
            return false;
        }
        FastDatePrinter fastDatePrinter = (FastDatePrinter) obj;
        if (!this.mPattern.equals(fastDatePrinter.mPattern) || !this.mTimeZone.equals(fastDatePrinter.mTimeZone) || !this.mLocale.equals(fastDatePrinter.mLocale)) {
            return false;
        }
        return true;
    }

    public String format(long j) {
        Calendar newCalendar = newCalendar();
        newCalendar.setTimeInMillis(j);
        return applyRulesToString(newCalendar);
    }

    /* access modifiers changed from: package-private */
    public String format(Object obj) {
        String str;
        if (obj instanceof Date) {
            return format((Date) obj);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown class: ");
        if (obj == null) {
            str = "<null>";
        } else {
            str = obj.getClass().getName();
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public String format(Calendar calendar) {
        return ((StringBuilder) format(calendar, new StringBuilder(this.mMaxLengthEstimate))).toString();
    }

    public String format(Date date) {
        Calendar newCalendar = newCalendar();
        newCalendar.setTime(date);
        return applyRulesToString(newCalendar);
    }

    /* access modifiers changed from: protected */
    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        return (StringBuffer) applyRules(calendar, (Appendable) stringBuffer);
    }

    public <B extends Appendable> B format(long j, B b) {
        Calendar newCalendar = newCalendar();
        newCalendar.setTimeInMillis(j);
        return (B) applyRules(newCalendar, b);
    }

    public static void appendDigits(Appendable appendable, int i) throws IOException {
        appendable.append((char) ((i / 10) + 48));
        appendable.append((char) ((i % 10) + 48));
    }

    private <B extends Appendable> B applyRules(Calendar calendar, B b) {
        try {
            for (AbstractC69917f fVar : this.mRules) {
                fVar.mo245723a(b, calendar);
            }
        } catch (IOException e) {
            C69880b.m268165b(e);
        }
        return b;
    }

    public <B extends Appendable> B format(Calendar calendar, B b) {
        if (!calendar.getTimeZone().equals(this.mTimeZone)) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.mTimeZone);
        }
        return (B) applyRules(calendar, b);
    }

    /* access modifiers changed from: protected */
    public AbstractC69915d selectNumberRule(int i, int i2) {
        if (i2 == 1) {
            return new C69929r(i);
        }
        if (i2 != 2) {
            return new C69916e(i, i2);
        }
        return new C69926o(i);
    }

    public <B extends Appendable> B format(Date date, B b) {
        Calendar newCalendar = newCalendar();
        newCalendar.setTime(date);
        return (B) applyRules(newCalendar, b);
    }

    /* access modifiers changed from: protected */
    public String parseToken(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != charAt) {
                    break;
                }
                sb.append(charAt);
                i = i2;
            }
        } else {
            sb.append('\'');
            boolean z = false;
            while (true) {
                if (i >= length) {
                    break;
                }
                char charAt2 = str.charAt(i);
                if (charAt2 == '\'') {
                    int i3 = i + 1;
                    if (i3 >= length || str.charAt(i3) != '\'') {
                        z = !z;
                    } else {
                        sb.append(charAt2);
                        i = i3;
                    }
                } else if (z || ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < 'a' || charAt2 > 'z'))) {
                    sb.append(charAt2);
                }
                i++;
            }
            i--;
        }
        iArr[0] = i;
        return sb.toString();
    }

    public StringBuffer format(long j, StringBuffer stringBuffer) {
        Calendar newCalendar = newCalendar();
        newCalendar.setTimeInMillis(j);
        return (StringBuffer) applyRules(newCalendar, (Appendable) stringBuffer);
    }

    protected FastDatePrinter(String str, TimeZone timeZone, Locale locale) {
        this.mPattern = str;
        this.mTimeZone = timeZone;
        this.mLocale = locale;
        init();
    }

    public static void appendFullDigits(Appendable appendable, int i, int i2) throws IOException {
        int i3;
        if (i < 10000) {
            if (i >= 1000) {
                i3 = 4;
            } else if (i >= 100) {
                i3 = 3;
            } else if (i < 10) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            for (int i4 = i2 - i3; i4 > 0; i4--) {
                appendable.append('0');
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            appendable.append((char) ((i / 1000) + 48));
                            i %= 1000;
                        } else {
                            return;
                        }
                    }
                    if (i >= 100) {
                        appendable.append((char) ((i / 100) + 48));
                        i %= 100;
                    } else {
                        appendable.append('0');
                    }
                }
                if (i >= 10) {
                    appendable.append((char) ((i / 10) + 48));
                    i %= 10;
                } else {
                    appendable.append('0');
                }
            }
            appendable.append((char) (i + 48));
            return;
        }
        char[] cArr = new char[10];
        int i5 = 0;
        while (i != 0) {
            cArr[i5] = (char) ((i % 10) + 48);
            i /= 10;
            i5++;
        }
        while (i5 < i2) {
            appendable.append('0');
            i2--;
        }
        while (true) {
            i5--;
            if (i5 >= 0) {
                appendable.append(cArr[i5]);
            } else {
                return;
            }
        }
    }

    static String getTimeZoneDisplay(TimeZone timeZone, boolean z, int i, Locale locale) {
        C69920i iVar = new C69920i(timeZone, z, i, locale);
        ConcurrentMap<C69920i, String> concurrentMap = cTimeZoneDisplayCache;
        String str = concurrentMap.get(iVar);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i, locale);
        String putIfAbsent = concurrentMap.putIfAbsent(iVar, displayName);
        return putIfAbsent != null ? putIfAbsent : displayName;
    }
}
