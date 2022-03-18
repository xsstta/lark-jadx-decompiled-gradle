package com.bytedance.ee.bear.drive.config.strategy;

import android.content.Context;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import java.io.File;

/* renamed from: com.bytedance.ee.bear.drive.config.strategy.b */
public class C6925b implements AbstractC6927d {

    /* renamed from: e */
    private ConnectionService f18711e;

    /* renamed from: f */
    private AbstractC7095c f18712f;

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
    public boolean mo27243a(long j, String str) {
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: b */
    public String mo27245b() {
        return "4";
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
        return f18713a;
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public String mo27240a(AbstractC6946a aVar) {
        return C6880a.m27074a(aVar) + "_origin";
    }

    public C6925b(AbstractC7095c cVar, ConnectionService connectionService) {
        this.f18711e = connectionService;
        this.f18712f = cVar;
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public File mo27239a(Context context, long j) {
        if (mo27243a(j, "")) {
            return C6880a.m27088b(context);
        }
        return C6880a.m27111g(context);
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public boolean mo27244a(C6880a aVar, AbstractC6949c cVar) {
        boolean a = C6932i.m27447a(this.f18711e, cVar.mo27377g(), mo27245b());
        if (!a || aVar == null) {
            return a;
        }
        if (aVar.mo27076a(C6880a.m27076a(cVar.mo27372b()), false) == null) {
            return true;
        }
        return false;
    }
}
