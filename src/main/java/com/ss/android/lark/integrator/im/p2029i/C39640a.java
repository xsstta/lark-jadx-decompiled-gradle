package com.ss.android.lark.integrator.im.p2029i;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.banner.export.AbstractC29479b;
import com.ss.android.lark.biz.core.api.as;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.dto.draft.Draft;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.interfaces.IDeviceNotifyListener;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.p1871b.AbstractC38067b;
import com.ss.android.lark.feed.p1871b.C38068c;
import com.ss.android.lark.feed.p1872c.AbstractC38070a;
import com.ss.android.lark.feed.p1875f.p1882g.AbstractC38084a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39656a;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39657b;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39659c;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39661d;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39662e;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39663f;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39664g;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39665h;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39666i;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39667j;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39668k;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39669l;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39670m;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39671n;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39672o;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39682p;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39684q;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39687r;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39692s;
import com.ss.android.lark.integrator.im.p2029i.p2030a.C39693t;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.maincore.AbstractC44546c;
import com.ss.android.lark.messenger.feed.dependency.TeamDependency;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus;
import com.ss.android.lark.passport.signinsdk_api.entity.NotifySettings;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.utils.C57762aa;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

/* renamed from: com.ss.android.lark.integrator.im.i.a */
public class C39640a {

    /* renamed from: a */
    public static final C57762aa f101127a = new C57762aa();

    /* renamed from: b */
    private static volatile C37262a f101128b;

    /* renamed from: a */
    public static C37262a m157299a() {
        if (f101128b == null) {
            synchronized (C39640a.class) {
                if (f101128b == null) {
                    f101128b = new C37262a(m157300a(LarkContext.getApplication()));
                }
            }
        }
        return f101128b;
    }

