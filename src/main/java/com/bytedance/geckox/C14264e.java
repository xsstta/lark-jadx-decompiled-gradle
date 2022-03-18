package com.bytedance.geckox;

import android.content.Context;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.p774j.C14292c;
import com.bytedance.geckox.policy.loop.C14315b;
import com.bytedance.geckox.settings.C14322a;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.p780a.AbstractC14325b;
import com.bytedance.geckox.statistic.C14332c;
import com.bytedance.geckox.utils.C14362h;
import com.ss.android.ugc.aweme.framework.services.C60459e;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.e */
public class C14264e {

    /* renamed from: d */
    private static C14264e f37507d = null;

    /* renamed from: n */
    private static boolean f37508n = true;

    /* renamed from: a */
    public GeckoGlobalConfig f37509a;

    /* renamed from: b */
    public long f37510b;

    /* renamed from: c */
    public boolean f37511c = false;

    /* renamed from: e */
    private Map<String, String> f37512e = new ConcurrentHashMap();

    /* renamed from: f */
    private Map<String, String> f37513f = new ConcurrentHashMap();

    /* renamed from: g */
    private Map<String, List<String>> f37514g = new ConcurrentHashMap();

    /* renamed from: h */
    private Map<String, String> f37515h = new ConcurrentHashMap();

    /* renamed from: i */
    private Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> f37516i = new ConcurrentHashMap();

    /* renamed from: j */
    private Common f37517j;

    /* renamed from: k */
    private Context f37518k;

    /* renamed from: l */
    private C14322a f37519l;

    /* renamed from: m */
    private AtomicBoolean f37520m = new AtomicBoolean(false);

    /* renamed from: d */
    public boolean mo52229d() {
        return false;
    }

    /* renamed from: b */
    public Map<String, String> mo52225b() {
        return this.f37515h;
    }

    /* renamed from: c */
    public Map<String, String> mo52227c() {
        return this.f37513f;
    }

    /* renamed from: f */
    public Context mo52231f() {
        return this.f37518k;
    }

    /* renamed from: g */
    public boolean mo52232g() {
        return this.f37520m.get();
    }

    /* renamed from: h */
    public GeckoGlobalConfig mo52233h() {
        m57552k();
        return this.f37509a;
    }

    /* renamed from: a */
    public static C14264e m57551a() {
        if (f37507d == null) {
            synchronized (C14264e.class) {
                if (f37507d == null) {
                    f37507d = new C14264e();
                }
            }
        }
        return f37507d;
    }

    /* renamed from: l */
    private synchronized void m57553l() {
        if (this.f37519l == null) {
            this.f37519l = new C14322a(this.f37509a);
            mo52222a(new C14266a());
        }
    }

    /* renamed from: i */
    public GlobalConfigSettings mo52234i() {
        m57552k();
        if (this.f37509a == null) {
            return null;
        }
        m57553l();
        C14322a aVar = this.f37519l;
        if (aVar == null) {
            return null;
        }
        return aVar.mo52402a();
    }

    private C14264e() {
    }

    /* renamed from: k */
    private synchronized void m57552k() {
        AbstractC14270f fVar;
        if (!(mo52232g() || (fVar = (AbstractC14270f) C60459e.m234895a().mo206957a(AbstractC14270f.class)) == null || fVar.mo52244a() == null)) {
            mo52221a(fVar.mo52244a());
        }
    }

    /* renamed from: e */
    public Common mo52230e() {
        if (this.f37517j == null) {
            this.f37517j = new Common(this.f37509a.mo52036d(), this.f37509a.mo52037e(), this.f37509a.mo52040h(), this.f37509a.mo52041i());
        }
        return this.f37517j;
    }

    /* renamed from: j */
    public boolean mo52235j() {
        boolean z;
        m57552k();
        GlobalConfigSettings i = mo52234i();
        if (i == null || i.getReqMeta() == null) {
            C14276b.m57604a("gecko-debug-tag", "gecko update enable:", Boolean.valueOf(f37508n));
            return f37508n;
        }
        if (i.getReqMeta().getEnable() != 1 || !f37508n) {
            z = false;
        } else {
            z = true;
        }
        C14276b.m57604a("gecko-debug-tag", "gecko update enable:", Boolean.valueOf(z));
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.geckox.e$a */
    public class C14266a extends AbstractC14325b {
        private C14266a() {
        }
    }

    /* renamed from: a */
    public void mo52222a(AbstractC14325b bVar) {
        C14322a aVar = this.f37519l;
        if (aVar != null) {
            aVar.mo52403a(bVar);
        }
    }

    /* renamed from: a */
    public void mo52221a(GeckoGlobalConfig geckoGlobalConfig) {
        this.f37520m.set(true);
        this.f37509a = geckoGlobalConfig;
        Context a = geckoGlobalConfig.mo52033a();
        this.f37518k = a;
        C14362h.m57834a(a);
        C14315b.m57703a().mo52369a(this.f37509a);
        this.f37510b = System.currentTimeMillis();
        C14332c.m57733a(this.f37518k);
        C14292c.m57663a();
    }

    /* renamed from: a */
    public boolean mo52224a(boolean z) {
        boolean z2;
        GlobalConfigSettings i = mo52234i();
        if (i == null || i.getReqMeta() == null) {
            return z;
        }
        if (i.getReqMeta().getFreControlEnable() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo52226b(String str, String str2) {
        this.f37512e.put(str, str2);
    }

    /* renamed from: c */
    public void mo52228c(String str, String str2) {
        this.f37513f.put(str, str2);
    }

    /* renamed from: a */
    public void mo52223a(String str, String str2) {
        this.f37515h.put(str, str2);
        mo52228c(str, str2);
    }
}
