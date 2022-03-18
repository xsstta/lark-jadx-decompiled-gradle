package com.ss.android.lark.badge.shortcutbadger.p1388a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.ss.android.lark.badge.shortcutbadger.AbstractC29432a;
import com.ss.android.lark.badge.shortcutbadger.ShortcutBadgeException;
import com.ss.android.lark.badge.shortcutbadger.p1389b.C29451a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.badge.shortcutbadger.a.d */
public class C29436d implements AbstractC29432a {
    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public List<String> mo104316a() {
        return Arrays.asList("fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo104318a(Context context) {
        if (C29451a.m108405a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE")).size() > 0 || (Build.VERSION.SDK_INT >= 26 && C29451a.m108405a(context, new Intent("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE")).size() > 0)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public void mo104317a(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        C29451a.m108407c(context, intent);
    }
}
