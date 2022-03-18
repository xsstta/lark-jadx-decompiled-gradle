package com.bytedance.common.wschannel.log;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.message.log.C59442c;
import org.json.JSONObject;

public class WsChannelLog {
    public static void onEventV3Bundle(Context context, String str, Bundle bundle) {
        if (!StringUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                if (bundle != null) {
                    for (String str2 : bundle.keySet()) {
                        jSONObject.put(str2, bundle.get(str2));
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            C59442c.m230758a(context, "event_v3", str, null, 0, 0, jSONObject);
        }
    }
}
