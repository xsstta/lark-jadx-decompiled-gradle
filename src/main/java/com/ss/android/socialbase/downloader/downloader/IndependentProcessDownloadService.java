package com.ss.android.socialbase.downloader.downloader;

import java.lang.ref.WeakReference;

public class IndependentProcessDownloadService extends DownloadService {
    @Override // com.ss.android.socialbase.downloader.downloader.DownloadService
    public void onCreate() {
        super.onCreate();
        C60046b.m232958a(this);
        this.f149669a = C60046b.m233012v();
        this.f149669a.mo204659a(new WeakReference(this));
    }
}
