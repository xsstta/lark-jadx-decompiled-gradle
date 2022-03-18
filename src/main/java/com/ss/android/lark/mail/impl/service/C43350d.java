package com.ss.android.lark.mail.impl.service;

import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.email.client.v1.EmailClientConfig;
import com.bytedance.lark.pb.email.client.v1.MailAccount;
import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateClientTabSettingResponse;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.bytedance.lark.pb.email.client.v1.StorageLimitNotify;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.C42094f;
import com.ss.android.lark.mail.impl.entity.C42101o;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailClientConfig;
import com.ss.android.lark.mail.impl.entity.MailOnBoardStatus;
import com.ss.android.lark.mail.impl.entity.ReplyLanguage;
import com.ss.android.lark.mail.impl.entity.UserType;
import com.ss.android.lark.mail.impl.mulprocess.C43213b;
import com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.ISettingService;
import com.ss.android.lark.mail.impl.p2161a.C41772a;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.service.data.AbsDataManager;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43313a;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43318e;
import com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43342d;
import com.ss.android.lark.mail.impl.settings.C43391a;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EmailSignature;
import com.ss.android.lark.mail.impl.utils.C43779n;
import com.ss.android.lark.mail.impl.utils.C43788q;
import com.ss.android.lark.mail.impl.utils.p2223a.C43751a;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import ee.android.framework.manis.C68183b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.service.d */
public class C43350d extends AbsDataManager<C42094f> implements C43788q.AbstractC43789a {

    /* renamed from: A */
    private List<EmailClientConfig> f110174A;

    /* renamed from: B */
    private Map<String, Boolean> f110175B;

    /* renamed from: a */
    public String f110176a;

    /* renamed from: b */
    private final C43751a<Boolean> f110177b;

    /* renamed from: c */
    private final C43751a<EmailSignature> f110178c;

    /* renamed from: d */
    private final C43751a<Boolean> f110179d;

    /* renamed from: e */
    private final C43751a<EmailAutoReply> f110180e;

    /* renamed from: f */
    private final C43751a<Boolean> f110181f;

    /* renamed from: o */
    private final C43751a<C43391a> f110182o;

    /* renamed from: p */
    private final C43751a<Boolean> f110183p;

    /* renamed from: q */
    private final C43751a<Boolean> f110184q;

    /* renamed from: r */
    private final C43751a<C42101o> f110185r;

    /* renamed from: s */
    private final C43751a<Boolean> f110186s;

    /* renamed from: t */
    private final C43751a<EmailAliasList> f110187t;

    /* renamed from: u */
    private final C43751a<Integer> f110188u;

    /* renamed from: v */
    private final C43751a<MailOnBoardStatus> f110189v;

    /* renamed from: w */
    private final C43751a<StorageLimitNotify> f110190w;

    /* renamed from: x */
    private final C43751a<Boolean> f110191x;

    /* renamed from: y */
    private final C43751a<Boolean> f110192y;

    /* renamed from: z */
    private final C43751a<Integer> f110193z;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.service.d$a */
    public static class C43355a {

        /* renamed from: a */
        public static C43788q<C43350d> f110203a = new C43788q<>(new C43788q.AbstractC43790b<C43350d>() {
            /* class com.ss.android.lark.mail.impl.service.C43350d.C43355a.C433561 */

            /* renamed from: a */
            public C43350d mo155066b(String str) {
                return new C43350d(str);
            }
        });
    }

    /* renamed from: i */
    public boolean mo155043i() {
        return true;
    }

    /* renamed from: C */
    public String mo155011C() {
        return this.f110176a;
    }

    /* renamed from: M */
    public C1177w<StorageLimitNotify> mo155021M() {
        return this.f110190w;
    }

    @Override // com.ss.android.lark.mail.impl.utils.C43788q.AbstractC43789a
    /* renamed from: N */
    public String mo155022N() {
        return this.f110176a;
    }

    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager
    /* renamed from: c */
    public void mo154939c() {
        super.mo154939c();
    }

    /* renamed from: k */
    public LiveData<EmailAliasList> mo155045k() {
        return this.f110187t;
    }

