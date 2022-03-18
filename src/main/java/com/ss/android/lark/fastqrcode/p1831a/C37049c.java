package com.ss.android.lark.fastqrcode.p1831a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.ss.android.lark.fastqrcode.C37040a;

/* renamed from: com.ss.android.lark.fastqrcode.a.c */
public class C37049c implements SensorEventListener {

    /* renamed from: a */
    boolean f95184a;

    /* renamed from: b */
    boolean f95185b;

    /* renamed from: c */
    long f95186c;

    /* renamed from: d */
    private SensorManager f95187d;

    /* renamed from: e */
    private Sensor f95188e;

    /* renamed from: f */
    private int f95189f;

    /* renamed from: g */
    private int f95190g;

    /* renamed from: h */
    private int f95191h;

    /* renamed from: i */
    private long f95192i;

    /* renamed from: j */
    private int f95193j;

    /* renamed from: k */
    private AbstractC37050a f95194k;

    /* renamed from: com.ss.android.lark.fastqrcode.a.c$a */
    public interface AbstractC37050a {
        /* renamed from: a */
        void mo136564a();
    }

    /* renamed from: a */
    public void mo136569a() {
        this.f95184a = true;
    }

    /* renamed from: b */
    public void mo136571b() {
        this.f95184a = false;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* renamed from: e */
    private void m146142e() {
        this.f95193j = 0;
        this.f95189f = 0;
        this.f95190g = 0;
        this.f95191h = 0;
    }

    /* renamed from: c */
    public void mo136572c() {
        m146142e();
        this.f95185b = true;
        this.f95187d.registerListener(this, this.f95188e, 3);
    }

    /* renamed from: d */
    public void mo136573d() {
        this.f95187d.unregisterListener(this, this.f95188e);
        this.f95185b = false;
    }

    public C37049c() {
        SensorManager sensorManager = (SensorManager) C37040a.m146119a().getSystemService("sensor");
        this.f95187d = sensorManager;
        this.f95188e = sensorManager.getDefaultSensor(1);
    }

    /* renamed from: a */
    public void mo136570a(AbstractC37050a aVar) {
        this.f95194k = aVar;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        AbstractC37050a aVar;
        if (sensorEvent.sensor != null) {
            if (this.f95184a) {
                m146142e();
            } else if (sensorEvent.sensor.getType() == 1) {
                int i = (int) sensorEvent.values[0];
                int i2 = (int) sensorEvent.values[1];
                int i3 = (int) sensorEvent.values[2];
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f95193j != 0) {
                    int abs = Math.abs(this.f95189f - i);
                    int abs2 = Math.abs(this.f95190g - i2);
                    int abs3 = Math.abs(this.f95191h - i3);
                    if (Math.sqrt((double) ((abs * abs) + (abs2 * abs2) + (abs3 * abs3))) >= 1.4d) {
                        this.f95193j = 2;
                    } else {
                        if (this.f95193j == 2) {
                            this.f95192i = currentTimeMillis;
                            this.f95185b = true;
                        }
                        if ((currentTimeMillis - this.f95192i > 2000 || currentTimeMillis - this.f95186c > 2000) && this.f95185b) {
                            this.f95186c = currentTimeMillis;
                            if (!this.f95184a && (aVar = this.f95194k) != null) {
                                this.f95185b = false;
                                aVar.mo136564a();
                            }
                        } else if (!this.f95185b && currentTimeMillis - this.f95186c > 2000) {
                            this.f95186c = currentTimeMillis;
                            AbstractC37050a aVar2 = this.f95194k;
                            if (aVar2 != null) {
                                aVar2.mo136564a();
                            }
                        }
                        this.f95193j = 1;
                    }
                } else {
                    this.f95192i = currentTimeMillis;
                    this.f95193j = 1;
                }
                this.f95189f = i;
                this.f95190g = i2;
                this.f95191h = i3;
            }
        }
    }
}
