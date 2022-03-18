package com.huawei.hms.maps.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Build;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.maps.mad;
import com.huawei.hms.maps.mbv;
import com.huawei.hms.maps.mcq;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

public class HmsUtil {

    /* renamed from: a */
    private static boolean f58633a = false;

    /* renamed from: b */
    private static boolean f58634b = true;

    /* renamed from: c */
    private static boolean f58635c = false;

    /* renamed from: d */
    private static int f58636d = 12;

    public static Activity findActivity(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    public static int isHmsAvailable(Context context) {
        String[] split;
        int i = 0;
        if (f58636d == 0) {
            return 0;
        }
        mcq.m86886b("HmsUtil", "isInitialized is: " + f58633a + "repeatFlag is: " + f58634b);
        if (f58633a || !f58634b) {
            return 1;
        }
        String str = null;
        try {
            str = context.getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData.getString("com.huawei.hms.map.version");
        } catch (PackageManager.NameNotFoundException unused) {
            mcq.m86889e("HmsUtil", "NameNotFoundException ");
        }
        int i2 = 50001300;
        if (str != null && !"".equals(str) && (split = str.split("\\.")) != null && split.length == 4) {
            mcq.m86887c("HmsUtil", "hmsVersionStr ".concat(String.valueOf(str)));
            i2 = Integer.parseInt(split[0] + "0" + split[1] + "0" + split[2] + split[3]);
            mcq.m86887c("HmsUtil", "baseVersion ".concat(String.valueOf(i2)));
        }
        mad mad = new mad(i2);
        Checker.checkNonNull(context, "context must not be null.");
        if (Build.VERSION.SDK_INT < 16) {
            mcq.m86887c("AvailableAdapter", "HMS can not be supported under android 4.1");
            i = 21;
        } else {
            HMSPackageManager instance = HMSPackageManager.getInstance(context);
            PackageManagerHelper.PackageStates hMSPackageStates = instance.getHMSPackageStates();
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(hMSPackageStates)) {
                mcq.m86887c("AvailableAdapter", "HMS is not installed");
                i = 1;
            } else if (PackageManagerHelper.PackageStates.DISABLED.equals(hMSPackageStates)) {
                mcq.m86887c("AvailableAdapter", "HMS is disabled");
                i = 3;
            } else {
                int i3 = mad.f58638a;
                int hmsVersionCode = instance.getHmsVersionCode();
                mcq.m86887c("AvailableAdapter", "current versionCode:" + hmsVersionCode + ", minimum version requirements: " + i3);
                if (mad.m86191a(instance, context) && hmsVersionCode < i3) {
                    mcq.m86887c("AvailableAdapter", "The current version does not meet the minimum version requirements");
                    i = 2;
                }
            }
        }
        mcq.m86887c("HmsUtil", "Hms is :".concat(String.valueOf(i)));
        f58633a = true;
        if (i == 0) {
            mcq.m86887c("HmsUtil", "Hms is avaiable");
        } else {
            AvailableAdapter availableAdapter = new AvailableAdapter(i2);
            if (!availableAdapter.isUserResolvableError(i)) {
                mcq.m86889e("HmsUtil", "Hms is not avaiable 26");
            } else if (!f58635c) {
                mcq.m86886b("HmsUtil", "Hms is resolution :");
                Activity findActivity = findActivity(context);
                if (findActivity == null) {
                    mcq.m86889e("HmsUtil", "Hms is not available26");
                } else {
                    availableAdapter.startResolution(findActivity, new AvailableAdapter.AvailableCallBack() {
                        /* class com.huawei.hms.maps.internal.HmsUtil.C236981 */

                        @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                        public final void onComplete(int i) {
                            if (i == 0) {
                                int unused = HmsUtil.f58636d = i;
                                mcq.m86887c("HmsUtil", "Hms is available");
                                return;
                            }
                            mcq.m86889e("HmsUtil", "Hms update version failed: ".concat(String.valueOf(i)));
                            boolean unused2 = HmsUtil.f58633a = false;
                            boolean unused3 = HmsUtil.f58634b = false;
                        }
                    });
                }
                f58635c = true;
            }
        }
        f58636d = i;
        return i;
    }

    public static void setRepeatFlag(boolean z) {
        f58634b = z;
        mbv.m86516a(z);
    }
}
