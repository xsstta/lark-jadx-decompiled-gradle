package com.ss.android.lark.mail.impl.lark;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.C42038d;
import com.ss.android.lark.mail.impl.badge.C41832a;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.entity.C42089c;
import com.ss.android.lark.mail.impl.home.C42496e;
import com.ss.android.lark.mail.impl.home.p2184d.C42493b;
import com.ss.android.lark.mail.impl.lark.C42723b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42286k;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43345c;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.service.MailSplashService;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionManager;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44549f;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleInfo;

/* renamed from: com.ss.android.lark.mail.impl.lark.a */
public class C42717a implements AbstractC44552i, AbstractC44552i.AbstractC44555c {

    /* renamed from: a */
    Context f108729a;

    /* renamed from: b */
    AbstractC44548e f108730b;

    /* renamed from: c */
    AbstractC44549f f108731c;

    /* renamed from: d */
    public MailTabItemView f108732d;

    /* renamed from: e */
    public MailNavigationTabItemView f108733e;

    /* renamed from: f */
    public C42496e f108734f;

    /* renamed from: g */
    public long f108735g;

    /* renamed from: h */
    private boolean f108736h;

    /* renamed from: i */
    private String f108737i = "";

    /* renamed from: j */
    private C43345c.AbstractC43349b f108738j;

    /* renamed from: k */
    private AbstractC1178x f108739k;

