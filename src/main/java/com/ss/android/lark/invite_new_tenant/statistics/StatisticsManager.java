package com.ss.android.lark.invite_new_tenant.statistics;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import org.json.JSONException;
import org.json.JSONObject;

public class StatisticsManager {
    /* renamed from: a */
    public static void m160654a(String str) {
        try {
            Statistics.sendEvent(str);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m160655a(String str, JSONObject jSONObject) {
        try {
            Statistics.sendEvent(str, jSONObject);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m160653a(InviteType inviteType, InviteResponseType inviteResponseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("invite_type", inviteType.type);
            jSONObject.put("toast_number", inviteResponseType.code);
        } catch (JSONException e) {
            Log.m165382e(e.getMessage());
        }
        m160655a("invite_tenant_click_share", jSONObject);
    }

    public enum InviteResponseType {
        FAILED(1),
        NO_NET(2),
        SUCCESS(0),
        INVALID_FORMAT(3),
        ERROR(4);
        
        public int code;

        private InviteResponseType(int i) {
            this.code = i;
        }
    }

    public enum InviteType {
        PHONE("phone"),
        EMAIL("email");
        
        public String type;

        private InviteType(String str) {
            this.type = str;
        }
    }
}
