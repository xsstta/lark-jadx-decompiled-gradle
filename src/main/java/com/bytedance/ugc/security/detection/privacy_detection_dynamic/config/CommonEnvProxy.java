package com.bytedance.ugc.security.detection.privacy_detection_dynamic.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH&J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tH&J(\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\tH\u0016¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/CommonEnvProxy;", "", "()V", "checkAppIsFirstTimeStart", "", "getLogTypeSwitch", "logType", "", "getLongFromSP", "", "spName", "key", "defaultValue", "monitorEvent", "", "logExtra", "Lorg/json/JSONObject;", "putLongToSP", "value", "uploadALog", "startedTime", "endTime", "scene", "timeDelay", "privacy-detection-dynamic_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class CommonEnvProxy {
    public abstract boolean checkAppIsFirstTimeStart();

    public abstract boolean getLogTypeSwitch(String str);

    public abstract long getLongFromSP(String str, String str2, long j);

    public void monitorEvent(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "logType");
        Intrinsics.checkParameterIsNotNull(jSONObject, "logExtra");
    }

    public abstract void putLongToSP(String str, String str2, long j);

    public void uploadALog(long j, long j2, String str, long j3) {
        Intrinsics.checkParameterIsNotNull(str, "scene");
    }
}
