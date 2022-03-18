package com.bytedance.ee.bear.drive.loader.download.platform.processor.misc;

import android.os.SystemClock;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.C7079f;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.processor.misc.b */
public class C7085b {

    /* renamed from: a */
    private C7079f f19091a;

    /* renamed from: b */
    private boolean f19092b;

    /* renamed from: c */
    private long f19093c;

    /* renamed from: a */
    public void mo27699a() {
        if (this.f19092b) {
            AbstractC6949c b = this.f19091a.mo27679b();
            this.f19091a.mo27678a().mo27677f().mo27881a("server_transform", 4, SystemClock.uptimeMillis() - this.f19093c, b.mo27372b(), b.mo27373c(), b.mo27377g());
            this.f19091a.mo27681d().mo27533a(IDownloader.TransStatus.TRANSFORM_FAILED);
            this.f19092b = false;
        }
    }

    /* renamed from: b */
    public void mo27700b() {
        if (this.f19092b) {
            AbstractC6949c b = this.f19091a.mo27679b();
            this.f19091a.mo27678a().mo27677f().mo27881a("server_transform", 3, SystemClock.uptimeMillis() - this.f19093c, b.mo27372b(), b.mo27373c(), b.mo27377g());
            this.f19091a.mo27681d().mo27533a(IDownloader.TransStatus.TRANSFORM_COMPLETED);
            this.f19092b = false;
        }
    }

    /* renamed from: c */
    public void mo27701c() {
        this.f19092b = true;
        this.f19093c = SystemClock.uptimeMillis();
        AbstractC6949c b = this.f19091a.mo27679b();
        this.f19091a.mo27678a().mo27677f().mo27881a("server_transform", 1, 0, b.mo27372b(), b.mo27373c(), b.mo27377g());
        this.f19091a.mo27681d().mo27533a(IDownloader.TransStatus.TRANSFORMING);
    }

    public C7085b(C7079f fVar) {
        this.f19091a = fVar;
    }
}
