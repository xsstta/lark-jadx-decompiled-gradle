package com.ss.android.lark.feed.service.impl;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.feed.service.impl.a */
public class C38123a {

    /* renamed from: com.ss.android.lark.feed.service.impl.a$a */
    private static class C38125a {

        /* renamed from: a */
        static C38123a f97758a = new C38123a();
    }

    private C38123a() {
    }

    /* renamed from: a */
    public static C38123a m149931a() {
        return C38125a.f97758a;
    }

    /* renamed from: b */
    public void mo139459b() {
        UserSP.getInstance().putLong("notification_close_event", System.currentTimeMillis());
    }

    /* renamed from: c */
    public long mo139460c() {
        return UserSP.getInstance().getLong("notification_close_event", 0);
    }

    /* renamed from: d */
    public void mo139461d() {
        UserSP.getInstance().putLong("invite_banner_dismiss_event", System.currentTimeMillis());
    }

    /* renamed from: e */
    public long mo139462e() {
        return UserSP.getInstance().getLong("invite_banner_dismiss_event");
    }

    /* renamed from: f */
    public boolean mo139463f() {
        return UserSP.getInstance().getBoolean("invite_banner_status", false);
    }

    /* renamed from: a */
    public void mo139457a(boolean z) {
        UserSP.getInstance().putBoolean("invite_banner_status", z);
    }

    /* renamed from: a */
    public boolean mo139458a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return C57823a.m224448a(context).mo196178b(context);
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return false;
        }
        return notificationManager.areNotificationsEnabled();
    }
}
