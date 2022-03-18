package com.bytedance.frameworks.baselib.network;

import com.bytedance.common.utility.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public class TTDelayStateManager {

    /* renamed from: a */
    private static final String f36426a = "TTDelayStateManager";

    /* renamed from: b */
    private static volatile AppStartState f36427b = AppStartState.NormalStart;

    /* renamed from: c */
    private static final AtomicBoolean f36428c = new AtomicBoolean(false);

    /* renamed from: d */
    private static final AtomicLong f36429d = new AtomicLong(0);

    /* renamed from: e */
    private static final AtomicLong f36430e = new AtomicLong(0);

    /* renamed from: f */
    private static final AtomicLong f36431f = new AtomicLong(0);

    /* renamed from: g */
    private static final AtomicLong f36432g = new AtomicLong(0);

    public enum AppStartState {
        NormalStart(-1),
        ColdStart(0),
        HotStart(1),
        WarmStart(2);
        
        final int state;

        public int getValue() {
            return this.state;
        }

        private AppStartState(int i) {
            this.state = i;
        }
    }

    /* renamed from: b */
    public static AppStartState m56398b() {
        return f36427b;
    }

    /* renamed from: c */
    public static boolean m56399c() {
        return f36428c.get();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.TTDelayStateManager$1 */
    static /* synthetic */ class C139361 {

        /* renamed from: a */
        static final /* synthetic */ int[] f36433a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.frameworks.baselib.network.TTDelayStateManager$AppStartState[] r0 = com.bytedance.frameworks.baselib.network.TTDelayStateManager.AppStartState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.frameworks.baselib.network.TTDelayStateManager.C139361.f36433a = r0
                com.bytedance.frameworks.baselib.network.TTDelayStateManager$AppStartState r1 = com.bytedance.frameworks.baselib.network.TTDelayStateManager.AppStartState.ColdStart     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.frameworks.baselib.network.TTDelayStateManager.C139361.f36433a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.frameworks.baselib.network.TTDelayStateManager$AppStartState r1 = com.bytedance.frameworks.baselib.network.TTDelayStateManager.AppStartState.HotStart     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.frameworks.baselib.network.TTDelayStateManager.C139361.f36433a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.frameworks.baselib.network.TTDelayStateManager$AppStartState r1 = com.bytedance.frameworks.baselib.network.TTDelayStateManager.AppStartState.WarmStart     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.TTDelayStateManager.C139361.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static AppStartState m56395a() {
        if (Logger.debug()) {
            String str = f36426a;
            Logger.m15167d(str, "get coldDuration hostDuration warmDuration " + f36430e.get() + f36431f.get() + f36432g.get());
        }
        int i = C139361.f36433a[f36427b.ordinal()];
        if (i == 1) {
            if (m56397a(f36429d.get(), f36430e.get())) {
                f36427b = AppStartState.NormalStart;
            }
            return f36427b;
        } else if (i == 2) {
            if (m56397a(f36429d.get(), f36431f.get())) {
                f36427b = AppStartState.NormalStart;
            }
            return f36427b;
        } else if (i != 3) {
            return f36427b;
        } else {
            if (m56397a(f36429d.get(), f36432g.get())) {
                f36427b = AppStartState.NormalStart;
            }
            return f36427b;
        }
    }

    /* renamed from: a */
    public static void m56396a(JSONObject jSONObject) {
        boolean z;
        AtomicBoolean atomicBoolean = f36428c;
        if (jSONObject.optInt("request_tag_enabled") > 0) {
            z = true;
        } else {
            z = false;
        }
        atomicBoolean.set(z);
        AtomicLong atomicLong = f36430e;
        atomicLong.set((long) jSONObject.optInt("cold_start_seconds"));
        AtomicLong atomicLong2 = f36431f;
        atomicLong2.set((long) jSONObject.optInt("hot_start_seconds"));
        AtomicLong atomicLong3 = f36432g;
        atomicLong3.set((long) jSONObject.optInt("warm_start_seconds"));
        if (Logger.debug()) {
            String str = f36426a;
            Logger.m15167d(str, "set coldDuration hostDuration warmDuration " + atomicLong.get() + atomicLong2.get() + atomicLong3.get());
        }
    }

    /* renamed from: a */
    private static boolean m56397a(long j, long j2) {
        if ((System.currentTimeMillis() / 1000) - j > j2) {
            return true;
        }
        return false;
    }
}
