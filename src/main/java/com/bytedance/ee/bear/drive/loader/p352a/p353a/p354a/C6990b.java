package com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a;

import com.bytedance.ee.bear.contract.drive.DriveCache;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.config.strategy.C6934k;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.loader.a.a.a.b */
public class C6990b extends AbstractC6984a<C7086a> {
    public C6990b(AbstractC6927d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.AbstractC6993e
    /* renamed from: b */
    public String mo27522b(AbstractC6949c<C7086a> cVar) {
        return this.f18898b.mo27240a(cVar.mo27371a());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.AbstractC6984a
    /* renamed from: a */
    public boolean mo27518a(DriveCache driveCache, AbstractC6949c<C7086a> cVar) {
        boolean a = super.mo27518a(driveCache, cVar);
        if (!a || !(this.f18898b instanceof C6934k) || (driveCache.mo20325b() != null && driveCache.mo20325b().exists())) {
            return a;
        }
        C13479a.m54764b("DriveComponent", "DriveCacheHandler#availableCache() not enable streaming and not found cache in vc");
        return false;
    }
}
