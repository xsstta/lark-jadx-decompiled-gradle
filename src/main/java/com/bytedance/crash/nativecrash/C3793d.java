package com.bytedance.crash.nativecrash;

import com.bytedance.crash.C3691b;
import java.io.File;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.nativecrash.d */
public class C3793d {
    /* renamed from: a */
    private static String m15716a(String str) {
        if (str.startsWith("socket:")) {
            return "socket";
        }
        if (str.startsWith("pipe:")) {
            return "pipe";
        }
        if (str.equals("/dev/ashmem")) {
            return "dev-ashmem";
        }
        if (str.startsWith("anon_inode:")) {
            if (str.contains("eventpoll")) {
                return "anon_inode-eventpoll";
            }
            if (str.contains("dmabuf")) {
                return "anon_inode-dmabuf";
            }
            if (str.contains("eventfd")) {
                return "anon_inode-eventfd";
            }
            if (str.contains("inotify")) {
                return "anon_inode-inotify";
            }
            if (str.contains("sync_fence")) {
                return "anon_inode-sync_fence";
            }
            if (str.contains("timerfd")) {
                return "anon_inode-timerfd";
            }
            if (str.contains("malitl")) {
                return "anon_inode-malitl";
            }
        }
        if (str.contains("/mmkv/")) {
            return "mmkv";
        }
        if (str.contains("/dataloader/")) {
            return "dataloader";
        }
        if (str.contains("/app_indicators/")) {
            return "app_indicators";
        }
        String[] split = str.split("/");
        if (split.length > 0) {
            String str2 = split[split.length - 1];
            if (str2.contains(".db")) {
                return "db";
            }
            if (str2.endsWith(".apk")) {
                return "apk";
            }
        }
        if (str.startsWith("/storage")) {
            return "storage";
        }
        return "unknown";
    }

    /* renamed from: a */
    static void m15717a(File file, Map<String, String> map) {
        try {
            m15718b(file, map);
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m15718b(java.io.File r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C3793d.m15718b(java.io.File, java.util.Map):void");
    }
}
