package com.ss.lark.android.avatar.ui;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.permission.C51326e;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.widget.photo_picker.C58557a;
import io.reactivex.functions.Consumer;

/* renamed from: com.ss.lark.android.avatar.ui.k */
public class C64251k {
    /* renamed from: a */
    public static void m252693a(Context context, Fragment fragment) {
        m252694a(context, fragment, 233);
    }

    /* renamed from: b */
    public static void m252697b(final Context context, final Fragment fragment) {
        C51331a aVar = new C51331a((Activity) context);
        boolean z = false;
        if (aVar.mo176921a(C51326e.f127820a[0]) && aVar.mo176921a(C51326e.f127820a[1])) {
            z = true;
        }
        if (!z) {
            aVar.mo176924c(C51326e.f127820a).subscribe(new Consumer<Boolean>() {
                /* class com.ss.lark.android.avatar.ui.C64251k.C642521 */

                /* renamed from: a */
                public void accept(Boolean bool) throws Exception {
                    if (bool.booleanValue()) {
                        C64251k.m252693a(context, fragment);
                    }
                }
            });
        } else {
            m252693a(context, fragment);
        }
    }

    /* renamed from: a */
    public static void m252694a(Context context, Fragment fragment, int i) {
        C58557a.m227127a().mo198520e(1).mo198509a(false).mo198512a(context, fragment, i);
    }

    /* renamed from: a */
    public static void m252696a(final Context context, final Fragment fragment, final String str) {
        C51331a aVar = new C51331a((Activity) context);
        boolean z = false;
        if (aVar.mo176921a(C51326e.f127824e[0]) && aVar.mo176921a(C51326e.f127824e[1])) {
            z = true;
        }
        if (!z) {
            aVar.mo176924c(C51326e.f127824e).subscribe(new Consumer<Boolean>() {
                /* class com.ss.lark.android.avatar.ui.C64251k.C642543 */

                /* renamed from: a */
                public void accept(Boolean bool) throws Exception {
                    if (bool.booleanValue()) {
                        C64251k.m252695a(context, fragment, 233, str);
                    }
                }
            });
        } else {
            m252695a(context, fragment, 233, str);
        }
    }

    /* renamed from: b */
    public static void m252698b(final Context context, final Fragment fragment, final int i) {
        C51331a aVar = new C51331a((Activity) context);
        boolean z = false;
        if (aVar.mo176921a(C51326e.f127820a[0]) && aVar.mo176921a(C51326e.f127820a[1])) {
            z = true;
        }
        if (!z) {
            aVar.mo176924c(C51326e.f127820a).subscribe(new Consumer<Boolean>() {
                /* class com.ss.lark.android.avatar.ui.C64251k.C642532 */

                /* renamed from: a */
                public void accept(Boolean bool) throws Exception {
                    if (bool.booleanValue()) {
                        C64251k.m252694a(context, fragment, i);
                    }
                }
            });
        } else {
            m252694a(context, fragment, i);
        }
    }

    /* renamed from: a */
    public static void m252695a(Context context, Fragment fragment, int i, String str) {
        C58557a.m227127a().mo198506a(1).mo198526i(false).mo198524g(false).mo198525h(false).mo198529l(false).mo198528k(false).mo198517c(false).mo198507a(str).mo198522f(3).mo198527j(true).mo198512a(context, fragment, i);
    }

    /* renamed from: b */
    public static void m252699b(final Context context, final Fragment fragment, final int i, final String str) {
        C51331a aVar = new C51331a((Activity) context);
        boolean z = false;
        if (aVar.mo176921a(C51326e.f127824e[0]) && aVar.mo176921a(C51326e.f127824e[1])) {
            z = true;
        }
        if (!z) {
            aVar.mo176924c(C51326e.f127824e).subscribe(new Consumer<Boolean>() {
                /* class com.ss.lark.android.avatar.ui.C64251k.C642554 */

                /* renamed from: a */
                public void accept(Boolean bool) throws Exception {
                    if (bool.booleanValue()) {
                        C64251k.m252695a(context, fragment, i, str);
                    }
                }
            });
        } else {
            m252695a(context, fragment, i, str);
        }
    }
}
