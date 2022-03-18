package com.ss.android.socialbase.downloader.impls;

import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.C59997c;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.constants.RetryDelayStatus;
import com.ss.android.socialbase.downloader.depend.AbstractC60031i;
import com.ss.android.socialbase.downloader.depend.AbstractC60036n;
import com.ss.android.socialbase.downloader.depend.AbstractC60040r;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.AbstractC60059i;
import com.ss.android.socialbase.downloader.downloader.AbstractC60066p;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.downloader.C60052e;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.notification.C60147b;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.p3028e.HandlerC60077f;
import com.ss.android.socialbase.downloader.p3028e.RunnableC60071c;
import com.ss.android.socialbase.downloader.setting.C60148a;
import com.ss.android.socialbase.downloader.utils.C60158a;
import com.ss.android.socialbase.downloader.utils.C60160c;
import com.ss.android.socialbase.downloader.utils.C60161d;
import com.ss.android.socialbase.downloader.utils.LruCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.ss.android.socialbase.downloader.impls.a */
public abstract class AbstractC60081a implements HandlerC60077f.AbstractC60078a {

    /* renamed from: a */
    protected final HandlerC60077f f149873a = new HandlerC60077f(Looper.getMainLooper(), this);

    /* renamed from: b */
    private final SparseArray<DownloadTask> f149874b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<DownloadTask> f149875c = new SparseArray<>();

    /* renamed from: d */
    private final SparseArray<DownloadTask> f149876d = new SparseArray<>();

    /* renamed from: e */
    private final SparseArray<DownloadTask> f149877e = new SparseArray<>();

    /* renamed from: f */
    private final SparseArray<DownloadTask> f149878f = new SparseArray<>();

    /* renamed from: g */
    private final LruCache<Integer, DownloadTask> f149879g = new LruCache<>();

    /* renamed from: h */
    private final SparseArray<Long> f149880h = new SparseArray<>();

    /* renamed from: i */
    private final LinkedBlockingDeque<DownloadTask> f149881i = new LinkedBlockingDeque<>();

    /* renamed from: j */
    private final AbstractC60059i f149882j = C60046b.m233010t();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List<Integer> mo204896a();

    /* renamed from: a */
    public abstract void mo204901a(int i, long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo204903a(int i, DownloadTask downloadTask);

    /* renamed from: a */
    public abstract void mo204904a(RunnableC60071c cVar);

    /* renamed from: a */
    public abstract boolean mo204907a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo204911b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract RunnableC60071c mo204916c(int i);

    /* renamed from: a */
    public void mo204905a(DownloadTask downloadTask) {
        DownloadInfo downloadInfo;
        if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null) {
            downloadInfo.setDownloadFromReserveWifi(false);
            if (downloadInfo.getEnqueueType() != EnqueueType.ENQUEUE_NONE) {
                m233321b(downloadTask);
            } else {
                m233320a(downloadTask, true);
            }
        }
    }

    /* renamed from: a */
    public boolean mo204908a(int i, boolean z) {
        DownloadTask downloadTask = this.f149874b.get(i);
        if (downloadTask == null && C60158a.m233738a(65536)) {
            downloadTask = m233323o(i);
        }
        if (downloadTask != null) {
            if (!C60148a.m233720a(i).mo205475b("fix_on_cancel_call_twice", true)) {
                new C60052e(downloadTask, this.f149873a).mo204734c();
            }
            final DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            final SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(ListenerType.MAIN);
            final SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(ListenerType.NOTIFICATION);
            this.f149873a.post(new Runnable() {
                /* class com.ss.android.socialbase.downloader.impls.AbstractC60081a.RunnableC600821 */

                public void run() {
                    SparseArray sparseArray;
                    SparseArray sparseArray2 = downloadListeners;
                    if (sparseArray2 != null) {
                        synchronized (sparseArray2) {
                            for (int i = 0; i < downloadListeners.size(); i++) {
                                IDownloadListener iDownloadListener = (IDownloadListener) downloadListeners.get(downloadListeners.keyAt(i));
                                if (iDownloadListener != null) {
                                    iDownloadListener.onCanceled(downloadInfo);
                                }
                            }
                        }
                    }
                    DownloadInfo downloadInfo = downloadInfo;
                    if (!(downloadInfo == null || !downloadInfo.canShowNotification() || (sparseArray = downloadListeners2) == null)) {
                        synchronized (sparseArray) {
                            for (int i2 = 0; i2 < downloadListeners2.size(); i2++) {
                                IDownloadListener iDownloadListener2 = (IDownloadListener) downloadListeners2.get(downloadListeners2.keyAt(i2));
                                if (iDownloadListener2 != null) {
                                    iDownloadListener2.onCanceled(downloadInfo);
                                }
                            }
                        }
                    }
                }
            });
        }
        DownloadInfo downloadInfo2 = this.f149882j.getDownloadInfo(i);
        if (C60158a.m233738a(65536)) {
            if (downloadInfo2 != null) {
                downloadInfo2.setStatus(-4);
            }
        } else if (downloadInfo2 != null && C59997c.m232857b(downloadInfo2.getStatus())) {
            downloadInfo2.setStatus(-4);
        }
        mo204914b(i, z);
        return true;
    }

