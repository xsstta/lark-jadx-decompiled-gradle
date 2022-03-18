package com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.drive.DriveCache;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.config.strategy.C6929f;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.AbstractC6993e;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import java.io.File;

/* renamed from: com.bytedance.ee.bear.drive.loader.a.a.a.a */
public abstract class AbstractC6984a<FM extends AbstractC6946a> implements AbstractC6993e<FM> {

    /* renamed from: a */
    protected final C6880a f18897a = C6880a.m27065a();

    /* renamed from: b */
    protected final AbstractC6927d f18898b;

    /* renamed from: c */
    protected C7128a f18899c;

    @Override // com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.AbstractC6993e
    /* renamed from: a */
    public boolean mo27519a(AbstractC6949c<FM> cVar) {
        return mo27520a(cVar, (AbstractC6993e.AbstractC6994a) null);
    }

    public AbstractC6984a(AbstractC6927d dVar) {
        this.f18898b = dVar;
        this.f18899c = C6920b.m27342f().mo27167b();
    }

    /* renamed from: a */
    private DriveCache m27813a(String str) {
        DriveCache a = this.f18897a.mo27076a(str, !TextUtils.equals(this.f18898b.mo27245b(), "2"));
        if (a == null || !a.mo20346k()) {
            return a;
        }
        C13479a.m54764b("DriveComponent", "Download findCacheFile() is wps cache, ignore it");
        return null;
    }

    /* renamed from: c */
    private void m27815c(AbstractC6949c<FM> cVar) {
        cVar.mo27397e(new File(this.f18898b.mo27239a(C13615c.f35773a, cVar.mo27377g()).getAbsolutePath(), mo27522b(cVar)).getAbsolutePath());
    }

    /* renamed from: a */
    private boolean m27814a(AbstractC6993e.AbstractC6994a aVar, C7086a aVar2) {
        if (aVar == null) {
            return true;
        }
        return aVar.mo27526a(this.f18898b, aVar2.mo27322a().mo27364g(), aVar2.mo27333d(), aVar2.mo27339f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo27518a(DriveCache driveCache, AbstractC6949c<FM> cVar) {
        if (driveCache == null || cVar.mo27380j() == null || !TextUtils.equals(driveCache.mo20337g(), cVar.mo27372b()) || !TextUtils.equals(driveCache.mo20330d(), cVar.mo27375e()) || !driveCache.mo20328c().equalsIgnoreCase(cVar.mo27380j()) || !TextUtils.equals(driveCache.mo20348m(), cVar.mo27371a().mo27351r())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.AbstractC6993e
    /* renamed from: a */
    public boolean mo27520a(AbstractC6949c<FM> cVar, AbstractC6993e.AbstractC6994a aVar) {
        this.f18899c.mo27896b(cVar.mo27372b(), "local_cache", this.f18898b);
        FM a = cVar.mo27371a();
        m27815c(cVar);
        String b = mo27522b(cVar);
        DriveCache a2 = m27813a(b);
        C7086a a3 = C6880a.m27066a(a.mo27322a().f18785a, a2, "");
        if (!mo27518a(a2, cVar) || !m27814a(aVar, a3)) {
            return false;
        }
        this.f18899c.mo27884a("local_cache", a3, this.f18898b);
        a.mo27334d(a3.mo27343j());
        a.mo27328b(true);
        if (!TextUtils.equals(a3.mo27322a().mo27358a(), a.mo27322a().mo27358a())) {
            this.f18897a.mo27090b(b, a.mo27322a().mo27358a());
        }
        if ((this.f18898b instanceof C6929f) && a2.mo20333e() != 2) {
            C13479a.m54764b("DRIVE_PREVIEW_FLOW", "convertCacheTypeSync");
            this.f18897a.mo27086a(b, a2.mo20333e(), 2);
        }
        return true;
    }
}
