package com.ss.android.lark.platform.batterymonitor.p2480d;

import android.content.Context;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.batterymonitor.ConditionState;
import com.ss.android.lark.platform.batterymonitor.p2479c.AbstractC51731a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.platform.batterymonitor.d.a */
public abstract class AbstractC51736a {

    /* renamed from: a */
    protected Map<String, Integer> f128633a;

    /* renamed from: b */
    protected int f128634b;

    /* renamed from: c */
    protected Context f128635c;

    /* renamed from: d */
    protected ConditionState f128636d;

    /* renamed from: e */
    AbstractC51731a f128637e;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo177850b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo177851c();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo177853e() {
    }

    /* renamed from: a */
    public boolean mo177848a() {
        if (this.f128634b == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo177852d() {
        if (!CollectionUtils.isEmpty(this.f128633a)) {
            Log.m165389i("BatteryMonitor", "MainProcessBatteryStrategy newStrategyMap called. strategyMap isn't null.");
        } else {
            this.f128633a = new HashMap<String, Integer>(30) {
                /* class com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a.C517371 */

                {
                    put("0000", 0);
                    put("0010", 0);
                    put("0100", 0);
                    put("0110", 0);
                    put("1000", 1);
                    put("1001", 1);
                    put("1002", 2);
                    put("1010", 1);
                    put("1011", 1);
                    put("1012", 2);
                    put("1100", 1);
                    put("1101", 1);
                    put("1102", 2);
                    put("1110", 1);
                    put("1111", 1);
                    put("1112", 2);
                    put("2000", 2);
                    put("2001", 2);
                    put("2002", 2);
                    put("2010", 2);
                    put("2011", 2);
                    put("2012", 2);
                    put("2100", 2);
                    put("2101", 2);
                    put("2102", 2);
                    put("2110", 2);
                    put("2111", 2);
                    put("2112", 2);
                }
            };
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177847a(ConditionState conditionState) {
        this.f128636d = conditionState;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo177849b(ConditionState conditionState) {
        if (conditionState == null) {
            Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " battery strategy, getStrategy called, condition state is null.");
            return 0;
        }
        Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " battery strategy, getStrategy called, ConditionState:" + conditionState.toString());
        if (CollectionUtils.isEmpty(this.f128633a)) {
            mo177852d();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(conditionState.mo177800a());
        sb.append(conditionState.mo177802c());
        sb.append(conditionState.mo177803d());
        sb.append(conditionState.mo177801b());
        Integer num = this.f128633a.get(sb.toString());
        if (num != null) {
            return num.intValue();
        }
        Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " battery strategy, getStrategy called, no match, so init default strategy:" + 0);
        return 0;
    }
}
