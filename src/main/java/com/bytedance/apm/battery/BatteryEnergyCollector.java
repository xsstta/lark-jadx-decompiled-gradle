package com.bytedance.apm.battery;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p143i.AbstractC2946a;
import com.bytedance.apm.p143i.p147c.C2977g;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3112b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.p3204b.AbstractC64198b;
import com.ss.p3204b.C64196a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONException;
import org.json.JSONObject;

public class BatteryEnergyCollector extends AbstractC2946a {

    /* renamed from: a */
    public String f8908a;

    /* renamed from: b */
    public ConcurrentHashMap<String, C2793a> f8909b;

    /* renamed from: c */
    public final Object f8910c;

    /* renamed from: d */
    public long f8911d;

    /* renamed from: e */
    public float f8912e;

    /* renamed from: f */
    public long f8913f;

    /* renamed from: g */
    public long f8914g;

    /* renamed from: h */
    public boolean f8915h;

    /* renamed from: i */
    public C2977g f8916i;

    /* renamed from: j */
    public CopyOnWriteArrayList<Long> f8917j;

    /* renamed from: m */
    private boolean f8918m;

    /* renamed from: n */
    private int f8919n;

    /* renamed from: o */
    private long f8920o;

    /* renamed from: p */
    private AbstractC64198b f8921p;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.battery.BatteryEnergyCollector$b */
    public static final class C2794b {

        /* renamed from: a */
        public static final BatteryEnergyCollector f8930a = new BatteryEnergyCollector();
    }

    /* renamed from: com.bytedance.apm.battery.BatteryEnergyCollector$a */
    public class C2793a {

        /* renamed from: a */
        float f8924a;

        /* renamed from: b */
        long f8925b;

        /* renamed from: c */
        long f8926c;

        /* renamed from: d */
        long f8927d;

