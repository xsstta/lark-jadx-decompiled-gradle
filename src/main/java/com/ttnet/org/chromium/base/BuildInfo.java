package com.ttnet.org.chromium.base;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ttnet.org.chromium.base.compat.ApiHelperForP;

public class BuildInfo {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static PackageInfo sBrowserPackageInfo = null;
    private static String sFirebaseAppId = "";
    private static boolean sInitialized;
    public String abiString;
    public String androidBuildFingerprint;
    public String customThemes;
    public String extractedFileSuffix;
    public String gmsVersionCode;
    public String hostPackageLabel;
    public long hostVersionCode;
    public String installerPackageName;
    public String packageName;
    public String resourcesVersion;
    public long versionCode;
    public String versionName;

    /* access modifiers changed from: private */
    public static class Holder {
        public static BuildInfo sInstance = new BuildInfo();

        private Holder() {
        }
    }

    public static String getFirebaseAppId() {
        return sFirebaseAppId;
    }

    public static BuildInfo getInstance() {
        return Holder.sInstance;
    }

    public static boolean isAtLeastQ() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static boolean isDebugAndroid() {
        if ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) {
            return true;
        }
        return false;
    }

    public static boolean targetsAtLeastQ() {
        if (ContextUtils.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            return true;
        }
        return false;
    }

    private static String[] getAll() {
        String str;
        BuildInfo instance = getInstance();
        String packageName2 = ContextUtils.getApplicationContext().getPackageName();
        String[] strArr = new String[23];
        strArr[0] = Build.BRAND;
        strArr[1] = Build.DEVICE;
        strArr[2] = Build.ID;
        strArr[3] = Build.MANUFACTURER;
        strArr[4] = Build.MODEL;
        strArr[5] = String.valueOf(Build.VERSION.SDK_INT);
        strArr[6] = Build.TYPE;
        strArr[7] = Build.BOARD;
        strArr[8] = packageName2;
        strArr[9] = String.valueOf(instance.hostVersionCode);
        strArr[10] = instance.hostPackageLabel;
        strArr[11] = instance.packageName;
        strArr[12] = String.valueOf(instance.versionCode);
        strArr[13] = instance.versionName;
        strArr[14] = instance.androidBuildFingerprint;
        strArr[15] = instance.gmsVersionCode;
        strArr[16] = instance.installerPackageName;
        strArr[17] = instance.abiString;
        strArr[18] = sFirebaseAppId;
        strArr[19] = instance.customThemes;
        strArr[20] = instance.resourcesVersion;
        strArr[21] = instance.extractedFileSuffix;
        if (isAtLeastQ()) {
            str = "1";
        } else {
            str = "0";
        }
        strArr[22] = str;
        return strArr;
    }

    private BuildInfo() {
        String str;
        this.hostPackageLabel = "";
        this.packageName = "";
        this.versionName = "";
        this.installerPackageName = "";
        this.gmsVersionCode = "";
        this.abiString = "";
        this.androidBuildFingerprint = "";
        this.extractedFileSuffix = "";
        this.customThemes = "";
        this.resourcesVersion = "";
        sInitialized = true;
        try {
            Context applicationContext = ContextUtils.getApplicationContext();
            String packageName2 = applicationContext.getPackageName();
            PackageManager packageManager = applicationContext.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName2, 0);
            long packageVersionCode = packageVersionCode(packageInfo);
            this.hostVersionCode = packageVersionCode;
            PackageInfo packageInfo2 = sBrowserPackageInfo;
            PackageInfo packageInfo3 = null;
            if (packageInfo2 != null) {
                this.packageName = packageInfo2.packageName;
                this.versionCode = packageVersionCode(sBrowserPackageInfo);
                this.versionName = nullToEmpty(sBrowserPackageInfo.versionName);
                sBrowserPackageInfo = null;
            } else {
                this.packageName = packageName2;
                this.versionCode = packageVersionCode;
                this.versionName = nullToEmpty(packageInfo.versionName);
            }
            this.hostPackageLabel = nullToEmpty(packageManager.getApplicationLabel(packageInfo.applicationInfo));
            this.installerPackageName = nullToEmpty(packageManager.getInstallerPackageName(this.packageName));
            try {
                packageInfo3 = packageManager.getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo3 != null) {
                str = String.valueOf(packageVersionCode(packageInfo3));
            } else {
                str = "gms versionCode not available.";
            }
            this.gmsVersionCode = str;
            String str2 = "true";
            try {
                packageManager.getPackageInfo("projekt.substratum", 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str2 = "false";
            }
            this.customThemes = str2;
            String str3 = "Not Enabled";
            if (BuildConfig.R_STRING_PRODUCT_VERSION != 0) {
                try {
                    str3 = ContextUtils.getApplicationContext().getString(BuildConfig.R_STRING_PRODUCT_VERSION);
                } catch (Exception unused3) {
                    str3 = "Not found";
                }
            }
            this.resourcesVersion = str3;
            if (Build.VERSION.SDK_INT >= 21) {
                this.abiString = TextUtils.join(", ", Build.SUPPORTED_ABIS);
            } else {
                this.abiString = String.format("ABI1: %s, ABI2: %s", Build.CPU_ABI, Build.CPU_ABI2);
            }
            this.extractedFileSuffix = String.format("@%x_%x", Long.valueOf(this.versionCode), Long.valueOf(packageInfo.lastUpdateTime));
            this.androidBuildFingerprint = Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), (int) SmActions.ACTION_ONTHECALL_EXIT));
        } catch (Exception e) {
            Log.m264556e("BuildInfo", "NameNotFoundException: " + e, new Object[0]);
        }
    }

    public static void setBrowserPackageInfo(PackageInfo packageInfo) {
        sBrowserPackageInfo = packageInfo;
    }

    public static void setFirebaseAppId(String str) {
        sFirebaseAppId = str;
    }

    private static String nullToEmpty(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    private static long packageVersionCode(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ApiHelperForP.getLongVersionCode(packageInfo);
        }
        return (long) packageInfo.versionCode;
    }
}
