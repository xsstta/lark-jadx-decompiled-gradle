package com.tt.miniapp.p3337v;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.manager.C66420d;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.ContextSingletonInstance;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.v.b */
public class C67076b {

    /* renamed from: a */
    public Map<IAppContext, C67078a> f169061a = new ConcurrentHashMap();

    /* renamed from: b */
    private Context f169062b;

    /* renamed from: c */
    private volatile boolean f169063c;

    /* renamed from: com.tt.miniapp.v.b$a */
    private static class C67078a implements SensorEventListener {

        /* renamed from: a */
        boolean f169065a;

        /* renamed from: b */
        public boolean f169066b;

        /* renamed from: c */
        private float[] f169067c = new float[3];

        /* renamed from: d */
        private float[] f169068d = new float[3];

        /* renamed from: e */
        private int f169069e;

        /* renamed from: f */
        private long f169070f = -1;

        /* renamed from: g */
        private int f169071g = LocationRequest.PRIORITY_HD_ACCURACY;

        /* renamed from: h */
        private IAppContext f169072h;

        /* renamed from: i */
        private SensorManager f169073i;

        /* renamed from: j */
        private Context f169074j;

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        /* renamed from: a */
        public boolean mo233182a() {
            return this.f169065a;
        }

        /* renamed from: c */
        public void mo233184c() {
            this.f169065a = false;
            this.f169073i.unregisterListener(this);
        }

        /* renamed from: d */
        private void m261424d() {
            float[] fArr = new float[3];
            float[] fArr2 = new float[9];
            SensorManager.getRotationMatrix(fArr2, null, this.f169067c, this.f169068d);
            SensorManager.getOrientation(fArr2, fArr);
            float degrees = (float) Math.toDegrees((double) fArr[0]);
            if (System.currentTimeMillis() - this.f169070f >= ((long) this.f169071g)) {
                this.f169070f = System.currentTimeMillis();
                if (degrees < BitmapDescriptorFactory.HUE_RED) {
                    degrees += 360.0f;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, (double) degrees);
                    C67432a.m262319a(this.f169072h).getJsBridge().sendMsgToJsCore("onCompassChange", jSONObject.toString());
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "CompassManager", e.getStackTrace());
                }
            }
        }

        /* renamed from: b */
        public void mo233183b() {
            if (!this.f169065a) {
                boolean z = true;
                if (AppbrandApplicationImpl.getInst(this.f169072h).getForeBackgroundManager().mo231961c()) {
                    this.f169066b = true;
                    this.f169065a = true;
                    return;
                }
                SensorManager sensorManager = (SensorManager) this.f169074j.getSystemService("sensor");
                this.f169073i = sensorManager;
                int i = this.f169069e;
                if (i == 0) {
                    Sensor defaultSensor = sensorManager.getDefaultSensor(3);
                    if (defaultSensor != null) {
                        this.f169065a = this.f169073i.registerListener(this, defaultSensor, 1);
                        return;
                    }
                } else if (i == 1) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(2);
                    Sensor defaultSensor3 = this.f169073i.getDefaultSensor(1);
                    if (!this.f169073i.registerListener(this, defaultSensor2, 3) && !this.f169073i.registerListener(this, defaultSensor3, 3)) {
                        z = false;
                    }
                    this.f169065a = z;
                    return;
                }
                this.f169065a = false;
            }
        }

        /* renamed from: a */
        public void mo233181a(boolean z) {
            this.f169066b = z;
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (this.f169065a) {
                int i = this.f169069e;
                if (i == 1) {
                    if (sensorEvent.sensor.getType() == 2) {
                        this.f169068d = sensorEvent.values;
                    }
                    if (sensorEvent.sensor.getType() == 1) {
                        this.f169067c = sensorEvent.values;
                    }
                    m261424d();
                } else if (i == 0 && sensorEvent.sensor.getType() == 3) {
                    float f = sensorEvent.values[0];
                    if (System.currentTimeMillis() - this.f169070f >= ((long) this.f169071g)) {
                        this.f169070f = System.currentTimeMillis();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, (double) f);
                            C67432a.m262319a(this.f169072h).getJsBridge().sendMsgToJsCore("onCompassChange", jSONObject.toString());
                        } catch (Exception e) {
                            AppBrandLogger.stacktrace(6, "CompassManager", e.getStackTrace());
                        }
                    }
                }
            }
        }

        public C67078a(IAppContext iAppContext, Context context) {
            this.f169072h = iAppContext;
            this.f169074j = context;
        }
    }

    /* renamed from: a */
    public static C67076b m261418a(Context context) {
        return ContextSingletonInstance.getInstance().getCompassManager(context);
    }

    public C67076b(Context context) {
        if (context != null) {
            this.f169062b = context.getApplicationContext();
        }
    }

    /* renamed from: c */
    private void m261419c(IAppContext iAppContext) {
        if (!this.f169063c) {
            this.f169063c = true;
            AppbrandApplicationImpl.getInst(iAppContext).getForeBackgroundManager().mo231958a(new C66420d.C66427b() {
                /* class com.tt.miniapp.p3337v.C67076b.C670771 */

                @Override // com.tt.miniapp.manager.C66420d.C66427b, com.tt.miniapp.manager.C66420d.AbstractC66428c
                /* renamed from: a */
                public void mo88040a() {
                    if (!C67076b.this.f169061a.isEmpty()) {
                        for (C67078a aVar : C67076b.this.f169061a.values()) {
                            if (aVar.f169066b) {
                                synchronized (C67076b.this) {
                                    if (!aVar.f169065a) {
                                        aVar.mo233183b();
                                    }
                                }
                                aVar.mo233181a(false);
                            }
                        }
                    }
                }

                @Override // com.tt.miniapp.manager.C66420d.C66427b, com.tt.miniapp.manager.C66420d.AbstractC66428c
                /* renamed from: b */
                public void mo88041b() {
                    if (!C67076b.this.f169061a.isEmpty()) {
                        for (C67078a aVar : C67076b.this.f169061a.values()) {
                            if (!aVar.f169066b) {
                                synchronized (C67076b.this) {
                                    if (aVar.f169065a) {
                                        aVar.mo233184c();
                                    }
                                    aVar.mo233181a(true);
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public boolean mo233180b(IAppContext iAppContext) {
        C67078a remove = this.f169061a.remove(iAppContext);
        if (remove == null) {
            return true;
        }
        synchronized (this) {
            remove.mo233184c();
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo233179a(IAppContext iAppContext) {
        m261419c(iAppContext);
        C67078a aVar = this.f169061a.get(iAppContext);
        if (aVar == null) {
            aVar = new C67078a(iAppContext, this.f169062b);
            this.f169061a.put(iAppContext, aVar);
        }
        if (!aVar.f169065a) {
            synchronized (this) {
                aVar.mo233183b();
            }
        }
        return aVar.mo233182a();
    }
}
