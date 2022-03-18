package com.ss.android.socialbase.downloader.network;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.socialbase.downloader.network.i */
public class C60139i {

    /* renamed from: a */
    private static final String f150072a = "i";

    /* renamed from: b */
    private final C60133c f150073b;

    /* renamed from: c */
    private volatile boolean f150074c;

    /* renamed from: d */
    private final AtomicReference<NetworkQuality> f150075d;

    /* renamed from: e */
    private AtomicReference<NetworkQuality> f150076e;

    /* renamed from: f */
    private final ArrayList<AbstractC60142b> f150077f;

    /* renamed from: g */
    private int f150078g;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.socialbase.downloader.network.i$a */
    public static class C60141a {

        /* renamed from: a */
        public static final C60139i f150080a = new C60139i(null);
    }

    /* renamed from: com.ss.android.socialbase.downloader.network.i$b */
    public interface AbstractC60142b {
        /* renamed from: a */
        void mo205450a(NetworkQuality networkQuality);
    }

    /* renamed from: a */
    public static C60139i m233697a() {
        return C60141a.f150080a;
    }

    /* renamed from: b */
    public synchronized NetworkQuality mo205449b() {
        C60133c cVar = this.f150073b;
        if (cVar == null) {
            return NetworkQuality.UNKNOWN;
        }
        try {
            return m233696a(cVar.mo205446a());
        } catch (Throwable th) {
            th.printStackTrace();
            return NetworkQuality.UNKNOWN;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.socialbase.downloader.network.i$1 */
    public static /* synthetic */ class C601401 {

        /* renamed from: a */
        static final /* synthetic */ int[] f150079a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.socialbase.downloader.network.NetworkQuality[] r0 = com.ss.android.socialbase.downloader.network.NetworkQuality.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.socialbase.downloader.network.C60139i.C601401.f150079a = r0
                com.ss.android.socialbase.downloader.network.NetworkQuality r1 = com.ss.android.socialbase.downloader.network.NetworkQuality.POOR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.socialbase.downloader.network.C60139i.C601401.f150079a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.socialbase.downloader.network.NetworkQuality r1 = com.ss.android.socialbase.downloader.network.NetworkQuality.MODERATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.socialbase.downloader.network.C60139i.C601401.f150079a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.socialbase.downloader.network.NetworkQuality r1 = com.ss.android.socialbase.downloader.network.NetworkQuality.GOOD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.socialbase.downloader.network.C60139i.C601401.f150079a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.socialbase.downloader.network.NetworkQuality r1 = com.ss.android.socialbase.downloader.network.NetworkQuality.EXCELLENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.network.C60139i.C601401.<clinit>():void");
        }
    }

    private C60139i() {
        this.f150073b = new C60133c(0.05d);
        this.f150074c = false;
        this.f150075d = new AtomicReference<>(NetworkQuality.UNKNOWN);
        this.f150077f = new ArrayList<>();
    }

    /* renamed from: d */
    private void m233699d() {
        try {
            int size = this.f150077f.size();
            for (int i = 0; i < size; i++) {
                this.f150077f.get(i).mo205450a(this.f150075d.get());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    private boolean m233698c() {
        if (this.f150073b == null) {
            return false;
        }
        try {
            int i = C601401.f150079a[this.f150075d.get().ordinal()];
            double d = 2000.0d;
            double d2 = 550.0d;
            if (i == 1) {
                d2 = 0.0d;
                d = 150.0d;
            } else if (i == 2) {
                d = 550.0d;
                d2 = 150.0d;
            } else if (i != 3) {
                if (i != 4) {
                    return true;
                }
                d = 3.4028234663852886E38d;
                d2 = 2000.0d;
            }
            double a = this.f150073b.mo205446a();
            if (a > d) {
                if (a > d * 1.25d) {
                    return true;
                }
            } else if (a < d2 * 0.8d) {
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    /* synthetic */ C60139i(C601401 r1) {
        this();
    }

    /* renamed from: a */
    private NetworkQuality m233696a(double d) {
        if (d < 0.0d) {
            return NetworkQuality.UNKNOWN;
        }
        if (d < 150.0d) {
            return NetworkQuality.POOR;
        }
        if (d < 550.0d) {
            return NetworkQuality.MODERATE;
        }
        if (d < 2000.0d) {
            return NetworkQuality.GOOD;
        }
        return NetworkQuality.EXCELLENT;
    }

    /* renamed from: a */
    public synchronized void mo205448a(long j, long j2) {
        double d = ((((double) j) * 1.0d) / ((double) j2)) * 8.0d;
        if (j2 != 0 && d >= 3.0d) {
            try {
                this.f150073b.mo205447a(d);
                NetworkQuality b = mo205449b();
                if (this.f150074c) {
                    this.f150078g++;
                    if (b != this.f150076e.get()) {
                        this.f150074c = false;
                        this.f150078g = 1;
                    }
                    if (((double) this.f150078g) >= 5.0d && m233698c()) {
                        this.f150074c = false;
                        this.f150078g = 1;
                        this.f150075d.set(this.f150076e.get());
                        m233699d();
                    }
                    return;
                }
                if (this.f150075d.get() != b) {
                    this.f150074c = true;
                    this.f150076e = new AtomicReference<>(b);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
