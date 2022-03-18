package p001a.p002a.p003a.p004a;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import p001a.p002a.p003a.p005b.C0030c;

/* renamed from: a.a.a.a.a */
public class C0000a {

    /* renamed from: a */
    private static final AtomicInteger f6a = new AtomicInteger(1);

    /* renamed from: b */
    private static ExecutorService f7b;

    /* renamed from: c */
    private AbstractC0004d f8c;

    /* renamed from: d */
    private C0005e f9d;

    /* renamed from: e */
    private String f10e;

    /* access modifiers changed from: package-private */
    /* renamed from: a.a.a.a.a$a */
    public class ThreadFactoryC0001a implements ThreadFactory {
        ThreadFactoryC0001a() {
        }

        /* renamed from: a */
        public static Thread m9a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            return m9a(new Thread(null, runnable, "CZL-R-" + C0000a.f6a.getAndIncrement(), 0));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.a.a.a.a$b */
    public class CallableC0002b implements Callable<Integer> {

        /* renamed from: a */
        final /* synthetic */ C0003c f11a;

        /* renamed from: b */
        final /* synthetic */ byte[] f12b;

        CallableC0002b(C0003c cVar, byte[] bArr) {
            this.f11a = cVar;
            this.f12b = bArr;
        }

        /* renamed from: a */
        public Integer call() {
            int a;
            do {
                a = C0000a.this.m1a((C0000a) this.f12b);
                if (a != 2) {
                    return Integer.valueOf(a);
                }
            } while (this.f11a.mo10a());
            return Integer.valueOf(a);
        }
    }

    /* renamed from: a.a.a.a.a$c */
    public static class C0003c {

        /* renamed from: a */
        private final long f14a;

        /* renamed from: b */
        private final TimeUnit f15b;

        /* renamed from: c */
        private final int f16c;

        /* renamed from: d */
        private int f17d = 1;

        public C0003c(long j, TimeUnit timeUnit, int i) {
            this.f14a = j;
            this.f15b = timeUnit;
            this.f16c = i;
        }

        /* renamed from: a */
        public boolean mo10a() {
            try {
                if (this.f17d < this.f16c) {
                    Thread.sleep(this.f15b.toMillis(this.f14a));
                    this.f17d++;
                    return true;
                }
            } catch (Throwable unused) {
            }
            this.f17d++;
            return false;
        }

        public String toString() {
            return "";
        }
    }

    /* renamed from: a.a.a.a.a$d */
    public interface AbstractC0004d {
        /* renamed from: a */
        int mo12a(C0006f fVar);
    }

    /* renamed from: a.a.a.a.a$e */
    public static class C0005e {

        /* renamed from: a */
        public boolean f18a;

        /* renamed from: b */
        public int f19b;

        /* renamed from: c */
        public String f20c;

        /* renamed from: d */
        public String f21d;

        /* renamed from: e */
        public String f22e;

        /* renamed from: f */
        public HostnameVerifier f23f;

        /* renamed from: g */
        public TrustManager[] f24g;
    }

    /* renamed from: a.a.a.a.a$f */
    public static class C0006f {

        /* renamed from: a */
        public final int f25a;

        /* renamed from: b */
        public final byte[] f26b;

        public C0006f(int i, byte[] bArr) {
            this.f25a = i;
            this.f26b = bArr;
        }

        public String toString() {
            return "code : " + this.f25a + ", response  : " + this.f26b;
        }
    }

