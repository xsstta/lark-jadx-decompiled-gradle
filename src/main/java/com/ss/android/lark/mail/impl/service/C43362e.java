package com.ss.android.lark.mail.impl.service;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.email.client.v1.MailGetLargeFileCanShareToExternalResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetMigrationDetailsResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetSignatureResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetTenantDomainsResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateSignatureUsageResponse;
import com.bytedance.lark.pb.email.client.v1.MigrationFailureDetail;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.bytedance.lark.pb.email.v1.MailOAuthStatusPushResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.C41970e;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.C42094f;
import com.ss.android.lark.mail.impl.entity.C42095h;
import com.ss.android.lark.mail.impl.entity.EngagementSettings;
import com.ss.android.lark.mail.impl.entity.EntSignatureUsage;
import com.ss.android.lark.mail.impl.entity.MigrationItem;
import com.ss.android.lark.mail.impl.entity.MigrationStage;
import com.ss.android.lark.mail.impl.entity.UserType;
import com.ss.android.lark.mail.impl.mulprocess.C43213b;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService;
import com.ss.android.lark.mail.impl.p2161a.C41772a;
import com.ss.android.lark.mail.impl.p2161a.C41773b;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.service.C43362e;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43321h;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43322i;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43323j;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43324k;
import com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43339a;
import com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43343e;
import com.ss.android.lark.mail.impl.utils.C43779n;
import com.ss.android.lark.mail.impl.utils.C43849u;
import ee.android.framework.manis.C68183b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.mail.impl.service.e */
public class C43362e {

    /* renamed from: a */
    public C1177w<EngagementSettings> f110219a;

    /* renamed from: b */
    public List<String> f110220b;

    /* renamed from: c */
    public boolean f110221c;

    /* renamed from: d */
    public C42095h f110222d;

    /* renamed from: e */
    public String f110223e;

    /* renamed from: f */
    private C1177w<Long> f110224f;

    /* renamed from: g */
    private C1177w<Long> f110225g;

    /* renamed from: h */
    private C1177w<EngagementSettings.SmartInboxState> f110226h;

    /* renamed from: i */
    private List<MigrationFailureDetail> f110227i;

    /* renamed from: j */
    private Map<String, MigrationItem> f110228j;

    /* renamed from: k */
    private Map<String, MailOAuthStatusPushResponse.Status> f110229k;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.service.e$a */
    public static class C43373a {

        /* renamed from: a */
        public static C43362e f110246a = new C43362e();
    }

    /* renamed from: h */
    public boolean mo155093h() {
        return true;
    }

    /* renamed from: d */
    public C1177w<EngagementSettings> mo155089d() {
        return this.f110219a;
    }

    /* renamed from: f */
    public C1177w<Long> mo155091f() {
        return this.f110224f;
    }

    /* renamed from: g */
    public C1177w<Long> mo155092g() {
        return this.f110225g;
    }

    /* renamed from: a */
    public void mo155080a(EngagementSettings gVar) {
        Log.m165389i("EngagementSettingService", "onEngagementSettingsChange" + gVar);
        this.f110219a.mo5929b(gVar);
        long j = 0;
        this.f110224f.mo5929b(Long.valueOf(gVar != null ? gVar.mo151912d() : 0));
        C1177w<Long> wVar = this.f110225g;
        if (gVar != null) {
            j = gVar.mo151913e();
        }
        wVar.mo5929b(Long.valueOf(j));
        this.f110226h.mo5929b(gVar != null ? gVar.mo151915f() : null);
    }

    /* renamed from: a */
    public boolean mo155084a(MigrationItem mVar) {
        boolean z = false;
        if (this.f110219a.mo5927b() == null || !this.f110219a.mo5927b().mo151909a()) {
            int ordinal = mVar.mo151996b().ordinal();
            int i = C43779n.m173507a().getInt("mailsdk.mobile.account.client_migration.ordinal", 0);
            boolean z2 = mo155093h() && mVar.mo151996b() != MigrationStage.INVALID;
            if (!mVar.mo151995a()) {
                return z2;
            }
            if (z2 && ordinal > i) {
                z = true;
            }
            return z;
        }
        Log.m165389i("EngagementSettingService", "isClientMigrationShowEnable doneRendered");
        return false;
    }

