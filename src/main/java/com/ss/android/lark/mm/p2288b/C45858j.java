package com.ss.android.lark.mm.p2288b;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.utils.NetworkUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.utils.C47113m;

/* renamed from: com.ss.android.lark.mm.b.j */
public class C45858j {

    /* renamed from: a */
    private static C47113m f115680a = new C47113m(LocationRequest.PRIORITY_HD_ACCURACY);

    /* renamed from: a */
    public static void m181677a(int i) {
        C45899c.m181859a().getUiDepend().mo144658a(C45851c.m181646a(), C45851c.m181646a().getString(i));
    }

    /* renamed from: b */
    public static void m181680b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C45899c.m181859a().getUiDepend().mo144658a(C45851c.m181646a(), str);
        }
    }

    /* renamed from: c */
    public static void m181681c(String str) {
        if (!TextUtils.isEmpty(str)) {
            C45899c.m181859a().getUiDepend().mo144659a(C45851c.m181646a(), str, R.drawable.ud_icon_yes_outlined);
        }
    }

    /* renamed from: d */
    public static void m181682d(String str) {
        if (!TextUtils.isEmpty(str)) {
            C45899c.m181859a().getUiDepend().mo144659a(C45851c.m181646a(), str, R.drawable.ud_icon_more_close_outlined);
        }
    }

    /* renamed from: e */
    public static void m181683e(String str) {
        if (!TextUtils.isEmpty(str)) {
            C45899c.m181859a().getUiDepend().mo144659a(C45851c.m181646a(), str, R.drawable.ud_icon_warning_outlined);
        }
    }

    /* renamed from: a */
    public static void m181679a(String str) {
        f115680a.mo165501a(new Runnable(str) {
            /* class com.ss.android.lark.mm.p2288b.$$Lambda$j$OD5ZXhFabwxlGCVUqStfgkXig9U */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C45858j.m181684f(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m181684f(String str) {
        if (!NetworkUtils.m94915b(C45851c.m181646a())) {
            m181682d(C45851c.m181649b().getString(R.string.MMWeb_G_NoInternetConnectionTryAgainLater));
        } else if (!TextUtils.isEmpty(str)) {
            m181682d(str);
        } else {
            m181682d(C45851c.m181649b().getString(R.string.MMWeb_G_SomethingWentWrongTryAgain_Toast));
        }
    }

    /* renamed from: a */
    public static void m181678a(Context context, String str) {
        C45899c.m181859a().getUiDepend().mo144658a(context, str);
    }
}
