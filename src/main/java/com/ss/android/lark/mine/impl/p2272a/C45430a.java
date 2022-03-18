package com.ss.android.lark.mine.impl.p2272a;

import android.content.Context;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;

/* renamed from: com.ss.android.lark.mine.impl.a.a */
public class C45430a extends AbstractC29186b {
    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return false;
    }

    @Override // com.ss.android.lark.applink.AbstractC29186b
    /* renamed from: a */
    public boolean mo103460a(Context context, AppLink appLink) {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        return true;
    }

    /* renamed from: a */
    private void m180464a(Context context) {
        C45421b.m180420a().mo133466y().mo133475a(context);
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        if (context == null) {
            return false;
        }
        String a = appLink.mo103435a();
        Log.m165389i("SettingAppLinkHandler", "handle:" + a);
        m180464a(context);
        return true;
    }
}
