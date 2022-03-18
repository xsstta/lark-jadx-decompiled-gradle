package com.larksuite.component.openplatform.plugins.device.compass;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.alibaba.fastjson.annotation.JSONField;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.ss.android.lark.log.Log;

public class CompassManager implements SensorEventListener {

    /* renamed from: a */
    private SensorManager f62235a;

    /* renamed from: b */
    private AbstractC25905b f62236b;

    /* renamed from: c */
    private boolean f62237c;

    /* renamed from: d */
    private boolean f62238d;

    /* renamed from: e */
    private volatile boolean f62239e;

    /* renamed from: f */
    private boolean f62240f;

    /* renamed from: g */
    private float[] f62241g;

    /* renamed from: h */
    private float[] f62242h;

    /* renamed from: i */
    private long f62243i = -1;

    public static class SensorChangeResponse extends C25921b {
        @JSONField(name = HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)
        public double direction;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* renamed from: g */
    private void m91298g() {
        SensorManager sensorManager = this.f62235a;
        if (sensorManager == null) {
            Log.m165397w("CompassManager", "stopListen, sensorManager null");
        } else {
            sensorManager.unregisterListener(this);
        }
    }

    /* renamed from: d */
    public boolean mo88773d() {
        this.f62240f = false;
        synchronized (this) {
            m91298g();
            this.f62239e = false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo88774e() {
        m91298g();
        this.f62235a = null;
        this.f62236b = null;
    }

    /* renamed from: f */
    private boolean m91297f() {
        SensorManager sensorManager = this.f62235a;
        if (sensorManager != null && sensorManager.registerListener(this, sensorManager.getDefaultSensor(2), 3)) {
            SensorManager sensorManager2 = this.f62235a;
            if (sensorManager2.registerListener(this, sensorManager2.getDefaultSensor(1), 3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo88769a() {
        Log.m165389i("CompassManager", "onForeGround");
        mo88770a(false);
        if (this.f62238d) {
            synchronized (this) {
                if (this.f62239e) {
                    m91297f();
                }
                this.f62238d = false;
            }
        }
    }

    /* renamed from: b */
    public void mo88771b() {
        Log.m165389i("CompassManager", "onBackGround");
        mo88770a(true);
        if (!this.f62238d) {
            synchronized (this) {
                if (this.f62239e) {
                    m91298g();
                    this.f62238d = true;
                }
            }
        }
    }

    /* renamed from: c */
    public boolean mo88772c() {
        this.f62240f = true;
        if (this.f62239e) {
            return true;
        }
        if (this.f62237c) {
            this.f62238d = true;
            return true;
        }
        synchronized (this) {
            this.f62239e = m91297f();
        }
        Log.m165389i("CompassManager", "open compass result = " + this.f62239e);
        return this.f62239e;
    }

    /* renamed from: h */
    private void m91299h() {
        float[] fArr;
        float[] fArr2 = this.f62241g;
        if (fArr2 != null && (fArr = this.f62242h) != null) {
            float[] fArr3 = new float[3];
            float[] fArr4 = new float[9];
            if (SensorManager.getRotationMatrix(fArr4, null, fArr2, fArr)) {
                SensorManager.getOrientation(fArr4, fArr3);
                double degrees = Math.toDegrees((double) fArr3[0]);
                if (System.currentTimeMillis() - this.f62243i >= 200) {
                    this.f62243i = System.currentTimeMillis();
                    if (degrees < 0.0d) {
                        degrees += 360.0d;
                    }
                    if (this.f62236b == null) {
                        Log.m165397w("CompassManager", "onSensorChanged trigger but bridgeContext is null");
                        return;
                    }
                    Log.m165389i("CompassManager", "fire event onCompassChange, direction = " + degrees);
                    SensorChangeResponse sensorChangeResponse = new SensorChangeResponse();
                    sensorChangeResponse.direction = degrees;
                    this.f62236b.mo92214a("onCompassChange", sensorChangeResponse);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo88770a(boolean z) {
        this.f62237c = z;
    }

    public CompassManager(AbstractC25905b bVar) {
        this.f62236b = bVar;
        this.f62235a = (SensorManager) bVar.mo92207a().getApplicationContext().getSystemService("sensor");
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f62240f) {
            if (sensorEvent.sensor.getType() == 2) {
                this.f62242h = sensorEvent.values;
            } else if (sensorEvent.sensor.getType() == 1) {
                this.f62241g = sensorEvent.values;
            }
            m91299h();
        }
    }
}
