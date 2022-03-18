package com.bytedance.apm.battery;

import android.app.Activity;
import android.os.Build;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.battery.p134d.C2826a;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p143i.AbstractC2946a;
import com.bytedance.apm.p153n.C3047b;
import com.ss.p3204b.C64199c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.b */
public class C2802b extends AbstractC2946a {

    /* renamed from: a */
    private static int f8946a = 10;

    /* renamed from: b */
    private boolean f8947b;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: d */
    public long mo12102d() {
        return 300000;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: c */
    public boolean mo12101c() {
        return this.f8947b;
    }

    public C2802b() {
        this.f9459k = "battery";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: e */
    public void mo12103e() {
        super.mo12103e();
        if (this.f8947b && !mo12652n() && !C2826a.m11956a(C2785b.m11735a())) {
            float b = C64199c.m252472b(C2785b.m11735a());
            if (b >= ((float) f8946a)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timing_current", (double) b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
                    mo12646a(new C2753f("battery", "", jSONObject, jSONObject2, null));
                } catch (JSONException unused) {
                }
            }
        }
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a, com.bytedance.services.apm.api.AbstractC20698c
    public void onBackground(Activity activity) {
        super.onBackground(activity);
        C3047b.m12756a().mo12889b(this);
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a, com.bytedance.services.apm.api.AbstractC20698c
    public void onFront(Activity activity) {
        super.onFront(activity);
        if (this.f8947b) {
            C3047b.m12756a().mo12883a(this);
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
        this.f8947b = z;
    }
}
