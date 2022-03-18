package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.appsflyer.internal.p */
public final class C2026p implements SensorEventListener {

    /* renamed from: ı */
    private final String f6972;

    /* renamed from: Ɩ */
    private double f6973;

    /* renamed from: ǃ */
    private final String f6974;

    /* renamed from: ɩ */
    private final long[] f6975 = new long[2];

    /* renamed from: Ι */
    private final int f6976;

    /* renamed from: ι */
    private final float[][] f6977 = new float[2][];

    /* renamed from: І */
    private long f6978;

    /* renamed from: і */
    private final int f6979;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final int hashCode() {
        return this.f6979;
    }

    /* renamed from: ı */
    private boolean m8917() {
        if (this.f6977[0] != null) {
            return true;
        }
        return false;
    }

    /* renamed from: ǃ */
    private Map<String, Object> m8921() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.f6976));
        concurrentHashMap.put("sN", this.f6972);
        concurrentHashMap.put("sV", this.f6974);
        float[] fArr = this.f6977[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", m8920(fArr));
        }
        float[] fArr2 = this.f6977[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", m8920(fArr2));
        }
        return concurrentHashMap;
    }

    /* renamed from: ı */
    private static boolean m8918(Sensor sensor) {
        if (sensor == null || sensor.getName() == null || sensor.getVendor() == null) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2026p)) {
            return false;
        }
        C2026p pVar = (C2026p) obj;
        return m8922(pVar.f6976, pVar.f6972, pVar.f6974);
    }

    /* renamed from: ǃ */
    private static List<Float> m8920(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null && sensorEvent.values != null && m8918(sensorEvent.sensor)) {
            int type = sensorEvent.sensor.getType();
            String name = sensorEvent.sensor.getName();
            String vendor = sensorEvent.sensor.getVendor();
            long j = sensorEvent.timestamp;
            float[] fArr = sensorEvent.values;
            if (m8922(type, name, vendor)) {
                long currentTimeMillis = System.currentTimeMillis();
                float[][] fArr2 = this.f6977;
                float[] fArr3 = fArr2[0];
                if (fArr3 == null) {
                    fArr2[0] = Arrays.copyOf(fArr, fArr.length);
                    this.f6975[0] = currentTimeMillis;
                    return;
                }
                float[] fArr4 = fArr2[1];
                if (fArr4 == null) {
                    float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                    this.f6977[1] = copyOf;
                    this.f6975[1] = currentTimeMillis;
                    this.f6973 = m8919(fArr3, copyOf);
                } else if (50000000 <= j - this.f6978) {
                    this.f6978 = j;
                    if (Arrays.equals(fArr4, fArr)) {
                        this.f6975[1] = currentTimeMillis;
                        return;
                    }
                    double r2 = m8919(fArr3, fArr);
                    if (r2 > this.f6973) {
                        this.f6977[1] = Arrays.copyOf(fArr, fArr.length);
                        this.f6975[1] = currentTimeMillis;
                        this.f6973 = r2;
                    }
                }
            }
        }
    }

    /* renamed from: ǃ */
    private static double m8919(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }

    /* renamed from: ɩ */
    public final void mo10094(Map<C2026p, Map<String, Object>> map, boolean z) {
        if (m8917()) {
            map.put(this, m8921());
            if (z) {
                int length = this.f6977.length;
                for (int i = 0; i < length; i++) {
                    this.f6977[i] = null;
                }
                int length2 = this.f6975.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.f6975[i2] = 0;
                }
                this.f6973 = 0.0d;
                this.f6978 = 0;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, m8921());
        }
    }

    /* renamed from: ɩ */
    private boolean m8922(int i, String str, String str2) {
        if (this.f6976 != i || !this.f6972.equals(str) || !this.f6974.equals(str2)) {
            return false;
        }
        return true;
    }

    public C2026p(int i, String str, String str2) {
        this.f6976 = i;
        str = str == null ? "" : str;
        this.f6972 = str;
        str2 = str2 == null ? "" : str2;
        this.f6974 = str2;
        this.f6979 = ((((i + 31) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }
}
