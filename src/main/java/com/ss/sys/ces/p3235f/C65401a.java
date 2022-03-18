package com.ss.sys.ces.p3235f;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.text.DecimalFormat;

/* renamed from: com.ss.sys.ces.f.a */
public final class C65401a implements SensorEventListener {

    /* renamed from: f */
    private static C65401a f164660f;

    /* renamed from: a */
    private SensorManager f164661a = null;

    /* renamed from: b */
    private int f164662b;

    /* renamed from: c */
    private int f164663c = 0;

    /* renamed from: d */
    private float[] f164664d = new float[3];

    /* renamed from: e */
    private DecimalFormat f164665e = new DecimalFormat("0.0");

    private C65401a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.f164661a = (SensorManager) applicationContext.getSystemService("sensor");
        }
    }

    /* renamed from: a */
    public static C65401a m256476a(Context context) {
        if (f164660f == null) {
            synchronized (C65401a.class) {
                if (f164660f == null) {
                    f164660f = new C65401a(context);
                }
            }
        }
        return f164660f;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m256477b() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.hardware.SensorManager r0 = r4.f164661a     // Catch:{ Exception -> 0x0022, all -> 0x001f }
            if (r0 == 0) goto L_0x0022
            int r1 = r4.f164662b     // Catch:{ Exception -> 0x0022, all -> 0x001f }
            r2 = 1
            if (r1 != 0) goto L_0x0019
            android.hardware.Sensor r0 = r0.getDefaultSensor(r2)     // Catch:{ Exception -> 0x0022, all -> 0x001f }
            android.hardware.SensorManager r1 = r4.f164661a     // Catch:{ Exception -> 0x0022, all -> 0x001f }
            r3 = 3
            boolean r0 = r1.registerListener(r4, r0, r3)     // Catch:{ Exception -> 0x0022, all -> 0x001f }
            if (r0 != 0) goto L_0x0019
            monitor-exit(r4)
            return
        L_0x0019:
            int r0 = r4.f164662b
            int r0 = r0 + r2
            r4.f164662b = r0
            goto L_0x0022
        L_0x001f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0022:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.sys.ces.p3235f.C65401a.m256477b():void");
    }

    /* renamed from: c */
    private synchronized void m256478c() {
        try {
            SensorManager sensorManager = this.f164661a;
            if (sensorManager != null) {
                int i = this.f164662b - 1;
                this.f164662b = i;
                if (i == 0) {
                    sensorManager.unregisterListener(this);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    /* renamed from: a */
    public String mo225054a() {
        StringBuilder sb;
        DecimalFormat decimalFormat;
        float f;
        m256477b();
        try {
            synchronized (this) {
                int i = 0;
                while (this.f164663c == 0 && i < 10) {
                    i++;
                    wait(100);
                }
            }
            sb = new StringBuilder();
            sb.append(this.f164665e.format((double) this.f164664d[0]));
            sb.append(", ");
            sb.append(this.f164665e.format((double) this.f164664d[1]));
            sb.append(", ");
            decimalFormat = this.f164665e;
            f = this.f164664d[2];
        } catch (Exception e) {
            e.printStackTrace();
            sb = new StringBuilder();
            sb.append(this.f164665e.format((double) this.f164664d[0]));
            sb.append(", ");
            sb.append(this.f164665e.format((double) this.f164664d[1]));
            sb.append(", ");
            decimalFormat = this.f164665e;
            f = this.f164664d[2];
        } catch (Throwable th) {
            this.f164665e.format((double) this.f164664d[0]);
            this.f164665e.format((double) this.f164664d[1]);
            this.f164665e.format((double) this.f164664d[2]);
            m256478c();
            this.f164663c = 0;
            throw th;
        }
        sb.append(decimalFormat.format((double) f));
        String sb2 = sb.toString();
        m256478c();
        this.f164663c = 0;
        return sb2;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f164664d = sensorEvent.values;
        this.f164663c = 1;
    }
}
