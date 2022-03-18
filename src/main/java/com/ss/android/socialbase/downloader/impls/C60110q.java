package com.ss.android.socialbase.downloader.impls;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.C59996b;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.p3024a.C59986a;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.setting.C60148a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.impls.q */
public class C60110q implements Handler.Callback, C59986a.AbstractC59988a {

    /* renamed from: e */
    private static volatile C60110q f149938e;

    /* renamed from: a */
    public final Context f149939a = C60046b.m232945G();

    /* renamed from: b */
    public final SparseArray<C60115a> f149940b = new SparseArray<>();

    /* renamed from: c */
    public int f149941c = 0;

    /* renamed from: d */
    public ConnectivityManager f149942d;

    /* renamed from: f */
    private final Handler f149943f = new Handler(Looper.getMainLooper(), this);

    /* renamed from: g */
    private final boolean f149944g;

    /* renamed from: h */
    private long f149945h;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.socialbase.downloader.impls.q$a */
    public static class C60115a {

        /* renamed from: a */
        final int f149953a;

        /* renamed from: b */
        final int f149954b;

        /* renamed from: c */
        final int f149955c;

        /* renamed from: d */
        final int f149956d;

        /* renamed from: e */
        final int f149957e;

        /* renamed from: f */
        final boolean f149958f;

        /* renamed from: g */
        final int[] f149959g;

        /* renamed from: h */
        public int f149960h;

        /* renamed from: i */
        public boolean f149961i;

        /* renamed from: j */
        public boolean f149962j;

        /* renamed from: k */
        private int f149963k;

