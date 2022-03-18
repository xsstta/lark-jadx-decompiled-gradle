package com.ss.android.lark.badge.shortcutbadger.p1388a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.badge.shortcutbadger.AbstractC29432a;
import com.ss.android.lark.badge.shortcutbadger.ShortcutBadgeException;
import com.ss.android.lark.badge.shortcutbadger.p1389b.C29451a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.badge.shortcutbadger.a.g */
public class C29439g implements AbstractC29432a {
    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public List<String> mo104316a() {
        return Collections.singletonList("com.htc.launcher");
    }

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public void mo104317a(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        boolean z;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        boolean z2 = false;
        try {
            C29451a.m108406b(context, intent);
            z = true;
        } catch (ShortcutBadgeException unused) {
            z = false;
        }
        try {
            C29451a.m108406b(context, intent2);
            z2 = true;
        } catch (ShortcutBadgeException unused2) {
        }
        if (!z && !z2) {
            throw new ShortcutBadgeException("unable to resolve intent: " + intent2.toString());
        }
    }
}
