package com.ss.android.lark.main.app.widgets.desktop.tenant_switcher;

import android.text.TextUtils;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.C44325i;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.C44487b;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.C44488c;
import com.ss.android.lark.main.interfaces.AbstractC44503f;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.c */
public class C44470c extends BaseModel implements C44464b.AbstractC44465a {

    /* renamed from: a */
    public C44464b.AbstractC44465a.AbstractC44466a f112813a;

    /* renamed from: b */
    private AbstractC44136a.AbstractC44154j f112814b;

    /* renamed from: c */
    private AbstractC44136a.AbstractC44171x f112815c;

    /* renamed from: d */
    private AbstractC44136a.AbstractC44137a f112816d;

    /* renamed from: e */
    private AbstractC44503f f112817e = new AbstractC44503f() {
        /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44470c.C444711 */

        @Override // com.ss.android.lark.main.interfaces.AbstractC44503f
        /* renamed from: a */
        public void mo157234a(List<TenantInfo> list, List<TenantInfo.PendingUser> list2) {
            if (C44470c.this.f112813a != null) {
                C44470c.this.f112813a.mo157885a(C44488c.m176497a(list));
            }
        }
    };

    /* renamed from: f */
    private AbstractC44544a f112818f = new AbstractC44544a() {
        /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44470c.C444722 */

        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: a */
        public void mo102546a() {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: b */
        public void mo102548b() {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: a */
        public void mo102547a(String str) {
            if (C44470c.this.f112813a != null) {
                C44470c.this.f112813a.mo157884a();
            }
        }
    };

    @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44465a
    /* renamed from: a */
    public boolean mo157883a() {
        return !this.f112815c.mo133418h();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C44325i.m175831a().mo157444b(this.f112818f);
        this.f112815c.mo133408b(this.f112817e);
        super.destroy();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f112814b = C44134a.m174959a().mo133240c();
        this.f112815c = C44134a.m174959a().mo133188H();
        this.f112816d = C44134a.m174959a().mo133251g();
        this.f112813a.mo157885a(C44488c.m176497a(this.f112815c.mo133395a()));
        this.f112815c.mo133400a(this.f112817e);
        C44325i.m175831a().mo157440a(this.f112818f);
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44465a
    /* renamed from: a */
    public void mo157880a(C44464b.AbstractC44465a.AbstractC44466a aVar) {
        this.f112813a = aVar;
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44465a
    /* renamed from: a */
    public void mo157882a(boolean z) {
        this.f112815c.mo133413c(z);
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44465a
    /* renamed from: a */
    public void mo157881a(C44487b bVar, IGetDataCallback<String> iGetDataCallback) {
        if (!TextUtils.equals(this.f112816d.mo133318a(), bVar.mo157910c())) {
            try {
                Log.m165389i("MainTenantSwitchModel", "switch tenant user = " + bVar.mo157910c() + " session = " + this.f112816d.mo133321c().substring(0, 6));
            } catch (Exception unused) {
            }
            Log.m165379d("SwitchSignListener", "on switch start time = " + System.currentTimeMillis());
            this.f112815c.mo133402a(bVar.mo157919l(), this.f112816d.mo133321c(), iGetDataCallback);
        }
    }
}
