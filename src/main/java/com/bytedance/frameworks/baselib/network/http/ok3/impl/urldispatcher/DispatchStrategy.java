package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.net.Uri;
import com.bytedance.common.utility.Logger;
import org.json.JSONObject;

public abstract class DispatchStrategy {

    /* renamed from: a */
    private static final String f36945a = "DispatchStrategy";

    /* renamed from: b */
    private DispatchStrategyType f36946b;

    public enum DispatchStrategyType {
        UNKNOWN_DISPATCH_STRATEGY,
        STATIC_DISPATCH_STRATEGY,
        WRR_DISPATCH_STRATEGY,
        CONSERVATIVE_DISPATCH_STRATEGY,
        OPTIMIZED_DISPATCH_STRATEGY,
        ROUTE_SELECTION_DISPATCH_STRATEGY,
        DISPATCH_STRATEGY_SUPPORTED_LAST
    }

    /* renamed from: a */
    public abstract String mo51740a(Uri uri);

    /* renamed from: a */
    public abstract boolean mo51741a();

    /* renamed from: b */
    public DispatchStrategyType mo51742b() {
        return this.f36946b;
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy$1 */
    static /* synthetic */ class C140641 {

        /* renamed from: a */
        static final /* synthetic */ int[] f36947a;

        static {
            int[] iArr = new int[DispatchStrategyType.values().length];
            f36947a = iArr;
            try {
                iArr[DispatchStrategyType.STATIC_DISPATCH_STRATEGY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public DispatchStrategy(DispatchStrategyType dispatchStrategyType) {
        this.f36946b = dispatchStrategyType;
    }

    /* renamed from: a */
    public static DispatchStrategy m56941a(DispatchStrategyType dispatchStrategyType, JSONObject jSONObject, String str, long j, int i) {
        if (C140641.f36947a[dispatchStrategyType.ordinal()] == 1) {
            return new C14070f(jSONObject);
        }
        String str2 = f36945a;
        Logger.m15167d(str2, "dispatch strategy " + dispatchStrategyType + " is not supported, fallback to default strategy");
        return new C14065a();
    }
}
