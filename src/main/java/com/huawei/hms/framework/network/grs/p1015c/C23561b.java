package com.huawei.hms.framework.network.grs.p1015c;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;

/* renamed from: com.huawei.hms.framework.network.grs.c.b */
public class C23561b {

    /* renamed from: a */
    protected C23568e f58065a;

    /* renamed from: b */
    private String f58066b;

    /* renamed from: c */
    private AbstractC23559a f58067c;

    /* renamed from: d */
    private int f58068d;

    /* renamed from: e */
    private Context f58069e;

    /* renamed from: f */
    private String f58070f;

    /* renamed from: g */
    private GrsBaseInfo f58071g;

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.hms.framework.network.grs.c.b$a */
    public enum EnumC23562a {
        GRSPOST,
        GRSGET,
        GRSDEFAULT
    }

    public C23561b(String str, int i, AbstractC23559a aVar, Context context, String str2, GrsBaseInfo grsBaseInfo) {
        this.f58066b = str;
        this.f58067c = aVar;
        this.f58068d = i;
        this.f58069e = context;
        this.f58070f = str2;
        this.f58071g = grsBaseInfo;
    }

    /* renamed from: a */
    private String m85449a(String str) {
        return Uri.parse(str).getPath();
    }

    /* renamed from: g */
    private EnumC23562a m85450g() {
        if (this.f58066b.isEmpty()) {
            return EnumC23562a.GRSDEFAULT;
        }
        String a = m85449a(this.f58066b);
        return a.contains("1.0") ? EnumC23562a.GRSGET : a.contains("2.0") ? EnumC23562a.GRSPOST : EnumC23562a.GRSDEFAULT;
    }

    /* renamed from: a */
    public AbstractC23559a mo82873a() {
        return this.f58067c;
    }

    /* renamed from: b */
    public Context mo82874b() {
        return this.f58069e;
    }

    /* renamed from: c */
    public String mo82875c() {
        return this.f58066b;
    }

    /* renamed from: d */
    public int mo82876d() {
        return this.f58068d;
    }

    /* renamed from: e */
    public String mo82877e() {
        return this.f58070f;
    }

    /* renamed from: f */
    public Callable<C23568e> mo82878f() {
        if (EnumC23562a.GRSDEFAULT.equals(m85450g())) {
            return null;
        }
        return EnumC23562a.GRSGET.equals(m85450g()) ? new CallableC23571h(this.f58066b, this.f58068d, this.f58067c, this.f58069e, this.f58070f, this.f58071g) : new CallableC23572i(this.f58066b, this.f58068d, this.f58067c, this.f58069e, this.f58070f, this.f58071g);
    }
}
