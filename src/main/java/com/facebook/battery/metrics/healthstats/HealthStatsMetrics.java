package com.facebook.battery.metrics.healthstats;

import android.os.health.HealthStats;
import android.os.health.PackageHealthStats;
import android.os.health.PidHealthStats;
import android.os.health.ProcessHealthStats;
import android.os.health.ServiceHealthStats;
import android.os.health.TimerStat;
import android.os.health.UidHealthStats;
import android.util.Log;
import android.util.SparseArray;
import androidx.collection.ArrayMap;
import com.facebook.battery.metrics.core.AbstractC21000d;
import com.facebook.battery.metrics.core.C20998c;
import com.facebook.battery.metrics.core.SystemMetrics;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class HealthStatsMetrics extends SystemMetrics<HealthStatsMetrics> {
    private static final SparseArray<String> sKeyNames = new SparseArray<>();
    public String dataType;
    final SparseArray<Long> measurement = new SparseArray<>();
    final SparseArray<ArrayMap<String, Long>> measurements = new SparseArray<>();
    final SparseArray<ArrayMap<String, HealthStatsMetrics>> stats = new SparseArray<>();
    final SparseArray<C21004a> timer = new SparseArray<>();
    final SparseArray<ArrayMap<String, C21004a>> timers = new SparseArray<>();

    /* renamed from: com.facebook.battery.metrics.healthstats.HealthStatsMetrics$a */
    public static class C21004a {

        /* renamed from: a */
        public int f51387a;

        /* renamed from: b */
        public long f51388b;

        public C21004a() {
        }

        public int hashCode() {
            long j = this.f51388b;
            return (this.f51387a * 31) + ((int) (j ^ (j >>> 32)));
        }

        public C21004a(TimerStat timerStat) {
            this.f51387a = timerStat.getCount();
            this.f51388b = timerStat.getTime();
        }

        public C21004a(C21004a aVar) {
            this.f51387a = aVar.f51387a;
            this.f51388b = aVar.f51388b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C21004a aVar = (C21004a) obj;
            if (this.f51387a == aVar.f51387a && this.f51388b == aVar.f51388b) {
                return true;
            }
            return false;
        }

        public C21004a(int i, long j) {
            this.f51387a = i;
            this.f51388b = j;
        }
    }

    public HealthStatsMetrics() {
    }

    public int hashCode() {
        int i;
        String str = this.dataType;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((((((((i * 31) + this.measurement.hashCode()) * 31) + this.timer.hashCode()) * 31) + this.measurements.hashCode()) * 31) + this.timers.hashCode()) * 31) + this.stats.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HealthStatsMetrics {\n");
        try {
            sb.append(toJSONObject().toString(2));
        } catch (JSONException e) {
            sb.append("<error>");
            Log.e("HealthStatsMetrics", "Unable to convert to string", e);
        }
        sb.append("\n}");
        return sb.toString();
    }

    private static void readKeyNames() {
        try {
            Class[] clsArr = {UidHealthStats.class, PidHealthStats.class, ProcessHealthStats.class, PackageHealthStats.class, ServiceHealthStats.class};
            Class<?> cls = Class.forName("android.os.health.HealthKeys$Constant");
            for (int i = 0; i < 5; i++) {
                Field[] fields = clsArr[i].getFields();
                for (Field field : fields) {
                    if (field.isAnnotationPresent(cls)) {
                        sKeyNames.put(field.getInt(null), field.getName());
                    }
                }
            }
        } catch (IllegalAccessException e) {
            C20998c.m76505a("HealthStatsMetrics", "Unable to read constant names", e);
            sKeyNames.put(-1, "Unable to read");
        } catch (ClassNotFoundException e2) {
            C20998c.m76505a("HealthStatsMetrics", "Unable to find constant annotation", e2);
            sKeyNames.put(-1, "Unable to read");
        }
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ShareHitPoint.f121869d, this.dataType);
        int size = this.measurement.size();
        if (size > 0) {
            JSONObject jSONObject2 = new JSONObject();
            for (int i = 0; i < size; i++) {
                jSONObject2.put(getKeyName(this.measurement.keyAt(i)), this.measurement.valueAt(i));
            }
            jSONObject.put("measurement", jSONObject2);
        }
        int size2 = this.timer.size();
        if (size2 > 0) {
            JSONObject jSONObject3 = new JSONObject();
            for (int i2 = 0; i2 < size2; i2++) {
                jSONObject3.put(getKeyName(this.timer.keyAt(i2)), new JSONObject().put("count", this.timer.valueAt(i2).f51387a).put("time_ms", this.timer.valueAt(i2).f51388b));
            }
            jSONObject.put("timer", jSONObject3);
        }
        int size3 = this.measurements.size();
        if (size3 > 0) {
            JSONObject jSONObject4 = new JSONObject();
            for (int i3 = 0; i3 < size3; i3++) {
                jSONObject4.put(getKeyName(this.measurements.keyAt(i3)), toJSONObject(this.measurements.valueAt(i3)));
            }
            jSONObject.put("measurements", jSONObject4);
        }
        int size4 = this.timers.size();
        if (size4 > 0) {
            JSONObject jSONObject5 = new JSONObject();
            for (int i4 = 0; i4 < size4; i4++) {
                jSONObject5.put(getKeyName(this.timers.keyAt(i4)), toJSONObject(this.timers.valueAt(i4)));
            }
            jSONObject.put("timers", jSONObject5);
        }
        int size5 = this.stats.size();
        if (size5 > 0) {
            JSONObject jSONObject6 = new JSONObject();
            for (int i5 = 0; i5 < size5; i5++) {
                jSONObject6.put(getKeyName(this.stats.keyAt(i5)), toJSONObject(this.stats.valueAt(i5)));
            }
            jSONObject.put("stats", jSONObject6);
        }
        return jSONObject;
    }

    public static String getKeyName(int i) {
        SparseArray<String> sparseArray = sKeyNames;
        if (sparseArray.size() == 0) {
            readKeyNames();
        }
        return sparseArray.get(i, "Unknown");
    }

    public HealthStatsMetrics(HealthStats healthStats) {
        set(healthStats);
    }

    private static <V> JSONObject toJSONObject(ArrayMap<String, V> arrayMap) throws JSONException {
        int i;
        JSONObject jSONObject = new JSONObject();
        if (arrayMap == null) {
            i = 0;
        } else {
            i = arrayMap.size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            V valueAt = arrayMap.valueAt(i2);
            if (valueAt instanceof C21004a) {
                V v = valueAt;
                jSONObject.put(arrayMap.keyAt(i2), new JSONObject().put("count", v.f51387a).put("time_ms", v.f51388b));
            } else if (valueAt instanceof HealthStatsMetrics) {
                jSONObject.put(arrayMap.keyAt(i2), valueAt.toJSONObject());
            } else {
                jSONObject.put(arrayMap.keyAt(i2), arrayMap.valueAt(i2));
            }
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthStatsMetrics healthStatsMetrics = (HealthStatsMetrics) obj;
        String str = this.dataType;
        if (str == null ? healthStatsMetrics.dataType != null : !str.equals(healthStatsMetrics.dataType)) {
            return false;
        }
        if (!AbstractC21000d.m76508a(this.measurement, healthStatsMetrics.measurement) || !AbstractC21000d.m76508a(this.measurements, healthStatsMetrics.measurements) || !AbstractC21000d.m76508a(this.timer, healthStatsMetrics.timer) || !AbstractC21000d.m76508a(this.timers, healthStatsMetrics.timers) || !AbstractC21000d.m76508a(this.stats, healthStatsMetrics.stats)) {
            return false;
        }
        return true;
    }

    public HealthStatsMetrics(HealthStatsMetrics healthStatsMetrics) {
        set(healthStatsMetrics);
    }

    public HealthStatsMetrics set(HealthStats healthStats) {
        this.dataType = healthStats.getDataType();
        this.measurement.clear();
        for (int i = 0; i < healthStats.getMeasurementKeyCount(); i++) {
            int measurementKeyAt = healthStats.getMeasurementKeyAt(i);
            this.measurement.put(measurementKeyAt, Long.valueOf(healthStats.getMeasurement(measurementKeyAt)));
        }
        this.measurements.clear();
        for (int i2 = 0; i2 < healthStats.getMeasurementsKeyCount(); i2++) {
            int measurementsKeyAt = healthStats.getMeasurementsKeyAt(i2);
            ArrayMap<String, Long> arrayMap = new ArrayMap<>();
            for (Map.Entry<String, Long> entry : healthStats.getMeasurements(measurementsKeyAt).entrySet()) {
                arrayMap.put(entry.getKey(), entry.getValue());
            }
            this.measurements.put(measurementsKeyAt, arrayMap);
        }
        this.timer.clear();
        for (int i3 = 0; i3 < healthStats.getTimerKeyCount(); i3++) {
            int timerKeyAt = healthStats.getTimerKeyAt(i3);
            this.timer.put(timerKeyAt, new C21004a(healthStats.getTimerCount(timerKeyAt), healthStats.getTimerTime(timerKeyAt)));
        }
        this.timers.clear();
        for (int i4 = 0; i4 < healthStats.getTimersKeyCount(); i4++) {
            int timersKeyAt = healthStats.getTimersKeyAt(i4);
            ArrayMap<String, C21004a> arrayMap2 = new ArrayMap<>();
            for (Map.Entry<String, TimerStat> entry2 : healthStats.getTimers(timersKeyAt).entrySet()) {
                arrayMap2.put(entry2.getKey(), new C21004a(entry2.getValue()));
            }
            this.timers.put(timersKeyAt, arrayMap2);
        }
        this.stats.clear();
        for (int i5 = 0; i5 < healthStats.getStatsKeyCount(); i5++) {
            int statsKeyAt = healthStats.getStatsKeyAt(i5);
            ArrayMap<String, HealthStatsMetrics> arrayMap3 = new ArrayMap<>();
            for (Map.Entry<String, HealthStats> entry3 : healthStats.getStats(statsKeyAt).entrySet()) {
                arrayMap3.put(entry3.getKey(), new HealthStatsMetrics(entry3.getValue()));
            }
            this.stats.put(statsKeyAt, arrayMap3);
        }
        return this;
    }

    public HealthStatsMetrics set(HealthStatsMetrics healthStatsMetrics) {
        this.dataType = healthStatsMetrics.dataType;
        this.measurement.clear();
        for (int i = 0; i < healthStatsMetrics.measurement.size(); i++) {
            this.measurement.append(healthStatsMetrics.measurement.keyAt(i), healthStatsMetrics.measurement.valueAt(i));
        }
        this.timer.clear();
        for (int i2 = 0; i2 < healthStatsMetrics.timer.size(); i2++) {
            this.timer.append(healthStatsMetrics.timer.keyAt(i2), new C21004a(healthStatsMetrics.timer.valueAt(i2)));
        }
        this.measurements.clear();
        for (int i3 = 0; i3 < healthStatsMetrics.measurements.size(); i3++) {
            ArrayMap<String, Long> arrayMap = new ArrayMap<>();
            arrayMap.putAll((Map<? extends String, ? extends Long>) healthStatsMetrics.measurements.valueAt(i3));
            this.measurements.append(healthStatsMetrics.measurements.keyAt(i3), arrayMap);
        }
        this.timers.clear();
        for (int i4 = 0; i4 < healthStatsMetrics.timers.size(); i4++) {
            ArrayMap<String, C21004a> valueAt = healthStatsMetrics.timers.valueAt(i4);
            ArrayMap<String, C21004a> arrayMap2 = new ArrayMap<>();
            for (int i5 = 0; i5 < valueAt.size(); i5++) {
                arrayMap2.put(valueAt.keyAt(i5), new C21004a(valueAt.valueAt(i5)));
            }
            this.timers.append(healthStatsMetrics.timers.keyAt(i4), arrayMap2);
        }
        this.stats.clear();
        for (int i6 = 0; i6 < healthStatsMetrics.stats.size(); i6++) {
            ArrayMap<String, HealthStatsMetrics> valueAt2 = healthStatsMetrics.stats.valueAt(i6);
            ArrayMap<String, HealthStatsMetrics> arrayMap3 = new ArrayMap<>();
            for (int i7 = 0; i7 < valueAt2.size(); i7++) {
                arrayMap3.put(valueAt2.keyAt(i7), new HealthStatsMetrics(valueAt2.valueAt(i7)));
            }
            this.stats.append(healthStatsMetrics.stats.keyAt(i6), arrayMap3);
        }
        return this;
    }

    private static boolean strEquals(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    private static long compareSnapshotAge(HealthStatsMetrics healthStatsMetrics, HealthStatsMetrics healthStatsMetrics2) {
        return healthStatsMetrics.measurement.get(UpdateDialogStatusCode.DISMISS, 0L).longValue() - healthStatsMetrics2.measurement.get(UpdateDialogStatusCode.DISMISS, 0L).longValue();
    }

    public HealthStatsMetrics diff(HealthStatsMetrics healthStatsMetrics, HealthStatsMetrics healthStatsMetrics2) {
        if (healthStatsMetrics2 == null) {
            healthStatsMetrics2 = new HealthStatsMetrics();
        }
        healthStatsMetrics2.dataType = this.dataType;
        if (healthStatsMetrics == null || compareSnapshotAge(this, healthStatsMetrics) < 0) {
            healthStatsMetrics2.set(this);
        } else if (strEquals(healthStatsMetrics.dataType, this.dataType)) {
            op(-1, this.measurement, healthStatsMetrics.measurement, healthStatsMetrics2.measurement);
            op(-1, this.measurements, healthStatsMetrics.measurements, healthStatsMetrics2.measurements);
            op(-1, this.timer, healthStatsMetrics.timer, healthStatsMetrics2.timer);
            op(-1, this.timers, healthStatsMetrics.timers, healthStatsMetrics2.timers);
            op(-1, this.stats, healthStatsMetrics.stats, healthStatsMetrics2.stats);
        } else {
            throw new IllegalArgumentException("Attempting to subtract different types of HealthStatMetrics: " + this.dataType + " and " + healthStatsMetrics.dataType);
        }
        return healthStatsMetrics2;
    }

    public HealthStatsMetrics sum(HealthStatsMetrics healthStatsMetrics, HealthStatsMetrics healthStatsMetrics2) {
        if (healthStatsMetrics2 == null) {
            healthStatsMetrics2 = new HealthStatsMetrics();
        }
        healthStatsMetrics2.dataType = this.dataType;
        if (healthStatsMetrics == null) {
            healthStatsMetrics2.set(this);
        } else if (strEquals(healthStatsMetrics.dataType, this.dataType)) {
            op(1, this.measurement, healthStatsMetrics.measurement, healthStatsMetrics2.measurement);
            op(1, this.measurements, healthStatsMetrics.measurements, healthStatsMetrics2.measurements);
            op(1, this.timer, healthStatsMetrics.timer, healthStatsMetrics2.timer);
            op(1, this.timers, healthStatsMetrics.timers, healthStatsMetrics2.timers);
            op(1, this.stats, healthStatsMetrics.stats, healthStatsMetrics2.stats);
        } else {
            throw new IllegalArgumentException("Attempting to add different types of HealthStatMetrics: " + this.dataType + " and " + healthStatsMetrics.dataType);
        }
        return healthStatsMetrics2;
    }

    static <K, V> ArrayMap<K, V> opArrayMaps(int i, ArrayMap<K, V> arrayMap, ArrayMap<K, V> arrayMap2) {
        int i2;
        V v;
        int size = arrayMap.size();
        ArrayMap<K, V> arrayMap3 = new ArrayMap<>();
        for (int i3 = 0; i3 < size; i3++) {
            K keyAt = arrayMap.keyAt(i3);
            if (arrayMap2 == null) {
                v = null;
            } else {
                v = arrayMap2.get(keyAt);
            }
            arrayMap3.put(keyAt, v == null ? arrayMap.valueAt(i3) : (V) opValues(i, arrayMap.valueAt(i3), v));
        }
        if (i == 1) {
            if (arrayMap2 == null) {
                i2 = 0;
            } else {
                i2 = arrayMap2.size();
            }
            for (int i4 = 0; i4 < i2; i4++) {
                K keyAt2 = arrayMap2.keyAt(i4);
                if (arrayMap.get(keyAt2) == null) {
                    arrayMap3.put(keyAt2, arrayMap2.valueAt(i4));
                }
            }
        }
        return arrayMap3;
    }

    private static <V> Object opValues(int i, V v, V v2) {
        long j;
        if (v instanceof Long) {
            long longValue = v.longValue();
            if (v2 == null) {
                j = 0;
            } else {
                j = ((long) i) * v2.longValue();
            }
            return Long.valueOf(longValue + j);
        } else if (v instanceof C21004a) {
            V v3 = v;
            V v4 = v2;
            if (v2 == null) {
                return new C21004a((C21004a) v3);
            }
            C21004a aVar = new C21004a();
            aVar.f51387a = v3.f51387a + (v4.f51387a * i);
            aVar.f51388b = v3.f51388b + (((long) i) * v4.f51388b);
            return aVar;
        } else if (v instanceof HealthStatsMetrics) {
            if (i == 1) {
                return v.sum(v2, null);
            }
            return v.diff(v2, null);
        } else if (v instanceof ArrayMap) {
            return opArrayMaps(i, v, v2);
        } else {
            throw new IllegalArgumentException("Handling unsupported values");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: android.util.SparseArray<K> */
    /* JADX WARN: Multi-variable type inference failed */
    static <K> SparseArray<K> op(int i, SparseArray<K> sparseArray, SparseArray<K> sparseArray2, SparseArray<K> sparseArray3) {
        sparseArray3.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            int keyAt = sparseArray.keyAt(i2);
            sparseArray3.put(keyAt, opValues(i, sparseArray.valueAt(i2), sparseArray2.get(keyAt)));
        }
        if (i == 1) {
            for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
                int keyAt2 = sparseArray2.keyAt(i3);
                if (sparseArray.get(keyAt2) == null) {
                    sparseArray3.put(keyAt2, sparseArray2.valueAt(i3));
                }
            }
        }
        return sparseArray3;
    }
}
