package com.ss.android.lark.ug.scheduler.common.apm;

import com.bytedance.apm.ApmAgent;
import com.ss.android.lark.ug.scheduler.common.exception.SchedulerException;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/common/apm/SchedulerApm;", "", "()V", "DEFAULT_ERROR_CODE", "", "KEY_ERROR_CODE", "KEY_ERROR_MSG", "KEY_METRIC_KEY_COORDINATOR", "KEY_METRIC_KEY_RULE", "KEY_RULE_ID", "KEY_SCENARIO_ID", "sendCoordinatorEvent", "", "scenarioId", "e", "Lcom/ss/android/lark/ug/scheduler/common/exception/SchedulerException;", "sendCoordinatorUnknownEvent", "message", "sendRuleEvent", "ruleId", "sendRuleUnknownEvent", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.common.b.a */
public final class SchedulerApm {

    /* renamed from: a */
    public static final SchedulerApm f141772a = new SchedulerApm();

    private SchedulerApm() {
    }

    /* renamed from: a */
    public final void mo195275a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        ApmAgent.monitorEvent("ug_reach_local_rule_error", new JSONObject().put("errorCode", "500"), null, new JSONObject().put("scenarioId", str).put("errorMsg", str2));
    }

    /* renamed from: a */
    public final void mo195274a(String str, SchedulerException schedulerException) {
        Set<Map.Entry<String, String>> entrySet;
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        Intrinsics.checkParameterIsNotNull(schedulerException, "e");
        JSONObject put = new JSONObject().put("errorCode", schedulerException.getErrorCode());
        JSONObject put2 = new JSONObject().put("scenarioId", str);
        Map<String, String> extraInfo = schedulerException.getExtraInfo();
        if (!(extraInfo == null || (entrySet = extraInfo.entrySet()) == null)) {
            for (T t : entrySet) {
                put2.put((String) t.getKey(), t.getValue());
            }
        }
        ApmAgent.monitorEvent(schedulerException.getMetricKey(), put, null, put2);
    }

    /* renamed from: a */
    public final void mo195276a(String str, String str2, SchedulerException schedulerException) {
        Set<Map.Entry<String, String>> entrySet;
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        Intrinsics.checkParameterIsNotNull(str2, "ruleId");
        Intrinsics.checkParameterIsNotNull(schedulerException, "e");
        JSONObject put = new JSONObject().put("errorCode", schedulerException.getErrorCode());
        JSONObject put2 = new JSONObject().put("scenarioId", str).put("ruleId", str2);
        Map<String, String> extraInfo = schedulerException.getExtraInfo();
        if (!(extraInfo == null || (entrySet = extraInfo.entrySet()) == null)) {
            for (T t : entrySet) {
                put2.put((String) t.getKey(), t.getValue());
            }
        }
        ApmAgent.monitorEvent(schedulerException.getMetricKey(), put, null, put2);
    }

    /* renamed from: a */
    public final void mo195277a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        Intrinsics.checkParameterIsNotNull(str2, "ruleId");
        ApmAgent.monitorEvent("ug_reach_local_rule_error", new JSONObject().put("errorCode", "500"), null, new JSONObject().put("scenarioId", str).put("ruleId", str2).put("errorMsg", str3));
    }
}
