package com.bytedance.platform.horae.common;

import android.util.Log;

public final class Logger {

    /* renamed from: a */
    private static Level f49718a = Level.INFO;

    /* renamed from: b */
    private static AbstractC20375f f49719b = new AbstractC20375f() {
        /* class com.bytedance.platform.horae.common.Logger.C203681 */

        /* renamed from: a */
        private int m74208a(Level level) {
            int i = C203692.f49720a[level.ordinal()];
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 6;
            }
            if (i == 3) {
                return 5;
            }
            if (i != 4) {
                return 2;
            }
            return 4;
        }

        @Override // com.bytedance.platform.horae.common.AbstractC20375f
        /* renamed from: a */
        public void mo68708a(String str, String str2, Level level) {
            Log.println(m74208a(level), str, str2);
        }

        @Override // com.bytedance.platform.horae.common.AbstractC20375f
        /* renamed from: a */
        public void mo68709a(String str, String str2, Level level, boolean z) {
            Log.println(m74208a(level), str, str2);
        }
    };

    public enum Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR,
        NONE
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.platform.horae.common.Logger$2 */
    public static /* synthetic */ class C203692 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49720a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.platform.horae.common.Logger$Level[] r0 = com.bytedance.platform.horae.common.Logger.Level.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.platform.horae.common.Logger.C203692.f49720a = r0
                com.bytedance.platform.horae.common.Logger$Level r1 = com.bytedance.platform.horae.common.Logger.Level.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.platform.horae.common.Logger.C203692.f49720a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.platform.horae.common.Logger$Level r1 = com.bytedance.platform.horae.common.Logger.Level.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.platform.horae.common.Logger.C203692.f49720a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.platform.horae.common.Logger$Level r1 = com.bytedance.platform.horae.common.Logger.Level.WARNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.platform.horae.common.Logger.C203692.f49720a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.platform.horae.common.Logger$Level r1 = com.bytedance.platform.horae.common.Logger.Level.INFO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.horae.common.Logger.C203692.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m74201a(String str, String str2) {
        m74202a(str, str2, Level.ERROR);
    }

    /* renamed from: b */
    public static void m74205b(String str, String str2) {
        m74202a(str, str2, Level.WARNING);
    }

    /* renamed from: c */
    public static void m74206c(String str, String str2) {
        m74202a(str, str2, Level.INFO);
    }

    /* renamed from: d */
    public static void m74207d(String str, String str2) {
        m74202a(str, str2, Level.DEBUG);
    }

    /* renamed from: a */
    public static void m74204a(boolean z, String str, String str2) {
        m74203a(str, str2, Level.ERROR, z);
    }

    /* renamed from: a */
    public static void m74202a(String str, String str2, Level level) {
        if (level.ordinal() >= f49718a.ordinal()) {
            f49719b.mo68708a(str, str2, level);
        }
    }

    /* renamed from: a */
    public static void m74203a(String str, String str2, Level level, boolean z) {
        if (!z) {
            m74202a(str, str2, level);
        } else if (level.ordinal() >= f49718a.ordinal()) {
            f49719b.mo68709a(str, str2, level, z);
        }
    }
}
