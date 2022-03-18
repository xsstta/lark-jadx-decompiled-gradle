package com.tt.option.p3396q;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.tt.option.q.b */
public interface AbstractC67670b {
    boolean handleAppbrandDisablePage(Context context, String str);

    boolean interceptOpenWebUrl(Context context, String str);

    void jumpToWebView(Context context, String str, String str2, boolean z);

    boolean openCustomerService(Context context, String str);

    boolean openDocument(Activity activity, String str, String str2);

    boolean openProfile(Activity activity, String str);

    boolean openSchema(Context context, String str);

    boolean openSchema(Context context, String str, String str2);

    boolean openWebBrowser(Context context, String str, boolean z);

    void overridePendingTransition(Activity activity, int i, int i2, int i3);

    void preHandleIntent(Context context, Intent intent, int i, int i2, String str);

    boolean startMiniAppActivity(Context context, Intent intent);

    boolean startMiniAppService(Context context, Intent intent);

    boolean supportCustomerService();
}
