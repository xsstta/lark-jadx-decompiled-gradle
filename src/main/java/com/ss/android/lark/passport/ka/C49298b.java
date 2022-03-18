package com.ss.android.lark.passport.ka;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.passport.infra.service.ServiceFinder;

/* renamed from: com.ss.android.lark.passport.ka.b */
public class C49298b {

    /* renamed from: a */
    private static C49298b f123753a;

    /* renamed from: b */
    public void mo171923b() {
        ServiceFinder.m193752g().exitH5Service();
    }

    /* renamed from: a */
    public static C49298b m194253a() {
        if (f123753a == null) {
            synchronized (C49298b.class) {
                if (f123753a == null) {
                    f123753a = new C49298b();
                }
            }
        }
        return f123753a;
    }

    /* renamed from: a */
    public void mo171922a(Context context, String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("u", str);
        bundle.putBoolean("inl", false);
        bundle.putBoolean("isLoginUrl", z);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("ua", str2);
        }
        ServiceFinder.m193752g().openH5Url(context, bundle);
    }
}
