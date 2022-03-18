package com.tt.miniapphost.data;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.he.v8_inspect.Inspect;
import com.lark.falcon.engine.p1058b.C23950b;
import com.larksuite.component.openplatform.core.component.C24437e;
import com.larksuite.component.openplatform.core.plugin.device.C24843n;
import com.larksuite.component.openplatform.core.plugin.device.p1133d.C24819e;
import com.larksuite.suite.R;
import com.ss.android.lark.multitask.MultitaskHelper;
import com.ss.android.lark.multitask.task.AbstractC48369g;
import com.ss.android.lark.multitask.task.AbstractC48375n;
import com.ss.android.lark.multitask.task.AbstractC48378t;
import com.ss.android.lark.multitask.task.C48366c;
import com.ss.android.lark.multitask.task.DrawableIconFactory;
import com.ss.android.lark.multitask.task.EventTracker;
import com.ss.android.lark.multitask.task.GlobalTaskContainer;
import com.ss.android.lark.multitask.task.RemoteTaskContainer;
import com.ss.android.lark.multitask.task.Task;
import com.ss.android.lark.multitask.task.UrlIconFactory;
import com.tt.frontendapiinterface.ApiHandlerManager;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.aa.C65722b;
import com.tt.miniapp.ac.C65727a;
import com.tt.miniapp.ac.C65733b;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapp.audio.C65754b;
import com.tt.miniapp.audio.C65784d;
import com.tt.miniapp.event.C66037e;
import com.tt.miniapp.feedback.C66094d;
import com.tt.miniapp.feedback.C66100e;
import com.tt.miniapp.feedback.screenrecord.C66167d;
import com.tt.miniapp.feedback.screenrecord.C66172f;
import com.tt.miniapp.manager.C66432f;
import com.tt.miniapp.net.C66522i;
import com.tt.miniapp.net.C66528j;
import com.tt.miniapp.p3276d.p3277a.C65978a;
import com.tt.miniapp.p3283f.p3284a.C66041a;
import com.tt.miniapp.p3294i.C66203a;
import com.tt.miniapp.p3335u.C66998c;
import com.tt.miniapp.p3335u.p3336a.C66996c;
import com.tt.miniapp.p3357x.p3358a.C67404a;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.titlemenu.C66898a;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapp.webbridge.sync.p3355a.C67326b;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67549i;
import com.tt.miniapphost.MiniAppHostStarter;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.api.AbstractC67465c;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3362a.p3367e.AbstractC67457c;
import com.tt.miniapphost.p3369c.C67472a;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.option.p3397r.C67673c;
import com.tt.refer.common.base.AppType;
import com.tt.refer.impl.business.api.diagnose.entity.C67893b;

/* renamed from: com.tt.miniapphost.data.a */
public class C67485a extends AbstractC67457c {

    /* renamed from: A */
    private C65754b f170121A;

    /* renamed from: B */
    private final Object f170122B = new Object();

    /* renamed from: C */
    private C67549i f170123C;

    /* renamed from: D */
    private final Object f170124D = new Object();

    /* renamed from: E */
    private C67404a f170125E;

    /* renamed from: F */
    private final Object f170126F = new Object();

    /* renamed from: G */
    private C66898a f170127G;

    /* renamed from: H */
    private final Object f170128H = new Object();

    /* renamed from: I */
    private C66094d f170129I;

    /* renamed from: J */
    private final Object f170130J = new Object();

    /* renamed from: K */
    private C66100e f170131K;

    /* renamed from: L */
    private final Object f170132L = new Object();

    /* renamed from: M */
    private AbstractC65746a f170133M;

    /* renamed from: N */
    private final Object f170134N = new Object();

    /* renamed from: O */
    private C66996c f170135O;

    /* renamed from: P */
    private final Object f170136P = new Object();

    /* renamed from: Q */
    private C66037e f170137Q;

