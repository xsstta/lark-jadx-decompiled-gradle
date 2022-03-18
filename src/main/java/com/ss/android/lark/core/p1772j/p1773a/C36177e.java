package com.ss.android.lark.core.p1772j.p1773a;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.IPushAccountBadgeListener;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.core.p1772j.p1773a.C36177e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.interfaces.AbstractC44503f;
import com.ss.android.lark.main.interfaces.AbstractC44504g;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import com.ss.android.lark.ug.p2874e.C57480a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.core.j.a.e */
public class C36177e implements AbstractC44136a.AbstractC44171x {

    /* renamed from: a */
    private static Map<AbstractC44503f, AbstractC49405t> f93400a = new ConcurrentHashMap();

    /* renamed from: b */
    private static Map<AbstractC44504g, AbstractC49379a> f93401b = new ConcurrentHashMap();

    /* renamed from: c */
    private static Map<AbstractC44136a.AbstractC44171x.AbstractC44172a, IPushAccountBadgeListener> f93402c = new ConcurrentHashMap();

    /* renamed from: d */
    private IPushAccountBadgeListener f93403d = new IPushAccountBadgeListener() {
        /* class com.ss.android.lark.core.p1772j.p1773a.C36177e.C361781 */

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m142423a() {
            final List<TenantInfo> y = C36083a.m141486a().getPassportDependency().mo133106y();
            final List<TenantInfo.PendingUser> I = C36083a.m141486a().getPassportDependency().mo133050I();
            Log.m165389i("Main_TenantDependency", "badge push lead to updating tenant-info");
            C36149a.m142162a().mo157094a(y, I, new IGetDataCallback<List<TenantInfo>>() {
                /* class com.ss.android.lark.core.p1772j.p1773a.C36177e.C361781.C361791 */

                /* renamed from: a */
                public void onSuccess(List<TenantInfo> list) {
                    for (AbstractC49405t tVar : C36149a.m142162a().mo157120j()) {
                        tVar.onTenantInfoChanged(list, I);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165397w("Main_TenantDependency", "fill tenant badge failed!");
                    for (AbstractC49405t tVar : C36149a.m142162a().mo157120j()) {
                        tVar.onTenantInfoChanged(y, I);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.biz.core.api.IPushAccountBadgeListener
        /* renamed from: a */
        public void mo105586a(Map<String, Integer> map) {
            CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
                /* class com.ss.android.lark.core.p1772j.p1773a.$$Lambda$e$1$LPweCxHfIcG8f5iDgNbBuiLQvQg */

                public final void run() {
                    C36177e.C361781.this.m142423a();
                }
            });
        }
    };

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: a */
    public void mo133405a(boolean z) {
        if (z) {
            C57480a.m223132a().mo141830f(C36083a.m141486a().getIMDependency().mo132915d());
            mo133411b(true);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: a */
    public void mo133404a(String str) {
        C36083a.m141486a().getPassportDependency().mo133079b(str);
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: d */
    public void mo133414d() {
        C36149a.m142162a().mo157122k();
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: e */
    public void mo133415e() {
        C36149a.m142162a().mo157123l();
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: a */
    public List<TenantInfo> mo133395a() {
        return C36083a.m141486a().getPassportDependency().mo133106y();
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: b */
    public void mo133406b() {
        C36149a.m142162a().mo157087a(this.f93403d);
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: c */
    public void mo133412c() {
        C36149a.m142162a().mo157101b(this.f93403d);
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: k */
    public boolean mo133421k() {
        return PackageChannelManager.isKABuildPackage(LarkContext.getApplication());
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: l */
    public TenantInfo mo133422l() {
        return C36083a.m141486a().getPassportDependency().mo133048G();
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: m */
    public User mo133423m() {
        return C36083a.m141486a().getPassportDependency().mo133047F();
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: n */
    public TenantInfo mo133424n() {
        return C36083a.m141486a().getPassportDependency().mo133048G();
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: f */
    public boolean mo133416f() {
        if (!C57480a.m223132a().mo141828e(C36083a.m141486a().getIMDependency().mo132915d()) || !mo133417g()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo133417g() {
        return C57480a.m223132a().mo141828e(C36083a.m141486a().getIMDependency().mo132924e());
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: h */
    public boolean mo133418h() {
        return C57480a.m223132a().mo141828e(C36083a.m141486a().getIMDependency().mo132931f());
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: i */
    public List<TenantInfo> mo133419i() {
        return new ArrayList(C36083a.m141486a().getPassportDependency().mo133106y());
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: j */
    public List<TenantInfo.PendingUser> mo133420j() {
        return new ArrayList(C36083a.m141486a().getPassportDependency().mo133050I());
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: a */
    public void mo133398a(IGetDataCallback<Map<String, Integer>> iGetDataCallback) {
        C36149a.m142162a().mo157100b(iGetDataCallback);
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: b */
    public void mo133407b(AbstractC44136a.AbstractC44171x.AbstractC44172a aVar) {
        IPushAccountBadgeListener remove = f93402c.remove(aVar);
        if (remove != null) {
            C36149a.m142162a().mo157101b(remove);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: c */
    public void mo133413c(boolean z) {
        if (z) {
            C57480a.m223132a().mo141830f(C36083a.m141486a().getIMDependency().mo132931f());
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: b */
    public void mo133408b(AbstractC44503f fVar) {
        AbstractC49405t remove = f93400a.remove(fVar);
        if (remove != null) {
            C36149a.m142162a().mo157104b(remove);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: a */
    public void mo133399a(final AbstractC44136a.AbstractC44171x.AbstractC44172a aVar) {
        if (aVar != null) {
            C361835 r0 = new IPushAccountBadgeListener() {
                /* class com.ss.android.lark.core.p1772j.p1773a.C36177e.C361835 */

                @Override // com.ss.android.lark.biz.core.api.IPushAccountBadgeListener
                /* renamed from: a */
                public void mo105586a(Map<String, Integer> map) {
                    aVar.mo157136a(map);
                }
            };
            f93402c.put(aVar, r0);
            C36149a.m142162a().mo157087a(r0);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: b */
    public void mo133409b(AbstractC44504g gVar) {
        if (gVar != null) {
            AbstractC49379a aVar = f93401b.get(gVar);
            if (aVar != null) {
                C36083a.m141486a().getPassportDependency().mo133076b(aVar);
            }
            f93401b.remove(gVar);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: a */
    public void mo133400a(final AbstractC44503f fVar) {
        if (fVar != null) {
            C361802 r0 = new AbstractC49405t() {
                /* class com.ss.android.lark.core.p1772j.p1773a.C36177e.C361802 */

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t
                public void onTenantInfoChanged(List<TenantInfo> list, List<TenantInfo.PendingUser> list2) {
                    fVar.mo157234a(list, list2);
                }
            };
            f93400a.put(fVar, r0);
            C36149a.m142162a().mo157092a(r0);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: b */
    public void mo133410b(AbstractC49405t tVar) {
        C36083a.m141486a().getPassportDependency().mo133068a(tVar);
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: a */
    public void mo133401a(final AbstractC44504g gVar) {
        if (gVar != null) {
            C361813 r0 = new AbstractC49379a() {
                /* class com.ss.android.lark.core.p1772j.p1773a.C36177e.C361813 */

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                /* renamed from: a */
                public void mo102549a(C49380b bVar) {
                    gVar.mo157175a();
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                public void onUserSwitchSuccess(C49382d dVar) {
                    gVar.mo157176a(true);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                /* renamed from: a */
                public void mo102550a(C49381c cVar) {
                    gVar.mo157176a(false);
                }
            };
            f93401b.put(gVar, r0);
            C36083a.m141486a().getPassportDependency().mo133064a(r0);
        }
    }

    /* renamed from: b */
    public void mo133411b(boolean z) {
        if (z) {
            C57480a.m223132a().mo141830f(C36083a.m141486a().getIMDependency().mo132924e());
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: a */
    public void mo133403a(AbstractC49405t tVar) {
        C36083a.m141486a().getPassportDependency().mo133078b(tVar);
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: a */
    public void mo133396a(Context context, String str) {
        C36083a.m141486a().getPassportDependency().mo133061a(context, str, new IGetDataCallback<C49382d>() {
            /* class com.ss.android.lark.core.p1772j.p1773a.C36177e.C361846 */

            /* renamed from: a */
            public void onSuccess(C49382d dVar) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165397w("Main_TenantDependency", "switch user faild! ");
            }
        });
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: a */
    public void mo133397a(Context context, String str, IGetDataCallback<Boolean> iGetDataCallback) {
        C36083a.m141486a().getPassportDependency().mo133099r().mo172431a(context, str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x
    /* renamed from: a */
    public void mo133402a(TenantInfo tenantInfo, String str, final IGetDataCallback<String> iGetDataCallback) {
        C36083a.m141486a().getPassportDependency().mo133100s().mo172413a(tenantInfo, new IGetDataCallback<SessionResult>() {
            /* class com.ss.android.lark.core.p1772j.p1773a.C36177e.C361824 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(SessionResult sessionResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(sessionResult.token);
                }
            }
        });
    }
}
