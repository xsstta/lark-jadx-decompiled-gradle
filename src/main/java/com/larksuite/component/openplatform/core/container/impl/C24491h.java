package com.larksuite.component.openplatform.core.container.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12887b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.entity.C24377a;
import com.larksuite.component.openplatform.api.entity.OPContainerBundle;
import com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum;
import com.larksuite.component.openplatform.api.p1100a.AbstractC24362a;
import com.larksuite.component.openplatform.core.component.C24436d;
import com.larksuite.component.openplatform.core.component.p1115a.C24433b;
import com.larksuite.component.openplatform.core.container.C24458a;
import com.larksuite.component.openplatform.core.container.crossprocess.C24476a;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24468c;
import com.larksuite.component.openplatform.core.container.p1118a.p1119a.AbstractC24460a;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24392b;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24399f;
import com.larksuite.component.openplatform.core.p1114c.C24423a;
import com.larksuite.component.openplatform.core.plugin.C24614b;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25892c;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;
import com.tt.miniapp.AppbrandFragment;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.manager.C66437h;
import com.tt.miniapp.p3327s.AbstractC66736a;
import com.tt.miniapp.p3331t.AbstractC66891k;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapp.settings.v2.handler.GadgetRuntimeConfigSettingHandler;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.C67548h;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

/* renamed from: com.larksuite.component.openplatform.core.container.impl.h */
public class C24491h extends AbstractC24468c implements AbstractC24460a {

    /* renamed from: l */
    private C66546p f60416l;

    /* renamed from: m */
    private boolean f60417m;

    /* renamed from: n */
    private String f60418n;

    /* renamed from: o */
    private AbstractC67433a f60419o;

    /* renamed from: p */
    private int f60420p;

    /* renamed from: q */
    private String f60421q;

    /* renamed from: r */
    private String f60422r;

    /* renamed from: s */
    private boolean f60423s;

    /* renamed from: t */
    private TimeMeter f60424t;

    /* renamed from: u */
    private FragmentManager f60425u;

    /* renamed from: v */
    private OPContainerLifecycleEventEnum f60426v;

