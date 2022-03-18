package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.impls.AbstractC60081a;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.utils.C60158a;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.socialbase.downloader.downloader.a */
public abstract class AbstractC60044a implements AbstractC60064n {

    /* renamed from: a */
    public static final String f149675a = "a";

    /* renamed from: b */
    protected final SparseArray<DownloadTask> f149676b = new SparseArray<>();

    /* renamed from: c */
    protected volatile boolean f149677c = false;

    /* renamed from: d */
    protected volatile boolean f149678d;

    /* renamed from: e */
    protected volatile boolean f149679e = false;

    /* renamed from: f */
    private WeakReference<Service> f149680f;

    /* renamed from: g */
    private Handler f149681g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private Runnable f149682h = new Runnable() {
        /* class com.ss.android.socialbase.downloader.downloader.AbstractC60044a.RunnableC600451 */

        public void run() {
            if (C59990a.m232836a()) {
                C59990a.m232838b(AbstractC60044a.f149675a, "tryDownload: 2 try");
            }
            if (!AbstractC60044a.this.f149677c) {
                if (C59990a.m232836a()) {
                    C59990a.m232838b(AbstractC60044a.f149675a, "tryDownload: 2 error");
                }
                AbstractC60044a.this.mo204655a(C60046b.m232945G(), (ServiceConnection) null);
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo204655a(Context context, ServiceConnection serviceConnection) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n
    /* renamed from: a */
    public void mo204656a(Intent intent, int i, int i2) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n
    /* renamed from: a */
    public void mo204657a(AbstractC60063m mVar) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n
    /* renamed from: c */
    public void mo204664c() {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n
    /* renamed from: c */
    public void mo204665c(DownloadTask downloadTask) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n
    /* renamed from: d */
    public void mo204666d() {
        this.f149677c = false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n
    /* renamed from: b */
    public boolean mo204663b() {
        String str = f149675a;
        C59990a.m232839c(str, "isServiceForeground = " + this.f149678d);
        return this.f149678d;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n
    /* renamed from: f */
    public void mo204668f() {
        if (!this.f149677c) {
            if (C59990a.m232836a()) {
                C59990a.m232838b(f149675a, "startService");
            }
            mo204655a(C60046b.m232945G(), (ServiceConnection) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo204667e() {
        SparseArray<DownloadTask> clone;
        String str = f149675a;
        C59990a.m232838b(str, "resumePendingTask pendingTasks.size:" + this.f149676b.size());
        synchronized (this.f149676b) {
            clone = this.f149676b.clone();
            this.f149676b.clear();
        }
        AbstractC60081a x = C60046b.m233014x();
        if (x != null) {
            for (int i = 0; i < clone.size(); i++) {
                DownloadTask downloadTask = clone.get(clone.keyAt(i));
                if (downloadTask != null) {
                    x.mo204905a(downloadTask);
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n
    /* renamed from: a */
    public boolean mo204661a() {
        return this.f149677c;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n
    /* renamed from: a */
    public void mo204653a(int i) {
        C59990a.m232832a(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n
    /* renamed from: a */
    public IBinder mo204652a(Intent intent) {
        C59990a.m232838b(f149675a, "onBind Abs");
        return new Binder();
    }

    /* renamed from: a */
    public void mo204658a(DownloadTask downloadTask) {
        if (downloadTask != null) {
            String str = f149675a;
            C59990a.m232838b(str, "pendDownloadTask pendingTasks.size:" + this.f149676b.size() + " downloadTask.getDownloadId():" + downloadTask.getDownloadId());
            if (this.f149676b.get(downloadTask.getDownloadId()) == null) {
                synchronized (this.f149676b) {
                    if (this.f149676b.get(downloadTask.getDownloadId()) == null) {
                        this.f149676b.put(downloadTask.getDownloadId(), downloadTask);
                    }
                }
            }
            C59990a.m232838b(str, "after pendDownloadTask pendingTasks.size:" + this.f149676b.size());
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n
    /* renamed from: b */
    public void mo204662b(DownloadTask downloadTask) {
        if (downloadTask != null) {
            if (!this.f149677c) {
                if (C59990a.m232836a()) {
                    C59990a.m232838b(f149675a, "tryDownload but service is not alive");
                }
                if (C60158a.m233738a(262144)) {
                    synchronized (this.f149676b) {
                        mo204658a(downloadTask);
                        if (!this.f149679e) {
                            if (C59990a.m232836a()) {
                                C59990a.m232838b(f149675a, "tryDownload: 1");
                            }
                            mo204655a(C60046b.m232945G(), (ServiceConnection) null);
                            this.f149679e = true;
                        } else {
                            this.f149681g.removeCallbacks(this.f149682h);
                            this.f149681g.postDelayed(this.f149682h, 10);
                        }
                    }
                    return;
                }
                mo204658a(downloadTask);
                mo204655a(C60046b.m232945G(), (ServiceConnection) null);
                return;
            }
            if (this.f149676b.get(downloadTask.getDownloadId()) != null) {
                synchronized (this.f149676b) {
                    if (this.f149676b.get(downloadTask.getDownloadId()) != null) {
                        this.f149676b.remove(downloadTask.getDownloadId());
                    }
                }
            }
            AbstractC60081a x = C60046b.m233014x();
            if (x != null) {
                x.mo204905a(downloadTask);
            }
            mo204667e();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n
    /* renamed from: a */
    public void mo204659a(WeakReference weakReference) {
        this.f149680f = weakReference;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n
    /* renamed from: a */
    public void mo204660a(boolean z) {
        WeakReference<Service> weakReference = this.f149680f;
        if (weakReference != null && weakReference.get() != null) {
            String str = f149675a;
            C59990a.m232839c(str, "stopForeground  service = " + this.f149680f.get() + ",  isServiceAlive = " + this.f149677c);
            try {
                this.f149678d = false;
                this.f149680f.get().stopForeground(z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n
    /* renamed from: a */
    public void mo204654a(int i, Notification notification) {
        WeakReference<Service> weakReference = this.f149680f;
        if (weakReference == null || weakReference.get() == null) {
            C59990a.m232840d(f149675a, "startForeground: downloadService is null, do nothing!");
            return;
        }
        String str = f149675a;
        C59990a.m232839c(str, "startForeground  id = " + i + ", service = " + this.f149680f.get() + ",  isServiceAlive = " + this.f149677c);
        try {
            this.f149680f.get().startForeground(i, notification);
            this.f149678d = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
