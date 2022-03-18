package com.tt.miniapp.p3337v;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.location.LocationRequest;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.manager.C66420d;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.ContextSingletonInstance;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.v.a */
public class C67073a {

    /* renamed from: a */
    public Map<IAppContext, C67075a> f169050a = new ConcurrentHashMap();

    /* renamed from: b */
    private Context f169051b;

    /* renamed from: c */
    private boolean f169052c;

    /* renamed from: com.tt.miniapp.v.a$a */
    private static class C67075a implements SensorEventListener {

        /* renamed from: a */
        public volatile boolean f169054a;

        /* renamed from: b */
        boolean f169055b;

        /* renamed from: c */
        public int f169056c = LocationRequest.PRIORITY_HD_ACCURACY;

        /* renamed from: d */
        private Context f169057d;

        /* renamed from: e */
        private SensorManager f169058e;

        /* renamed from: f */
        private IAppContext f169059f;

        /* renamed from: g */
        private long f169060g = -1;

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        /* renamed from: a */
        public boolean mo233174a() {
            return this.f169055b;
        }

        /* renamed from: c */
        public void mo233176c() {
            this.f169055b = false;
            this.f169058e.unregisterListener(this);
        }

        /* renamed from: b */
        public void mo233175b() {
            if (!this.f169055b) {
                if (AppbrandApplicationImpl.getInst(this.f169059f).getForeBackgroundManager().mo231961c()) {
                    this.f169054a = true;
                    this.f169055b = true;
                    return;
                }
                SensorManager sensorManager = (SensorManager) this.f169057d.getSystemService("sensor");
                this.f169058e = sensorManager;
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                if (defaultSensor != null) {
                    this.f169055b = this.f169058e.registerListener(this, defaultSensor, 1);
                } else {
                    this.f169055b = false;
                }
            }
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (this.f169055b && sensorEvent.sensor.getType() == 1) {
                float f = (-sensorEvent.values[0]) / 9.8f;
                float f2 = (-sensorEvent.values[1]) / 9.8f;
                float f3 = (-sensorEvent.values[2]) / 9.8f;
                if (f > 1.0f) {
                    f = 1.0f;
                } else if (f < -1.0f) {
                    f = -1.0f;
                }
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                } else if (f2 < -1.0f) {
                    f2 = -1.0f;
                }
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                } else if (f3 < -1.0f) {
                    f3 = -1.0f;
                }
                if (System.currentTimeMillis() - this.f169060g >= ((long) this.f169056c)) {
                    this.f169060g = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", (double) f);
                        jSONObject.put("y", (double) f2);
                        jSONObject.put("z", (double) f3);
                        C67432a.m262319a(this.f169059f).getJsBridge().sendMsgToJsCore("onAccelerometerChange", jSONObject.toString());
                    } catch (Exception e) {
                        AppBrandLogger.stacktrace(6, "tma_AccelermeterManager", e.getStackTrace());
                    }
                }
            }
        }

        public C67075a(Context context, IAppContext iAppContext) {
            this.f169057d = context;
            this.f169059f = iAppContext;
        }
    }

    /* renamed from: a */
    public static C67073a m261408a(Context context) {
        return ContextSingletonInstance.getInstance().getAccelermeterManager(context);
    }

    public C67073a(Context context) {
        if (context != null) {
            this.f169051b = context.getApplicationContext();
        }
    }

    /* renamed from: c */
    private void m261409c(IAppContext iAppContext) {
        if (!this.f169052c) {
            this.f169052c = true;
            AppbrandApplicationImpl.getInst(iAppContext).getForeBackgroundManager().mo231958a(new C66420d.C66427b() {
                /* class com.tt.miniapp.p3337v.C67073a.C670741 */

                @Override // com.tt.miniapp.manager.C66420d.C66427b, com.tt.miniapp.manager.C66420d.AbstractC66428c
                /* renamed from: a */
                public void mo88040a() {
                    if (!C67073a.this.f169050a.isEmpty()) {
                        for (C67075a aVar : C67073a.this.f169050a.values()) {
                            if (aVar.f169054a) {
                                synchronized (C67073a.this) {
                                    if (!aVar.f169055b) {
                                        aVar.mo233175b();
                                    }
                                    aVar.f169054a = false;
                                }
                            }
                        }
                    }
                }

                @Override // com.tt.miniapp.manager.C66420d.C66427b, com.tt.miniapp.manager.C66420d.AbstractC66428c
                /* renamed from: b */
                public void mo88041b() {
                    if (!C67073a.this.f169050a.isEmpty()) {
                        for (C67075a aVar : C67073a.this.f169050a.values()) {
                            if (!aVar.f169054a) {
                                synchronized (C67073a.this) {
                                    if (aVar.f169055b) {
                                        aVar.mo233176c();
                                    }
                                    aVar.f169054a = true;
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public boolean mo233173b(IAppContext iAppContext) {
        C67075a remove = this.f169050a.remove(iAppContext);
        if (remove == null) {
            return true;
        }
        synchronized (this) {
            remove.mo233176c();
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo233172a(IAppContext iAppContext) {
        m261409c(iAppContext);
        C67075a aVar = this.f169050a.get(iAppContext);
        if (aVar == null) {
            aVar = new C67075a(this.f169051b, iAppContext);
            this.f169050a.put(iAppContext, aVar);
        }
        if (!aVar.f169055b) {
            synchronized (this) {
                aVar.mo233175b();
            }
        }
        return aVar.mo233174a();
    }

    /* renamed from: a */
    public void mo233171a(int i, IAppContext iAppContext) {
        C67075a aVar = this.f169050a.get(iAppContext);
        if (aVar != null) {
            aVar.f169056c = i;
        }
    }
}
