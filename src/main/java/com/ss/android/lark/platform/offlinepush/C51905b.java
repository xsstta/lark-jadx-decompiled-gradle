package com.ss.android.lark.platform.offlinepush;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.lark.android.module.offlinepush.C64266c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.offlinepush.b */
public class C51905b implements C64266c.AbstractC64276c {
    @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64276c
    /* renamed from: a */
    public void mo178090a(Context context, int i, String str, int i2, String str2) {
        Log.m165379d("OfflinePush", "notification onClick  = " + str2 + "     ：     " + str);
        String str3 = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            str3 = jSONObject.optString("extra_str");
            if (TextUtils.isEmpty(str3)) {
                str3 = jSONObject.optString("open_url");
                if (str3 == "") {
                    Log.m165383e("OfflinePushClickListener", "notification onClick error, obj = " + str);
                    return;
                } else if (str3.startsWith("http://")) {
                    str3 = str3.substring(7);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Log.m165383e("OfflinePushClickListener", "notification onClick error, from = " + i2 + ", obj = " + str);
        }
        OfflinePushClickHandler.m201276a(context, str3);
    }
}
