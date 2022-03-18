package com.ss.android.lark.app.task;

import com.bytedance.apm.ApmAgent;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvProxy;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.util.share_preference.C57744a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016J(\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\bH\u0016¨\u0006\u0017"}, d2 = {"com/ss/android/lark/app/task/InitPrivacyTask$execute$1", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/CommonEnvProxy;", "checkAppIsFirstTimeStart", "", "getLogTypeSwitch", "logType", "", "getLongFromSP", "", "spName", "key", "defaultValue", "monitorEvent", "", "logExtra", "Lorg/json/JSONObject;", "putLongToSP", "value", "uploadALog", "startedTime", "endTime", "scene", "timeDelay", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitPrivacyTask$execute$1 extends CommonEnvProxy {
    @Override // com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvProxy
    public boolean checkAppIsFirstTimeStart() {
        return false;
    }

    InitPrivacyTask$execute$1() {
    }

    @Override // com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvProxy
    public boolean getLogTypeSwitch(String str) {
        if (str != null) {
            return ApmAgent.getLogTypeSwitch(str);
        }
        return false;
    }

    @Override // com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvProxy
    public void monitorEvent(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "logType");
        Intrinsics.checkParameterIsNotNull(jSONObject, "logExtra");
        MonitorUtils.monitorEvent(str, jSONObject, null, null);
    }

    @Override // com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvProxy
    public long getLongFromSP(String str, String str2, long j) {
        Intrinsics.checkParameterIsNotNull(str, "spName");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        C57744a a = C57744a.m224104a();
        return a.getLong(str + str2, j);
    }

    @Override // com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvProxy
    public void putLongToSP(String str, String str2, long j) {
        Intrinsics.checkParameterIsNotNull(str, "spName");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        C57744a a = C57744a.m224104a();
        a.putLong(str + str2, j);
    }

    @Override // com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.CommonEnvProxy
    public void uploadALog(long j, long j2, String str, long j3) {
        Intrinsics.checkParameterIsNotNull(str, "scene");
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().execute(new InitPrivacyTask$execute$1$uploadALog$1(j3, j, j2, str));
    }
}
