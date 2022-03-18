package com.bytedance.ee.bear.list;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderIManualOfflineCallback;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.offline.AbstractC5210a;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.offline.OfflineDocsPriority;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8175b;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.cache.C8201j;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.offlinecache.ManualOfflineConfig;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.list.l */
public class C8523l implements AbstractC5210a {

    /* renamed from: a */
    private C10917c f23064a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m35402a(Boolean bool) throws Exception {
    }

    @Override // com.bytedance.ee.bear.contract.offline.AbstractC5210a
    /* renamed from: a */
    public void mo20900a(OfflineRenameData offlineRenameData) {
        C13479a.m54772d("OfflineOperationWrapper", "OfflineOperationWrapper.setNewName: 26 rawData=" + offlineRenameData);
        AbstractC68307f.m265083a(offlineRenameData).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.$$Lambda$l$IAJszOtKEbQX9i79SkR_KdC1qk */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8523l.m35404b(OfflineRenameData.this, (OfflineRenameData) obj);
            }
        }).mo238014c(new Function(offlineRenameData) {
            /* class com.bytedance.ee.bear.list.$$Lambda$l$x5YVSkN6NPdVJo0PFwRuh19qe4 */
            public final /* synthetic */ OfflineRenameData f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8523l.this.m35400a(this.f$1, (OfflineRenameData) obj);
            }
        }).mo238001b($$Lambda$l$LvG9vd85j_WTMhUo8VP4m84kh9M.INSTANCE, $$Lambda$l$B3WrKKPehdH2Tt36rqWuQbydIg.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.contract.offline.AbstractC5210a
    /* renamed from: a */
    public AbstractC68307f<OfflineDoc> mo20898a(String str, int i, String str2, boolean z) {
        C13479a.m54772d("OfflineOperationWrapper", "OfflineOperationWrapper.createOfflineDoc: enter parentToken=");
        return AbstractC68307f.m265083a(new C8175b()).mo237985a(C11678b.m48479c()).mo238020d(new Function(System.currentTimeMillis(), z, i, str, str2) {
            /* class com.bytedance.ee.bear.list.$$Lambda$l$IPXsCYwXD3JbgeoFRm2JbPaVGrM */
            public final /* synthetic */ long f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;

            {
                this.f$1 = r2;
                this.f$2 = r4;
                this.f$3 = r5;
                this.f$4 = r6;
                this.f$5 = r7;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8523l.this.m35393a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (C8175b) obj);
            }
        }).mo237985a(C11678b.m48481e());
    }

    @Override // com.bytedance.ee.bear.contract.offline.AbstractC5210a
    /* renamed from: a */
    public AbstractC68307f<OfflineDoc> mo20897a(String str) {
        C13479a.m54764b("OfflineOperationWrapper", "OfflineOperationWrapper.getOfflineDoc: 162 fakeToken=" + str);
        return AbstractC68307f.m265083a(str).mo237985a(C11678b.m48480d()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.$$Lambda$l$We0BrFzjtVgkmyHFEghslEV1jmA */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8523l.this.m35407c((String) obj);
            }
        }).mo237985a(C11678b.m48481e());
    }

    @Override // com.bytedance.ee.bear.contract.offline.AbstractC5210a
    /* renamed from: a */
    public void mo20899a(OfflineDoc offlineDoc) {
        C13479a.m54764b("OfflineOperationWrapper", "handleSyncedDoc()...doc = " + offlineDoc);
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.$$Lambda$l$Ekm6gBTDmbWlEcjn2Ezvsfa1pGM */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8523l.m35405b(OfflineDoc.this, (Boolean) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.$$Lambda$l$jm_g3KyUvzv_om36sttfTVayAQ */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8523l.m35401a(OfflineDoc.this, (Boolean) obj);
            }
        }, $$Lambda$l$PFa35SZmbMCSHFdVajv0mJesKE0.INSTANCE);
    }

    public C8523l(C10917c cVar) {
        this.f23064a = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ OfflineDoc m35407c(String str) throws Exception {
        C8200i f = C8153a.m32844b().mo31628f(str);
        return m35394a(f.mo32055h(), f.mo32063j(), f.mo32035c(), f.mo32031b(), f.mo32023a(), f.mo32017U(), f.mo32009M(), f.mo32006J());
    }

    @Override // com.bytedance.ee.bear.contract.offline.AbstractC5210a
    /* renamed from: b */
    public AbstractC68307f<Boolean> mo20901b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function(str) {
                /* class com.bytedance.ee.bear.list.$$Lambda$l$An0uRuYtCaDVVnkgO3kcZti9Z8 */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C8523l.m35397a(this.f$0, (Boolean) obj);
                }
            }).mo237985a(C11678b.m48481e());
        }
        C13479a.m54772d("OfflineOperationWrapper", "deleteOfflineDoc: fakeToken is null");
        return AbstractC68307f.m265083a((Object) false);
    }

    /* renamed from: a */
    private C8201j m35395a(C8175b bVar) {
        C8201j jVar = new C8201j();
        jVar.mo32104a(1);
        jVar.mo32105a(bVar.mo31677a());
        jVar.mo32129k(bVar.mo31709i());
        jVar.mo32125i(bVar.mo31709i());
        jVar.mo32127j(bVar.mo31709i());
        return jVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m35396a(OfflineRenameData offlineRenameData, am amVar) throws Exception {
        amVar.notifyListRename(offlineRenameData.getObjToken(), offlineRenameData.getNewName());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ OfflineRenameData m35404b(OfflineRenameData offlineRenameData, OfflineRenameData offlineRenameData2) throws Exception {
        if (!TextUtils.isEmpty(offlineRenameData.getWikiToken())) {
            C8153a.m32844b().mo31572a(offlineRenameData.getWikiToken(), offlineRenameData.getNewName(), offlineRenameData.getEditTime());
        }
        C8153a.m32844b().mo31572a(offlineRenameData.getObjToken(), offlineRenameData.getNewName(), offlineRenameData.getEditTime());
        C8153a.m32844b().mo31605c(offlineRenameData.getObjToken(), offlineRenameData.getNewName(), offlineRenameData.getEditTime());
        C8153a.m32844b().mo31614d(offlineRenameData.getObjToken(), offlineRenameData.getNewName(), offlineRenameData.getEditTime());
        return offlineRenameData2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m35397a(String str, Boolean bool) throws Exception {
        boolean z;
        if (C8153a.m32844b().mo31621e(str) > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Boolean m35405b(OfflineDoc offlineDoc, Boolean bool) throws Exception {
        int a = C8153a.m32844b().mo31571a(offlineDoc.getFakeToken(), offlineDoc.getObj_token(), 2);
        int b = C8153a.m32844b().mo31596b(offlineDoc.getFakeToken(), offlineDoc.getObj_token(), offlineDoc.getToken());
        int b2 = C8153a.m32844b().mo31594b(9, offlineDoc.getFakeToken());
        C13479a.m54764b("OfflineOperationWrapper", "handleSyncedDoc()...updateListTypeRet = " + b + ", updateDocMetaRet = " + a + ", deleteRet = " + b2);
        return bool;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m35400a(OfflineRenameData offlineRenameData, OfflineRenameData offlineRenameData2) throws Exception {
        return this.f23064a.mo41508c(am.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.$$Lambda$l$VQXxAJ5ejDxmLUhOcb8WmY2obGA */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8523l.m35396a(OfflineRenameData.this, (am) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m35401a(OfflineDoc offlineDoc, Boolean bool) throws Exception {
        C13479a.m54764b("OfflineOperationWrapper", "OfflineOperationWrapper.handleSyncedDoc: onRefresh ");
        if (!TextUtils.isEmpty(offlineDoc.getObj_token())) {
            C8674q.m36243f().mo33640a(offlineDoc);
        }
    }

    /* renamed from: a */
    private String m35398a(AccountService.Account account, long j, boolean z) {
        if (z) {
            return "fake_" + account.f14584a + "_" + j + "_" + "ownerType" + FolderVersion.getNewShareFolderOwnerType();
        }
        return "fake_" + account.f14584a + "_" + j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ OfflineDoc m35393a(long j, boolean z, int i, String str, String str2, C8175b bVar) throws Exception {
        AccountService.Account d = ((an) KoinJavaComponent.m268610a(an.class)).mo16406d();
        if (d != null) {
            bVar.mo31695e(d.f14592i);
            bVar.mo31716k(m35398a(d, j, z));
            bVar.mo31679a(bVar.mo31715k());
            long j2 = j / 1000;
            bVar.mo31728p(Long.toString(j2));
            bVar.mo31710i(Long.toString(j2));
            bVar.mo31687c(String.valueOf(i));
            bVar.mo31699f(d.f14595l);
            bVar.mo31703g(d.f14596m);
            bVar.mo31691d(d.f14584a);
            bVar.mo31707h(d.f14584a);
            bVar.mo31706h(DocVersion.getOwnerType(z));
            boolean b = C5084ad.m20847d().mo20038b().mo20041b();
            bVar.mo31714j(true);
            if (!b) {
                OfflineDoc offlineDoc = new OfflineDoc(bVar.mo31715k(), bVar.mo31715k(), "", OfflineDocsPriority.Low_Priority.ordinal(), i);
                ArrayList arrayList = new ArrayList();
                arrayList.add(offlineDoc);
                C13479a.m54764b("OfflineOperationWrapper", "syncCreatedDocs accept: docs=" + offlineDoc.toString());
                this.f23064a.mo41508c(AbstractC5094ag.class).mo238020d(new Function(arrayList) {
                    /* class com.bytedance.ee.bear.list.$$Lambda$l$_EEcNSDhZj91FpFNpu8_umX19wo */
                    public final /* synthetic */ List f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return ((AbstractC5094ag) obj).uploadDocs(this.f$0);
                    }
                }).mo238001b($$Lambda$l$RIRX61csjT0sy_jUsXC1FQuv98.INSTANCE, $$Lambda$l$SGC4BV39FHEeGHvk0C5nUtZcGis.INSTANCE);
            }
            C13479a.m54764b("OfflineOperationWrapper", "OfflineOperationWrapper.createOfflineDoc: created offlineOperateDoc=" + bVar.toString());
            C8201j jVar = new C8201j();
            jVar.mo32105a(bVar.mo31677a());
            jVar.mo32123h(str);
            jVar.mo32104a(9);
            jVar.mo32110b(true);
            if (C8153a.m32844b().mo31607c(bVar, jVar) >= 0) {
                C13479a.m54764b("OfflineOperationWrapper", "OfflineOperationWrapper.createOfflineDoc: insert to db success ");
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(m35395a(bVar));
                C8201j jVar2 = new C8201j();
                jVar2.mo32104a(2);
                jVar2.mo32105a(bVar.mo31677a());
                jVar2.mo32123h("");
                arrayList2.add(jVar2);
                if (TextUtils.equals(str2, "offline") && ManualOfflineConfig.isEnable(i)) {
                    C8201j jVar3 = new C8201j();
                    jVar3.mo32118f(String.valueOf(System.currentTimeMillis() / 1000));
                    jVar3.mo32104a(7);
                    jVar3.mo32105a(bVar.mo31677a());
                    arrayList2.add(jVar3);
                    Document a = C8200i.m33448a(bVar);
                    if (a != null) {
                        a.mo32480r(str);
                    }
                    ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31506a(false, C8292f.f22432b, str2, false, a, (BinderIManualOfflineCallback) null);
                }
                C8201j jVar4 = new C8201j();
                jVar4.mo32110b(true);
                jVar4.mo32113c(false);
                jVar4.mo32118f(String.valueOf(System.currentTimeMillis() / 1000));
                jVar4.mo32104a(3);
                jVar4.mo32105a(bVar.mo31677a());
                jVar4.mo32123h(str);
                arrayList2.add(jVar4);
                C8153a.m32844b().mo31593a(arrayList2);
                return m35394a(bVar.mo31709i(), bVar.mo31715k(), bVar.mo31685c(), bVar.mo31681b(), bVar.mo31677a(), bVar.mo31670N(), str, "");
            }
            C13479a.m54758a("OfflineOperationWrapper", "OfflineOperationWrapper.createOfflineDoc: 130  add doc fail");
            return new OfflineDoc();
        }
        C13479a.m54758a("OfflineOperationWrapper", "createOfflineDoc: account is null");
        return new OfflineDoc();
    }

    /* renamed from: a */
    private OfflineDoc m35394a(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7) {
        OfflineDoc offlineDoc = new OfflineDoc();
        offlineDoc.setEdit_time(str);
        offlineDoc.setFakeToken(str2);
        try {
            offlineDoc.setType(Integer.parseInt(str3));
        } catch (Exception e) {
            C13479a.m54761a("OfflineOperationWrapper", e);
        }
        offlineDoc.setFilepath(str6);
        offlineDoc.setName(str4);
        offlineDoc.setObj_token(str5);
        offlineDoc.setToken(str7);
        offlineDoc.setSyncState(z ? 1 : 0);
        return offlineDoc;
    }
}
