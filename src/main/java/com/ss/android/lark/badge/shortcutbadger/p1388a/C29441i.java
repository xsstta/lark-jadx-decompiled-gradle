package com.ss.android.lark.badge.shortcutbadger.p1388a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.ss.android.lark.badge.shortcutbadger.AbstractC29432a;
import com.ss.android.lark.badge.shortcutbadger.ShortcutBadgeException;
import com.ss.android.lark.badge.shortcutbadger.p1389b.C29451a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.badge.shortcutbadger.a.i */
public class C29441i implements AbstractC29432a {
    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public List<String> mo104316a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    /* renamed from: a */
    private void m108373a(Context context, int i) throws ShortcutBadgeException {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
        } catch (Throwable unused) {
            throw new ShortcutBadgeException("Unable to execute Badge By Content Provider");
        }
    }

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public void mo104317a(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (Build.VERSION.SDK_INT >= 11) {
            m108373a(context, i);
        } else {
            m108374b(context, componentName, i);
        }
    }

    /* renamed from: b */
    private void m108374b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (i == 0) {
            i = -1;
        }
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        C29451a.m108406b(context, intent);
    }
}
