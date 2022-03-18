package com.bytedance.ee.bear.widget.statusbar;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.widget.statusbar.b */
public class C11782b {

    /* renamed from: a */
    private static final AbstractC11785a f31680a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.widget.statusbar.b$a */
    public interface AbstractC11785a {
        /* renamed from: a */
        void mo45059a(Window window, boolean z);
    }

    /* renamed from: com.bytedance.ee.bear.widget.statusbar.b$b */
    private static class C11786b implements AbstractC11785a {
        private C11786b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[SYNTHETIC, Splitter:B:21:0x003f] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0046 A[SYNTHETIC, Splitter:B:27:0x0046] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static boolean m48858a() {
            /*
                r0 = 0
                r1 = 0
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0043, all -> 0x003c }
                java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0043, all -> 0x003c }
                java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch:{ IOException -> 0x0043, all -> 0x003c }
                java.lang.String r5 = "build.prop"
                r3.<init>(r4, r5)     // Catch:{ IOException -> 0x0043, all -> 0x003c }
                r2.<init>(r3)     // Catch:{ IOException -> 0x0043, all -> 0x003c }
                java.util.Properties r1 = new java.util.Properties     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
                r1.<init>()     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
                r1.load(r2)     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
                java.lang.String r3 = "ro.miui.ui.version.code"
                java.lang.String r3 = r1.getProperty(r3)     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
                if (r3 != 0) goto L_0x0032
                java.lang.String r3 = "ro.miui.ui.version.name"
                java.lang.String r3 = r1.getProperty(r3)     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
                if (r3 != 0) goto L_0x0032
                java.lang.String r3 = "ro.miui.internal.storage"
                java.lang.String r1 = r1.getProperty(r3)     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
                if (r1 == 0) goto L_0x0033
            L_0x0032:
                r0 = 1
            L_0x0033:
                r2.close()     // Catch:{ IOException -> 0x0036 }
            L_0x0036:
                return r0
            L_0x0037:
                r0 = move-exception
                r1 = r2
                goto L_0x003d
            L_0x003a:
                r1 = r2
                goto L_0x0044
            L_0x003c:
                r0 = move-exception
            L_0x003d:
                if (r1 == 0) goto L_0x0042
                r1.close()     // Catch:{ IOException -> 0x0042 }
            L_0x0042:
                throw r0
            L_0x0043:
            L_0x0044:
                if (r1 == 0) goto L_0x0049
                r1.close()     // Catch:{ IOException -> 0x0049 }
            L_0x0049:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.widget.statusbar.C11782b.C11786b.m48858a():boolean");
        }

        @Override // com.bytedance.ee.bear.widget.statusbar.C11782b.AbstractC11785a
        /* renamed from: a */
        public void mo45059a(Window window, boolean z) {
            int i;
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
                Object[] objArr = new Object[2];
                if (z) {
                    i = i2;
                } else {
                    i = 0;
                }
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(i2);
                method.invoke(window, objArr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.widget.statusbar.b$c */
    private static class C11787c implements AbstractC11785a {
        private C11787c() {
        }

        @Override // com.bytedance.ee.bear.widget.statusbar.C11782b.AbstractC11785a
        /* renamed from: a */
        public void mo45059a(Window window, boolean z) {
            int i;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility | 8192;
            } else {
                i = systemUiVisibility & -8193;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    /* renamed from: com.bytedance.ee.bear.widget.statusbar.b$d */
    private static class C11788d implements AbstractC11785a {
        private C11788d() {
        }

        /* renamed from: a */
        static boolean m48861a() {
            return Build.DISPLAY.startsWith("Flyme");
        }

        @Override // com.bytedance.ee.bear.widget.statusbar.C11782b.AbstractC11785a
        /* renamed from: a */
        public void mo45059a(Window window, boolean z) {
            int i;
            WindowManager.LayoutParams attributes = window.getAttributes();
            try {
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i2 = declaredField.getInt(null);
                int i3 = declaredField2.getInt(attributes);
                if (z) {
                    i = i3 | i2;
                } else {
                    i = (~i2) & i3;
                }
                declaredField2.setInt(attributes, i);
                window.setAttributes(attributes);
                declaredField.setAccessible(false);
                declaredField2.setAccessible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        if (C11786b.m48858a()) {
            if (Build.VERSION.SDK_INT >= 23) {
                f31680a = new C11787c() {
                    /* class com.bytedance.ee.bear.widget.statusbar.C11782b.C117831 */

                    /* renamed from: a */
                    private final AbstractC11785a f31681a = new C11786b();

                    @Override // com.bytedance.ee.bear.widget.statusbar.C11782b.C11787c, com.bytedance.ee.bear.widget.statusbar.C11782b.AbstractC11785a
                    /* renamed from: a */
                    public void mo45059a(Window window, boolean z) {
                        super.mo45059a(window, z);
                        this.f31681a.mo45059a(window, z);
                    }
                };
            } else {
                f31680a = new C11786b();
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            f31680a = new C11787c();
        } else if (C11788d.m48861a()) {
            f31680a = new C11788d();
        } else {
            f31680a = new AbstractC11785a() {
                /* class com.bytedance.ee.bear.widget.statusbar.C11782b.C117842 */

                @Override // com.bytedance.ee.bear.widget.statusbar.C11782b.AbstractC11785a
                /* renamed from: a */
                public void mo45059a(Window window, boolean z) {
                }
            };
        }
    }

    /* renamed from: a */
    static void m48854a(Window window, boolean z) {
        f31680a.mo45059a(window, z);
    }
}
