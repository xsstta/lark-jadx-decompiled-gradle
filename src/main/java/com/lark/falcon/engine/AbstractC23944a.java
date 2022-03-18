package com.lark.falcon.engine;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.lark.falcon.engine.AbstractC23944a;
import com.lark.falcon.engine.p1058b.C23950b;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25559b;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25561d;
import com.ss.android.lark.sdk.C53241h;
import com.tt.frontendapiinterface.IBackPressedListener;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.lark.falcon.engine.a */
public abstract class AbstractC23944a implements AbstractC25561d {

    /* renamed from: a */
    public IAppContext f59255a;

    /* renamed from: b */
    public String f59256b;

    /* renamed from: c */
    protected String f59257c;

    /* renamed from: d */
    protected AbstractC25558a f59258d;

    /* renamed from: e */
    protected Context f59259e;

    /* renamed from: f */
    private final C23945a<AbstractC25559b, IBackPressedListener> f59260f = new C23945a<>(IBackPressedListener.class);

    /* access modifiers changed from: private */
    /* renamed from: com.lark.falcon.engine.a$b */
    public interface AbstractC23946b {
        void onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo85947c();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo85943a() {
        return C67485a.m262488a(this.f59255a).mo234275E().mo85963a(this.f59259e, this.f59258d.mo88702c());
    }

