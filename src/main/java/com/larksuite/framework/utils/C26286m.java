package com.larksuite.framework.utils;

import android.text.TextUtils;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.framework.utils.m */
public class C26286m {

    /* renamed from: f */
    private static final ConcurrentMap<C26291e, C26286m> f64908f = new ConcurrentHashMap(7);

    /* renamed from: g */
    private static final ConcurrentMap<C26297k, String> f64909g = new ConcurrentHashMap(7);

    /* renamed from: a */
    private final String f64910a;

    /* renamed from: b */
    private final TimeZone f64911b;

    /* renamed from: c */
    private final Locale f64912c;

    /* renamed from: d */
    private transient AbstractC26294h[] f64913d;

    /* renamed from: e */
    private transient int f64914e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.framework.utils.m$c */
    public interface AbstractC26289c {
        /* renamed from: a */
        Calendar mo93416a(TimeZone timeZone, Locale locale);

        /* renamed from: a */
        void mo93417a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$f */
    public interface AbstractC26292f extends AbstractC26294h {
        /* renamed from: a */
        void mo93427a(Appendable appendable, int i) throws IOException;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$h */
    public interface AbstractC26294h {
        /* renamed from: a */
        int mo93425a();

        /* renamed from: a */
        void mo93426a(Appendable appendable, Calendar calendar) throws IOException;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$d */
    public static class C26290d implements AbstractC26294h {

        /* renamed from: a */
        static final C26290d f64917a = new C26290d(3);

        /* renamed from: b */
        static final C26290d f64918b = new C26290d(5);

        /* renamed from: c */
        static final C26290d f64919c = new C26290d(6);

        /* renamed from: d */
        final int f64920d;

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return this.f64920d;
        }

        C26290d(int i) {
            this.f64920d = i;
        }

