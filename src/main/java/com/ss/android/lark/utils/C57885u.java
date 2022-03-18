package com.ss.android.lark.utils;

import com.larksuite.component.ui.toast.C25707a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.utils.u */
public class C57885u {

    /* renamed from: a */
    private static C25707a f142506a;

    /* renamed from: a */
    public static void m224659a() {
        UICallbackExecutor.execute($$Lambda$u$6oOE2LNBrel5oQuaXYIKXDtm2Ec.INSTANCE);
    }

    /* renamed from: b */
    public static void m224660b() {
        UICallbackExecutor.execute($$Lambda$u$yqn2WqMiGv40tuAMjpgSzZw8UxQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m224661c() {
        C25707a aVar = f142506a;
        if (aVar != null) {
            aVar.mo90181a();
            f142506a = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m224662d() {
        if (f142506a == null) {
            f142506a = LKUIToast.newGlobal(UIHelper.getContext(), UIHelper.getString(R.string.Lark_Legacy_LoadingNow));
        }
        f142506a.mo90186a(R.drawable.loading_ic, LKUIToast.getRotateAnimation());
        f142506a.mo90191c();
    }
}
