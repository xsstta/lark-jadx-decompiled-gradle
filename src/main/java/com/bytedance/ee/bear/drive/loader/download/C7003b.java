package com.bytedance.ee.bear.drive.loader.download;

import android.text.TextUtils;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7042d;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.b */
public class C7003b implements AbstractC7042d {

    /* renamed from: a */
    private final AbstractC6927d f18935a;

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7042d
    /* renamed from: a */
    public DrivePriority.DownloadPriority mo27536a() {
        return this.f18935a.mo27247c();
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7042d
    /* renamed from: b */
    public boolean mo27537b() {
        return this.f18935a.mo27248d();
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7042d
    /* renamed from: d */
    public String mo27539d() {
        return this.f18935a.mo27245b();
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7042d
    /* renamed from: c */
    public boolean mo27538c() {
        return !TextUtils.equals(this.f18935a.mo27245b(), "2");
    }

    public C7003b(AbstractC6927d dVar) {
        this.f18935a = dVar;
    }
}
