package com.ss.android.lark.main.app.drawer;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.drawer.C44232c;
import com.ss.android.lark.main.app.widgets.tenant.TenantInfoUtils;
import com.ss.android.lark.main.interfaces.AbstractC44503f;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.drawer.a */
public class C44207a extends BaseModel implements C44232c.AbstractC44233a {

    /* renamed from: a */
    public AbstractC44136a.AbstractC44171x f112173a = C44134a.m174959a().mo133188H();

    /* renamed from: b */
    public C44232c.AbstractC44233a.AbstractC44234a f112174b;

    /* renamed from: c */
    private AbstractC44136a.AbstractC44137a f112175c = C44134a.m174959a().mo133251g();

    /* renamed from: d */
    private AbstractC44136a.AbstractC44155k f112176d = C44134a.m174959a().mo133200T();

    /* renamed from: e */
    private AbstractC44503f f112177e = new AbstractC44503f() {
        /* class com.ss.android.lark.main.app.drawer.C44207a.C442081 */

        @Override // com.ss.android.lark.main.interfaces.AbstractC44503f
        /* renamed from: a */
        public void mo157234a(List<TenantInfo> list, List<TenantInfo.PendingUser> list2) {
            if (C44207a.this.f112174b != null) {
                Log.m165389i("MainModuleDrawerModel", "tenant push");
                C44207a.this.f112174b.mo157263a(list, list2);
            }
        }
    };

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44233a
    /* renamed from: c */
    public boolean mo157231c() {
        return this.f112173a.mo133421k();
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44233a
    /* renamed from: d */
    public boolean mo157232d() {
        return this.f112175c.mo133322d();
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44233a
    /* renamed from: e */
    public TenantInfo mo157233e() {
        return this.f112173a.mo133424n();
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44233a
    /* renamed from: b */
    public boolean mo157230b() {
        return this.f112176d.mo133283a("pc_multi_tenant");
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C44134a.m174959a().mo133188H().mo133400a(this.f112177e);
        UICallbackExecutor.executeDelayed(new Runnable() {
            /* class com.ss.android.lark.main.app.drawer.C44207a.RunnableC442092 */

            public void run() {
                C44207a.this.f112174b.mo157263a(C44207a.this.f112173a.mo133419i(), C44207a.this.f112173a.mo133420j());
                C44207a aVar = C44207a.this;
                aVar.mo157227a(aVar.f112173a.mo133419i(), C44207a.this.f112173a.mo133420j());
            }
        }, 5);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C44134a.m174959a().mo133188H().mo133408b(this.f112177e);
        super.destroy();
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44233a
    /* renamed from: a */
    public boolean mo157229a() {
        return !this.f112176d.mo133283a("mobile_switch_team_guidance");
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44233a
    /* renamed from: a */
    public void mo157226a(C44232c.AbstractC44233a.AbstractC44234a aVar) {
        this.f112174b = aVar;
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44233a
    /* renamed from: a */
    public void mo157228a(boolean z) {
        this.f112176d.mo133281a("mobile_switch_team_guidance", true);
    }

    /* renamed from: a */
    public void mo157227a(final List<TenantInfo> list, final List<TenantInfo.PendingUser> list2) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.main.app.drawer.C44207a.RunnableC442103 */

            public void run() {
                TenantInfoUtils.f112730a.mo157793a(list, list2, new IGetDataCallback<List<TenantInfo>>() {
                    /* class com.ss.android.lark.main.app.drawer.C44207a.RunnableC442103.C442111 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165397w("MainModuleDrawerModel", "fill tenant'badge failed!");
                    }

                    /* renamed from: a */
                    public void onSuccess(List<TenantInfo> list) {
                        if (C44207a.this.f112174b != null) {
                            Log.m165389i("MainModuleDrawerModel", "method fillTenantBadgeForTiming finished");
                            C44207a.this.f112174b.mo157263a(list, list2);
                        }
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44233a
    /* renamed from: a */
    public void mo157225a(Context context, String str, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f112173a.mo133397a(context, str, iGetDataCallback);
    }
}
