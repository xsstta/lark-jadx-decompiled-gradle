package com.larksuite.component.openplatform.core.container;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.plugin_annotation.bean.PluginEnv;
import com.larksuite.component.openplatform.api.p1103b.AbstractC24366a;
import com.larksuite.component.openplatform.core.container.crossprocess.C24476a;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleDefaultPluginContainerEvent;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.larksuite.component.openplatform.core.container.p1120b.C24473a;
import com.larksuite.component.openplatform.core.p1113b.C24402a;
import com.larksuite.component.openplatform.core.p1121d.C24498b;
import com.larksuite.component.openplatform.core.plugin.C24577a;
import com.larksuite.component.openplatform.core.plugin.OPFireEventPlugin;
import com.larksuite.component.openplatform.core.plugin.OPLinkTracePlugin;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.component.openplatform.plugins.container.C25577b;
import com.larksuite.component.openplatform.plugins.p1142a.AbstractC25556c;
import com.larksuite.component.openplatform.plugins.p1142a.C25552a;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25892c;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.api.ILogger;

/* renamed from: com.larksuite.component.openplatform.core.container.c */
public class C24474c extends C25577b implements AbstractC24366a {

    /* renamed from: b */
    private String f60389b;

    /* renamed from: c */
    private IAppContext f60390c;

    /* renamed from: d */
    private final C24473a f60391d = new C24473a();

    @Override // com.larksuite.component.openplatform.plugins.container.AbstractC25576a, com.larksuite.component.openplatform.plugins.container.C25577b
    /* renamed from: d */
    public boolean mo87313d() {
        return false;
    }

    /* renamed from: c */
    public IAppContext mo87312c() {
        return this.f60390c;
    }

    @Override // com.larksuite.component.openplatform.api.p1103b.AbstractC24366a
    /* renamed from: f */
    public AbstractC12888c mo87129f() {
        if (this.f60391d.mo87129f() == null) {
            return new AbstractC12888c() {
                /* class com.larksuite.component.openplatform.core.container.$$Lambda$c$6xpqn4NFwbc8oR4I2OA2qP6t6ak */

                @Override // com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c
                public final void startActivityForResult(Intent intent, int i) {
                    C24474c.this.m89278a((C24474c) intent, (Intent) i);
                }
            };
        }
        return this.f60391d.mo87129f();
    }

    @Override // com.larksuite.component.openplatform.plugins.container.AbstractC25576a, com.larksuite.framework.apiplugin.p1175a.AbstractC25891b, com.larksuite.framework.apiplugin.core.AbstractC25922a
    public void ah_() {
        IAppContext iAppContext;
        if (!TextUtils.isEmpty(this.f60389b)) {
            Context b = mo49749b();
            if (b == null && (iAppContext = this.f60390c) != null) {
                b = iAppContext.getApplicationContext();
            }
            IHostProcessHandleEvent a = C25529d.m91129a(b, IHostProcessHandleDefaultPluginContainerEvent.class);
            if (a != null) {
                a.notifyAppContainerOnDestroy(this.f60389b);
            }
            C24476a.m89285a().mo87341b(this.f60389b);
        }
        super.ah_();
        Log.m165389i("OpDefaultPluginManagerC", "onRelease");
        this.f60390c = null;
        this.f60391d.mo87311a();
    }

    @Override // com.larksuite.component.openplatform.api.p1103b.AbstractC24366a
    /* renamed from: a */
    public void mo87128a(AbstractC12888c cVar) {
        this.f60391d.mo87128a(cVar);
    }

    /* renamed from: a */
    private void m89280a(PluginEnv pluginEnv) {
        C25552a.C25554a a = new C25552a.C25554a().mo88693a(mo92183u()).mo88690a(pluginEnv);
        AbstractC25556c cVar = (AbstractC25556c) C24498b.m89361a().mo87139a(AbstractC25556c.class);
        if (cVar != null) {
            a.mo88692a(this.f62220a);
            AbstractC25937e a2 = cVar.mo88696a(a.mo88694a());
            if (a2 != null) {
                mo92183u().mo92199a(a2);
            }
        }
    }

