package com.ss.android.lark.mail.p2160c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.C41724a;

/* renamed from: com.ss.android.lark.mail.c.b */
public class C41768b extends AbstractC29186b {
    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        Log.m165389i("ForwardToInboxAppLinkHandler", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        Log.m165383e("ForwardToInboxAppLinkHandler", "canOpen invalid parameter");
        return false;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        Log.m165389i("ForwardToInboxAppLinkHandler", "handle");
        if (context == null || appLink == null || TextUtils.isEmpty(appLink.mo103435a())) {
            Log.m165383e("ForwardToInboxAppLinkHandler", "handle invalid parameter");
            return false;
        } else if (!C41724a.m165681g()) {
            Log.m165383e("ForwardToInboxAppLinkHandler", "mail tab invisible");
            return true;
        } else {
            Uri parse = Uri.parse(appLink.mo103435a());
            Intent b = C41724a.m165678a().getMainDependency().mo144490b();
            Bundle bundle = new Bundle();
            bundle.putString("mail_account_id", parse.getQueryParameter("account_id"));
            bundle.putString("mail_thread_id", parse.getQueryParameter("thread_id"));
            bundle.putString("mail_message_id", parse.getQueryParameter("message_id"));
            bundle.putString("mail_label_id", parse.getQueryParameter("label_id"));
            b.putExtras(bundle);
            context.startActivity(b);
            return true;
        }
    }
}