    /* renamed from: R */
    private final Object f170138R = new Object();

    /* renamed from: S */
    private C65722b f170139S;

    /* renamed from: T */
    private final Object f170140T = new Object();

    /* renamed from: U */
    private C66998c f170141U;

    /* renamed from: V */
    private final Object f170142V = new Object();

    /* renamed from: W */
    private C24843n f170143W;

    /* renamed from: X */
    private final Object f170144X = new Object();

    /* renamed from: Y */
    private C66041a f170145Y;

    /* renamed from: Z */
    private final Object f170146Z = new Object();

    /* renamed from: a */
    public volatile Handler f170147a;
    private C67472a aa;
    private final Object ab = new Object();
    private DialogC66908d ac;
    private final Object ad = new Object();
    private AbstractC67465c ae;
    private final Object af = new Object();
    private C23950b ag;
    private final Object ah = new Object();

    /* renamed from: ai  reason: collision with root package name */
    private C67326b f175469ai;
    private final Object aj = new Object();
    private C24437e ak;
    private final Object al = new Object();
    private Inspect am;
    private final Object an = new Object();
    private C67893b ao;
    private final Object ap = new Object();

    /* renamed from: b */
    private final C67488b f170148b = new C67488b();

    /* renamed from: c */
    private C66167d f170149c = new C66167d();

    /* renamed from: e */
    private C66172f f170150e = new C66172f();

    /* renamed from: f */
    private ApiHandlerManager f170151f;

    /* renamed from: g */
    private final Object f170152g = new Object();

    /* renamed from: h */
    private C66432f f170153h;

    /* renamed from: i */
    private final Object f170154i = new Object();

    /* renamed from: j */
    private MultitaskHelper f170155j;

    /* renamed from: k */
    private final Object f170156k = new Object();

    /* renamed from: l */
    private C66203a f170157l;

    /* renamed from: m */
    private final Object f170158m = new Object();

    /* renamed from: n */
    private final Object f170159n = new Object();

    /* renamed from: o */
    private C65727a f170160o;

    /* renamed from: p */
    private final Object f170161p = new Object();

    /* renamed from: q */
    private C65733b f170162q;

    /* renamed from: r */
    private final Object f170163r = new Object();

    /* renamed from: s */
    private C67673c f170164s;

    /* renamed from: t */
    private final Object f170165t = new Object();

    /* renamed from: u */
    private C66522i f170166u;

    /* renamed from: v */
    private final Object f170167v = new Object();

    /* renamed from: w */
    private C66528j f170168w;

    /* renamed from: x */
    private final Object f170169x = new Object();

    /* renamed from: y */
    private AppbrandApplicationImpl f170170y;

    /* renamed from: z */
    private final Object f170171z = new Object();

    /* renamed from: a */
    public C67488b mo234280a() {
        return this.f170148b;
    }

    /* renamed from: b */
    public C66167d mo234281b() {
        return this.f170149c;
    }

    /* renamed from: c */
    public C66172f mo234282c() {
        return this.f170150e;
    }

    /* renamed from: C */
    public void mo234273C() {
        DialogC66908d dVar = this.ac;
        if (dVar != null) {
            dVar.mo232931b();
            this.ac = null;
        }
    }

    /* renamed from: A */
    public C67472a mo234271A() {
        if (this.aa == null) {
            synchronized (this.ab) {
                if (this.aa == null) {
                    this.aa = new C67472a();
                }
            }
        }
        return this.aa;
    }

    /* renamed from: D */
    public AbstractC67465c mo234274D() {
        if (this.ae == null) {
            synchronized (this.af) {
                if (this.ae == null) {
                    this.ae = new C65978a();
                }
            }
        }
        return this.ae;
    }

