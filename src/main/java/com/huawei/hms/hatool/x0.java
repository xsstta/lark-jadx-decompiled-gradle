package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.secure.android.common.p1021a.p1023b.C23806b;
import java.util.UUID;

public class x0 {

    /* renamed from: b */
    public static x0 f58347b;

    /* renamed from: a */
    public Context f58348a;

    /* renamed from: com.huawei.hms.hatool.x0$a */
    public static class C23624a extends y0 {

        /* renamed from: a */
        public String f58349a;

        /* renamed from: b */
        public String f58350b;

        public C23624a(String str, String str2) {
            this.f58349a = str;
            this.f58350b = str2;
        }

        @Override // com.huawei.hms.hatool.y0
        /* renamed from: a */
        public String mo83184a() {
            return AbstractC23594a.m85596d(this.f58349a, this.f58350b);
        }

        @Override // com.huawei.hms.hatool.y0
        /* renamed from: a */
        public String mo83185a(String str) {
            return C23806b.m87008a(str);
        }

        @Override // com.huawei.hms.hatool.y0
        /* renamed from: b */
        public String mo83186b() {
            return AbstractC23594a.m85599g(this.f58349a, this.f58350b);
        }

        @Override // com.huawei.hms.hatool.y0
        /* renamed from: c */
        public String mo83187c() {
            return AbstractC23594a.m85602j(this.f58349a, this.f58350b);
        }

        @Override // com.huawei.hms.hatool.y0
        /* renamed from: d */
        public int mo83188d() {
            int i = 0;
            int i2 = (AbstractC23594a.m85603k(this.f58349a, this.f58350b) ? 4 : 0) | 0;
            if (AbstractC23594a.m85597e(this.f58349a, this.f58350b)) {
                i = 2;
            }
            return i2 | i | (AbstractC23594a.m85600h(this.f58349a, this.f58350b) ? 1 : 0);
        }
    }

    /* renamed from: a */
    public static x0 m85956a() {
        x0 x0Var;
        synchronized (x0.class) {
            if (f58347b == null) {
                f58347b = new x0();
            }
            x0Var = f58347b;
        }
        return x0Var;
    }

    /* renamed from: a */
    public String mo83176a(String str, String str2) {
        return AbstractC23604g.m85714a(this.f58348a, str, str2);
    }

    /* renamed from: a */
    public String mo83177a(boolean z) {
        if (!z) {
            return "";
        }
        String j = AbstractC23596b.m85623j();
        if (TextUtils.isEmpty(j)) {
            j = g0.m85719a(this.f58348a, "global_v2", "uuid", "");
            if (TextUtils.isEmpty(j)) {
                j = UUID.randomUUID().toString().replace("-", "");
                g0.m85724b(this.f58348a, "global_v2", "uuid", j);
            }
            AbstractC23596b.m85616c(j);
        }
        return j;
    }

    /* renamed from: a */
    public void mo83178a(Context context) {
        if (this.f58348a == null) {
            this.f58348a = context;
        }
    }

    /* renamed from: b */
    public String mo83179b(String str, String str2) {
        return AbstractC23604g.m85715b(this.f58348a, str, str2);
    }

    /* renamed from: c */
    public v0 mo83180c(String str, String str2) {
        return new C23624a(str, str2).mo83190a(this.f58348a);
    }

    /* renamed from: d */
    public String mo83181d(String str, String str2) {
        return a1.m85610b(str, str2);
    }

    /* renamed from: e */
    public Pair<String, String> mo83182e(String str, String str2) {
        if (!AbstractC23594a.m85598f(str, str2)) {
            return new Pair<>("", "");
        }
        String n = C23606i.m85750c().mo83025b().mo83110n();
        String o = C23606i.m85750c().mo83025b().mo83111o();
        if (!TextUtils.isEmpty(n) && !TextUtils.isEmpty(o)) {
            return new Pair<>(n, o);
        }
        Pair<String, String> e = z0.m86001e(this.f58348a);
        C23606i.m85750c().mo83025b().mo83101i((String) e.first);
        C23606i.m85750c().mo83025b().mo83103j((String) e.second);
        return e;
    }

    /* renamed from: f */
    public String mo83183f(String str, String str2) {
        return a1.m85609a(str, str2);
    }
}
