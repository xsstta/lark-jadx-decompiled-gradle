package com.ss.android.lark.inv.export.util;

import android.app.Activity;
import android.view.ViewGroup;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.inv.export.util.s */
public class C40133s {
    /* renamed from: a */
    public static void m159125a(LKUIStatus lKUIStatus) {
        if (lKUIStatus != null) {
            try {
                lKUIStatus.mo89837a();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m159126b(LKUIStatus lKUIStatus) {
        if (lKUIStatus != null) {
            try {
                lKUIStatus.mo89847d();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static LKUIStatus m159123a(Activity activity) {
        return m159124a((ViewGroup) activity.findViewById(16908290));
    }

    /* renamed from: a */
    public static LKUIStatus m159124a(ViewGroup viewGroup) {
        return new LKUIStatus.C25680a(viewGroup).mo89858a(UIHelper.getString(R.string.Lark_Legacy_InLoading)).mo89857a(R.color.transparent).mo89859a();
    }
}
