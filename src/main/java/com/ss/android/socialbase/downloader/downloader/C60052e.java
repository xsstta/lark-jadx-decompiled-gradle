package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.AsyncHandleStatus;
import com.ss.android.socialbase.downloader.constants.ByteInvalidRetryStatus;
import com.ss.android.socialbase.downloader.constants.C59997c;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.constants.RetryDelayStatus;
import com.ss.android.socialbase.downloader.depend.AbstractC60026d;
import com.ss.android.socialbase.downloader.depend.AbstractC60027e;
import com.ss.android.socialbase.downloader.depend.AbstractC60035m;
import com.ss.android.socialbase.downloader.depend.AbstractC60041s;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException;
import com.ss.android.socialbase.downloader.impls.AbstractC60081a;
import com.ss.android.socialbase.downloader.impls.C60110q;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.p3026c.C59992a;
import com.ss.android.socialbase.downloader.setting.C60148a;
import com.ss.android.socialbase.downloader.utils.C60160c;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ss.android.socialbase.downloader.downloader.e */
public class C60052e {

    /* renamed from: a */
    public static final String f149769a = "e";

    /* renamed from: b */
    public DownloadInfo f149770b;

    /* renamed from: c */
    public final AbstractC60059i f149771c;

    /* renamed from: d */
    private final boolean f149772d;

    /* renamed from: e */
    private final Handler f149773e;

    /* renamed from: f */
    private DownloadTask f149774f;

    /* renamed from: g */
    private SparseArray<IDownloadListener> f149775g;

    /* renamed from: h */
    private SparseArray<IDownloadListener> f149776h;

    /* renamed from: i */
    private SparseArray<IDownloadListener> f149777i;

    /* renamed from: j */
    private boolean f149778j;

    /* renamed from: k */
    private volatile long f149779k;

    /* renamed from: l */
    private final AtomicLong f149780l = new AtomicLong();

    /* renamed from: m */
    private boolean f149781m = false;

    /* renamed from: n */
    private int f149782n;

    /* renamed from: o */
    private long f149783o;

    /* renamed from: p */
    private AbstractC60027e f149784p;

    /* renamed from: q */
    private AbstractC60035m f149785q;

    /* renamed from: c */
    public void mo204734c() {
        mo204726a(-4, (BaseException) null);
    }

