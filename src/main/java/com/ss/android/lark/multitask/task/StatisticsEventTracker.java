package com.ss.android.lark.multitask.task;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/multitask/task/StatisticsEventTracker;", "Lcom/ss/android/lark/multitask/task/EventTracker;", "()V", "sendEvent", "", "name", "", "params", "Lorg/json/JSONObject;", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.multitask.task.m */
public final class StatisticsEventTracker implements EventTracker {
    @Override // com.ss.android.lark.multitask.task.EventTracker
    /* renamed from: a */
    public void mo169219a(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Statistics.sendEvent(str, jSONObject);
    }
}