        /* renamed from: l */
        private long f149964l;

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo204974d() {
            return this.f149963k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo204973c() {
            this.f149963k = this.f149956d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo204969a() {
            this.f149963k += this.f149957e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo204972b() {
            this.f149960h++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo204970a(long j) {
            this.f149964l = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo204971a(long j, int i, int i2, boolean z) {
            if (!this.f149962j) {
                C59990a.m232839c("RetryScheduler", "canRetry: mIsWaitingRetry is false, return false!!!");
                return false;
            } else if (this.f149954b < i || this.f149960h >= this.f149955c) {
                return false;
            } else {
                if (this.f149961i && i2 != 2) {
                    return false;
                }
                if (z || j - this.f149964l >= ((long) this.f149956d)) {
                    return true;
                }
                return false;
            }
        }

        C60115a(int i, int i2, int i3, int i4, int i5, boolean z, int[] iArr) {
            i4 = i4 < 20000 ? 20000 : i4;
            i5 = i5 < 20000 ? 20000 : i5;
            this.f149953a = i;
            this.f149954b = i2;
            this.f149955c = i3;
            this.f149956d = i4;
            this.f149957e = i5;
            this.f149958f = z;
            this.f149959g = iArr;
            this.f149963k = i4;
        }
    }

    @Override // com.ss.android.socialbase.downloader.p3024a.C59986a.AbstractC59988a
    /* renamed from: a */
    public void mo204277a() {
        mo204959a(4, false);
    }

    @Override // com.ss.android.socialbase.downloader.p3024a.C59986a.AbstractC59988a
    /* renamed from: b */
    public void mo204278b() {
        mo204959a(3, false);
    }

    /* renamed from: d */
    public void mo204961d() {
        mo204959a(2, false);
    }

    /* renamed from: e */
    public void mo204962e() {
        mo204959a(5, false);
    }

    /* renamed from: c */
    public static C60110q m233537c() {
        if (f149938e == null) {
            synchronized (C60110q.class) {
                if (f149938e == null) {
                    f149938e = new C60110q();
                }
            }
        }
        return f149938e;
    }

    /* renamed from: g */
    private void m233540g() {
        if (C60148a.m233727c().mo205470a("use_network_callback", 0) == 1) {
            C60046b.m233001k().execute(new Runnable() {
                /* class com.ss.android.socialbase.downloader.impls.C60110q.RunnableC601111 */

                public void run() {
                    try {
                        if (C60110q.this.f149939a != null && Build.VERSION.SDK_INT >= 21) {
                            C60110q qVar = C60110q.this;
                            qVar.f149942d = (ConnectivityManager) qVar.f149939a.getApplicationContext().getSystemService("connectivity");
                            C60110q.this.f149942d.registerNetworkCallback(new NetworkRequest.Builder().build(), new ConnectivityManager.NetworkCallback() {
                                /* class com.ss.android.socialbase.downloader.impls.C60110q.RunnableC601111.C601121 */

                                public void onAvailable(Network network) {
                                    C59990a.m232838b("RetryScheduler", "network onAvailable: ");
                                    C60110q.this.mo204959a(1, true);
                                }
                            });
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private C60110q() {
        m233540g();
        this.f149944g = C60161d.m233802c();
        C59986a.m232821a().mo204266a(this);
    }

    /* renamed from: f */
    public int mo204963f() {
        try {
            if (this.f149942d == null) {
                this.f149942d = (ConnectivityManager) this.f149939a.getApplicationContext().getSystemService("connectivity");
            }
            NetworkInfo activeNetworkInfo = this.f149942d.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getType() == 1) {
                        return 2;
                    }
                    return 1;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* renamed from: c */
    private void m233538c(int i) {
        synchronized (this.f149940b) {
            this.f149940b.remove(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo204957a(final int i) {
        C60046b.m233001k().execute(new Runnable() {
            /* class com.ss.android.socialbase.downloader.impls.C60110q.RunnableC601143 */

            public void run() {
                try {
                    C60110q qVar = C60110q.this;
                    qVar.mo204958a(i, qVar.mo204963f(), true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    private int[] m233534a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length <= 0) {
                return null;
            }
            int[] iArr = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                iArr[i] = Integer.parseInt(split[i]);
            }
            return iArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private C60115a m233535b(int i) {
        C60115a aVar = this.f149940b.get(i);
        if (aVar == null) {
            synchronized (this.f149940b) {
                aVar = this.f149940b.get(i);
                if (aVar == null) {
                    aVar = m233539d(i);
                }
                this.f149940b.put(i, aVar);
            }
        }
        return aVar;
    }

    public boolean handleMessage(Message message) {
        boolean z;
        if (message.what == 0) {
            int i = message.arg1;
            if (message.arg2 == 1) {
                z = true;
            } else {
                z = false;
            }
            m233536b(i, z);
        } else {
            C59990a.m232839c("RetryScheduler", "handleMessage, doSchedulerRetry, id = " + message.what);
            mo204957a(message.what);
        }
        return true;
    }

    /* renamed from: d */
    private C60115a m233539d(int i) {
        int[] iArr;
        int i2;
        int i3;
        C60148a a = C60148a.m233720a(i);
        int a2 = a.mo205470a("retry_schedule", 0);
        JSONObject d = a.mo205477d("retry_schedule_config");
        int i4 = 60;
        if (d != null) {
            int optInt = d.optInt("max_count", 60);
            int optInt2 = d.optInt("interval_sec", 60);
            int optInt3 = d.optInt("interval_sec_acceleration", 60);
            iArr = m233534a(d.optString("allow_error_code"));
            i3 = optInt3;
            i2 = optInt;
            i4 = optInt2;
        } else {
            iArr = null;
            i3 = 60;
            i2 = 60;
        }
        return new C60115a(i, a2, i2, i4 * 1000, i3 * 1000, false, iArr);
    }

    /* renamed from: a */
    public void mo204960a(DownloadInfo downloadInfo) {
        boolean z;
        if (downloadInfo != null && !TextUtils.isEmpty(C59996b.f149579a) && C59996b.f149579a.equals(downloadInfo.getMimeType())) {
            if (downloadInfo.isOnlyWifi() || downloadInfo.isPauseReserveOnWifi()) {
                z = true;
            } else {
                z = false;
            }
            m233531a(downloadInfo, z, mo204963f());
        }
    }

    /* renamed from: b */
    private void m233536b(final int i, final boolean z) {
        C60046b.m233001k().execute(new Runnable() {
            /* class com.ss.android.socialbase.downloader.impls.C60110q.RunnableC601132 */

            public void run() {
                int f;
                try {
                    if (C60110q.this.f149941c > 0 && (f = C60110q.this.mo204963f()) != 0) {
                        C59990a.m232839c("RetryScheduler", "doScheduleAllTaskRetry: mWaitingRetryTasksCount = " + C60110q.this.f149941c);
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList<C60115a> arrayList = new ArrayList();
                        synchronized (C60110q.this.f149940b) {
                            for (int i = 0; i < C60110q.this.f149940b.size(); i++) {
                                C60115a valueAt = C60110q.this.f149940b.valueAt(i);
                                if (valueAt != null && valueAt.mo204971a(currentTimeMillis, i, f, z)) {
                                    if (z) {
                                        valueAt.mo204973c();
                                    }
                                    arrayList.add(valueAt);
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            for (C60115a aVar : arrayList) {
                                C60110q.this.mo204958a(aVar.f149953a, f, false);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    /* renamed from: a */
    private boolean m233532a(C60115a aVar, int i) {
        int[] iArr = aVar.f149959g;
        if (!(iArr == null || iArr.length == 0)) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        com.ss.android.socialbase.downloader.p3025b.C59990a.m232839c("RetryScheduler", "scheduleAllTaskRetry, level = [" + r8 + "], force = [" + r9 + "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r9 == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r7.f149943f.removeMessages(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r1 = android.os.Message.obtain();
        r1.what = 0;
        r1.arg1 = r8;
        r1.arg2 = r9 ? 1 : 0;
        r7.f149943f.sendMessageDelayed(r1, 2000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo204959a(int r8, boolean r9) {
        /*
            r7 = this;
            int r0 = r7.f149941c
            if (r0 > 0) goto L_0x0005
            return
        L_0x0005:
            long r0 = java.lang.System.currentTimeMillis()
            monitor-enter(r7)
            if (r9 != 0) goto L_0x0018
            long r2 = r7.f149945h     // Catch:{ all -> 0x0058 }
            long r2 = r0 - r2
            r4 = 20000(0x4e20, double:9.8813E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0018
            monitor-exit(r7)     // Catch:{ all -> 0x0058 }
            return
        L_0x0018:
            r7.f149945h = r0     // Catch:{ all -> 0x0058 }
            monitor-exit(r7)     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "RetryScheduler"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "scheduleAllTaskRetry, level = ["
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = "], force = ["
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.p3025b.C59990a.m232839c(r0, r1)
            r0 = 0
            if (r9 == 0) goto L_0x0046
            android.os.Handler r1 = r7.f149943f
            r1.removeMessages(r0)
        L_0x0046:
            android.os.Message r1 = android.os.Message.obtain()
            r1.what = r0
            r1.arg1 = r8
            r1.arg2 = r9
            android.os.Handler r8 = r7.f149943f
            r2 = 2000(0x7d0, double:9.88E-321)
            r8.sendMessageDelayed(r1, r2)
            return
        L_0x0058:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.C60110q.mo204959a(int, boolean):void");
    }

    /* renamed from: a */
    private boolean m233533a(DownloadInfo downloadInfo, BaseException baseException) {
        long j;
        long j2;
        try {
            j = C60161d.m233798c(downloadInfo.getTempPath());
        } catch (BaseException e) {
            e.printStackTrace();
            j = 0;
        }
        if (baseException instanceof DownloadOutOfSpaceException) {
            j2 = ((DownloadOutOfSpaceException) baseException).getRequiredSpaceBytes();
        } else {
            j2 = downloadInfo.getTotalBytes() - downloadInfo.getCurBytes();
        }
        if (j < j2) {
            C60148a a = C60148a.m233720a(downloadInfo.getId());
            if (a.mo205470a("space_fill_part_download", 0) == 1) {
                if (j > 0) {
                    int a2 = a.mo205470a("space_fill_min_keep_mb", 100);
                    if (a2 > 0) {
                        long j3 = j - (((long) a2) * 1048576);
                        C59990a.m232839c("RetryScheduler", "retry schedule: available = " + C60161d.m233741a(j) + "MB, minKeep = " + a2 + "MB, canDownload = " + C60161d.m233741a(j3) + "MB");
                        if (j3 <= 0) {
                            C59990a.m232840d("RetryScheduler", "doSchedulerRetryInSubThread: canDownload <= 0 , canRetry = false !!!!");
                            return false;
                        }
                    }
                } else if (a.mo205470a("download_when_space_negative", 0) != 1) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m233531a(DownloadInfo downloadInfo, boolean z, int i) {
        BaseException failedException = downloadInfo.getFailedException();
        if (failedException != null) {
            C60115a b = m233535b(downloadInfo.getId());
            if (b.f149960h > b.f149955c) {
                C59990a.m232840d("RetryScheduler", "tryStartScheduleRetry, id = " + b.f149953a + ", mRetryCount = " + b.f149960h + ", maxCount = " + b.f149955c);
                return;
            }
            int errorCode = failedException.getErrorCode();
            if (!C60161d.m233822g(failedException) && !C60161d.m233823h(failedException) && (!downloadInfo.statusInPause() || !downloadInfo.isPauseReserveOnWifi())) {
                if (m233532a(b, errorCode)) {
                    C59990a.m232839c("RetryScheduler", "allow error code, id = " + b.f149953a + ", error code = " + errorCode);
                } else {
                    return;
                }
            }
            b.f149961i = z;
            synchronized (this.f149940b) {
                if (!b.f149962j) {
                    b.f149962j = true;
                    this.f149941c++;
                }
            }
            int d = b.mo204974d();
            C59990a.m232839c("RetryScheduler", "tryStartScheduleRetry: id = " + b.f149953a + ", delayTimeMills = " + d + ", mWaitingRetryTasks = " + this.f149941c);
            if (!z) {
                this.f149943f.removeMessages(downloadInfo.getId());
                this.f149943f.sendEmptyMessageDelayed(downloadInfo.getId(), (long) d);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        com.ss.android.socialbase.downloader.p3025b.C59990a.m232839c("RetryScheduler", "doSchedulerRetryInSubThread: downloadId = " + r9 + ", retryCount = " + r2.f149960h + ", mWaitingRetryTasksCount = " + r8.f149941c);
        r1 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r0).getDownloadInfo(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (r1 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        m233538c(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        com.ss.android.socialbase.downloader.p3025b.C59990a.m232841e("RetryScheduler", "doSchedulerRetryInSubThread，id:" + r9);
        r3 = r1.getRealStatus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        if (r3 == -3) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r3 != -4) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        if (r3 == -5) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (r3 != -2) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (r1.isPauseReserveOnWifi() == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r3 == -1) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        if (r10 != 0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        if (r2.f149958f == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
        r6 = r1.getFailedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a0, code lost:
        if (r3 == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        if (com.ss.android.socialbase.downloader.utils.C60161d.m233822g(r6) == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a8, code lost:
        r3 = m233533a(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        r2.mo204972b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00af, code lost:
        if (r3 == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
        com.ss.android.socialbase.downloader.p3025b.C59990a.m232839c("RetryScheduler", "doSchedulerRetry: restart task, ****** id = " + r2.f149953a);
        r2.mo204970a(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        if (r11 == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d2, code lost:
        r2.mo204969a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d5, code lost:
        r1.setRetryScheduleCount(r2.f149960h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00de, code lost:
        if (r1.getStatus() != -1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e0, code lost:
        com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r0).restart(r1.getId());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ec, code lost:
        if (r11 == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ee, code lost:
        r2.mo204969a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f5, code lost:
        if (r1.isOnlyWifi() != false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        if (r1.isPauseReserveOnWifi() == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fe, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ff, code lost:
        m233531a(r1, r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0104, code lost:
        if (r3 != -2) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0106, code lost:
        r11 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.C60046b.m232945G()).getReserveWifiStatusListener();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0112, code lost:
        if (r11 == null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0114, code lost:
        r11.mo204837a(r1, 4, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0118, code lost:
        r11 = com.ss.android.socialbase.downloader.downloader.C60046b.m233009s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011c, code lost:
        if (r11 == null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011e, code lost:
        r11.mo204773a(java.util.Collections.singletonList(r1), 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0125, code lost:
        m233538c(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0128, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0129, code lost:
        m233538c(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo204958a(int r9, int r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.C60110q.mo204958a(int, int, boolean):void");
    }
}
