package com.ss.android.lark.mail.impl.service;

import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.MailGetAccountResponse;
import com.bytedance.lark.pb.email.client.v1.MailSwitchAccountResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.AddressType;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.C42094f;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailClientConfig;
import com.ss.android.lark.mail.impl.entity.UserType;
import com.ss.android.lark.mail.impl.mulprocess.C43213b;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService;
import com.ss.android.lark.mail.impl.p2168g.C42107a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.data.AbsDataManager;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43313a;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43333t;
import com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43343e;
import com.ss.android.lark.mail.impl.utils.C43779n;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.p2223a.C43751a;
import com.ss.android.lark.utils.UIHelper;
import ee.android.framework.manis.C68183b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.lark.mail.impl.service.a */
public class C43277a extends AbsDataManager<C42088b> implements AbstractC43313a, AbstractC43333t {

    /* renamed from: o */
    private static long f110120o = 432000000;

    /* renamed from: a */
    public int f110121a;

    /* renamed from: b */
    protected volatile boolean f110122b;

    /* renamed from: c */
    public final AtomicReference<C42093e> f110123c;

    /* renamed from: d */
    public Runnable f110124d;

    /* renamed from: e */
    public Runnable f110125e;

    /* renamed from: f */
    public boolean f110126f;

    /* renamed from: p */
    private String f110127p;

    /* renamed from: q */
    private final AtomicReference<C42093e> f110128q;

    /* renamed from: r */
    private final AtomicReference<C42093e> f110129r;

    /* renamed from: s */
    private final Map<String, MailAddress.C42062a> f110130s;

    /* renamed from: t */
    private AbstractC41849c.AbstractC41866q f110131t;

    /* renamed from: u */
    private boolean f110132u;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.service.a$a */
    public static class C43285a {

        /* renamed from: a */
        public static C43277a f110144a = new C43277a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager
    /* renamed from: b */
    public String mo154935b() {
        return "AccountService1155";
    }

    /* renamed from: a */
    public static C43277a m171921a() {
        return C43285a.f110144a;
    }

    /* renamed from: x */
    public boolean mo154960x() {
        return this.f110126f;
    }

    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager
    /* renamed from: a */
    public boolean mo154933a(AbsDataManager.AbstractC43359a aVar, AbsDataManager.AbstractC43360b<C42088b> bVar) {
        Log.m165389i("AccountService1155", "doReloadAccountData: reloadData");
        Runnable runnable = this.f110125e;
        if (runnable != null) {
            C43849u.m173829b(runnable);
            this.f110125e = null;
        }
        return super.mo154933a(aVar, bVar);
    }

    /* renamed from: a */
    public void mo154932a(boolean z) {
        this.f110132u = z;
    }

    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager
    /* renamed from: h */
    public boolean mo154944h() {
        return super.mo154944h();
    }

    /* renamed from: q */
    public C43751a<C42088b> mo154953q() {
        return mo155068P();
    }

    /* renamed from: f */
    public void mo154942f() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.service.$$Lambda$a$UVI7w3uJIjsdx08jpX8iUEaeUag */

