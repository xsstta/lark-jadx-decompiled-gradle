package com.ss.android.lark.badge.shortcutbadger.p1389b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.ss.android.lark.badge.shortcutbadger.ShortcutBadgeException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.badge.shortcutbadger.b.a */
public class C29451a {
    /* renamed from: a */
    public static List<ResolveInfo> m108405a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null) {
            return queryBroadcastReceivers;
        }
        return Collections.emptyList();
    }

    /* renamed from: c */
    public static void m108407c(Context context, Intent intent) throws ShortcutBadgeException {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent2 = new Intent(intent);
            intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
            try {
                m108406b(context, intent2);
                z = true;
            } catch (ShortcutBadgeException unused) {
            }
        }
        if (!z) {
            m108406b(context, intent);
        }
    }

    /* renamed from: b */
    public static void m108406b(Context context, Intent intent) throws ShortcutBadgeException {
        List<ResolveInfo> a = m108405a(context, intent);
        if (a.size() != 0) {
            for (ResolveInfo resolveInfo : a) {
                Intent intent2 = new Intent(intent);
                if (resolveInfo != null) {
                    intent2.setPackage(resolveInfo.resolvePackageName);
                    context.sendBroadcast(intent2);
                }
            }
            return;
        }
        throw new ShortcutBadgeException("unable to resolve intent: " + intent.toString());
    }
}
