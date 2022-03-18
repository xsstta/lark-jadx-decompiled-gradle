package com.bytedance.ee.bear.document.export.p306a;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.document.export.a.a */
public class C5755a {

    /* renamed from: a */
    private AbstractC5233x f16224a = C5234y.m21391b();

    public C5755a(C10917c cVar) {
    }

    /* renamed from: a */
    public void mo23176a(IMoreInfo dVar, boolean z, String str) {
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            String a = C8275a.m34052b(dVar.mo39036e()).mo32553a();
            jSONObject.put("file_id", C13598b.m55197d(dVar.mo39041h()));
            jSONObject.put("file_type", a);
            String str4 = "true";
            if (dVar.mo39048o()) {
                str2 = str4;
            } else {
                str2 = "false";
            }
            jSONObject.put("is_owner", str2);
            if (z) {
                a = "space";
            }
            jSONObject.put("module", a);
            if (z) {
                str3 = "context_menu";
            } else {
                str3 = "top_menu";
            }
            jSONObject.put(ShareHitPoint.f121868c, str3);
            if (!dVar.mo39049p()) {
                str4 = "false";
            }
            jSONObject.put("is_editor", str4);
            jSONObject.put("export_file_type", str);
            jSONObject.put("export_file_amount", "1");
            jSONObject.put("status_code", "0");
            jSONObject.put("status_name", "success");
        } catch (JSONException e) {
            C13479a.m54759a("ExportReporter", "create JSONObject fail", e);
        }
        C13479a.m54772d("ExportReporter", "reportExportSuccess, params = " + jSONObject);
        this.f16224a.mo21080a("click_export", jSONObject);
    }

    /* renamed from: b */
    public void mo23177b(IMoreInfo dVar, boolean z, String str) {
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            String a = C8275a.m34052b(dVar.mo39036e()).mo32553a();
            jSONObject.put("file_id", C13598b.m55197d(dVar.mo39041h()));
            jSONObject.put("file_type", a);
            String str4 = "true";
            if (dVar.mo39048o()) {
                str2 = str4;
            } else {
                str2 = "false";
            }
            jSONObject.put("is_owner", str2);
            if (z) {
                a = "space";
            }
            jSONObject.put("module", a);
            if (z) {
                str3 = "context_menu";
            } else {
                str3 = "top_menu";
            }
            jSONObject.put(ShareHitPoint.f121868c, str3);
            if (!dVar.mo39049p()) {
                str4 = "false";
            }
            jSONObject.put("is_editor", str4);
            jSONObject.put("export_file_type", str);
            jSONObject.put("export_file_amount", "1");
            jSONObject.put("status_code", "100");
            jSONObject.put("status_name", "failed");
        } catch (JSONException e) {
            C13479a.m54759a("ExportReporter", "create JSONObject fail", e);
        }
        C13479a.m54772d("ExportReporter", "reportExportFail, params = " + jSONObject);
        this.f16224a.mo21080a("click_export", jSONObject);
    }

    /* renamed from: c */
    public void mo23178c(IMoreInfo dVar, boolean z, String str) {
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            String a = C8275a.m34052b(dVar.mo39036e()).mo32553a();
            jSONObject.put("file_id", C13598b.m55197d(dVar.mo39041h()));
            jSONObject.put("file_type", a);
            String str4 = "true";
            if (dVar.mo39048o()) {
                str2 = str4;
            } else {
                str2 = "false";
            }
            jSONObject.put("is_owner", str2);
            if (z) {
                a = "space";
            }
            jSONObject.put("module", a);
            if (z) {
                str3 = "context_menu";
            } else {
                str3 = "top_menu";
            }
            jSONObject.put(ShareHitPoint.f121868c, str3);
            if (!dVar.mo39049p()) {
                str4 = "false";
            }
            jSONObject.put("is_editor", str4);
            jSONObject.put("export_file_type", str);
            jSONObject.put("export_file_amount", "1");
            jSONObject.put("status_code", "100");
            jSONObject.put("status_name", "canceled");
        } catch (JSONException e) {
            C13479a.m54759a("ExportReporter", "create JSONObject fail", e);
        }
        C13479a.m54772d("ExportReporter", "reportExportCancel, params = " + jSONObject);
        this.f16224a.mo21080a("click_export", jSONObject);
    }
}
