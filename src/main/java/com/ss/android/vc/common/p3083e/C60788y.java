package com.ss.android.vc.common.p3083e;

import android.app.Activity;
import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.permission.AbstractC60798c;
import com.ss.android.vc.common.permission.C60795b;
import com.ss.android.vc.common.permission.PermissionActivity;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;

/* renamed from: com.ss.android.vc.common.e.y */
public class C60788y {

    /* renamed from: a */
    private static boolean f151987a;

    /* renamed from: b */
    private static boolean f151988b;

    /* renamed from: a */
    public static boolean m236247a(Context context) {
        if (f151987a) {
            return true;
        }
        if (context == null) {
            context = ar.m236694a();
        }
        boolean a = C60795b.m236296a(context, "android.permission.CAMERA");
        f151987a = a;
        return a;
    }

    /* renamed from: b */
    public static boolean m236250b(Context context) {
        if (f151988b) {
            return true;
        }
        if (context == null) {
            context = ar.m236694a();
        }
        boolean a = C60795b.m236296a(context, "android.permission.RECORD_AUDIO");
        f151988b = a;
        return a;
    }

    /* renamed from: a */
    public static void m236245a(Activity activity, AbstractC60798c cVar) {
        C60795b.m236293a(activity, "android.permission.CAMERA", "", "", cVar);
    }

    /* renamed from: b */
    public static void m236248b(Activity activity, AbstractC60798c cVar) {
        C60795b.m236293a(activity, "android.permission.RECORD_AUDIO", "", "", cVar);
    }

    /* renamed from: a */
    public static void m236246a(Context context, AbstractC60798c cVar) {
        if (!m236247a(context)) {
            PermissionActivity.m236271a(context, "android.permission.CAMERA", ar.m236694a().getString(R.string.View_VM_AccessToCameraDenied), UIHelper.mustacheFormat((int) R.string.View_VM_NeedsCameraAppNameBraces, "appName", VideoChatModuleDependency.getLarkAppDependency().mo196409b()), cVar);
        } else if (cVar != null) {
            cVar.permissionGranted(true);
        }
    }

    /* renamed from: b */
    public static void m236249b(Context context, AbstractC60798c cVar) {
        if (!m236250b(context)) {
            PermissionActivity.m236271a(context, "android.permission.RECORD_AUDIO", ar.m236694a().getString(R.string.View_VM_AccessToMicDenied), UIHelper.mustacheFormat((int) R.string.View_G_NeedsMicAppNameBraces, "appName", VideoChatModuleDependency.getLarkAppDependency().mo196409b()), cVar);
        } else if (cVar != null) {
            cVar.permissionGranted(true);
        }
    }
}
