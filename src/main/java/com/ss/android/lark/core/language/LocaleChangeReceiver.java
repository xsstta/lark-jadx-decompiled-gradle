package com.ss.android.lark.core.language;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.language.service.AbstractC41118a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.Locale;

public class LocaleChangeReceiver extends BroadcastReceiver {

    /* renamed from: a */
    AbstractC41118a f93519a;

    public void onReceive(Context context, Intent intent) {
        if (this.f93519a == null) {
            this.f93519a = C36235a.m142710a().mo148282c();
        }
        if (!"android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            return;
        }
        if (this.f93519a.mo148305h()) {
            System.exit(0);
            return;
        }
        Log.m165379d("LocaleChangeReceiver", "expect locale = " + this.f93519a.mo148297b() + ", curr = " + context.getResources().getConfiguration().locale);
        Locale b = this.f93519a.mo148297b();
        C36235a.m142710a().mo148283d().mo105893a("change_locale_follow_passport", (Application) UIHelper.getContext(), b);
        this.f93519a.mo148292a((Application) UIHelper.getContext(), b);
    }
}