    /* renamed from: E */
    public C23950b mo234275E() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new C23950b();
                }
            }
        }
        return this.ag;
    }

    /* renamed from: F */
    public Inspect mo234276F() {
        if (this.am == null) {
            synchronized (this.an) {
                if (this.am == null) {
                    this.am = new Inspect(this.f170082d);
                }
            }
        }
        return this.am;
    }

    /* renamed from: G */
    public C67326b mo234277G() {
        if (this.f175469ai == null) {
            synchronized (this.aj) {
                if (this.f175469ai == null) {
                    this.f175469ai = new C67326b();
                }
            }
        }
        return this.f175469ai;
    }

    /* renamed from: H */
    public C24437e mo234278H() {
        if (this.ak == null) {
            synchronized (this.al) {
                if (this.ak == null) {
                    this.ak = new C24437e(this.f170082d);
                }
            }
        }
        return this.ak;
    }

    /* renamed from: I */
    public C67893b mo234279I() {
        if (this.ao == null) {
            synchronized (this.ap) {
                if (this.ao == null) {
                    this.ao = new C67893b(this.f170082d);
                }
            }
        }
        return this.ao;
    }

    /* renamed from: d */
    public MultitaskHelper mo234283d() {
        if (this.f170155j == null) {
            synchronized (this.f170156k) {
                if (this.f170155j == null) {
                    this.f170155j = MultitaskHelper.m190620a((AbstractC48369g) new AbstractC48369g() {
                        /* class com.tt.miniapphost.data.C67485a.C674861 */

                        @Override // com.ss.android.lark.multitask.task.AbstractC48369g
                        public /* synthetic */ FragmentActivity p_() {
                            return AbstractC48369g.CC.$default$p_(this);
                        }

                        @Override // com.ss.android.lark.multitask.task.AbstractC48379u
                        /* renamed from: b */
                        public AbstractC48378t mo23783b() {
                            return new MiniAppHostStarter(MiniappHostBase.class);
                        }

                        @Override // com.ss.android.lark.multitask.task.AbstractC48379u, com.ss.android.lark.multitask.task.AbstractC48369g
                        public EventTracker O_() {
                            return new MiniAppMultitaskEventTracker(C67485a.this.f170082d);
                        }

                        @Override // com.ss.android.lark.multitask.task.AbstractC48379u
                        /* renamed from: a */
                        public Task mo23782a() {
                            return new C48366c(mo23785d()) {
                                /* class com.tt.miniapphost.data.C67485a.C674861.C674871 */

                                @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                                /* renamed from: c */
                                public String mo23791c() {
                                    return "gadget";
                                }

                                @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                                /* renamed from: b */
                                public CharSequence mo23790b() {
                                    return AppbrandApplicationImpl.getInst(C67485a.this.f170082d).getAppInfo().appName;
                                }

                                @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                                /* renamed from: a */
                                public Task.IconFactory mo23788a() {
                                    String str;
                                    if (AppbrandApplicationImpl.getInst(C67485a.this.f170082d).getAppInfo() != null) {
                                        str = AppbrandApplicationImpl.getInst(C67485a.this.f170082d).getAppInfo().icon;
                                    } else {
                                        str = null;
                                    }
                                    if (!TextUtils.isEmpty(str)) {
                                        return new UrlIconFactory(str);
                                    }
                                    return new DrawableIconFactory(R.drawable.microapp_m_multitask_icon, "microapp_m_multitask_icon");
                                }

                                @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                                /* renamed from: d */
                                public String mo23792d() {
                                    String str = AppbrandApplicationImpl.getInst(C67485a.this.f170082d).getAppInfo().appId;
                                    return "miniapp:" + str;
                                }

                                @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                                /* renamed from: a */
                                public void mo23789a(Bundle bundle) {
                                    bundle.putString("url", C67432a.m262319a(C67485a.this.f170082d).getSchema());
                                    super.mo23789a(bundle);
                                }
                            };
                        }

                        @Override // com.ss.android.lark.multitask.task.AbstractC48369g
                        /* renamed from: d */
                        public FragmentActivity mo23785d() {
                            return (FragmentActivity) C67485a.this.f170082d.getCurrentActivity();
                        }

                        @Override // com.ss.android.lark.multitask.task.AbstractC48379u
                        /* renamed from: e */
                        public AbstractC48375n mo23786e() {
                            if (ProcessUtil.isMainProcess(C67485a.this.f170082d.getApplicationContext())) {
                                return GlobalTaskContainer.f121801b;
                            }
                            return new RemoteTaskContainer();
                        }
                    }, false);
                }
            }
        }
        return this.f170155j;
    }

    /* renamed from: f */
    public ApiHandlerManager mo234285f() {
        if (this.f170151f == null) {
            synchronized (this.f170152g) {
                if (this.f170151f == null) {
                    this.f170151f = new ApiHandlerManager(this.f170082d);
                }
            }
        }
        return this.f170151f;
    }

    /* renamed from: g */
    public C66203a mo234286g() {
        if (this.f170157l == null) {
            synchronized (this.f170158m) {
                if (this.f170157l == null) {
                    this.f170157l = new C66203a(this.f170082d);
                }
            }
        }
        return this.f170157l;
    }

    /* renamed from: h */
    public C65727a mo234287h() {
        if (this.f170160o == null) {
            synchronized (this.f170161p) {
                if (this.f170160o == null) {
                    this.f170160o = new C65727a(this.f170082d);
                }
            }
        }
        return this.f170160o;
    }

    /* renamed from: i */
    public C65733b mo234288i() {
        if (this.f170162q == null) {
            synchronized (this.f170163r) {
                if (this.f170162q == null) {
                    this.f170162q = new C65733b(this.f170082d);
                }
            }
        }
        return this.f170162q;
    }

    /* renamed from: j */
    public C67673c mo234289j() {
        if (this.f170164s == null) {
            synchronized (this.f170165t) {
                if (this.f170164s == null) {
                    this.f170164s = new C67673c(this.f170082d);
                }
            }
        }
        return this.f170164s;
    }

    /* renamed from: k */
    public C66522i mo234290k() {
        if (this.f170166u == null) {
            synchronized (this.f170167v) {
                if (this.f170166u == null) {
                    this.f170166u = new C66522i(this.f170082d);
                }
            }
        }
        return this.f170166u;
    }

    /* renamed from: l */
    public C66528j mo234291l() {
        if (this.f170168w == null) {
            synchronized (this.f170169x) {
                if (this.f170168w == null) {
                    this.f170168w = new C66528j(this.f170082d);
                }
            }
        }
        return this.f170168w;
    }

    /* renamed from: m */
    public AppbrandApplicationImpl mo234292m() {
        if (this.f170170y == null) {
            synchronized (this.f170171z) {
                if (this.f170170y == null) {
                    this.f170170y = new AppbrandApplicationImpl(this.f170082d);
                }
            }
        }
        return this.f170170y;
    }

    /* renamed from: n */
    public C65754b mo234293n() {
        if (this.f170121A == null) {
            synchronized (this.f170122B) {
                if (this.f170121A == null) {
                    this.f170121A = new C65754b(mo234292m(), this.f170082d);
                }
            }
        }
        return this.f170121A;
    }

    /* renamed from: o */
    public C67549i mo234294o() {
        if (this.f170123C == null) {
            synchronized (this.f170124D) {
                if (this.f170123C == null) {
                    this.f170123C = new C67549i(this.f170082d);
                }
            }
        }
        return this.f170123C;
    }

    /* renamed from: p */
    public C66898a mo234295p() {
        if (this.f170127G == null) {
            synchronized (this.f170128H) {
                if (this.f170127G == null) {
                    this.f170127G = new C66898a();
                }
            }
        }
        return this.f170127G;
    }

    /* renamed from: q */
    public C66094d mo234296q() {
        if (this.f170129I == null) {
            synchronized (this.f170130J) {
                if (this.f170129I == null) {
                    this.f170129I = new C66094d(this.f170082d);
                }
            }
        }
        return this.f170129I;
    }

    /* renamed from: r */
    public C66100e mo234297r() {
        if (this.f170131K == null) {
            synchronized (this.f170132L) {
                if (this.f170131K == null) {
                    this.f170131K = new C66100e(this.f170082d);
                }
            }
        }
        return this.f170131K;
    }

    /* renamed from: s */
    public AbstractC65746a mo234298s() {
        if (this.f170133M == null) {
            synchronized (this.f170134N) {
                if (this.f170133M == null) {
                    this.f170133M = new C65784d(this.f170082d);
                }
            }
        }
        return this.f170133M;
    }

    /* renamed from: t */
    public C66996c mo234299t() {
        if (this.f170135O == null) {
            synchronized (this.f170136P) {
                if (this.f170135O == null) {
                    this.f170135O = new C66996c(this.f170082d);
                }
            }
        }
        return this.f170135O;
    }

    /* renamed from: u */
    public C66037e mo234300u() {
        if (this.f170137Q == null) {
            synchronized (this.f170138R) {
                if (this.f170137Q == null) {
                    this.f170137Q = new C66037e(this.f170082d);
                }
            }
        }
        return this.f170137Q;
    }

    /* renamed from: v */
    public C65722b mo234301v() {
        if (this.f170139S == null) {
            synchronized (this.f170140T) {
                if (this.f170139S == null) {
                    this.f170139S = new C65722b(this.f170082d);
                }
            }
        }
        return this.f170139S;
    }

    /* renamed from: w */
    public C67404a mo234302w() {
        if (this.f170125E == null) {
            synchronized (this.f170126F) {
                if (this.f170125E == null) {
                    this.f170125E = new C67404a(this.f170082d);
                }
            }
        }
        return this.f170125E;
    }

    /* renamed from: x */
    public C66998c mo234303x() {
        if (this.f170141U == null) {
            synchronized (this.f170142V) {
                if (this.f170141U == null) {
                    this.f170141U = new C66998c(this.f170082d);
                }
            }
        }
        return this.f170141U;
    }

    /* renamed from: y */
    public C24843n mo234304y() {
        if (this.f170143W == null) {
            synchronized (this.f170144X) {
                if (this.f170143W == null) {
                    this.f170143W = new C24843n(this.f170082d);
                }
            }
        }
        return this.f170143W;
    }

    /* renamed from: z */
    public C66041a mo234305z() {
        if (this.f170145Y == null) {
            synchronized (this.f170146Z) {
                if (this.f170145Y == null) {
                    this.f170145Y = new C66041a(this.f170082d);
                }
            }
        }
        return this.f170145Y;
    }

    /* renamed from: B */
    public DialogC66908d mo234272B() {
        DialogC66908d dVar = this.ac;
        if (dVar != null && !dVar.mo232930a()) {
            mo234273C();
        }
        if (this.ac == null) {
            synchronized (this.ad) {
                if (this.ac == null) {
                    this.ac = new DialogC66908d(this.f170082d);
                }
            }
        }
        return this.ac;
    }

    /* renamed from: e */
    public C66432f mo234284e() {
        if (this.f170153h == null && this.f170082d.getAppType() == AppType.GadgetAPP) {
            synchronized (this.f170154i) {
                if (this.f170153h == null) {
                    this.f170153h = new C66432f(this.f170082d);
                }
            }
        }
        return this.f170153h;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
        AppbrandApplicationImpl appbrandApplicationImpl = this.f170170y;
        if (appbrandApplicationImpl != null) {
            AppInfoEntity appInfo = appbrandApplicationImpl.getAppInfo();
            if (appInfo != null) {
                IAppSandboxEnvProcessor e = C66645a.m260337a().mo232363e(appInfo.appId);
                if (e != null) {
                    e.killSandBoxByAppId(appInfo.appId);
                } else {
                    AppBrandLogger.m52830i("AppSingletonInstance", "sandbox loop, processor be killed");
                }
            }
            this.f170170y.release();
        }
        C24819e.m89919a().mo87858b(this.f170082d);
        C24819e.m89919a().mo87860c(this.f170082d);
        C24843n nVar = this.f170143W;
        if (nVar != null) {
            nVar.mo87869a(this.f170082d);
            this.f170143W = null;
        }
        C66996c cVar = this.f170135O;
        if (cVar != null) {
            cVar.mo233040f();
            this.f170135O = null;
        }
        ApiHandlerManager apiHandlerManager = this.f170151f;
        if (apiHandlerManager != null) {
            apiHandlerManager.unRegisterActivityResultAllHandler();
            this.f170151f.unRegisterNewActivityResultAllHandler();
            this.f170151f = null;
        }
        if (this.f170147a != null) {
            this.f170147a.removeCallbacksAndMessages(null);
            this.f170147a = null;
        }
        AbstractC65746a aVar = this.f170133M;
        if (aVar != null) {
            aVar.mo230379b();
            this.f170133M = null;
        }
        DialogC66908d dVar = this.ac;
        if (dVar != null) {
            dVar.mo232931b();
            this.ac = null;
        }
        C67053q.m261330b(this.f170082d);
        AbstractC67465c cVar2 = this.ae;
        if (cVar2 != null) {
            cVar2.mo230963a();
            this.ae = null;
        }
        Inspect inspect = this.am;
        if (inspect != null) {
            inspect.onRelease();
            this.am = null;
        }
        C24437e eVar = this.ak;
        if (eVar != null) {
            eVar.mo87231a();
            this.ak = null;
        }
    }

    /* renamed from: a */
    public static C67485a m262488a(IAppContext iAppContext) {
        if (iAppContext == null) {
            AppBrandLogger.m52829e("AppSingletonInstance", "appContext is null, stack:" + Log.getStackTraceString(new Throwable()));
            new C67500a(C67501b.az, iAppContext).addCategoryValue("appContextErrorPosition", "AppSingletonInstance.getInstance").addCategoryValue("appContextErrorStack", Log.getStackTraceString(new Throwable())).flush();
            if (!DebugUtil.debug()) {
                iAppContext = C67448a.m262353a().mo234192k();
            } else {
                throw new IllegalStateException("appContext is null");
            }
        }
        if (iAppContext == null) {
            AppBrandLogger.m52829e("AppSingletonInstance", "getRunningAppContext is null, stack:" + Log.getStackTraceString(new Throwable()));
            new C67500a(C67501b.az, iAppContext).addCategoryValue("appContextErrorPosition", "AppSingletonInstance.getInstance getRunningAppContext is null").addCategoryValue("appContextErrorStack", Log.getStackTraceString(new Throwable())).flush();
            iAppContext = C67448a.m262353a().mo234190i();
        }
        if (iAppContext == null) {
            AppBrandLogger.m52829e("AppSingletonInstance", "findValidMicroAppContext is null, stack:" + Log.getStackTraceString(new Throwable()));
            new C67500a(C67501b.az, iAppContext).addCategoryValue("appContextErrorPosition", "AppSingletonInstance.getInstance findValidMicroAppContext is null").addCategoryValue("appContextErrorStack", Log.getStackTraceString(new Throwable())).flush();
            return null;
        }
        C67485a aVar = (C67485a) iAppContext.findServiceByInterface(C67485a.class);
        if (aVar != null) {
            return aVar;
        }
        AppBrandLogger.m52830i("AppSingletonInstance", "appSingle is null, appType:" + iAppContext.getAppType());
        C67485a aVar2 = new C67485a();
        iAppContext.registerService(C67485a.class, aVar2);
        return aVar2;
    }
}
