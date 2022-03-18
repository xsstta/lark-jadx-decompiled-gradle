package com.ss.android.lark.multitask.task;

import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/multitask/task/EventTracker;", "", "sendEvent", "", "name", "", "params", "Lorg/json/JSONObject;", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.multitask.task.h */
public interface EventTracker {
    /* renamed from: a */
    void mo169219a(String str, JSONObject jSONObject);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.multitask.task.h$a */
    public static final class C48370a {
        /* renamed from: a */
        public static /* synthetic */ void m190784a(EventTracker hVar, String str, JSONObject jSONObject, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                hVar.mo169219a(str, jSONObject);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
        }
    }
}
