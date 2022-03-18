package com.ss.android.lark.mail.impl.settings.mainpage;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.email.client.v1.EmailClientConfig;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.C42094f;
import com.ss.android.lark.mail.impl.entity.MailClientConfig;
import com.ss.android.lark.mail.impl.entity.UserType;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43418b;
import com.ss.android.lark.mail.impl.settings.mainpage.C43437a;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.settings.mainpage.b */
public class C43442b extends C43418b implements C43437a.AbstractC43438a {

    /* renamed from: b */
    public C1177w<Boolean> f110351b = new C1177w<>();

    /* renamed from: c */
    public C1177w<Boolean> f110352c = new C1177w<>();

    /* renamed from: d */
    private C1177w<Integer> f110353d = new C1177w<>();

    /* renamed from: e */
    private C1177w<List<C42087a>> f110354e = new C1177w<>();

    /* renamed from: f */
    private C43437a.AbstractC43438a.AbstractC43439a f110355f;

    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.C43418b, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.p2220a.AbstractC43400b
    /* renamed from: a */
    public LiveData<Boolean> mo155181a() {
        return this.f110352c;
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.p2221b.AbstractC43405a
    /* renamed from: b */
    public LiveData<Boolean> mo155193b() {
        return this.f110351b;
    }

    @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43437a.AbstractC43438a
    /* renamed from: e */
    public C1177w<Integer> mo155248e() {
        return this.f110353d;
    }

    @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43437a.AbstractC43438a
    /* renamed from: f */
    public C1177w<List<C42087a>> mo155249f() {
        return this.f110354e;
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.C43418b, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f110353d.mo5929b((Integer) 1);
    }

    @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43437a.AbstractC43438a
    /* renamed from: g */
    public void mo155250g() {
        Log.m165389i("MailAccountService", "reloadData from enter setting page");
        C43350d.m172098a().mo154944h();
    }

    public C43442b() {
        super(C43277a.m171921a().mo154946j());
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.p2221b.AbstractC43405a
    /* renamed from: a */
    public void mo155192a(IGetDataCallback<C42093e> iGetDataCallback) {
        C43350d.m172099a(this.f110330a).mo155034a(false, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo155253a(C42088b bVar) {
        if (bVar == null) {
            this.f110353d.mo5926a((Integer) -1);
            return;
        }
        this.f110353d.mo5926a((Integer) 2);
        this.f110354e.mo5926a(bVar.mo151820b());
    }

    @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43437a.AbstractC43438a
    /* renamed from: a */
    public void mo155247a(C43437a.AbstractC43438a.AbstractC43439a aVar) {
        this.f110355f = aVar;
        C43277a.m171921a().mo154953q().mo5923a(this.f110355f.mo155251a(), new AbstractC1178x<C42088b>() {
            /* class com.ss.android.lark.mail.impl.settings.mainpage.C43442b.C434431 */

            /* renamed from: a */
            public void onChanged(C42088b bVar) {
                C42087a aVar;
                C43442b.this.mo155253a(bVar);
                if (bVar != null) {
                    aVar = bVar.mo151818a(C43277a.m171921a().mo154946j());
                } else {
                    aVar = null;
                }
                if (aVar != null && aVar.f107030g == 1) {
                    C43442b.this.f110352c.mo5926a((Boolean) true);
                }
            }
        });
        C43350d.m172098a().mo155042g().mo5923a(this.f110355f.mo155251a(), new AbstractC1178x<C42094f>() {
            /* class com.ss.android.lark.mail.impl.settings.mainpage.C43442b.C434442 */

            /* renamed from: a */
            public void onChanged(C42094f fVar) {
                MailClientConfig mailClientConfig;
                if (fVar != null) {
                    mailClientConfig = fVar.mo151894i();
                } else {
                    mailClientConfig = null;
                }
                if (fVar == null || fVar.mo151884e() == UserType.LARK_SERVER || fVar.mo151884e() == UserType.GMAIL_API_CLIENT || fVar.mo151884e() == UserType.EXCHANGE_API_CLIENT) {
                    C43442b.this.f110351b.mo5926a((Boolean) false);
                } else if (fVar.mo151884e() == UserType.EXCHANGE_CLIENT || mailClientConfig == null || (mailClientConfig.mo151295a() && mailClientConfig.mo151297c() == EmailClientConfig.ConfigStatus.VALID)) {
                    C43442b.this.f110351b.mo5926a((Boolean) true);
                } else {
                    C43442b.this.f110351b.mo5926a((Boolean) false);
                }
            }
        });
    }
}
