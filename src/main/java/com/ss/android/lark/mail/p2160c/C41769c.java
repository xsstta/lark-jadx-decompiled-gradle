package com.ss.android.lark.mail.p2160c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.C41724a;
import com.ss.android.lark.mail.impl.p2195i.C42699a;

/* renamed from: com.ss.android.lark.mail.c.c */
public class C41769c extends AbstractC29186b {
    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        Log.m165389i("ForwardToSettingAppLinkHandler", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        Log.m165383e("ForwardToSettingAppLinkHandler", "canOpen invalid parameter");
        return false;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        Log.m165389i("ForwardToSettingAppLinkHandler", "handle");
        if (context == null || appLink == null || TextUtils.isEmpty(appLink.mo103435a())) {
            Log.m165383e("ForwardToSettingAppLinkHandler", "handle invalid parameter");
            return false;
        } else if (!C41724a.m165681g()) {
            Log.m165383e("ForwardToSettingAppLinkHandler", "mail tab invisible");
            return true;
        } else {
            C42699a.m170276c(context, Uri.parse(appLink.mo103435a()).getQueryParameter("item"));
            return true;
        }
    }
}
