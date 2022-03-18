package com.tt.miniapp.permission;

import android.app.Activity;

/* renamed from: com.tt.miniapp.permission.a */
public class C66576a {

    /* renamed from: com.tt.miniapp.permission.a$a */
    public interface AbstractC66577a {
        /* renamed from: a */
        void mo232176a(int i);
    }

    /* renamed from: a */
    public static boolean m260103a(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    /* renamed from: a */
    public static void m260102a(Activity activity, String[] strArr, int i) {
        if (activity instanceof AbstractC66577a) {
            ((AbstractC66577a) activity).mo232176a(i);
        }
        activity.requestPermissions(strArr, i);
    }
}
