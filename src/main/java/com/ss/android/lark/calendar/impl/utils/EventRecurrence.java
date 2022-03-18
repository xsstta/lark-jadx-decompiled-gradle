package com.ss.android.lark.calendar.impl.utils;

import android.text.TextUtils;
import android.text.format.Time;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.HashMap;

public class EventRecurrence {

    /* renamed from: C */
    private static HashMap<String, AbstractC32625o> f83689C;

    /* renamed from: a */
    public static final HashMap<String, Integer> f83690a;

    /* renamed from: b */
    public static final HashMap<String, Integer> f83691b;

    /* renamed from: c */
    public static String f83692c = "EventRecur";

    /* renamed from: A */
    public int[] f83693A;

    /* renamed from: B */
    public int f83694B;

    /* renamed from: d */
    public Time f83695d;

    /* renamed from: e */
    public int f83696e;

    /* renamed from: f */
    public String f83697f;

    /* renamed from: g */
    public int f83698g;

    /* renamed from: h */
    public int f83699h;

    /* renamed from: i */
    public int f83700i;

    /* renamed from: j */
    public int[] f83701j;

    /* renamed from: k */
    public int f83702k;

    /* renamed from: l */
    public int[] f83703l;

    /* renamed from: m */
    public int f83704m;

    /* renamed from: n */
    public int[] f83705n;

    /* renamed from: o */
    public int f83706o;

    /* renamed from: p */
    public int[] f83707p;

    /* renamed from: q */
    public int[] f83708q;

    /* renamed from: r */
    public int f83709r;

    /* renamed from: s */
    public int[] f83710s;

    /* renamed from: t */
    public int f83711t;

    /* renamed from: u */
    public int[] f83712u;

    /* renamed from: v */
    public int f83713v;

    /* renamed from: w */
    public int[] f83714w;

    /* renamed from: x */
    public int f83715x;

    /* renamed from: y */
    public int[] f83716y;

    /* renamed from: z */
    public int f83717z;

    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$a */
    private static class C32611a extends AbstractC32625o {
        private C32611a() {
        }

        @Override // com.ss.android.lark.calendar.impl.utils.EventRecurrence.AbstractC32625o
        /* renamed from: a */
        public int mo120272a(String str, EventRecurrence eventRecurrence) {
            int[] iArr;
            int[] iArr2;
            int i = 1;
            if (str.indexOf(",") < 0) {
                iArr2 = new int[1];
                iArr = new int[1];
                m125140a(str, iArr2, iArr, 0);
            } else {
                String[] split = str.split(",");
                i = split.length;
                iArr2 = new int[i];
                iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    m125140a(split[i2], iArr2, iArr, i2);
                }
            }
            eventRecurrence.f83707p = iArr2;
            eventRecurrence.f83708q = iArr;
            eventRecurrence.f83709r = i;
            return SmActions.ACTION_ONTHECALL_EXIT;
        }

