package com.ss.android.lark.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.ss.android.lark.utils.e */
public class C57822e {
    /* renamed from: a */
    public static boolean m224445a(Context context) {
        int i;
        try {
            i = context.getPackageManager().getApplicationInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData.getInt("buildVersionCode", 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.m165384e("BuildEnvUtils", "isBuildInCIPlatform", e);
            i = 0;
        }
        if (i != 0) {
            return true;
        }
        return false;
    }
}