    /* renamed from: a */
    public synchronized void mo204906a(List<String> list) {
        try {
            boolean a = C60158a.m233738a(1048576) ? C60161d.m233772a(C60046b.m232945G()) : true;
            for (int i = 0; i < this.f149876d.size(); i++) {
                DownloadTask downloadTask = this.f149876d.get(this.f149876d.keyAt(i));
                if (downloadTask != null) {
                    DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                    if (!(downloadInfo == null || downloadInfo.getMimeType() == null || !list.contains(downloadInfo.getMimeType()))) {
                        if (!downloadInfo.isOnlyWifi() || a) {
                            downloadInfo.setAutoResumed(true);
                            downloadInfo.setShowNotificationForNetworkResumed(true);
                            mo204905a(downloadTask);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    @Override // com.ss.android.socialbase.downloader.p3028e.HandlerC60077f.AbstractC60078a
    /* renamed from: a */
    public void mo204876a(Message message) {
        int i = message.arg1;
        BaseException baseException = message.obj instanceof Exception ? (BaseException) message.obj : null;
        synchronized (AbstractC60081a.class) {
            DownloadTask downloadTask = this.f149874b.get(i);
            if (downloadTask != null) {
                m233318a(message.what, baseException, downloadTask);
                mo204898a(i, message.what);
            }
        }
    }

    /* renamed from: b */
    public void mo204910b() {
        List<Integer> a = mo204896a();
        if (a != null) {
            for (Integer num : a) {
                mo204921e(num.intValue());
            }
        }
    }

    protected AbstractC60081a() {
    }

    /* renamed from: b */
    private boolean m233322b(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.statusInPause()) {
            return downloadInfo.isPauseReserveOnWifi();
        }
        return false;
    }

    /* renamed from: d */
    public DownloadInfo mo204918d(int i) {
        DownloadInfo downloadInfo = this.f149882j.getDownloadInfo(i);
        if (downloadInfo == null) {
            synchronized (this.f149874b) {
                DownloadTask downloadTask = this.f149874b.get(i);
                if (downloadTask != null) {
                    downloadInfo = downloadTask.getDownloadInfo();
                }
            }
        }
        return downloadInfo;
    }

    /* renamed from: m */
    public synchronized void mo204929m(int i) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f149874b.get(i);
        if (!(downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null)) {
            downloadInfo.setForceIgnoreRecommendSize(true);
            mo204905a(downloadTask);
        }
    }

    /* renamed from: n */
    public synchronized boolean mo204930n(int i) {
        boolean z;
        SparseArray<DownloadTask> sparseArray;
        if (i != 0) {
            SparseArray<DownloadTask> sparseArray2 = this.f149874b;
            if (!((sparseArray2 == null || sparseArray2.get(i) == null) && ((sparseArray = this.f149876d) == null || sparseArray.get(i) == null))) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* renamed from: o */
    private DownloadTask m233323o(int i) {
        DownloadTask downloadTask = this.f149874b.get(i);
        if (downloadTask != null) {
            return downloadTask;
        }
        DownloadTask downloadTask2 = this.f149876d.get(i);
        if (downloadTask2 != null) {
            return downloadTask2;
        }
        DownloadTask downloadTask3 = this.f149875c.get(i);
        if (downloadTask3 != null) {
            return downloadTask3;
        }
        DownloadTask downloadTask4 = this.f149877e.get(i);
        if (downloadTask4 == null) {
            return this.f149878f.get(i);
        }
        return downloadTask4;
    }

    /* renamed from: p */
    private void m233324p(int i) {
        if (!this.f149881i.isEmpty()) {
            synchronized (this.f149881i) {
                DownloadTask first = this.f149881i.getFirst();
                if (first != null && first.getDownloadId() == i) {
                    this.f149881i.poll();
                }
                if (!this.f149881i.isEmpty()) {
                    DownloadTask first2 = this.f149881i.getFirst();
                    if (first2 != null) {
                        m233320a(first2, true);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public List<DownloadInfo> mo204909b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : mo204896a()) {
            DownloadInfo d = mo204918d(num.intValue());
            if (d != null && str.equals(d.getMimeType())) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public synchronized boolean mo204922f(int i) {
        DownloadTask downloadTask = this.f149874b.get(i);
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                downloadInfo.setDownloadFromReserveWifi(false);
            }
            mo204905a(downloadTask);
        } else {
            mo204923g(i);
        }
        return true;
    }

    /* renamed from: g */
    public synchronized boolean mo204923g(int i) {
        DownloadTask downloadTask = this.f149876d.get(i);
        if (downloadTask == null) {
            downloadTask = this.f149877e.get(i);
        }
        if (downloadTask == null) {
            return false;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            downloadInfo.setDownloadFromReserveWifi(false);
        }
        mo204905a(downloadTask);
        return true;
    }

    /* renamed from: k */
    public synchronized boolean mo204927k(int i) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f149877e.get(i);
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            DownloadInfo downloadInfo2 = this.f149882j.getDownloadInfo(i);
            if (downloadInfo2 != null && downloadInfo2.canStartRetryDelayTask()) {
                m233320a(new DownloadTask(downloadInfo2), false);
            }
            return false;
        }
        if (downloadInfo.canStartRetryDelayTask()) {
            m233320a(downloadTask, false);
        }
        return true;
    }

    /* renamed from: l */
    public synchronized boolean mo204928l(int i) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f149878f.get(i);
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return false;
        }
        if (downloadInfo.canReStartAsyncTask()) {
            mo204905a(downloadTask);
        }
        return true;
    }

    /* renamed from: a */
    private void m233319a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            try {
                if (downloadInfo.getStatus() == 7 || downloadInfo.getRetryDelayStatus() != RetryDelayStatus.DELAY_RETRY_NONE) {
                    downloadInfo.setStatus(5);
                    downloadInfo.setRetryDelayStatus(RetryDelayStatus.DELAY_RETRY_NONE);
                    C59990a.m232838b("AbsDownloadEngine", "cancelAlarm");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    public synchronized AbstractC60040r mo204924h(int i) {
        DownloadTask downloadTask = this.f149874b.get(i);
        if (downloadTask != null) {
            return downloadTask.getNotificationClickCallback();
        }
        DownloadTask downloadTask2 = this.f149875c.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationClickCallback();
        }
        DownloadTask downloadTask3 = this.f149876d.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationClickCallback();
        }
        DownloadTask downloadTask4 = this.f149877e.get(i);
        if (downloadTask4 != null) {
            return downloadTask4.getNotificationClickCallback();
        }
        DownloadTask downloadTask5 = this.f149878f.get(i);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getNotificationClickCallback();
    }

    /* renamed from: i */
    public synchronized AbstractC60036n mo204925i(int i) {
        DownloadTask downloadTask = this.f149874b.get(i);
        if (downloadTask != null) {
            return downloadTask.getNotificationEventListener();
        }
        DownloadTask downloadTask2 = this.f149875c.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationEventListener();
        }
        DownloadTask downloadTask3 = this.f149876d.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationEventListener();
        }
        DownloadTask downloadTask4 = this.f149877e.get(i);
        if (downloadTask4 != null) {
            return downloadTask4.getNotificationEventListener();
        }
        DownloadTask downloadTask5 = this.f149878f.get(i);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getNotificationEventListener();
    }

    /* renamed from: j */
    public synchronized AbstractC60031i mo204926j(int i) {
        DownloadTask downloadTask = this.f149874b.get(i);
        if (downloadTask != null) {
            return downloadTask.getFileUriProvider();
        }
        DownloadTask downloadTask2 = this.f149875c.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getFileUriProvider();
        }
        DownloadTask downloadTask3 = this.f149876d.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getFileUriProvider();
        }
        DownloadTask downloadTask4 = this.f149877e.get(i);
        if (downloadTask4 != null) {
            return downloadTask4.getFileUriProvider();
        }
        DownloadTask downloadTask5 = this.f149878f.get(i);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getFileUriProvider();
    }

    /* renamed from: b */
    private void m233321b(DownloadTask downloadTask) {
        DownloadInfo downloadInfo;
        if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null) {
            try {
                synchronized (this.f149881i) {
                    if (this.f149881i.isEmpty()) {
                        m233320a(downloadTask, true);
                        this.f149881i.put(downloadTask);
                    } else if (downloadInfo.getEnqueueType() != EnqueueType.ENQUEUE_TAIL) {
                        DownloadTask first = this.f149881i.getFirst();
                        if (first.getDownloadId() != downloadTask.getDownloadId() || !mo204907a(downloadTask.getDownloadId())) {
                            mo204921e(first.getDownloadId());
                            m233320a(downloadTask, true);
                            if (first.getDownloadId() != downloadTask.getDownloadId()) {
                                this.f149881i.putFirst(downloadTask);
                            }
                        }
                    } else if (this.f149881i.getFirst().getDownloadId() != downloadTask.getDownloadId() || !mo204907a(downloadTask.getDownloadId())) {
                        Iterator<DownloadTask> it = this.f149881i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                DownloadTask next = it.next();
                                if (next != null && next.getDownloadId() == downloadTask.getDownloadId()) {
                                    it.remove();
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        this.f149881i.put(downloadTask);
                        new C60052e(downloadTask, this.f149873a).mo204725a();
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public List<DownloadInfo> mo204897a(String str) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<DownloadInfo> downloadInfoList = this.f149882j.getDownloadInfoList(str);
        if (!(downloadInfoList == null || downloadInfoList.isEmpty())) {
            return downloadInfoList;
        }
        synchronized (this.f149874b) {
            arrayList = new ArrayList();
            int size = this.f149874b.size();
            for (int i = 0; i < size; i++) {
                DownloadTask valueAt = this.f149874b.valueAt(i);
                if (!(valueAt == null || valueAt.getDownloadInfo() == null || !str.equals(valueAt.getDownloadInfo().getUrl()))) {
                    arrayList.add(valueAt.getDownloadInfo());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public boolean mo204921e(int i) {
        C59990a.m232838b("AbsDownloadEngine", "pause id");
        DownloadInfo downloadInfo = this.f149882j.getDownloadInfo(i);
        if (downloadInfo != null && downloadInfo.getStatus() == 11) {
            return false;
        }
        mo204911b(i);
        if (downloadInfo == null) {
            synchronized (this.f149874b) {
                DownloadTask downloadTask = this.f149874b.get(i);
                if (downloadTask != null) {
                    new C60052e(downloadTask, this.f149873a).mo204735d();
                    return true;
                }
            }
        } else {
            m233319a(downloadInfo);
            if (downloadInfo.getStatus() == 1) {
                synchronized (this.f149874b) {
                    DownloadTask downloadTask2 = this.f149874b.get(i);
                    if (downloadTask2 != null) {
                        new C60052e(downloadTask2, this.f149873a).mo204735d();
                        return true;
                    }
                }
            } else if (C59997c.m232857b(downloadInfo.getStatus())) {
                downloadInfo.setStatus(-2);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public synchronized void mo204915b(List<String> list) {
        DownloadInfo downloadInfo;
        try {
            if (C60161d.m233772a(C60046b.m232945G())) {
                for (int i = 0; i < this.f149874b.size(); i++) {
                    DownloadTask downloadTask = this.f149874b.get(this.f149874b.keyAt(i));
                    if (!(downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null || downloadInfo.getMimeType() == null || !list.contains(downloadInfo.getMimeType()) || !m233322b(downloadInfo))) {
                        downloadInfo.setAutoResumed(true);
                        downloadInfo.setShowNotificationForNetworkResumed(true);
                        mo204905a(downloadTask);
                        downloadInfo.setDownloadFromReserveWifi(true);
                        AbstractC60066p reserveWifiStatusListener = Downloader.getInstance(C60046b.m232945G()).getReserveWifiStatusListener();
                        if (reserveWifiStatusListener != null) {
                            reserveWifiStatusListener.mo204837a(downloadInfo, 5, 2);
                        }
                    }
                }
                return;
            }
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public void mo204919d(final int i, final boolean z) {
        DownloadInfo downloadInfo = this.f149882j.getDownloadInfo(i);
        if (downloadInfo != null) {
            m233319a(downloadInfo);
        }
        this.f149873a.post(new Runnable() {
            /* class com.ss.android.socialbase.downloader.impls.AbstractC60081a.RunnableC600854 */

            public void run() {
                C60147b.m233714a().mo205469d(i);
            }
        });
        C60046b.m232977a((Runnable) new Runnable() {
            /* class com.ss.android.socialbase.downloader.impls.AbstractC60081a.RunnableC600865 */

            public void run() {
                AbstractC60081a.this.mo204916c(i);
                AbstractC60081a.this.mo204920e(i, z);
            }
        }, true);
    }

    /* renamed from: c */
    public synchronized void mo204917c(int i, boolean z) {
        try {
            DownloadInfo downloadInfo = this.f149882j.getDownloadInfo(i);
            if (downloadInfo != null) {
                if (z) {
                    C60161d.m233759a(downloadInfo);
                } else {
                    C60161d.m233801c(downloadInfo.getTempPath(), downloadInfo.getTempName());
                }
                downloadInfo.erase();
            }
            try {
                this.f149882j.removeDownloadTaskData(i);
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
            mo204898a(i, -4);
            if (this.f149876d.get(i) != null) {
                this.f149876d.remove(i);
            }
            if (this.f149875c.get(i) != null) {
                this.f149875c.remove(i);
            }
            synchronized (this.f149879g) {
                this.f149879g.remove(Integer.valueOf(i));
            }
            C60148a.m233726b(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return;
    }

    /* renamed from: e */
    public void mo204920e(int i, boolean z) {
        try {
            DownloadInfo downloadInfo = this.f149882j.getDownloadInfo(i);
            if (downloadInfo != null) {
                C60161d.m233763a(downloadInfo, z);
                downloadInfo.erase();
            }
            try {
                this.f149882j.removeAllDownloadChunk(i);
                this.f149882j.updateDownloadInfo(downloadInfo);
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
            if (this.f149876d.get(i) != null) {
                this.f149876d.remove(i);
            }
            if (this.f149875c.get(i) != null) {
                this.f149875c.remove(i);
            }
            synchronized (this.f149879g) {
                this.f149879g.remove(Integer.valueOf(i));
            }
            C60148a.m233726b(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0140  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m233320a(com.ss.android.socialbase.downloader.model.DownloadTask r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 451
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.AbstractC60081a.m233320a(com.ss.android.socialbase.downloader.model.DownloadTask, boolean):void");
    }

    /* renamed from: b */
    public void mo204913b(int i, long j) {
        DownloadInfo downloadInfo = this.f149882j.getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setThrottleNetSpeed(j);
        }
        mo204901a(i, j);
    }

    /* renamed from: a */
    public synchronized void mo204898a(int i, int i2) {
        if (i2 != -7) {
            if (i2 == -6) {
                this.f149875c.put(i, this.f149874b.get(i));
                this.f149874b.remove(i);
            } else if (i2 == -4) {
                this.f149874b.remove(i);
                m233324p(i);
            } else if (i2 == -3) {
                this.f149875c.put(i, this.f149874b.get(i));
                this.f149874b.remove(i);
                m233324p(i);
            } else if (i2 != -1) {
                if (i2 == 7) {
                    DownloadTask downloadTask = this.f149874b.get(i);
                    if (downloadTask != null) {
                        if (this.f149877e.get(i) == null) {
                            this.f149877e.put(i, downloadTask);
                        }
                        this.f149874b.remove(i);
                    }
                    m233324p(i);
                } else if (i2 == 8) {
                    DownloadTask downloadTask2 = this.f149874b.get(i);
                    if (downloadTask2 != null && this.f149878f.get(i) == null) {
                        this.f149878f.put(i, downloadTask2);
                    }
                    m233324p(i);
                }
            }
        }
        DownloadTask downloadTask3 = this.f149874b.get(i);
        if (downloadTask3 != null) {
            if (this.f149876d.get(i) == null) {
                this.f149876d.put(i, downloadTask3);
            }
            this.f149874b.remove(i);
        }
        m233324p(i);
    }

    /* renamed from: b */
    public void mo204914b(final int i, final boolean z) {
        DownloadInfo downloadInfo = this.f149882j.getDownloadInfo(i);
        if (downloadInfo != null) {
            m233319a(downloadInfo);
        }
        this.f149873a.post(new Runnable() {
            /* class com.ss.android.socialbase.downloader.impls.AbstractC60081a.RunnableC600832 */

            public void run() {
                C60147b.m233714a().mo205469d(i);
            }
        });
        C60046b.m232977a((Runnable) new Runnable() {
            /* class com.ss.android.socialbase.downloader.impls.AbstractC60081a.RunnableC600843 */

            public void run() {
                AbstractC60081a.this.mo204916c(i);
                AbstractC60081a.this.mo204917c(i, z);
            }
        }, true);
    }

    /* renamed from: a */
    public void mo204902a(int i, AbstractC60036n nVar) {
        synchronized (this.f149874b) {
            DownloadTask downloadTask = this.f149874b.get(i);
            if (downloadTask != null) {
                downloadTask.setNotificationEventListener(nVar);
            }
        }
    }

    /* renamed from: a */
    private void m233318a(int i, BaseException baseException, DownloadTask downloadTask) {
        boolean z;
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(ListenerType.MAIN);
            SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(ListenerType.NOTIFICATION);
            if (downloadTask.canShowNotification() || downloadInfo.isAutoInstallWithoutNotification()) {
                z = true;
            } else {
                z = false;
            }
            C60160c.m233740a(i, downloadListeners, true, downloadInfo, baseException);
            C60160c.m233740a(i, downloadListeners2, z, downloadInfo, baseException);
        }
    }

    /* renamed from: a */
    public synchronized void mo204899a(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        DownloadTask o = m233323o(i);
        if (o == null) {
            o = (DownloadTask) this.f149879g.get(Integer.valueOf(i));
        }
        if (o != null) {
            o.removeDownloadListener(i2, iDownloadListener, listenerType, z);
        }
    }

    /* renamed from: b */
    public synchronized void mo204912b(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        mo204900a(i, i2, iDownloadListener, listenerType, z, true);
    }

    /* renamed from: a */
    public synchronized void mo204900a(int i, int i2, final IDownloadListener iDownloadListener, ListenerType listenerType, boolean z, boolean z2) {
        DownloadInfo downloadInfo;
        DownloadTask o = m233323o(i);
        if (o != null) {
            o.addDownloadListener(i2, iDownloadListener, listenerType, z);
            final DownloadInfo downloadInfo2 = o.getDownloadInfo();
            if (z2 && downloadInfo2 != null && !mo204907a(i) && (listenerType == ListenerType.MAIN || listenerType == ListenerType.NOTIFICATION)) {
                boolean z3 = true;
                if (listenerType == ListenerType.NOTIFICATION && !downloadInfo2.canShowNotification()) {
                    z3 = false;
                }
                if (z3) {
                    this.f149873a.post(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.impls.AbstractC60081a.RunnableC600876 */

                        public void run() {
                            DownloadInfo downloadInfo = downloadInfo2;
                            if (downloadInfo != null && iDownloadListener != null) {
                                if (downloadInfo.getStatus() == -3) {
                                    iDownloadListener.onSuccessed(downloadInfo2);
                                } else if (downloadInfo2.getStatus() == -1) {
                                    iDownloadListener.onFailed(downloadInfo2, new BaseException(1000, "try add listener for failed task"));
                                }
                            }
                        }
                    });
                }
            }
        } else if (!(!C60158a.m233738a(32768) || (downloadInfo = this.f149882j.getDownloadInfo(i)) == null || downloadInfo.getStatus() == -3)) {
            DownloadTask downloadTask = (DownloadTask) this.f149879g.get(Integer.valueOf(i));
            if (downloadTask == null) {
                downloadTask = new DownloadTask(downloadInfo);
                synchronized (this.f149879g) {
                    this.f149879g.put(Integer.valueOf(i), downloadTask);
                }
            }
            downloadTask.addDownloadListener(i2, iDownloadListener, listenerType, z);
        }
    }
}
