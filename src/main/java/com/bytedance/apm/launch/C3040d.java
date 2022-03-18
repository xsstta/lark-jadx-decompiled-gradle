package com.bytedance.apm.launch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.services.apm.api.AbstractC20698c;

/* renamed from: com.bytedance.apm.launch.d */
public class C3040d {

    /* renamed from: a */
    public static boolean f9786a = false;

    /* renamed from: b */
    public static boolean f9787b = false;

    /* renamed from: c */
    public static boolean f9788c = false;

    /* renamed from: d */
    public static String f9789d = "";

    /* renamed from: e */
    public static String f9790e = "";

    /* renamed from: f */
    public static long f9791f;

    /* renamed from: g */
    public static long f9792g;

    /* renamed from: h */
    private static Intent f9793h;

    /* renamed from: a */
    public static void m12727a() {
        f9793h = C3044f.m12748a();
        ActivityLifeObserver.getInstance().register(new AbstractC20698c() {
            /* class com.bytedance.apm.launch.C3040d.C30411 */

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onActivityResume(Activity activity) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onChange(Activity activity, Fragment fragment) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onActivityStarted(Activity activity) {
                C3040d.f9792g = System.currentTimeMillis();
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onActivityPause(Activity activity) {
                C3040d.f9790e = activity.getComponentName().getClassName();
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onBackground(Activity activity) {
                C3040d.f9786a = true;
                C3040d.f9788c = false;
                C3040d.f9789d = "";
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onFront(Activity activity) {
                C3040d.f9789d = activity.getComponentName().getClassName();
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onActivityCreated(Activity activity, Bundle bundle) {
                boolean z;
                C3040d.f9791f = System.currentTimeMillis();
                if (bundle != null) {
                    z = true;
                } else {
                    z = false;
                }
                C3040d.f9787b = z;
                C3040d.f9788c = true;
            }
        });
    }
}
