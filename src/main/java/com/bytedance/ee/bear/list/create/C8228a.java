package com.bytedance.ee.bear.list.create;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.templates.TemplateReport;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.create.a */
public class C8228a {
    /* renamed from: a */
    public static void m33789a(AbstractC5233x xVar) {
        xVar.mo21080a("click_template_more_button", new JSONObject());
    }

    /* renamed from: b */
    public static void m33797b(AbstractC5233x xVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121868c, str);
            xVar.mo21080a("enter_template_center", jSONObject);
        } catch (Exception e) {
            C13479a.m54759a("CreateAnalytic", "reportClickBtnEnterTemplateCenter()...error = ", e);
        }
    }

    /* renamed from: a */
    public static void m33790a(AbstractC5233x xVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("file_type", str);
            xVar.mo21080a("click_create_item", jSONObject);
        } catch (JSONException e) {
            C13479a.m54758a("CreateAnalytic", "reportClickCreateItem()...error = " + e);
        }
    }

    /* renamed from: a */
    public static void m33791a(AbstractC5233x xVar, String str, String str2) {
        m33798b(xVar, str, str2);
    }

    /* renamed from: b */
    private static void m33798b(AbstractC5233x xVar, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("file_type", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("module", str2);
            }
            xVar.mo21080a("click_create_btn", jSONObject);
        } catch (Exception e) {
            C13479a.m54758a("CreateAnalytic", "reportClickButtonEvent()...error = " + e);
        }
    }

    /* renamed from: a */
    public static void m33796a(AbstractC5233x xVar, String str, String str2, boolean z, boolean z2) {
        m33795a(xVar, str, (String) null, str2, z, z2);
    }

    /* renamed from: a */
    public static void m33793a(AbstractC5233x xVar, String str, String str2, String str3, String str4, String str5) {
        m33794a(xVar, str, str2, str3, str4, str5, null, null, null, null, false, null);
    }

    /* renamed from: a */
    public static void m33792a(AbstractC5233x xVar, String str, String str2, int i, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("file_type", str2);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("module", str);
            }
            jSONObject.put("error_code", String.valueOf(i));
            if (TextUtils.isEmpty(str3)) {
                str3 = "unknown";
            }
            jSONObject.put("error_msg", str3);
            jSONObject.put("status_name", "fail");
            jSONObject.put("product", str4);
            xVar.mo21080a("create_new_objs", jSONObject);
        } catch (Exception e) {
            C13479a.m54758a("CreateAnalytic", "reportCreateFailEvent()...error = " + e);
        }
    }

    /* renamed from: a */
    public static void m33795a(AbstractC5233x xVar, String str, String str2, String str3, boolean z, boolean z2) {
        String str4;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("sub_action", str2);
            }
            jSONObject.put("module", str3);
            jSONObject.put("is_folder", String.valueOf(z));
            if (z2) {
                str4 = "blank_page";
            } else {
                str4 = "bottom_right";
            }
            jSONObject.put("icon_type", str4);
            xVar.mo21080a("click_new_icon", jSONObject);
        } catch (JSONException e) {
            C13479a.m54758a("CreateAnalytic", "reportClickNewIcon()...error = " + e);
        }
    }

    /* renamed from: a */
    public static void m33794a(AbstractC5233x xVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("file_type", str);
            jSONObject.put("file_id", C13598b.m55197d(str2));
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("src_obj_id", C13598b.m55197d(str4));
            }
            jSONObject.put("product", str3);
            if (!TextUtils.isEmpty(str5)) {
                jSONObject.put("module", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                jSONObject.put(ShareHitPoint.f121868c, str6);
            }
            jSONObject.put("status_name", "success");
            if (!TextUtils.isEmpty(str7)) {
                jSONObject.put("subsource", str7);
            }
            if (!TextUtils.isEmpty(str10)) {
                jSONObject.put("templatecenter_source", str10);
            }
            if ("from_set".equals(str10)) {
                jSONObject.put("singletemplate_source", "from_preview");
            }
            if (!TextUtils.isEmpty(TemplateReport.f31011b.mo44223a())) {
                jSONObject.put("template_createfromsource", TemplateReport.f31011b.mo44223a());
            }
            if (!TextUtils.isEmpty(str8)) {
                if (z) {
                    jSONObject.put("token", str8);
                } else {
                    jSONObject.put("token", C13598b.m55197d(str8));
                }
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put("template_id", str9);
            }
            xVar.mo21080a("create_new_objs", jSONObject);
        } catch (Exception e) {
            C13479a.m54758a("CreateAnalytic", "reportCreateSuccess()...error = " + e);
        }
    }
}
