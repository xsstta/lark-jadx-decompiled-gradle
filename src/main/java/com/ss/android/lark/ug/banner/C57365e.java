package com.ss.android.lark.ug.banner;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.banner.C29452a;
import com.ss.android.lark.banner.p1393d.AbstractC29471a;
import com.ss.android.lark.platform.applink.C51707a;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.ug.banner.e */
public class C57365e {

    /* renamed from: a */
    public static volatile C29452a f141227a;

    /* renamed from: a */
    public static C29452a m222366a() {
        if (f141227a == null) {
            synchronized (C57365e.class) {
                if (f141227a == null) {
                    f141227a = new C29452a(m222367a(LarkContext.getApplication()));
                }
            }
        }
        return f141227a;
    }

    /* renamed from: a */
    private static AbstractC29471a m222367a(final Context context) {
        return new AbstractC29471a() {
            /* class com.ss.android.lark.ug.banner.C57365e.C573661 */

            @Override // com.ss.android.lark.banner.p1393d.AbstractC29471a
            /* renamed from: a */
            public Context mo104360a() {
                return context;
            }

            @Override // com.ss.android.lark.banner.p1393d.AbstractC29471a
            /* renamed from: a */
            public void mo104361a(String str) {
                C51707a.m200495a().mo103471b(context, str, 0);
            }

            @Override // com.ss.android.lark.banner.p1393d.AbstractC29471a
            /* renamed from: c */
            public void mo104363c(String str) {
                BrowserModuleProvider.m200667a().mo106842a(context, str);
            }

            @Override // com.ss.android.lark.banner.p1393d.AbstractC29471a
            /* renamed from: b */
            public boolean mo104362b(String str) {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return C51707a.m200495a().mo103470a(Uri.parse(str));
            }
        };
    }
}
