package com.bytedance.bdturing;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.bdturing.net.HttpClient;
import com.bytedance.bdturing.p205a.C3523a;
import com.bytedance.bdturing.p210f.AbstractC3544a;
import com.bytedance.bdturing.p210f.C3548c;
import com.bytedance.bdturing.twiceverify.C3582c;
import com.bytedance.bdturing.verify.RiskControlService;
import com.bytedance.bdturing.verify.request.AbstractRequest;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.bytedance.bdturing.a */
public class C3520a {

    /* renamed from: a */
    private BdTuringConfig f11137a;

    /* renamed from: b */
    private boolean f11138b;

    /* renamed from: c */
    private RiskControlService f11139c;

    /* renamed from: d */
    private final HashMap<String, AbstractC3544a> f11140d;

    /* renamed from: e */
    private long f11141e;

    /* renamed from: com.bytedance.bdturing.a$a */
    private static class C3522a {

        /* renamed from: a */
        public static C3520a f11144a = new C3520a();
    }

    /* renamed from: a */
    public static C3520a m14831a() {
        return C3522a.f11144a;
    }

    /* renamed from: c */
    public BdTuringConfig mo14275c() {
        return this.f11137a;
    }

    /* renamed from: d */
    public boolean mo14276d() {
        return this.f11138b;
    }

    private C3520a() {
        this.f11140d = new HashMap<>();
        this.f11141e = 0;
    }

    /* renamed from: b */
    public void mo14274b() {
        if (this.f11138b) {
            this.f11139c.mo14353a();
        }
    }

    /* renamed from: e */
    private boolean m14835e() {
        boolean z;
        if (System.currentTimeMillis() - this.f11141e < 500) {
            z = true;
        } else {
            z = false;
        }
        this.f11141e = System.currentTimeMillis();
        return z;
    }

    /* renamed from: f */
    private void m14836f() {
        RiskControlService bVar = new RiskControlService();
        this.f11139c = bVar;
        mo14273a(bVar);
        mo14273a(new C3548c());
        try {
            mo14273a((AbstractC3544a) Class.forName("com.bytedance.bdturing.verify.IdentityService").newInstance());
        } catch (ClassNotFoundException e) {
            LogUtil.m14894a(e);
        } catch (IllegalAccessException e2) {
            LogUtil.m14894a(e2);
        } catch (InstantiationException e3) {
            LogUtil.m14894a(e3);
        }
    }

    /* renamed from: b */
    private void m14834b(BdTuringConfig bdTuringConfig) {
        if (bdTuringConfig == null || bdTuringConfig.mo14224m() == null) {
            throw new RuntimeException("config or applicationContext is null");
        }
        if (bdTuringConfig.mo14231t() == null) {
            try {
                bdTuringConfig.mo14209a((HttpClient) Class.forName("com.bytedance.bdturing.ttnet.TTNetHttpClient").getConstructor(Context.class).newInstance(bdTuringConfig.mo14224m()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (bdTuringConfig.mo14231t() == null || bdTuringConfig.mo14230s() == null) {
            throw new RuntimeException("httpClient or eventClient is null");
        }
    }

    /* renamed from: a */
    public synchronized C3520a mo14271a(final BdTuringConfig bdTuringConfig) {
        if (this.f11138b) {
            return this;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f11137a = bdTuringConfig;
        m14834b(bdTuringConfig);
        C3567l.m15030a().mo14387b();
        C3567l.m15030a().mo14386a(new Runnable() {
            /* class com.bytedance.bdturing.C3520a.RunnableC35211 */

            public void run() {
                C3523a.m14844a(bdTuringConfig.mo14224m());
            }
        });
        m14836f();
        C3582c.m15126a().mo14433a(this.f11137a.mo14232u());
        this.f11138b = true;
        EventReport.m14808a(System.currentTimeMillis() - currentTimeMillis);
        return this;
    }

    /* renamed from: a */
    public void mo14273a(AbstractC3544a aVar) {
        if (!this.f11140d.containsKey(aVar.getClass().getName())) {
            this.f11140d.put(aVar.getClass().getName(), aVar);
        }
    }

    /* renamed from: a */
    public void mo14272a(Activity activity, AbstractRequest aVar, AbstractC3526b bVar) {
        if (m14832a(activity, aVar.mo14348f(), bVar) && !C3555i.m15002a().mo14363a(aVar.mo14348f())) {
            m14833b(activity, aVar, bVar);
        }
    }

    /* renamed from: a */
    private boolean m14832a(Activity activity, int i, AbstractC3526b bVar) {
        if (!this.f11138b || bVar == null || activity == null) {
            bVar.mo14293a(2, null);
            return false;
        } else if (m14835e()) {
            LogUtil.m14895a("BdTuring", "invoke multi times, u should take a breath");
            bVar.mo14293a(1000, null);
            return false;
        } else if (Build.VERSION.SDK_INT >= 17) {
            return true;
        } else {
            LogUtil.m14895a("BdTuring", "The Android system version is too low, Please upgrade the system.");
            bVar.mo14293a(999, null);
            EventReport.m14818d();
            return false;
        }
    }

    /* renamed from: b */
    private void m14833b(Activity activity, AbstractRequest aVar, AbstractC3526b bVar) {
        boolean z;
        LogUtil.m14895a("BdTuring", "BdTuring showVerifyDialog");
        aVar.mo14339a(activity);
        Iterator<AbstractC3544a> it = this.f11140d.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            AbstractC3544a next = it.next();
            if (next.mo14336a(aVar.mo14348f())) {
                next.mo14337a(aVar, bVar);
                z = true;
                break;
            }
        }
        if (!z) {
            bVar.mo14293a(996, null);
        }
    }
}
