package com.bytedance.apm.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.services.apm.api.AbstractC20698c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

/* renamed from: com.bytedance.apm.util.f */
public class C3118f {

    /* renamed from: a */
    private static float f10045a;

    /* renamed from: b */
    private static int f10046b;

    /* renamed from: c */
    private static int f10047c;

    /* renamed from: d */
    private static boolean f10048d;

    static {
        m12994e();
    }

    /* renamed from: a */
    public static float m12988a() {
        return f10045a;
    }

    /* renamed from: b */
    public static int m12991b() {
        return f10046b;
    }

    /* renamed from: c */
    public static int m12992c() {
        return f10047c;
    }

    /* renamed from: d */
    public static boolean m12993d() {
        return f10048d;
    }

    /* renamed from: e */
    private static void m12994e() {
        Context a = C2785b.m11735a();
        boolean z = true;
        if (!C2785b.m11779t() || Build.VERSION.SDK_INT < 23 || a == null) {
            f10047c = 60;
            f10046b = 60;
            f10048d = true;
            f10045a = 1000.0f / ((float) 60);
            return;
        }
        Display defaultDisplay = ((WindowManager) a.getSystemService("window")).getDefaultDisplay();
        float refreshRate = defaultDisplay.getRefreshRate();
        float f = BitmapDescriptorFactory.HUE_RED;
        for (Display.Mode mode : defaultDisplay.getSupportedModes()) {
            float refreshRate2 = mode.getRefreshRate();
            if (refreshRate2 > f) {
                f = refreshRate2;
            }
        }
        f10046b = m12989a(refreshRate);
        int a2 = m12989a(f);
        f10047c = a2;
        int i = f10046b;
        if (i != a2) {
            z = false;
        }
        f10048d = z;
        f10045a = 1000.0f / ((float) i);
        ActivityLifeObserver.getInstance().register(new AbstractC20698c() {
            /* class com.bytedance.apm.util.C3118f.C31191 */

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onActivityPause(Activity activity) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onActivityResume(Activity activity) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onActivityStarted(Activity activity) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onBackground(Activity activity) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onChange(Activity activity, Fragment fragment) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onFront(Activity activity) {
                C3118f.m12990a(activity);
            }
        });
    }

    /* renamed from: a */
    private static int m12989a(float f) {
        if (Math.abs(f - 60.0f) < 5.1f) {
            return 60;
        }
        if (Math.abs(f - 90.0f) < 5.1f) {
            return 90;
        }
        if (Math.abs(f - 120.0f) < 5.1f) {
            return SmEvents.EVENT_NW;
        }
        return (int) f;
    }

    /* renamed from: a */
    public static void m12990a(Activity activity) {
        boolean z;
        int a = m12989a(activity.getWindowManager().getDefaultDisplay().getRefreshRate());
        f10046b = a;
        if (a == f10047c) {
            z = true;
        } else {
            z = false;
        }
        f10048d = z;
        f10045a = 1000.0f / ((float) a);
    }
}