    public C24474c(IAppContext iAppContext) {
        super(iAppContext.getCurrentActivity(), iAppContext.getApiAccessConfig(), PluginEnv.APP_ENV);
        iAppContext.setDefaultPluginContainer(this);
        this.f60390c = iAppContext;
        this.f64220k.mo92248a(new C24402a(iAppContext));
        if (!C26252ad.m94993b(iAppContext.getApplicationContext())) {
            m89279a(iAppContext);
            C24577a.m89613a(C25529d.m91129a(iAppContext.getApplicationContext(), IHostProcessHandleDefaultPluginContainerEvent.class));
            m89280a(PluginEnv.APP_ENV);
        } else {
            m89280a((PluginEnv) null);
        }
        mo92183u().mo92199a(new OPFireEventPlugin(iAppContext));
        mo92183u().mo92199a(new OPLinkTracePlugin(iAppContext));
    }

    /* renamed from: a */
    private void m89279a(IAppContext iAppContext) {
        Object obj;
        IAppContext iAppContext2;
        StringBuilder sb = new StringBuilder();
        sb.append("mock_containerId");
        if (TextUtils.isEmpty(iAppContext.getAppId())) {
            obj = Long.valueOf(System.currentTimeMillis());
        } else {
            obj = iAppContext.getAppId();
        }
        sb.append(obj);
        this.f60389b = sb.toString();
        ILogger d = C25529d.m91161d(iAppContext);
        if (d != null) {
            d.mo92224i("OpDefaultPluginManagerC", "fakeContainerId:" + this.f60389b);
        } else {
            Log.m165389i("OpDefaultPluginManagerC", "fakeContainerId:" + this.f60389b);
        }
        long currentTimeMillis = System.currentTimeMillis();
        AppBrandLogger.m52828d("OpDefaultPluginManagerC", "pluginContainerEvent time:" + (System.currentTimeMillis() - currentTimeMillis));
        Context b = mo49749b();
        if (b == null && (iAppContext2 = this.f60390c) != null) {
            b = iAppContext2.getApplicationContext();
        }
        IHostProcessHandleEvent a = C25529d.m91129a(b, IHostProcessHandleDefaultPluginContainerEvent.class);
        if (a != null) {
            a.notifyAppContainerOnCreate(this.f60389b, this.f62220a);
        } else if (d != null) {
            d.mo92223e("OpDefaultPluginManagerC", "ManisManager.getService is null");
        } else {
            Log.m165383e("OpDefaultPluginManagerC", "ManisManager.getService is null");
        }
        C25529d.m91144a(this.f64220k, IHostProcessHandleDefaultPluginContainerEvent.class, this.f60389b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m89278a(Intent intent, int i) {
        IAppContext iAppContext = this.f60390c;
        if (iAppContext != null && iAppContext.getCurrentActivity() != null) {
            this.f60390c.getCurrentActivity().startActivityForResult(intent, i);
        }
    }

    public C24474c(Context context, LKOpenApiAccessConfig lKOpenApiAccessConfig, final String str) {
        super(context, lKOpenApiAccessConfig, PluginEnv.BIZ_ENV);
        this.f60389b = str;
        m89280a(PluginEnv.BIZ_ENV);
        this.f64220k.mo92247a(new AbstractC25892c() {
            /* class com.larksuite.component.openplatform.core.container.C24474c.C244751 */

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25892c
            public LKBasePluginResult dispatchEvent(LKEvent lKEvent) {
                boolean z;
                if (lKEvent.mo92141h() == null) {
                    lKEvent.mo92118a(LKEvent.EventSourceEnv.BIZ_ENV);
                }
                IHostProcessHandleEvent.HandleEventCallback a = C24476a.m89285a().mo87339a(str);
                long nanoTime = System.nanoTime();
                C24458a.m89213a().f60349a.put(Long.valueOf(nanoTime), lKEvent);
                if (LKEvent.EventSourceEnv.APP_ENV == lKEvent.mo92141h()) {
                    z = true;
                } else {
                    z = false;
                }
                if (a == null || z) {
                    return LKBasePluginResult.f64237b;
                }
                return a.dispatchEventToAppProcess(lKEvent, nanoTime);
            }
        });
    }
}
