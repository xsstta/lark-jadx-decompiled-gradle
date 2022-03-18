package com.ss.android.lark.integrator.im.p2029i.p2030a;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.IPushAccountBadgeListener;
import com.ss.android.lark.feed.interfaces.AbstractC38086aa;
import com.ss.android.lark.feed.interfaces.AbstractC38111u;
import com.ss.android.lark.feed.interfaces.AbstractC38115y;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.i.a.r */
public class C39687r implements AbstractC38037a.AbstractC38064x {

    /* renamed from: a */
    private static Map<AbstractC38086aa, AbstractC49405t> f101224a = new ConcurrentHashMap();

    /* renamed from: b */
    private static Map<AbstractC38115y, C39691a> f101225b = new ConcurrentHashMap();

    /* renamed from: c */
    private static Map<AbstractC38111u, IPushAccountBadgeListener> f101226c = new ConcurrentHashMap();

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38064x
    /* renamed from: c */
    public int mo139324c() {
        return C39603g.m157159a().getPassportDependency().mo143684o();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38064x
    /* renamed from: a */
    public List<TenantInfo> mo139314a() {
        return new ArrayList(C39603g.m157159a().getPassportDependency().mo143683n());
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38064x
    /* renamed from: b */
    public List<TenantInfo.PendingUser> mo139320b() {
        return new ArrayList(C39603g.m157159a().getPassportDependency().mo143685p());
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38064x
    /* renamed from: d */
    public boolean mo139325d() {
        if (C39603g.m157159a().getPassportDependency().mo143678i().mo172421b().getTenantTag() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.lark.integrator.im.i.a.r$a */
    private static class C39691a implements AbstractC49379a, AbstractC49405t {

        /* renamed from: a */
        private AbstractC38115y f101233a;

        /* renamed from: b */
        private User f101234b = C39603g.m157159a().getPassportDependency().mo143678i().mo172421b();

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        /* renamed from: a */
        public void mo102549a(C49380b bVar) {
            AbstractC38115y yVar = this.f101233a;
            if (yVar != null) {
                yVar.mo137915a();
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        /* renamed from: a */
        public void mo102550a(C49381c cVar) {
            AbstractC38115y yVar = this.f101233a;
            if (yVar != null) {
                yVar.mo137916a(false);
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        public void onUserSwitchSuccess(C49382d dVar) {
            AbstractC38115y yVar = this.f101233a;
            if (yVar != null) {
                yVar.mo137916a(true);
            }
        }

        public C39691a(AbstractC38115y yVar) {
            this.f101233a = yVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t
        public void onTenantInfoChanged(List<TenantInfo> list, List<TenantInfo.PendingUser> list2) {
            AbstractC38115y yVar;
            User user = this.f101234b;
            if (!(user == null || user.getTenantTag() == 0 || CollectionUtils.isEmpty(list))) {
                for (TenantInfo tenantInfo : list) {
                    if (this.f101234b.getUserId().equals(tenantInfo.getUserId()) && tenantInfo.getTenantTag() == 0 && (yVar = this.f101233a) != null) {
                        yVar.mo137917b();
                    }
                }
            }
            this.f101234b = C39603g.m157159a().getPassportDependency().mo143678i().mo172421b();
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38064x
    /* renamed from: a */
    public void mo139315a(final IGetDataCallback<Map<String, Integer>> iGetDataCallback) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).pullTenantsBadge(new IGetDataCallback<Map<String, Integer>>() {
            /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39687r.C396892 */

            /* renamed from: a */
            public void onSuccess(Map<String, Integer> map) {
                iGetDataCallback.onSuccess(map);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        });
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38064x
    /* renamed from: b */
    public void mo139321b(AbstractC38086aa aaVar) {
        AbstractC49405t remove = f101224a.remove(aaVar);
        if (remove != null) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterTenantInfoListener(remove);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38064x
    /* renamed from: a */
    public void mo139316a(AbstractC38086aa aaVar) {
        if (aaVar != null) {
            aaVar.getClass();
            $$Lambda$oQ32kN6jdvszBMswSILJE8zEg r0 = new AbstractC49405t() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.$$Lambda$oQ32kN6jdvszBMswSILJE8zEg */

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t
                public final void onTenantInfoChanged(List list, List list2) {
                    AbstractC38086aa.this.mo137219a(list, list2);
                }
            };
            f101224a.put(aaVar, r0);
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerTenantInfoListener(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38064x
    /* renamed from: b */
    public void mo139322b(AbstractC38111u uVar) {
        if (uVar != null && f101226c.containsKey(uVar)) {
            f101226c.remove(uVar);
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterAccountBadgePush(f101226c.get(uVar));
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38064x
    /* renamed from: a */
    public void mo139317a(final AbstractC38111u uVar) {
        if (uVar != null) {
            C396903 r0 = new IPushAccountBadgeListener() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39687r.C396903 */

                @Override // com.ss.android.lark.biz.core.api.IPushAccountBadgeListener
                /* renamed from: a */
                public void mo105586a(Map<String, Integer> map) {
                    uVar.mo138558a(map);
                }
            };
            f101226c.put(uVar, r0);
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerAccountBadgePush(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38064x
    /* renamed from: b */
    public void mo139323b(AbstractC38115y yVar) {
        C39691a remove = f101225b.remove(yVar);
        if (remove != null) {
            C39603g.m157159a().getPassportDependency().mo143669b(remove);
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterTenantInfoListener(remove);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38064x
    /* renamed from: a */
    public void mo139318a(AbstractC38115y yVar) {
        if (yVar != null) {
            C39691a aVar = new C39691a(yVar);
            f101225b.put(yVar, aVar);
            C39603g.m157159a().getPassportDependency().mo143662a(aVar);
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerTenantInfoListener(aVar);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38064x
    /* renamed from: a */
    public void mo139319a(String str, String str2, final IGetDataCallback<TenantInfo> iGetDataCallback) {
        C39603g.m157159a().getPassportDependency().mo143666a(str, str2, new IGetDataCallback<TenantInfo>() {
            /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39687r.C396881 */

            /* renamed from: a */
            public void onSuccess(TenantInfo tenantInfo) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(tenantInfo);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }
}