    /* renamed from: a */
    private static AbstractC38037a m157300a(final Context context) {
        return new AbstractC38037a() {
            /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411 */

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: i */
            public void mo139190i() {
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: L */
            public void mo139165L() {
                C38068c.m149767a();
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: a */
            public Context mo139170a() {
                return context;
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: a */
            public boolean mo139180a(Context context) {
                C39603g.m157159a().getCoreDependency().mo143454a(context, true);
                return true;
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: I */
            public AbstractC38037a.AbstractC38060t mo139162I() {
                return new AbstractC38037a.AbstractC38060t() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass24 */

                    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38060t
                    /* renamed from: a */
                    public void mo139289a(Activity activity) {
                        C39603g.m157159a().getCoreDependency().mo143416a(activity);
                    }

                    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38060t
                    /* renamed from: b */
                    public void mo139290b(Activity activity) {
                        C39603g.m157159a().getCoreDependency().mo143521b(activity);
                    }
                };
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: K */
            public AbstractC38037a.AbstractC38058r mo139164K() {
                return new AbstractC38037a.AbstractC38058r() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass23 */

                    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38058r
                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38041ac mo139288a(Fragment fragment) {
                        final as a = C39603g.m157159a().getCoreDependency().mo143405a(fragment);
                        return new AbstractC38037a.AbstractC38041ac() {
                            /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass23.C396451 */

                            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38041ac
                            /* renamed from: a */
                            public void mo139220a(boolean z) {
                                a.mo105605a(z);
                            }

                            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38041ac
                            /* renamed from: a */
                            public void mo139219a(View view) {
                                C39603g.m157159a().getCoreDependency().mo143461a(a.mo105604a(), view);
                            }
                        };
                    }
                };
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: M */
            public AbstractC38037a.AbstractC38057q mo139166M() {
                return new AbstractC38037a.AbstractC38057q() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass19 */

                    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38057q
                    /* renamed from: a */
                    public String mo139279a() {
                        return C39603g.m157159a().getCoreDependency().mo143387M();
                    }

                    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38057q
                    /* renamed from: b */
                    public void mo139284b(AbstractC44544a aVar) {
                        C39603g.m157159a().getCoreDependency().mo143549b(aVar);
                    }

                    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38057q
                    /* renamed from: c */
                    public void mo139286c(String str) {
                        C39603g.m157159a().getCoreDependency().mo143600m(str);
                    }

                    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38057q
                    /* renamed from: d */
                    public void mo139287d(String str) {
                        C39603g.m157159a().getCoreDependency().mo143595j(str);
                    }

                    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38057q
                    /* renamed from: b */
                    public void mo139285b(String str) {
                        C39603g.m157159a().getCoreDependency().mo143598l(str);
                    }

                    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38057q
                    /* renamed from: a */
                    public void mo139281a(AbstractC44544a aVar) {
                        C39603g.m157159a().getCoreDependency().mo143481a(aVar);
                    }

                    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38057q
                    /* renamed from: a */
                    public void mo139282a(AbstractC44546c cVar) {
                        C39603g.m157159a().getCoreDependency().mo143482a(cVar);
                    }

                    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38057q
                    /* renamed from: a */
                    public void mo139283a(String str) {
                        C39603g.m157159a().getCoreDependency().mo143597k(str);
                    }

                    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38057q
                    /* renamed from: a */
                    public void mo139280a(Context context, String str, Bundle bundle) {
                        C39603g.m157159a().getCoreDependency().mo143386L().mo105707b(context, str, bundle);
                    }
                };
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: N */
            public AbstractC38037a.AbstractC38045e mo139167N() {
                return new AbstractC38037a.AbstractC38045e() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass25 */

                    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38045e
                    /* renamed from: a */
                    public AbstractC29479b mo139231a() {
                        return C39603g.m157159a().getCoreDependency().mo143608q("BANNER_SCENE_FEED");
                    }

                    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38045e
                    /* renamed from: a */
                    public void mo139232a(String str) {
                        C39603g.m157159a().getCoreDependency().mo143606p(str);
                    }
                };
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: A */
            public AbstractC38037a.AbstractC38047g mo139154A() {
                return (AbstractC38037a.AbstractC38047g) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38047g.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38047g>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass12 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38047g mo133374b(Class<AbstractC38037a.AbstractC38047g> cls) {
                        return new C39663f();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: B */
            public AbstractC38037a.AbstractC38038a mo139155B() {
                return (AbstractC38037a.AbstractC38038a) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38038a.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38038a>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass13 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38038a mo133374b(Class<AbstractC38037a.AbstractC38038a> cls) {
                        return new C39656a();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: C */
            public AbstractC38037a.AbstractC38048h mo139156C() {
                return (AbstractC38037a.AbstractC38048h) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38048h.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38048h>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass14 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38048h mo133374b(Class<AbstractC38037a.AbstractC38048h> cls) {
                        return new C39664g();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: D */
            public AbstractC38037a.AbstractC38063w mo139157D() {
                return (AbstractC38037a.AbstractC38063w) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38063w.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38063w>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass15 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38063w mo133374b(Class<AbstractC38037a.AbstractC38063w> cls) {
                        return new TeamDependency();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: E */
            public AbstractC38037a.AbstractC38039aa mo139158E() {
                return (AbstractC38037a.AbstractC38039aa) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38039aa.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38039aa>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass16 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38039aa mo133374b(Class<AbstractC38037a.AbstractC38039aa> cls) {
                        return C39603g.m157159a().getVideoConferenceDependency().mo143695b();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: F */
            public AbstractC38037a.AbstractC38056p mo139159F() {
                return (AbstractC38037a.AbstractC38056p) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38056p.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38056p>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass17 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38056p mo133374b(Class<AbstractC38037a.AbstractC38056p> cls) {
                        return new C39671n();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: G */
            public AbstractC38037a.AbstractC38042b mo139160G() {
                return (AbstractC38037a.AbstractC38042b) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38042b.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38042b>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass18 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38042b mo133374b(Class<AbstractC38037a.AbstractC38042b> cls) {
                        return new C39657b();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: H */
            public AbstractC38067b mo139161H() {
                return (AbstractC38067b) C39640a.f101127a.mo196049a(AbstractC38067b.class, new C57762aa.AbstractC57763a<AbstractC38067b>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass20 */

                    /* renamed from: a */
                    public AbstractC38067b mo133374b(Class<AbstractC38067b> cls) {
                        return new C39672o();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: J */
            public AbstractC38037a.AbstractC38065y mo139163J() {
                return (AbstractC38037a.AbstractC38065y) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38065y.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38065y>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass22 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38065y mo133374b(Class<AbstractC38037a.AbstractC38065y> cls) {
                        return new AbstractC38037a.AbstractC38065y() {
                            /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass22.C396441 */

                            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38065y
                            /* renamed from: a */
                            public String mo139326a() {
                                return C39603g.m157159a().getCoreDependency().ag();
                            }
                        };
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: O */
            public boolean mo139168O() {
                return CreateGroupChatModuleProvider.m157168a().isSecretOpen();
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: P */
            public boolean mo139169P() {
                return C39603g.m157159a().getCoreDependency().mo143618x();
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: b */
            public AbstractC38037a.AbstractC38053m mo139181b() {
                return (AbstractC38037a.AbstractC38053m) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38053m.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38053m>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.C396421 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38053m mo133374b(Class<AbstractC38037a.AbstractC38053m> cls) {
                        return new C39668k();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: c */
            public AbstractC38037a.AbstractC38043c mo139184c() {
                return (AbstractC38037a.AbstractC38043c) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38043c.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38043c>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass11 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38043c mo133374b(Class<AbstractC38037a.AbstractC38043c> cls) {
                        return new C39659c();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: d */
            public boolean mo139185d() {
                return C29410a.m108289c().mo104288b();
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: e */
            public AbstractC38037a.AbstractC38049i mo139186e() {
                return (AbstractC38037a.AbstractC38049i) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38049i.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38049i>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass21 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38049i mo133374b(Class<AbstractC38037a.AbstractC38049i> cls) {
                        return new C39665h();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: f */
            public AbstractC38037a.AbstractC38061u mo139187f() {
                return (AbstractC38037a.AbstractC38061u) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38061u.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38061u>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass26 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38061u mo133374b(Class<AbstractC38037a.AbstractC38061u> cls) {
                        return new C39682p();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: g */
            public void mo139188g() {
                C39603g.m157159a().getCoreDependency().mo143396V();
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: h */
            public Locale mo139189h() {
                return C39603g.m157159a().getCoreDependency().mo143610r();
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: n */
            public AbstractC38070a mo139195n() {
                return (AbstractC38070a) C39640a.f101127a.mo196049a(AbstractC38070a.class, new C57762aa.AbstractC57763a<AbstractC38070a>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass28 */

                    /* renamed from: a */
                    public AbstractC38070a mo133374b(Class<AbstractC38070a> cls) {
                        return new AbstractC38070a() {
                            /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass28.C396471 */

                            @Override // com.ss.android.lark.feed.p1872c.AbstractC38070a
                            /* renamed from: a */
                            public void mo139354a() {
                                C39603g.m157159a().getCoreDependency().ai();
                            }

                            @Override // com.ss.android.lark.feed.p1872c.AbstractC38070a
                            /* renamed from: b */
                            public void mo139356b(String str, String str2) {
                                C39603g.m157159a().getCoreDependency().mo143490a(str, str2, 3);
                            }

                            @Override // com.ss.android.lark.feed.p1872c.AbstractC38070a
                            /* renamed from: c */
                            public void mo139357c(String str, String str2) {
                                C39603g.m157159a().getCoreDependency().mo143551b(str, str2);
                            }

                            @Override // com.ss.android.lark.feed.p1872c.AbstractC38070a
                            /* renamed from: d */
                            public void mo139358d(String str, String str2) {
                                C39603g.m157159a().getCoreDependency().mo143568c(str, str2);
                            }

                            @Override // com.ss.android.lark.feed.p1872c.AbstractC38070a
                            /* renamed from: a */
                            public void mo139355a(String str, String str2) {
                                C39603g.m157159a().getCoreDependency().mo143490a(str, str2, 1);
                            }
                        };
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: o */
            public AbstractC38084a mo139196o() {
                return (AbstractC38084a) C39640a.f101127a.mo196049a(AbstractC38084a.class, new C57762aa.AbstractC57763a<AbstractC38084a>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass29 */

                    /* renamed from: a */
                    public AbstractC38084a mo133374b(Class<AbstractC38084a> cls) {
                        return new AbstractC38084a() {
                            /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass29.C396481 */

                            @Override // com.ss.android.lark.feed.p1875f.p1882g.AbstractC38084a
                            /* renamed from: a */
                            public void mo139416a() {
                                C39603g.m157159a().getCoreDependency().mo143487a("key_doc", ChatBundle.SourceType.FEED);
                            }

                            @Override // com.ss.android.lark.feed.p1875f.p1882g.AbstractC38084a
                            /* renamed from: b */
                            public void mo139417b() {
                                C39603g.m157159a().getCoreDependency().mo143487a("key_chatwindow", ChatBundle.SourceType.FEED);
                            }

                            @Override // com.ss.android.lark.feed.p1875f.p1882g.AbstractC38084a
                            /* renamed from: c */
                            public void mo139418c() {
                                C39603g.m157159a().getCoreDependency().mo143487a("key_chatwindow", ChatBundle.SourceType.SHORTCUT);
                            }
                        };
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: p */
            public AbstractC38037a.AbstractC38040ab mo139197p() {
                return (AbstractC38037a.AbstractC38040ab) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38040ab.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38040ab>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass30 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38040ab mo133374b(Class<AbstractC38037a.AbstractC38040ab> cls) {
                        return new C39693t();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: q */
            public AbstractC38037a.AbstractC38052l mo139198q() {
                return (AbstractC38037a.AbstractC38052l) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38052l.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38052l>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass31 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38052l mo133374b(Class<AbstractC38037a.AbstractC38052l> cls) {
                        return new C39667j();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: r */
            public AbstractC38037a.AbstractC38066z mo139199r() {
                return (AbstractC38037a.AbstractC38066z) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38066z.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38066z>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.C396432 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38066z mo133374b(Class<AbstractC38037a.AbstractC38066z> cls) {
                        return new C39692s();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: s */
            public AbstractC38037a.AbstractC38064x mo139200s() {
                return (AbstractC38037a.AbstractC38064x) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38064x.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38064x>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.C396493 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38064x mo133374b(Class<AbstractC38037a.AbstractC38064x> cls) {
                        return new C39687r();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: t */
            public AbstractC38037a.AbstractC38044d mo139201t() {
                return (AbstractC38037a.AbstractC38044d) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38044d.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38044d>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.C396504 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38044d mo133374b(Class<AbstractC38037a.AbstractC38044d> cls) {
                        return new C39661d();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: u */
            public AbstractC38037a.AbstractC38046f mo139202u() {
                return (AbstractC38037a.AbstractC38046f) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38046f.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38046f>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.C396515 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38046f mo133374b(Class<AbstractC38037a.AbstractC38046f> cls) {
                        return new C39662e();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: v */
            public AbstractC38037a.AbstractC38062v mo139203v() {
                return (AbstractC38037a.AbstractC38062v) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38062v.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38062v>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.C396526 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38062v mo133374b(Class<AbstractC38037a.AbstractC38062v> cls) {
                        return new C39684q();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: w */
            public AbstractC38037a.AbstractC38050j mo139204w() {
                return (AbstractC38037a.AbstractC38050j) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38050j.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38050j>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.C396537 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38050j mo133374b(Class<AbstractC38037a.AbstractC38050j> cls) {
                        return new C39666i();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: x */
            public AbstractC38037a.AbstractC38054n mo139205x() {
                return (AbstractC38037a.AbstractC38054n) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38054n.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38054n>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.C396548 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38054n mo133374b(Class<AbstractC38037a.AbstractC38054n> cls) {
                        return new C39669l();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: y */
            public AbstractC38037a.AbstractC38055o mo139206y() {
                return (AbstractC38037a.AbstractC38055o) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38055o.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38055o>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.C396559 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38055o mo133374b(Class<AbstractC38037a.AbstractC38055o> cls) {
                        return new C39670m();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: z */
            public AbstractC38037a.AbstractC38051k mo139207z() {
                return (AbstractC38037a.AbstractC38051k) C39640a.f101127a.mo196049a(AbstractC38037a.AbstractC38051k.class, new C57762aa.AbstractC57763a<AbstractC38037a.AbstractC38051k>() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass10 */

                    /* renamed from: a */
                    public AbstractC38037a.AbstractC38051k mo133374b(Class<AbstractC38037a.AbstractC38051k> cls) {
                        return C39603g.m157159a().getCCMDependency().mo143305e();
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: j */
            public void mo139191j() {
                long currentTimeMillis = System.currentTimeMillis();
                Log.m165389i("PerfQuickSwitchUserLog", "onTriggerLoginInfoChangedEnd time = " + currentTimeMillis);
                C39603g.m157159a().getCoreDependency().mo143520b(currentTimeMillis);
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: k */
            public void mo139192k() {
                long currentTimeMillis = System.currentTimeMillis();
                Log.m165389i("PerfQuickSwitchUserLog", "onGetFeedCardsStart time = " + currentTimeMillis);
                C39603g.m157159a().getCoreDependency().mo143561c(currentTimeMillis);
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: l */
            public void mo139193l() {
                long currentTimeMillis = System.currentTimeMillis();
                Log.m165389i("PerfQuickSwitchUserLog", "onGetFeedCardsEnd time = " + currentTimeMillis);
                C39603g.m157159a().getCoreDependency().mo143572d(currentTimeMillis);
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: m */
            public void mo139194m() {
                long currentTimeMillis = System.currentTimeMillis();
                Log.m165389i("PerfQuickSwitchUserLog", "onHideLoadingStart time = " + currentTimeMillis);
                C39603g.m157159a().getCoreDependency().mo143581e(currentTimeMillis);
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: a */
            public void mo139173a(int i) {
                C39603g.m157159a().getOpenPlatformDependency().mo143641a(i);
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            @Nullable
            /* renamed from: a */
            public String mo139172a(List<Chatter.ChatterCustomStatus> list) {
                Chatter.ChatterCustomStatus a = C39603g.m157159a().getCoreDependency().mo143404a(list);
                if (a != null) {
                    return a.icon_key;
                }
                return null;
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: a */
            public RichText mo139171a(String str) {
                Draft draft = (Draft) JSONObject.parseObject(str, Draft.class);
                if (draft.contentRichText != null) {
                    return draft.contentRichText;
                }
                if (TextUtils.isEmpty(draft.title)) {
                    return draft.postRichText;
                }
                return C59029c.m229161b(draft.title);
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: a */
            public void mo139177a(final IDeviceNotifyListener iDeviceNotifyListener) {
                CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                    /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass27 */

                    public void run() {
                        final IDeviceManager l = C39603g.m157159a().getPassportDependency().mo143681l();
                        IDeviceService k = C39603g.m157159a().getPassportDependency().mo143680k();
                        NotifySettings syncPullDeviceNotifySetting = k.syncPullDeviceNotifySetting();
                        if (syncPullDeviceNotifySetting == null) {
                            Log.m165383e("FeedModuleProvider", "get device notify setting failed: ");
                        } else {
                            l.mo171031b(syncPullDeviceNotifySetting.isDisableMobileNotify());
                            l.mo171035c(!syncPullDeviceNotifySetting.isStillNotifyAt());
                        }
                        k.pullDeviceOnlineStatus(new IGetDataCallback<DevicesStatus>() {
                            /* class com.ss.android.lark.integrator.im.p2029i.C39640a.C396411.AnonymousClass27.C396461 */

                            /* renamed from: a */
                            public void onSuccess(DevicesStatus devicesStatus) {
                                l.mo171026a(devicesStatus);
                                C396411.this.mo139188g();
                                AnonymousClass27.this.mo143832a(l);
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                Log.m165383e("FeedModuleProvider", "get device online status failed: " + errorResult.toString());
                                AnonymousClass27.this.mo143832a(l);
                            }
                        });
                    }

                    /* renamed from: a */
                    public void mo143832a(IDeviceManager iDeviceManager) {
                        boolean z;
                        int i = 0;
                        if (!iDeviceManager.mo171040h() || !iDeviceManager.mo171039g()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (iDeviceManager.mo171040h() && iDeviceManager.mo171039g()) {
                            i = 2;
                        } else if (!iDeviceManager.mo171040h() && iDeviceManager.mo171039g()) {
                            i = 1;
                        }
                        iDeviceManager.mo171027a(z);
                        IDeviceNotifyListener iDeviceNotifyListener = iDeviceNotifyListener;
                        if (iDeviceNotifyListener != null) {
                            iDeviceNotifyListener.mo138504a(i);
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: b */
            public void mo139182b(Context context, int i) {
                C39603g.m157159a().getCoreDependency().mo143523b(context, i);
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: b */
            public void mo139183b(Context context, String str) {
                C39603g.m157159a().getCoreDependency().mo143437a(context, str);
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: a */
            public void mo139174a(Context context, int i) {
                C39603g.m157159a().getCoreDependency().mo143423a(context, i);
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: a */
            public void mo139175a(Context context, String str) {
                C39603g.m157159a().getCoreDependency().mo143444a(context, "banner", str);
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: a */
            public void mo139176a(Context context, String str, int i) {
                C39603g.m157159a().getCoreDependency().mo143528b(context, "", str, i);
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: a */
            public void mo139178a(String str, String str2, String str3) {
                C39603g.m157159a().getOpenPlatformDependency().mo143644a(context, str, str2, str3);
            }

            @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a
            /* renamed from: a */
            public void mo139179a(String str, String str2, String str3, String str4) {
                C39603g.m157159a().getOpenPlatformDependency().mo143645a(context, str, str2, str3, str4);
            }
        };
    }
}
