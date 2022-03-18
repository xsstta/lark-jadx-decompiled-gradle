package com.larksuite.component.openplatform.core.plugin.device;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.device.C24866p;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.data.C67485a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.n */
public class C24843n implements C24866p.AbstractC24867a {

    /* renamed from: a */
    private C24866p f60985a = new C24866p(this);

    /* renamed from: b */
    private ConcurrentHashMap<IAppContext, AbstractC67709b> f60986b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private AtomicBoolean f60987c = new AtomicBoolean();

    /* renamed from: d */
    private boolean f60988d;

    /* renamed from: e */
    private IAppContext f60989e;

    /* renamed from: a */
    public void mo87868a() {
        this.f60985a.mo87916a();
        this.f60988d = true;
    }

    /* renamed from: b */
    public void mo87872b() {
        this.f60985a.mo87917b();
        this.f60988d = false;
    }

    /* renamed from: b */
    public static C24843n m89965b(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234304y();
    }

    public C24843n(IAppContext iAppContext) {
        this.f60989e = iAppContext;
    }

    /* renamed from: a */
    public void mo87869a(IAppContext iAppContext) {
        this.f60986b.remove(iAppContext);
        if (this.f60986b.size() != 0 || !this.f60987c.compareAndSet(true, false)) {
            AppBrandLogger.m52830i("OnUserCaptureScreenManager", "not unregister: " + this.f60986b.size() + this.f60987c.get());
            return;
        }
        AppBrandLogger.m52830i("OnUserCaptureScreenManager", "unregister for appKey: " + iAppContext.getAppId());
        this.f60985a.mo87917b();
    }

    /* renamed from: a */
    public void mo87870a(IAppContext iAppContext, AbstractC67709b bVar) {
        this.f60986b.put(iAppContext, bVar);
        if (this.f60987c.compareAndSet(false, true)) {
            AppBrandLogger.m52830i("OnUserCaptureScreenManager", "register for appKey: " + iAppContext.getAppId());
            this.f60985a.mo87916a();
            return;
        }
        AppBrandLogger.m52830i("OnUserCaptureScreenManager", "has registered: " + iAppContext.getAppId());
    }

    @Override // com.larksuite.component.openplatform.core.plugin.device.C24866p.AbstractC24867a
    /* renamed from: a */
    public void mo87871a(String str, long j) {
        if (this.f60988d) {
            AppBrandLogger.m52830i("OnUserCaptureScreenManager", "onUserCaptureScreen");
            AppbrandApplicationImpl m = C67485a.m262488a(this.f60989e).mo234292m();
            boolean c = m.getForeBackgroundManager().mo231961c();
            if (c) {
                AppBrandLogger.m52828d("OnUserCaptureScreenManager", "onUserCaptureScreen: isBackground = " + c);
                return;
            }
            m.getJsBridge().sendMsgToJsCore("userCaptureScreenObserved", new JSONObject().toString());
            return;
        }
        for (Map.Entry<IAppContext, AbstractC67709b> entry : this.f60986b.entrySet()) {
            AbstractC67709b value = entry.getValue();
            if (((AbstractC67709b.AbstractC67710a) value.mo235130i()).mo235061l()) {
                AppBrandLogger.m52830i("OnUserCaptureScreenManager", "app is in background");
                return;
            }
            value.mo235012a(C67706e.C67708a.m263377a("userCaptureScreenObserved", new JSONObject()).mo235009a());
        }
    }
}
