package com.ss.android.lark.integrator.im.p2032k;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.p2032k.C39705a;
import com.ss.android.lark.leanmode.AbstractC41239a;
import com.ss.android.lark.leanmode.C41267h;
import com.ss.android.lark.leanmode.dto.C41262a;
import com.ss.android.lark.leanmode.p2120b.AbstractC41243a;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49402q;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49403r;
import com.ss.android.lark.utils.LarkContext;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.k.a */
public class C39705a {

    /* renamed from: com.ss.android.lark.integrator.im.k.a$a */
    public static class C39707a {

        /* renamed from: a */
        public static final C39708b f101250a = new C39708b();
    }

    /* renamed from: a */
    public static C41267h m157599a() {
        return new C41267h(C39707a.f101250a);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.im.k.a$b */
    public static class C39708b implements AbstractC41243a {

        /* renamed from: a */
        private ConcurrentHashMap<AbstractC41239a, AbstractC49379a> f101251a;

        /* renamed from: b */
        private ConcurrentHashMap<Object, C28513a.AbstractC28515b> f101252b;

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: b */
        public Activity mo143875b() {
            return C29410a.m108289c().mo104289c();
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: g */
        public boolean mo143881g() {
            return C39603g.m157159a().getCoreDependency().mo143392R();
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: h */
        public AbstractC41243a.AbstractC41244a mo143882h() {
            final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            return new AbstractC41243a.AbstractC41244a() {
                /* class com.ss.android.lark.integrator.im.p2032k.C39705a.C39708b.C397102 */

                @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a.AbstractC41244a
                /* renamed from: a */
                public void mo143884a(AbstractC41243a.AbstractC41244a.AbstractC41245a aVar) {
                    $$Lambda$a$b$2$pgkyHwOWGNF2hDeDD0_aBpeoAgA r0 = new AbstractC29586u() {
                        /* class com.ss.android.lark.integrator.im.p2032k.$$Lambda$a$b$2$pgkyHwOWGNF2hDeDD0_aBpeoAgA */

                        @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
                        public final void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                            C39705a.C39708b.C397102.lambda$pgkyHwOWGNF2hDeDD0_aBpeoAgA(AbstractC41243a.AbstractC41244a.AbstractC41245a.this, aVar, aVar2);
                        }
                    };
                    concurrentHashMap.put(aVar, r0);
                    C39603g.m157159a().getCoreDependency().mo143479a(r0);
                }

                @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a.AbstractC41244a
                /* renamed from: b */
                public void mo143885b(AbstractC41243a.AbstractC41244a.AbstractC41245a aVar) {
                    AbstractC29586u uVar = (AbstractC29586u) concurrentHashMap.get(aVar);
                    if (uVar != null) {
                        C39603g.m157159a().getCoreDependency().mo143547b(uVar);
                        concurrentHashMap.remove(aVar);
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m157620a(AbstractC41243a.AbstractC41244a.AbstractC41245a aVar, AbstractC29586u.C29587a aVar2, AbstractC29586u.C29587a aVar3) {
                    boolean c = aVar3.mo105887c();
                    if (aVar != null) {
                        aVar.onAppStateChange(c);
                    }
                }
            };
        }

        private C39708b() {
            this.f101251a = new ConcurrentHashMap<>();
            this.f101252b = new ConcurrentHashMap<>();
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: a */
        public Context mo143867a() {
            return LarkContext.getApplication().getApplicationContext();
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: c */
        public void mo143877c() {
            Activity c = C29410a.m108289c().mo104289c();
            if (c != null) {
                C39603g.m157159a().getPassportDependency().mo143656a(c);
            }
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: d */
        public String mo143878d() {
            LoginInfo a = C39603g.m157159a().getPassportDependency().mo143678i().mo172419a();
            if (a == null) {
                return "";
            }
            return a.getUserName();
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: e */
        public String mo143879e() {
            LoginInfo a = C39603g.m157159a().getPassportDependency().mo143678i().mo172419a();
            if (a == null) {
                return "";
            }
            return a.getAvatarKey();
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: f */
        public String mo143880f() {
            String b = C39603g.m157159a().getPassportDependency().mo143668b();
            if (b == null) {
                return "";
            }
            return b;
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: b */
        public void mo143876b(AbstractC41239a aVar) {
            AbstractC49379a remove = this.f101251a.remove(aVar);
            if (remove != null) {
                C39603g.m157159a().getPassportDependency().mo143669b(remove);
            }
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: a */
        public void mo143870a(AbstractC41239a aVar) {
            $$Lambda$a$b$DMB8JKtDo0NKG5rwdx8a8HBw2vw r0 = new AbstractC49379a() {
                /* class com.ss.android.lark.integrator.im.p2032k.$$Lambda$a$b$DMB8JKtDo0NKG5rwdx8a8HBw2vw */

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                /* renamed from: a */
                public /* synthetic */ void mo102549a(C49380b bVar) {
                    AbstractC49379a.CC.$default$a(this, bVar);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                /* renamed from: a */
                public /* synthetic */ void mo102550a(C49381c cVar) {
                    AbstractC49379a.CC.$default$a(this, cVar);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                public final void onUserSwitchSuccess(C49382d dVar) {
                    C39705a.C39708b.lambda$DMB8JKtDo0NKG5rwdx8a8HBw2vw(AbstractC41239a.this, dVar);
                }
            };
            this.f101251a.put(aVar, r0);
            C39603g.m157159a().getPassportDependency().mo143662a(r0);
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: a */
        public void mo143871a(AbstractC41243a.AbstractC41247c cVar) {
            C39603g.m157159a().getPassportDependency().mo143665a(new AbstractC49403r() {
                /* class com.ss.android.lark.integrator.im.p2032k.$$Lambda$a$b$74s9KKwa6Y6ObyFj05i4F0YkSpU */

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49403r
                public final void onResult(boolean z) {
                    C39705a.C39708b.lambda$74s9KKwa6Y6ObyFj05i4F0YkSpU(AbstractC41243a.AbstractC41247c.this, z);
                }
            });
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: a */
        public void mo143872a(C41262a aVar) {
            if (aVar != null) {
                C39603g.m157159a().getCCMDependency().mo143292a(aVar.mo148648b());
            }
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: a */
        public boolean mo143874a(String str) {
            return C37239a.m146648b().mo136951a(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m157602a(AbstractC41243a.AbstractC41247c cVar, boolean z) {
            if (cVar != null) {
                cVar.onResult(z);
            }
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: a */
        public void mo143873a(boolean z, final IGetDataCallback<Boolean> iGetDataCallback) {
            C39603g.m157159a().getCoreDependency().mo143498a(z, new IGetDataCallback<AppConfig>() {
                /* class com.ss.android.lark.integrator.im.p2032k.C39705a.C39708b.C397091 */

                /* renamed from: a */
                public void onSuccess(AppConfig appConfig) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(true);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(false);
                    }
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m157601a(AbstractC41243a.AbstractC41246b bVar, Context context, String str) {
            if (bVar != null) {
                bVar.onResult(str);
            }
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: a */
        public void mo143868a(Context context, String str, String str2, ImageView imageView) {
            C39603g.m157159a().getCoreDependency().mo143425a(context, imageView, str, str2, new LoadParams().mo105413a(imageView.getWidth()).mo105422b(imageView.getHeight()));
        }

        @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a
        /* renamed from: a */
        public void mo143869a(Context context, String str, String str2, AbstractC41243a.AbstractC41246b bVar) {
            C39603g.m157159a().getPassportDependency().mo143659a(context, str, str2, new AbstractC49402q() {
                /* class com.ss.android.lark.integrator.im.p2032k.$$Lambda$a$b$BImsvzlA2wbNf3dkSJtGonThFGY */

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49402q
                public final void handleResult(Context context, String str) {
                    C39705a.C39708b.lambda$BImsvzlA2wbNf3dkSJtGonThFGY(AbstractC41243a.AbstractC41246b.this, context, str);
                }
            });
        }
    }
}
