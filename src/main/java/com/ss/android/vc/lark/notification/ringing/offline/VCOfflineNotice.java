package com.ss.android.vc.lark.notification.ringing.offline;

import android.net.Uri;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.vc.common.p3077b.C60700b;
import org.json.JSONException;
import org.json.JSONObject;

public class VCOfflineNotice extends Notice {
    private String acceptIntentUri;
    private int callAction;
    private int callType;
    private String callbackParam;
    private String clickIntentUri;
    private String interactiveid;
    private String lan;
    private Long voipSessionId;

    public String getAcceptIntentUri() {
        return this.acceptIntentUri;
    }

    public int getCallAction() {
        return this.callAction;
    }

    public int getCallType() {
        return this.callType;
    }

    public String getCallbackParam() {
        return this.callbackParam;
    }

    public String getClickIntentUri() {
        return this.clickIntentUri;
    }

    public String getInteractiveid() {
        return this.interactiveid;
    }

    public String getLan() {
        return this.lan;
    }

    public Long getVoipSessionId() {
        return this.voipSessionId;
    }

    public VCOfflineNotice(Notice notice) {
        super(notice);
        try {
            JSONObject jSONObject = new JSONObject(notice.voipParams);
            this.voipSessionId = Long.valueOf(jSONObject.optLong("voip_session_id", 0));
            this.acceptIntentUri = jSONObject.optString("accept_intent_uri", "");
            this.callAction = jSONObject.optInt("call_action", 0);
            this.callType = jSONObject.optInt("call_type", 0);
            this.callbackParam = jSONObject.optString("callback_param", "");
            this.clickIntentUri = jSONObject.optString("click_intent_uri", "");
            this.lan = jSONObject.optString("lan", "");
            this.interactiveid = Uri.parse(this.acceptIntentUri).getQueryParameter("interactiveid");
        } catch (JSONException e) {
            C60700b.m235864f("VCOfflineNotice", "constructor", e.getMessage());
        }
    }
}