    /* renamed from: l */
    private AbstractC44552i.AbstractC44553a f108740l = new AbstractC44552i.AbstractC44553a() {
        /* class com.ss.android.lark.mail.impl.lark.C42717a.C427181 */

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: b */
        public void mo31325b(String str, String str2) {
            boolean equals = TextUtils.equals("mail", str);
            boolean equals2 = TextUtils.equals("mail", str2);
            if (!(C42717a.this.f108732d == null && C42717a.this.f108733e == null) && !equals && equals2) {
                C43345c.m172076m().mo154993a(true);
            }
        }

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: a */
        public void mo31324a(String str, String str2) {
            int i;
            int i2;
            Log.m165389i("MailTabPageSpec", "afterPageSwitch pre: " + str + ", current: " + str2);
            boolean equals = TextUtils.equals("mail", str);
            boolean equals2 = TextUtils.equals("mail", str2);
            if (equals || equals2) {
                if (!equals && equals2) {
                    Log.m165389i("MailTabPageSpec", "afterPageSwitch switched to mail tab");
                    C43345c.m172076m().mo154993a(true);
                    if (C42717a.this.f108732d != null) {
                        C42717a.this.f108732d.mo110677a();
                    }
                    C42717a aVar = C42717a.this;
                    aVar.f108734f = aVar.mo31318i();
                    if (C42717a.this.f108734f != null) {
                        C42717a.this.f108734f.mo152898v();
                    }
                    C42089c b = C41832a.m166157a().mo150418d().mo5927b();
                    if (b != null) {
                        i = b.mo151826a();
                    } else {
                        i = 0;
                    }
                    if (b != null) {
                        i2 = b.mo151830b().getValue();
                    } else {
                        i2 = 0;
                    }
                    C42187a.m168467a(i, i2);
                    ThreadActionManager.initSync();
                    C42226b.m168638a().mo152308a("email_clicktab_and_showdone");
                    C42717a aVar2 = C42717a.this;
                    aVar2.mo153401a(aVar2.f108734f);
                }
                if (equals && !equals2) {
                    Log.m165389i("MailTabPageSpec", "afterPageSwitch switched out mail tab");
                    C43345c.m172076m().mo154993a(false);
                    if (C42717a.this.f108732d != null) {
                        C42717a.this.f108732d.mo110683b();
                    }
                    if (C42717a.this.f108734f != null) {
                        C42717a.this.f108734f.mo152897u();
                    }
                    C42187a.m168464a();
                }
                if (equals && equals2) {
                    Log.m165389i("MailTabPageSpec", "afterPageSwitch double click mail tab");
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - C42717a.this.f108735g < 300) {
                        C42717a.this.f108734f.mo152900x();
                        C42717a.this.f108735g = 0;
                    } else {
                        C42717a.this.f108735g = currentTimeMillis;
                    }
                }
                C42717a aVar3 = C42717a.this;
                aVar3.f108734f = aVar3.mo31318i();
                if (C42717a.this.f108734f != null && C42717a.this.f108734f.mo152858I() != null) {
                    C42717a.this.f108734f.mo152858I().mo153137s();
                    return;
                }
                return;
            }
            Log.m165389i("MailTabPageSpec", "afterPageSwitch abort");
        }
    };

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return "mail";
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return 1;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: h */
    public int mo31317h() {
        return 0;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: m */
    public AbstractC44552i.AbstractC44554b mo31322m() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return this.f108740l;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        m170330q();
        return this.f108732d;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: f */
    public void mo31315f() {
        Log.m165389i("MailTabPageSpec", "preloadPage");
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: n */
    public void mo31323n() {
        Log.m165389i("MailTabPageSpec", "reload");
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: e */
    public boolean mo31314e() {
        C42496e eVar = this.f108734f;
        if (eVar != null) {
            return eVar.mo152882g();
        }
        return false;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        C42496e eVar = this.f108734f;
        if (eVar != null) {
            return eVar.mo152850A();
        }
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44555c
    /* renamed from: s */
    public void mo103434s() {
        Log.m165389i("MailTabPageSpec", "resetPage");
        this.f108734f = null;
    }

    /* renamed from: q */
    private void m170330q() {
        if (this.f108732d == null) {
            Log.m165389i("MailTabPageSpec", "initMailView");
            this.f108732d = new MailTabItemView(this.f108729a);
            m170329p();
            this.f108732d.mo137108c();
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: j */
    public <T extends View> T mo31319j() {
        if (this.f108733e == null) {
            this.f108733e = new MailNavigationTabItemView(this.f108729a);
            m170329p();
            this.f108733e.mo153395a();
        }
        return this.f108733e;
    }

    /* renamed from: o */
    public void mo153402o() {
        C42496e eVar;
        if (this.f108736h && (eVar = this.f108734f) != null) {
            eVar.mo152878d();
        }
        this.f108736h = false;
        m170329p();
        C42496e eVar2 = this.f108734f;
        if (eVar2 != null) {
            eVar2.mo152880e();
        }
    }

    /* renamed from: a */
    public C42496e mo31318i() {
        C43374f.m172258a();
        if (this.f108734f == null) {
            C42496e c = C42723b.m170356a().mo153415c();
            this.f108734f = c;
            if (c != null) {
                Log.m165389i("MailTabPageSpec", "getPageContent, use preload ContentFragment");
            } else {
                this.f108734f = new C42496e();
            }
            this.f108734f.mo152865a(this.f108731c, this.f108730b);
        }
        return this.f108734f;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: g */
    public void mo31316g() {
        Log.m165389i("MailTabPageSpec", "destroy");
        C41832a.m166157a().mo150416b();
        if (this.f108739k != null) {
            C43277a.m171921a().mo154953q().mo5928b(this.f108739k);
        }
        MailTabItemView mailTabItemView = this.f108732d;
        if (mailTabItemView != null) {
            mailTabItemView.mo153398d();
        }
        MailNavigationTabItemView mailNavigationTabItemView = this.f108733e;
        if (mailNavigationTabItemView != null) {
            mailNavigationTabItemView.mo153396b();
        }
        C42723b.m170356a().mo153417d();
        C43345c.m172076m().mo154995b(this.f108738j);
    }

    /* renamed from: p */
    private void m170329p() {
        if (!this.f108736h) {
            this.f108736h = true;
            this.f108737i = C41816b.m166115a().mo150139f();
            Log.m165389i("MailTabPageSpec", "initMail: " + this.f108736h + "; " + this.f108737i);
            C43345c.m172076m().mo154989a();
            C41832a.m166157a().mo150417c();
            C42493b.m169603a();
        }
    }

    /* renamed from: a */
    public void mo153401a(C42723b.AbstractC42731a aVar) {
        if (aVar != null) {
            aVar.mo152864a(new C42723b.AbstractC42731a.AbstractC42732a() {
                /* class com.ss.android.lark.mail.impl.lark.C42717a.C427224 */

                @Override // com.ss.android.lark.mail.impl.lark.C42723b.AbstractC42731a.AbstractC42732a
                /* renamed from: a */
                public void mo153405a() {
                    Log.m165389i("MailTabPageSpec", "onFirstFrameDraw");
                    MailSplashService.m171910d().mo154919b();
                }

                @Override // com.ss.android.lark.mail.impl.lark.C42723b.AbstractC42731a.AbstractC42732a
                /* renamed from: a */
                public void mo153406a(boolean z) {
                    Log.m165389i("MailTabPageSpec", "onFirstContentDraw");
                    MailSplashService.m171910d().mo154921c();
                    if (z) {
                        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152372a("success", (long) C42038d.C42039a.m167221a());
                    }
                }
            });
        }
    }

    public C42717a(Context context, AbstractC44548e eVar, AbstractC44549f fVar) {
        this.f108729a = context;
        this.f108730b = eVar;
        this.f108731c = fVar;
        C42496e c = C42723b.m170356a().mo153415c();
        this.f108734f = c;
        if (c != null) {
            Log.m165389i("MailTabPageSpec", "use preload ContentFragment");
            this.f108734f.mo152865a(fVar, eVar);
        }
        if (this.f108739k != null) {
            C43277a.m171921a().mo154953q().mo5928b(this.f108739k);
        }
        this.f108739k = new AbstractC1178x<C42088b>() {
            /* class com.ss.android.lark.mail.impl.lark.C42717a.C427192 */

            /* renamed from: a */
            String f108742a;

            /* renamed from: a */
            public void onChanged(C42088b bVar) {
                String str;
                Log.m165389i("MailTabPageSpec", "onAccountChange " + bVar);
                if (bVar != null) {
                    str = bVar.mo151821c();
                } else {
                    str = null;
                }
                String str2 = this.f108742a;
                if (str2 != null && !TextUtils.equals(str2, str)) {
                    this.f108742a = str;
                    Log.m165389i("MailTabPageSpec", "onAccountChange doReload");
                    if (C41816b.m166115a().mo150132b() != null && C42717a.this.f108734f != null && C43345c.m172076m().mo154997c() && C43345c.m172076m().mo154996b()) {
                        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152380b("public_account_change_hot");
                    }
                    C42717a.this.mo153402o();
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.lark.C42717a.C427192.RunnableC427201 */

                        public void run() {
                            C42717a.this.mo153401a(C42717a.this.f108734f);
                        }
                    });
                } else if (this.f108742a == null) {
                    Log.m165389i("MailTabPageSpec", "onAccountChange ignore the init account");
                    this.f108742a = str;
                } else {
                    Log.m165389i("MailTabPageSpec", "onAccountChange ignore the same account");
                }
            }
        };
        C43277a.m171921a().mo154953q().mo5925a(this.f108739k);
        this.f108738j = new C43345c.AbstractC43349b() {
            /* class com.ss.android.lark.mail.impl.lark.C42717a.C427213 */

            @Override // com.ss.android.lark.mail.impl.service.C43345c.AbstractC43349b
            /* renamed from: a */
            public void mo152845a(boolean z) {
            }

            @Override // com.ss.android.lark.mail.impl.service.C43345c.AbstractC43349b
            /* renamed from: b */
            public void mo152846b(boolean z) {
                if (z) {
                    C42176e.m168344a().mo152230b();
                } else {
                    C42176e.m168344a().mo152240c();
                }
            }
        };
        C43345c.m172076m().mo154991a(this.f108738j);
    }
}
