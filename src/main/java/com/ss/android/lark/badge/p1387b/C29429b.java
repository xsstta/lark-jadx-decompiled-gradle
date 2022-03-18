package com.ss.android.lark.badge.p1387b;

import android.app.Notification;
import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.badge.C29424a;
import com.ss.android.lark.badge.shortcutbadger.C29450b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;

/* renamed from: com.ss.android.lark.badge.b.b */
public class C29429b {

    /* renamed from: a */
    private boolean f73546a = RomUtils.m94944c();

    /* renamed from: b */
    private volatile int f73547b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.badge.b.b$a */
    public static final class C29431a {

        /* renamed from: a */
        public static final C29429b f73551a = new C29429b();
    }

    /* renamed from: a */
    public static C29429b m108340a() {
        return C29431a.f73551a;
    }

    /* renamed from: b */
    public int mo104311b() {
        return this.f73547b;
    }

    /* renamed from: d */
    private boolean m108344d() {
        if (C29424a.m108326a() == null) {
            return true;
        }
        return C29424a.m108326a().mo104302a();
    }

    /* renamed from: c */
    public int mo104314c() {
        int i = UserSP.getInstance().getInt("BadgeManager_count", 0) + 1;
        UserSP.getInstance().putInt("BadgeManager_count", i);
        Log.m165383e("BadgeManager", "increaseAndGetBadgeCountBySP " + i);
        return mo104312b(i);
    }

    /* renamed from: a */
    public void mo104307a(int i) {
        if (i < 0) {
            i = 0;
        }
        C29426a.m108335a().mo104303a(i);
    }

    /* renamed from: b */
    public int mo104312b(int i) {
        if (i <= 0) {
            return 0;
        }
        return Math.max(0, Math.min(i, 999));
    }

    /* renamed from: c */
    private void m108343c(int i) {
        Log.m165383e("BadgeManager", "saveBadgeCountBySP " + i);
        UserSP.getInstance().putInt("BadgeManager_count", i);
    }

    /* renamed from: b */
    public void mo104313b(Context context) {
        int d = C29426a.m108335a().mo104306d();
        if (m108344d()) {
            m108342b(context, d);
        } else {
            m108342b(context, 0);
        }
        this.f73547b = d;
    }

    /* renamed from: a */
    public void mo104309a(Context context) {
        if (!C29426a.m108335a().mo104305c()) {
            mo104313b(context);
            C29426a.m108335a().mo104304b();
        }
    }

    /* renamed from: a */
    public void mo104308a(Notification notification, int i) {
        if (m108344d()) {
            m108341b(notification, i);
        } else {
            m108341b(notification, 0);
        }
    }

    /* renamed from: b */
    private void m108341b(Notification notification, int i) {
        if (this.f73546a) {
            try {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(mo104312b(i)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private void m108342b(final Context context, final int i) {
        if (!this.f73546a) {
            Log.m165389i("BadgeManager", "setBadgeCount: " + i);
            m108343c(i);
            if (RomUtils.m94933a()) {
                CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                    /* class com.ss.android.lark.badge.p1387b.C29429b.RunnableC294301 */

                    public void run() {
                        C29450b.m108402a(context, C29429b.this.mo104312b(i));
                    }
                });
            } else {
                C29450b.m108402a(context, mo104312b(i));
            }
        }
    }

    /* renamed from: a */
    public void mo104310a(Context context, int i) {
        if (i < 0) {
            i = 0;
        }
        if (m108344d()) {
            m108342b(context, i);
        } else {
            m108342b(context, 0);
        }
        this.f73547b = i;
    }
}