    /* renamed from: l */
    public C1177w<Boolean> mo155046l() {
        return this.f110177b;
    }

    /* renamed from: m */
    public C1177w<Boolean> mo155047m() {
        return this.f110192y;
    }

    /* renamed from: n */
    public C1177w<Integer> mo155048n() {
        return this.f110193z;
    }

    /* renamed from: p */
    public LiveData<C42101o> mo155050p() {
        return this.f110185r;
    }

    /* renamed from: q */
    public C1177w<Boolean> mo155051q() {
        return this.f110183p;
    }

    /* renamed from: r */
    public C1177w<Boolean> mo155052r() {
        return this.f110181f;
    }

    /* renamed from: t */
    public C1177w<Boolean> mo155054t() {
        return this.f110184q;
    }

    /* renamed from: u */
    public C1177w<Boolean> mo155055u() {
        return this.f110191x;
    }

    /* renamed from: w */
    public C1177w<Boolean> mo155057w() {
        return this.f110179d;
    }

    /* renamed from: z */
    public LiveData<Integer> mo155060z() {
        return this.f110188u;
    }

    /* renamed from: a */
    public void mo155031a(C42094f fVar, int i) {
        Log.m165389i("EmailSettingService", "settingChange push, changeType=" + i);
        mo154938b(fVar, i);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager
    /* renamed from: a */
    public void mo154929a(final AbsDataManager.AbstractC43360b<C42094f> bVar) {
        C43277a.m171921a().mo155071b(new AbsDataManager.AbstractC43360b<C42088b>() {
            /* class com.ss.android.lark.mail.impl.service.C43350d.C433511 */

            @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
            /* renamed from: a */
            public void mo152964a() {
                bVar.mo152964a();
            }

            @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
            /* renamed from: a */
            public void mo152965a(ErrorResult errorResult) {
                bVar.mo152965a(errorResult);
            }

            /* renamed from: a */
            public void mo152967a(C42088b bVar) {
                C42094f fVar;
                C42093e a = C43277a.m171921a().mo154926a(C43350d.this.f110176a);
                AbsDataManager.AbstractC43360b bVar2 = bVar;
                if (a != null) {
                    fVar = a.mo151860h();
                } else {
                    fVar = null;
                }
                bVar2.mo152967a(fVar);
            }

            @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
            public boolean equals(Object obj) {
                if (obj != null && bVar != null && obj.getClass() == bVar.getClass()) {
                    return obj.equals(bVar);
                }
                if (obj != null) {
                    return obj.equals(bVar);
                }
                return false;
            }
        });
    }

    /* renamed from: a */
    public void mo155034a(boolean z, final IGetDataCallback<C42093e> iGetDataCallback) {
        C42176e.m168344a().mo152239b(z, new IGetDataCallback<MailUpdateClientTabSettingResponse>() {
            /* class com.ss.android.lark.mail.impl.service.C43350d.C433533 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("EmailSettingService", "error changeClientStatus");
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(MailUpdateClientTabSettingResponse mailUpdateClientTabSettingResponse) {
                if (mailUpdateClientTabSettingResponse != null) {
                    C42093e a = C42130j.m168150a().mo152082a(mailUpdateClientTabSettingResponse.account);
                    if (a != null) {
                        Log.m165389i("EmailSettingService", "unbindMail success, notify account change");
                        ((AbstractC43313a) Watchers.m167205a(AbstractC43313a.class)).mo153312a(a, false);
                        iGetDataCallback.onSuccess(a);
                        return;
                    }
                    iGetDataCallback.onError(new ErrorResult("parse account error"));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo155029a(EmailAutoReply emailAutoReply, final AbstractC41870b<MailUpdateAccountResponse> bVar) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            mo155026a(new Setting.C16982a().mo59976a(C42130j.m168150a().mo152075a(emailAutoReply)).build(), 3, bVar);
        } else {
            ((IMailSetting) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IMailSetting.class)).updateAutoReply(emailAutoReply, new IMailSetting.AbstractC43218a() {
                /* class com.ss.android.lark.mail.impl.service.C43350d.C433544 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting.AbstractC43218a
                public void onFail() {
                    AbstractC41870b bVar = bVar;
                    if (bVar != null) {
                        bVar.m166303b(new ErrorResult(""));
                    }
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting.AbstractC43218a
                public void onSuc(ByteArray byteArray) {
                    AbstractC41870b bVar = bVar;
                    if (bVar != null) {
                        bVar.m166304b((Object) null);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo155033a(EmailSignature emailSignature, AbstractC41870b<MailUpdateAccountResponse> bVar) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            mo155026a(C42130j.m168150a().mo152077a(new Setting.C16982a(), emailSignature).build(), 2, bVar);
        } else {
            ((ISettingService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), ISettingService.class)).updateSignature(this.f110176a, emailSignature);
        }
    }

    /* renamed from: a */
    public void mo155032a(C42101o oVar) {
        if (oVar != null) {
            mo155026a(new Setting.C16982a().mo60001j(Boolean.valueOf(oVar.mo152005a())).mo59995d(Long.valueOf(oVar.mo152006b())).build(), 9, null);
        }
    }

    /* renamed from: a */
    public void mo155030a(ReplyLanguage replyLanguage) {
        if (replyLanguage != null) {
            mo155026a(new Setting.C16982a().mo59978a(Setting.ReplyLanguage.fromValue(replyLanguage.getValue())).build(), 10, null);
        }
    }

    /* renamed from: g */
    public C43751a<C42094f> mo155042g() {
        return mo155068P();
    }

    /* renamed from: a */
    public static synchronized C43350d m172098a() {
        C43350d a;
        synchronized (C43350d.class) {
            a = C43355a.f110203a.mo155954a();
        }
        return a;
    }

    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager
    /* renamed from: e */
    public void mo154941e() {
        super.mo154941e();
        mo155031a((C42094f) null, f110205h);
    }

    /* renamed from: f */
    public C42094f mo155041f() {
        return mo155042g().mo5927b();
    }

    /* renamed from: A */
    public boolean mo155009A() {
        C42094f fVar = (C42094f) mo155068P().mo5927b();
        if (fVar != null) {
            return fVar.mo151897k();
        }
        return false;
    }

    /* renamed from: B */
    public void mo155010B() {
        mo155026a(new Setting.C16982a().mo59999h(false).build(), 6, null);
    }

    /* renamed from: D */
    public boolean mo155012D() {
        C42094f f = mo155041f();
        if (f == null || UserType.LARK_SERVER != f.mo151884e()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public boolean mo155013E() {
        C42094f f = mo155041f();
        if (f == null || UserType.EXCHANGE_CLIENT != f.mo151884e()) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public boolean mo155014F() {
        C42094f f = mo155041f();
        if (f == null || (UserType.EXCHANGE_CLIENT != f.mo151884e() && UserType.EXCHANGE_NEW_USER != f.mo151884e())) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public boolean mo155015G() {
        C42094f f = mo155041f();
        if (f == null || (UserType.GMAIL_OAUTH_CLIENT != f.mo151884e() && UserType.GMAIL_NEW_USER != f.mo151884e())) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public boolean mo155016H() {
        if (mo155012D() || mo155013E()) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public boolean mo155017I() {
        C42094f f = mo155041f();
        if (f == null || (UserType.GMAIL_NEW_USER != f.mo151884e() && UserType.EXCHANGE_NEW_USER != f.mo151884e())) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public boolean mo155018J() {
        C42094f f = mo155041f();
        if (f == null || (UserType.GMAIL_OAUTH_CLIENT != f.mo151884e() && UserType.EXCHANGE_CLIENT != f.mo151884e())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager
    /* renamed from: b */
    public String mo154935b() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmailSettingService_");
        String str = this.f110176a;
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: v */
    public boolean mo155056v() {
        if (this.f110191x.mo5927b() != null) {
            return this.f110191x.mo5927b().booleanValue();
        }
        return true;
    }

    /* renamed from: K */
    public boolean mo155019K() {
        List<MailClientConfig> list;
        C42094f f = mo155041f();
        MailClientConfig mailClientConfig = null;
        if (f != null) {
            list = f.mo151889g();
        } else {
            list = null;
        }
        if (list != null && list.size() > 0) {
            mailClientConfig = list.get(0);
        }
        if (mailClientConfig == null || !mailClientConfig.mo151295a() || mailClientConfig.mo151297c().getValue() != EmailClientConfig.ConfigStatus.VALID.getValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public boolean mo155020L() {
        List<MailClientConfig> list;
        C42094f f = mo155041f();
        if (f != null && UserType.NO_PRIMARY_ADDRESS_USER == f.mo151884e()) {
            return true;
        }
        MailClientConfig mailClientConfig = null;
        if (f != null) {
            list = f.mo151889g();
        } else {
            list = null;
        }
        if (list != null && list.size() > 0) {
            mailClientConfig = list.get(0);
        }
        if (mailClientConfig == null || mailClientConfig.mo151297c().getValue() != EmailClientConfig.ConfigStatus.DELETED.getValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public EmailAliasList mo155044j() {
        if (C41816b.m166115a().mo150120a() != C43213b.f109974a) {
            return ((IMailSetting) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IMailSetting.class)).getAliasList();
        }
        C42094f f = mo155041f();
        if (f == null || f.mo151896j() == null) {
            return new EmailAliasList();
        }
        return f.mo151896j();
    }

    /* renamed from: o */
    public boolean mo155049o() {
        if (C41816b.m166115a().mo150120a() != C43213b.f109974a) {
            return ((ISettingService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), ISettingService.class)).isSmartReplyEnable(this.f110176a);
        }
        if (this.f110184q.mo5927b() == null) {
            return false;
        }
        return this.f110184q.mo5927b().booleanValue();
    }

    /* renamed from: x */
    public boolean mo155058x() {
        C42094f fVar;
        MailOnBoardStatus b = this.f110189v.mo5927b();
        if ((b == null || b.isValid()) && (fVar = (C42094f) mo155068P().mo5927b()) != null && UserType.LARK_SERVER == fVar.mo151884e()) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public EmailSignature mo155059y() {
        C42094f fVar = (C42094f) mo155068P().mo5927b();
        if (fVar != null) {
            return fVar.mo151880c();
        }
        EmailSignature b = this.f110178c.mo5927b();
        if (b == null) {
            return new EmailSignature.C43549a().mo155488a();
        }
        return b;
    }

    /* renamed from: s */
    public EmailAutoReply mo155053s() {
        if (C41816b.m166115a().mo150120a() != C43213b.f109974a) {
            return ((IMailSetting) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IMailSetting.class)).getAutoReplyValue();
        }
        EmailAutoReply b = this.f110180e.mo5927b();
        if (b == null) {
            return new EmailAutoReply.C42059a(false, 0, 0, "").mo151154a();
        }
        return b;
    }

    @Override // com.ss.android.lark.mail.impl.utils.C43788q.AbstractC43789a
    /* renamed from: d */
    public void mo155040d(String str) {
        this.f110176a = str;
    }

    /* renamed from: a */
    public void mo155028a(EmailAutoReply emailAutoReply) {
        mo155029a(emailAutoReply, (AbstractC41870b<MailUpdateAccountResponse>) null);
    }

    /* renamed from: c */
    public boolean mo155039c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f110175B.containsKey(str);
    }

    /* renamed from: a */
    public static synchronized C43350d m172099a(String str) {
        C43350d a;
        synchronized (C43350d.class) {
            a = C43355a.f110203a.mo155955a(str);
        }
        return a;
    }

    /* renamed from: c */
    public LiveData<EmailSignature> mo155038c(boolean z) {
        C42094f fVar = (C42094f) mo155068P().mo5927b();
        if (z && fVar != null) {
            this.f110178c.mo5929b(fVar.mo151880c());
        }
        return this.f110178c;
    }

    /* renamed from: b */
    public void mo155035b(boolean z) {
        mo155026a(new Setting.C16982a().mo60003l(Boolean.valueOf(z)).build(), 13, null);
    }

    /* renamed from: a */
    private void m172100a(MailClientConfig mailClientConfig) {
        if (mailClientConfig != null) {
            C43779n.m173508a(this.f110176a).putBoolean("mailsdk.mobile.account.client.config", mailClientConfig.mo151295a());
            C43779n.m173508a(this.f110176a).putString("mailsdk.mobile.account.client.address", mailClientConfig.mo151296b());
            C43779n.m173508a(this.f110176a).putInt("mailsdk.mobile.account.client.status", mailClientConfig.mo151297c().getValue());
            return;
        }
        C43779n.m173508a(this.f110176a).putBoolean("mailsdk.mobile.account.client.config", false);
        C43779n.m173508a(this.f110176a).putString("mailsdk.mobile.account.client.address", "");
        C43779n.m173508a(this.f110176a).putInt("mailsdk.mobile.account.client.status", 0);
    }

    /* renamed from: b */
    public boolean mo155037b(String str) {
        if (this.f110187t.mo5927b() != null) {
            return this.f110187t.mo5927b().mo151117a(str);
        }
        MailAddress k = C43277a.m171921a().mo154947k();
        if (k == null || !TextUtils.equals(str, k.mo151182e())) {
            return false;
        }
        return true;
    }

    private C43350d(String str) {
        this.f110177b = new C43751a<>(new C41772a());
        this.f110178c = new C43751a<>(new C41772a());
        this.f110179d = new C43751a<>(new C41772a());
        this.f110180e = new C43751a<>(new C41772a());
        this.f110181f = new C43751a<>(new C41772a());
        this.f110182o = new C43751a<>(new C41772a());
        this.f110183p = new C43751a<>(new C41772a());
        this.f110184q = new C43751a<>(new C41772a());
        this.f110185r = new C43751a<>(new C41772a());
        this.f110186s = new C43751a<>(new C41772a());
        this.f110187t = new C43751a<>(new C41772a());
        this.f110188u = new C43751a<>(new C41772a());
        this.f110189v = new C43751a<>(new C41772a());
        this.f110190w = new C43751a<>(new C41772a());
        this.f110191x = new C43751a<>(new C41772a());
        this.f110192y = new C43751a<>(new C41772a());
        this.f110193z = new C43751a<>(new C41772a());
        this.f110174A = new ArrayList();
        this.f110175B = new HashMap();
        this.f110176a = str;
    }

    /* renamed from: a */
    public LiveData<EmailAutoReply> mo155023a(boolean z) {
        C42094f fVar = (C42094f) mo155068P().mo5927b();
        if (z && fVar != null) {
            this.f110180e.mo5929b(fVar.mo151891h());
        }
        return this.f110180e;
    }

    /* renamed from: a */
    public C1177w<Boolean> mo155024a(int i) {
        if (i == 1) {
            return mo155046l();
        }
        if (i == 2) {
            return mo155057w();
        }
        if (i == 3) {
            return mo155052r();
        }
        if (i == 4) {
            return mo155051q();
        }
        if (i == 5) {
            return mo155054t();
        }
        if (i == 9) {
            return this.f110186s;
        }
        if (i == 13) {
            return this.f110191x;
        }
        if (i != 14) {
            return null;
        }
        return mo155047m();
    }

    /* renamed from: a */
    public void mo155027a(AbstractC41870b<MailUpdateAccountResponse> bVar) {
        mo155026a(new Setting.C16982a().mo60002k(false).build(), 12, bVar);
    }

    /* renamed from: a */
    public static synchronized void m172101a(String str, List<String> list) {
        synchronized (C43350d.class) {
            C43355a.f110203a.mo155956a(str, list);
        }
    }

    /* renamed from: c */
    private void m172102c(C42094f fVar, int i) {
        MailClientConfig mailClientConfig;
        Log.m165389i("EmailSettingService", "onAccountTypeChange start");
        boolean z = true;
        if (UserType.LARK_SERVER == fVar.mo151884e()) {
            C43779n.m173508a(this.f110176a).putBoolean("mailsdk.mobile.account.lark", true);
        } else if (C43779n.m173508a(this.f110176a).contains("mailsdk.mobile.account.lark")) {
            C43779n.m173508a(this.f110176a).remove("mailsdk.mobile.account.lark");
        }
        if (fVar.mo151884e() == UserType.GMAIL_NEW_USER || fVar.mo151884e() == UserType.EXCHANGE_NEW_USER) {
            C43779n.m173508a(this.f110176a).putBoolean("mailsdk.mobile.account.new", true);
            if (C43277a.m171921a().mo154951o()) {
                C43362e.m172201a().mo155085b();
            }
        } else {
            C43779n.m173508a(this.f110176a).remove("mailsdk.mobile.account.new");
        }
        if (fVar.mo151884e() == UserType.GMAIL_OAUTH_CLIENT) {
            C43779n.m173508a(this.f110176a).putBoolean("mailsdk.mobile.account.client", true);
        } else {
            C43779n.m173508a(this.f110176a).remove("mailsdk.mobile.account.client");
        }
        int i2 = -1;
        if (fVar.mo151884e() != null) {
            i2 = fVar.mo151884e().getValue();
            C43779n.m173508a(this.f110176a).putInt("mailsdk.mobile.account.type", i2);
        }
        if (i != f110207j) {
            List<MailClientConfig> g = fVar.mo151889g();
            if (g.isEmpty()) {
                mailClientConfig = null;
            } else {
                mailClientConfig = g.get(0);
            }
            m172100a(mailClientConfig);
        }
        Log.m165389i("EmailSettingService", "user account type: " + i2 + ", isLarkServer:" + mo155012D() + ", isNewUser:" + mo155017I() + ", isClient:" + mo155018J() + ", isClientEnable:" + mo155019K());
        AbstractC43318e eVar = (AbstractC43318e) Watchers.m167205a(AbstractC43318e.class);
        if (i <= f110204g) {
            z = false;
        }
        eVar.onChange(fVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo154938b(C42094f fVar, int i) {
        boolean b = super.mo154938b((Object) fVar, i);
        if (fVar != null) {
            if (i != f110205h) {
                this.f110177b.mo5929b(Boolean.valueOf(fVar.mo151875a()));
                this.f110178c.mo5929b(fVar.mo151880c());
                this.f110180e.mo5929b(fVar.mo151891h());
                this.f110179d.mo5929b(Boolean.valueOf(fVar.mo151880c().mo155470b()));
                this.f110181f.mo5929b(Boolean.valueOf(fVar.mo151891h().mo151132a()));
            }
            if (i != f110205h || !TextUtils.equals(this.f110176a, C43277a.m171921a().mo154946j())) {
                this.f110192y.mo5929b(Boolean.valueOf(fVar.mo151906t()));
                this.f110193z.mo5929b(Integer.valueOf(fVar.mo151908u()));
                this.f110182o.mo5929b(fVar.mo151882d());
                this.f110183p.mo5929b(Boolean.valueOf(fVar.mo151882d().mo155172b()));
                this.f110184q.mo5929b(Boolean.valueOf(fVar.mo151879b()));
                if (fVar.mo151898l() != null) {
                    this.f110185r.mo5929b(fVar.mo151898l());
                    this.f110186s.mo5929b(Boolean.valueOf(fVar.mo151898l().mo152005a()));
                }
                this.f110190w.mo5929b(fVar.mo151903q());
                this.f110191x.mo5929b(Boolean.valueOf(fVar.mo151905s()));
                if (fVar.mo151901o() != null) {
                    this.f110188u.mo5929b(Integer.valueOf(fVar.mo151901o().getValue()));
                } else {
                    this.f110188u.mo5929b((Integer) null);
                }
            }
            if (fVar.mo151896j() != null) {
                this.f110187t.mo5929b(fVar.mo151896j());
            } else {
                this.f110187t.mo5929b((EmailAliasList) null);
            }
            if (fVar.mo151902p() != null) {
                this.f110189v.mo5929b(MailOnBoardStatus.fromValue(fVar.mo151902p().getValue()));
            } else {
                this.f110189v.mo5929b((MailOnBoardStatus) null);
            }
            List<String> n = fVar.mo151900n();
            this.f110175B.clear();
            if (CollectionUtils.isNotEmpty(n)) {
                for (String str : n) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f110175B.put(str, true);
                    }
                }
            }
            m172102c(fVar, i);
        }
        if (b) {
            ((AbstractC43342d) Watchers.m167205a(AbstractC43342d.class)).mo154988a(this.f110176a, fVar, i);
        }
        return b;
    }

    /* renamed from: a */
    public void mo155025a(int i, AbstractC41870b<MailUpdateAccountResponse> bVar) {
        mo155026a(new Setting.C16982a().mo59984a(Integer.valueOf(i)).build(), 15, bVar);
    }

    /* renamed from: a */
    public void mo155026a(Setting setting, final int i, final AbstractC41870b<MailUpdateAccountResponse> bVar) {
        boolean z;
        C42093e a = C43277a.m171921a().mo154926a(this.f110176a);
        if (a == null) {
            Log.m165382e("toggleSettings fail");
            if (bVar != null) {
                bVar.m166303b(new ErrorResult("account is null"));
                return;
            }
            return;
        }
        MailAccount.C16622a d = new MailAccount.C16622a().mo59122a(a.mo151843a()).mo59124b(this.f110176a).mo59125c(a.mo151853d()).mo59126d(a.mo151855e());
        if (a != null) {
            z = a.mo151858f();
        } else {
            z = false;
        }
        MailAccount a2 = d.mo59121a(Boolean.valueOf(z)).mo59120a(setting).build();
        C42094f a3 = C42130j.m168150a().mo152083a(setting);
        if (i == 1) {
            this.f110177b.mo5929b(Boolean.valueOf(a3.mo151875a()));
        }
        if (i == 14) {
            this.f110192y.mo5929b(Boolean.valueOf(a3.mo151906t()));
        }
        if (i == 15) {
            this.f110193z.mo5929b(Integer.valueOf(a3.mo151908u()));
        }
        if (i == 3) {
            this.f110180e.mo5929b(a3.mo151891h());
            this.f110181f.mo5929b(Boolean.valueOf(a3.mo151891h().mo151132a()));
        }
        if (i == 4) {
            this.f110182o.mo5929b(a3.mo151882d());
            this.f110183p.mo5929b(Boolean.valueOf(a3.mo151882d().mo155172b()));
        }
        if (i == 2) {
            this.f110178c.mo5929b(a3.mo151880c());
            this.f110179d.mo5929b(Boolean.valueOf(a3.mo151880c().mo155470b()));
        }
        if (i == 5) {
            this.f110184q.mo5929b(Boolean.valueOf(a3.mo151879b()));
        }
        if (i == 9 && a3.mo151898l() != null) {
            this.f110185r.mo5929b(a3.mo151898l());
            this.f110186s.mo5929b(Boolean.valueOf(a3.mo151898l().mo152005a()));
        }
        if (i == 10 && a3.mo151901o() != null) {
            this.f110188u.mo5929b(Integer.valueOf(a3.mo151901o().getValue()));
        }
        if (i == 11 && a3.mo151903q() != null) {
            this.f110190w.mo5929b(a3.mo151903q());
        }
        if (i == 13) {
            this.f110191x.mo5929b(Boolean.valueOf(a3.mo151905s()));
        }
        C42176e.m168344a().mo152192a(a2, new AbstractC41870b<MailUpdateAccountResponse>() {
            /* class com.ss.android.lark.mail.impl.service.C43350d.C433522 */

            /* renamed from: a */
            public void onSuccess(MailUpdateAccountResponse mailUpdateAccountResponse) {
                super.onSuccess(mailUpdateAccountResponse);
            }

            /* renamed from: b */
            public void mo150435a(MailUpdateAccountResponse mailUpdateAccountResponse) {
                Log.m165389i("EmailSettingService", "onToggleSettings onSuccess");
                AbstractC41870b bVar = bVar;
                if (bVar != null) {
                    bVar.m166304b(mailUpdateAccountResponse);
                }
            }

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
                Log.m165383e("EmailSettingService", "onToggleSettings onError");
                if (i != 8) {
                    MailToast.m173697a((int) R.string.Mail_Toast_EmailSettingFailed);
                    C42209j.m168612a("mail_setting_update_fail", "toast");
                }
                C43350d.this.mo154944h();
                AbstractC41870b bVar = bVar;
                if (bVar != null) {
                    bVar.m166303b(errorResult);
                }
            }
        });
    }
}
