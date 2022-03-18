package com.ss.android.lark.badge.shortcutbadger.p1388a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.ss.android.lark.badge.shortcutbadger.AbstractC29432a;
import com.ss.android.lark.badge.shortcutbadger.ShortcutBadgeException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.badge.shortcutbadger.a.n */
public class C29447n implements AbstractC29432a {

    /* renamed from: a */
    private static final Uri f73558a = Uri.parse("content://com.yandex.launcher.badges_external");

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public List<String> mo104316a() {
        return Collections.singletonList("com.yandex.launcher");
    }

    /* renamed from: a */
    public static boolean m108392a(Context context) {
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                context.getContentResolver().call(f73558a, "", (String) null, (Bundle) null);
                return true;
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public void mo104317a(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putString("class", componentName.getClassName());
        bundle.putString("package", componentName.getPackageName());
        bundle.putString("badges_count", String.valueOf(i));
        if (Build.VERSION.SDK_INT >= 11) {
            context.getContentResolver().call(f73558a, "setBadgeNumber", (String) null, bundle);
        }
    }
}
