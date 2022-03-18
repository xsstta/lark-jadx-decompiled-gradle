package com.bytedance.platform.godzilla.common;

import android.util.Log;

public final class Logger {

    /* renamed from: a */
    public static boolean f49590a;

    /* renamed from: b */
    private static Level f49591b = Level.INFO;

    /* renamed from: c */
    private static AbstractC20326f f49592c = new AbstractC20326f() {
        /* class com.bytedance.platform.godzilla.common.Logger.C203181 */

        /* renamed from: a */
        private int m74100a(Level level) {
            int i = C203192.f49593a[level.ordinal()];
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

        @Override // com.bytedance.platform.godzilla.common.AbstractC20326f
        public void println(String str, String str2, Level level) {
            Log.println(m74100a(level), str, str2);
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
    /* renamed from: com.bytedance.platform.godzilla.common.Logger$2 */
    public static /* synthetic */ class C203192 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49593a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.platform.godzilla.common.Logger$Level[] r0 = com.bytedance.platform.godzilla.common.Logger.Level.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.platform.godzilla.common.Logger.C203192.f49593a = r0
                com.bytedance.platform.godzilla.common.Logger$Level r1 = com.bytedance.platform.godzilla.common.Logger.Level.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.platform.godzilla.common.Logger.C203192.f49593a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.platform.godzilla.common.Logger$Level r1 = com.bytedance.platform.godzilla.common.Logger.Level.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.platform.godzilla.common.Logger.C203192.f49593a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.platform.godzilla.common.Logger$Level r1 = com.bytedance.platform.godzilla.common.Logger.Level.WARNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.platform.godzilla.common.Logger.C203192.f49593a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.platform.godzilla.common.Logger$Level r1 = com.bytedance.platform.godzilla.common.Logger.Level.INFO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.godzilla.common.Logger.C203192.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static boolean m74097a() {
        return f49590a;
    }

    /* renamed from: a */
    public static void m74094a(AbstractC20326f fVar) {
        f49592c = fVar;
    }

    /* renamed from: a */
    public static void m74093a(Level level) {
        f49591b = level;
        if (level == Level.DEBUG) {
            f49590a = true;
        }
    }

    /* renamed from: a */
    public static void m74095a(String str, String str2) {
        m74096a(str, str2, Level.ERROR);
    }

    /* renamed from: b */
    public static void m74098b(String str, String str2) {
        m74096a(str, str2, Level.INFO);
    }

    /* renamed from: c */
    public static void m74099c(String str, String str2) {
        m74096a(str, str2, Level.DEBUG);
    }

    /* renamed from: a */
    public static void m74096a(String str, String str2, Level level) {
        if (level.ordinal() >= f49591b.ordinal()) {
            f49592c.println(str, str2, level);
        }
    }
}
