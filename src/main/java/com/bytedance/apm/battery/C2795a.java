package com.bytedance.apm.battery;

import android.app.Activity;
import android.os.Build;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.battery.config.C2824a;
import com.bytedance.apm.battery.p130a.C2799b;
import com.bytedance.apm.battery.p131b.C2803a;
import com.bytedance.apm.battery.p132c.AbstractC2823h;
import com.bytedance.apm.battery.p132c.C2819d;
import com.bytedance.apm.battery.p132c.C2820e;
import com.bytedance.apm.battery.p132c.C2821f;
import com.bytedance.apm.battery.p132c.C2822g;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p137c.C2878a;
import com.bytedance.apm.p139e.C2922b;
import com.bytedance.apm.p139e.C2925e;
import com.bytedance.apm.p143i.AbstractC2946a;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.a */
public class C2795a extends AbstractC2946a {

    /* renamed from: a */
    private final Map<String, AbstractC2823h> f8931a;

    /* renamed from: b */
    private long f8932b;

    /* renamed from: c */
    private boolean f8933c;

    /* renamed from: d */
    private long f8934d;

    /* renamed from: e */
    private boolean f8935e;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.battery.a$a */
    public static final class C2797a {

        /* renamed from: a */
        public static final C2795a f8936a = new C2795a();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: c */
    public boolean mo12101c() {
        return true;
    }

    /* renamed from: a */
    public static C2795a m11824a() {
        return C2797a.f8936a;
    }

    /* renamed from: f */
    public Map<String, AbstractC2823h> mo12124f() {
        return this.f8931a;
    }

    /* renamed from: g */
    public boolean mo12125g() {
        return this.f8935e;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: d */
    public long mo12102d() {
        return this.f8934d * 60000;
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a, com.bytedance.services.slardar.config.AbstractC20704a
    public void onReady() {
        super.onReady();
        C2803a.m11844a().mo12135b();
    }

    private C2795a() {
        this.f8931a = new ConcurrentHashMap();
        this.f8932b = -1;
        this.f9459k = "battery";
    }

    /* renamed from: h */
    private void m11825h() {
        if (C2785b.m11769j()) {
            C2925e.m12374c(C2922b.f9427b, "onChangeToFront, record data");
        }
        m11827p();
        for (AbstractC2823h hVar : this.f8931a.values()) {
            hVar.mo12168c();
        }
        this.f8933c = true;
    }

    /* renamed from: o */
    private void m11826o() {
        if (C2785b.m11769j()) {
            C2925e.m12374c(C2922b.f9427b, "onChangeToBack, record data");
        }
        m11827p();
        for (AbstractC2823h hVar : this.f8931a.values()) {
            hVar.mo12167b();
        }
        this.f8933c = false;
    }

    /* renamed from: p */
    private void m11827p() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f8932b != -1) {
            C2803a.m11844a().mo12134a(ActivityLifeObserver.getInstance().getTopActivityClassName());
            C2803a.m11844a().mo12133a(new C2878a(this.f8933c, currentTimeMillis, "ground_record", currentTimeMillis - this.f8932b));
        }
        this.f8932b = currentTimeMillis;
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: e */
    public void mo12103e() {
        if (C2785b.m11769j()) {
            String str = C2922b.f9427b;
            C2925e.m12374c(str, "onTimer record, current is background? : " + ActivityLifeObserver.getInstance().isForeground());
        }
        m11827p();
        for (AbstractC2823h hVar : this.f8931a.values()) {
            hVar.h_();
        }
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: b */
    public void mo12123b() {
        if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 29) {
            this.f8933c = ActivityLifeObserver.getInstance().isForeground();
            this.f8932b = System.currentTimeMillis();
            C2819d dVar = new C2819d();
            C2822g gVar = new C2822g();
            try {
                C2799b bVar = new C2799b();
                bVar.mo12128a("alarm", dVar);
                bVar.mo12128a("power", gVar);
                bVar.mo12127a();
                C2820e eVar = new C2820e();
                C2821f fVar = new C2821f();
                this.f8931a.put("alarm", dVar);
                this.f8931a.put("cpu_active_time", eVar);
                this.f8931a.put("traffic", fVar);
                this.f8931a.put("power", gVar);
                C3047b.m12756a().mo12883a(this);
                if (C2785b.m11761e() && mo12651m()) {
                    C2803a.m11844a().mo12135b();
                }
            } catch (Exception e) {
                if (C2785b.m11769j()) {
                    String str = C2922b.f9427b;
                    C2925e.m12372a(str, "hook failed: " + e.getMessage());
                }
                ActivityLifeObserver.getInstance().unregister(this);
                ((IConfigManager) C20216d.m73783a(IConfigManager.class)).unregisterConfigListener(this);
            }
        }
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a, com.bytedance.services.apm.api.AbstractC20698c
    public void onBackground(Activity activity) {
        super.onBackground(activity);
        m11826o();
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a, com.bytedance.services.apm.api.AbstractC20698c
    public void onFront(Activity activity) {
        super.onFront(activity);
        m11825h();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: a */
    public void mo12099a(JSONObject jSONObject) {
        this.f8934d = jSONObject.optLong("battery_record_interval", 10);
        boolean z = false;
        int optInt = jSONObject.optInt("enable_upload", 0);
        if (C2785b.m11769j()) {
            String str = C2922b.f9427b;
            C2925e.m12372a(str, "mRecordInterval:" + this.f8934d + ",mBatteryCollectEnabled" + optInt);
        }
        if (optInt <= 0 || this.f8934d <= 0) {
            this.f8931a.clear();
            ActivityLifeObserver.getInstance().unregister(this);
            C3047b.m12756a().mo12889b(this);
        }
        if (jSONObject.optInt("trace_enable", 0) == 1) {
            z = true;
        }
        this.f8935e = z;
        if (z) {
            C2824a.m11943a(jSONObject.optLong("max_single_wake_lock_hold_time_second", 120) * 1000);
            C2824a.m11942a(jSONObject.optInt("max_total_wake_lock_acquire_count", 5));
            C2824a.m11946b(jSONObject.optLong("max_total_wake_lock_hold_time_second", 240) * 1000);
            C2824a.m11945b(jSONObject.optInt("max_wake_up_alarm_invoke_count", 5));
            C2824a.m11948c(jSONObject.optInt("max_normal_alarm_invoke_count", 10));
            C2824a.m11949c(jSONObject.optLong("max_single_loc_request_time_second", 120) * 1000);
            C2824a.m11951d(jSONObject.optInt("max_total_loc_request_count", 5));
            C2824a.m11952d(jSONObject.optLong("max_total_loc_request_time_second", 240) * 1000);
        }
    }
}
