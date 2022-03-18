package com.ss.android.lark.permission;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.permission.rxPermission.C51331a;
import io.reactivex.functions.Consumer;

/* renamed from: com.ss.android.lark.permission.f */
public class C51327f {

    /* renamed from: a */
    public static boolean f127826a = true;

    /* renamed from: a */
    public static boolean m199080a(Activity activity) {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 16) {
            return true;
        }
        if (ContextCompat.checkSelfPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            z = false;
        }
        if (!z) {
            ActivityCompat.requestPermissions(activity, C51326e.f127822c, 2);
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m199084b(Activity activity) {
        boolean z;
        if (ContextCompat.checkSelfPermission(activity, "android.permission.CAMERA") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ActivityCompat.requestPermissions(activity, C51326e.f127820a, 1);
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m199082a(Fragment fragment) {
        boolean z;
        if (ContextCompat.checkSelfPermission(fragment.getContext(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            fragment.requestPermissions(C51326e.f127821b, 3);
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m199085b(Fragment fragment) {
        boolean z;
        if (ContextCompat.checkSelfPermission(fragment.getContext(), "android.permission.CAMERA") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            fragment.requestPermissions(C51326e.f127820a, 1);
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m199081a(Context context, String str) {
        if (ActivityCompat.checkSelfPermission(context, str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m199079a(Activity activity, final AbstractC51324c cVar) {
        new C51331a(activity).mo176924c("android.permission.WRITE_EXTERNAL_STORAGE").subscribe(new Consumer<Boolean>() {
            /* class com.ss.android.lark.permission.C51327f.C513281 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                if (bool.booleanValue()) {
                    cVar.mo49823a();
                } else {
                    cVar.mo49824b();
                }
            }
        });
    }

    /* renamed from: b */
    public static void m199083b(Activity activity, final AbstractC51324c cVar) {
        new C51331a(activity).mo176924c("android.permission.READ_EXTERNAL_STORAGE").subscribe(new Consumer<Boolean>() {
            /* class com.ss.android.lark.permission.C51327f.C513292 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                if (bool.booleanValue()) {
                    cVar.mo49823a();
                } else {
                    cVar.mo49824b();
                }
            }
        });
    }

    /* renamed from: c */
    public static void m199086c(Activity activity, final AbstractC51324c cVar) {
        new C51331a(activity).mo176924c(C51326e.f127823d).subscribe(new Consumer<Boolean>() {
            /* class com.ss.android.lark.permission.C51327f.C513303 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                if (bool.booleanValue()) {
                    cVar.mo49823a();
                } else {
                    cVar.mo49824b();
                }
            }
        });
    }
}
