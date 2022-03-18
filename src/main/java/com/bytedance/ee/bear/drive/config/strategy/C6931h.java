package com.bytedance.ee.bear.drive.config.strategy;

import android.content.Context;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.drive.biz.plugin.C6535d;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import java.io.File;

/* renamed from: com.bytedance.ee.bear.drive.config.strategy.h */
public class C6931h implements AbstractC6927d {

    /* renamed from: e */
    private ConnectionService f18720e;

    /* renamed from: f */
    private AbstractC7095c f18721f;

    /* renamed from: g */
    private C6923a f18722g;

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public String mo27238a() {
        return "explorer";
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
        return "1";
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: d */
    public boolean mo27248d() {
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: c */
    public DrivePriority.DownloadPriority mo27247c() {
        return f18714b;
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public String mo27240a(AbstractC6946a aVar) {
        return C6880a.m27074a(aVar);
    }

    /* renamed from: a */
    private static boolean m27433a(AbstractC6949c cVar) {
        if (cVar == null || cVar.mo27376f() == null || cVar.mo27376f().size() <= 0) {
            return false;
        }
        return true;
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
    /* renamed from: b */
    public boolean mo27246b(long j, String str) {
        if (!this.f18721f.mo27722k(str, null) || C6535d.m26240e(this.f18722g)) {
            if (!this.f18721f.mo27719h(str, null) || j <= ((long) (this.f18722g.mo27227i().getText_preview_max_size() * 1024))) {
                return false;
            }
            return true;
        } else if (j > ((long) (this.f18722g.mo27227i().getExcel_tab_data_max_size() * 1024))) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public boolean mo27244a(C6880a aVar, AbstractC6949c cVar) {
        boolean z;
        boolean z2 = true;
        if (!C6932i.m27447a(this.f18720e, cVar.mo27377g(), mo27245b()) || (!this.f18721f.mo27712a(cVar.mo27373c()) && !m27433a(cVar))) {
            z = false;
        } else {
            z = true;
        }
        if (!z || aVar == null) {
            return z;
        }
        if (aVar.mo27076a(C6880a.m27076a(cVar.mo27372b()), false) != null) {
            z2 = false;
        }
        return z2;
    }

    public C6931h(AbstractC7095c cVar, ConnectionService connectionService, C6923a aVar) {
        this.f18720e = connectionService;
        this.f18721f = cVar;
        this.f18722g = aVar;
    }
}
