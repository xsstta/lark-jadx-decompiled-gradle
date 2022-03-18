package com.ss.video.rtc.engine.utils;

public class GPUUtil {
    private static String glRenderer = "unknown";
    private static String glVendor = "unknown";
    private static boolean initialized;

    public static String getGPURendererFallback() {
        return glRenderer;
    }

    public static String getGPURenderer() {
        if (!initialized) {
            Initialize();
        }
        return glRenderer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001e A[SYNTHETIC, Splitter:B:14:0x001e] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0120 A[Catch:{ Exception -> 0x0154 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void Initialize() {
        /*
        // Method dump skipped, instructions count: 441
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.engine.utils.GPUUtil.Initialize():void");
    }
}
