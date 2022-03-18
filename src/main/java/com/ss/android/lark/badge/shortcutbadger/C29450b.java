package com.ss.android.lark.badge.shortcutbadger;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29433a;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29434b;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29435c;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29436d;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29437e;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29438f;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29439g;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29440h;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29441i;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29442j;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29443k;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29444l;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29446m;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29447n;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29448o;
import com.ss.android.lark.badge.shortcutbadger.p1388a.C29449p;
import com.ss.android.lark.log.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.lark.badge.shortcutbadger.b */
public final class C29450b {

    /* renamed from: a */
    private static final List<Class<? extends AbstractC29432a>> f73560a;

    /* renamed from: b */
    private static final Object f73561b = new Object();

    /* renamed from: c */
    private static AbstractC29432a f73562c;

    /* renamed from: d */
    private static ComponentName f73563d;

    static {
        LinkedList linkedList = new LinkedList();
        f73560a = linkedList;
        linkedList.add(C29433a.class);
        linkedList.add(C29434b.class);
        linkedList.add(C29436d.class);
        linkedList.add(C29439g.class);
        linkedList.add(C29440h.class);
        linkedList.add(C29444l.class);
        linkedList.add(C29435c.class);
        linkedList.add(C29438f.class);
        linkedList.add(C29441i.class);
        linkedList.add(C29442j.class);
        linkedList.add(C29449p.class);
        linkedList.add(C29446m.class);
        linkedList.add(C29448o.class);
        linkedList.add(C29437e.class);
        linkedList.add(C29447n.class);
        linkedList.add(C29443k.class);
    }

    /* renamed from: a */
    private static boolean m108401a(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.m165383e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f73563d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        Log.m165389i("ShortcutBadger", "resolveInfos: " + queryIntentActivities);
        if (!CollectionUtils.isEmpty(queryIntentActivities)) {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                m108400a(resolveActivity, queryIntentActivities);
            }
            m108399a(context, queryIntentActivities);
        }
        if (f73562c != null) {
            return true;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("HUAWEI") || Build.MANUFACTURER.equalsIgnoreCase("HONOR")) {
            f73562c = new C29438f();
            return true;
        } else if (Build.MANUFACTURER.equalsIgnoreCase("VIVO")) {
            f73562c = new C29446m();
            return true;
        } else if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
            f73562c = new C29441i();
            return true;
        } else if (Build.MANUFACTURER.equalsIgnoreCase("OnePlus")) {
            if (RomUtils.m94948e()) {
                f73562c = new C29436d();
                return true;
            }
            f73562c = new C29441i();
            return true;
        } else if (Build.MANUFACTURER.equalsIgnoreCase("Samsung")) {
            f73562c = new C29442j();
            return true;
        } else if (Build.MANUFACTURER.equalsIgnoreCase("ZUK")) {
            f73562c = new C29449p();
            return true;
        } else if (Build.MANUFACTURER.equalsIgnoreCase("ZTE")) {
            f73562c = new C29448o();
            return true;
        } else if (Build.MANUFACTURER.equalsIgnoreCase("SONY")) {
            f73562c = new C29444l();
            return true;
        } else {
            f73562c = new C29436d();
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m108402a(Context context, int i) {
        try {
            m108404b(context, i);
            return true;
        } catch (ShortcutBadgeException e) {
            Log.m165380d("ShortcutBadger", "Unable to execute badge", e);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m108403a(Context context, String str) {
        if (!"com.yandex.launcher".equals(str)) {
            return true;
        }
        return C29447n.m108392a(context);
    }

    /* renamed from: a */
    private static void m108400a(ResolveInfo resolveInfo, List<ResolveInfo> list) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).activityInfo.packageName.equals(resolveInfo.activityInfo.packageName)) {
                i = i2;
            }
        }
        Collections.swap(list, 0, i);
    }

    /* renamed from: b */
    public static void m108404b(Context context, int i) throws ShortcutBadgeException {
        if (f73562c != null || m108401a(context)) {
            try {
                f73562c.mo104317a(context, f73563d, i);
            } catch (Exception e) {
                throw new ShortcutBadgeException("Unable to execute badge", e);
            }
        } else {
            throw new ShortcutBadgeException("No default launcher available");
        }
    }

    /* renamed from: a */
    private static void m108399a(Context context, List<ResolveInfo> list) {
        for (ResolveInfo resolveInfo : list) {
            String str = resolveInfo.activityInfo.packageName;
            Iterator<Class<? extends AbstractC29432a>> it = f73560a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC29432a aVar = null;
                try {
                    aVar = (AbstractC29432a) it.next().newInstance();
                } catch (Exception e) {
                    Log.m165386e("ShortcutBadger", e);
                }
                if (aVar != null && aVar.mo104316a().contains(str)) {
                    if (m108403a(context, str)) {
                        f73562c = aVar;
                    }
                }
            }
            if (f73562c != null) {
                return;
            }
        }
    }
}
