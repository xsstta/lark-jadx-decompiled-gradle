package com.bytedance.common.profilesdk;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.lang.reflect.Method;

public class AppContext {
    static Context sAppContext;
    static String sInstructionSet;
    static String sPackageDexPath;
    static String sPackageName;

    public static Context getContext() {
        Context context = sAppContext;
        if (context != null) {
            return context;
        }
        throw new RuntimeException("Please make sure Deximage.init(...) first");
    }

    public static File getCacheDir() {
        if (Build.VERSION.SDK_INT >= 21) {
            return getContext().getCodeCacheDir();
        }
        return getContext().getCacheDir();
    }

    public static String getPackageDexPath() {
        if (sPackageDexPath == null) {
            sPackageDexPath = getContext().getPackageCodePath();
        }
        return sPackageDexPath;
    }

    public static String getPackageName() {
        if (sPackageName == null) {
            sPackageName = getContext().getPackageName();
        }
        return sPackageName;
    }

    public static File getProfilesDir() {
        File file = new File(getCacheDir(), "app_profiles");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public static String getInstructionSet() {
        if (sInstructionSet == null) {
            try {
                Method declaredMethod = Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("getCurrentInstructionSet", new Class[0]);
                declaredMethod.setAccessible(true);
                sInstructionSet = (String) declaredMethod.invoke(null, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
        return sInstructionSet;
    }

    public static String getPackageImagePath() {
        return new File(getPackageDexPath()).getParentFile().getAbsolutePath() + "/oat/" + getInstructionSet() + "/base.art";
    }

    public static void init(Context context) {
        if (sAppContext != null) {
            return;
        }
        if (context instanceof Application) {
            sAppContext = context;
        } else {
            sAppContext = context.getApplicationContext();
        }
    }
}
