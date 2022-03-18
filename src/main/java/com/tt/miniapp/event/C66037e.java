package com.tt.miniapp.event;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.util.TimeMeter;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tt.miniapp.event.e */
public class C66037e {

    /* renamed from: a */
    private volatile String f166693a = "mini_process_unknown";

    /* renamed from: b */
    private volatile TimeMeter f166694b;

    /* renamed from: c */
    private volatile TimeMeter f166695c;

    /* renamed from: d */
    private volatile TimeMeter f166696d;

    /* renamed from: e */
    private volatile AtomicBoolean f166697e = new AtomicBoolean(false);

    /* renamed from: f */
    private IAppContext f166698f;

    /* renamed from: a */
    public String mo231114a() {
        String str;
        synchronized (this) {
            str = this.f166693a;
        }
        return str;
    }

    /* renamed from: b */
    public long mo231117b() {
        return TimeMeter.nowAfterStart(this.f166694b);
    }

    /* renamed from: c */
    public long mo231120c() {
        return TimeMeter.nowAfterStart(this.f166695c);
    }

    /* renamed from: d */
    public void mo231121d() {
        this.f166696d = TimeMeter.newAndStart();
    }

    /* renamed from: e */
    public void mo231122e() {
        TimeMeter.stop(this.f166696d);
    }

    /* renamed from: a */
    public void mo231115a(TimeMeter timeMeter) {
        this.f166695c = timeMeter;
    }

    /* renamed from: a */
    public static C66037e m258610a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234300u();
    }

    /* renamed from: b */
    public void mo231119b(String str) {
        C66036d.m258581a(str, TimeMeter.stop(this.f166696d), this.f166698f);
    }

    public C66037e(IAppContext iAppContext) {
        this.f166698f = iAppContext;
    }

    /* renamed from: b */
    public void mo231118b(TimeMeter timeMeter) {
        this.f166694b = timeMeter;
        if (this.f166697e.get()) {
            this.f166697e.set(false);
            C66036d.m258597b(mo231117b(), "cancel", "process killed", mo231120c(), mo231114a(), this.f166698f);
        }
    }

    /* renamed from: a */
    public void mo231116a(String str) {
        synchronized (this) {
            this.f166693a = str;
        }
        if (this.f166694b == null) {
            this.f166697e.set(true);
            AppBrandLogger.m52829e("tma_LoadStateManager", "setLoadState, mLoadStartTime is null.");
            return;
        }
        C66036d.m258597b(mo231117b(), "cancel", "process killed", mo231120c(), str, this.f166698f);
        AppBrandLogger.m52830i("tma_LoadStateManager", "r60508: updateLoadState: " + str);
    }
}
