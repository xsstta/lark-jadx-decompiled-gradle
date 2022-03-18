package com.ss.android.lark.platform.applink.p2474a.p2475a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mira.UIGetPluginCallback;
import com.ss.android.lark.money_export.IMoneyModule;

/* renamed from: com.ss.android.lark.platform.applink.a.a.a */
public class C51712a extends AbstractC29186b {
    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.applink.AbstractC29186b
    /* renamed from: b */
    public boolean mo103462b(Context context, AppLink appLink) {
        return true;
    }

    /* renamed from: a */
    private void m200512a(final Context context, final String str) {
        C36083a.m141486a().getIMDependency().mo132855a((UIGetPluginCallback<IMoneyModule>) new UIGetPluginCallback<IMoneyModule>() {
            /* class com.ss.android.lark.platform.applink.p2474a.p2475a.C51712a.C517131 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccessed(IMoneyModule iMoneyModule) {
                iMoneyModule.openH5(context, str);
            }
        });
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        return !TextUtils.isEmpty(Uri.parse(appLink.mo103435a()).getQueryParameter("openUrl"));
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        if (context == null) {
            Log.m165397w("PayAppLinkHandler", "context null");
            return false;
        }
        String queryParameter = Uri.parse(appLink.mo103435a()).getQueryParameter("openUrl");
        if (TextUtils.isEmpty(queryParameter)) {
            Log.m165397w("PayAppLinkHandler", "openUrl null");
            return false;
        }
        try {
            String str = new String(Base64.decode(queryParameter.replace('_', '/').replace('-', '+'), 0));
            if (TextUtils.isEmpty(str)) {
                Log.m165397w("PayAppLinkHandler", "realUrl null");
                return false;
            }
            m200512a(context, str);
            return true;
        } catch (Exception unused) {
            Log.m165397w("PayAppLinkHandler", "decode Exception");
            return false;
        }
    }
}
