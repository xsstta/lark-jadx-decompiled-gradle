package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C21737ah;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.larksuite.suite.R;

public final class GoogleServices {
    private static final Object sLock = new Object();
    private static GoogleServices zzay;
    private final String zzaz;
    private final Status zzba;
    private final boolean zzbb;
    private final boolean zzbc;

    GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        boolean z = false;
        boolean z2 = true;
        if (identifier != 0) {
            z = INVOKEVIRTUAL_com_google_android_gms_common_api_internal_GoogleServices_com_bytedance_sysoptimizer_java_ResourcesProtector_getInteger(resources, identifier) != 0 ? true : z;
            this.zzbc = !z;
            z2 = z;
        } else {
            this.zzbc = false;
        }
        this.zzbb = z2;
        String a = C21737ah.m78941a(context);
        a = a == null ? new StringResourceValueReader(context).getString("google_app_id") : a;
        if (TextUtils.isEmpty(a)) {
            this.zzba = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzaz = null;
            return;
        }
        this.zzaz = a;
        this.zzba = Status.RESULT_SUCCESS;
    }

    GoogleServices(String str, boolean z) {
        this.zzaz = str;
        this.zzba = Status.RESULT_SUCCESS;
        this.zzbb = z;
        this.zzbc = !z;
    }

    public static Status initialize(Context context, String str, boolean z) {
        Preconditions.checkNotNull(context, "Context must not be null.");
        Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (sLock) {
            GoogleServices googleServices = zzay;
            if (googleServices != null) {
                return googleServices.checkGoogleAppId(str);
            }
            GoogleServices googleServices2 = new GoogleServices(str, z);
            zzay = googleServices2;
            return googleServices2.zzba;
        }
    }

    /* access modifiers changed from: package-private */
    public final Status checkGoogleAppId(String str) {
        String str2 = this.zzaz;
        if (str2 == null || str2.equals(str)) {
            return Status.RESULT_SUCCESS;
        }
        String str3 = this.zzaz;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 97);
        sb.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
        sb.append(str3);
        sb.append("'.");
        return new Status(10, sb.toString());
    }

    public static Status initialize(Context context) {
        Status status;
        Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (sLock) {
            if (zzay == null) {
                zzay = new GoogleServices(context);
            }
            status = zzay.zzba;
        }
        return status;
    }

    public static String getGoogleAppId() {
        return checkInitialized("getGoogleAppId").zzaz;
    }

    public static boolean isMeasurementEnabled() {
        GoogleServices checkInitialized = checkInitialized("isMeasurementEnabled");
        return checkInitialized.zzba.isSuccess() && checkInitialized.zzbb;
    }

    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized("isMeasurementExplicitlyDisabled").zzbc;
    }

    static void clearInstanceForTest() {
        synchronized (sLock) {
            zzay = null;
        }
    }

    private static GoogleServices checkInitialized(String str) {
        GoogleServices googleServices;
        synchronized (sLock) {
            googleServices = zzay;
            if (googleServices == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return googleServices;
    }

    public static int INVOKEVIRTUAL_com_google_android_gms_common_api_internal_GoogleServices_com_bytedance_sysoptimizer_java_ResourcesProtector_getInteger(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }
}
