package com.larksuite.component.openplatform.core.container.p1118a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.plugin_annotation.bean.PluginEnv;
import com.bytedance.ee.lark.plugin_annotation.bean.Scope;
import com.larksuite.component.openplatform.api.AbstractC24361a;
import com.larksuite.component.openplatform.api.AbstractC24365b;
import com.larksuite.component.openplatform.api.entity.C24377a;
import com.larksuite.component.openplatform.api.entity.OPContainerBundle;
import com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum;
import com.larksuite.component.openplatform.api.p1100a.AbstractC24362a;
import com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24369b;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24370c;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24371d;
import com.larksuite.component.openplatform.core.component.AbstractC24428a;
import com.larksuite.component.openplatform.core.component.C24436d;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.larksuite.component.openplatform.core.container.p1120b.C24473a;
import com.larksuite.component.openplatform.core.loader.abs.AbstractC24507b;
import com.larksuite.component.openplatform.core.loader.abs.AbstractC24509c;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1109b.C24381a;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24392b;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24396d;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24398e;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24399f;
import com.larksuite.component.openplatform.core.p1113b.C24402a;
import com.larksuite.component.openplatform.core.p1114c.C24423a;
import com.larksuite.component.openplatform.core.p1121d.C24498b;
import com.larksuite.component.openplatform.core.plugin.C24577a;
import com.larksuite.component.openplatform.core.plugin.OPAbsAppContainerPlugin;
import com.larksuite.component.openplatform.core.plugin.OPFireEventPlugin;
import com.larksuite.component.openplatform.core.plugin.OPLinkTracePlugin;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.core.utils.p1136a.C25526b;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.component.openplatform.plugins.p1142a.AbstractC25556c;
import com.larksuite.component.openplatform.plugins.p1142a.C25552a;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.core.AbstractC25922a;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.entity.LKPluginInterceptResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import ee.android.framework.manis.C68183b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.container.a.b */
public abstract class AbstractC24461b extends AbstractC25922a implements AbstractC24370c, AbstractC24469d {

    /* renamed from: a */
    protected OPContainerBundle f60351a;

    /* renamed from: b */
    protected LKOpenApiAccessConfig f60352b;

    /* renamed from: c */
    protected String f60353c;

    /* renamed from: d */
    public String f60354d;

    /* renamed from: e */
    public Context f60355e;

    /* renamed from: f */
    public FrameLayout f60356f;

    /* renamed from: g */
    protected Bundle f60357g;

    /* renamed from: h */
    protected C24381a f60358h;

    /* renamed from: i */
    public IAppContext f60359i;

    /* renamed from: j */
    protected AbstractC24364a f60360j;

    /* renamed from: l */
    private String f60361l;

    /* renamed from: m */
    private String f60362m;

    /* renamed from: n */
    private List<AbstractC24362a> f60363n;

    /* renamed from: o */
    private AbstractC24362a f60364o;

    /* renamed from: p */
    private AbstractC24507b f60365p;

    /* renamed from: q */
    private AbstractC24370c f60366q;

    /* renamed from: r */
    private OPContainerLifecycleEventEnum f60367r;

    /* renamed from: s */
    private Set<AbstractC24369b> f60368s;

    /* renamed from: t */
    private final AtomicBoolean f60369t;

    /* renamed from: u */
    private final Boolean f60370u;

    /* renamed from: v */
    private AbstractC24371d f60371v;

    /* renamed from: w */
    private final C24473a f60372w;

    /* renamed from: x */
    private AtomicBoolean f60373x;

    /* renamed from: a */
    public abstract IAppContext mo87278a(Context context);

    /* renamed from: a */
    public abstract AbstractC24362a mo87279a(C24436d dVar);

    /* renamed from: a */
    public abstract void mo87281a(Bundle bundle);

    /* renamed from: g */
    public abstract AppType mo87289g();

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24469d
    /* renamed from: h */
    public synchronized void mo87290h() {
    }

    /* renamed from: m */
    public boolean mo87295m() {
        return true;
    }

