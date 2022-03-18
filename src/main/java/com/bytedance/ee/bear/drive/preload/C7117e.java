package com.bytedance.ee.bear.drive.preload;

import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7042d;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;

/* renamed from: com.bytedance.ee.bear.drive.preload.e */
public class C7117e implements AbstractC7042d {

    /* renamed from: a */
    private final AbstractC6927d f19182a;

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7042d
    /* renamed from: b */
    public boolean mo27537b() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7042d
    /* renamed from: c */
    public boolean mo27538c() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7042d
    /* renamed from: a */
    public DrivePriority.DownloadPriority mo27536a() {
        return DrivePriority.DownloadPriority.PRELOAD;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7042d
    /* renamed from: d */
    public String mo27539d() {
        return this.f19182a.mo27245b();
    }

    public C7117e(AbstractC6927d dVar) {
        this.f19182a = dVar;
    }
}
