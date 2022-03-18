package com.bytedance.ee.bear.drive.config;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.config.fg.DriveCacheConfig;
import com.bytedance.ee.bear.drive.config.fg.DrivePreviewConfig;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.config.strategy.C6924a;
import com.bytedance.ee.bear.drive.config.strategy.C6925b;
import com.bytedance.ee.bear.drive.config.strategy.C6926c;
import com.bytedance.ee.bear.drive.config.strategy.C6928e;
import com.bytedance.ee.bear.drive.config.strategy.C6929f;
import com.bytedance.ee.bear.drive.config.strategy.C6930g;
import com.bytedance.ee.bear.drive.config.strategy.C6931h;
import com.bytedance.ee.bear.drive.config.strategy.C6933j;
import com.bytedance.ee.bear.drive.config.strategy.C6934k;
import com.bytedance.ee.bear.drive.config.strategy.C6935l;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.mimetype.C7093a;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.drive.report.C7133d;
import com.bytedance.ee.bear.drive.view.p362a.C7207a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.drive.config.b */
public class C6920b implements AbstractC6910a {

    /* renamed from: a */
    private C7130c f18685a;

    /* renamed from: b */
    private C7128a f18686b;

    /* renamed from: c */
    private Map<Class<? extends AbstractC6927d>, AbstractC6927d> f18687c;

    /* renamed from: d */
    private C7207a f18688d;

    /* renamed from: e */
    private C6923a f18689e;

    /* renamed from: f */
    private C7133d f18690f;

    /* renamed from: g */
    private AbstractC7095c f18691g;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.config.b$a */
    public static final class C6922a {

        /* renamed from: a */
        static C6920b f18692a = new C6920b(new C10917c(new C10929e()));
    }

    /* renamed from: f */
    public static C6920b m27342f() {
        return C6922a.f18692a;
    }

    @Override // com.bytedance.ee.bear.drive.config.AbstractC6910a
    /* renamed from: a */
    public C7130c mo27166a() {
        return this.f18685a;
    }

    @Override // com.bytedance.ee.bear.drive.config.AbstractC6910a
    /* renamed from: b */
    public C7128a mo27167b() {
        return this.f18686b;
    }

    @Override // com.bytedance.ee.bear.drive.config.AbstractC6910a
    /* renamed from: c */
    public C6923a mo27168c() {
        return this.f18689e;
    }

    @Override // com.bytedance.ee.bear.drive.config.AbstractC6910a
    /* renamed from: d */
    public AbstractC7095c mo27169d() {
        return this.f18691g;
    }

    /* renamed from: g */
    public C7207a mo27178g() {
        return this.f18688d;
    }

    @Override // com.bytedance.ee.bear.drive.config.AbstractC6910a
    /* renamed from: e */
    public C6880a mo27170e() {
        return C6880a.m27065a();
    }

    /* renamed from: h */
    private void m27343h() {
        C13479a.m54764b("DriveConfigServiceImpl", "start fetch drive config");
        this.f18689e.mo27223e(((Integer) C4211a.m17514a().mo16533a("drive_convert_file_size_limit", (Object) 20)).intValue());
        try {
            JSONObject jSONObject = new JSONObject((String) C4211a.m17514a().mo16533a("drive_preload_config", ""));
            this.f18689e.mo27209a(jSONObject.optInt("recent"));
            this.f18689e.mo27216b(jSONObject.optInt("favorite"));
            this.f18689e.mo27219c(jSONObject.optInt("pin"));
            this.f18689e.mo27210a(jSONObject.optLong("file_max_size"));
            this.f18689e.mo27217b(jSONObject.optLong("cache_video_size"));
            this.f18689e.mo27221d(jSONObject.optInt("default"));
        } catch (Exception e) {
            C13479a.m54761a("DriveConfigServiceImpl", e);
        }
        this.f18689e.mo27213a(C4211a.m17514a().mo16536a("spacekit.mobile.drive.ppt_presentation_mode", false));
        this.f18689e.mo27212a((DrivePreviewConfig) C4211a.m17514a().mo16532a("drive_preview_config", DrivePreviewConfig.class, new DrivePreviewConfig()));
        this.f18689e.mo27211a((DriveCacheConfig) C4211a.m17514a().mo16532a("drive_cache_config", DriveCacheConfig.class, new DriveCacheConfig()));
        C13479a.m54764b("DriveConfigServiceImpl", "fetch drive config finish, config=" + this.f18689e);
    }

    @Override // com.bytedance.ee.bear.drive.config.AbstractC6910a
    /* renamed from: a */
    public AbstractC6927d mo27165a(Class<? extends AbstractC6927d> cls) {
        return this.f18687c.get(cls);
    }

    private C6920b(C10917c cVar) {
        this.f18687c = new HashMap();
        this.f18689e = new C6923a();
        C7133d dVar = new C7133d();
        this.f18690f = dVar;
        this.f18685a = new C7130c(cVar, dVar);
        this.f18686b = new C7128a(cVar, this.f18690f);
        this.f18691g = new C7093a(C13615c.f35773a, this.f18686b);
        ConnectionService d = C5084ad.m20847d();
        this.f18687c.put(C6931h.class, new C6931h(this.f18691g, d, this.f18689e));
        this.f18687c.put(C6935l.class, new C6935l(this.f18691g, d, this.f18689e));
        this.f18687c.put(C6934k.class, new C6934k(this.f18691g, d, this.f18689e));
        this.f18687c.put(C6926c.class, new C6926c(this.f18691g, d, this.f18689e));
        this.f18687c.put(C6925b.class, new C6925b(this.f18691g, d));
        this.f18687c.put(C6930g.class, new C6930g(this.f18691g, this.f18689e));
        this.f18687c.put(C6933j.class, new C6933j(this.f18691g, this.f18689e));
        this.f18687c.put(C6924a.class, new C6924a(this.f18691g, d, this.f18689e));
        this.f18687c.put(C6928e.class, new C6928e(this.f18691g, d, this.f18689e));
        this.f18687c.put(C6929f.class, new C6929f(d));
        this.f18688d = new C7207a();
        m27343h();
    }
}
