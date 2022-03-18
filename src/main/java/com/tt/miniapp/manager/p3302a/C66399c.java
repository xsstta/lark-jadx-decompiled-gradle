package com.tt.miniapp.manager.p3302a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12749e;
import com.bytedance.ee.lark.infra.config.mina.v2.C12745c;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.lark.falcon.engine.p1058b.C23950b;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24512a;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24540d;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.ReadyJSComponent;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a;
import com.tt.miniapp.event.C66016a;
import com.tt.miniapp.manager.p3302a.p3303a.C66386b;
import com.tt.miniapp.manager.p3302a.p3304b.C66391b;
import com.tt.miniapp.manager.p3302a.p3304b.C66392c;
import com.tt.miniapp.manager.p3302a.p3304b.C66393d;
import com.tt.miniapp.manager.p3302a.p3304b.C66394e;
import com.tt.miniapp.manager.p3302a.p3304b.C66395f;
import com.tt.miniapp.manager.p3302a.p3304b.C66397g;
import com.tt.miniapp.manager.p3302a.p3304b.C66398h;
import com.tt.miniapp.util.C67031e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3368b.AbstractC67468a;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.miniapphost.util.TimeMeter;
import java.io.File;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.manager.a.c */
public class C66399c implements AbstractC67468a {

    /* renamed from: a */
    private IJSComponentManager f167633a = new C66386b();

    /* renamed from: b */
    private AbstractC24540d f167634b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo231919a(String str, String str2, String str3) {
        m259611b().mo231928c(str);
        m259611b().mo231926b(str2);
        m259611b().mo231924a(str3);
    }

