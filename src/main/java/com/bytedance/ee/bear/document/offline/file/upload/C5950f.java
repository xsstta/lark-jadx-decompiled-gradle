package com.bytedance.ee.bear.document.offline.file.upload;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.document.offline.file.upload.f */
public class C5950f {

    /* renamed from: a */
    private final AbstractC5233x f16671a;

    public C5950f(AbstractC5233x xVar) {
        this.f16671a = xVar;
    }

    /* renamed from: a */
    public void mo24060a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("module", str);
            jSONObject.put("src_module", str);
            jSONObject.put("sub_module", "");
            jSONObject.put("file_id", C13721c.m55650d(str2));
            jSONObject.put("sub_file_type", str3);
            jSONObject.put("action", "finish_upload");
            jSONObject.put("product_type", "drive");
            jSONObject.put("file_type", "file");
            jSONObject.put("is_dir", (Object) 0);
            jSONObject.put("is_import", (Object) 0);
            C13479a.m54764b("UploadFileAnalytic", "reportUploadDocumentFile. params = " + jSONObject);
            AbstractC5233x xVar = this.f16671a;
            if (xVar != null) {
                xVar.mo21080a("drive_sdk_file_upload", jSONObject);
            }
        } catch (Exception e) {
            C13479a.m54759a("UploadFileAnalytic", "reportUploadDocumentFile fail ", e);
        }
    }

    /* renamed from: a */
    public void mo24059a(int i, String str, String str2, String str3, String str4, long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", Integer.toString(i));
            jSONObject.put("msg", str);
            jSONObject.put("uploadContentType", str2);
            jSONObject.put("upload_from", str3);
            jSONObject.put("upload_to", str4);
            jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Long.toString(j));
            jSONObject.put("file_size", Long.toString(j2));
            C13479a.m54764b("UploadFileAnalytic", "reportUploadFilePerformance. params = " + jSONObject);
            AbstractC5233x xVar = this.f16671a;
            if (xVar != null) {
                xVar.mo21080a("docs_dev_performance_native_file_upload_result", jSONObject);
            }
        } catch (JSONException e) {
            C13479a.m54759a("UploadFileAnalytic", "reportUploadFilePerformance fail ", e);
        }
    }
}
