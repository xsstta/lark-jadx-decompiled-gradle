package com.ss.android.lark.mail.impl.settings.subsetting.accountdetail;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.email.client.v1.EmailClientConfig;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.C42094f;
import com.ss.android.lark.mail.impl.entity.MailClientConfig;
import com.ss.android.lark.mail.impl.entity.UserType;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43418b;
import com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.AbstractC43470c;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.a */
public class C43459a extends C43418b implements AbstractC43470c.AbstractC43471a {

    /* renamed from: b */
    public C1177w<C42087a> f110392b = new C1177w<>();

    /* renamed from: c */
    public C1177w<Boolean> f110393c = new C1177w<>();

    /* renamed from: d */
    public C1177w<Boolean> f110394d = new C1177w<>();

    /* renamed from: e */
    public String f110395e;

    /* renamed from: f */
    private AbstractC43470c.AbstractC43471a.AbstractC43472a f110396f;

    @Override // com.ss.android.lark.mail.impl.settings.component.p2220a.AbstractC43400b
    /* renamed from: a */
    public LiveData<Boolean> mo155181a() {
        return this.f110393c;
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.p2221b.AbstractC43405a
    /* renamed from: b */
    public LiveData<Boolean> mo155193b() {
        return this.f110394d;
    }

    /* renamed from: e */
    public String mo155282e() {
        return this.f110395e;
    }

    /* renamed from: f */
    public LiveData<C42087a> mo155283f() {
        return this.f110392b;
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.C43418b, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f110396f = null;
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.p2221b.AbstractC43405a
    /* renamed from: a */
    public void mo155192a(IGetDataCallback<C42093e> iGetDataCallback) {
        C43350d.m172099a(this.f110330a).mo155034a(false, iGetDataCallback);
    }

    public C43459a(String str) {
        super(str);
        this.f110395e = str;
    }

    /* renamed from: a */
    public void mo155281a(AbstractC43470c.AbstractC43471a.AbstractC43472a aVar) {
        this.f110396f = aVar;
        C43277a.m171921a().mo154953q().mo5923a(this.f110396f.mo155288a(), new AbstractC1178x<C42088b>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.C43459a.C434601 */

            /* renamed from: a */
            public void onChanged(C42088b bVar) {
                C42087a aVar;
                if (bVar != null) {
                    aVar = bVar.mo151818a(C43459a.this.f110395e);
                } else {
                    aVar = null;
                }
                C43459a.this.f110392b.mo5929b(aVar);
            }
        });
        C43350d.m172099a(this.f110395e).mo155042g().mo5923a(this.f110396f.mo155288a(), new AbstractC1178x<C42094f>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.C43459a.C434612 */

            /* renamed from: a */
            public void onChanged(C42094f fVar) {
                MailClientConfig mailClientConfig;
                if (fVar != null) {
                    mailClientConfig = fVar.mo151894i();
                } else {
                    mailClientConfig = null;
                }
                if (fVar.mo151884e() == UserType.LARK_SERVER || fVar.mo151884e() == UserType.GMAIL_API_CLIENT || fVar.mo151884e() == UserType.EXCHANGE_API_CLIENT) {
                    C43459a.this.f110393c.mo5926a((Boolean) false);
                    C43459a.this.f110394d.mo5926a((Boolean) false);
                } else if (fVar.mo151884e() == UserType.EXCHANGE_CLIENT || mailClientConfig == null || (mailClientConfig.mo151295a() && mailClientConfig.mo151297c() == EmailClientConfig.ConfigStatus.VALID)) {
                    C43459a.this.f110393c.mo5926a((Boolean) false);
                    C43459a.this.f110394d.mo5926a((Boolean) true);
                } else {
                    C43459a.this.f110393c.mo5926a((Boolean) true);
                    C43459a.this.f110394d.mo5926a((Boolean) false);
                }
            }
        });
    }
}