    /* renamed from: a */
    public void mo231917a(final Context context, boolean z, final AbstractC67433a aVar) {
        AbstractC24540d dVar;
        m259610a((IAppContext) aVar);
        if (!C24512a.m89384a() || (dVar = this.f167634b) == null) {
            final C66016a.C66018a a = C66016a.m258509a("checkUpdateBaseBundle", "checkRemoteUpdate", String.valueOf(C66389b.m259581c()));
            final TimeMeter newAndStart = TimeMeter.newAndStart();
            Observable.create(new Action() {
                /* class com.tt.miniapp.manager.p3302a.C66399c.C664001 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    a.mo231087e("start request remote basebundle version");
                    C12745c.m52737a().mo48251a(context, new AbstractC12749e.AbstractC12750a() {
                        /* class com.tt.miniapp.manager.p3302a.C66399c.C664001.C664011 */

                        @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12749e.AbstractC12750a
                        /* renamed from: a */
                        public void mo48260a(JSONObject jSONObject) {
                            C66399c.this.mo231916a(context, newAndStart, aVar);
                        }

                        @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12749e.AbstractC12750a
                        /* renamed from: a */
                        public void mo48259a(String str, String str2) {
                            AppBrandLogger.m52829e("tma_BundleManager", "onFetchSettingFailed:errorCode", str, "errorMsg:", str2);
                        }
                    });
                }
            }).schudleOn(Schedulers.longIO()).subscribeSimple();
            return;
        }
        dVar.mo87373d(context);
    }

    /* renamed from: a */
    public void mo231918a(final AbstractC67433a aVar) {
        AbstractC24540d dVar;
        m259610a((IAppContext) aVar);
        if (!C24512a.m89384a() || (dVar = this.f167634b) == null) {
            this.f167633a.mo87405a(aVar.getApplicationContext());
            Observable.create(new Action() {
                /* class com.tt.miniapp.manager.p3302a.C66399c.C664022 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    Context applicationContext = AppbrandContext.getInst().getApplicationContext();
                    C66392c cVar = new C66392c();
                    C66391b bVar = new C66391b();
                    bVar.f167613a = C66016a.m258509a("handleBaseBundleWhenRestart", "restart", String.valueOf(C66389b.m259581c()));
                    bVar.f167621i = aVar;
                    cVar.mo231911b(applicationContext, bVar);
                    C66394e eVar = new C66394e();
                    cVar.mo231910a(eVar);
                    C66393d dVar = new C66393d();
                    eVar.mo231910a(dVar);
                    C66406e eVar2 = new C66406e();
                    dVar.mo231910a(eVar2);
                    eVar2.mo231909a(aVar);
                }
            }).schudleOn(Schedulers.longIO()).subscribeSimple();
            return;
        }
        dVar.mo87374e(aVar.getApplicationContext());
    }

    /* renamed from: a */
    public void mo231920a(List<String> list, int i, IAppContext iAppContext) {
        AbstractC24540d dVar;
        m259610a(iAppContext);
        if (!C24512a.m89384a() || (dVar = this.f167634b) == null) {
            this.f167633a.mo87406a(AppbrandContext.getInst().getApplicationContext(), list, i);
        } else {
            dVar.mo87368a(AppbrandContext.getInst().getApplicationContext(), list, i);
        }
    }

    /* renamed from: a */
    public void mo231921a(List<String> list, IJSComponentManager.AbstractC24523a aVar, IAppContext iAppContext) {
        AbstractC24540d dVar;
        m259610a(iAppContext);
        if (!C24512a.m89384a() || (dVar = this.f167634b) == null) {
            this.f167633a.mo87407a(AppbrandContext.getInst().getApplicationContext(), list, aVar);
        } else {
            dVar.mo87369a(AppbrandContext.getInst().getApplicationContext(), list, aVar);
        }
    }

    /* renamed from: a */
    public static C66399c m259608a() {
        return ContextSingletonInstance.getInstance().getBaseBundleManager();
    }

    /* renamed from: b */
    private C66403d m259611b() {
        C66403d a = C66403d.m259626a();
        if (TextUtils.isEmpty(a.mo231929d())) {
            long c = C66389b.m259581c();
            if (c > 0) {
                a.mo231928c(AppbrandUtil.convertVersionCodeToStr(c));
            }
        }
        if (TextUtils.isEmpty(a.mo231927c()) && !TextUtils.isEmpty(a.mo231929d())) {
            a.mo231926b(AppbrandUtil.convertFourToThreeVersion(a.mo231929d()));
        }
        if (a.mo231925b() == null) {
            a.mo231924a(C66389b.m259584d());
        }
        AppBrandLogger.m52828d("tma_BundleManager", a.mo231930e());
        return a;
    }

    /* renamed from: a */
    private void m259610a(IAppContext iAppContext) {
        if (C24512a.m89384a() && this.f167634b == null && iAppContext != null) {
            this.f167634b = (AbstractC24540d) iAppContext.findServiceByInterface(AbstractC24540d.class);
        }
    }

    @Override // com.tt.miniapphost.p3368b.AbstractC67468a
    /* renamed from: a */
    public String mo231913a(Context context) {
        String b = m259611b().mo231925b();
        if (TextUtils.isEmpty(b)) {
            return C66389b.m259584d();
        }
        return b;
    }

    /* renamed from: a */
    public File mo231912a(IAppContext iAppContext, Context context) {
        m259610a(iAppContext);
        return this.f167634b.mo87372c(context);
    }

    @Override // com.tt.miniapphost.p3368b.AbstractC67468a
    /* renamed from: b */
    public String mo231922b(Context context, IAppContext iAppContext) {
        AbstractC24540d dVar;
        m259610a(iAppContext);
        if (C24512a.m89384a() && (dVar = this.f167634b) != null) {
            return dVar.mo87371b(context);
        }
        String d = m259611b().mo231929d();
        if (TextUtils.isEmpty(d)) {
            return AppbrandUtil.convertVersionCodeToStr(C66389b.m259581c());
        }
        return d;
    }

    /* renamed from: c */
    public String mo231923c(Context context, IAppContext iAppContext) {
        String b = mo231922b(context, iAppContext);
        String a = mo231913a(context);
        if (TextUtils.isEmpty(a)) {
            return b;
        }
        return b + "_" + a;
    }

    /* renamed from: a */
    private void m259609a(Context context, AbstractC67433a aVar) {
        this.f167633a.mo87406a(context, this.f167633a.mo87403a(context, C12738a.m52729b(context, Settings.TMA_SDK_CONFIG)), 1);
        if (!C24512a.m89391e()) {
            AppBrandLogger.m52830i("tma_BundleManager", "jsWorker component check update disabled");
            return;
        }
        HostInterface hostInterface = HostExtensionManager.getInstance().getHostInterface();
        if (hostInterface != null) {
            List<AbstractC25558a> allBizWorkerProviders = hostInterface.getAllBizWorkerProviders();
            if (allBizWorkerProviders == null) {
                AppBrandLogger.m52829e("tma_BundleManager", "check jsWorker component update, empty worker provider");
                return;
            }
            for (AbstractC25558a aVar2 : allBizWorkerProviders) {
                String c = aVar2.mo88702c();
                C23950b E = C67485a.m262488a(aVar).mo234275E();
                AppBrandLogger.m52829e("tma_BundleManager", "check jsWorker component update from launch, component key = " + c);
                E.mo85968c(context, c);
            }
        }
    }

    /* renamed from: a */
    public Map<String, ReadyJSComponent> mo231914a(List<String> list, IAppContext iAppContext) {
        AbstractC24540d dVar;
        m259610a(iAppContext);
        if (!C24512a.m89384a() || (dVar = this.f167634b) == null) {
            return this.f167633a.mo87404a(list);
        }
        return dVar.mo87366a(list);
    }

    /* renamed from: a */
    public void mo231915a(Context context, IAppContext iAppContext) {
        AbstractC24540d dVar;
        m259610a(iAppContext);
        if (!C24512a.m89384a() || (dVar = this.f167634b) == null) {
            m259611b();
        } else {
            dVar.mo87367a(context);
        }
    }

    /* renamed from: a */
    public void mo231916a(Context context, TimeMeter timeMeter, AbstractC67433a aVar) {
        boolean z;
        m259609a(context, aVar);
        C66398h hVar = new C66398h();
        C66391b bVar = new C66391b();
        bVar.f167616d = timeMeter;
        if (!C67031e.m261247a() || C66377a.m259536c(context)) {
            z = false;
        } else {
            z = true;
        }
        bVar.f167618f = z;
        bVar.f167613a = C66016a.m258509a("handleBaseBundleWhenRestart", "restart", String.valueOf(C66389b.m259581c()));
        bVar.f167621i = aVar;
        hVar.mo231911b(context, bVar);
        C66395f fVar = new C66395f(aVar);
        hVar.mo231910a(fVar);
        C66397g gVar = new C66397g();
        fVar.mo231910a(gVar);
        C66406e eVar = new C66406e();
        gVar.mo231910a(eVar);
        eVar.mo231909a(aVar);
    }
}
