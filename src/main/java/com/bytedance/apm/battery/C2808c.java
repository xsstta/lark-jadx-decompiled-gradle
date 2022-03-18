package com.bytedance.apm.battery;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm.p143i.AbstractC2946a;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.c */
public class C2808c extends AbstractC2946a {

    /* renamed from: a */
    private BroadcastReceiver f8984a;

    /* renamed from: b */
    private IntentFilter f8985b;

    /* renamed from: c */
    private boolean f8986c;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: c */
    public boolean mo12101c() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: d */
    public long mo12102d() {
        return 0;
    }

    public C2808c() {
        this.f9459k = "battery";
    }

    /* renamed from: f */
    private void m11880f() {
        if (this.f8986c) {
            try {
                C2785b.m11735a().unregisterReceiver(this.f8984a);
                this.f8986c = false;
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: b */
    public void mo12123b() {
        this.f8984a = new BroadcastReceiver() {
            /* class com.bytedance.apm.battery.C2808c.C28091 */

            public void onReceive(Context context, Intent intent) {
                final float intExtra = ((float) intent.getIntExtra("temperature", 0)) / 10.0f;
                final float intExtra2 = (((float) intent.getIntExtra("level", 0)) * 100.0f) / ((float) intent.getIntExtra("scale", 100));
                final String topActivityClassName = ActivityLifeObserver.getInstance().getTopActivityClassName();
                if (!TextUtils.isEmpty(topActivityClassName)) {
                    C3047b.m12756a().mo12886a(new Runnable() {
                        /* class com.bytedance.apm.battery.C2808c.C28091.RunnableC28101 */

                        public void run() {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("battery_temperature", (double) intExtra);
                                jSONObject.put("remaining_energy", (double) intExtra2);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("scene", topActivityClassName);
                                C2741a.m11630c().mo11785a(new C2753f("temperature", "", jSONObject, jSONObject2, null));
                                if (C2921a.m12357a()) {
                                    C2921a.m12361d("TemperatureCollector", jSONObject.toString());
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        };
        this.f8985b = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    /* renamed from: a */
    private void m11879a() {
        if (!this.f8986c) {
            try {
                m11878a(C2785b.m11735a(), this.f8984a, this.f8985b);
                this.f8986c = true;
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a, com.bytedance.services.apm.api.AbstractC20698c
    public void onBackground(Activity activity) {
        super.onBackground(activity);
        m11880f();
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a, com.bytedance.services.apm.api.AbstractC20698c
    public void onFront(Activity activity) {
        super.onFront(activity);
        m11879a();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: a */
    public void mo12099a(JSONObject jSONObject) {
        super.mo12099a(jSONObject);
        boolean z = false;
        if (jSONObject.optInt("temperature_enable_upload", 0) == 1) {
            z = true;
        }
        this.f9460l = z;
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m11878a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