    /* renamed from: b */
    public void mo85945b() {
        this.f59260f.mo85950a();
        this.f59255a = null;
        this.f59259e = null;
        AbstractC25558a aVar = this.f59258d;
        if (aVar != null) {
            aVar.mo88704e();
            this.f59258d = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo85948d() {
        new C67500a(C67501b.aF, this.f59255a).addCategoryValue("worker", this.f59256b).addCategoryValue("workerJssdkVersion", mo85943a()).flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo85949e() {
        new C67500a(C67501b.aE, this.f59255a).setResultTypeFail().addCategoryValue("worker", this.f59256b).addCategoryValue("workerJssdkVersion", mo85943a()).flush();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lark.falcon.engine.a$a */
    public class C23945a<T, O> {

        /* renamed from: b */
        private final Map<T, O> f59262b = new ConcurrentHashMap();

        /* renamed from: c */
        private final Class f59263c;

        /* renamed from: a */
        public void mo85950a() {
            for (T t : this.f59262b.keySet()) {
                mo85952b(t);
            }
            this.f59262b.clear();
        }

        /* renamed from: b */
        public void mo85952b(T t) {
            if (!this.f59262b.containsKey(t)) {
                C53241h.m205894a("BaseJsWorkerWrapper", "not register");
                return;
            }
            AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(AbstractC23944a.this.f59255a);
            if (inst == null) {
                C53241h.m205894a("BaseJsWorkerWrapper", "unRegister application is null");
            } else if (!m87553a((Object) t, (AbstractC23946b) new AbstractC23946b(t, inst) {
                /* class com.lark.falcon.engine.$$Lambda$a$a$hf8kKJFFCChu27ppmgI_zNYr5Jo */
                public final /* synthetic */ Object f$1;
                public final /* synthetic */ AppbrandApplicationImpl f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.lark.falcon.engine.AbstractC23944a.AbstractC23946b
                public final void onBackPressed() {
                    AbstractC23944a.C23945a.this.m87552a((AbstractC23944a.C23945a) this.f$1, (Object) this.f$2);
                }
            })) {
                C53241h.m205894a("BaseJsWorkerWrapper", "unRegister error");
            }
        }

        /* renamed from: a */
        public void mo85951a(T t) {
            if (t == null) {
                C53241h.m205894a("BaseJsWorkerWrapper", "listener is null");
            } else if (this.f59262b.containsKey(t)) {
                C53241h.m205894a("BaseJsWorkerWrapper", "already register listener");
            } else {
                AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(AbstractC23944a.this.f59255a);
                if (inst == null) {
                    C53241h.m205894a("BaseJsWorkerWrapper", "register application is null");
                } else if (!m87553a((Object) t, (AbstractC23946b) new AbstractC23946b(inst, t) {
                    /* class com.lark.falcon.engine.$$Lambda$a$a$NEy6YMAUMRJ_oU6iJTkrh2Q02TI */
                    public final /* synthetic */ AppbrandApplicationImpl f$1;
                    public final /* synthetic */ Object f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.lark.falcon.engine.AbstractC23944a.AbstractC23946b
                    public final void onBackPressed() {
                        AbstractC23944a.C23945a.this.m87551a((AbstractC23944a.C23945a) this.f$1, (AppbrandApplicationImpl) this.f$2);
                    }
                })) {
                    C53241h.m205894a("BaseJsWorkerWrapper", "unKnow listener");
                }
            }
        }

        public C23945a(Class cls) {
            this.f59263c = cls;
        }

        /* access modifiers changed from: private */
        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.Map<T, O> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m87551a(AppbrandApplicationImpl appbrandApplicationImpl, Object obj) {
            RenderViewManager renderViewManager = appbrandApplicationImpl.getRenderViewManager();
            if (renderViewManager != null) {
                AbstractC25559b bVar = (AbstractC25559b) obj;
                bVar.getClass();
                $$Lambda$VH9rBbcsN71ngMPhqkmSwdFqdlc r1 = new IBackPressedListener() {
                    /* class com.lark.falcon.engine.$$Lambda$VH9rBbcsN71ngMPhqkmSwdFqdlc */

                    @Override // com.tt.frontendapiinterface.IBackPressedListener
                    public final boolean onBackPressed() {
                        return AbstractC25559b.this.onBackPressed();
                    }
                };
                this.f59262b.put(obj, r1);
                RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
                if (currentIRender != null) {
                    currentIRender.registerBackPressedListener(r1);
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m87552a(Object obj, AppbrandApplicationImpl appbrandApplicationImpl) {
            RenderViewManager.IRender currentIRender;
            O o = this.f59262b.get(obj);
            RenderViewManager renderViewManager = appbrandApplicationImpl.getRenderViewManager();
            if (renderViewManager != null && (currentIRender = renderViewManager.getCurrentIRender()) != null) {
                currentIRender.unregisterBackPressedListener(o);
            }
        }

        /* renamed from: a */
        private boolean m87553a(T t, AbstractC23946b bVar) {
            if (!IBackPressedListener.class.isAssignableFrom(this.f59263c) || !AbstractC25559b.class.isAssignableFrom(t.getClass())) {
                return false;
            }
            bVar.onBackPressed();
            return true;
        }
    }

    @Override // com.larksuite.component.openplatform.plugins.p1144c.AbstractC25560c
    /* renamed from: a */
    public void mo85944a(AbstractC25559b bVar) {
        if (bVar == null) {
            C53241h.m205894a("BaseJsWorkerWrapper", "back listener is null");
        } else {
            this.f59260f.mo85951a(bVar);
        }
    }

    @Override // com.larksuite.component.openplatform.plugins.p1144c.AbstractC25560c
    /* renamed from: b */
    public void mo85946b(AbstractC25559b bVar) {
        if (bVar == null) {
            C53241h.m205894a("BaseJsWorkerWrapper", "unRegister listener is null");
        } else {
            this.f59260f.mo85952b(bVar);
        }
    }

    /* renamed from: a */
    private void m87543a(IAppContext iAppContext, AbstractC25558a aVar) {
        C23950b E = C67485a.m262488a(this.f59255a).mo234275E();
        E.mo85966a(this.f59255a, aVar.mo88699a(), aVar.mo88702c(), aVar.mo88701b());
        E.mo85967b(iAppContext.getApplicationContext(), aVar.mo88702c());
    }

    public AbstractC23944a(IAppContext iAppContext, AbstractC25558a aVar) {
        this.f59255a = iAppContext;
        this.f59258d = aVar;
        this.f59259e = iAppContext.getApplicationContext();
        Context applicationContext = iAppContext.getApplicationContext();
        this.f59256b = aVar.mo88702c();
        if (C25529d.m91170k(this.f59255a)) {
            File c = C12791h.m52865c(applicationContext);
            File file = new File(c, aVar.mo88702c() + ".js");
            if (file.exists()) {
                this.f59257c = file.getAbsolutePath();
            }
        }
        if (TextUtils.isEmpty(this.f59257c)) {
            this.f59257c = C67485a.m262488a(this.f59255a).mo234275E().mo85964a(this.f59255a, aVar.mo88699a(), this.f59256b);
        }
        m87543a(iAppContext, aVar);
    }
}
