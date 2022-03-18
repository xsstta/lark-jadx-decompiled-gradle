package com.tt.option.p3396q;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tt.miniapp.p3301m.C66337g;
import com.tt.option.AbstractC67593a;

/* renamed from: com.tt.option.q.a */
public class C67669a extends AbstractC67593a<AbstractC67670b> implements AbstractC67670b {
    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean interceptOpenWebUrl(Context context, String str) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC67670b mo232057b() {
        return new C66337g();
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean supportCustomerService() {
        if (mo234790c()) {
            return ((AbstractC67670b) this.f170423a).supportCustomerService();
        }
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean handleAppbrandDisablePage(Context context, String str) {
        if (mo234790c()) {
            return ((AbstractC67670b) this.f170423a).handleAppbrandDisablePage(context, str);
        }
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openCustomerService(Context context, String str) {
        if (mo234790c()) {
            return ((AbstractC67670b) this.f170423a).openCustomerService(context, str);
        }
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openProfile(Activity activity, String str) {
        if (mo234790c()) {
            return ((AbstractC67670b) this.f170423a).openProfile(activity, str);
        }
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openSchema(Context context, String str) {
        if (mo234790c()) {
            return ((AbstractC67670b) this.f170423a).openSchema(context, str);
        }
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean startMiniAppActivity(Context context, Intent intent) {
        if (mo234790c()) {
            return ((AbstractC67670b) this.f170423a).startMiniAppActivity(context, intent);
        }
        context.startActivity(intent);
        return true;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean startMiniAppService(Context context, Intent intent) {
        if (mo234790c()) {
            return ((AbstractC67670b) this.f170423a).startMiniAppService(context, intent);
        }
        context.startService(intent);
        return true;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openDocument(Activity activity, String str, String str2) {
        if (mo234790c()) {
            return ((AbstractC67670b) this.f170423a).openDocument(activity, str, str2);
        }
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openWebBrowser(Context context, String str, boolean z) {
        if (mo234790c()) {
            return ((AbstractC67670b) this.f170423a).openWebBrowser(context, str, z);
        }
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public boolean openSchema(Context context, String str, String str2) {
        if (mo234790c()) {
            return ((AbstractC67670b) this.f170423a).openSchema(context, str, str2);
        }
        return false;
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public void jumpToWebView(Context context, String str, String str2, boolean z) {
        if (mo234790c()) {
            ((AbstractC67670b) this.f170423a).jumpToWebView(context, str, str2, z);
        }
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public void overridePendingTransition(Activity activity, int i, int i2, int i3) {
        if (mo234790c()) {
            ((AbstractC67670b) this.f170423a).overridePendingTransition(activity, i, i2, i3);
        }
        activity.overridePendingTransition(i, i2);
    }

    @Override // com.tt.option.p3396q.AbstractC67670b
    public void preHandleIntent(Context context, Intent intent, int i, int i2, String str) {
        if (mo234790c()) {
            ((AbstractC67670b) this.f170423a).preHandleIntent(context, intent, i, i2, str);
        }
    }
}
