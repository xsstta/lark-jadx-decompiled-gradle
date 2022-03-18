package com.tt.miniapp.p3258a;

import android.app.Application;
import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.launchschedule.LaunchScheduler;
import com.tt.miniapphost.AppbrandContext;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.tt.miniapp.a.a */
public abstract class AbstractC65717a<T> implements AbstractC65718b<T> {

    /* renamed from: a */
    protected Context f165589a;

    /* renamed from: b */
    protected boolean f165590b = true;

    /* renamed from: c */
    protected Set<String> f165591c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo230306a() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Enum[] mo230310b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Enum[] mo230311c();

    public AbstractC65717a() {
        boolean z;
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        this.f165589a = applicationContext;
        if (C12738a.m52722a(applicationContext, mo230306a(), mo230310b()) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f165590b = z;
        List<String> a = C12738a.m52724a(this.f165589a, mo230311c());
        if (a != null && !a.isEmpty()) {
            this.f165591c = new HashSet(a);
        }
        AppBrandLogger.m52830i("BridgeStrategy", "mShouldBlock: " + this.f165590b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo230308a(T t, String str) {
        if (this.f165590b) {
            return true;
        }
        Set<String> set = this.f165591c;
        if (set == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    @Override // com.tt.miniapp.p3258a.AbstractC65718b
    /* renamed from: a */
    public void mo230307a(T t, String str, IAppContext iAppContext) {
        if (mo230308a(t, str)) {
            mo230309b(t, str, iAppContext);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo230309b(T t, String str, IAppContext iAppContext) {
        AppBrandLogger.m52830i("BridgeStrategy", "will block event: " + str);
        ((LaunchScheduler) AppbrandApplicationImpl.getInst(iAppContext).getService(LaunchScheduler.class)).waitForViewBound();
    }
}
