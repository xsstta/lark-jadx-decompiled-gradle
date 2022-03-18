package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.ss.android.socialbase.downloader.downloader.DownloadService;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.socialbase.downloader.downloader.n */
public interface AbstractC60064n<T extends DownloadService> {
    /* renamed from: a */
    IBinder mo204652a(Intent intent);

    /* renamed from: a */
    void mo204653a(int i);

    /* renamed from: a */
    void mo204654a(int i, Notification notification);

    /* renamed from: a */
    void mo204656a(Intent intent, int i, int i2);

    /* renamed from: a */
    void mo204657a(AbstractC60063m mVar);

    /* renamed from: a */
    void mo204659a(WeakReference<T> weakReference);

    /* renamed from: a */
    void mo204660a(boolean z);

    /* renamed from: a */
    boolean mo204661a();

    /* renamed from: b */
    void mo204662b(DownloadTask downloadTask);

    /* renamed from: b */
    boolean mo204663b();

    /* renamed from: c */
    void mo204664c();

    /* renamed from: c */
    void mo204665c(DownloadTask downloadTask);

    /* renamed from: d */
    void mo204666d();

    /* renamed from: f */
    void mo204668f();
}
