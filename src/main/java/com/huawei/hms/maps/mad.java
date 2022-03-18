package com.huawei.hms.maps;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.huawei.hms.utils.HMSPackageManager;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

public final class mad {

    /* renamed from: a */
    public final int f58638a;

    public mad(int i) {
        this.f58638a = i;
    }

    /* renamed from: a */
    public static boolean m86191a(HMSPackageManager hMSPackageManager, Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            mcq.m86889e("AvailableAdapter", "In isMinApkVersionEffective, Failed to get 'PackageManager' instance.");
            return true;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(hMSPackageManager.getHMSPackageName(), SmActions.ACTION_ONTHECALL_EXIT).applicationInfo;
            if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("com.huawei.hms.kit.api_level:hmscore") && hMSPackageManager.getHmsVersionCode() <= 19999999) {
                mcq.m86887c("AvailableAdapter", "MinApkVersion is disabled.");
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            mcq.m86889e("AvailableAdapter", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.");
        }
        return true;
    }
}
