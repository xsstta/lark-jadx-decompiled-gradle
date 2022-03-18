package com.ss.android.vc.p3074c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;

/* renamed from: com.ss.android.vc.c.d */
public class C60693d extends AbstractC60692c {
    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29186b
    /* renamed from: a */
    public boolean mo103460a(Context context, AppLink appLink) {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29186b
    /* renamed from: a */
    public boolean mo103461a(AppLink appLink) {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.applink.AbstractC29186b
    /* renamed from: b */
    public boolean mo103462b(Context context, AppLink appLink) {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        return true;
    }

    public C60693d(Context context) {
        super(context);
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        if (context == null) {
            context = this.f151821a;
        }
        Uri parse = Uri.parse(appLink.mo103435a());
        String queryParameter = parse.getQueryParameter(ShareHitPoint.f121868c);
        String queryParameter2 = parse.getQueryParameter("action");
        String queryParameter3 = parse.getQueryParameter("id");
        String queryParameter4 = parse.getQueryParameter("role");
        parse.getQueryParameter("num");
        parse.getQueryParameter("web_id");
        parse.getQueryParameter("applink_ru");
        String queryParameter5 = parse.getQueryParameter("preview");
        String queryParameter6 = parse.getQueryParameter("mic");
        String queryParameter7 = parse.getQueryParameter("speaker");
        String queryParameter8 = parse.getQueryParameter("camera");
        String queryParameter9 = parse.getQueryParameter("idtype");
        if (!VideoChatModule.getDependency().getLoginDependency().isLogin()) {
            C60700b.m235851b("VideoChatHandler", "handle", "not login");
        } else if (TextUtils.equals(queryParameter, "interview")) {
            VideoChatModule.m235659c().mo208155b(context, queryParameter3, queryParameter4, true);
        } else if (TextUtils.equals(queryParameter, "calendar")) {
            VideoChatModule.m235659c().mo208138a(context, queryParameter3, "", true);
        } else if (!TextUtils.equals(queryParameter, "openplatform") || !TextUtils.equals(queryParameter9, "reservationid")) {
            VideoChatModule.m235659c().mo208158c(context);
        } else if (TextUtils.equals(queryParameter2, "join")) {
            VideoChatModule.m235659c().mo208140a(context, queryParameter3, TextUtils.equals(queryParameter5, "1"), !TextUtils.equals(queryParameter6, "1"), !TextUtils.equals(queryParameter8, "1"), TextUtils.equals(queryParameter7, "1"));
        } else if (TextUtils.equals(queryParameter2, "call")) {
            VideoChatModule.m235659c().mo208139a(context, queryParameter3, !TextUtils.equals(queryParameter8, "1"));
        }
        return true;
    }
}
