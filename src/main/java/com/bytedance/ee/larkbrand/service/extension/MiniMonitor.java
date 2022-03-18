package com.bytedance.ee.larkbrand.service.extension;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/larkbrand/service/extension/MiniMonitor;", "", "monitorCommonLog", "", "logType", "", "logExtr", "Lorg/json/JSONObject;", "monitorDuration", "serviceName", "duration", "monitorStatusRate", UpdateKey.STATUS, "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface MiniMonitor {
    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorStatusRate(String str, int i, JSONObject jSONObject);
}
