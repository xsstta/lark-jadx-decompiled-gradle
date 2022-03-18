package com.ss.android.lark.badge.shortcutbadger.p1388a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.badge.shortcutbadger.AbstractC29432a;
import com.ss.android.lark.badge.shortcutbadger.ShortcutBadgeException;
import com.ss.android.lark.badge.shortcutbadger.p1389b.C29451a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.badge.shortcutbadger.a.b */
public class C29434b implements AbstractC29432a {
    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public List<String> mo104316a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public void mo104317a(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", componentName.getClassName());
        C29451a.m108406b(context, intent);
    }
}
