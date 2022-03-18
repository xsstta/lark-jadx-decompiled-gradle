package com.bytedance.push.interfaze;

import android.content.Context;
import android.content.Intent;
import com.bytedance.push.PushBody;
import org.json.JSONObject;

public interface IPushMsgHandler {
    void handlePassThroughMsg(String str, int i, String str2);

    void handlePassThroughMsg(JSONObject jSONObject, int i, String str);

    void onClickMsg(Context context, String str, int i);

    void trackClickPush(Context context, long j, String str, String str2, boolean z, JSONObject jSONObject);

    void trackClickPush(Context context, Intent intent, String str, JSONObject jSONObject);

    void trackClickPush(Context context, PushBody pushBody, boolean z, JSONObject jSONObject);
}
