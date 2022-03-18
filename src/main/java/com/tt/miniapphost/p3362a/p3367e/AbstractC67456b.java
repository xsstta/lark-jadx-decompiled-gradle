package com.tt.miniapphost.p3362a.p3367e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12886a;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.larksuite.component.openplatform.api.AbstractC24361a;
import com.larksuite.component.openplatform.api.p1103b.AbstractC24366a;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.core.AbstractC25928e;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67436d;
import com.tt.miniapphost.p3362a.p3365c.C67452b;
import com.tt.miniapphost.p3362a.p3366d.C67454a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.tt.miniapphost.a.e.b */
public abstract class AbstractC67456b implements IAppContext {

    /* renamed from: a */
    protected AbstractC25891b f170062a;

    /* renamed from: b */
    protected AbstractC25576a f170063b;

    /* renamed from: c */
    private final Context f170064c;

    /* renamed from: d */
    private Activity f170065d;

    /* renamed from: e */
    private String f170066e;

    /* renamed from: f */
    private String f170067f;

    /* renamed from: g */
    private Object f170068g;

    /* renamed from: h */
    private LKOpenApiAccessConfig f170069h;

    /* renamed from: i */
    private final Map<String, IBaseService> f170070i = new ConcurrentHashMap();

    /* renamed from: j */
    private AbstractC67436d f170071j = new C67461g();

    /* renamed from: k */
    private AbstractC12886a f170072k = new C67454a();

    /* renamed from: l */
    private volatile boolean f170073l = false;

    /* renamed from: m */
    private volatile boolean f170074m = false;

    /* renamed from: n */
    private AbstractC12888c f170075n;

    /* renamed from: o */
    private String f170076o;

    /* renamed from: p */
    private OPTrace f170077p;

    /* renamed from: q */
    private boolean f170078q;

    /* renamed from: r */
    private String f170079r;

    /* renamed from: s */
    private int f170080s = 0;

    /* renamed from: t */
    private boolean f170081t;