    /* renamed from: k */
    private void m233087k() {
        ExecutorService k = C60046b.m233001k();
        if (k != null) {
            k.execute(new Runnable() {
                /* class com.ss.android.socialbase.downloader.downloader.C60052e.RunnableC600531 */

                public void run() {
                    C60052e.this.f149771c.OnDownloadTaskPrepare(C60052e.this.f149770b.getId());
                    C60052e.this.mo204726a(1, (BaseException) null);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo204725a() {
        if (!this.f149770b.canSkipStatusHandler()) {
            this.f149770b.setStatus(1);
            m233087k();
        }
    }

    /* renamed from: e */
    public void mo204736e() {
        this.f149770b.setStatus(-7);
        try {
            this.f149771c.OnDownloadTaskIntercept(this.f149770b.getId());
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
        mo204726a(-7, (BaseException) null);
    }

    /* renamed from: i */
    public void mo204740i() {
        this.f149770b.setStatus(8);
        this.f149770b.setAsyncHandleStatus(AsyncHandleStatus.ASYNC_HANDLE_WAITING);
        AbstractC60081a x = C60046b.m233014x();
        if (x != null) {
            x.mo204898a(this.f149770b.getId(), 8);
        }
    }

    /* renamed from: j */
    private void m233086j() {
        DownloadTask downloadTask = this.f149774f;
        if (downloadTask != null) {
            this.f149770b = downloadTask.getDownloadInfo();
            this.f149775g = this.f149774f.getDownloadListeners(ListenerType.MAIN);
            this.f149777i = this.f149774f.getDownloadListeners(ListenerType.NOTIFICATION);
            this.f149776h = this.f149774f.getDownloadListeners(ListenerType.SUB);
            this.f149784p = this.f149774f.getDepend();
            this.f149785q = this.f149774f.getMonitorDepend();
        }
    }

    /* renamed from: l */
    private void m233088l() throws BaseException {
        AbstractC60026d downloadCompleteHandler = this.f149774f.getDownloadCompleteHandler();
        if (downloadCompleteHandler != null) {
            try {
                DownloadInfo downloadInfo = this.f149770b;
                if (downloadCompleteHandler.mo204508b(downloadInfo)) {
                    mo204726a(11, (BaseException) null);
                    this.f149771c.updateDownloadInfo(downloadInfo);
                    downloadCompleteHandler.mo204507a(downloadInfo);
                    this.f149771c.updateDownloadInfo(downloadInfo);
                }
            } catch (BaseException e) {
                throw e;
            } catch (Throwable th) {
                throw new BaseException(1071, th);
            }
        }
    }

    /* renamed from: d */
    public void mo204735d() {
        this.f149770b.setStatus(-2);
        try {
            this.f149771c.OnDownloadTaskPause(this.f149770b.getId(), this.f149770b.getCurBytes());
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
        mo204726a(-2, (BaseException) null);
    }

    /* renamed from: g */
    public void mo204738g() {
        try {
            C59990a.m232838b(f149769a, "saveFileAsTargetName onSuccess");
            try {
                m233088l();
                this.f149770b.setFirstSuccess(false);
                mo204726a(-3, (BaseException) null);
                this.f149771c.OnDownloadTaskCompleted(this.f149770b.getId(), this.f149770b.getTotalBytes());
                this.f149771c.removeAllDownloadChunk(this.f149770b.getId());
            } catch (BaseException e) {
                mo204728a(e);
            }
        } catch (Throwable th) {
            mo204728a(new BaseException(1008, C60161d.m233788b(th, "onCompleted")));
        }
    }

    /* renamed from: h */
    public void mo204739h() throws BaseException {
        if (this.f149772d) {
            m233088l();
            C59990a.m232838b(f149769a, "onCompleteForFileExist");
            mo204726a(-3, (BaseException) null);
            this.f149771c.OnDownloadTaskCompleted(this.f149770b.getId(), this.f149770b.getTotalBytes());
            this.f149771c.removeAllDownloadChunk(this.f149770b.getId());
            this.f149771c.updateDownloadInfo(this.f149770b);
            return;
        }
        m233088l();
        C59990a.m232838b(f149769a, "onCompleteForFileExist");
        mo204726a(-3, (BaseException) null);
        this.f149771c.OnDownloadTaskCompleted(this.f149770b.getId(), this.f149770b.getTotalBytes());
        this.f149771c.removeAllDownloadChunk(this.f149770b.getId());
    }

    /* renamed from: b */
    public void mo204733b() {
        if (this.f149770b.canSkipStatusHandler()) {
            this.f149770b.changeSkipStatus();
            return;
        }
        this.f149771c.onDownloadTaskStart(this.f149770b.getId());
        if (this.f149770b.isFirstDownload()) {
            mo204726a(6, (BaseException) null);
        }
        mo204726a(2, (BaseException) null);
    }

    /* renamed from: f */
    public void mo204737f() {
        this.f149770b.setFirstDownload(false);
        if (!this.f149770b.isIgnoreDataVerify() && this.f149770b.getCurBytes() != this.f149770b.getTotalBytes()) {
            C59990a.m232838b(f149769a, this.f149770b.getErrorBytesLog());
            mo204728a(new DownloadRetryNeedlessException(1027, "current bytes is not equals to total bytes, bytes changed with process : " + this.f149770b.getByteInvalidRetryStatus()));
        } else if (this.f149770b.getCurBytes() <= 0) {
            C59990a.m232838b(f149769a, this.f149770b.getErrorBytesLog());
            mo204728a(new DownloadRetryNeedlessException(1026, "curBytes is 0, bytes changed with process : " + this.f149770b.getByteInvalidRetryStatus()));
        } else if (this.f149770b.isIgnoreDataVerify() || this.f149770b.getTotalBytes() > 0) {
            String str = f149769a;
            C59990a.m232838b(str, "" + this.f149770b.getName() + " onCompleted start save file as target name");
            AbstractC60035m mVar = this.f149785q;
            DownloadTask downloadTask = this.f149774f;
            if (downloadTask != null) {
                mVar = downloadTask.getMonitorDepend();
            }
            if (this.f149770b.isNewSaveTempFileEnable()) {
                C60161d.m233760a(this.f149770b, mVar, new AbstractC60041s() {
                    /* class com.ss.android.socialbase.downloader.downloader.C60052e.C600542 */

                    @Override // com.ss.android.socialbase.downloader.depend.AbstractC60041s
                    /* renamed from: a */
                    public void mo204528a() {
                        C60052e.this.mo204738g();
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.AbstractC60041s
                    /* renamed from: a */
                    public void mo204529a(BaseException baseException) {
                        String str;
                        String str2 = C60052e.f149769a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveFileAsTargetName onFailed : ");
                        if (baseException != null) {
                            str = baseException.getErrorMessage();
                        } else {
                            str = "";
                        }
                        sb.append(str);
                        C59990a.m232838b(str2, sb.toString());
                        C60052e.this.mo204728a(baseException);
                    }
                });
            } else {
                C60161d.m233761a(this.f149770b, new AbstractC60041s() {
                    /* class com.ss.android.socialbase.downloader.downloader.C60052e.C600553 */

                    @Override // com.ss.android.socialbase.downloader.depend.AbstractC60041s
                    /* renamed from: a */
                    public void mo204528a() {
                        C60052e.this.mo204738g();
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.AbstractC60041s
                    /* renamed from: a */
                    public void mo204529a(BaseException baseException) {
                        String str;
                        String str2 = C60052e.f149769a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveFileAsTargetName onFailed : ");
                        if (baseException != null) {
                            str = baseException.getErrorMessage();
                        } else {
                            str = "";
                        }
                        sb.append(str);
                        C59990a.m232838b(str2, sb.toString());
                        C60052e.this.mo204728a(baseException);
                    }
                });
            }
        } else {
            C59990a.m232838b(f149769a, this.f149770b.getErrorBytesLog());
            mo204728a(new DownloadRetryNeedlessException(1044, "TotalBytes is 0, bytes changed with process : " + this.f149770b.getByteInvalidRetryStatus()));
        }
    }

    /* renamed from: a */
    public void mo204728a(BaseException baseException) {
        this.f149770b.setFirstDownload(false);
        m233082b(baseException);
    }

    /* renamed from: b */
    private boolean m233084b(long j) {
        boolean z = true;
        if (!this.f149781m) {
            this.f149781m = true;
            return true;
        }
        long j2 = j - this.f149779k;
        if (this.f149780l.get() < this.f149783o && j2 < ((long) this.f149782n)) {
            z = false;
        }
        if (z) {
            this.f149779k = j;
            this.f149780l.set(0);
        }
        return z;
    }

    /* renamed from: c */
    private BaseException m233085c(BaseException baseException) {
        Context G;
        int i;
        if (C60148a.m233720a(this.f149770b.getId()).mo205470a("download_failed_check_net", 0) != 1 || !C60161d.m233823h(baseException) || (G = C60046b.m232945G()) == null || C60161d.m233793b(G)) {
            return baseException;
        }
        if (this.f149770b.isOnlyWifi()) {
            i = 1013;
        } else {
            i = 1049;
        }
        return new BaseException(i, baseException.getErrorMessage());
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m233082b(com.ss.android.socialbase.downloader.exception.BaseException r5) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.C60052e.m233082b(com.ss.android.socialbase.downloader.exception.BaseException):void");
    }

    /* renamed from: a */
    public void mo204731a(String str) throws BaseException {
        String str2 = f149769a;
        C59990a.m232838b(str2, "onCompleteForFileExist existTargetFileName is " + str + " but curName is " + this.f149770b.getName());
        if (this.f149772d) {
            C60161d.m233762a(this.f149770b, str);
            m233088l();
            mo204726a(-3, (BaseException) null);
            this.f149771c.updateDownloadInfo(this.f149770b);
            return;
        }
        this.f149771c.updateDownloadInfo(this.f149770b);
        C60161d.m233762a(this.f149770b, str);
        m233088l();
        mo204726a(-3, (BaseException) null);
    }

    /* renamed from: a */
    public boolean mo204732a(long j) {
        this.f149780l.addAndGet(j);
        this.f149770b.increaseCurBytes(j);
        long uptimeMillis = SystemClock.uptimeMillis();
        return m233081a(uptimeMillis, m233084b(uptimeMillis));
    }

    /* renamed from: a */
    public void mo204726a(int i, BaseException baseException) {
        m233080a(i, baseException, true);
    }

    /* renamed from: b */
    private void m233083b(BaseException baseException, boolean z) {
        int i;
        this.f149771c.OnDownloadTaskRetry(this.f149770b.getId());
        if (z) {
            i = 7;
        } else {
            i = 5;
        }
        mo204726a(i, baseException);
    }

    public C60052e(DownloadTask downloadTask, Handler handler) {
        this.f149774f = downloadTask;
        m233086j();
        this.f149773e = handler;
        this.f149771c = C60046b.m233010t();
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            this.f149772d = C60148a.m233720a(downloadInfo.getId()).mo205473a("fix_start_with_file_exist_update_error");
        } else {
            this.f149772d = false;
        }
    }

    /* renamed from: a */
    public void mo204729a(BaseException baseException, boolean z) {
        this.f149770b.setFirstDownload(false);
        this.f149780l.set(0);
        m233083b(baseException, z);
    }

    /* renamed from: a */
    private boolean m233081a(long j, boolean z) {
        boolean z2 = false;
        if (this.f149770b.getCurBytes() == this.f149770b.getTotalBytes()) {
            try {
                this.f149771c.OnDownloadTaskProgress(this.f149770b.getId(), this.f149770b.getCurBytes());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }
        if (this.f149778j) {
            this.f149778j = false;
            this.f149770b.setStatus(4);
        }
        if (this.f149770b.isNeedPostProgress() && z) {
            z2 = true;
        }
        m233080a(4, (BaseException) null, z2);
        return z;
    }

    /* renamed from: a */
    private void m233080a(int i, BaseException baseException, boolean z) {
        SparseArray<IDownloadListener> sparseArray;
        SparseArray<IDownloadListener> sparseArray2;
        int status = this.f149770b.getStatus();
        if (status != -3 || i != 4) {
            m233086j();
            if (i != 4 && C59997c.m232860e(i)) {
                this.f149770b.updateRealDownloadTime(false);
                if (C59997c.m232859d(i)) {
                    this.f149770b.updateDownloadTime();
                }
            }
            C59992a.m232851a(this.f149774f, baseException, i);
            if (i == 6) {
                this.f149770b.setStatus(2);
            } else if (i == -6) {
                this.f149770b.setStatus(-3);
            } else {
                this.f149770b.setStatus(i);
            }
            if (status == -3 || status == -1) {
                if (this.f149770b.getRetryDelayStatus() == RetryDelayStatus.DELAY_RETRY_DOWNLOADING) {
                    this.f149770b.setRetryDelayStatus(RetryDelayStatus.DELAY_RETRY_DOWNLOADED);
                }
                if (this.f149770b.getAsyncHandleStatus() == AsyncHandleStatus.ASYNC_HANDLE_DOWNLOADING) {
                    this.f149770b.setAsyncHandleStatus(AsyncHandleStatus.ASYNC_HANDLE_DOWNLOADED);
                }
                if (this.f149770b.getByteInvalidRetryStatus() == ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_DOWNLOADING) {
                    this.f149770b.setByteInvalidRetryStatus(ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_DOWNLOADED);
                }
            }
            C60160c.m233740a(i, this.f149776h, true, this.f149770b, baseException);
            if (i != -4) {
                if (!z || this.f149773e == null || (((sparseArray = this.f149775g) == null || sparseArray.size() <= 0) && ((sparseArray2 = this.f149777i) == null || sparseArray2.size() <= 0 || (!this.f149770b.canShowNotification() && !this.f149770b.isAutoInstallWithoutNotification())))) {
                    AbstractC60081a x = C60046b.m233014x();
                    if (x != null) {
                        x.mo204898a(this.f149770b.getId(), i);
                        return;
                    }
                    return;
                }
                this.f149773e.obtainMessage(i, this.f149770b.getId(), 0, baseException).sendToTarget();
            }
        }
    }

    /* renamed from: a */
    public void mo204727a(long j, String str, String str2) {
        this.f149770b.setTotalBytes(j);
        this.f149770b.seteTag(str);
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.f149770b.getName())) {
            this.f149770b.setName(str2);
        }
        try {
            this.f149771c.OnDownloadTaskConnected(this.f149770b.getId(), j, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mo204726a(3, (BaseException) null);
        this.f149783o = this.f149770b.getMinByteIntervalForPostToMainThread(j);
        this.f149782n = this.f149770b.getMinProgressTimeMsInterval();
        this.f149778j = true;
        C60110q.m233537c().mo204962e();
    }

    /* renamed from: a */
    public void mo204730a(DownloadChunk downloadChunk, BaseException baseException, boolean z) {
        int i;
        this.f149770b.setFirstDownload(false);
        this.f149780l.set(0);
        this.f149771c.OnDownloadTaskRetry(this.f149770b.getId());
        if (z) {
            i = 10;
        } else {
            i = 9;
        }
        m233080a(i, baseException, true);
    }
}
