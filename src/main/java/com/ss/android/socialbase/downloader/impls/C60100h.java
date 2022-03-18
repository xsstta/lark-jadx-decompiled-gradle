package com.ss.android.socialbase.downloader.impls;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.socialbase.downloader.downloader.DownloadService;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.utils.C60158a;

/* renamed from: com.ss.android.socialbase.downloader.impls.h */
public class C60100h extends AbstractC60044a {

    /* renamed from: f */
    private static final String f149919f = "h";

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n, com.ss.android.socialbase.downloader.downloader.AbstractC60044a
    /* renamed from: c */
    public void mo204664c() {
        if (C60158a.m233738a(262144)) {
            this.f149677c = true;
            this.f149679e = false;
            if (C59990a.m232836a()) {
                C59990a.m232838b(f149919f, "onStartCommandOnMainThread");
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60044a
    /* renamed from: a */
    public void mo204655a(Context context, ServiceConnection serviceConnection) {
        try {
            context.startService(new Intent(context, DownloadService.class));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n, com.ss.android.socialbase.downloader.downloader.AbstractC60044a
    /* renamed from: a */
    public void mo204656a(Intent intent, int i, int i2) {
        if (C59990a.m232836a()) {
            C59990a.m232838b(f149919f, "onStartCommand");
        }
        if (!C60158a.m233738a(262144)) {
            this.f149677c = true;
        }
        mo204667e();
    }
}
