package com.ss.android.lark.mm.utils;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.mm.depend.C45899c;

/* renamed from: com.ss.android.lark.mm.utils.q */
public class C47117q {
    /* renamed from: a */
    public static void m186583a(View view) {
        if (view != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                if (C45899c.m181859a().getHostDepend().mo144643k()) {
                    throw new IllegalStateException("can't perform add child on child thread");
                }
            } else if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
        }
    }
}
