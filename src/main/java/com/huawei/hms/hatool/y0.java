package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;

public abstract class y0 {
    /* renamed from: a */
    public final v0 mo83189a(int i, Context context) {
        String str;
        if (i != 0) {
            str = mo83195f();
            if (!TextUtils.isEmpty(str)) {
                return new v0(w0.UDID, str);
            }
        } else {
            str = "";
        }
        if ((i & 2) != 0) {
            str = mo83192b(context);
            if (!TextUtils.isEmpty(str)) {
                return new v0(w0.IMEI, str);
            }
        }
        if ((i & 1) == 0) {
            return new v0(w0.EMPTY, str);
        }
        return new v0(w0.SN, mo83193c(context));
    }

    /* renamed from: a */
    public v0 mo83190a(Context context) {
        v0 v0Var;
        String c = mo83187c();
        if (!TextUtils.isEmpty(c)) {
            return new v0(w0.UDID, c);
        }
        String a = mo83184a();
        if (!TextUtils.isEmpty(a)) {
            return new v0(w0.IMEI, a);
        }
        boolean e = mo83194e();
        String b = mo83186b();
        if (TextUtils.isEmpty(b)) {
            return e ? mo83189a(mo83188d(), context) : mo83191b(mo83188d(), context);
        }
        if (e) {
            w0 w0Var = w0.SN;
            return v0Var;
        }
        v0Var = new v0(w0.UDID, mo83185a(b));
        return v0Var;
    }

    /* renamed from: a */
    public abstract String mo83184a();

    /* renamed from: a */
    public abstract String mo83185a(String str);

    /* renamed from: b */
    public final v0 mo83191b(int i, Context context) {
        String str;
        if ((i & 4) != 0 && (i & 1) != 0) {
            return new v0(w0.UDID, mo83185a(mo83193c(context)));
        }
        if ((i & 1) != 0) {
            str = mo83193c(context);
            if (!TextUtils.isEmpty(str)) {
                return new v0(w0.SN, str);
            }
        } else {
            str = "";
        }
        if ((i & 2) == 0) {
            return new v0(w0.EMPTY, str);
        }
        return new v0(w0.IMEI, mo83192b(context));
    }

    /* renamed from: b */
    public abstract String mo83186b();

    /* renamed from: b */
    public final String mo83192b(Context context) {
        C23609l b = C23606i.m85750c().mo83025b();
        if (TextUtils.isEmpty(b.mo83108m())) {
            b.mo83099h(z0.m86002f(context));
        }
        return b.mo83108m();
    }

    /* renamed from: c */
    public abstract String mo83187c();

    /* renamed from: c */
    public final String mo83193c(Context context) {
        C23609l b = C23606i.m85750c().mo83025b();
        if (TextUtils.isEmpty(b.mo83083a())) {
            b.mo83107l(z0.m86004h(context));
        }
        return b.mo83083a();
    }

    /* renamed from: d */
    public abstract int mo83188d();

    /* renamed from: e */
    public final boolean mo83194e() {
        C23609l b = C23606i.m85750c().mo83025b();
        if (TextUtils.isEmpty(b.mo83100i())) {
            b.mo83093e(AbstractC23601f.m85692a());
        }
        return !TextUtils.isEmpty(b.mo83100i());
    }

    /* renamed from: f */
    public final String mo83195f() {
        C23609l b = C23606i.m85750c().mo83025b();
        if (TextUtils.isEmpty(b.mo83088c())) {
            b.mo83109m(z0.m86000c());
        }
        return b.mo83088c();
    }
}
