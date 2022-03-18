package com.ss.lark.android.passport.biz.compat.tenant;

import android.text.TextUtils;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.service.AbstractC49129o;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49404s;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.lark.android.passport.biz.compat.tenant.a */
public class C64471a {

    /* renamed from: a */
    public static C64471a f162788a;

    /* renamed from: b */
    private volatile AbstractC49129o f162789b;

    /* renamed from: c */
    private volatile C64473c f162790c;

    /* renamed from: d */
    private final List<AbstractC49405t> f162791d = new ArrayList();

    /* renamed from: e */
    private final List<AbstractC49404s> f162792e = new ArrayList();

    /* renamed from: f */
    private final Set<AbstractC49405t> f162793f = new HashSet();

    /* renamed from: b */
    public void mo223064b() {
        if (m253328f()) {
            this.f162789b.unInit();
        }
    }

    /* renamed from: f */
    private boolean m253328f() {
        if (this.f162789b != null && this.f162790c != null) {
            return true;
        }
        Log.m165383e("TenantModuleExport", "tenant Manager is not inited");
        return false;
    }

    /* renamed from: c */
    public List<TenantInfo> mo223068c() {
        if (!m253328f()) {
            return new ArrayList();
        }
        return this.f162789b.getTenantData();
    }

    /* renamed from: d */
    public List<TenantInfo.PendingUser> mo223069d() {
        if (!m253328f()) {
            return new ArrayList();
        }
        return this.f162789b.getPendingUsers();
    }

    /* renamed from: e */
    public int mo223070e() {
        if (m253328f()) {
            return this.f162789b.getLocalAccountUserCount();
        }
        Log.m165383e("TenantModuleExport", "getLocalTenantAccountUserAccount return 0 for uninit state");
        return 0;
    }

    /* renamed from: a */
    public synchronized void mo223058a() {
        this.f162789b = ServiceFinder.m193754i();
        this.f162790c = new C64473c();
        this.f162789b.init();
        for (AbstractC49404s sVar : this.f162792e) {
            mo223059a(sVar);
        }
        this.f162792e.clear();
        HashSet<AbstractC49405t> hashSet = new HashSet(this.f162791d.size() + this.f162793f.size());
        hashSet.addAll(this.f162791d);
        hashSet.addAll(this.f162793f);
        for (AbstractC49405t tVar : hashSet) {
            mo223060a(tVar);
        }
        this.f162791d.clear();
    }

    /* renamed from: a */
    public synchronized void mo223060a(AbstractC49405t tVar) {
        mo223061a(tVar, false);
    }

    /* renamed from: b */
    public synchronized void mo223065b(AbstractC49404s sVar) {
        if (sVar != null) {
            this.f162792e.remove(sVar);
        }
        if (m253328f()) {
            this.f162790c.mo223074b(sVar);
        }
    }

    /* renamed from: a */
    public TenantInfo mo223057a(String str) {
        Iterator it = new ArrayList(mo223068c()).iterator();
        while (it.hasNext()) {
            TenantInfo tenantInfo = (TenantInfo) it.next();
            if (TextUtils.equals(tenantInfo.getUserId(), str)) {
                return tenantInfo;
            }
        }
        return null;
    }

    /* renamed from: b */
    public synchronized void mo223066b(AbstractC49405t tVar) {
        if (tVar != null) {
            this.f162791d.remove(tVar);
        }
        if (m253328f()) {
            this.f162789b.unRegisterTenantInfoListener(tVar);
        }
    }

    /* renamed from: b */
    public void mo223067b(String str) {
        if (m253328f() && ServiceFinder.m193752g().isDefaultTab(str)) {
            this.f162790c.mo223071a();
        }
    }

    /* renamed from: a */
    public synchronized void mo223059a(AbstractC49404s sVar) {
        if (!m253328f()) {
            if (sVar != null && !this.f162792e.contains(sVar)) {
                this.f162792e.add(sVar);
            }
            return;
        }
        this.f162790c.mo223072a(sVar);
    }

    /* renamed from: a */
    public void mo223063a(boolean z) {
        if (m253328f()) {
            this.f162790c.mo223073a(z);
        }
    }

    /* renamed from: a */
    public synchronized void mo223061a(AbstractC49405t tVar, boolean z) {
        if (z) {
            this.f162793f.add(tVar);
            Log.m165389i("TenantModuleExport", "register is " + tVar.getClass().getName() + ", add into forever");
        }
        if (!m253328f()) {
            if (tVar != null && !this.f162791d.contains(tVar)) {
                this.f162791d.add(tVar);
                Log.m165389i("TenantModuleExport", "register is " + tVar.getClass().getName() + ", add into pending");
            }
            return;
        }
        this.f162789b.registerTenantInfoListener(tVar);
    }

    /* renamed from: a */
    public void mo223062a(String str, String str2, IGetDataCallback<TenantInfo> iGetDataCallback) {
        if (m253328f()) {
            this.f162789b.refreshTenantData(str, str2, iGetDataCallback);
        }
    }
}
