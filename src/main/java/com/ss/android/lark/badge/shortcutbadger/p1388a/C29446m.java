package com.ss.android.lark.badge.shortcutbadger.p1388a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.ss.android.lark.badge.shortcutbadger.AbstractC29432a;
import com.ss.android.lark.badge.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.badge.shortcutbadger.a.m */
public class C29446m implements AbstractC29432a {
    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public List<String> mo104316a() {
        return Arrays.asList("com.vivo.launcher");
    }

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public void mo104317a(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i);
        if (Build.VERSION.SDK_INT >= 26) {
            intent.addFlags(16777216);
        }
        context.sendBroadcast(intent);
    }
}