    /* renamed from: r */
    public boolean mo87300r() {
        return false;
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a, com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: b */
    public Context mo49749b() {
        return this.f60355e;
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a
    /* renamed from: d */
    public IAppContext mo87113d() {
        return this.f60359i;
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24469d
    /* renamed from: k */
    public AbstractC24362a mo87293k() {
        return this.f60364o;
    }

    /* renamed from: n */
    public FrameLayout mo87296n() {
        return this.f60356f;
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24469d
    /* renamed from: o */
    public Set<AbstractC24369b> mo87297o() {
        return this.f60368s;
    }

    /* renamed from: q */
    public LKOpenApiAccessConfig mo87299q() {
        return this.f60352b;
    }

    /* renamed from: a */
    public void mo87284a(AbstractC25904o oVar) {
        if (this.f60373x.get()) {
            Log.m165389i("OP_SDK_AbsOPContainerImpl", "this is mock container");
            return;
        }
        synchronized (oVar) {
            if (!this.f60369t.get()) {
                oVar.mo92200a(C24423a.m89091b());
                AppBrandLogger.m52830i("OP_SDK_AbsOPContainerImpl", "register plugin");
                this.f60369t.set(true);
            }
        }
    }

    /* renamed from: a */
    public boolean mo87286a(AbstractC24362a aVar) {
        if (aVar == null) {
            AppBrandLogger.m52829e("OP_SDK_AbsOPContainerImpl", "component is null");
            return false;
        }
        AbstractC24362a aVar2 = null;
        synchronized (this.f60363n) {
            Iterator<AbstractC24362a> it = this.f60363n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC24362a next = it.next();
                if (next.equals(aVar)) {
                    it.remove();
                    aVar2 = next;
                    break;
                }
            }
            mo87355c(aVar2);
        }
        return aVar2 != null;
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a
    /* renamed from: a */
    public void mo87108a(OPContainerLifecycleEventEnum oPContainerLifecycleEventEnum, Object... objArr) {
        if (m89224A()) {
            mo49119a("20001", "CONTAINER_STATUS_MSG_IS_DESTROYED");
            AppBrandLogger.m52829e("OP_SDK_AbsOPContainerImpl", "onLifecycleEvent : " + oPContainerLifecycleEventEnum + " but container has been destroyed");
            return;
        }
        int i = C244676.f60383a[oPContainerLifecycleEventEnum.ordinal()];
        if (i == 1) {
            AbstractC24362a aVar = this.f60364o;
            if (aVar != null) {
                aVar.mo87158d();
            } else {
                AppBrandLogger.m52829e("OP_SDK_AbsOPContainerImpl", "onLifecycleEvent ignore : no current component on " + oPContainerLifecycleEventEnum);
            }
        } else if (i == 2) {
            AbstractC24362a aVar2 = this.f60364o;
            if (aVar2 != null) {
                aVar2.mo87159e();
            } else {
                AppBrandLogger.m52829e("OP_SDK_AbsOPContainerImpl", "onLifecycleEvent ignore : no current component on " + oPContainerLifecycleEventEnum);
            }
        } else if (i == 3) {
            AbstractC25891b t = mo92182t();
            if (t instanceof AbstractC24365b) {
                ((AbstractC24365b) t).mo87127a((AbstractC24361a) this);
            }
            this.f60358h.mo87168b();
            AbstractC24370c cVar = this.f60366q;
            if (cVar != null) {
                cVar.ai_();
                this.f60366q = null;
            }
        }
        this.f60367r = oPContainerLifecycleEventEnum;
    }

    @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
    /* renamed from: a */
    public void mo49119a(String str, String str2) {
        AbstractC24370c cVar = this.f60366q;
        if (cVar != null) {
            cVar.mo49119a(str, str2);
        }
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24469d
    /* renamed from: a */
    public void mo87283a(AbstractC24507b bVar) {
        this.f60365p = bVar;
    }

    /* renamed from: a */
    public void mo87285a(ConcurrentLinkedDeque<AbstractC24387a> concurrentLinkedDeque) {
        concurrentLinkedDeque.add(new C24396d());
        concurrentLinkedDeque.add(new C24399f());
        concurrentLinkedDeque.add(new C24392b());
        concurrentLinkedDeque.add(new C24398e());
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a
    /* renamed from: a */
    public void mo87110a(String str, JSONObject jSONObject) {
        if (mo87292j() != null) {
            mo87292j().mo87124a(str, jSONObject.toString());
            return;
        }
        AppBrandLogger.m52829e("OP_SDK_AbsOPContainerImpl", "worker not bind!");
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a
    /* renamed from: a */
    public void mo87109a(Class cls, Object obj) {
        C24498b.m89361a().mo87140a(cls, obj);
    }

    /* renamed from: s */
    private void mo87354s() {
        m89226b(mo92183u());
    }

    @Override // com.larksuite.component.openplatform.api.p1103b.AbstractC24366a
    /* renamed from: f */
    public AbstractC12888c mo87129f() {
        return this.f60372w.mo87129f();
    }

    /* renamed from: A */
    private boolean m89224A() {
        if (this.f60367r == OPContainerLifecycleEventEnum.ON_DESTROY) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private void m89229y() {
        this.f64220k.mo92248a(new C24402a(this.f60359i));
    }

    /* renamed from: z */
    private void m89230z() {
        if (!this.f60369t.get()) {
            mo87284a(mo92183u());
        }
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a
    /* renamed from: e */
    public void mo87114e() {
        AbstractC24371d dVar = this.f60371v;
        if (dVar != null) {
            dVar.getClass();
            C67866g.m264027a(new Runnable() {
                /* class com.larksuite.component.openplatform.core.container.p1118a.$$Lambda$A1v2GQmUKFjP7iyQJgT8S95rYs */

                public final void run() {
                    AbstractC24371d.this.mo87137a();
                }
            });
        }
    }

    @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
    /* renamed from: a */
    public void mo49118a() {
        AbstractC24370c cVar = this.f60366q;
        if (cVar != null) {
            cVar.mo49118a();
        }
    }

    /* renamed from: j */
    public AbstractC24364a mo87292j() {
        AbstractC24364a aVar = this.f60360j;
        if (aVar != null) {
            return aVar;
        }
        AbstractC24362a aVar2 = this.f60364o;
        if (aVar2 instanceof AbstractC24428a) {
            return ((AbstractC24428a) aVar2).mo87219h();
        }
        return aVar;
    }

    /* renamed from: p */
    public Bundle mo87298p() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f60357g;
        if (bundle2 != null) {
            bundle.putString("host", bundle2.getString("host"));
        }
        return bundle;
    }

    /* renamed from: com.larksuite.component.openplatform.core.container.a.b$6 */
    static /* synthetic */ class C244676 {

        /* renamed from: a */
        static final /* synthetic */ int[] f60383a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum[] r0 = com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b.C244676.f60383a = r0
                com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum r1 = com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum.ON_SHOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b.C244676.f60383a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum r1 = com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum.ON_HIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b.C244676.f60383a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum r1 = com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b.C244676.<clinit>():void");
        }
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a
    /* renamed from: c */
    public boolean mo87112c() {
        FrameLayout frameLayout = this.f60356f;
        if (frameLayout == null) {
            AppBrandLogger.m52829e("OP_SDK_AbsOPContainerImpl", "app view is null");
            return false;
        }
        ViewParent parent = frameLayout.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f60356f);
            return true;
        }
        AppBrandLogger.m52829e("OP_SDK_AbsOPContainerImpl", "app view has no parent");
        return false;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b, com.larksuite.framework.apiplugin.core.AbstractC25922a
    public void ah_() {
        super.ah_();
        synchronized (this.f60363n) {
            for (int i = 0; i < this.f60363n.size(); i++) {
                AbstractC24362a aVar = this.f60363n.get(i);
                if (aVar != null) {
                    mo87355c(aVar);
                }
            }
        }
        this.f60363n.clear();
        AbstractC24364a aVar2 = this.f60360j;
        if (aVar2 != null) {
            aVar2.mo87125b();
        }
        FrameLayout frameLayout = this.f60356f;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f60356f = null;
        }
        this.f60364o = null;
        this.f60355e = null;
        this.f60372w.mo87311a();
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24469d
    /* renamed from: i */
    public AbstractC24362a mo87291i() {
        AbstractC24509c cVar;
        final AbstractC24362a a;
        synchronized (this.f60363n) {
            C24436d dVar = new C24436d();
            dVar.f60295a = this.f60361l;
            AbstractC24507b bVar = this.f60365p;
            if (bVar == null) {
                cVar = null;
            } else {
                cVar = bVar.mo87359a();
            }
            dVar.f60297c = cVar;
            dVar.f60298d = this.f60355e;
            dVar.f60296b = this.f60362m;
            a = mo87279a(dVar);
            a.mo92177a(this);
            this.f60364o = a;
            this.f60363n.add(a);
            if (mo87295m()) {
                C67866g.m264027a(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b.RunnableC244632 */

                    public void run() {
                        if (AbstractC24461b.this.f60356f != null) {
                            AbstractC24461b.this.f60356f.addView(a.mo87117c(), new FrameLayout.LayoutParams(-1, -1));
                        }
                    }
                });
            }
            AppBrandLogger.m52830i("OP_SDK_AbsOPContainerImpl", "component list size:" + this.f60363n.size());
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo87294l() {
        this.f60358h = new C24381a(this);
        ConcurrentLinkedDeque<AbstractC24387a> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
        mo87285a(concurrentLinkedDeque);
        this.f60358h.mo87167a(concurrentLinkedDeque);
        this.f60358h.mo87165a(this);
        AppBrandLogger.m52828d("OP_SDK_AbsOPContainerImpl", "initLaunchScheduler ");
        if (mo87300r()) {
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b.RunnableC244665 */

                public void run() {
                    AppBrandLogger.m52830i("OP_SDK_AbsOPContainerImpl", "initLaunchScheduler async");
                    AbstractC24461b.this.f60358h.mo87164a(AbstractC24461b.this.f60359i, AbstractC24461b.this.f60357g, false);
                }
            });
            return;
        }
        AppBrandLogger.m52830i("OP_SDK_AbsOPContainerImpl", "initLaunchScheduler sync");
        this.f60358h.mo87164a(this.f60359i, this.f60357g, true);
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24469d
    /* renamed from: b */
    public void mo87287b(AbstractC24362a aVar) {
        this.f60364o = aVar;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25899j, com.larksuite.framework.apiplugin.core.AbstractC25922a
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        m89230z();
        return super.handleEvent(lKEvent);
    }

    /* renamed from: c */
    private void mo87355c(final AbstractC24362a aVar) {
        if (aVar != null) {
            C67866g.m264027a(new Runnable() {
                /* class com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b.RunnableC244643 */

                public void run() {
                    if (!(aVar.mo87117c() == null || AbstractC24461b.this.f60356f == null)) {
                        AbstractC24461b.this.f60356f.removeView(aVar.mo87117c());
                    }
                    aVar.ah_();
                    aVar.mo92177a((AbstractC25891b) null);
                }
            });
        }
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25900k, com.larksuite.framework.apiplugin.core.AbstractC25922a
    /* renamed from: a */
    public LKPluginInterceptResult mo87280a(LKEvent lKEvent) {
        m89230z();
        return super.mo87280a(lKEvent);
    }

    /* renamed from: b */
    private void m89226b(final AbstractC25904o oVar) {
        if (this.f60370u.booleanValue() || !C67866g.m264030a()) {
            mo87284a(oVar);
        } else {
            C67866g.m264032c(new Runnable() {
                /* class com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b.RunnableC244621 */

                public void run() {
                    AbstractC24461b.this.mo87284a(oVar);
                }
            });
        }
    }

    public AbstractC24461b(LKOpenApiAccessConfig lKOpenApiAccessConfig) {
        this.f60369t = new AtomicBoolean(false);
        this.f60370u = true;
        this.f60372w = new C24473a();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f60373x = atomicBoolean;
        atomicBoolean.set(true);
        this.f60352b = lKOpenApiAccessConfig;
        m89225a(PluginEnv.BIZ_ENV);
    }

    /* renamed from: a */
    private void m89225a(PluginEnv pluginEnv) {
        AbstractC25937e a;
        AbstractC25556c cVar = (AbstractC25556c) C24498b.m89361a().mo87139a(AbstractC25556c.class);
        if (cVar != null && (a = cVar.mo88696a(new C25552a.C25554a().mo88693a(mo92183u()).mo88690a(pluginEnv).mo88692a(this.f60352b).mo88691a(Scope.CONTAINER).mo88694a())) != null) {
            mo92183u().mo92199a(a);
        }
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a
    /* renamed from: a */
    public void mo87107a(final ViewGroup viewGroup) {
        if (viewGroup == null) {
            AppBrandLogger.m52829e("OP_SDK_AbsOPContainerImpl", "slot is null!");
            mo49119a("20002", "CONTAINER_STATUS_MSG_NO_SLOT");
            return;
        }
        FrameLayout frameLayout = this.f60356f;
        if (frameLayout == null || frameLayout.getParent() != null) {
            AppBrandLogger.m52831w("OP_SDK_AbsOPContainerImpl", "this renderView has parent");
            mo49119a("20003", "CONTAINER_STATUS_MSG_PARENT_SLOT_EXIST");
            return;
        }
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b.RunnableC244654 */

            public void run() {
                if (AbstractC24461b.this.f60356f == null || AbstractC24461b.this.f60356f.getParent() != null) {
                    AbstractC24461b.this.mo49119a("20003", "CONTAINER_STATUS_MSG_PARENT_SLOT_EXIST");
                } else {
                    viewGroup.addView(AbstractC24461b.this.f60356f, new ViewGroup.LayoutParams(-1, -1));
                }
            }
        });
    }

    @Override // com.larksuite.component.openplatform.api.p1103b.AbstractC24366a
    /* renamed from: a */
    public void mo87128a(AbstractC12888c cVar) {
        this.f60372w.mo87128a(cVar);
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24469d
    /* renamed from: a */
    public void mo87282a(AbstractC24364a aVar) {
        this.f60360j = aVar;
    }

    /* renamed from: c */
    public void mo87288c(String str, String str2) {
        if (mo87293k() == null) {
            AppBrandLogger.m52829e("OP_SDK_AbsOPContainerImpl", "updateData :no available component! ");
            return;
        }
        mo87293k().mo87116a(str2);
    }

    public AbstractC24461b(OPContainerBundle oPContainerBundle, String str) {
        this.f60369t = new AtomicBoolean(false);
        this.f60370u = true;
        this.f60372w = new C24473a();
        this.f60373x = new AtomicBoolean(false);
        this.f60351a = oPContainerBundle;
        this.f60353c = str;
        this.f60363n = new ArrayList();
        this.f60355e = oPContainerBundle.mo87153d();
        Bundle c = oPContainerBundle.mo87152c();
        this.f60357g = c;
        if (c == null) {
            this.f60357g = new Bundle();
        }
        this.f60359i = mo87278a(this.f60355e);
        this.f60354d = C25529d.m91139a(this.f60357g, C24377a.f60157b);
        this.f60359i.setAppId(str);
        this.f60359i.setAppIdentify(this.f60354d);
        C25526b.m91116a("op_app_container_start", this.f60359i, null, null, null);
        this.f60361l = C25529d.m91139a(this.f60357g, C24377a.f60159d);
        this.f60362m = C25529d.m91140a(this.f60357g, C24377a.f60161f, "");
        Serializable b = C25529d.m91149b(this.f60357g, "apiAccessConfig");
        if (b instanceof LKOpenApiAccessConfig) {
            this.f60359i.setApiAccessConfig((LKOpenApiAccessConfig) b);
        }
        this.f60352b = this.f60359i.getApiAccessConfig();
        this.f60357g.putString(C24377a.f60156a, str);
        this.f60359i.bindAppContainer(this);
        this.f60359i.setCurrentActivity((Activity) this.f60355e);
        this.f60366q = oPContainerBundle.mo87154e();
        this.f60368s = oPContainerBundle.mo87155f();
        this.f60371v = oPContainerBundle.mo87151b();
        this.f60356f = new FrameLayout(this.f60355e);
        mo87281a(this.f60357g);
        this.f60359i.putExtra("startParams", this.f60357g);
        mo87354s();
        if (ProcessUtil.isMainProcess(this.f60355e)) {
            m89225a((PluginEnv) null);
        } else {
            C24577a.m89613a((IHostProcessHandleEvent) C68183b.m264839a().mo237086a(this.f60355e, IHostProcessHandleEvent.class));
            m89225a(PluginEnv.APP_ENV);
        }
        mo92183u().mo92199a(new OPAbsAppContainerPlugin(this));
        mo92183u().mo92199a(new OPFireEventPlugin(this.f60359i));
        mo92183u().mo92199a(new OPLinkTracePlugin(this.f60359i));
        m89229y();
        mo87294l();
        C25526b.m91116a("op_app_container_loaded", this.f60359i, "success", null, null);
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a
    /* renamed from: a */
    public void mo87106a(int i, String[] strArr, int[] iArr) {
        if (((i >> 16) & 65535) == 0 && (this.f60355e instanceof Activity)) {
            C66588h.m260183a().mo232192a((Activity) this.f60355e, strArr, iArr);
        }
    }
}
