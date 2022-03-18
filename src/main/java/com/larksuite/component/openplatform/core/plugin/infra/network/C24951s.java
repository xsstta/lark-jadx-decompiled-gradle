package com.larksuite.component.openplatform.core.plugin.infra.network;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.p2069j.p2070a.C40646m;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.manager.C66420d;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.service.net.entity.OpNetworkQualityType;
import com.tt.refer.common.util.C67860d;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import com.tt.refer.p3400a.p3405d.AbstractC67720a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.s */
public class C24951s {

    /* renamed from: a */
    public static Map<IAppContext, C24953a> f61081a = new ConcurrentHashMap();

    /* renamed from: d */
    private static C24951s f61082d;

    /* renamed from: b */
    private boolean f61083b;

    /* renamed from: c */
    private IAppContext f61084c;

    /* renamed from: a */
    public static C24951s m90208a() {
        if (f61082d == null) {
            synchronized (C24951s.class) {
                f61082d = new C24951s();
            }
        }
        return f61082d;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.s$a */
    public static class C24953a implements AbstractC24950r {

        /* renamed from: a */
        private IAppContext f61087a;

        /* renamed from: b */
        private Handler f61088b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        private long f61089c;

        /* renamed from: d */
        private OpNetworkQualityType f61090d;

        /* renamed from: e */
        private Runnable f61091e;

        public C24953a(final IAppContext iAppContext) {
            this.f61087a = iAppContext;
            this.f61091e = new Runnable() {
                /* class com.larksuite.component.openplatform.core.plugin.infra.network.C24951s.C24953a.RunnableC249541 */

                public void run() {
                    C24953a.this.mo88036a(iAppContext, C67860d.m263999a(iAppContext));
                }
            };
        }

        @Override // com.larksuite.component.openplatform.core.plugin.infra.network.AbstractC24950r
        /* renamed from: a */
        public void mo88036a(IAppContext iAppContext, OpNetworkQualityType opNetworkQualityType) {
            if (iAppContext != null && opNetworkQualityType != null && opNetworkQualityType != this.f61090d) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.f61089c;
                if (j >= 500) {
                    this.f61089c = currentTimeMillis;
                    this.f61090d = opNetworkQualityType;
                    mo88044b(iAppContext, opNetworkQualityType);
                    return;
                }
                this.f61088b.removeCallbacks(this.f61091e);
                this.f61088b.postDelayed(this.f61091e, 500 - j);
            }
        }

        /* renamed from: b */
        public void mo88044b(IAppContext iAppContext, OpNetworkQualityType opNetworkQualityType) {
            if (iAppContext == null) {
                AppBrandLogger.m52829e("OpNetworkQualityChangeManager", "sendNetworkQualityChange fail, appcontext is null");
                return;
            }
            boolean d = ((AbstractC67720a) iAppContext.findServiceByInterface(AbstractC67720a.class)).mo235074d();
            boolean c = AppbrandApplicationImpl.getInst(iAppContext).getForeBackgroundManager().mo231961c();
            if ((iAppContext.getAppType() != AppType.WebAPP || !d) && (iAppContext.getAppType() != AppType.GadgetAPP || !c)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("networkQualityType", opNetworkQualityType.getNetworkQuality());
                    ((AbstractC67709b) iAppContext.findServiceByInterface(AbstractC67709b.class)).mo235012a(C67706e.C67708a.m263377a("onNetworkQualityChange", jSONObject).mo235009a());
                    C24951s.m90209a(iAppContext, opNetworkQualityType.getNetworkQuality());
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("OpNetworkQualityChangeManager", e);
                }
            } else {
                AppBrandLogger.m52829e("OpNetworkQualityChangeManager", "sendNetworkQualityChange current is background");
            }
        }
    }

    /* renamed from: c */
    public void mo88039c(final IAppContext iAppContext) {
        if (!this.f61083b) {
            this.f61083b = true;
            this.f61084c = iAppContext;
            AppbrandApplicationImpl.getInst(iAppContext).getForeBackgroundManager().mo231958a(new C66420d.AbstractC66428c() {
                /* class com.larksuite.component.openplatform.core.plugin.infra.network.C24951s.C249521 */

                @Override // com.tt.miniapp.manager.C66420d.AbstractC66428c
                /* renamed from: b */
                public void mo88041b() {
                }

                @Override // com.tt.miniapp.manager.C66420d.AbstractC66428c
                /* renamed from: c */
                public void mo88042c() {
                }

                @Override // com.tt.miniapp.manager.C66420d.AbstractC66428c
                /* renamed from: d */
                public void mo88043d() {
                }

                @Override // com.tt.miniapp.manager.C66420d.AbstractC66428c
                /* renamed from: a */
                public void mo88040a() {
                    C24953a aVar;
                    OpNetworkQualityType a = C67860d.m263999a(iAppContext);
                    if (!(a == null || C24951s.f61081a.isEmpty())) {
                        for (IAppContext iAppContext : C24951s.f61081a.keySet()) {
                            if (!(iAppContext == null || (aVar = C24951s.f61081a.get(iAppContext)) == null)) {
                                aVar.mo88036a(iAppContext, a);
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo88037a(IAppContext iAppContext) {
        if (iAppContext == null || f61081a.containsKey(iAppContext)) {
            boolean z = true;
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append(" register op network listener,context is null  ");
            if (iAppContext != null) {
                z = false;
            }
            sb.append(z);
            objArr[0] = sb.toString();
            AppBrandLogger.m52829e("OpNetworkQualityChangeManager", objArr);
            return;
        }
        mo88039c(iAppContext);
        C24953a aVar = new C24953a(iAppContext);
        f61081a.put(iAppContext, aVar);
        C67860d.m264000a(iAppContext, aVar);
    }

    /* renamed from: b */
    public void mo88038b(IAppContext iAppContext) {
        if (iAppContext == null) {
            AppBrandLogger.m52829e("OpNetworkQualityChangeManager", " unregister op network listener,context is null  ");
            return;
        }
        C24953a remove = f61081a.remove(iAppContext);
        if (iAppContext == this.f61084c && (iAppContext.isDestroyed() || iAppContext.isDestroying())) {
            this.f61084c = null;
            this.f61083b = false;
        }
        C67860d.m264001b(iAppContext, remove);
    }

    /* renamed from: a */
    public static void m90209a(IAppContext iAppContext, String str) {
        OPMonitor oPMonitor;
        int i;
        int i2 = -1;
        if (iAppContext == null) {
            oPMonitor = new OPMonitor(C40646m.f103112g);
            i = -1;
        } else {
            OPMonitor opMonitor = OPMonitorUtils.getOpMonitor(iAppContext, (String) null, C40646m.f103112g);
            int a = ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50435a();
            i = ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50457c();
            oPMonitor = opMonitor;
            i2 = a;
        }
        if (oPMonitor == null) {
            AppBrandLogger.m52829e("OpNetworkQualityChangeManager", "network quality change monitor is null");
            return;
        }
        oPMonitor.addCategoryValue("rust_type", Integer.valueOf(i2)).addCategoryValue("ttnet_type", Integer.valueOf(i)).addCategoryValue("final_type", str).flush();
    }
}
