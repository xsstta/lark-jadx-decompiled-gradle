package com.larksuite.framework.utils;

import android.app.AppOpsManager;
import android.content.Context;
import com.ss.android.lark.log.Log;

/* renamed from: com.larksuite.framework.utils.ab */
public class C26251ab {
    /* renamed from: a */
    public static boolean m94986a(Context context) {
        if (!RomUtils.m94944c() || C26326z.m95343g()) {
            return true;
        }
        try {
            int i = context.getApplicationInfo().uid;
            String packageName = context.getPackageName();
            int intValue = ((Integer) Class.forName(AppOpsManager.class.getName()).getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 10021, Integer.valueOf(i), packageName)).intValue();
            Log.m165389i("PermissionUtils", "is permission start page background allowed: " + intValue);
            if (intValue == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            Log.m165383e("PermissionUtils", "not supported permission start page background! " + e.getMessage());
            return true;
        }
    }
}
