package com.ss.android.lark.badge.shortcutbadger.p1388a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.lark.badge.shortcutbadger.AbstractC29432a;
import com.ss.android.lark.badge.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.badge.shortcutbadger.a.k */
public class C29443k implements AbstractC29432a {
    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public List<String> mo104316a() {
        return Arrays.asList("com.smartisanos.launcher", "com.smartisanos.home");
    }

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public void mo104317a(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        try {
            Uri parse = Uri.parse("content://com.smartisanos.launcher.badge");
            Bundle bundle = new Bundle();
            bundle.putInt("badge_num", i);
            context.getContentResolver().call(parse, "updateMessageBadge", (String) null, bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