    /* renamed from: a */
    public void mo155081a(String str) {
        mo155083a(false, str, (IGetDataCallback<C42095h>) new IGetDataCallback<C42095h>() {
            /* class com.ss.android.lark.mail.impl.service.C43362e.C433707 */

            /* renamed from: a */
            public void onSuccess(C42095h hVar) {
                C43362e.this.f110222d = hVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C43362e.this.f110222d.mo151939a(new ArrayList());
                C43362e.this.f110222d.mo151942b(new ArrayList());
                C43362e.this.f110222d.mo151940a(new HashMap());
            }
        });
    }

    /* renamed from: a */
    public void mo155083a(final boolean z, final String str, final IGetDataCallback<C42095h> iGetDataCallback) {
        C42176e.m168344a().mo152228a(z, str, new IGetDataCallback<MailGetSignatureResponse>() {
            /* class com.ss.android.lark.mail.impl.service.C43362e.C433718 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165384e("EngagementSettingService", "requestEntSignatures error:", errorResult);
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(MailGetSignatureResponse mailGetSignatureResponse) {
                if (mailGetSignatureResponse != null) {
                    Log.m165389i("EngagementSettingService", "requestEntSignature success");
                    C42095h a = C42130j.m168150a().mo152084a(mailGetSignatureResponse);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(a);
                    }
                    if (z) {
                        C43362e.this.mo155081a(str);
                        return;
                    }
                    return;
                }
                Log.m165397w("EngagementSettingService", "requestEntSignatures response is null ");
            }
        });
    }

    /* renamed from: a */
    public void mo155082a(String str, EntSignatureUsage entSignatureUsage, final IGetDataCallback<EntSignatureUsage> iGetDataCallback) {
        C42176e.m168344a().mo152205a(str, entSignatureUsage, new IGetDataCallback<MailUpdateSignatureUsageResponse>() {
            /* class com.ss.android.lark.mail.impl.service.C43362e.C433729 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165384e("EngagementSettingService", "requestEntSignatures error:", errorResult);
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(MailUpdateSignatureUsageResponse mailUpdateSignatureUsageResponse) {
                if (mailUpdateSignatureUsageResponse != null) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(null);
                        return;
                    }
                    return;
                }
                Log.m165397w("EngagementSettingService", "requestEntSignatures response is null ");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m172208q() {
        mo155077a((IGetDataCallback<MigrationItem>) null);
    }

    /* renamed from: i */
    public MigrationItem mo155094i() {
        return mo155098m();
    }

    /* renamed from: a */
    public static synchronized C43362e m172201a() {
        C43362e eVar;
        synchronized (C43362e.class) {
            eVar = C43373a.f110246a;
        }
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m172209r() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.service.$$Lambda$e$IO2gLT6tIQHf5yyVt3syV4wW048 */

            public final void run() {
                C43362e.this.m172210s();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m172210s() {
        m172205a(true, mo155098m());
        mo155077a((IGetDataCallback<MigrationItem>) null);
    }

    /* renamed from: l */
    public void mo155097l() {
        this.f110221c = true;
        C42176e.m168344a().mo152249e(new AbstractC41870b<MailGetLargeFileCanShareToExternalResponse>() {
            /* class com.ss.android.lark.mail.impl.service.C43362e.C433685 */

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
                Log.m165384e("EngagementSettingService", "fetchDomains error", errorResult);
            }

            /* renamed from: a */
            public void mo150435a(MailGetLargeFileCanShareToExternalResponse mailGetLargeFileCanShareToExternalResponse) {
                Log.m165389i("EngagementSettingService", "fetchDomains success");
                if (mailGetLargeFileCanShareToExternalResponse != null && mailGetLargeFileCanShareToExternalResponse.can_share != null) {
                    C43362e.this.f110221c = mailGetLargeFileCanShareToExternalResponse.can_share.booleanValue();
                }
            }
        });
    }

    /* renamed from: c */
    public void mo155088c() {
        mo155095j();
        mo155097l();
        mo155077a((IGetDataCallback<MigrationItem>) null);
        if (C41970e.m166941d().mo150951a()) {
            mo155100o();
        }
    }

    /* renamed from: j */
    public void mo155095j() {
        this.f110220b.clear();
        C42176e.m168344a().mo152246d(new AbstractC41870b<MailGetTenantDomainsResponse>() {
            /* class com.ss.android.lark.mail.impl.service.C43362e.C433674 */

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
                Log.m165384e("EngagementSettingService", "fetchDomains error", errorResult);
            }

            /* renamed from: a */
            public void mo150435a(MailGetTenantDomainsResponse mailGetTenantDomainsResponse) {
                Log.m165389i("EngagementSettingService", "fetchDomains success");
                if (mailGetTenantDomainsResponse != null && !mailGetTenantDomainsResponse.domains.isEmpty()) {
                    C43362e.this.f110220b.addAll(mailGetTenantDomainsResponse.domains);
                }
            }
        });
    }

    /* renamed from: p */
    public C42095h mo155101p() {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            return this.f110222d;
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo155090e() {
        if (C41816b.m166115a().mo150120a() != C43213b.f109974a) {
            return ((IEngagementSettingService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IEngagementSettingService.class)).getRecallEnable();
        }
        EngagementSettings b = m172201a().mo155089d().mo5927b();
        if (b == null || !b.mo151916g()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public List<String> mo155096k() {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            return this.f110220b;
        }
        return ((IEngagementSettingService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IEngagementSettingService.class)).getDomains();
    }

    /* renamed from: m */
    public MigrationItem mo155098m() {
        String n = C43277a.m171921a().mo154950n();
        if (TextUtils.isEmpty(n) || this.f110228j.get(n) == null) {
            return new MigrationItem(MigrationStage.INVALID, 0, false);
        }
        return this.f110228j.get(n);
    }

    /* renamed from: n */
    public boolean mo155099n() {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            return this.f110221c;
        }
        return ((IEngagementSettingService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IEngagementSettingService.class)).canShareToExternalPermission();
    }

    /* renamed from: o */
    public void mo155100o() {
        this.f110222d = new C42095h();
        String n = C43277a.m171921a().mo154950n();
        this.f110223e = n;
        mo155081a(n);
        C43277a.m171921a().mo154953q().mo5925a(new AbstractC1178x<C42088b>() {
            /* class com.ss.android.lark.mail.impl.service.C43362e.C433696 */

            /* renamed from: a */
            public void onChanged(C42088b bVar) {
                if (bVar != null && !TextUtils.equals(C43362e.this.f110223e, bVar.mo151821c()) && !TextUtils.isEmpty(bVar.mo151821c())) {
                    C43362e.this.f110223e = bVar.mo151821c();
                    C43362e.this.mo155081a(bVar.mo151821c());
                }
            }
        });
    }

    private C43362e() {
        this.f110219a = new C41772a();
        this.f110224f = new C41773b();
        this.f110225g = new C41773b();
        this.f110226h = new C41772a();
        this.f110227i = new ArrayList();
        this.f110228j = new ConcurrentHashMap();
        this.f110229k = new ConcurrentHashMap();
        this.f110220b = new ArrayList();
        this.f110221c = true;
        this.f110222d = new C42095h();
        Watchers.m167206a(new AbstractC43321h() {
            /* class com.ss.android.lark.mail.impl.service.$$Lambda$e$ahPUifwAsWXwjYWqRSt6WgvLA */

            @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43321h
            public final void onMigrationChange(MigrationStage migrationStage, int i) {
                C43362e.this.m172203a((C43362e) migrationStage, (MigrationStage) i);
            }
        });
        Watchers.m167206a(new AbstractC43324k() {
            /* class com.ss.android.lark.mail.impl.service.$$Lambda$e$m2lvFxGrRqQeYE0PSg6Jwe3Eges */

            @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43324k
            public final void onOAuthChange(MailOAuthStatusPushResponse.Status status, String str, C42093e eVar) {
                C43362e.this.m172202a((C43362e) status, (MailOAuthStatusPushResponse.Status) str, (String) eVar);
            }
        });
        Watchers.m167206a(new AbstractC43339a() {
            /* class com.ss.android.lark.mail.impl.service.$$Lambda$e$ojf6SIFjyzjvKbIlfH0BaVoDklE */

            @Override // com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43339a
            public final void onActiveBlockPush() {
                C43362e.this.m172208q();
            }
        });
        Watchers.m167206a(new AbstractC43343e() {
            /* class com.ss.android.lark.mail.impl.service.$$Lambda$e$jxcAoi_ZzCXzSOPDH5HjlHUAdw4 */

            @Override // com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43343e
            public final void onSwitchAccount() {
                C43362e.this.m172209r();
            }
        });
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.service.C43362e.RunnableC433631 */

            public void run() {
                C43350d.m172098a().mo155042g().mo5925a(new AbstractC1178x<C42094f>() {
                    /* class com.ss.android.lark.mail.impl.service.C43362e.RunnableC433631.C433641 */

                    /* access modifiers changed from: private */
                    /* renamed from: b */
                    public /* synthetic */ void m172237b(C42094f fVar) {
                        EngagementSettings gVar;
                        C43362e eVar = C43362e.this;
                        if (fVar != null) {
                            gVar = fVar.mo151899m();
                        } else {
                            gVar = null;
                        }
                        eVar.mo155080a(gVar);
                    }

                    /* renamed from: a */
                    public void onChanged(C42094f fVar) {
                        C43849u.m173826a(new Runnable(fVar) {
                            /* class com.ss.android.lark.mail.impl.service.$$Lambda$e$1$1$KcDt0k5AsluXMUymB9Rtvb72jxY */
                            public final /* synthetic */ C42094f f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                C43362e.RunnableC433631.C433641.this.m172237b(this.f$1);
                            }
                        });
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo155085b() {
        String f = C41816b.m166115a().mo150139f();
        if (!TextUtils.isEmpty(f)) {
            if (MailOAuthStatusPushResponse.Status.UNKNOWN != this.f110229k.get(f)) {
                Log.m165389i("EngagementSettingService", "clearStatus");
                this.f110229k.put(f, MailOAuthStatusPushResponse.Status.UNKNOWN);
            }
            m172203a(MigrationStage.INVALID, 0);
        }
    }

    /* renamed from: b */
    public void mo155086b(long j) {
        m172204a(new EngagementSettings.Builder().mo151927c(j), 8);
    }

    /* renamed from: b */
    public void mo155087b(MigrationItem mVar) {
        C43779n.m173507a().putInt("mailsdk.mobile.account.client_migration.ordinal", mVar.mo151996b().ordinal());
    }

    /* renamed from: b */
    private boolean m172206b(MigrationStage migrationStage) {
        C42094f f;
        if ((MigrationStage.DONE_WITH_ERROR != migrationStage && MigrationStage.TERMINATED != migrationStage) || (f = C43350d.m172098a().mo155041f()) == null) {
            return false;
        }
        if (f.mo151884e() != UserType.GMAIL_API_CLIENT && f.mo151884e() != UserType.EXCHANGE_API_CLIENT) {
            return false;
        }
        Log.m165389i("EngagementSettingService", "onMigrationChange filter" + migrationStage.ordinal());
        return true;
    }

    /* renamed from: c */
    private void m172207c(MigrationItem mVar) {
        String n = C43277a.m171921a().mo154950n();
        if (mVar != null && !TextUtils.isEmpty(n)) {
            MigrationItem mVar2 = this.f110228j.get(n);
            if (mVar2 == null) {
                this.f110228j.put(n, mVar);
            } else if (mVar2.mo151996b() == MigrationStage.IN_PROGRESS && mVar.mo151996b() == MigrationStage.IN_PROGRESS && mVar.mo151997c() <= mVar2.mo151997c()) {
                Log.m165389i("EngagementSettingService", "item smaller than last");
            } else {
                this.f110228j.put(n, mVar);
            }
        }
    }

    /* renamed from: a */
    public void mo155076a(long j) {
        m172204a(new EngagementSettings.Builder().mo151924b(j), 8);
    }

    /* renamed from: a */
    public void mo155077a(final IGetDataCallback<MigrationItem> iGetDataCallback) {
        if (this.f110219a.mo5927b() != null && this.f110219a.mo5927b().mo151909a()) {
            Log.m165389i("EngagementSettingService", "fetchMigrationDetails doneRendered");
        } else if (!mo155093h() || C43779n.m173507a().getInt("mailsdk.mobile.account.client_migration.ordinal", 0) > MigrationStage.IN_PROGRESS.ordinal()) {
            Log.m165389i("EngagementSettingService", "fetchMigrationDetails ignore");
        } else {
            Log.m165389i("EngagementSettingService", "fetchMigrationDetails ");
            C42176e.m168344a().mo152241c(new AbstractC41870b<MailGetMigrationDetailsResponse>() {
                /* class com.ss.android.lark.mail.impl.service.C43362e.C433663 */

                @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
                /* renamed from: a */
                public void mo150434a(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void mo150435a(MailGetMigrationDetailsResponse mailGetMigrationDetailsResponse) {
                    int i;
                    int i2;
                    if (mailGetMigrationDetailsResponse.stage == null) {
                        i = 0;
                    } else {
                        i = mailGetMigrationDetailsResponse.stage.intValue();
                    }
                    MigrationStage convertToStage = MigrationStage.convertToStage(i);
                    if (mailGetMigrationDetailsResponse.progress_pct == null) {
                        i2 = 0;
                    } else {
                        i2 = mailGetMigrationDetailsResponse.progress_pct.intValue();
                    }
                    List<MigrationFailureDetail> list = mailGetMigrationDetailsResponse.failureDetails;
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    Log.m165389i("EngagementSettingService", "fetchMigrationDetails success stage:" + convertToStage.ordinal());
                    C43362e.this.mo155079a(convertToStage, i2, list);
                    if (convertToStage.ordinal() > MigrationStage.DONE.ordinal()) {
                        C43362e.this.mo155087b(new MigrationItem(convertToStage, i2, false));
                    }
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(C43362e.this.mo155098m());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo155078a(MigrationStage migrationStage) {
        if (migrationStage != null && MigrationStage.IN_PROGRESS.ordinal() < migrationStage.ordinal()) {
            m172204a(new EngagementSettings.Builder().mo151922a(true), 7);
        }
    }

    /* renamed from: a */
    private void m172204a(final EngagementSettings.Builder aVar, int i) {
        C43350d.m172098a().mo155026a(C42130j.m168150a().mo152076a(new Setting.C16982a(), aVar).build(), i, new AbstractC41870b<MailUpdateAccountResponse>() {
            /* class com.ss.android.lark.mail.impl.service.C43362e.C433652 */

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void mo150435a(MailUpdateAccountResponse mailUpdateAccountResponse) {
                EngagementSettings.Builder aVar = new EngagementSettings.Builder();
                if (C43362e.this.f110219a.mo5927b() != null) {
                    aVar = new EngagementSettings.Builder(C43362e.this.f110219a.mo5927b());
                }
                if (aVar.mo151926b() != null) {
                    aVar.mo151922a(aVar.mo151926b().booleanValue());
                }
                if (aVar.mo151930e() != null) {
                    aVar.mo151924b(aVar.mo151930e().longValue());
                }
                if (aVar.mo151931f() != null) {
                    aVar.mo151927c(aVar.mo151931f().longValue());
                }
                if (aVar.mo151929d() != null) {
                    aVar.mo151920a(aVar.mo151929d().longValue());
                }
                if (aVar.mo151928c() != null) {
                    aVar.mo151919a(aVar.mo151928c().intValue());
                }
                if (aVar.mo151932g() != null) {
                    aVar.mo151921a(aVar.mo151932g());
                }
                C43362e.this.f110219a.mo5929b(aVar.mo151923a());
            }
        });
    }

    /* renamed from: a */
    private void m172205a(boolean z, MigrationItem mVar) {
        if (z || mVar.mo151996b().ordinal() < MigrationStage.DONE.ordinal()) {
            C43779n.m173507a().remove("mailsdk.mobile.account.client_migration.ordinal");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m172203a(MigrationStage migrationStage, int i) {
        Log.m165389i("EngagementSettingService", "onMigrationChange " + migrationStage.ordinal());
        if (!m172206b(migrationStage)) {
            m172207c(new MigrationItem(migrationStage, i, true));
            m172205a(false, mo155098m());
            ((AbstractC43322i) Watchers.m167205a(AbstractC43322i.class)).onMigrationItemChange(mo155098m());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m172202a(MailOAuthStatusPushResponse.Status status, String str, C42093e eVar) {
        String f = C41816b.m166115a().mo150139f();
        if (status != null && !TextUtils.isEmpty(f) && status != this.f110229k.get(f)) {
            Log.m165389i("EngagementSettingService", "status change:" + status);
            this.f110229k.put(f, status);
            ((AbstractC43323j) Watchers.m167205a(AbstractC43323j.class)).onOAuthChange(status, str, eVar);
        }
    }

    /* renamed from: a */
    public void mo155079a(MigrationStage migrationStage, int i, List<MigrationFailureDetail> list) {
        Log.m165389i("EngagementSettingService", "onMigrationChange request result" + migrationStage.ordinal());
        if (!m172206b(migrationStage)) {
            this.f110227i.clear();
            this.f110227i.addAll(list);
            m172207c(new MigrationItem(migrationStage, i, false));
            ((AbstractC43322i) Watchers.m167205a(AbstractC43322i.class)).onMigrationItemChange(mo155098m());
        }
    }
}
