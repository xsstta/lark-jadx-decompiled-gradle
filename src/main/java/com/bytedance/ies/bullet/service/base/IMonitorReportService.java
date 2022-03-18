package com.bytedance.ies.bullet.service.base;

import com.bytedance.ies.bullet.service.base.api.IBulletService;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/IMonitorReportService;", "Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "generalReport", "", "serviceName", "", UpdateKey.STATUS, "", "duration", "Lorg/json/JSONObject;", "logExtr", "getMonitorConfig", "Lcom/bytedance/ies/bullet/service/base/MonitorConfig;", "report", "info", "Lcom/bytedance/ies/bullet/service/base/ReportInfo;", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.e */
public interface IMonitorReportService extends IBulletService {
    /* renamed from: a */
    void mo52612a(ReportInfo lVar);

    /* renamed from: a */
    void mo52614a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2);

    /* renamed from: b */
    MonitorConfig mo52616b();
}
