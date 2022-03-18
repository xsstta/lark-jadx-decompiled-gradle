package com.google.android.gms.common;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.google.android.gms.common.b */
public final class C21700b extends GooglePlayServicesUtilLight {

    /* renamed from: a */
    public static final int f52917a = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: a */
    public static int m78850a(Context context, int i) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i);
    }

    /* renamed from: a */
    public static Resources m78851a(Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    /* renamed from: b */
    public static Context m78852b(Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }
}
