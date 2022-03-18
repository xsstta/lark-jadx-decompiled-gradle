package com.ss.android.lark.integrator.passport.p2046a;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.C57744a;

/* renamed from: com.ss.android.lark.integrator.passport.a.a */
public class C39953a {

    /* renamed from: a */
    private static String f101659a = "";

    /* renamed from: a */
    public static String m158573a(Context context) {
        if (!TextUtils.isEmpty(f101659a)) {
            Log.m165379d("AppsFlyerIDGenerator", "AFID 0: " + f101659a);
            return f101659a;
        }
        String string = C57744a.m224104a().getString("sp.key.af.id");
        if (!TextUtils.isEmpty(string)) {
            f101659a = string;
            Log.m165379d("AppsFlyerIDGenerator", "AFID 1: " + f101659a);
            return string;
        }
        try {
            f101659a = AppsFlyerLib.getInstance().getAppsFlyerUID(context);
            C57744a.m224104a().putString("sp.key.af.id", f101659a);
            Log.m165379d("AppsFlyerIDGenerator", "AFID 2: " + f101659a);
        } catch (Exception e) {
            Log.m165398w("AppsFlyerIDGenerator", "getAppsFlyerUID Exception", e);
        }
        return f101659a;
    }
}
