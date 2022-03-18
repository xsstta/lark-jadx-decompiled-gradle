package com.bytedance.ee.bear.contract;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1174u;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13613a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p718t.C13748k;

/* renamed from: com.bytedance.ee.bear.contract.ai */
public class C5102ai implements AbstractC5238z {

    /* renamed from: a */
    private static C1177w<Boolean> f14803a = new C1177w<>();

    /* renamed from: b */
    private static C1177w<Boolean> f14804b = new C1177w<>();

    /* renamed from: c */
    private static C1177w<Boolean> f14805c = new C1177w<>();

    /* renamed from: d */
    private static C1177w<Boolean> f14806d = new C1177w<>();

    /* renamed from: com.bytedance.ee.bear.contract.ai$a */
    private static class C5104a {

        /* renamed from: a */
        public static final AbstractC5238z f14807a = new C5102ai();
    }

    /* renamed from: j */
    public static AbstractC5238z m20872j() {
        return C5104a.f14807a;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5238z
    /* renamed from: a */
    public LiveData<Boolean> mo20208a() {
        return f14803a;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5238z
    /* renamed from: c */
    public LiveData<Boolean> mo20211c() {
        return f14806d;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5238z
    /* renamed from: e */
    public LiveData<Boolean> mo20213e() {
        return f14804b;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5238z
    /* renamed from: g */
    public LiveData<Boolean> mo20215g() {
        return f14805c;
    }

    /* renamed from: i */
    public static boolean m20871i() {
        if (f14804b.mo5927b() == Boolean.TRUE) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5238z
    /* renamed from: f */
    public boolean mo20214f() {
        if (f14804b.mo5927b() == Boolean.TRUE) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5238z
    /* renamed from: h */
    public long mo20216h() {
        boolean f = mo20214f();
        Boolean bool = Boolean.TRUE;
        if (f) {
            return 0;
        }
        return 300000;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5238z
    /* renamed from: b */
    public LiveData<Boolean> mo20210b() {
        return C13613a.m55256b().mo50549a();
    }

    private C5102ai() {
        C13613a.m55255a(C13615c.f35773a);
        C1174u uVar = new C1174u();
        uVar.mo6042a(mo20208a(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.contract.$$Lambda$wQsDUZOJbWbeH2rZVx42VorIw5w */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C1174u.this.mo5926a((Boolean) obj);
            }
        });
        uVar.mo6042a(mo20213e(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.contract.$$Lambda$wQsDUZOJbWbeH2rZVx42VorIw5w */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C1174u.this.mo5926a((Boolean) obj);
            }
        });
        C13748k.m55732a(new Runnable(uVar) {
            /* class com.bytedance.ee.bear.contract.$$Lambda$ai$EU_yYwL0saiZgKeORndaQGwLAY */
            public final /* synthetic */ C1174u f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C5102ai.this.m20867a((C5102ai) this.f$1);
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5238z
    /* renamed from: d */
    public boolean mo20212d() {
        C13479a.m54764b("SdkVisibleServiceImpl", "appIsVisible()... isAppFront = " + f14803a.mo5927b());
        if (f14803a.mo5927b() == Boolean.TRUE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m20867a(C1174u uVar) {
        uVar.mo5925a((AbstractC1178x) new AbstractC1178x() {
            /* class com.bytedance.ee.bear.contract.$$Lambda$ai$6jaxQB9IzFtl2khE82FqTNsguA */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C5102ai.this.m20868a((C5102ai) ((Boolean) obj));
            }
        });
    }

    /* renamed from: b */
    public static void m20869b(boolean z) {
        f14803a.mo5926a(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public static void m20870c(boolean z) {
        f14804b.mo5926a(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m20868a(Boolean bool) {
        boolean z;
        C1177w<Boolean> wVar = f14805c;
        if (!mo20212d() || mo20214f()) {
            z = false;
        } else {
            z = true;
        }
        wVar.mo5926a(Boolean.valueOf(z));
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5238z
    /* renamed from: a */
    public void mo20209a(boolean z) {
        C13479a.m54764b("SdkVisibleServiceImpl", "setDocPageVisiable()... visiable = " + z);
        f14806d.mo5926a(Boolean.valueOf(z));
    }
}
