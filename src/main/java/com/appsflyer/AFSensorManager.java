package com.appsflyer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.internal.C2026p;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class AFSensorManager {
    public static volatile AFSensorManager sInstance;

    /* renamed from: ɨ */
    private static final BitSet f6732;

    /* renamed from: ӏ */
    private static final Handler f6733 = new Handler(Looper.getMainLooper());

    /* renamed from: ı */
    final Object f6734 = new Object();

    /* renamed from: Ɩ */
    boolean f6735;

    /* renamed from: ǃ */
    final SensorManager f6736;

    /* renamed from: ȷ */
    long f6737;

    /* renamed from: ɩ */
    final Handler f6738;

    /* renamed from: ɪ */
    private final Runnable f6739;

    /* renamed from: ɹ */
    int f6740;

    /* renamed from: ɾ */
    private final Map<C2026p, Map<String, Object>> f6741;

    /* renamed from: Ι */
    boolean f6742;

    /* renamed from: ι */
    final Map<C2026p, C2026p> f6743;

    /* renamed from: І */
    final Runnable f6744;

    /* renamed from: і */
    final Runnable f6745;

    /* renamed from: Ӏ */
    final Runnable f6746;

    static {
        BitSet bitSet = new BitSet(6);
        f6732 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ */
    public final void mo9903() {
        try {
            if (!this.f6743.isEmpty()) {
                for (C2026p pVar : this.f6743.values()) {
                    this.f6736.unregisterListener(pVar);
                    pVar.mo10094(this.f6741, true);
                }
            }
        } catch (Throwable unused) {
        }
        this.f6740 = 0;
        this.f6735 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι */
    public final List<Map<String, Object>> mo9904() {
        for (C2026p pVar : this.f6743.values()) {
            pVar.mo10094(this.f6741, true);
        }
        Map<C2026p, Map<String, Object>> map = this.f6741;
        if (map == null || map.isEmpty()) {
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
        return new CopyOnWriteArrayList(this.f6741.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι */
    public final List<Map<String, Object>> mo9905() {
        synchronized (this.f6734) {
            if (!this.f6743.isEmpty() && this.f6735) {
                for (C2026p pVar : this.f6743.values()) {
                    pVar.mo10094(this.f6741, false);
                }
            }
            if (this.f6741.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.f6741.values());
        }
    }

    /* renamed from: ι */
    static boolean m8743(int i) {
        if (i < 0 || !f6732.get(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: ι */
    static AFSensorManager m8742(Context context) {
        if (sInstance != null) {
            return sInstance;
        }
        return m8739((SensorManager) context.getApplicationContext().getSystemService("sensor"), f6733);
    }

    /* renamed from: ı */
    private static AFSensorManager m8739(SensorManager sensorManager, Handler handler) {
        if (sInstance == null) {
            synchronized (AFSensorManager.class) {
                if (sInstance == null) {
                    sInstance = new AFSensorManager(sensorManager, handler);
                }
            }
        }
        return sInstance;
    }

    private AFSensorManager(SensorManager sensorManager, Handler handler) {
        BitSet bitSet = f6732;
        this.f6743 = new HashMap(bitSet.size());
        this.f6741 = new ConcurrentHashMap(bitSet.size());
        this.f6746 = new Runnable() {
            /* class com.appsflyer.AFSensorManager.RunnableC19813 */

            public final void run() {
                synchronized (AFSensorManager.this.f6734) {
                    AFSensorManager aFSensorManager = AFSensorManager.this;
                    try {
                        for (Sensor sensor : aFSensorManager.f6736.getSensorList(-1)) {
                            if (AFSensorManager.m8743(sensor.getType())) {
                                C2026p pVar = new C2026p(sensor.getType(), sensor.getName(), sensor.getVendor());
                                if (!aFSensorManager.f6743.containsKey(pVar)) {
                                    aFSensorManager.f6743.put(pVar, pVar);
                                }
                                aFSensorManager.f6736.registerListener(aFSensorManager.f6743.get(pVar), sensor, 0);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    aFSensorManager.f6735 = true;
                    AFSensorManager.this.f6738.postDelayed(AFSensorManager.this.f6739, 100);
                    AFSensorManager.this.f6742 = true;
                }
            }
        };
        this.f6745 = new Runnable() {
            /* class com.appsflyer.AFSensorManager.RunnableC19835 */

            public final void run() {
                synchronized (AFSensorManager.this.f6734) {
                    AFSensorManager.this.mo9903();
                }
            }
        };
        this.f6744 = new Runnable() {
            /* class com.appsflyer.AFSensorManager.RunnableC19802 */

            public final void run() {
                synchronized (AFSensorManager.this.f6734) {
                    if (AFSensorManager.this.f6742) {
                        AFSensorManager.this.f6738.removeCallbacks(AFSensorManager.this.f6746);
                        AFSensorManager.this.f6738.removeCallbacks(AFSensorManager.this.f6745);
                        AFSensorManager.this.mo9903();
                        AFSensorManager.this.f6742 = false;
                    }
                }
            }
        };
        this.f6740 = 1;
        this.f6737 = 0;
        this.f6739 = new Runnable() {
            /* class com.appsflyer.AFSensorManager.RunnableC19824 */

            public final void run() {
                synchronized (AFSensorManager.this.f6734) {
                    if (AFSensorManager.this.f6740 == 0) {
                        AFSensorManager.this.f6740 = 1;
                    }
                    AFSensorManager.this.f6738.postDelayed(AFSensorManager.this.f6745, ((long) AFSensorManager.this.f6740) * 500);
                }
            }
        };
        this.f6736 = sensorManager;
        this.f6738 = handler;
    }
}
