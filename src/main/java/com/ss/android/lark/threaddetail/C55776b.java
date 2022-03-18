package com.ss.android.lark.threaddetail;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.threaddetail.b */
public class C55776b extends AbstractC29186b {
    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        if (context == null || appLink == null || TextUtils.isEmpty(appLink.mo103435a())) {
            return false;
        }
        String a = appLink.mo103435a();
        Uri parse = Uri.parse(a);
        String queryParameter = parse.getQueryParameter("chatid");
        String queryParameter2 = parse.getQueryParameter("threadid");
        String queryParameter3 = parse.getQueryParameter("thread_position");
        Log.m165389i("ThreadDetailAppLinkHandler", "handle url:" + a + ",threadId:" + queryParameter2 + ",position:" + queryParameter3);
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) {
            return true;
        }
        C29604ae.C29606a aVar = new C29604ae.C29606a();
        aVar.mo106670b(queryParameter2);
        aVar.mo106666a(queryParameter);
        if (!TextUtils.isEmpty(queryParameter3)) {
            aVar.mo106662a(Integer.parseInt(queryParameter3));
        }
        C55831i.m216682a(context, aVar.mo106668a());
        return true;
    }
}