    /* renamed from: l */
    public abstract void mo234196l();

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void startDestroy() {
        this.f170074m = true;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public AbstractC25891b getAppContainer() {
        return this.f170062a;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public String getAppId() {
        return this.f170066e;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public String getAppIdentify() {
        return this.f170067f;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public Context getApplicationContext() {
        return this.f170064c;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public String getContainerType() {
        return this.f170079r;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public int getCurrentTheme() {
        return this.f170080s;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public AbstractC25576a getDefaultPluginContainer() {
        return this.f170063b;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public <T> T getExtra() {
        return (T) this.f170068g;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public AbstractC12888c getGadgetInteractiveProxy() {
        return this.f170075n;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public String getTraceId() {
        return this.f170076o;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public OPTrace getTracingSpan() {
        return this.f170077p;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public boolean isDestroyed() {
        return this.f170073l;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public boolean isDestroying() {
        return this.f170074m;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public boolean isInParallelWindow() {
        return this.f170081t;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public AbstractC25891b getCurrentNode() {
        AbstractC25891b bVar = this.f170062a;
        if (bVar == null) {
            return this.f170063b;
        }
        return bVar;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public Activity getCurrentActivity() {
        if (this.f170065d == null) {
            Log.m165383e("AppContextImpl", "currentActivity is null");
        }
        return this.f170065d;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public boolean isEmbedContainer() {
        return TextUtils.equals(this.f170079r, "embed");
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public boolean isNewContainer() {
        if (this.f170078q || isEmbedContainer()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void unRegisterOnResultAllPlugin() {
        AbstractC25891b currentNode = getCurrentNode();
        if (currentNode != null) {
            currentNode.mo92186x();
        }
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public LKOpenApiAccessConfig getApiAccessConfig() {
        if (this.f170069h == null) {
            this.f170069h = new LKOpenApiAccessConfig.C25569a().mo88737a();
        }
        return this.f170069h;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public AbstractC25905b getBridgeContext() {
        AbstractC25891b bVar = this.f170062a;
        if (bVar == null) {
            Log.m165389i("AppContextImpl", "use basePM.");
            bVar = this.f170063b;
        }
        if (bVar != null) {
            return bVar.mo92184v();
        }
        Log.m165383e("AppContextImpl", "not set core node");
        return null;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void initTrace() {
        if (this.f170077p == null) {
            OPTrace a = OPTraceService.m192757a();
            this.f170077p = a;
            this.f170076o = a.getTracingID();
        }
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void destroy() {
        if (this.f170073l || this.f170074m) {
            Log.m165389i("AppContextImpl", "this appContext is destroyed or destroying.");
            return;
        }
        this.f170074m = true;
        this.f170075n = null;
        AbstractC67436d dVar = this.f170071j;
        if (dVar != null) {
            dVar.mo234173a();
        }
        AbstractC12886a aVar = this.f170072k;
        if (aVar != null) {
            aVar.mo48637a();
        }
        this.f170072k = null;
        this.f170066e = null;
        this.f170071j = null;
        C67452b.m262376a(this.f170070i);
        this.f170065d = null;
        mo234196l();
        Log.m165389i("AppContextImpl", "appContext destroyed: " + android.util.Log.getStackTraceString(new Throwable()));
        this.f170062a = null;
        AbstractC25576a aVar2 = this.f170063b;
        if (aVar2 != null) {
            aVar2.ah_();
        }
        this.f170063b = null;
        this.f170073l = true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("AppContextWrapper{context=");
        sb.append(this.f170064c);
        sb.append(", currentActivity=");
        sb.append(this.f170065d);
        sb.append(", appId='");
        sb.append(this.f170066e);
        sb.append('\'');
        sb.append(", mAppIdentify='");
        sb.append(this.f170067f);
        sb.append('\'');
        sb.append(", mExtraObj=");
        sb.append(this.f170068g);
        sb.append(", mAppContainer=");
        sb.append(this.f170062a);
        sb.append(", mApiAccessConfig=");
        LKOpenApiAccessConfig lKOpenApiAccessConfig = this.f170069h;
        if (lKOpenApiAccessConfig != null) {
            str = lKOpenApiAccessConfig.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", appServiceMap=");
        sb.append(this.f170070i);
        sb.append(", serviceManager=");
        sb.append(this.f170071j);
        sb.append(", iAppContextBundle=");
        sb.append(this.f170072k);
        sb.append(", isDestroyed=");
        sb.append(this.f170073l);
        sb.append(", isDestroying=");
        sb.append(this.f170074m);
        sb.append(", gadgetInteractiveProxy=");
        sb.append(this.f170075n);
        sb.append(", mTraceId='");
        sb.append(this.f170076o);
        sb.append('\'');
        sb.append(", mTraceSpan=");
        sb.append(this.f170077p);
        sb.append('}');
        return sb.toString();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void setApiAccessConfig(LKOpenApiAccessConfig lKOpenApiAccessConfig) {
        this.f170069h = lKOpenApiAccessConfig;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void setAppId(String str) {
        this.f170066e = str;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void setAppIdentify(String str) {
        this.f170067f = str;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void setContainerType(String str) {
        this.f170079r = str;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void setCurrentActivity(Activity activity) {
        this.f170065d = activity;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void setCurrentTheme(int i) {
        this.f170080s = i;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void setDefaultPluginContainer(AbstractC25576a aVar) {
        this.f170063b = aVar;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void setExtra(Object obj) {
        this.f170068g = obj;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void setGadgetInteractiveProxy(AbstractC12888c cVar) {
        this.f170075n = cVar;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void setInParallelWindow(boolean z) {
        this.f170081t = z;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void bindAppContainer(AbstractC25891b bVar) {
        this.f170062a = bVar;
        if (bVar != null) {
            this.f170078q = true;
        }
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public <T> T getExtra(String str) {
        return (T) this.f170072k.mo48636a(str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void putExtras(AbstractC12886a aVar) {
        this.f170072k.mo48638a(aVar);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void removeExtra(String str) {
        this.f170072k.mo48641b(str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public LKBasePluginResult sendEvent(String str) {
        return sendEvent(str, null, null);
    }

    /* renamed from: a */
    private ILogger m262385a(LKEvent lKEvent) {
        return lKEvent.mo92134c().mo92190b();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void unRegisterOnResultPlugin(AbstractC25937e eVar) {
        AbstractC25891b currentNode = getCurrentNode();
        if (currentNode != null) {
            currentNode.mo92178a(eVar);
        }
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public <T extends IBaseService> T findServiceByInterface(Class<T> cls) {
        T t = (T) C67452b.m262374a(this, this.f170070i, cls);
        if (t != null) {
            return t;
        }
        AbstractC67436d dVar = this.f170071j;
        if (dVar != null) {
            return (T) ((IBaseService) dVar.mo234172a(cls));
        }
        return null;
    }

    public AbstractC67456b(Context context) {
        this.f170064c = context;
        initTrace();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public LKBasePluginResult sendEvent(LKEvent lKEvent) {
        AbstractC25891b currentNode = getCurrentNode();
        ILogger a = m262385a(lKEvent);
        boolean z = true;
        if (currentNode instanceof AbstractC25576a) {
            if (a != null) {
                a.mo92224i("AppContextImpl", "eventName:" + lKEvent.mo92146m() + " use basePM");
            } else {
                Log.m165389i("AppContextImpl", "eventName:" + lKEvent.mo92146m() + " use basePM");
            }
        }
        if (currentNode != null) {
            if (!(currentNode instanceof AbstractC24361a)) {
                if (a != null) {
                    a.mo92224i("AppContextImpl", "bind appContext to LKEvent");
                } else {
                    Log.m165389i("AppContextImpl", "bind appContext to LKEvent");
                }
                lKEvent.mo92125a(this);
                AbstractC25905b v = currentNode.mo92184v();
                if (v instanceof AbstractC25928e) {
                    if (a != null) {
                        Object[] objArr = new Object[1];
                        StringBuilder sb = new StringBuilder();
                        sb.append("current activity:");
                        if (getCurrentActivity() != null) {
                            z = false;
                        }
                        sb.append(z);
                        objArr[0] = sb.toString();
                        a.mo92224i("AppContextImpl", objArr);
                    }
                    ((AbstractC25928e) v).mo92220a(getCurrentActivity());
                }
            }
            return currentNode.mo92179b(lKEvent);
        }
        if (a != null) {
            a.mo92224i("AppContextImpl", "core node is null");
        } else {
            Log.m165389i("AppContextImpl", "core node is null");
        }
        return LKBasePluginResult.f64237b;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public <T> void putExtra(String str, T t) {
        this.f170072k.mo48639a(str, t);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public LKBasePluginResult sendEvent(String str, JSONObject jSONObject) {
        return sendEvent(str, jSONObject, null);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public <T extends IBaseService> boolean registerService(Class<T> cls, T t) {
        if (t instanceof AbstractC67457c) {
            ((AbstractC67457c) t).f170082d = this;
        }
        AbstractC67436d dVar = this.f170071j;
        if (dVar != null) {
            return dVar.mo234174a(cls, t);
        }
        return false;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void sendEvent(String str, Bundle bundle) {
        AppBrandLogger.m52830i("AppContextImpl", "action: " + str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public void startActivityForResult(Intent intent, int i) {
        AbstractC12888c cVar;
        boolean z;
        AbstractC25891b appContainer = getAppContainer();
        if (appContainer instanceof AbstractC24366a) {
            cVar = ((AbstractC24366a) appContainer).mo87129f();
        } else {
            cVar = null;
        }
        if (cVar == null) {
            if (!(this instanceof AbstractC67433a) || !((AbstractC67433a) this).mo234169i()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                cVar = getGadgetInteractiveProxy();
            }
        }
        if (cVar != null) {
            cVar.startActivityForResult(intent, i);
        } else {
            this.f170065d.startActivityForResult(intent, i);
        }
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public LKBasePluginResult sendEvent(String str, JSONObject jSONObject, AbstractC25894e eVar) {
        AbstractC25891b currentNode = getCurrentNode();
        if (currentNode == null) {
            return LKBasePluginResult.f64237b;
        }
        LKEvent a = new LKEvent.C25888a().mo92168a(str).mo92169a(jSONObject).mo92162a(currentNode.mo49749b()).mo92171a();
        if (eVar != null) {
            a.mo92122a(eVar);
        }
        return sendEvent(a);
    }
}