        /* renamed from: e */
        StringBuilder f8928e = new StringBuilder();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo12113a() {
            return this.f8924a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo12117b() {
            return this.f8925b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo12119c() {
            return this.f8926c;
        }

        /* renamed from: d */
        public long mo12121d() {
            return this.f8927d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo12122e() {
            return this.f8928e.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12114a(float f) {
            this.f8924a = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo12118b(long j) {
            this.f8926c = j;
        }

        /* renamed from: c */
        public void mo12120c(long j) {
            this.f8927d = j;
        }

        public C2793a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12115a(long j) {
            this.f8925b = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12116a(List<Long> list) {
            if (!(list == null || list.size() == 0)) {
                for (int i = 0; i < list.size() - 1; i++) {
                    StringBuilder sb = this.f8928e;
                    sb.append(list.get(i));
                    sb.append(',');
                }
                this.f8928e.append(list.get(list.size() - 1));
            }
        }
    }

    /* renamed from: a */
    public static BatteryEnergyCollector m11801a() {
        return C2794b.f8930a;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: d */
    public long mo12102d() {
        return this.f8920o;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    public void g_() {
        super.g_();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: c */
    public boolean mo12101c() {
        return !mo12652n();
    }

    /* renamed from: h */
    public void mo12106h() {
        this.f8911d = 0;
        this.f8912e = BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: f */
    public void mo12104f() {
        if (!TextUtils.isEmpty(this.f8908a)) {
            this.f8908a = null;
            C3047b.m12756a().mo12889b(this);
            C64196a.m252465a();
            mo12106h();
        }
    }

    private BatteryEnergyCollector() {
        this.f8909b = new ConcurrentHashMap<>();
        this.f8910c = new Object();
        this.f8911d = 0;
        this.f8912e = BitmapDescriptorFactory.HUE_RED;
        this.f8913f = 0;
        this.f8914g = 0;
        this.f8916i = C2977g.m12520a();
        this.f8917j = new CopyOnWriteArrayList<>();
        this.f8921p = new AbstractC64198b() {
            /* class com.bytedance.apm.battery.BatteryEnergyCollector.C27921 */

            @Override // com.ss.p3204b.AbstractC64198b
            /* renamed from: a */
            public void mo12109a() {
                BatteryEnergyCollector.this.mo12106h();
            }

            @Override // com.ss.p3204b.AbstractC64198b
            /* renamed from: b */
            public void mo12111b() {
                BatteryEnergyCollector.this.mo12106h();
            }

            @Override // com.ss.p3204b.AbstractC64198b
            /* renamed from: a */
            public void mo12110a(float f, float f2, long j) {
                synchronized (BatteryEnergyCollector.this.f8910c) {
                    if (!TextUtils.isEmpty(BatteryEnergyCollector.this.f8908a)) {
                        if (!BatteryEnergyCollector.this.mo12652n()) {
                            if (!BatteryEnergyCollector.this.f8915h) {
                                if (BatteryEnergyCollector.this.f8911d == 0) {
                                    BatteryEnergyCollector.this.f8913f = C3112b.m12951e();
                                    BatteryEnergyCollector batteryEnergyCollector = BatteryEnergyCollector.this;
                                    batteryEnergyCollector.f8914g = batteryEnergyCollector.f8916i.mo12721h();
                                    BatteryEnergyCollector.this.f8917j.clear();
                                }
                                BatteryEnergyCollector.this.f8911d++;
                                BatteryEnergyCollector.this.f8912e += f;
                                if (BatteryEnergyCollector.this.f8911d > 20) {
                                    if (BatteryEnergyCollector.this.f8912e > 200.0f) {
                                        float f3 = BatteryEnergyCollector.this.f8912e / ((float) BatteryEnergyCollector.this.f8911d);
                                        C2793a aVar = new C2793a();
                                        aVar.mo12114a(f3);
                                        aVar.mo12120c(j);
                                        aVar.mo12115a(C3112b.m12951e() - BatteryEnergyCollector.this.f8913f);
                                        aVar.mo12118b(BatteryEnergyCollector.this.f8916i.mo12721h() - BatteryEnergyCollector.this.f8914g);
                                        aVar.mo12116a(BatteryEnergyCollector.this.f8917j);
                                        BatteryEnergyCollector.this.f8909b.put(BatteryEnergyCollector.this.f8908a, aVar);
                                    }
                                    BatteryEnergyCollector.this.mo12106h();
                                }
                                return;
                            }
                        }
                        BatteryEnergyCollector.this.mo12104f();
                    }
                }
            }
        };
        this.f9459k = "battery";
        m11802a(C2785b.m11735a());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: e */
    public void mo12103e() {
        super.mo12103e();
        for (Map.Entry<String, C2793a> entry : this.f8909b.entrySet()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("scene", entry.getKey());
                jSONObject.put("current", (double) entry.getValue().mo12113a());
                jSONObject.put("capacity", entry.getValue().mo12121d());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("cpu_time", entry.getValue().mo12117b());
                jSONObject3.put("traffic", entry.getValue().mo12119c());
                jSONObject3.put("loc", entry.getValue().mo12122e());
                C2741a.m11630c().mo11785a(new C2753f("battery", "", jSONObject, jSONObject2, jSONObject3));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a, com.bytedance.services.apm.api.AbstractC20698c
    public void onFront(Activity activity) {
        super.onFront(activity);
    }

    public class PowerConnectionReceiver extends BroadcastReceiver {
        public PowerConnectionReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            boolean z;
            int intExtra = intent.getIntExtra(UpdateKey.STATUS, -1);
            BatteryEnergyCollector batteryEnergyCollector = BatteryEnergyCollector.this;
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            } else {
                z = false;
            }
            batteryEnergyCollector.f8915h = z;
            if (BatteryEnergyCollector.this.f8915h) {
                synchronized (BatteryEnergyCollector.this.f8910c) {
                    BatteryEnergyCollector.this.mo12104f();
                }
            }
        }
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a, com.bytedance.services.apm.api.AbstractC20698c
    public void onBackground(Activity activity) {
        super.onBackground(activity);
        C3047b.m12756a().mo12889b(this);
        synchronized (this.f8910c) {
            mo12104f();
        }
    }

    /* renamed from: a */
    private void m11802a(Context context) {
        boolean z;
        try {
            Intent a = m11800a(context, new PowerConnectionReceiver(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (a != null) {
                int intExtra = a.getIntExtra(UpdateKey.STATUS, -1);
                if (intExtra != 2) {
                    if (intExtra != 5) {
                        z = false;
                        this.f8915h = z;
                        return;
                    }
                }
                z = true;
                this.f8915h = z;
                return;
            }
        } catch (Throwable unused) {
        }
        this.f8915h = true;
    }

    /* renamed from: b */
    public void mo12100b(String str) {
        if (this.f8918m) {
            synchronized (this.f8910c) {
                if (str.equals(this.f8908a)) {
                    this.f8908a = null;
                    C3047b.m12756a().mo12889b(this);
                    C64196a.m252465a();
                    mo12106h();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo12098a(String str) {
        if (this.f8918m && !mo12652n() && !this.f8915h) {
            synchronized (this.f8910c) {
                C64196a.m252466a(C2785b.m11735a(), this.f8921p, 5, this.f8919n);
                if (TextUtils.isEmpty(this.f8908a)) {
                    C3047b.m12756a().mo12883a(this);
                }
                this.f8908a = str;
                mo12106h();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: a */
    public void mo12099a(JSONObject jSONObject) {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 21 || jSONObject.optInt("energy_enable", 0) != 1) {
            z = false;
        }
        this.f8918m = z;
        if (z) {
            this.f8919n = jSONObject.optInt("battery_energy_sample_interval", 3000);
            this.f8920o = jSONObject.optLong("battery_energy_upload_interval", 120000);
            return;
        }
        ActivityLifeObserver.getInstance().unregister(this);
        C3047b.m12756a().mo12889b(this);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m11800a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
