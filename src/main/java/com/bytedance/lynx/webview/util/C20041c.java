package com.bytedance.lynx.webview.util;

import android.util.SparseArray;
import com.bytedance.lynx.webview.internal.C19984r;
import com.bytedance.lynx.webview.internal.C19986s;
import com.bytedance.lynx.webview.internal.C20011y;
import com.bytedance.lynx.webview.internal.DownloadEventType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.lynx.webview.util.c */
public class C20041c {

    /* renamed from: a */
    public static AtomicInteger f48973a = new AtomicInteger(0);

    /* renamed from: b */
    private static final int f48974b;

    /* renamed from: c */
    private static final int f48975c;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f48974b = availableProcessors;
        f48975c = availableProcessors + 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.lynx.webview.util.c$a */
    public static class CallableC20042a implements Callable<Boolean> {

        /* renamed from: a */
        private final URL f48976a;

        /* renamed from: b */
        private final RandomAccessFile f48977b;

        /* renamed from: c */
        private final int f48978c;

        /* renamed from: d */
        private final long f48979d;

        /* renamed from: e */
        private final long f48980e;

        /* renamed from: a */
        public Boolean call() {
            try {
                C19984r v = C20011y.m72976a().mo67939v();
                v.mo67813a(this.f48976a.toString(), this.f48978c, false);
                boolean a = C20041c.m73131a(this.f48976a, this.f48979d, this.f48980e, this.f48977b);
                if (a) {
                    C20041c.f48973a.getAndIncrement();
                }
                v.mo67813a(this.f48976a.toString(), this.f48978c, a);
                Boolean valueOf = Boolean.valueOf(a);
                try {
                    this.f48977b.close();
                } catch (IOException e) {
                    C20048g.m73164d("random file close failed", e.toString());
                }
                return valueOf;
            } catch (Exception e2) {
                C20048g.m73164d("call doDownload error=", e2.toString());
                try {
                    this.f48977b.close();
                } catch (IOException e3) {
                    C20048g.m73164d("random file close failed", e3.toString());
                }
                return false;
            } catch (Throwable th) {
                try {
                    this.f48977b.close();
                } catch (IOException e4) {
                    C20048g.m73164d("random file close failed", e4.toString());
                }
                throw th;
            }
        }

        public CallableC20042a(URL url, String str, int i, long j, long j2) throws FileNotFoundException {
            this.f48976a = url;
            this.f48977b = new RandomAccessFile(new File(str), "rwd");
            this.f48978c = i;
            this.f48979d = j;
            this.f48980e = j2;
        }
    }

