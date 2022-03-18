package com.bytedance.ee.bear.quoto;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.quoto.p */
public class C10583p {
    /* renamed from: b */
    private static String m43822b(String str) {
        return str == null ? "0" : str;
    }

    /* renamed from: a */
    private static String m43818a(Boolean bool) {
        if (bool == null) {
            return "暂无";
        }
        if (bool.booleanValue()) {
            return "administrator";
        }
        return "user";
    }

    /* renamed from: a */
    private static String m43819a(String str) {
        if (str == null) {
            return "暂无";
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c = 0;
                    break;
                }
                break;
            case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                if (str.equals("2")) {
                    c = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c = 3;
                    break;
                }
                break;
            case 53:
                if (str.equals("5")) {
                    c = 4;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "standard_eone";
            case 1:
                return "flagship_etwo";
            case 2:
                return "standard_ethree";
            case 3:
                return "standard_ethree_certified";
            case 4:
                return "enterprise_efour";
            case 5:
                return "enterprise_efive";
            default:
                return "暂无";
        }
    }

    /* renamed from: a */
    public static void m43820a(AbstractC5233x xVar, String str, Boolean bool, String str2) {
        if (xVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("lark_version", m43819a(str));
                jSONObject.put("member_type", m43818a(bool));
                jSONObject.put("limit_type", m43822b(str2));
                xVar.mo21081a("ccm_drive_upload_limit_view", jSONObject, "");
            } catch (JSONException e) {
                C13479a.m54758a("SingleFileExceedQuotaAn", "reportExceedQuotaView()...error = " + e);
            }
        }
    }

    /* renamed from: a */
    public static void m43821a(AbstractC5233x xVar, String str, Boolean bool, String str2, String str3) {
        if (xVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("lark_version", m43819a(str));
                jSONObject.put("member_type", m43818a(bool));
                jSONObject.put("limit_type", m43822b(str2));
                jSONObject.put("click", str3);
                xVar.mo21081a("ccm_drive_upload_limit_click", jSONObject, "");
            } catch (JSONException e) {
                C13479a.m54758a("SingleFileExceedQuotaAn", "reportExceedQuotaClick()...error = " + e);
            }
        }
    }
}