    public C0000a(C0005e eVar, AbstractC0004d dVar, String str) {
        if (f7b == null) {
            m7b();
        }
        this.f9d = eVar;
        this.f8c = dVar;
        this.f10e = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r5 = r4.f8c.mo12a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r1 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        p001a.p002a.p003a.p005b.C0030c.m49a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r1 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        p001a.p002a.p003a.p005b.C0030c.m49a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r1 != null) goto L_0x0037;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m1a(byte[] r5) {
        /*
            r4 = this;
            r0 = 0
            a.a.a.a.a$e r1 = r4.f9d     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r4.f10e     // Catch:{ all -> 0x002e }
            java.net.HttpURLConnection r1 = m3a(r1, r2)     // Catch:{ all -> 0x002e }
            r4.m5a(r5, r1)     // Catch:{ all -> 0x002e }
            r1.connect()     // Catch:{ all -> 0x002e }
            int r5 = r1.getResponseCode()     // Catch:{ all -> 0x002e }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ Exception -> 0x0018 }
            goto L_0x001c
        L_0x0018:
            java.io.InputStream r1 = r1.getErrorStream()
        L_0x001c:
            byte[] r2 = m6a(r1)     // Catch:{ all -> 0x002f }
            a.a.a.a.a$f r3 = new a.a.a.a.a$f     // Catch:{ all -> 0x002f }
            r3.<init>(r5, r2)     // Catch:{ all -> 0x002f }
            a.a.a.a.a$d r5 = r4.f8c     // Catch:{ all -> 0x002f }
            int r5 = r5.mo12a(r3)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x003f
            goto L_0x0037
        L_0x002e:
            r1 = r0
        L_0x002f:
            a.a.a.a.a$d r5 = r4.f8c     // Catch:{ all -> 0x0040 }
            int r5 = r5.mo12a(r0)     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x003f
        L_0x0037:
            r1.close()     // Catch:{ all -> 0x003b }
            goto L_0x003f
        L_0x003b:
            r0 = move-exception
            p001a.p002a.p003a.p005b.C0030c.m49a(r0)
        L_0x003f:
            return r5
        L_0x0040:
            r5 = move-exception
            if (r1 == 0) goto L_0x004b
            r1.close()     // Catch:{ all -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r0 = move-exception
            p001a.p002a.p003a.p005b.C0030c.m49a(r0)
        L_0x004b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p001a.p002a.p003a.p004a.C0000a.m1a(byte[]):int");
    }

    /* renamed from: a */
    private int m2a(byte[] bArr, C0003c cVar, boolean z) {
        Future submit = f7b.submit(new CallableC0002b(cVar, bArr));
        if (z) {
            return 3;
        }
        try {
            return ((Integer) submit.get()).intValue();
        } catch (Throwable th) {
            C0030c.m49a(th);
            return 3;
        }
    }

    /* renamed from: a */
    private static HttpURLConnection m3a(C0005e eVar, String str) {
        URLConnection uRLConnection;
        StringBuilder sb;
        String str2;
        try {
            URL url = new URL(str);
            if (eVar.f18a) {
                TrustManager[] trustManagerArr = eVar.f24g;
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, trustManagerArr, new SecureRandom());
                HttpsURLConnection.setDefaultSSLSocketFactory(instance.getSocketFactory());
                uRLConnection = url.openConnection(Proxy.NO_PROXY);
            } else {
                uRLConnection = url.openConnection();
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            if ("https".equals(url.getProtocol().toLowerCase())) {
                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(eVar.f23f);
            }
            httpURLConnection.setConnectTimeout(eVar.f19b);
            httpURLConnection.setReadTimeout(eVar.f19b);
            httpURLConnection.setRequestMethod(eVar.f21d);
            httpURLConnection.addRequestProperty("Content-Type", eVar.f20c);
            httpURLConnection.addRequestProperty("Cookie", eVar.f22e);
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                sb = new StringBuilder();
                sb.append(Locale.getDefault().toString());
                sb.append(",");
                sb.append(language);
                str2 = ";q=0.9";
            } else {
                sb = new StringBuilder();
                sb.append(Locale.getDefault().toString());
                sb.append(",");
                sb.append(language);
                str2 = ";q=0.9,en-US;q=0.6,en;q=0.4";
            }
            sb.append(str2);
            httpURLConnection.addRequestProperty("Accept-Language", sb.toString());
            return httpURLConnection;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private void m5a(byte[] bArr, HttpURLConnection httpURLConnection) {
        OutputStream outputStream = null;
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    httpURLConnection.setDoOutput(true);
                    outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(bArr);
                    outputStream.flush();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    outputStream.close();
                }
                throw th;
            }
        }
        if (outputStream != null) {
            outputStream.close();
        }
    }

    /* renamed from: a */
    private static byte[] m6a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: b */
    private static synchronized void m7b() {
        synchronized (C0000a.class) {
            if (f7b == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 5, 60, TimeUnit.SECONDS, new SynchronousQueue());
                threadPoolExecutor.setThreadFactory(new ThreadFactoryC0001a());
                f7b = threadPoolExecutor;
            }
        }
    }

    /* renamed from: a */
    public int mo6a(byte[] bArr, C0003c cVar) {
        return m2a(bArr, cVar, false);
    }
}
