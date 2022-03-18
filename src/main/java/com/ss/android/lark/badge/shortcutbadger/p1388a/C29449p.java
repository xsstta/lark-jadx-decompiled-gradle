package com.ss.android.lark.badge.shortcutbadger.p1388a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.lark.badge.shortcutbadger.AbstractC29432a;
import com.ss.android.lark.badge.shortcutbadger.ShortcutBadgeException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.badge.shortcutbadger.a.p */
public class C29449p implements AbstractC29432a {

    /* renamed from: a */
    private static final Uri f73559a = Uri.parse("content://com.android.badge/badge");

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public List<String> mo104316a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public void mo104317a(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(f73559a, "setAppBadgeCount", (String) null, bundle);
    }
}
