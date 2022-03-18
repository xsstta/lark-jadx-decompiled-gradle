package com.bytedance.ee.bear.drive.preload;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.loader.download.model.p357a.C7008a;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.C7046h;
import com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7064c;
import com.bytedance.ee.bear.drive.loader.download.platform.api.C7067e;
import com.bytedance.ee.bear.drive.loader.download.platform.api.drive.PreviewGetV1Puller;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.model.C7090c;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.preload.d */
public class C7116d {

    /* renamed from: a */
    public static int f19175a = 0;

    /* renamed from: b */
    public static int f19176b = 1;

    /* renamed from: c */
    private AbstractC7064c<PreviewGetV1Puller.Params, C7008a> f19177c;

    /* renamed from: d */
    private AbstractC7095c f19178d;

    /* renamed from: e */
    private C7115c f19179e = new C7115c();

    /* renamed from: f */
    private String f19180f;

    /* renamed from: g */
    private long f19181g;

    /* renamed from: a */
    public void mo27848a() {
        C7121h.m28531b();
    }

    /* renamed from: b */
    private boolean m28496b() {
        if (!TextUtils.isEmpty(this.f19180f)) {
            return true;
        }
        C13479a.m54758a("DrivePreloadExecutor", "checkAccountSession session is empty");
        return false;
    }

    public C7116d(C10917c cVar) {
        C6920b f = C6920b.m27342f();
        this.f19177c = C7067e.m28107a(cVar);
        this.f19178d = f.mo27169d();
        this.f19181g = f.mo27168c().mo27225g();
        AccountService.Account f2 = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        if (f2 != null) {
            this.f19180f = f2.f14591h;
        } else {
            C13479a.m54764b("DrivePreloadExecutor", "accountService.findUserFromCache() return null. ");
        }
        C7121h.m28528a();
    }

    /* renamed from: b */
    private boolean m28497b(C7086a aVar) {
        if (!this.f19178d.mo27714c(aVar.mo27322a().mo27364g(), aVar.mo27351r())) {
            C13479a.m54764b("DrivePreloadExecutor", "not video preload");
            return false;
        }
        C13479a.m54764b("DrivePreloadExecutor", "add video preload " + " " + C13598b.m55197d(aVar.mo27322a().f18785a));
        List<Integer> b = aVar.mo27325b();
        if (!C13657b.m55421a(b) && (b.contains(3) || b.contains(20))) {
            return true;
        }
        C13479a.m54758a("DrivePreloadExecutor", "server not support transform");
        return false;
    }

    /* renamed from: a */
    public int mo27847a(C7086a aVar) {
        String str;
        try {
            if (!m28496b()) {
                return f19175a;
            }
            if (!m28497b(aVar)) {
                return f19175a;
            }
            if (C6892d.m27252j(aVar.mo27322a().mo27364g())) {
                aVar.mo27318a(20);
                aVar.mo27319a("ogg");
            } else {
                aVar.mo27318a(3);
                aVar.mo27319a("MP4");
            }
            C7008a a = PreviewGetHelper.m28520a(this.f19177c, aVar);
            if (a.mo27547f() != null && a.mo27547f().contains("audio/ogg")) {
                aVar.mo27337e("audio/ogg");
                return f19176b;
            } else if (PreviewGetHelper.m28522b(a) || PreviewGetHelper.m28523c(a) == null) {
                if (C6892d.m27252j(aVar.mo27322a().mo27364g())) {
                    str = C7046h.m28055a(aVar);
                    aVar.mo27330c(str);
                } else {
                    str = PreviewGetHelper.m28523c(a);
                    aVar.mo27321a(PreviewGetHelper.m28521a(a));
                }
                VideoCacheInfo c = this.f19179e.mo27846c(aVar.mo27322a().f18785a, aVar.mo27322a().f19098q);
                if (c != null) {
                    if (c.isDataVersionChanged(C7090c.m28237a(aVar))) {
                        C13479a.m54764b("DrivePreloadExecutor", "data version changed");
                        this.f19179e.mo27844a(aVar.mo27322a().f18785a, aVar.mo27322a().f19098q);
                    } else if (c.isPreviewUrlChanged(str)) {
                        C13479a.m54764b("DrivePreloadExecutor", "preview url changed");
                        this.f19179e.mo27844a(aVar.mo27322a().f18785a, aVar.mo27322a().f19098q);
                    } else {
                        C13479a.m54764b("DrivePreloadExecutor", "videoCacheInfo not changed");
                    }
                }
                this.f19179e.mo27843a(aVar, aVar.mo27322a().f18785a);
                C7121h.m28530a(this.f19180f, C7115c.m28490d(aVar.mo27322a().f18785a, aVar.mo27322a().f19098q), str, this.f19181g);
                return f19175a;
            } else {
                C13479a.m54764b("DrivePreloadExecutor", "preview get not ready");
                return f19175a;
            }
        } catch (Exception e) {
            C13479a.m54761a("DrivePreloadExecutor", e);
        }
    }
}