        /* renamed from: a */
        static C26290d m95208a(int i) {
            if (i == 1) {
                return f64917a;
            }
            if (i == 2) {
                return f64918b;
            }
            if (i == 3) {
                return f64919c;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
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
            C26286m.m95193a(appendable, i2);
            int i3 = this.f64920d;
            if (i3 >= 5) {
                if (i3 == 6) {
                    appendable.append(':');
                }
                C26286m.m95193a(appendable, (i / CalendarSearchResultRv.f82652c) - (i2 * 60));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$g */
    public static class C26293g implements AbstractC26292f {

        /* renamed from: a */
        private final int f64923a;

        /* renamed from: b */
        private final int f64924b;

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return this.f64924b;
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26292f
        /* renamed from: a */
        public final void mo93427a(Appendable appendable, int i) throws IOException {
            C26286m.m95194a(appendable, i, this.f64924b);
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            mo93427a(appendable, calendar.get(this.f64923a));
        }

        C26293g(int i, int i2) {
            if (i2 >= 3) {
                this.f64923a = i;
                this.f64924b = i2;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$p */
    public static class C26302p implements AbstractC26292f {

        /* renamed from: a */
        static final C26302p f64940a = new C26302p();

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return 2;
        }

        C26302p() {
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26292f
        /* renamed from: a */
        public final void mo93427a(Appendable appendable, int i) throws IOException {
            C26286m.m95193a(appendable, i);
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            mo93427a(appendable, calendar.get(2) + 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$r */
    public static class C26304r implements AbstractC26292f {

        /* renamed from: a */
        static final C26304r f64942a = new C26304r();

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return 2;
        }

        C26304r() {
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26292f
        /* renamed from: a */
        public final void mo93427a(Appendable appendable, int i) throws IOException {
            C26286m.m95193a(appendable, i);
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            mo93427a(appendable, calendar.get(1) % 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$s */
    public static class C26305s implements AbstractC26292f {

        /* renamed from: a */
        static final C26305s f64943a = new C26305s();

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return 2;
        }

        C26305s() {
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26292f
        /* renamed from: a */
        public final void mo93427a(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else {
                C26286m.m95193a(appendable, i);
            }
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            mo93427a(appendable, calendar.get(2) + 1);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x017f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.larksuite.framework.utils.m$l] */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.larksuite.framework.utils.m$l] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [com.larksuite.framework.utils.m$i] */
    /* JADX WARN: Type inference failed for: r9v13, types: [com.larksuite.framework.utils.m$a] */
    /* JADX WARN: Type inference failed for: r9v15, types: [com.larksuite.framework.utils.m$f] */
    /* JADX WARN: Type inference failed for: r9v17, types: [com.larksuite.framework.utils.m$s] */
    /* JADX WARN: Type inference failed for: r9v18, types: [com.larksuite.framework.utils.m$p] */
    /* JADX WARN: Type inference failed for: r9v19, types: [com.larksuite.framework.utils.m$j] */
    /* JADX WARN: Type inference failed for: r9v20, types: [com.larksuite.framework.utils.m$j] */
    /* JADX WARN: Type inference failed for: r9v22, types: [com.larksuite.framework.utils.m$f] */
    /* JADX WARN: Type inference failed for: r9v23, types: [com.larksuite.framework.utils.m$j] */
    /* JADX WARN: Type inference failed for: r9v25, types: [com.larksuite.framework.utils.m$f] */
    /* JADX WARN: Type inference failed for: r9v26, types: [com.larksuite.framework.utils.m$n] */
    /* JADX WARN: Type inference failed for: r9v27, types: [com.larksuite.framework.utils.m$o] */
    /* JADX WARN: Type inference failed for: r9v29, types: [com.larksuite.framework.utils.m$f] */
    /* JADX WARN: Type inference failed for: r9v31, types: [com.larksuite.framework.utils.m$f] */
    /* JADX WARN: Type inference failed for: r9v32, types: [com.larksuite.framework.utils.m$b] */
    /* JADX WARN: Type inference failed for: r9v34, types: [com.larksuite.framework.utils.m$f] */
    /* JADX WARN: Type inference failed for: r9v36, types: [com.larksuite.framework.utils.m$f] */
    /* JADX WARN: Type inference failed for: r12v18, types: [com.larksuite.framework.utils.m$j] */
    /* JADX WARN: Type inference failed for: r9v41, types: [com.larksuite.framework.utils.m$f] */
    /* JADX WARN: Type inference failed for: r9v42, types: [com.larksuite.framework.utils.m$j] */
    /* JADX WARN: Type inference failed for: r9v45, types: [com.larksuite.framework.utils.m$f] */
    /* JADX WARN: Type inference failed for: r9v46, types: [com.larksuite.framework.utils.m$f] */
    /* JADX WARN: Type inference failed for: r9v47, types: [com.larksuite.framework.utils.m$d] */
    /* JADX WARN: Type inference failed for: r9v50, types: [com.larksuite.framework.utils.m$m] */
    /* JADX WARN: Type inference failed for: r9v51, types: [com.larksuite.framework.utils.m$d] */
    /* JADX WARN: Type inference failed for: r9v52, types: [com.larksuite.framework.utils.m$m] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.larksuite.framework.utils.C26286m.AbstractC26294h> mo93421a() {
        /*
        // Method dump skipped, instructions count: 468
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.C26286m.mo93421a():java.util.List");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo93420a(String str, int[] iArr) {
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

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC26292f mo93418a(int i, int i2) {
        if (i2 == 1) {
            return new C26306t(i);
        }
        if (i2 != 2) {
            return new C26293g(i, i2);
        }
        return new C26303q(i);
    }

    /* renamed from: a */
    public String mo93419a(long j, AbstractC26289c cVar) {
        Calendar a = cVar.mo93416a(this.f64911b, this.f64912c);
        m95195a(a, j);
        String a2 = m95191a(a);
        cVar.mo93417a();
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$b */
    public static class C26288b implements AbstractC26292f {

        /* renamed from: a */
        private final AbstractC26292f f64916a;

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return this.f64916a.mo93425a();
        }

        C26288b(AbstractC26292f fVar) {
            this.f64916a = fVar;
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26292f
        /* renamed from: a */
        public void mo93427a(Appendable appendable, int i) throws IOException {
            this.f64916a.mo93427a(appendable, i);
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            int i = 7;
            int i2 = calendar.get(7);
            AbstractC26292f fVar = this.f64916a;
            if (i2 != 1) {
                i = i2 - 1;
            }
            fVar.mo93427a(appendable, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$i */
    public static class C26295i implements AbstractC26294h {

        /* renamed from: a */
        private final String f64925a;

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return this.f64925a.length();
        }

        C26295i(String str) {
            this.f64925a = str;
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f64925a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$n */
    public static class C26300n implements AbstractC26292f {

        /* renamed from: a */
        private final AbstractC26292f f64938a;

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return this.f64938a.mo93425a();
        }

        C26300n(AbstractC26292f fVar) {
            this.f64938a = fVar;
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26292f
        /* renamed from: a */
        public void mo93427a(Appendable appendable, int i) throws IOException {
            this.f64938a.mo93427a(appendable, i);
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(10);
            if (i == 0) {
                i = calendar.getLeastMaximum(10) + 1;
            }
            this.f64938a.mo93427a(appendable, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$o */
    public static class C26301o implements AbstractC26292f {

        /* renamed from: a */
        private final AbstractC26292f f64939a;

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return this.f64939a.mo93425a();
        }

        C26301o(AbstractC26292f fVar) {
            this.f64939a = fVar;
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26292f
        /* renamed from: a */
        public void mo93427a(Appendable appendable, int i) throws IOException {
            this.f64939a.mo93427a(appendable, i);
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(11);
            if (i == 0) {
                i = calendar.getMaximum(11) + 1;
            }
            this.f64939a.mo93427a(appendable, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$u */
    public static class C26307u implements AbstractC26292f {

        /* renamed from: a */
        private final AbstractC26292f f64945a;

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return this.f64945a.mo93425a();
        }

        C26307u(AbstractC26292f fVar) {
            this.f64945a = fVar;
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26292f
        /* renamed from: a */
        public void mo93427a(Appendable appendable, int i) throws IOException {
            this.f64945a.mo93427a(appendable, i);
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            throw new UnsupportedOperationException("getWeekYear not support");
        }
    }

    /* renamed from: com.larksuite.framework.utils.m$e */
    public static class C26291e {

        /* renamed from: a */
        private final Object[] f64921a;

        /* renamed from: b */
        private int f64922b;

        public int hashCode() {
            if (this.f64922b == 0) {
                Object[] objArr = this.f64921a;
                int i = 0;
                for (Object obj : objArr) {
                    if (obj != null) {
                        i = (i * 7) + obj.hashCode();
                    }
                }
                this.f64922b = i;
            }
            return this.f64922b;
        }

        C26291e(Object... objArr) {
            this.f64921a = objArr;
        }

        /* renamed from: a */
        public boolean mo93428a(Object[] objArr) {
            return Arrays.equals(this.f64921a, objArr);
        }

        public boolean equals(Object obj) {
            return Arrays.equals(this.f64921a, ((C26291e) obj).f64921a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$j */
    public static class C26296j implements AbstractC26294h {

        /* renamed from: a */
        private final int f64926a;

        /* renamed from: b */
        private final String[] f64927b;

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            int length = this.f64927b.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.f64927b[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }

        C26296j(int i, String[] strArr) {
            this.f64926a = i;
            this.f64927b = strArr;
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f64927b[calendar.get(this.f64926a)]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$k */
    public static class C26297k {

        /* renamed from: a */
        private final TimeZone f64928a;

        /* renamed from: b */
        private final int f64929b;

        /* renamed from: c */
        private final Locale f64930c;

        public int hashCode() {
            return (((this.f64929b * 31) + this.f64930c.hashCode()) * 31) + this.f64928a.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26297k)) {
                return false;
            }
            C26297k kVar = (C26297k) obj;
            if (!this.f64928a.equals(kVar.f64928a) || this.f64929b != kVar.f64929b || !this.f64930c.equals(kVar.f64930c)) {
                return false;
            }
            return true;
        }

        C26297k(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.f64928a = timeZone;
            if (z) {
                this.f64929b = Integer.MIN_VALUE | i;
            } else {
                this.f64929b = i;
            }
            this.f64930c = locale;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$l */
    public static class C26298l implements AbstractC26294h {

        /* renamed from: a */
        private final Locale f64931a;

        /* renamed from: b */
        private final int f64932b;

        /* renamed from: c */
        private final String f64933c;

        /* renamed from: d */
        private final String f64934d;

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return Math.max(this.f64933c.length(), this.f64934d.length());
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            TimeZone timeZone = calendar.getTimeZone();
            if (calendar.get(16) == 0) {
                appendable.append(C26286m.m95192a(timeZone, false, this.f64932b, this.f64931a));
            } else {
                appendable.append(C26286m.m95192a(timeZone, true, this.f64932b, this.f64931a));
            }
        }

        C26298l(TimeZone timeZone, Locale locale, int i) {
            this.f64931a = locale;
            this.f64932b = i;
            this.f64933c = C26286m.m95192a(timeZone, false, i, locale);
            this.f64934d = C26286m.m95192a(timeZone, true, i, locale);
        }
    }

    public int hashCode() {
        return this.f64910a.hashCode() + ((this.f64911b.hashCode() + (this.f64912c.hashCode() * 13)) * 13);
    }

    /* renamed from: b */
    private void m95196b() {
        int i = 0;
        AbstractC26294h[] hVarArr = (AbstractC26294h[]) mo93421a().toArray(new AbstractC26294h[0]);
        this.f64913d = hVarArr;
        int length = hVarArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                i += this.f64913d[length].mo93425a();
            } else {
                this.f64914e = i;
                return;
            }
        }
    }

    public String toString() {
        return "FastDatePrinter[" + this.f64910a + "," + this.f64912c + "," + this.f64911b.getID() + "]";
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$a */
    public static class C26287a implements AbstractC26294h {

        /* renamed from: a */
        private final char f64915a;

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return 1;
        }

        C26287a(char c) {
            this.f64915a = c;
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f64915a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$m */
    public static class C26299m implements AbstractC26294h {

        /* renamed from: a */
        static final C26299m f64935a = new C26299m(true);

        /* renamed from: b */
        static final C26299m f64936b = new C26299m(false);

        /* renamed from: c */
        final boolean f64937c;

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return 5;
        }

        C26299m(boolean z) {
            this.f64937c = z;
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(15) + calendar.get(16);
            if (i < 0) {
                appendable.append('-');
                i = -i;
            } else {
                appendable.append('+');
            }
            int i2 = i / 3600000;
            C26286m.m95193a(appendable, i2);
            if (this.f64937c) {
                appendable.append(':');
            }
            C26286m.m95193a(appendable, (i / CalendarSearchResultRv.f82652c) - (i2 * 60));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$q */
    public static class C26303q implements AbstractC26292f {

        /* renamed from: a */
        private final int f64941a;

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return 2;
        }

        C26303q(int i) {
            this.f64941a = i;
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26292f
        /* renamed from: a */
        public final void mo93427a(Appendable appendable, int i) throws IOException {
            if (i < 100) {
                C26286m.m95193a(appendable, i);
            } else {
                C26286m.m95194a(appendable, i, 2);
            }
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            mo93427a(appendable, calendar.get(this.f64941a));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.m$t */
    public static class C26306t implements AbstractC26292f {

        /* renamed from: a */
        private final int f64944a;

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public int mo93425a() {
            return 4;
        }

        C26306t(int i) {
            this.f64944a = i;
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26294h
        /* renamed from: a */
        public void mo93426a(Appendable appendable, Calendar calendar) throws IOException {
            mo93427a(appendable, calendar.get(this.f64944a));
        }

        @Override // com.larksuite.framework.utils.C26286m.AbstractC26292f
        /* renamed from: a */
        public final void mo93427a(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else if (i < 100) {
                C26286m.m95193a(appendable, i);
            } else {
                C26286m.m95194a(appendable, i, 1);
            }
        }
    }

    /* renamed from: a */
    private String m95191a(Calendar calendar) {
        return ((StringBuilder) m95190a(calendar, new StringBuilder(this.f64914e))).toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C26286m)) {
            return false;
        }
        C26286m mVar = (C26286m) obj;
        if (!this.f64910a.equals(mVar.f64910a) || !this.f64911b.equals(mVar.f64911b) || !this.f64912c.equals(mVar.f64912c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private <B extends Appendable> B m95190a(Calendar calendar, B b) {
        try {
            for (AbstractC26294h hVar : this.f64913d) {
                hVar.mo93426a(b, calendar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return b;
    }

    /* renamed from: a */
    public static void m95193a(Appendable appendable, int i) throws IOException {
        appendable.append((char) ((i / 10) + 48));
        appendable.append((char) ((i % 10) + 48));
    }

    /* renamed from: a */
    private static void m95195a(Calendar calendar, long j) {
        calendar.add(14, (int) (j - calendar.getTimeInMillis()));
        if (calendar.getTimeInMillis() != j) {
            calendar.setTimeInMillis(j);
        }
    }

    protected C26286m(String str, TimeZone timeZone, Locale locale) {
        this.f64910a = str;
        this.f64911b = timeZone;
        this.f64912c = locale;
        m95196b();
    }

    /* renamed from: a */
    public static C26286m m95189a(String str, TimeZone timeZone, Locale locale) {
        if (!TextUtils.isEmpty(str)) {
            if (timeZone == null) {
                timeZone = TimeZone.getDefault();
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            C26291e eVar = new C26291e(str, timeZone, locale);
            ConcurrentMap<C26291e, C26286m> concurrentMap = f64908f;
            C26286m mVar = concurrentMap.get(eVar);
            if (mVar != null) {
                return mVar;
            }
            C26286m mVar2 = new C26286m(str, timeZone, locale);
            C26286m putIfAbsent = concurrentMap.putIfAbsent(eVar, mVar2);
            return putIfAbsent != null ? putIfAbsent : mVar2;
        }
        throw new IllegalArgumentException("date pattern must not be null");
    }

    /* renamed from: a */
    public static void m95194a(Appendable appendable, int i, int i2) throws IOException {
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

    /* renamed from: a */
    public static String m95192a(TimeZone timeZone, boolean z, int i, Locale locale) {
        C26297k kVar = new C26297k(timeZone, z, i, locale);
        ConcurrentMap<C26297k, String> concurrentMap = f64909g;
        String str = concurrentMap.get(kVar);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i, locale);
        String putIfAbsent = concurrentMap.putIfAbsent(kVar, displayName);
        return putIfAbsent != null ? putIfAbsent : displayName;
    }
}
