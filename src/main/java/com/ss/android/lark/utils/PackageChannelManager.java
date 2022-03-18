package com.ss.android.lark.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.reader_apk.C20566c;
import com.larksuite.framework.utils.C26284k;
import com.meituan.android.walle.C26962b;
import com.meituan.android.walle.C26966f;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class PackageChannelManager {
    private static String sStoredChannelName;
    private static Integer sStoredDeployMode;
    private static Boolean sStoredIsKAPackage;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DeployMode {
    }

    public static String getRuntimePackageChannel(Context context) {
        if (!C26284k.m95186b(context) && !C26284k.m95185a(context)) {
            return getBuildPackageChannel(context);
        }
        return "local";
    }

    public static boolean isKABuildPackage(Context context) {
        Boolean bool = sStoredIsKAPackage;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean z = context.getPackageManager().getApplicationInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData.getBoolean("IS_KA_PACKAGE", false);
            sStoredIsKAPackage = Boolean.valueOf(z);
            return z;
        } catch (Exception e) {
            Log.m165386e("PackageChannelManager", e);
            return false;
        }
    }

    public static int getDeployMode(Context context) {
        int i;
        Integer num = sStoredDeployMode;
        if (num != null) {
            return num.intValue();
        }
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData.getString("DEPLOY_MODE", null);
            if (!"saas".equals(string)) {
                if ("hosted".equals(string)) {
                    i = 2;
                } else if ("on-premise".equals(string)) {
                    i = 3;
                }
                Integer valueOf = Integer.valueOf(i);
                sStoredDeployMode = valueOf;
                return valueOf.intValue();
            }
            i = 1;
            Integer valueOf2 = Integer.valueOf(i);
            sStoredDeployMode = valueOf2;
            return valueOf2.intValue();
        } catch (Exception e) {
            Log.m165386e("PackageChannelManager", e);
            return 1;
        }
    }

    public static String getBuildPackageChannel(Context context) {
        if (!TextUtils.isEmpty(sStoredChannelName)) {
            return sStoredChannelName;
        }
        try {
            long nanoTime = System.nanoTime();
            String a = C20566c.m74894a(context);
            Log.m165388i("pangolin channel = " + a + ", cost nano: " + (System.nanoTime() - nanoTime));
            if (!TextUtils.isEmpty(a)) {
                sStoredChannelName = a;
                return a;
            }
            long nanoTime2 = System.nanoTime();
            C26962b a2 = C26966f.m98000a(context);
            if (a2 != null) {
                a = a2.mo95814a();
            }
            Log.m165388i("walle channel = " + a + ", cost nano: " + (System.nanoTime() - nanoTime2));
            if (!TextUtils.isEmpty(a)) {
                sStoredChannelName = a;
                return a;
            }
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData.getString("LARK_RELEASE_CHANNEL", "normal");
            if (!TextUtils.isEmpty(string)) {
                sStoredChannelName = string;
                return string;
            }
            sStoredChannelName = "normal";
            return sStoredChannelName;
        } catch (Exception e) {
            Log.m165386e("PackageChannelManager", e);
        }
    }
}
