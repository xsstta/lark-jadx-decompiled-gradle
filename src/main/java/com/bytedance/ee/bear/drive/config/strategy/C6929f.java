package com.bytedance.ee.bear.drive.config.strategy;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.drive.DriveCache;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import java.io.File;

/* renamed from: com.bytedance.ee.bear.drive.config.strategy.f */
public class C6929f implements AbstractC6927d {

    /* renamed from: e */
    private ConnectionService f18717e;

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
        return "6";
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
        return f18715c;
    }

    public C6929f(ConnectionService connectionService) {
        this.f18717e = connectionService;
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public String mo27240a(AbstractC6946a aVar) {
        return C6880a.m27074a(aVar);
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public File mo27239a(Context context, long j) {
        return C6880a.m27116i(context);
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public boolean mo27244a(C6880a aVar, AbstractC6949c cVar) {
        boolean z;
        boolean z2 = true;
        if (cVar.mo27377g() <= 5242880 || !this.f18717e.mo20038b().mo20043d()) {
            z = false;
        } else {
            z = true;
        }
        if (!z || aVar == null) {
            return z;
        }
        DriveCache a = aVar.mo27076a(mo27240a(cVar.mo27371a()), false);
        if (a != null && TextUtils.equals(cVar.mo27375e(), a.mo20330d())) {
            z2 = false;
        }
        return z2;
    }
}
