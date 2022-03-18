package com.ss.android.socialbase.downloader.notification;

import android.app.Notification;
import com.ss.android.socialbase.downloader.exception.BaseException;

/* renamed from: com.ss.android.socialbase.downloader.notification.a */
public abstract class AbstractC60146a {

    /* renamed from: a */
    protected Notification f150103a;

    /* renamed from: b */
    private int f150104b;

    /* renamed from: c */
    private boolean f150105c;

    /* renamed from: a */
    public abstract void mo205462a(BaseException baseException, boolean z);

    /* renamed from: a */
    public int mo205461a() {
        return this.f150104b;
    }

    /* renamed from: b */
    public boolean mo205463b() {
        return this.f150105c;
    }

    /* renamed from: c */
    public Notification mo205464c() {
        return this.f150103a;
    }
}
