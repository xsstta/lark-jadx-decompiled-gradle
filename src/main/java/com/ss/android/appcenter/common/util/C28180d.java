package com.ss.android.appcenter.common.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.larksuite.suite.R;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;

/* renamed from: com.ss.android.appcenter.common.util.d */
public class C28180d {
    /* renamed from: a */
    public static Resources m103230a() {
        if (C27528a.m100471a().mo98143b() == null) {
            return null;
        }
        Resources resources = C27528a.m100471a().mo98143b().getResources();
        if (C27548m.m100547m().mo98218b() != null) {
            Configuration configuration = resources.getConfiguration();
            configuration.locale = C27548m.m100547m().mo98218b().mo98170a();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return resources;
    }

    /* renamed from: a */
    public static String m103231a(Context context) {
        if (context == null) {
            return null;
        }
        if (C27548m.m100547m().mo98218b() == null || !C27548m.m100547m().mo98218b().mo98172c()) {
            return context.getString(R.string.OpenPlatform_AppCenter_AppOfflineDesc);
        }
        return context.getString(R.string.OpenPlatform_AppCenter_AppOfflineLarkDesc);
    }
}
