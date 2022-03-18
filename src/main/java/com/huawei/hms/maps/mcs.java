package com.huawei.hms.maps;

import android.content.Context;
import android.content.pm.PackageManager;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

public final class mcs {
    /* renamed from: a */
    public static String m86897a(Context context) {
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData.get("com.huawei.hms.client.appid");
            if (obj != null) {
                String valueOf = String.valueOf(obj);
                return valueOf.startsWith("appid=") ? valueOf.substring(6) : valueOf;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return "";
    }
}
