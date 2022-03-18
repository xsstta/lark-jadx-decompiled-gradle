package com.bytedance.ee.bear.drive.config.strategy;

import android.content.Context;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import java.io.File;

/* renamed from: com.bytedance.ee.bear.drive.config.strategy.g */
public class C6930g implements AbstractC6927d {

    /* renamed from: e */
    private C6923a f18718e;

    /* renamed from: f */
    private AbstractC7095c f18719f;

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public String mo27238a() {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public String mo27241a(String str) {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public boolean mo27242a(long j) {
        return j == 0;
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public boolean mo27244a(C6880a aVar, AbstractC6949c cVar) {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: b */
    public String mo27245b() {
        return "2";
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: b */
    public boolean mo27246b(long j, String str) {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: d */
    public boolean mo27248d() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: c */
    public DrivePriority.DownloadPriority mo27247c() {
        return f18716d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo27249e() {
        return this.f18718e.mo27224f();
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public String mo27240a(AbstractC6946a aVar) {
        return C6880a.m27074a(aVar);
    }

    public C6930g(AbstractC7095c cVar, C6923a aVar) {
        this.f18718e = aVar;
        this.f18719f = cVar;
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public File mo27239a(Context context, long j) {
        return C6880a.m27088b(context);
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public boolean mo27243a(long j, String str) {
        if (!this.f18719f.mo27714c(str, null) && j <= mo27249e()) {
            return true;
        }
        return false;
    }
}