    /* renamed from: a */
    public static boolean m73128a(String str) {
        C19984r v = C20011y.m72976a().mo67939v();
        boolean a = C19986s.m72924a().mo67858a("sdk_use_app_download_handler", false);
        if (C20011y.m73016n() == null || !a) {
            if (v.mo67833f(str) <= 0) {
                return false;
            }
            int p = v.mo67849p();
            for (int i = 0; i < p; i++) {
                if (!v.mo67818a(str, i)) {
                    return false;
                }
            }
            return true;
        } else if (!v.mo67818a(str, 9999)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    private static boolean m73132b(String str, String str2) {
        C19984r v = C20011y.m72976a().mo67939v();
        v.mo67821b(str, v.mo67849p());
        C20026a.m73084c("");
        long c = m73134c(str, str2);
        C20048g.m73161a("download length", c + "");
        if (c <= 0) {
            C20048g.m73164d("DownloadUtil", "error getLength");
            return false;
        }
        C20026a.m73079a(DownloadEventType.InitDownload_getLength);
        v.mo67814a(str, c);
        return m73130a(str, str2, c);
    }

    /* renamed from: a */
    public static boolean m73129a(String str, String str2) {
        File file = new File(str2);
        C19984r v = C20011y.m72976a().mo67939v();
        long f = v.mo67833f(str);
        int p = v.mo67849p();
        int a = C19986s.m72924a().mo67850a("sdk_download_seg_num", 10);
        if (!file.exists() || !v.mo67832e(str) || f <= 0 || p != a) {
            C20026a.m73079a(DownloadEventType.DownloadByBreakResume_first);
            v.mo67839i();
            if (p != a) {
                v.mo67831e(a);
            }
            return m73132b(str, str2);
        }
        C20026a.m73079a(DownloadEventType.DownloadByBreakResume_not_first);
        C20026a.m73084c(v.mo67848o());
        return m73130a(str, str2, f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0080  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m73134c(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.util.C20041c.m73134c(java.lang.String, java.lang.String):long");
    }

    /* renamed from: a */
    private static boolean m73130a(String str, String str2, long j) {
        boolean z = false;
        boolean a = C19986s.m72924a().mo67858a("sdk_disable_download_thread_pool", false);
        int a2 = C19986s.m72924a().mo67850a("sdk_download_retry_times", 0);
        if (a2 <= 0 || a2 >= 3) {
            a2 = 3;
        }
        int i = 0;
        while (!z && i < a2) {
            if (a) {
                z = m73133b(str, str2, j);
            } else {
                z = m73135c(str, str2, j);
            }
            i++;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0102 A[SYNTHETIC, Splitter:B:51:0x0102] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m73133b(java.lang.String r23, java.lang.String r24, long r25) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.util.C20041c.m73133b(java.lang.String, java.lang.String, long):boolean");
    }

    /* renamed from: c */
    private static boolean m73135c(String str, String str2, long j) {
        long j2;
        URL url;
        SparseArray sparseArray;
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(f48975c);
        C19984r v = C20011y.m72976a().mo67939v();
        int p = v.mo67849p();
        long floor = (long) Math.floor((double) (j / ((long) p)));
        try {
            URL url2 = new URL(str);
            SparseArray sparseArray2 = new SparseArray();
            long j3 = 0;
            int i = 0;
            while (i < p) {
                long j4 = (j3 + floor) - 1;
                if (i == p - 1) {
                    j2 = j;
                } else {
                    j2 = j4;
                }
                if (!v.mo67818a(str, i)) {
                    sparseArray = sparseArray2;
                    url = url2;
                    i = i;
                    sparseArray.put(i, newFixedThreadPool.submit(new CallableC20042a(url2, str2, i, j3, j2)));
                } else {
                    sparseArray = sparseArray2;
                    url = url2;
                }
                j3 = j2 + 1;
                i++;
                sparseArray2 = sparseArray;
                url2 = url;
            }
            boolean z = true;
            for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
                z &= ((Boolean) ((Future) sparseArray2.valueAt(i2)).get(60, TimeUnit.SECONDS)).booleanValue();
            }
            if (newFixedThreadPool != null) {
                try {
                    newFixedThreadPool.shutdown();
                    if (!newFixedThreadPool.awaitTermination(60, TimeUnit.SECONDS)) {
                        newFixedThreadPool.shutdownNow();
                    }
                } catch (Throwable th) {
                    C20048g.m73164d("close threadPool error", th.toString());
                }
            }
            C20026a.m73078a(f48973a.get());
            return z;
        } catch (MalformedURLException e) {
            C20048g.m73164d("download url error", e.toString());
            if (newFixedThreadPool != null) {
                newFixedThreadPool.shutdown();
                if (!newFixedThreadPool.awaitTermination(60, TimeUnit.SECONDS)) {
                    newFixedThreadPool.shutdownNow();
                }
            }
        } catch (FileNotFoundException e2) {
            C20048g.m73164d("download file not found", e2.toString());
            if (newFixedThreadPool != null) {
                newFixedThreadPool.shutdown();
                if (!newFixedThreadPool.awaitTermination(60, TimeUnit.SECONDS)) {
                    newFixedThreadPool.shutdownNow();
                }
            }
        } catch (InterruptedException unused) {
            C20048g.m73164d("download is interrupted");
            if (newFixedThreadPool != null) {
                newFixedThreadPool.shutdown();
                if (!newFixedThreadPool.awaitTermination(60, TimeUnit.SECONDS)) {
                    newFixedThreadPool.shutdownNow();
                }
            }
        } catch (ExecutionException e3) {
            C20048g.m73164d("download execute error", e3.toString());
            if (newFixedThreadPool != null) {
                newFixedThreadPool.shutdown();
                if (!newFixedThreadPool.awaitTermination(60, TimeUnit.SECONDS)) {
                    newFixedThreadPool.shutdownNow();
                }
            }
        } catch (TimeoutException unused2) {
            try {
                C20048g.m73164d("download seg timeout");
                if (newFixedThreadPool != null) {
                    newFixedThreadPool.shutdown();
                    if (!newFixedThreadPool.awaitTermination(60, TimeUnit.SECONDS)) {
                        newFixedThreadPool.shutdownNow();
                    }
                }
            } catch (Throwable th2) {
                C20048g.m73164d("close threadPool error", th2.toString());
            }
        } catch (Throwable th3) {
            C20048g.m73164d("close threadPool error", th3.toString());
        }
        C20026a.m73078a(f48973a.get());
        throw th;
        C20026a.m73078a(f48973a.get());
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1 A[SYNTHETIC, Splitter:B:32:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bc A[SYNTHETIC, Splitter:B:41:0x00bc] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m73131a(java.net.URL r9, long r10, long r12, java.io.RandomAccessFile r14) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.util.C20041c.m73131a(java.net.URL, long, long, java.io.RandomAccessFile):boolean");
    }
}
