package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AFExecutor {

    /* renamed from: ι */
    private static AFExecutor f6710;

    /* renamed from: ı */
    Executor f6711;

    /* renamed from: ǃ */
    final ThreadFactory f6712 = new ThreadFactoryC19774((byte) 0);

    /* renamed from: ɩ */
    ScheduledExecutorService f6713;

    /* renamed from: Ι */
    ScheduledExecutorService f6714;

    /* renamed from: com.appsflyer.AFExecutor$4 */
    public class ThreadFactoryC19774 implements ThreadFactory {
        public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        /* renamed from: com.appsflyer.AFExecutor$4$2 */
        public class RunnableC19782 implements Runnable {

            /* renamed from: ǃ */
            private /* synthetic */ Runnable f6715;

            RunnableC19782() {
            }

            public final void run() {
                TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                this.f6715.run();
            }

            RunnableC19782(Runnable runnable) {
                this.f6715 = runnable;
            }

            /* renamed from: ǃ */
            public static String m8716(String str) {
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-1");
                    instance.reset();
                    instance.update(str.getBytes("UTF-8"));
                    return m8718(instance.digest());
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Error turning ");
                    sb.append(str.substring(0, 6));
                    sb.append(".. to SHA1");
                    AFLogger.afErrorLog(sb.toString(), e);
                    return null;
                }
            }

            /* renamed from: ɩ */
            public static String m8717(String str) {
                try {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.reset();
                    instance.update(str.getBytes("UTF-8"));
                    return m8718(instance.digest());
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Error turning ");
                    sb.append(str.substring(0, 6));
                    sb.append(".. to MD5");
                    AFLogger.afErrorLog(sb.toString(), e);
                    return null;
                }
            }

            /* renamed from: ɩ */
            private static String m8718(byte[] bArr) {
                Formatter formatter = new Formatter();
                int length = bArr.length;
                for (int i = 0; i < length; i++) {
                    formatter.format("%02x", Byte.valueOf(bArr[i]));
                }
                String obj = formatter.toString();
                formatter.close();
                return obj;
            }

            /* renamed from: ι */
            public static String m8719(String str) {
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    instance.update(str.getBytes());
                    byte[] digest = instance.digest();
                    StringBuilder sb = new StringBuilder();
                    for (byte b : digest) {
                        sb.append(Integer.toString((b & 255) + DynamicModule.f58006b, 16).substring(1));
                    }
                    return sb.toString();
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder("Error turning ");
                    sb2.append(str.substring(0, 6));
                    sb2.append(".. to SHA-256");
                    AFLogger.afErrorLog(sb2.toString(), e);
                    return null;
                }
            }
        }

        ThreadFactoryC19774() {
        }

        /* renamed from: Ι */
        static boolean m8712() {
            if ("OPPO".equals(Build.BRAND)) {
                return true;
            }
            return false;
        }

        ThreadFactoryC19774(byte b) {
        }

        public final Thread newThread(Runnable runnable) {
            return new_insert_after_java_lang_Thread_by_knot(new Thread(new RunnableC19782(runnable)));
        }

        /* renamed from: Ι */
        public static boolean m8713(Context context, Intent intent) {
            if (context.getPackageManager().queryIntentServices(intent, 0).size() > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: ι */
        public static boolean m8715(Context context, String str) {
            int checkSelfPermission = ContextCompat.checkSelfPermission(context, str);
            StringBuilder sb = new StringBuilder("is Permission Available: ");
            sb.append(str);
            sb.append("; res: ");
            sb.append(checkSelfPermission);
            AFLogger.afRDLog(sb.toString());
            if (checkSelfPermission == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: ι */
        static Map<String, String> m8714(Context context, Map<String, String> map, Uri uri) {
            boolean z;
            String str;
            String str2;
            int i;
            if (uri.getQuery() != null) {
                String[] split = uri.getQuery().split(ContainerUtils.FIELD_DELIMITER);
                z = false;
                for (String str3 : split) {
                    int indexOf = str3.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                    if (indexOf > 0) {
                        str = str3.substring(0, indexOf);
                    } else {
                        str = str3;
                    }
                    if (!map.containsKey(str)) {
                        if (str.equals(C60375c.f150914a)) {
                            str = "campaign";
                        } else if (str.equals("pid")) {
                            str = "media_source";
                        } else if (str.equals("af_prt")) {
                            z = true;
                            str = "agency";
                        }
                        map.put(str, "");
                    }
                    if (indexOf <= 0 || str3.length() <= (i = indexOf + 1)) {
                        str2 = null;
                    } else {
                        str2 = str3.substring(i);
                    }
                    map.put(str, str2);
                }
            } else {
                z = false;
            }
            try {
                if (!map.containsKey("install_time")) {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                    long j = packageInfo.firstInstallTime;
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    map.put("install_time", simpleDateFormat.format(new Date(j)));
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("Could not fetch install time. ", e);
            }
            if (uri.getQueryParameter("af_deeplink") != null && !map.containsKey("af_status")) {
                map.put("af_status", "Non-organic");
            }
            if (z) {
                map.remove("media_source");
            }
            String path = uri.getPath();
            if (path != null) {
                map.put("path", path);
            }
            String scheme = uri.getScheme();
            if (scheme != null) {
                map.put("scheme", scheme);
            }
            String host = uri.getHost();
            if (host != null) {
                map.put("host", host);
            }
            return map;
        }
    }

    private AFExecutor() {
    }

    public static AFExecutor getInstance() {
        if (f6710 == null) {
            f6710 = new AFExecutor();
        }
        return f6710;
    }

    public Executor getThreadPoolExecutor() {
        boolean z;
        Executor executor = this.f6711;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.f6711).isTerminated() || ((ThreadPoolExecutor) this.f6711).isTerminating()))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f6711 = Executors.newFixedThreadPool(2, this.f6712);
        }
        return this.f6711;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı */
    public final ScheduledThreadPoolExecutor mo9890() {
        boolean z;
        ScheduledExecutorService scheduledExecutorService = this.f6714;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.f6714.isTerminated()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f6714 = Executors.newScheduledThreadPool(2, this.f6712);
        }
        return (ScheduledThreadPoolExecutor) this.f6714;
    }

    /* renamed from: ǃ */
    static void m8710(ExecutorService executorService) {
        try {
            AFLogger.afRDLog("shut downing executor ...");
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            AFLogger.afRDLog("InterruptedException!!!");
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
            throw th;
        }
    }
}
