package com.huawei.hms.hatool;

import android.util.Pair;
import com.huawei.secure.android.common.p1021a.p1023b.C23806b;
import java.util.List;
import java.util.Map;

public class b1 extends C23620v {

    /* renamed from: com.huawei.hms.hatool.b1$a */
    public static /* synthetic */ class C23597a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58179a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.huawei.hms.hatool.w0[] r0 = com.huawei.hms.hatool.w0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.huawei.hms.hatool.b1.C23597a.f58179a = r0
                com.huawei.hms.hatool.w0 r1 = com.huawei.hms.hatool.w0.SN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.huawei.hms.hatool.b1.C23597a.f58179a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.huawei.hms.hatool.w0 r1 = com.huawei.hms.hatool.w0.IMEI     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.huawei.hms.hatool.b1.C23597a.f58179a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.huawei.hms.hatool.w0 r1 = com.huawei.hms.hatool.w0.UDID     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.b1.C23597a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static c1 m85625a(String str, String str2) {
        c1 a = C23620v.m85931a(str, str2);
        v0 c = x0.m85956a().mo83180c(str, str2);
        a.mo82980g(x0.m85956a().mo83177a(AbstractC23598c.m85633c(str, str2)));
        a.mo82979f(AbstractC23598c.m85645o(str, str2));
        a.mo82976c(x0.m85956a().mo83183f(str, str2));
        int i = C23597a.f58179a[c.mo83165a().ordinal()];
        if (i == 1) {
            a.mo82977d(c.mo83166b());
        } else if (i == 2) {
            a.mo82975b(c.mo83166b());
        } else if (i == 3) {
            a.mo82978e(c.mo83166b());
        }
        return a;
    }

    /* renamed from: a */
    public static d1 m85626a(String str, String str2, String str3, String str4) {
        d1 a = C23620v.m85932a(str, str2, str3, str4);
        String a2 = x0.m85956a().mo83177a(AbstractC23598c.m85633c(str2, str3));
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = C23806b.m87008a(AbstractC23596b.m85615c() + a2 + currentTimeMillis);
        a.mo83132f(String.valueOf(currentTimeMillis));
        a.mo82989g(a3);
        return a;
    }

    /* renamed from: a */
    public static e1 m85627a(String str, String str2, String str3) {
        e1 a = C23620v.m85933a(str, str2, str3);
        Pair<String, String> e = x0.m85956a().mo83182e(str2, str);
        a.mo82992f((String) e.first);
        a.mo82993g((String) e.second);
        a.mo82994h(AbstractC23601f.m85696b());
        a.mo83139d(x0.m85956a().mo83181d(str2, str));
        return a;
    }

    /* renamed from: a */
    public static C23616r m85628a(List<C23615q> list, String str, String str2, String str3, String str4) {
        C23625y.m85977c("hmsSdk", "generate UploadData");
        C23616r a = C23620v.m85934a();
        if (a == null) {
            return null;
        }
        a.mo83152a(m85626a(C23622x.m85946f().mo83167a(), str, str2, str3));
        a.mo83151a(m85625a(str, str2));
        a.mo83153a(m85627a(str2, str, str4));
        a.mo83154a(AbstractC23598c.m85637g(str, str2));
        a.mo83155a(list);
        return a;
    }

    /* renamed from: b */
    public static Map<String, String> m85629b(String str, String str2, String str3) {
        Map<String, String> b = C23620v.m85935b(str, str3);
        Map<String, String> i = AbstractC23598c.m85639i(str, str2);
        if (i == null) {
            return b;
        }
        b.putAll(i);
        return b;
    }
}
