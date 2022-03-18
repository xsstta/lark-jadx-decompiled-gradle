package com.bytedance.apm.p143i;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p139e.C2925e;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.services.apm.api.AbstractC20698c;
import com.bytedance.services.slardar.config.AbstractC20704a;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.i.a */
public abstract class AbstractC2946a implements C3047b.AbstractC3052b, AbstractC20698c, AbstractC20704a {

    /* renamed from: a */
    private boolean f9454a;

    /* renamed from: b */
    private boolean f9455b;

    /* renamed from: c */
    private boolean f9456c;

    /* renamed from: d */
    private boolean f9457d;

    /* renamed from: e */
    private long f9458e;

    /* renamed from: k */
    public String f9459k;

    /* renamed from: l */
    protected boolean f9460l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12099a(JSONObject jSONObject) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12123b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo12101c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract long mo12102d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo12103e() {
    }

    /* access modifiers changed from: protected */
    public void g_() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo12650l() {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityPause(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityResume(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onChange(Activity activity, Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo12651m() {
        return this.f9454a;
    }

    /* renamed from: n */
    public boolean mo12652n() {
        return this.f9455b;
    }

    @Override // com.bytedance.services.slardar.config.AbstractC20704a
    public void onReady() {
        this.f9454a = true;
        mo12733a();
    }

    /* renamed from: a */
    private final void mo12733a() {
        if (!this.f9457d) {
            this.f9457d = true;
            if (mo12101c()) {
                C3047b.m12756a().mo12883a(this);
            }
        }
        mo12103e();
        this.f9458e = System.currentTimeMillis();
    }

    /* renamed from: j */
    public final void mo12648j() {
        if (this.f9457d) {
            this.f9457d = false;
            if (mo12101c()) {
                C3047b.m12756a().mo12889b(this);
            }
        }
        g_();
    }

    /* renamed from: k */
    public final void mo12649k() {
        ActivityLifeObserver.getInstance().unregister(this);
        ((IConfigManager) C20216d.m73783a(IConfigManager.class)).unregisterConfigListener(this);
        mo12650l();
    }

    /* renamed from: i */
    public final void mo12647i() {
        if (!this.f9456c) {
            if (!TextUtils.isEmpty(this.f9459k)) {
                this.f9456c = true;
                ActivityLifeObserver.getInstance().register(this);
                this.f9455b = !ActivityLifeObserver.getInstance().isForeground();
                mo12123b();
                ((IConfigManager) C20216d.m73783a(IConfigManager.class)).registerConfigListener(this);
                if (C2785b.m11769j()) {
                    C2925e.m12375d("AbstractPerfCollector", "perf init: " + this.f9459k);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must set collector Setting key, before init");
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onBackground(Activity activity) {
        this.f9455b = true;
        if (C2785b.m11766g()) {
            mo12648j();
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onFront(Activity activity) {
        this.f9455b = false;
        if (C2785b.m11766g() && this.f9454a) {
            mo12733a();
        }
    }

    @Override // com.bytedance.apm.p153n.C3047b.AbstractC3052b
    public final void onTimeEvent(long j) {
        long d = mo12102d();
        if (d > 0 && j - this.f9458e > d && this.f9454a) {
            mo12103e();
            this.f9458e = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public void mo12646a(C2753f fVar) {
        C2949b.m12420a(fVar);
        C2949b.m12421a(fVar, fVar.mo11823e());
        C2741a.m11630c().mo11785a(fVar);
    }

    @Override // com.bytedance.services.slardar.config.AbstractC20704a
    public void onRefresh(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject(this.f9459k)) != null) {
            boolean z2 = false;
            if (optJSONObject.optInt("enable_upload", 0) == 1) {
                z2 = true;
            }
            this.f9460l = z2;
            mo12099a(optJSONObject);
        }
    }
}