        /* renamed from: a */
        private static void m125140a(String str, int[] iArr, int[] iArr2, int i) {
            String str2;
            int length = str.length() - 2;
            if (length > 0) {
                iArr2[i] = m125155a(str.substring(0, length), -53, 53, false);
                str2 = str.substring(length);
            } else {
                str2 = str;
            }
            Integer num = EventRecurrence.f83691b.get(str2);
            if (num != null) {
                iArr[i] = num.intValue();
                return;
            }
            throw new InvalidFormatException("Invalid BYDAY value: " + str);
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$b */
    private static class C32612b extends AbstractC32625o {
        private C32612b() {
        }

        @Override // com.ss.android.lark.calendar.impl.utils.EventRecurrence.AbstractC32625o
        /* renamed from: a */
        public int mo120272a(String str, EventRecurrence eventRecurrence) {
            int[] b = m125156b(str, 0, 23, true);
            eventRecurrence.f83705n = b;
            eventRecurrence.f83706o = b.length;
            return 64;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$c */
    private static class C32613c extends AbstractC32625o {
        private C32613c() {
        }

        @Override // com.ss.android.lark.calendar.impl.utils.EventRecurrence.AbstractC32625o
        /* renamed from: a */
        public int mo120272a(String str, EventRecurrence eventRecurrence) {
            int[] b = m125156b(str, 0, 59, true);
            eventRecurrence.f83703l = b;
            eventRecurrence.f83704m = b.length;
            return 32;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$d */
    private static class C32614d extends AbstractC32625o {
        private C32614d() {
        }

        @Override // com.ss.android.lark.calendar.impl.utils.EventRecurrence.AbstractC32625o
        /* renamed from: a */
        public int mo120272a(String str, EventRecurrence eventRecurrence) {
            int[] b = m125156b(str, 1, 12, false);
            eventRecurrence.f83716y = b;
            eventRecurrence.f83717z = b.length;
            return 2048;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$e */
    private static class C32615e extends AbstractC32625o {
        private C32615e() {
        }

        @Override // com.ss.android.lark.calendar.impl.utils.EventRecurrence.AbstractC32625o
        /* renamed from: a */
        public int mo120272a(String str, EventRecurrence eventRecurrence) {
            int[] b = m125156b(str, -31, 31, false);
            eventRecurrence.f83710s = b;
            eventRecurrence.f83711t = b.length;
            return DynamicModule.f58006b;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$f */
    private static class C32616f extends AbstractC32625o {
        private C32616f() {
        }

        @Override // com.ss.android.lark.calendar.impl.utils.EventRecurrence.AbstractC32625o
        /* renamed from: a */
        public int mo120272a(String str, EventRecurrence eventRecurrence) {
            int[] b = m125156b(str, 0, 59, true);
            eventRecurrence.f83701j = b;
            eventRecurrence.f83702k = b.length;
            return 16;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$g */
    private static class C32617g extends AbstractC32625o {
        private C32617g() {
        }

        @Override // com.ss.android.lark.calendar.impl.utils.EventRecurrence.AbstractC32625o
        /* renamed from: a */
        public int mo120272a(String str, EventRecurrence eventRecurrence) {
            int[] b = m125156b(str, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
            eventRecurrence.f83693A = b;
            eventRecurrence.f83694B = b.length;
            return 4096;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$h */
    private static class C32618h extends AbstractC32625o {
        private C32618h() {
        }

        @Override // com.ss.android.lark.calendar.impl.utils.EventRecurrence.AbstractC32625o
        /* renamed from: a */
        public int mo120272a(String str, EventRecurrence eventRecurrence) {
            int[] b = m125156b(str, -53, 53, false);
            eventRecurrence.f83714w = b;
            eventRecurrence.f83715x = b.length;
            return 1024;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$i */
    private static class C32619i extends AbstractC32625o {
        private C32619i() {
        }

        @Override // com.ss.android.lark.calendar.impl.utils.EventRecurrence.AbstractC32625o
        /* renamed from: a */
        public int mo120272a(String str, EventRecurrence eventRecurrence) {
            int[] b = m125156b(str, -366, 366, false);
            eventRecurrence.f83712u = b;
            eventRecurrence.f83713v = b.length;
            return MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$j */
    private static class C32620j extends AbstractC32625o {
        private C32620j() {
        }

        @Override // com.ss.android.lark.calendar.impl.utils.EventRecurrence.AbstractC32625o
        /* renamed from: a */
        public int mo120272a(String str, EventRecurrence eventRecurrence) {
            eventRecurrence.f83698g = m125155a(str, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
            if (eventRecurrence.f83698g >= 0) {
                return 4;
            }
            String str2 = EventRecurrence.f83692c;
            Log.m165379d(str2, "Invalid Count. Forcing COUNT to 1 from " + str);
            eventRecurrence.f83698g = 1;
            return 4;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$k */
    private static class C32621k extends AbstractC32625o {
        private C32621k() {
        }

        @Override // com.ss.android.lark.calendar.impl.utils.EventRecurrence.AbstractC32625o
        /* renamed from: a */
        public int mo120272a(String str, EventRecurrence eventRecurrence) {
            Integer num = EventRecurrence.f83690a.get(str);
            if (num != null) {
                eventRecurrence.f83696e = num.intValue();
                return 1;
            }
            throw new InvalidFormatException("Invalid FREQ value: " + str);
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$l */
    private static class C32622l extends AbstractC32625o {
        private C32622l() {
        }

        @Override // com.ss.android.lark.calendar.impl.utils.EventRecurrence.AbstractC32625o
        /* renamed from: a */
        public int mo120272a(String str, EventRecurrence eventRecurrence) {
            eventRecurrence.f83699h = m125155a(str, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
            if (eventRecurrence.f83699h >= 1) {
                return 8;
            }
            String str2 = EventRecurrence.f83692c;
            Log.m165379d(str2, "Invalid Interval. Forcing INTERVAL to 1 from " + str);
            eventRecurrence.f83699h = 1;
            return 8;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$m */
    private static class C32623m extends AbstractC32625o {
        private C32623m() {
        }

        @Override // com.ss.android.lark.calendar.impl.utils.EventRecurrence.AbstractC32625o
        /* renamed from: a */
        public int mo120272a(String str, EventRecurrence eventRecurrence) {
            eventRecurrence.f83697f = str;
            return 2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$n */
    private static class C32624n extends AbstractC32625o {
        private C32624n() {
        }

        @Override // com.ss.android.lark.calendar.impl.utils.EventRecurrence.AbstractC32625o
        /* renamed from: a */
        public int mo120272a(String str, EventRecurrence eventRecurrence) {
            Integer num = EventRecurrence.f83691b.get(str);
            if (num != null) {
                eventRecurrence.f83700i = num.intValue();
                return 8192;
            }
            throw new InvalidFormatException("Invalid WKST value: " + str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.utils.EventRecurrence$o */
    public static abstract class AbstractC32625o {
        /* renamed from: a */
        public abstract int mo120272a(String str, EventRecurrence eventRecurrence);

        AbstractC32625o() {
        }

        /* renamed from: b */
        public static int[] m125156b(String str, int i, int i2, boolean z) {
            if (str.indexOf(",") < 0) {
                return new int[]{m125155a(str, i, i2, z)};
            }
            String[] split = str.split(",");
            int length = split.length;
            int[] iArr = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = m125155a(split[i3], i, i2, z);
            }
            return iArr;
        }

        /* renamed from: a */
        public static int m125155a(String str, int i, int i2, boolean z) {
            try {
                if (str.charAt(0) == '+') {
                    str = str.substring(1);
                }
                int parseInt = Integer.parseInt(str);
                if (parseInt >= i && parseInt <= i2 && (parseInt != 0 || z)) {
                    return parseInt;
                }
                throw new InvalidFormatException("Integer value out of range: " + str);
            } catch (NumberFormatException unused) {
                throw new InvalidFormatException("Invalid integer value: " + str);
            }
        }
    }

    public int hashCode() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return mo120268c((String) null);
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        f83690a = hashMap;
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        f83691b = hashMap2;
        HashMap<String, AbstractC32625o> hashMap3 = new HashMap<>();
        f83689C = hashMap3;
        hashMap3.put("FREQ", new C32621k());
        f83689C.put("UNTIL", new C32623m());
        f83689C.put("COUNT", new C32620j());
        f83689C.put("INTERVAL", new C32622l());
        f83689C.put("BYSECOND", new C32616f());
        f83689C.put("BYMINUTE", new C32613c());
        f83689C.put("BYHOUR", new C32612b());
        f83689C.put("BYDAY", new C32611a());
        f83689C.put("BYMONTHDAY", new C32615e());
        f83689C.put("BYYEARDAY", new C32619i());
        f83689C.put("BYWEEKNO", new C32618h());
        f83689C.put("BYMONTH", new C32614d());
        f83689C.put("BYSETPOS", new C32617g());
        f83689C.put("WKST", new C32624n());
        hashMap.put("SECONDLY", 1);
        hashMap.put("MINUTELY", 2);
        hashMap.put("HOURLY", 3);
        hashMap.put("DAILY", 4);
        hashMap.put("WEEKLY", 5);
        hashMap.put("MONTHLY", 6);
        hashMap.put("YEARLY", 7);
        hashMap2.put("SU", 65536);
        hashMap2.put("MO", 131072);
        hashMap2.put("TU", 262144);
        hashMap2.put("WE", 524288);
        hashMap2.put("TH", 1048576);
        hashMap2.put("FR", 2097152);
        hashMap2.put("SA", 4194304);
    }

    /* renamed from: a */
    public void mo120267a() {
        this.f83697f = null;
        this.f83694B = 0;
        this.f83717z = 0;
        this.f83715x = 0;
        this.f83713v = 0;
        this.f83711t = 0;
        this.f83709r = 0;
        this.f83706o = 0;
        this.f83704m = 0;
        this.f83702k = 0;
        this.f83699h = 0;
        this.f83698g = 0;
        this.f83696e = 0;
    }

    public static class InvalidFormatException extends RuntimeException {
        private static final long serialVersionUID = -6734979874313418099L;

        public InvalidFormatException(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static EventRecurrence m125131a(String str) {
        try {
            return m125136b(str);
        } catch (Exception e) {
            String str2 = f83692c;
            Log.m165383e(str2, "Parse EventRecurrence Error:" + e.getMessage());
            return new EventRecurrence();
        }
    }

    /* renamed from: a */
    public static int m125130a(int i) {
        switch (i) {
            case 0:
                return 65536;
            case 1:
                return 131072;
            case 2:
                return 262144;
            case 3:
                return 524288;
            case 4:
                return 1048576;
            case 5:
                return 2097152;
            case 6:
                return 4194304;
            default:
                throw new RuntimeException("bad day of week: " + i);
        }
    }

    /* renamed from: b */
    public static int m125135b(int i) {
        if (i == 65536) {
            return 0;
        }
        if (i == 131072) {
            return 1;
        }
        if (i == 262144) {
            return 2;
        }
        if (i == 524288) {
            return 3;
        }
        if (i == 1048576) {
            return 4;
        }
        if (i == 2097152) {
            return 5;
        }
        if (i == 4194304) {
            return 6;
        }
        throw new RuntimeException("bad day of week: " + i);
    }

    /* renamed from: c */
    public static String m125137c(int i) {
        if (i == 65536) {
            return "SU";
        }
        if (i == 131072) {
            return "MO";
        }
        if (i == 262144) {
            return "TU";
        }
        if (i == 524288) {
            return "WE";
        }
        if (i == 1048576) {
            return "TH";
        }
        if (i == 2097152) {
            return "FR";
        }
        if (i == 4194304) {
            return "SA";
        }
        throw new IllegalArgumentException("bad day argument: " + i);
    }

    /* renamed from: b */
    public static EventRecurrence m125136b(String str) {
        EventRecurrence eventRecurrence = new EventRecurrence();
        if (TextUtils.isEmpty(str)) {
            return eventRecurrence;
        }
        eventRecurrence.mo120267a();
        String[] split = str.toUpperCase().split(";");
        int i = 0;
        for (String str2 : split) {
            if (!TextUtils.isEmpty(str2)) {
                int indexOf = str2.indexOf(61);
                if (indexOf > 0) {
                    String substring = str2.substring(0, indexOf);
                    String substring2 = str2.substring(indexOf + 1);
                    if (substring2.length() != 0) {
                        AbstractC32625o oVar = f83689C.get(substring);
                        if (oVar != null) {
                            int a = oVar.mo120272a(substring2, eventRecurrence);
                            if ((i & a) == 0) {
                                i |= a;
                            } else {
                                throw new InvalidFormatException("Part " + substring + " was specified twice");
                            }
                        } else if (!substring.startsWith("X-")) {
                            throw new InvalidFormatException("Couldn't find parser for " + substring);
                        }
                    } else {
                        throw new InvalidFormatException("Missing RHS in " + str2);
                    }
                } else {
                    throw new InvalidFormatException("Missing LHS in " + str2);
                }
            }
        }
        if ((i & 8192) == 0) {
            eventRecurrence.f83700i = 131072;
        }
        if ((i & 1) != 0) {
            if ((i & 6) == 6) {
                Log.m165397w(f83692c, "Warning: rrule has both UNTIL and COUNT: " + str);
            }
            return eventRecurrence;
        }
        throw new InvalidFormatException("Must specify a FREQ value");
    }

    /* renamed from: c */
    public String mo120268c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("FREQ=");
        switch (this.f83696e) {
            case 1:
                sb.append("SECONDLY");
                break;
            case 2:
                sb.append("MINUTELY");
                break;
            case 3:
                sb.append("HOURLY");
                break;
            case 4:
                sb.append("DAILY");
                break;
            case 5:
                sb.append("WEEKLY");
                break;
            case 6:
                sb.append("MONTHLY");
                break;
            case 7:
                sb.append("YEARLY");
                break;
        }
        if (!TextUtils.isEmpty(this.f83697f)) {
            sb.append(";UNTIL=");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            } else {
                sb.append(this.f83697f);
            }
        }
        if (this.f83698g != 0) {
            sb.append(";COUNT=");
            sb.append(this.f83698g);
        }
        if (this.f83699h != 0) {
            sb.append(";INTERVAL=");
            sb.append(this.f83699h);
        }
        if (this.f83700i != 0) {
            sb.append(";WKST=");
            sb.append(m125137c(this.f83700i));
        }
        m125133a(sb, ";BYSECOND=", this.f83702k, this.f83701j);
        m125133a(sb, ";BYMINUTE=", this.f83704m, this.f83703l);
        m125133a(sb, ";BYSECOND=", this.f83706o, this.f83705n);
        int i = this.f83709r;
        if (i > 0) {
            sb.append(";BYDAY=");
            int i2 = i - 1;
            for (int i3 = 0; i3 < i2; i3++) {
                m125132a(sb, i3);
                sb.append(",");
            }
            m125132a(sb, i2);
        }
        m125133a(sb, ";BYMONTHDAY=", this.f83711t, this.f83710s);
        m125133a(sb, ";BYYEARDAY=", this.f83713v, this.f83712u);
        m125133a(sb, ";BYWEEKNO=", this.f83715x, this.f83714w);
        m125133a(sb, ";BYMONTH=", this.f83717z, this.f83716y);
        m125133a(sb, ";BYSETPOS=", this.f83694B, this.f83693A);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventRecurrence)) {
            return false;
        }
        EventRecurrence eventRecurrence = (EventRecurrence) obj;
        Time time = this.f83695d;
        if (time != null ? Time.compare(time, eventRecurrence.f83695d) == 0 : eventRecurrence.f83695d == null) {
            if (this.f83696e != eventRecurrence.f83696e || ((str = this.f83697f) != null ? !str.equals(eventRecurrence.f83697f) : eventRecurrence.f83697f != null) || this.f83698g != eventRecurrence.f83698g || this.f83699h != eventRecurrence.f83699h || this.f83700i != eventRecurrence.f83700i || !m125134a(this.f83701j, this.f83702k, eventRecurrence.f83701j, eventRecurrence.f83702k) || !m125134a(this.f83703l, this.f83704m, eventRecurrence.f83703l, eventRecurrence.f83704m) || !m125134a(this.f83705n, this.f83706o, eventRecurrence.f83705n, eventRecurrence.f83706o) || !m125134a(this.f83707p, this.f83709r, eventRecurrence.f83707p, eventRecurrence.f83709r) || !m125134a(this.f83708q, this.f83709r, eventRecurrence.f83708q, eventRecurrence.f83709r) || !m125134a(this.f83710s, this.f83711t, eventRecurrence.f83710s, eventRecurrence.f83711t) || !m125134a(this.f83712u, this.f83713v, eventRecurrence.f83712u, eventRecurrence.f83713v) || !m125134a(this.f83714w, this.f83715x, eventRecurrence.f83714w, eventRecurrence.f83715x) || !m125134a(this.f83716y, this.f83717z, eventRecurrence.f83716y, eventRecurrence.f83717z) || !m125134a(this.f83693A, this.f83694B, eventRecurrence.f83693A, eventRecurrence.f83694B)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m125132a(StringBuilder sb, int i) {
        int i2 = this.f83708q[i];
        if (i2 != 0) {
            sb.append(i2);
        }
        sb.append(m125137c(this.f83707p[i]));
    }

    /* renamed from: a */
    private static void m125133a(StringBuilder sb, String str, int i, int[] iArr) {
        if (i > 0) {
            sb.append(str);
            int i2 = i - 1;
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(iArr[i3]);
                sb.append(",");
            }
            sb.append(iArr[i2]);
        }
    }

    /* renamed from: a */
    private static boolean m125134a(int[] iArr, int i, int[] iArr2, int i2) {
        if (i != i2) {
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] != iArr2[i3]) {
                return false;
            }
        }
        return true;
    }
}
