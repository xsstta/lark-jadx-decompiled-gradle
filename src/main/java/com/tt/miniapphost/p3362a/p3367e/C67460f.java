package com.tt.miniapphost.p3362a.p3367e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12886a;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12887b;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.miniapphost.api.AbstractC67463a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67435c;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.util.MiniAppProcessUtils;
import com.tt.refer.common.base.AppType;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.tt.miniapphost.a.e.f */
public class C67460f extends AbstractC67456b implements AbstractC67433a {

    /* renamed from: c */
    private String f170083c;

    /* renamed from: d */
    private AbstractC67434b f170084d;

    /* renamed from: e */
    private volatile boolean f170085e;

    /* renamed from: f */
    private AbstractC12887b f170086f;

    /* renamed from: g */
    private AbstractC67463a f170087g;

    /* renamed from: h */
    private boolean f170088h;

    /* renamed from: i */
    private final AtomicBoolean f170089i = new AtomicBoolean(false);

    /* renamed from: j */
    private final Object f170090j = new Object();

    /* renamed from: k */
    private final Stack<AbstractC25891b> f170091k;

    /* renamed from: l */
    private final Object f170092l = new Object();

    /* renamed from: m */
    private final Stack<Activity> f170093m;

    /* renamed from: n */
    private final Object f170094n = new Object();

    /* renamed from: o */
    private final List<C67455a> f170095o;

