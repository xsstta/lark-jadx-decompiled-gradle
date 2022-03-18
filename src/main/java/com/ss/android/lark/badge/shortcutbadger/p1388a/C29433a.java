package com.ss.android.lark.badge.shortcutbadger.p1388a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.badge.shortcutbadger.AbstractC29432a;
import com.ss.android.lark.badge.shortcutbadger.ShortcutBadgeException;
import com.ss.android.lark.badge.shortcutbadger.p1389b.C29451a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.badge.shortcutbadger.a.a */
public class C29433a implements AbstractC29432a {
    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public List<String> mo104316a() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public void mo104317a(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i);
        C29451a.m108406b(context, intent);
    }
}
