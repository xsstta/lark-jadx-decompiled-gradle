package com.ss.android.lark.mail.p2160c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.C41724a;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import java.util.ArrayList;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.c.a */
public class C41767a extends AbstractC29186b {
    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    C41767a() {
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        Log.m165389i("ForwardToChatAppLinkHandler", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        Log.m165383e("ForwardToChatAppLinkHandler", "canOpen invalid parameter");
        return false;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        Log.m165389i("ForwardToChatAppLinkHandler", "handle");
        if (context == null || appLink == null || TextUtils.isEmpty(appLink.mo103435a())) {
            Log.m165383e("ForwardToChatAppLinkHandler", "handle invalid parameter");
            return false;
        }
        Uri parse = Uri.parse(appLink.mo103435a());
        String queryParameter = parse.getQueryParameter("cardId");
        C42699a.m170236a(context, queryParameter, parse.getQueryParameter("ownerId"), parse.getQueryParameter("threadId"), (ArrayList<Integer>) null);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message_card_id", queryParameter);
            C41724a.m165678a().getMetricsDependency().mo144495b("email_send2chat_click", jSONObject);
            return true;
        } catch (Exception e) {
            Log.m165384e("ForwardToChatAppLinkHandler", "handle", e);
            return true;
        }
    }
}
