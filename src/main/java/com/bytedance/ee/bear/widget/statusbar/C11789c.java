package com.bytedance.ee.bear.widget.statusbar;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.widget.statusbar.c */
public class C11789c {

    /* renamed from: a */
    static final AbstractC11781a f31682a;

    /* renamed from: b */
    static final Map<Integer, List<AbstractC11791a>> f31683b = new HashMap();

    /* renamed from: com.bytedance.ee.bear.widget.statusbar.c$a */
    public interface AbstractC11791a {
        boolean interceptSetStatusBarColor(Activity activity, int i, boolean z);

        boolean interceptSetSystemUiVisibility(Activity activity, int i);
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f31682a = new C11796h();
        } else if (Build.VERSION.SDK_INT >= 21 && !m48869a()) {
            f31682a = new C11795g();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f31682a = new C11794f();
        } else {
            f31682a = new AbstractC11781a() {
                /* class com.bytedance.ee.bear.widget.statusbar.C11789c.C117901 */

                @Override // com.bytedance.ee.bear.widget.statusbar.AbstractC11781a
                /* renamed from: a */
                public void mo45058a(Window window, int i) {
                }
            };
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042 A[SYNTHETIC, Splitter:B:24:0x0042] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m48869a() {
        /*
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.os.Environment.getRootDirectory()
            java.lang.String r2 = "build.prop"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x004b
            java.util.Properties r1 = new java.util.Properties
            r1.<init>()
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002b }
            r3.<init>(r0)     // Catch:{ Exception -> 0x002b }
            r1.load(r3)     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            r3.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0039
        L_0x0023:
            r0 = move-exception
            r2 = r3
            goto L_0x0040
        L_0x0026:
            r0 = move-exception
            r2 = r3
            goto L_0x002c
        L_0x0029:
            r0 = move-exception
            goto L_0x0040
        L_0x002b:
            r0 = move-exception
        L_0x002c:
            r0.printStackTrace()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0039
            r2.close()
            goto L_0x0039
        L_0x0035:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0039:
            java.lang.String r0 = "ro.build.hw_emui_api_level"
            boolean r0 = r1.containsKey(r0)
            return r0
        L_0x0040:
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r1 = move-exception
            r1.printStackTrace()
        L_0x004a:
            throw r0
        L_0x004b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.widget.statusbar.C11789c.m48869a():boolean");
    }

    /* renamed from: a */
    public static int m48863a(int i) {
        int blue = Color.blue(i);
        return (((Color.red(i) * 38) + (Color.green(i) * 75)) + (blue * 15)) >> 7;
    }

    /* renamed from: a */
    public static void m48864a(Activity activity, int i) {
        boolean z;
        if (m48863a(i) > 225) {
            z = true;
        } else {
            z = false;
        }
        m48865a(activity, i, z);
    }

    /* renamed from: b */
    public static void m48871b(Activity activity, AbstractC11791a aVar) {
        if (activity != null) {
            int hashCode = activity.hashCode();
            Map<Integer, List<AbstractC11791a>> map = f31683b;
            List<AbstractC11791a> list = map.get(Integer.valueOf(hashCode));
            if (list != null) {
                list.remove(aVar);
                if (list.isEmpty()) {
                    map.remove(Integer.valueOf(hashCode));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m48866a(Activity activity, AbstractC11791a aVar) {
        if (activity != null) {
            int hashCode = activity.hashCode();
            Map<Integer, List<AbstractC11791a>> map = f31683b;
            List<AbstractC11791a> list = map.get(Integer.valueOf(hashCode));
            if (list == null) {
                list = new ArrayList<>();
                map.put(Integer.valueOf(hashCode), list);
            }
            list.add(aVar);
        }
    }

    /* renamed from: b */
    public static void m48870b(Activity activity, int i) {
        List<AbstractC11791a> list = f31683b.get(Integer.valueOf(activity.hashCode()));
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size).interceptSetSystemUiVisibility(activity, i)) {
                    return;
                }
            }
        }
        if (!(activity.getWindow() == null || activity.getWindow().getDecorView() == null)) {
            activity.getWindow().getDecorView().setSystemUiVisibility(i);
        }
    }

    /* renamed from: a */
    static void m48868a(Window window, boolean z) {
        View childAt = ((ViewGroup) window.findViewById(16908290)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(z);
        }
    }

    /* renamed from: a */
    public static void m48865a(Activity activity, int i, boolean z) {
        List<AbstractC11791a> list = f31683b.get(Integer.valueOf(activity.hashCode()));
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size).interceptSetStatusBarColor(activity, i, z)) {
                    return;
                }
            }
        }
        m48867a(activity.getWindow(), i, z);
    }

    /* renamed from: a */
    public static void m48867a(Window window, int i, boolean z) {
        if (!C11792d.f31684a) {
            f31682a.mo45058a(window, i);
            C11782b.m48854a(window, z);
        }
    }
}
