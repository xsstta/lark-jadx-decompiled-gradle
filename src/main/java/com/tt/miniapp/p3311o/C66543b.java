package com.tt.miniapp.p3311o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.maplocate.TMALocation;
import com.tt.miniapp.p3335u.C66998c;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.o.b */
public class C66543b implements Handler.Callback {

    /* renamed from: b */
    public static volatile TMALocation f168007b;

    /* renamed from: a */
    boolean f168008a;

    /* renamed from: c */
    private AbstractC67565b f168009c;

    /* renamed from: d */
    private AbstractC66545a f168010d;

    /* renamed from: e */
    private long f168011e;

    /* renamed from: f */
    private Handler f168012f = new Handler(Looper.getMainLooper(), this);

    /* renamed from: g */
    private String f168013g;

    /* renamed from: h */
    private IAppContext f168014h;

    /* renamed from: com.tt.miniapp.o.b$a */
    public interface AbstractC66545a {
        /* renamed from: a */
        void mo88310a(TMALocation tMALocation);

        /* renamed from: a */
        void mo88311a(String str);
    }

    /* renamed from: a */
    public TMALocation mo232103a() {
        C66998c.m261128a(this.f168014h).mo233045a(12);
        C66998c.m261128a(this.f168014h).mo233047b(12);
        return f168007b;
    }

    /* renamed from: b */
    public void mo232107b() {
        AppBrandLogger.m52828d("LocateCrossProcessRequester", "locate stopTimer");
        this.f168012f.removeMessages(1);
    }

    /* renamed from: a */
    public void mo232105a(TMALocation tMALocation) {
        if (!this.f168008a) {
            m259968b(tMALocation);
            this.f168008a = true;
        }
    }

    /* renamed from: b */
    private void m259969b(String str) {
        AbstractC66545a aVar = this.f168010d;
        if (aVar != null) {
            aVar.mo88311a(str);
        }
        C66998c.m261128a(this.f168014h).mo233047b(12);
    }

    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        AppBrandLogger.m52828d("LocateCrossProcessRequester", "locate timeout");
        this.f168009c.mo234711d();
        mo232106a("timeout");
        return true;
    }

    /* renamed from: b */
    private void m259968b(TMALocation tMALocation) {
        if (C66998c.m261128a(this.f168014h).mo233048c(12)) {
            m259969b(C66578b.m260105a(this.f168013g));
            return;
        }
        AbstractC66545a aVar = this.f168010d;
        if (aVar != null) {
            aVar.mo88310a(new TMALocation(tMALocation));
        }
        C66998c.m261128a(this.f168014h).mo233047b(12);
    }

    /* renamed from: a */
    public void mo232106a(String str) {
        if (!this.f168008a) {
            AppBrandLogger.m52828d("LocateCrossProcessRequester", "callBackFailedWithCache：" + str);
            TMALocation tMALocation = f168007b;
            if (TMALocation.m259831a(tMALocation)) {
                m259968b(tMALocation);
                return;
            }
            m259969b(str);
            mo232107b();
            this.f168008a = true;
        }
    }

    public C66543b(String str, IAppContext iAppContext) {
        this.f168013g = str;
        this.f168014h = iAppContext;
        this.f168009c = new AbstractC67565b() {
            /* class com.tt.miniapp.p3311o.C66543b.C665441 */

            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
            /* renamed from: a */
            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                AppBrandLogger.m52828d("LocateCrossProcessRequester", "onIpcCallback ", crossProcessDataEntity);
                C66543b.this.mo232107b();
                if (crossProcessDataEntity == null) {
                    C66543b.this.mo232106a("callback failed");
                    return;
                }
                String b = crossProcessDataEntity.mo234744b("locationResult");
                if (TextUtils.isEmpty(b)) {
                    C66543b.this.mo232106a("ipcnull");
                    return;
                }
                try {
                    TMALocation a = TMALocation.m259830a(new JSONObject(b));
                    if (a == null) {
                        C66543b.this.mo232106a("other");
                    } else if (crossProcessDataEntity.mo234748e("code") == -1) {
                        C66543b bVar = C66543b.this;
                        bVar.mo232106a("loctype:" + a.mo232053i() + "_code:" + a.mo232036a() + "_rawcode:" + a.mo232039b());
                    } else if (a.mo232036a() == 0) {
                        AppBrandLogger.m52828d("LocateCrossProcessRequester", "onIpcCallback SUCCESS");
                        C66543b.f168007b = a;
                        C66543b.this.mo232105a(a);
                    }
                } catch (Exception e) {
                    AppBrandLogger.eWithThrowable("LocateCrossProcessRequester", "fromjson", e);
                    C66543b.this.mo232106a("tmalocation_fromjson");
                }
            }
        };
    }

    /* renamed from: a */
    public void mo232104a(long j, AbstractC66545a aVar) {
        C66998c.m261128a(this.f168014h).mo233045a(12);
        this.f168011e = j;
        this.f168012f.sendEmptyMessageDelayed(1, j);
        this.f168010d = aVar;
        AppBrandLogger.m52828d("LocateCrossProcessRequester", "startCrossProcessLocate cross process");
        C66612a.m260223a(this.f168009c);
    }
}