    /* renamed from: p */
    private final OPTrace f170096p;

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: c */
    public void mo234163c() {
        this.f170085e = true;
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: a */
    public AbstractC67434b mo234156a() {
        return this.f170084d;
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: b */
    public boolean mo234162b() {
        return this.f170085e;
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: d */
    public String mo234164d() {
        return this.f170083c;
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: e */
    public AbstractC12887b mo234165e() {
        return this.f170086f;
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: g */
    public boolean mo234167g() {
        return this.f170088h;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public AppType getAppType() {
        return AppType.GadgetAPP;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void initTrace() {
        super.initTrace();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void startDestroy() {
        super.startDestroy();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void unRegisterOnResultAllPlugin() {
        super.unRegisterOnResultAllPlugin();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ LKOpenApiAccessConfig getApiAccessConfig() {
        return super.getApiAccessConfig();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ String getAppId() {
        return super.getAppId();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ String getAppIdentify() {
        return super.getAppIdentify();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ String getContainerType() {
        return super.getContainerType();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ Activity getCurrentActivity() {
        return super.getCurrentActivity();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ int getCurrentTheme() {
        return super.getCurrentTheme();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ AbstractC25576a getDefaultPluginContainer() {
        return super.getDefaultPluginContainer();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ Object getExtra() {
        return super.getExtra();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ AbstractC12888c getGadgetInteractiveProxy() {
        return super.getGadgetInteractiveProxy();
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: h */
    public void mo234168h() {
        this.f170089i.set(true);
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: i */
    public boolean mo234169i() {
        return this.f170089i.get();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ boolean isDestroyed() {
        return super.isDestroyed();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ boolean isDestroying() {
        return super.isDestroying();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ boolean isEmbedContainer() {
        return super.isEmbedContainer();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ boolean isInParallelWindow() {
        return super.isInParallelWindow();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ boolean isNewContainer() {
        return super.isNewContainer();
    }

    @Override // com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: f */
    public String mo234166f() {
        AbstractC12887b bVar = this.f170086f;
        if (bVar == null) {
            return "";
        }
        return bVar.mo48643b();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public AbstractC25891b getCurrentNode() {
        if (mo234169i()) {
            return mo234198m();
        }
        return super.getCurrentNode();
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: k */
    public boolean mo234171k() {
        if (mo234200o() <= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public int mo234200o() {
        int size;
        synchronized (this.f170092l) {
            size = this.f170093m.size();
        }
        return size;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public AbstractC25891b getAppContainer() {
        AbstractC25891b m;
        if (!mo234169i() || (m = mo234198m()) == null) {
            return super.getAppContainer();
        }
        return m;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public AbstractC25905b getBridgeContext() {
        AbstractC25891b currentNode;
        if (!mo234169i() || (currentNode = getCurrentNode()) == null) {
            return super.getBridgeContext();
        }
        return currentNode.mo92184v();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public OPTrace getTracingSpan() {
        if (!mo234169i()) {
            return super.getTracingSpan();
        }
        OPTrace oPTrace = null;
        C67455a p = m262390p();
        if (p != null) {
            oPTrace = p.f170061d;
        }
        if (oPTrace == null) {
            return this.f170096p;
        }
        return oPTrace;
    }

    @Override // com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    /* renamed from: l */
    public void mo234196l() {
        AbstractC67463a aVar = this.f170087g;
        if (aVar != null) {
            aVar.mo234202a();
            this.f170087g = null;
        }
        C67448a.m262353a().mo234178a(this);
        this.f170084d = null;
        this.f170095o.clear();
        this.f170086f = null;
    }

    /* renamed from: p */
    private C67455a m262390p() {
        Activity n = mo234199n();
        C67455a aVar = null;
        if (n != null) {
            synchronized (this.f170094n) {
                Iterator<C67455a> it = this.f170095o.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C67455a next = it.next();
                    if (next.f170058a == n.hashCode()) {
                        aVar = next;
                        break;
                    }
                }
            }
        }
        return aVar;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public void destroy() {
        if (mo234169i()) {
            synchronized (this.f170092l) {
                if (!mo234171k()) {
                    this.f170093m.pop();
                    Log.m165389i("GadgetAppContext", "pop container");
                    return;
                }
                this.f170093m.clear();
            }
        }
        super.destroy();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public String getTraceId() {
        if (!mo234169i()) {
            return super.getTraceId();
        }
        String str = null;
        C67455a p = m262390p();
        if (p != null) {
            str = p.f170060c;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.m165389i("GadgetAppContextTrace", "use default traceId");
        return this.f170096p.getTracingID();
    }

    /* renamed from: m */
    public AbstractC25891b mo234198m() {
        AbstractC25891b bVar;
        synchronized (this.f170090j) {
            if (!this.f170091k.empty()) {
                bVar = this.f170091k.peek();
            } else {
                bVar = null;
            }
        }
        if (bVar == null) {
            bVar = this.f170062a;
        }
        if (bVar == null) {
            return this.f170063b;
        }
        return bVar;
    }

    /* renamed from: n */
    public Activity mo234199n() {
        if (!mo234169i()) {
            return getCurrentActivity();
        }
        synchronized (this.f170092l) {
            if (this.f170093m.empty()) {
                return null;
            }
            return this.f170093m.peek();
        }
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: j */
    public void mo234170j() {
        if (mo234169i()) {
            synchronized (this.f170090j) {
                if (this.f170091k.empty()) {
                    Log.m165389i("GadgetAppContext", "appContainer is empty stack");
                    return;
                }
                AbstractC25891b pop = this.f170091k.pop();
                if (pop != null) {
                    Log.m165389i("GadgetAppContext", "release node");
                    pop.ah_();
                    if (pop == this.f170063b) {
                        this.f170063b = null;
                        Log.m165389i("GadgetAppContext", "release base container");
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void putExtras(AbstractC12886a aVar) {
        super.putExtras(aVar);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void removeExtra(String str) {
        super.removeExtra(str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setApiAccessConfig(LKOpenApiAccessConfig lKOpenApiAccessConfig) {
        super.setApiAccessConfig(lKOpenApiAccessConfig);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3363a.AbstractC67433a, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setAppId(String str) {
        super.setAppId(str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setAppIdentify(String str) {
        super.setAppIdentify(str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setContainerType(String str) {
        super.setContainerType(str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setCurrentTheme(int i) {
        super.setCurrentTheme(i);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setExtra(Object obj) {
        super.setExtra(obj);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setGadgetInteractiveProxy(AbstractC12888c cVar) {
        super.setGadgetInteractiveProxy(cVar);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setInParallelWindow(boolean z) {
        super.setInParallelWindow(z);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void unRegisterOnResultPlugin(AbstractC25937e eVar) {
        super.unRegisterOnResultPlugin(eVar);
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: a */
    public void mo234159a(AbstractC67434b bVar) {
        this.f170084d = bVar;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public void bindAppContainer(AbstractC25891b bVar) {
        super.bindAppContainer(bVar);
        mo234158a(bVar);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ IBaseService findServiceByInterface(Class cls) {
        return super.findServiceByInterface(cls);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ LKBasePluginResult sendEvent(LKEvent lKEvent) {
        return super.sendEvent(lKEvent);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public void setDefaultPluginContainer(AbstractC25576a aVar) {
        super.setDefaultPluginContainer(aVar);
        mo234158a(aVar);
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: a */
    public void mo234161a(boolean z) {
        this.f170088h = z;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ Object getExtra(String str) {
        return super.getExtra(str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ LKBasePluginResult sendEvent(String str) {
        return super.sendEvent(str);
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: a */
    public void mo234158a(AbstractC25891b bVar) {
        if (mo234169i()) {
            synchronized (this.f170090j) {
                Iterator<AbstractC25891b> it = this.f170091k.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(bVar)) {
                        Log.m165389i("GadgetAppContext", "already set container");
                        return;
                    }
                }
                Log.m165389i("GadgetAppContext", "Container push stack");
                this.f170091k.push(bVar);
            }
        }
    }

    public C67460f(Context context) {
        super(context);
        LinkedList linkedList = new LinkedList();
        this.f170095o = linkedList;
        this.f170093m = new Stack<>();
        this.f170091k = new Stack<>();
        C67455a aVar = new C67455a();
        this.f170096p = aVar.f170061d;
        linkedList.add(aVar);
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: a */
    public void mo234157a(AbstractC12887b bVar) {
        if (bVar == null) {
            AppBrandLogger.m52829e("GadgetAppContext", " appContextKeyBuilder is null!");
        } else if (this.f170086f == null) {
            AppBrandLogger.m52830i("GadgetAppContext", "appContextKey:" + bVar.mo48643b());
            this.f170086f = bVar;
            setAppId(bVar.mo48642a());
            C67448a.m262353a().mo234177a(bVar);
            AbstractC67435c cVar = (AbstractC67435c) findServiceByInterface(AbstractC67435c.class);
            if (cVar != null) {
                cVar.mo149075a();
            }
        }
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public void setCurrentActivity(Activity activity) {
        super.setCurrentActivity(activity);
        if (mo234169i()) {
            synchronized (this.f170092l) {
                Iterator<Activity> it = this.f170093m.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(activity)) {
                        Log.m165389i("GadgetAppContext", "already set");
                        return;
                    }
                }
                Log.m165389i("GadgetAppContext", "Activity push stack");
                this.f170093m.push(activity);
                m262389a(activity.hashCode());
            }
        }
    }

    /* renamed from: a */
    private void m262389a(int i) {
        synchronized (this.f170094n) {
            if (this.f170095o.isEmpty()) {
                Log.m165389i("GadgetAppContext", "TraceList empty");
                C67455a aVar = new C67455a();
                aVar.mo234195a(i);
                this.f170095o.add(aVar);
            } else {
                boolean z = false;
                C67455a aVar2 = null;
                Iterator<C67455a> it = this.f170095o.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C67455a next = it.next();
                    if (next.f170058a == i) {
                        z = true;
                        Log.m165389i("GadgetAppContext", "traceId:" + next.f170060c + " already bind container.");
                        break;
                    } else if (!next.f170059b) {
                        Log.m165389i("GadgetAppContext", "traceId:" + next.f170060c + " need bind");
                        aVar2 = next;
                    }
                }
                if (!z) {
                    if (aVar2 != null) {
                        aVar2.mo234195a(i);
                    } else {
                        C67455a aVar3 = new C67455a();
                        aVar3.mo234195a(i);
                        this.f170095o.add(aVar3);
                        Log.m165389i("GadgetAppContext", "create new Trace");
                    }
                }
            }
        }
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67433a
    /* renamed from: a */
    public void mo234160a(String str) {
        this.f170083c = str;
        AppBrandLogger.m52830i("GadgetAppContext", "isMain:" + MiniAppProcessUtils.isMainProcess(getApplicationContext()) + " sandBoxName:" + str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void putExtra(String str, Object obj) {
        super.putExtra(str, obj);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ boolean registerService(Class cls, IBaseService iBaseService) {
        return super.registerService(cls, iBaseService);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ LKBasePluginResult sendEvent(String str, JSONObject jSONObject) {
        return super.sendEvent(str, jSONObject);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public void sendEvent(String str, Bundle bundle) {
        super.sendEvent(str, bundle);
        AbstractC67463a aVar = this.f170087g;
        if (aVar != null) {
            aVar.mo234203a(str, bundle);
        }
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ LKBasePluginResult sendEvent(String str, JSONObject jSONObject, AbstractC25894e eVar) {
        return super.sendEvent(str, jSONObject, eVar);
    }
}
