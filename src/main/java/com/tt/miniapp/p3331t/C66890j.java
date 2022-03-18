package com.tt.miniapp.p3331t;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.container.C24692p;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3331t.AbstractC66882c;
import com.tt.miniapp.util.C67049n;
import com.tt.miniapp.util.C67054r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.t.j */
public class C66890j implements AbstractC66882c {

    /* renamed from: a */
    protected IAppContext f168713a;

    /* renamed from: b */
    private boolean f168714b;

    /* renamed from: c */
    private int f168715c;

    /* renamed from: d */
    private JSONObject f168716d;

    /* renamed from: e */
    private List<AbstractC66884d> f168717e = new ArrayList();

    /* renamed from: f */
    private final AtomicBoolean f168718f = new AtomicBoolean(false);

    /* renamed from: g */
    public boolean mo232878g() {
        if (this.f168715c > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo232879h() {
        if (this.f168715c > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo232877f() {
        return this.f168718f.compareAndSet(true, false);
    }

    /* renamed from: a */
    public void mo232870a() {
        if (this.f168714b) {
            C67049n.m261316c(this.f168713a);
        } else {
            this.f168717e.add(new C66886f(this.f168713a));
        }
    }

    /* renamed from: c */
    public void mo232874c() {
        if (this.f168714b) {
            C67049n.m261315b(this.f168713a);
            return;
        }
        this.f168717e.add(new C66888h(this.f168713a));
    }

    /* renamed from: d */
    public void mo232875d() {
        if (this.f168714b) {
            C67049n.m261309a(this.f168713a);
            return;
        }
        this.f168717e.add(new C66885e(this.f168713a));
    }

    /* renamed from: e */
    public void mo232876e() {
        if (this.f168714b) {
            C67049n.m261318e(this.f168713a);
            return;
        }
        this.f168717e.add(new C66889i(this.f168713a));
    }

    /* renamed from: b */
    public void mo232873b() {
        if (!this.f168714b) {
            this.f168714b = true;
            if (!this.f168717e.isEmpty()) {
                for (AbstractC66884d dVar : this.f168717e) {
                    if (dVar != null) {
                        dVar.mo232868a();
                        AppBrandLogger.m52828d("RouteEventCtrl", "post delay message" + dVar.mo232869b());
                    }
                }
                this.f168717e.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d0  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo232880i() {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.p3331t.C66890j.mo232880i():org.json.JSONObject");
    }

    public C66890j(IAppContext iAppContext) {
        this.f168713a = iAppContext;
    }

    /* renamed from: a */
    public void mo232871a(AbstractC66882c.C66883a aVar) {
        if (aVar != null) {
            if (this.f168714b) {
                boolean z = true;
                int i = this.f168715c + 1;
                this.f168715c = i;
                if (i == 1) {
                    C24692p.m89746a(this.f168713a);
                }
                C67049n.m261307a(aVar.mo232863a(), aVar.mo232864b(), aVar.mo232865c(), aVar.mo232866d(), aVar.mo232867e(), this.f168713a);
                if (C25529d.m91167h(this.f168713a)) {
                    AtomicBoolean atomicBoolean = this.f168718f;
                    if (!TextUtils.equals(aVar.mo232866d(), "navigateBack") && !TextUtils.equals(aVar.mo232866d(), "switchTab") && !TextUtils.equals(aVar.mo232866d(), "reLaunch")) {
                        z = false;
                    }
                    atomicBoolean.compareAndSet(false, z);
                    return;
                }
                return;
            }
            this.f168717e.add(new C66887g(aVar, this.f168713a));
        }
    }

    /* renamed from: a */
    public boolean mo232872a(String str, String str2) {
        if (!C67054r.m261340a(str, this.f168713a)) {
            AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f168713a).getAppConfig();
            if (appConfig == null) {
                return false;
            }
            str = appConfig.f165497d;
        }
        if (!TextUtils.equals(C67054r.m261343b(str), C67054r.m261343b(str2)) || !C67054r.m261342a(str, str2)) {
            return true;
        }
        return false;
    }
}