            public final void run() {
                C43277a.this.m171920A();
            }
        });
    }

    /* renamed from: i */
    public C42093e mo154945i() {
        return this.f110128q.get();
    }

    /* renamed from: r */
    public String mo154954r() {
        return C43779n.m173507a().getString("key_account_id", null);
    }

    /* renamed from: t */
    public boolean mo154956t() {
        return C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.clientonboarding.phase1");
    }

    /* renamed from: u */
    public boolean mo154957u() {
        return C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.clientonboarding.phase2b");
    }

    /* renamed from: y */
    private void m171928y() {
        Log.m165389i("AccountService1155", "delayCheckPreloadAccountData");
        Runnable runnable = this.f110125e;
        if (runnable != null) {
            C43849u.m173829b(runnable);
            this.f110125e = null;
        }
        RunnableC432792 r0 = new Runnable() {
            /* class com.ss.android.lark.mail.impl.service.C43277a.RunnableC432792 */

            /* renamed from: a */
            int f110134a;

            public void run() {
                Log.m165389i("AccountService1155", "trySetAccountInfo: delay check");
                if (!C41816b.m166115a().mo150148o() || C43345c.m172076m().mo154997c()) {
                    int i = this.f110134a;
                    if (i < 5) {
                        this.f110134a = i + 1;
                        C43849u.m173827a(C43277a.this.f110125e, 500);
                    } else if (C43277a.this.f110125e == this) {
                        C43277a.this.f110125e = null;
                    }
                } else {
                    if (C43277a.this.f110125e == this) {
                        C43277a.this.f110125e = null;
                    }
                    C43277a.this.mo154943g();
                }
            }
        };
        this.f110125e = r0;
        C43849u.m173827a(r0, 500);
    }

    /* renamed from: z */
    private boolean m171929z() {
        String f = C41816b.m166115a().mo150139f();
        if (f == null) {
            f = "";
        }
        if (TextUtils.equals(this.f110127p, f)) {
            return false;
        }
        this.f110127p = f;
        return true;
    }

    /* renamed from: j */
    public String mo154946j() {
        C42093e i = mo154945i();
        if (i == null) {
            return C41816b.m166115a().mo150139f();
        }
        return i.mo151848b();
    }

    /* renamed from: l */
    public C42093e mo154948l() {
        C42093e eVar = this.f110129r.get();
        if (eVar == null) {
            return this.f110129r.get();
        }
        return eVar;
    }

    /* renamed from: m */
    public C42087a mo154949m() {
        C42088b bVar = (C42088b) this.f110210m.mo5927b();
        if (bVar == null) {
            return null;
        }
        return bVar.mo151822d();
    }

    /* renamed from: n */
    public String mo154950n() {
        C42093e l = mo154948l();
        if (l == null) {
            return C41816b.m166115a().mo150139f();
        }
        return l.mo151848b();
    }

    /* renamed from: s */
    public boolean mo154955s() {
        if (!mo154951o() || (!mo154956t() && !mo154957u())) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public void mo154959w() {
        C43779n.m173508a(C41816b.m166115a().mo150139f()).putLong("mailsdk.mobile.account.client_type.timestamp", System.currentTimeMillis());
    }

    private C43277a() {
        this.f110123c = new AtomicReference<>(null);
        this.f110128q = new AtomicReference<>(null);
        this.f110129r = new AtomicReference<>(null);
        this.f110130s = new ConcurrentHashMap();
        this.f110131t = new AbstractC41849c.AbstractC41866q() {
            /* class com.ss.android.lark.mail.impl.service.$$Lambda$GiP3pv4d_FaK67jzQlndloiIYTQ */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41866q
            public final void onPushChatter(MailAddress mailAddress) {
                C43277a.this.mo154927a(mailAddress);
            }
        };
        this.f110124d = new Runnable() {
            /* class com.ss.android.lark.mail.impl.service.C43277a.RunnableC432781 */

            public void run() {
                Log.m165389i("AccountService1155", "RetryLoadChatter");
                C43277a.this.f110121a++;
                CoreThreadPool.getBackgroundHandler().removeCallbacks(C43277a.this.f110124d);
                MailAddress a = C41816b.m166115a().mo150115E().mo150184a(C43277a.this.mo154950n());
                if (!TextUtils.isEmpty(a.mo151192m())) {
                    C43849u.m173826a(new Runnable(a) {
                        /* class com.ss.android.lark.mail.impl.service.$$Lambda$a$1$5WpyBCZ3j_XW_14yWgyj2j5X_3E */
                        public final /* synthetic */ MailAddress f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C43277a.RunnableC432781.this.m171967a(this.f$1);
                        }
                    });
                } else if (C43277a.this.f110121a < 3) {
                    CoreThreadPool.getBackgroundHandler().postDelayed(C43277a.this.f110124d, 3000);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m171967a(MailAddress mailAddress) {
                C43277a.this.m171926c(mailAddress);
            }
        };
        this.f110126f = false;
        this.f110132u = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m171920A() {
        Log.m165389i("AccountService1155", "trySetAccountInfo: start");
        if (!m171929z()) {
            Log.m165389i("AccountService1155", "trySetAccountInfo: account not change");
        } else if (TextUtils.isEmpty(this.f110127p)) {
            Log.m165389i("AccountService1155", "trySetAccountInfo: onDestroy");
            mo154941e();
        } else {
            if (!this.f110122b) {
                Log.m165389i("AccountService1155", "trySetAccountInfo: onCreate");
                this.f110122b = true;
                mo154939c();
            }
            Log.m165389i("AccountService1155", "trySetAccountInfo: onResume");
            mo154940d();
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager
    /* renamed from: e */
    public void mo154941e() {
        super.mo154941e();
        Watchers.m167209b(this);
        C41816b.m166115a().mo150115E().mo150188b(this.f110131t);
        this.f110123c.set(null);
        this.f110128q.set(null);
        this.f110129r.set(null);
        this.f110121a = 0;
        C43374f.m172264f().mo154941e();
        C43350d.m172101a("", (List<String>) null);
        C43350d.m172098a().mo154941e();
    }

    /* renamed from: g */
    public void mo154943g() {
        if (!mo154960x()) {
            Log.m165389i("AccountService1155", "preload account from net");
            mo154932a(true);
        }
        Log.m165389i("AccountService1155", "preload account");
        m171925c(C41816b.m166115a().mo150139f());
        mo154944h();
    }

    /* renamed from: k */
    public MailAddress mo154947k() {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            return m171925c(mo154950n()).mo151210a();
        }
        return ((IAccountService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IAccountService.class)).getCurrentAddress();
    }

    /* renamed from: o */
    public boolean mo154951o() {
        if (C41816b.m166115a().mo150120a() != C43213b.f109974a) {
            return ((IAccountService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IAccountService.class)).isPrimaryAccount();
        }
        C42093e l = mo154948l();
        if (l == null || !l.mo151858f()) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public boolean mo154958v() {
        long currentTimeMillis = System.currentTimeMillis() - C43779n.m173508a(C41816b.m166115a().mo150139f()).getLong("mailsdk.mobile.account.client_type.timestamp", -1);
        int i = (currentTimeMillis > 0 ? 1 : (currentTimeMillis == 0 ? 0 : -1));
        if ((i <= 0 || currentTimeMillis <= f110120o) && i >= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager
    /* renamed from: d */
    public void mo154940d() {
        super.mo154940d();
        this.f110126f = false;
        C43350d.m172098a().mo154940d();
        C43374f.m172264f().mo154940d();
        if (mo154949m() == null && C43345c.m172076m().mo154997c()) {
            Log.m165389i("AccountService1155", "trySetAccountInfo: cold start and already in mail tab");
            m171928y();
        } else if (!C41816b.m166115a().mo150148o()) {
            Log.m165389i("AccountService1155", "trySetAccountInfo: has not mail tab");
            m171928y();
        } else {
            mo154943g();
        }
    }

    /* renamed from: p */
    public boolean mo154952p() {
        if (C41816b.m166115a().mo150120a() != C43213b.f109974a) {
            return ((IAccountService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IAccountService.class)).hasMultiAccount();
        }
        C42088b b = mo154953q().mo5927b();
        if (b == null || b.mo151820b() == null || b.mo151820b().size() <= 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager
    /* renamed from: c */
    public void mo154939c() {
        super.mo154939c();
        C43380g.m172308a().mo155142a(C41816b.m166115a().mo150132b());
        C41816b.m166115a().mo150115E().mo150187a(this.f110131t);
        Watchers.m167206a(this);
    }

    /* renamed from: a */
    public void mo154927a(MailAddress mailAddress) {
        C43849u.m173826a(new Runnable(mailAddress) {
            /* class com.ss.android.lark.mail.impl.service.$$Lambda$a$T6f5vl79GHX_3gpPtxJt8Ou1js */
            public final /* synthetic */ MailAddress f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C43277a.this.m171926c((C43277a) this.f$1);
            }
        });
    }

    /* renamed from: b */
    public C42087a mo154934b(String str) {
        C42088b bVar = (C42088b) this.f110210m.mo5927b();
        if (bVar == null) {
            return null;
        }
        return bVar.mo151818a(str);
    }

    /* renamed from: c */
    private MailAddress.C42062a m171925c(String str) {
        if (TextUtils.isEmpty(str)) {
            return new MailAddress.C42062a();
        }
        synchronized (this.f110130s) {
            if (!this.f110130s.containsKey(str)) {
                MailAddress.C42062a aVar = new MailAddress.C42062a();
                aVar.mo151213c(str);
                this.f110130s.put(str, aVar);
                return aVar;
            }
            return this.f110130s.get(str);
        }
    }

    /* renamed from: b */
    private C42087a m171924b(C42093e eVar) {
        UserType userType;
        C42087a aVar = new C42087a();
        aVar.f107024a = eVar.mo151848b();
        aVar.f107026c = eVar.mo151853d();
        aVar.f107027d = eVar.mo151855e();
        MailAddress a = m171925c(eVar.mo151848b()).mo151210a();
        MailClientConfig mailClientConfig = null;
        if (!TextUtils.isEmpty(a.mo151192m())) {
            aVar.f107025b = a.mo151192m();
        } else if (eVar.mo151858f()) {
            aVar.f107025b = null;
        } else {
            aVar.f107025b = "";
        }
        boolean z = true;
        aVar.f107029f = !eVar.mo151858f();
        aVar.f107028e = eVar.mo151859g();
        C42094f h = eVar.mo151860h();
        if (h != null) {
            userType = h.mo151884e();
        } else {
            userType = UserType.LARK_SERVER;
        }
        if (h != null) {
            mailClientConfig = h.mo151894i();
        }
        if (h == null || !h.mo151904r()) {
            z = false;
        }
        aVar.mo151809a(userType, mailClientConfig, z);
        return aVar;
    }

    /* renamed from: c */
    private void m171927c(C42093e eVar) {
        String str;
        if (eVar != null) {
            str = eVar.mo151848b();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f110130s) {
                MailAddress.C42062a remove = this.f110130s.remove(str);
                if (remove == null) {
                    remove = new MailAddress.C42062a();
                }
                remove.mo151213c(str);
                remove.mo151209a(eVar.mo151853d());
                remove.mo151212b(eVar.mo151855e());
                remove.mo151207a(AddressType.USER);
                this.f110130s.put(str, remove);
            }
        }
    }

    /* renamed from: a */
    public C42088b mo154925a(C42093e eVar) {
        String str = null;
        if (eVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m171924b(eVar));
        if (eVar.mo151859g()) {
            str = eVar.mo151848b();
        }
        m171927c(eVar);
        List<C42093e> i = eVar.mo151862i();
        if (i != null) {
            for (C42093e eVar2 : i) {
                if (eVar2.mo151859g()) {
                    str = eVar2.mo151848b();
                }
                m171927c(eVar2);
                arrayList.add(m171924b(eVar2));
            }
        }
        return new C42088b(arrayList, str);
    }

    /* renamed from: b */
    public void m171926c(MailAddress mailAddress) {
        if (mailAddress != null) {
            Log.m165389i("AccountService1155", "onAccountInfoChange");
            MailAddress.C42062a c = m171925c(mailAddress.mo151189j());
            if (!TextUtils.isEmpty(mailAddress.mo151176a())) {
                c.mo151209a(mailAddress.mo151176a());
            }
            if (TextUtils.isEmpty(mailAddress.mo151192m())) {
                String a = C41816b.m166115a().mo150115E().mo150185a(c.f106775b, (int) UIHelper.getResources().getDimension(R.dimen.mail_setting_account_avatar_big_size));
                if (!TextUtils.isEmpty(a)) {
                    c.mo151215e(a);
                    C42107a.m168074a().mo152032a(c.f106775b, c.mo151210a());
                    return;
                }
                return;
            }
            c.mo151215e(mailAddress.mo151192m());
            C42107a.m168074a().mo152032a(c.f106775b, c.mo151210a());
        }
    }

    /* renamed from: a */
    public C42093e mo154926a(String str) {
        C42093e eVar = this.f110123c.get();
        if (eVar == null) {
            return null;
        }
        if (TextUtils.equals(str, eVar.mo151848b())) {
            return eVar;
        }
        if (eVar.mo151862i() == null) {
            return null;
        }
        for (C42093e eVar2 : eVar.mo151862i()) {
            if (TextUtils.equals(str, eVar2.mo151848b())) {
                return eVar2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager
    /* renamed from: a */
    public void mo154929a(final AbsDataManager.AbstractC43360b<C42088b> bVar) {
        Log.m165389i("AccountService1155", "doReloadAccount , fromNet=" + this.f110132u);
        final boolean z = this.f110132u;
        C42176e.m168344a().mo152229a(z ^ true, false, (IGetDataCallback<MailGetAccountResponse>) new IGetDataCallback<MailGetAccountResponse>() {
            /* class com.ss.android.lark.mail.impl.service.C43277a.C432845 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("AccountService1155", "doReloadAccount fail");
                bVar.mo152965a(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(MailGetAccountResponse mailGetAccountResponse) {
                C42093e a = C42130j.m168150a().mo152082a(mailGetAccountResponse.account);
                if (a == null) {
                    Log.m165383e("AccountService1155", "doReloadAccount fail");
                    bVar.mo152965a(new ErrorResult(-1));
                    return;
                }
                Log.m165389i("AccountService1155", "doReloadAccount success");
                C43277a.this.f110123c.set(a);
                if (z) {
                    C43277a.this.f110126f = true;
                }
                bVar.mo152967a(C43277a.this.mo154925a(a));
            }
        });
        this.f110132u = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo154930a(C42088b bVar, int i) {
        Log.m165389i("AccountService1155", "onBeforeDataChanged");
        if (i != f110207j) {
            CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                /* class com.ss.android.lark.mail.impl.service.C43277a.RunnableC432803 */

                public void run() {
                    if (TextUtils.isEmpty(C41816b.m166115a().mo150115E().mo150184a(C43277a.this.mo154950n()).mo151192m())) {
                        Log.m165383e("AccountService1155", "getChatterByUserId the user avatar is empty.");
                        CoreThreadPool.getBackgroundHandler().postDelayed(C43277a.this.f110124d, 3000);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m171922a(String str, EmailAliasList emailAliasList) {
        if (!emailAliasList.mo151116a()) {
            Log.m165383e("AccountService1155", "account is disable");
        } else if (emailAliasList.mo151118b() != null) {
            String e = emailAliasList.mo151118b().mo151182e();
            MailAddress.C42062a c = m171925c(str);
            if (!TextUtils.isEmpty(e)) {
                c.mo151212b(e);
            }
            m171926c(c.mo151210a());
        } else {
            Log.m165383e("AccountService1155", "default address is null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo154938b(C42088b bVar, int i) {
        C42093e eVar = null;
        String str = "";
        if (bVar != null) {
            C43779n.m173509a(bVar.mo151821c(), bVar.mo151819a());
            C43350d.m172101a(bVar.mo151821c(), bVar.mo151819a());
        } else {
            C43779n.m173509a(str, null);
            C43350d.m172101a(str, (List<String>) null);
        }
        C42093e eVar2 = this.f110123c.get();
        this.f110128q.set(eVar2);
        if (eVar2 != null) {
            if (eVar2.mo151859g()) {
                eVar = eVar2;
            } else if (eVar2.mo151862i() != null) {
                Iterator<C42093e> it = eVar2.mo151862i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C42093e next = it.next();
                    if (next.mo151859g()) {
                        eVar = next;
                        break;
                    }
                }
            }
            this.f110129r.set(eVar);
            m171923a(eVar2.mo151848b(), eVar2.mo151860h(), i);
            if (eVar2.mo151862i() != null) {
                for (C42093e eVar3 : eVar2.mo151862i()) {
                    m171923a(eVar3.mo151848b(), eVar3.mo151860h(), i);
                }
            }
            if (eVar != null) {
                str = eVar.mo151848b();
            }
            if (!TextUtils.equals(str, mo154954r())) {
                C43779n.m173507a().putString("key_account_id", str);
            }
        }
        return super.mo154938b((Object) bVar, i);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43313a
    /* renamed from: a */
    public void mo153312a(C42093e eVar, boolean z) {
        int i;
        this.f110123c.set(eVar);
        C42088b a = mo154925a(eVar);
        if (z) {
            i = f110205h;
        } else {
            i = f110206i;
        }
        mo154938b(a, i);
    }

    /* renamed from: a */
    public void mo154931a(String str, final IGetDataCallback<C42088b> iGetDataCallback) {
        Log.m165389i("AccountService1155", "switchAccount");
        C42176e.m168344a().mo152267p(str, new IGetDataCallback<MailSwitchAccountResponse>() {
            /* class com.ss.android.lark.mail.impl.service.C43277a.C432814 */

            /* renamed from: a */
            public void onSuccess(MailSwitchAccountResponse mailSwitchAccountResponse) {
                Log.m165388i("switchAccount success");
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.service.C43277a.C432814.RunnableC432821 */

                    public void run() {
                        C43277a.this.f110208k.mo156222a(false);
                        C43277a.this.mo155071b(new AbsDataManager.AbstractC43360b<C42088b>() {
                            /* class com.ss.android.lark.mail.impl.service.C43277a.C432814.RunnableC432821.C432831 */

                            @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                            /* renamed from: a */
                            public void mo152964a() {
                            }

                            @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                            /* renamed from: a */
                            public void mo152965a(ErrorResult errorResult) {
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void mo152967a(C42088b bVar) {
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(bVar);
                                }
                                ((AbstractC43343e) Watchers.m167205a(AbstractC43343e.class)).onSwitchAccount();
                            }
                        });
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165388i("switchAccount error: " + errorResult.toString());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43333t
    public void onSharedAccountChange(String str, C42093e eVar, boolean z) {
        Log.m165389i("AccountService1155", "onSharedAccountChange | account=" + eVar.toString() + ",isBind=" + z);
        mo154944h();
    }

    /* renamed from: a */
    private void m171923a(String str, C42094f fVar, int i) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("settingChange:");
        if (str != null) {
            str2 = str;
        } else {
            str2 = "null";
        }
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        Log.m165388i(sb.toString());
        if (C41816b.m166115a().mo150143j()) {
            Log.m165388i("settingChange: setting=" + fVar);
        }
        if (fVar != null) {
            m171922a(str, fVar.mo151896j());
            if (TextUtils.equals(mo154950n(), str)) {
                C43350d.m172098a().mo155031a(fVar, i);
            } else {
                C43350d.m172099a(str).mo155031a(fVar, i);
            }
        }
    }
}
