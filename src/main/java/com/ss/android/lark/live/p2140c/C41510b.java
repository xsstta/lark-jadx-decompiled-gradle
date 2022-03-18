package com.ss.android.lark.live.p2140c;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.live.c.b */
public class C41510b {
    /* renamed from: a */
    public static void m164738a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            jSONObject.put("mode", i);
            m164740a("vc_live_page_live", jSONObject);
        } catch (JSONException e) {
            C45855f.m181666e("VCLiveEvent", "sendLiveModeEvent " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m164739a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            m164740a("vc_live_page_float_window", jSONObject);
        } catch (JSONException e) {
            C45855f.m181666e("VCLiveEvent", "sendLiveFloatPageEvent " + e.getMessage());
        }
    }

    /* renamed from: a */
    private static void m164740a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        IMmDepend.MmAppEnv d = C45899c.m181859a().getHostDepend().mo144636d();
        if (d != IMmDepend.MmAppEnv.RELEASE && d != IMmDepend.MmAppEnv.PRE_RELEASE) {
            try {
                jSONObject.put("_staging_flag", 1);
            } catch (JSONException e) {
                C45855f.m181666e("VCLiveEvent", "sendEvent4 " + e.getMessage());
            }
        } else if (C26284k.m95185a(C45899c.m181859a().getContextDepend().mo144557a())) {
            try {
                jSONObject.put("_env_type", "debug");
            } catch (JSONException e2) {
                C45855f.m181666e("VCLiveEvent", "sendEvent3 " + e2.getMessage());
            }
        }
        C47083e.m186427a(str, jSONObject);
    }

    /* renamed from: a */
    public static void m164741a(String str, boolean z, boolean z2, String str2) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            int i2 = 1;
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("screen_orientation", i);
            if (!z2) {
                i2 = 0;
            }
            jSONObject.put("has_created_live", i2);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("from_source", str2);
            }
            m164740a("vc_live_page_live", jSONObject);
        } catch (JSONException e) {
            C45855f.m181666e("VCLiveEvent", "sendLivePageEvent " + e.getMessage());
        }
    }
}
