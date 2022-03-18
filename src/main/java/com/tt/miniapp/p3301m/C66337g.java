package com.tt.miniapp.p3301m;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tt.option.p3396q.AbstractC67670b;

/* renamed from: com.tt.miniapp.m.g */
public class C66337g implements AbstractC67670b {
    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean handleAppbrandDisablePage(Context context, String str) {
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean interceptOpenWebUrl(Context context, String str) {
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public void jumpToWebView(Context context, String str, String str2, boolean z) {
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openCustomerService(Context context, String str) {
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openDocument(Activity activity, String str, String str2) {
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openProfile(Activity activity, String str) {
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openSchema(Context context, String str) {
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openSchema(Context context, String str, String str2) {
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openWebBrowser(Context context, String str, boolean z) {
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public void preHandleIntent(Context context, Intent intent, int i, int i2, String str) {
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean supportCustomerService() {
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean startMiniAppActivity(Context context, Intent intent) {
        context.startActivity(intent);
        return true;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean startMiniAppService(Context context, Intent intent) {
        context.startService(intent);
        return true;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public void overridePendingTransition(Activity activity, int i, int i2, int i3) {
        activity.overridePendingTransition(i, i2);
    }
}
