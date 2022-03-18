package com.ss.android.vc.common.permission;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;

/* renamed from: com.ss.android.vc.common.permission.a */
public class C60794a {
    /* renamed from: a */
    public static void m236285a(Context context, int i) {
        if (i <= 0) {
            i = 16061;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        m236286a(context, intent, i);
    }

    /* renamed from: a */
    public static void m236286a(Object obj, Intent intent, int i) {
        try {
            if (obj instanceof Activity) {
                ((Activity) obj).startActivityForResult(intent, i);
            } else if (obj instanceof Fragment) {
                ((Fragment) obj).startActivityForResult(intent, i);
            } else if (obj instanceof android.app.Fragment) {
                ((android.app.Fragment) obj).startActivityForResult(intent, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