    /* renamed from: z */
    private void m89342z() {
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.p1119a.AbstractC24460a
    /* renamed from: a */
    public void mo87276a(String str, AppbrandFragment appbrandFragment) {
    }

    @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
    public void ai_() {
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: m */
    public boolean mo87295m() {
        return false;
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b, com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
    /* renamed from: a */
    public void mo49118a() {
        super.mo49118a();
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: g */
    public AppType mo87289g() {
        return AppType.GadgetAPP;
    }

    /* renamed from: s */
    public AbstractC67497e mo87354s() {
        return this.f60416l;
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a, com.larksuite.framework.apiplugin.core.AbstractC25922a
    /* renamed from: a */
    public boolean mo87111a(int i, int i2, Intent intent) {
        C66546p pVar;
        boolean a = super.mo87111a(i, i2, intent);
        return (a || (pVar = this.f60416l) == null) ? a : pVar.mo232119a(i, i2, intent);
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public void mo87285a(ConcurrentLinkedDeque<AbstractC24387a> concurrentLinkedDeque) {
        concurrentLinkedDeque.add(new C24399f());
        concurrentLinkedDeque.add(new C24392b());
    }

    /* renamed from: A */
    private void m89336A() {
        AbstractC25904o u = mo92183u();
        u.mo92199a(new C24614b(this));
        u.mo92200a(C24423a.m89092c());
        if (ProcessUtil.isMainProcess(this.f60355e)) {
            m89342z();
        }
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b, com.larksuite.framework.apiplugin.p1175a.AbstractC25891b, com.larksuite.framework.apiplugin.core.AbstractC25922a
    public void ah_() {
        super.ah_();
        if (!TextUtils.isEmpty(this.f60418n)) {
            C24476a.m89285a().mo87341b(this.f60418n);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: l */
    public void mo87294l() {
        if (this.f60423s) {
            AppBrandLogger.m52830i("OP_SDK_OPGadgetAppContainer", "initLaunchScheduler waiting for next procedure");
            return;
        }
        super.mo87294l();
    }

    /* renamed from: com.larksuite.component.openplatform.core.container.impl.h$4 */
    static /* synthetic */ class C244954 {

        /* renamed from: a */
        static final /* synthetic */ int[] f60430a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum[] r0 = com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.container.impl.C24491h.C244954.f60430a = r0
                com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum r1 = com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.container.impl.C24491h.C244954.f60430a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum r1 = com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum.ON_SHOW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.container.impl.C24491h.C244954.f60430a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum r1 = com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum.ON_HIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.larksuite.component.openplatform.core.container.impl.C24491h.C244954.f60430a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum r1 = com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.larksuite.component.openplatform.core.container.impl.C24491h.C244954.f60430a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum r1 = com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.container.impl.C24491h.C244954.<clinit>():void");
        }
    }

    /* renamed from: C */
    private void m89338C() {
        if (mo49749b() instanceof MiniappHostBase) {
            AppBrandLogger.m52830i("OP_SDK_OPGadgetAppContainer", "no need to preload main process runner");
            return;
        }
        C67866g.m264028a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.container.impl.C24491h.RunnableC244943 */

            public void run() {
                C25529d.m91150b();
            }
        }, 5000);
    }

    /* renamed from: B */
    private void m89337B() {
        if (!ProcessUtil.isMainProcess(this.f60355e)) {
            this.f60418n = "mock_appIdentify" + this.f60354d;
            AppBrandLogger.m52830i("OP_SDK_OPGadgetAppContainer", "mockAppIdentify:" + this.f60418n);
            IHostProcessHandleEvent a = C25529d.m91129a(this.f60355e, IHostProcessHandleEvent.class);
            if (a != null) {
                a.notifyAppContainerOnCreate(this.f60418n, this.f60359i.getApiAccessConfig());
            } else {
                AppBrandLogger.m52829e("OP_SDK_OPGadgetAppContainer", "ManisManager.getService is null");
            }
            C25529d.m91144a(this.f64220k, IHostProcessHandleEvent.class, this.f60418n);
        }
    }

    /* renamed from: y */
    private void m89341y() {
        if (TextUtils.isEmpty(this.f60419o.mo234166f())) {
            this.f60419o.mo234157a(C67440a.m262344a(AppType.GadgetAPP, this.f60354d));
        }
        C67448a.m262353a().mo234182b(this.f60419o);
        C67485a a = C67485a.m262488a(this.f60419o);
        if (a != null) {
            if (mo49749b() instanceof Activity) {
                a.mo234292m().setAppActivity((Activity) mo49749b());
            }
            a.mo234292m().onCreate();
        }
        this.f60423s = false;
        this.f60424t = new TimeMeter();
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public AbstractC24362a mo87279a(C24436d dVar) {
        String str = this.f60422r;
        if (str != null) {
            dVar.f60295a = str;
        }
        return new C24433b(dVar, this.f60359i);
    }

    /* renamed from: c */
    public synchronized void mo87355c(AbstractC24362a aVar) {
        mo87286a(aVar);
    }

    /* renamed from: a */
    private void m89340a(Object... objArr) {
        Bundle bundle;
        if (objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof Bundle) {
                bundle = (Bundle) obj;
                this.f60416l.mo231002a(bundle, this.f60357g);
                mo87294l();
                this.f60416l.mo231006b();
            }
        }
        bundle = null;
        this.f60416l.mo231002a(bundle, this.f60357g);
        mo87294l();
        this.f60416l.mo231006b();
    }

    /* renamed from: a */
    private void m89339a(OPContainerBundle oPContainerBundle) {
        m89337B();
        m89336A();
        m89341y();
        this.f60425u = oPContainerBundle.mo87156g();
        C66546p pVar = new C66546p((FragmentActivity) this.f60359i.getCurrentActivity(), oPContainerBundle.mo87156g(), this.f60419o, null, null, new AbstractC66736a() {
            /* class com.larksuite.component.openplatform.core.container.impl.C24491h.C244932 */

            @Override // com.tt.miniapp.p3327s.AbstractC66736a
            /* renamed from: a */
            public void mo87356a(View view) {
                if (C24491h.this.f60356f != null) {
                    C24491h.this.f60356f.addView(view);
                }
            }
        });
        this.f60416l = pVar;
        pVar.mo232116a(this);
        m89338C();
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public IAppContext mo87278a(Context context) {
        String a = C25529d.m91139a(this.f60351a.mo87152c(), C24377a.f60157b);
        AbstractC12887b a2 = C67440a.m262344a(AppType.GadgetAPP, a);
        boolean a3 = GadgetRuntimeConfigSettingHandler.m260575a().mo232659a(a);
        if (!ProcessUtil.isMainProcess(this.f60355e) || a3) {
            AbstractC67433a b = C67448a.m262353a().mo234181b(a2);
            if (b == null) {
                b = C67448a.m262353a().mo234190i();
            }
            this.f60419o = b;
            if (ProcessUtil.isMainProcess(this.f60355e) && a3) {
                this.f60419o.mo234168h();
            }
        } else {
            AbstractC67433a h = C67448a.m262353a().mo234189h();
            if (h == null) {
                h = C67448a.m262353a().mo234185d();
            }
            this.f60419o = h;
        }
        this.f60419o.mo234157a(a2);
        return this.f60419o;
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public void mo87281a(Bundle bundle) {
        this.f60420p = C25529d.m91156c(bundle, C24377a.f60158c);
        this.f60421q = C25529d.m91139a(bundle, C24377a.f60159d);
        bundle.putString("workerType", "gadget");
        bundle.putString("renderType", "gadget");
        String string = bundle.getString("microapp_url");
        if (TextUtils.isEmpty(string)) {
            string = String.format("sslocal://microapp?app_id=%s&scene=%s&app_sand_box_type=%s&start_page=%s", this.f60354d, Integer.valueOf(this.f60420p), Integer.valueOf(IAppSandboxEnvManagerService.SandBoxEnvType.MAIN_PROCESS.ordinal()), this.f60421q);
            AppBrandLogger.m52830i("OP_SDK_OPGadgetAppContainer", "schemaUrl:" + string);
            AppInfoEntity a = C66375a.m259513a(string);
            bundle.putString("microapp_url", Uri.parse(string).toString());
            bundle.putParcelable("microapp_appinfo", a);
        }
        this.f60423s = true;
        if (this.f60355e instanceof MiniappHostBase) {
            this.f60359i.setContainerType("standard");
            return;
        }
        this.f60359i.setContainerType("embed");
        String traceId = this.f60359i.getTraceId();
        String str = this.f60421q;
        boolean b = C66437h.m259720b(this.f60355e, this.f60353c);
        C67548h.mpAppLaunchStart(traceId, -1, null, null, string, null, null, str, b ? 1 : 0, HostDependManager.getInst().getTenantId(), HostDependManager.getInst().getUserId(), 0, this.f60359i);
    }

    public C24491h(OPContainerBundle oPContainerBundle, String str) {
        super(oPContainerBundle, str);
        m89339a(oPContainerBundle);
    }

    public C24491h(String str, LKOpenApiAccessConfig lKOpenApiAccessConfig) {
        super(lKOpenApiAccessConfig);
        this.f60354d = str;
        this.f60359i = C67448a.m262353a().mo234192k();
        if (this.f60359i == null) {
            this.f60359i = C67448a.m262353a().mo234190i();
        }
        m89342z();
        this.f64220k.mo92247a(new AbstractC25892c() {
            /* class com.larksuite.component.openplatform.core.container.impl.C24491h.C244921 */

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25892c
            public LKBasePluginResult dispatchEvent(LKEvent lKEvent) {
                boolean z;
                if (lKEvent.mo92141h() == null) {
                    lKEvent.mo92118a(LKEvent.EventSourceEnv.BIZ_ENV);
                }
                if (LKEvent.EventSourceEnv.APP_ENV == lKEvent.mo92141h()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    IHostProcessHandleEvent.HandleEventCallback a = C24476a.m89285a().mo87339a(C24491h.this.f60354d);
                    long nanoTime = System.nanoTime();
                    C24458a.m89213a().f60349a.put(Long.valueOf(nanoTime), lKEvent);
                    if (a != null) {
                        return a.dispatchEventToAppProcess(lKEvent, nanoTime);
                    }
                }
                return LKBasePluginResult.f64237b;
            }
        });
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a, com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public void mo87108a(OPContainerLifecycleEventEnum oPContainerLifecycleEventEnum, Object... objArr) {
        super.mo87108a(oPContainerLifecycleEventEnum, new Object[0]);
        if (this.f60426v == OPContainerLifecycleEventEnum.ON_DESTROY) {
            AppBrandLogger.m52830i("OP_SDK_OPGadgetAppContainer", "ignore : " + oPContainerLifecycleEventEnum + " & mCurrentLifecycle already destroyed");
        } else if (this.f60416l == null) {
            AppBrandLogger.m52830i("OP_SDK_OPGadgetAppContainer", "ignore : " + oPContainerLifecycleEventEnum + " & container is null");
        } else {
            this.f60426v = oPContainerLifecycleEventEnum;
            int i = C244954.f60430a[oPContainerLifecycleEventEnum.ordinal()];
            if (i == 1) {
                m89340a(objArr);
            } else if (i == 2) {
                this.f60424t.start();
                this.f60416l.mo231009c();
            } else if (i == 3) {
                this.f60416l.mo231011d();
            } else if (i == 4) {
                this.f60416l.mo231003a(this.f60424t);
            } else if (i != 5) {
                AppBrandLogger.m52830i("OP_SDK_OPGadgetAppContainer", "no handle this event enum!" + oPContainerLifecycleEventEnum.name());
            } else {
                if (!ProcessUtil.isMainProcess(this.f60355e)) {
                    try {
                        IHostProcessHandleEvent a = C25529d.m91129a(this.f60355e, IHostProcessHandleEvent.class);
                        if (a != null && !TextUtils.isEmpty(this.f60418n)) {
                            a.notifyAppContainerOnDestroy(this.f60418n);
                        }
                    } catch (Throwable th) {
                        AppBrandLogger.m52830i("OP_SDK_OPGadgetAppContainer", "throwable", th);
                    }
                }
                FragmentManager fragmentManager = this.f60425u;
                if (fragmentManager != null) {
                    List<Fragment> fragments = fragmentManager.getFragments();
                    FragmentTransaction beginTransaction = this.f60425u.beginTransaction();
                    if (fragments != null && !fragments.isEmpty()) {
                        for (Fragment fragment : fragments) {
                            if (fragment instanceof AbstractC66891k) {
                                ((AbstractC66891k) fragment).executeRemoveWithOutCommit(beginTransaction);
                            }
                        }
                        beginTransaction.commitAllowingStateLoss();
                    }
                    if (this.f60416l.mo232110B() != null) {
                        this.f60416l.mo232110B().clear();
                    }
                }
                if (mo87292j() != null) {
                    mo87292j().mo87125b();
                }
                this.f60416l.mo231013f();
                this.f60416l = null;
                AbstractC67433a aVar = this.f60419o;
                if (aVar != null) {
                    aVar.destroy();
                    this.f60419o = null;
                }
            }
        }
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a, com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public void mo87109a(Class cls, Object obj) {
        C67485a a = C67485a.m262488a(this.f60419o);
        if (a != null) {
            a.mo234274D().mo230964a(cls, obj);
            return;
        }
        AppBrandLogger.m52829e("OP_SDK_OPGadgetAppContainer", "appSingletonInstance is null!");
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.p1119a.AbstractC24460a
    /* renamed from: b */
    public AppbrandFragment mo87277b(Context context, String str, IAppContext iAppContext) {
        return mo87275a(context, str, iAppContext);
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.p1119a.AbstractC24460a
    /* renamed from: a */
    public AppbrandFragment mo87275a(Context context, String str, IAppContext iAppContext) {
        this.f60422r = str;
        AbstractC24362a k = mo87293k();
        if (this.f60417m || k == null) {
            mo87291i();
            k = mo87293k();
        } else {
            this.f60417m = true;
        }
        this.f60422r = null;
        if (k instanceof C24433b) {
            return ((C24433b) k).mo87228i();
        }
        return null;
    }
}
