package com.huawei.hms.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.device.C23533a;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.security.cert.X509Certificate;
import java.util.List;

public class HMSPackageManager {

    /* renamed from: f */
    public static HMSPackageManager f58964f;

    /* renamed from: g */
    public static final Object f58965g = new Object();

    /* renamed from: h */
    public static final Object f58966h = new Object();

    /* renamed from: a */
    public final Context f58967a;

    /* renamed from: b */
    public final PackageManagerHelper f58968b;

    /* renamed from: c */
    public String f58969c;

    /* renamed from: d */
    public String f58970d;

    /* renamed from: e */
    public int f58971e;

    public String getHMSFingerprint() {
        String str = this.f58970d;
        if (str == null) {
            return "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05";
        }
        return str;
    }

    public int getHmsVersionCode() {
        return this.f58968b.getPackageVersionCode(getHMSPackageName());
    }

    public void refresh() {
        if (TextUtils.isEmpty(this.f58969c) || TextUtils.isEmpty(this.f58970d)) {
            mo85510b();
        }
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
        if (TextUtils.isEmpty(this.f58969c) || TextUtils.isEmpty(this.f58970d)) {
            mo85510b();
            return this.f58968b.getPackageStates(this.f58969c);
        }
        PackageManagerHelper.PackageStates packageStates = this.f58968b.getPackageStates(this.f58969c);
        if (packageStates != PackageManagerHelper.PackageStates.ENABLED || this.f58970d.equals(this.f58968b.getPackageSignature(this.f58969c))) {
            return packageStates;
        }
        return PackageManagerHelper.PackageStates.NOT_INSTALLED;
    }

    /* renamed from: b */
    public final void mo85510b() {
        synchronized (f58966h) {
            Pair<String, String> a = mo85508a();
            if (a == null) {
                HMSLog.m86964e("HMSPackageManager", "Failed to find HMS apk");
                this.f58969c = null;
                this.f58970d = null;
                this.f58971e = 0;
                return;
            }
            this.f58969c = (String) a.first;
            this.f58970d = (String) a.second;
            this.f58971e = this.f58968b.getPackageVersionCode(getHMSPackageName());
            HMSLog.m86966i("HMSPackageManager", "Succeed to find HMS apk: " + this.f58969c + " version: " + this.f58971e);
        }
    }

    /* renamed from: c */
    public final boolean mo85511c() {
        PackageManager packageManager = this.f58967a.getPackageManager();
        if (packageManager == null) {
            HMSLog.m86964e("HMSPackageManager", "In isMinApkVersionEffective, Failed to get 'PackageManager' instance.");
            return true;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(getHMSPackageName(), SmActions.ACTION_ONTHECALL_EXIT).applicationInfo;
            if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("com.huawei.hms.kit.api_level:hmscore") && (getHmsVersionCode() >= 50000000 || getHmsVersionCode() <= 19999999)) {
                HMSLog.m86966i("HMSPackageManager", "MinApkVersion is disabled.");
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.m86964e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.");
        }
        return true;
    }

    public String getHMSPackageName() {
        refresh();
        String str = this.f58969c;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f58968b.getPackageStates(str))) {
                HMSLog.m86966i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                mo85510b();
            }
            String str2 = this.f58969c;
            if (str2 != null) {
                return str2;
            }
        }
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f58968b.getPackageStates("com.huawei.hwid")) || !this.f58968b.getPackageSignature("com.huawei.hwid").equalsIgnoreCase("B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05")) {
            return PackageConstants.SERVICES_PACKAGE_ALL_SCENE;
        }
        return "com.huawei.hwid";
    }

    /* renamed from: a */
    public final Pair<String, String> mo85508a() {
        List<ResolveInfo> queryIntentServices = this.f58967a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), SmActions.ACTION_ONTHECALL_EXIT);
        if (queryIntentServices.size() == 0) {
            return null;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            String str = resolveInfo.serviceInfo.applicationInfo.packageName;
            Bundle bundle = resolveInfo.serviceInfo.metaData;
            if (bundle == null) {
                HMSLog.m86964e("HMSPackageManager", "skip package " + str + " for metadata is null");
            } else if (!bundle.containsKey("hms_app_signer")) {
                HMSLog.m86964e("HMSPackageManager", "skip package " + str + " for no signer");
            } else if (!bundle.containsKey("hms_app_cert_chain")) {
                HMSLog.m86964e("HMSPackageManager", "skip package " + str + " for no cert chain");
            } else {
                String packageSignature = this.f58968b.getPackageSignature(str);
                if (mo85509a(str + ContainerUtils.FIELD_DELIMITER + packageSignature, bundle.getString("hms_app_signer"), bundle.getString("hms_app_cert_chain"))) {
                    return new Pair<>(str, packageSignature);
                }
                HMSLog.m86964e("HMSPackageManager", "checkSinger failed");
            }
        }
        return null;
    }

    public HMSPackageManager(Context context) {
        this.f58967a = context;
        this.f58968b = new PackageManagerHelper(context);
    }

    public boolean hmsVerHigherThan(int i) {
        if (this.f58971e >= i || !mo85511c()) {
            return true;
        }
        int packageVersionCode = this.f58968b.getPackageVersionCode(getHMSPackageName());
        this.f58971e = packageVersionCode;
        if (packageVersionCode >= i) {
            return true;
        }
        return false;
    }

    public static HMSPackageManager getInstance(Context context) {
        synchronized (f58965g) {
            if (f58964f == null) {
                if (context.getApplicationContext() != null) {
                    f58964f = new HMSPackageManager(context.getApplicationContext());
                } else {
                    f58964f = new HMSPackageManager(context);
                }
                f58964f.mo85510b();
            }
        }
        return f58964f;
    }

    public boolean isApkUpdateNecessary(int i) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.m86966i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", minimum version requirements: " + i);
        if (!mo85511c() || hmsVersionCode >= i) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo85509a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            HMSLog.m86964e("HMSPackageManager", "args is invalid");
            return false;
        }
        List<X509Certificate> b = C23533a.m85321b(str3);
        if (b.size() == 0) {
            HMSLog.m86964e("HMSPackageManager", "certChain is empty");
            return false;
        } else if (!C23533a.m85318a(C23533a.m85311a(this.f58967a), b)) {
            HMSLog.m86964e("HMSPackageManager", "failed to verify cert chain");
            return false;
        } else {
            X509Certificate x509Certificate = b.get(b.size() - 1);
            if (!C23533a.m85316a(x509Certificate, "Huawei CBG HMS")) {
                HMSLog.m86964e("HMSPackageManager", "CN is invalid");
                return false;
            } else if (!C23533a.m85323b(x509Certificate, "Huawei CBG Cloud Security Signer")) {
                HMSLog.m86964e("HMSPackageManager", "OU is invalid");
                return false;
            } else if (C23533a.m85317a(x509Certificate, str, str2)) {
                return true;
            } else {
                HMSLog.m86964e("HMSPackageManager", "signature is invalid: " + str);
                return false;
            }
        }
    }
}
