package com.bytedance.ee.bear.list.cache;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.C1174u;
import androidx.lifecycle.LiveData;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.RoomDatabase;
import androidx.room.p047a.AbstractC1420a;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.NodeType;
import com.bytedance.ee.bear.list.cache.p425a.C8163a;
import com.bytedance.ee.bear.list.cache.p425a.C8164b;
import com.bytedance.ee.bear.list.cache.p425a.C8165c;
import com.bytedance.ee.bear.list.cache.p425a.C8166d;
import com.bytedance.ee.bear.list.cache.p425a.C8167e;
import com.bytedance.ee.bear.list.cache.p425a.C8168f;
import com.bytedance.ee.bear.list.cache.p425a.C8169g;
import com.bytedance.ee.bear.list.cache.p425a.C8170h;
import com.bytedance.ee.bear.list.cache.p425a.C8171i;
import com.bytedance.ee.bear.list.cache.p425a.C8172j;
import com.bytedance.ee.bear.list.cache.p425a.C8173k;
import com.bytedance.ee.bear.list.cache.p425a.C8174l;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.db.AbstractC13648i;
import com.bytedance.ee.util.db.C13636b;
import com.bytedance.ee.util.db.DBController;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p706i.AbstractC13668a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.ee.bear.list.cache.a */
public class C8153a {

    /* renamed from: a */
    private static volatile C8153a f21759a;

    /* renamed from: a */
    public synchronized BearDatabase mo31576a() {
        return (BearDatabase) DBController.m55314a().mo50590b("bear.db");
    }

    /* renamed from: a */
    public LiveData<List<C8200i>> mo31575a(String str) {
        try {
            return mo31576a().mo31544p().mo31948b(3, str, String.valueOf(C8275a.f22370c.mo32555b()));
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C1174u();
        }
    }

    /* renamed from: b */
    public LiveData<List<C8200i>> mo31598b(String str) {
        try {
            return mo31576a().mo31544p().mo31967d(3, str);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C1174u();
        }
    }

    /* renamed from: a */
    public void mo31587a(String str, List<C8175b> list, List<C8201j> list2) {
        try {
            mo31576a().mo7539a(new Runnable(str, list, list2) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$aHzJXJY8Gkw2JomiRjDN5czcSVU */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ List f$2;
                public final /* synthetic */ List f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    C8153a.this.m32848b((C8153a) this.f$1, (String) this.f$2, this.f$3);
                }
            });
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public List<C8200i> mo31579a(int i, String str, String str2) {
        try {
            return mo31576a().mo31544p().mo31933a(i, str, str2);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList();
        }
    }

    /* renamed from: b */
    public List<C8200i> mo31599b(int i) {
        try {
            return mo31576a().mo31544p().mo31950b(i);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public C8200i mo31577a(int i, String str) {
        try {
            return mo31576a().mo31544p().mo31949b(str, i);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C8200i();
        }
    }

    /* renamed from: a */
    public void mo31584a(C8175b bVar, List<C8201j> list) {
        try {
            mo31576a().mo7539a(new Runnable(bVar, list) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$VpkcLoUlmNB3IRQ4C1PBx2tP6GE */
                public final /* synthetic */ C8175b f$1;
                public final /* synthetic */ List f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C8153a.this.m32847b((C8153a) this.f$1, (C8175b) this.f$2);
                }
            });
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public long mo31573a(C8175b bVar) {
        long j;
        try {
            if (bVar.mo31676T()) {
                j = mo31576a().mo31544p().mo31925a(bVar.mo31677a(), bVar.mo31685c(), bVar.mo31712j(), bVar.mo31722m(), bVar.mo31724n(), bVar.mo31729q(), bVar.mo31731r(), bVar.mo31733s(), bVar.mo31735t(), bVar.mo31743w(), bVar.mo31727p(), bVar.mo31744x(), bVar.mo31746y(), bVar.mo31748z(), bVar.mo31657A(), bVar.mo31669M(), bVar.mo31666J(), bVar.mo31667K(), bVar.mo31668L(), bVar.mo31671O(), bVar.mo31672P(), bVar.mo31673Q(), bVar.mo31674R());
            } else {
                j = mo31576a().mo31544p().mo31924a(bVar.mo31677a(), bVar.mo31681b(), bVar.mo31685c(), bVar.mo31689d(), bVar.mo31693e(), bVar.mo31697f(), bVar.mo31701g(), bVar.mo31705h(), bVar.mo31709i(), bVar.mo31712j(), bVar.mo31715k(), bVar.mo31722m(), bVar.mo31724n(), bVar.mo31729q(), bVar.mo31731r(), bVar.mo31733s(), bVar.mo31735t(), bVar.mo31743w(), bVar.mo31658B(), bVar.mo31720l(), bVar.mo31727p(), bVar.mo31662F(), bVar.mo31738u(), bVar.mo31744x(), bVar.mo31746y(), bVar.mo31748z(), bVar.mo31657A(), bVar.mo31659C(), bVar.mo31660D(), bVar.mo31661E(), bVar.mo31663G(), bVar.mo31664H(), bVar.mo31669M(), bVar.mo31666J(), bVar.mo31667K(), bVar.mo31668L(), bVar.mo31671O(), bVar.mo31672P(), bVar.mo31673Q(), bVar.mo31726o(), bVar.mo31674R(), bVar.mo31675S());
            }
            return j <= 0 ? mo31576a().mo31544p().mo31922a(bVar) : j;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: a */
    public void mo31583a(C8175b bVar, C8201j jVar) {
        try {
            mo31576a().mo7539a(new Runnable(bVar, jVar) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$wn6yWOoBRlrFAcW8TRESdLKJWJ4 */
                public final /* synthetic */ C8175b f$1;
                public final /* synthetic */ C8201j f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C8153a.this.m32855f((C8153a) this.f$1, (C8175b) this.f$2);
                }
            });
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: b */
    public void mo31600b(C8175b bVar, C8201j jVar) {
        try {
            mo31576a().mo7539a(new Runnable(bVar, jVar) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$VpuxR9hZxHBsVaUTFEmV_kcSMM */
                public final /* synthetic */ C8175b f$1;
                public final /* synthetic */ C8201j f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C8153a.this.m32854e((C8153a) this.f$1, (C8175b) this.f$2);
                }
            });
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public long[] mo31593a(List<C8201j> list) {
        if (list == null || list.isEmpty()) {
            return new long[]{-1};
        }
        try {
            long[] a = mo31576a().mo31544p().mo31938a(list);
            C13479a.m54772d("DatabaseManager", "insertListType: typeRet=" + Arrays.toString(a));
            return a;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new long[]{-1};
        }
    }

    /* renamed from: a */
    public void mo31589a(List<C8175b> list, List<C8201j> list2) {
        try {
            mo31576a().mo7539a(new Runnable(list, list2) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$0ZtPPg5jTERdg9QbwOL4bEpccIY */
                public final /* synthetic */ List f$1;
                public final /* synthetic */ List f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C8153a.this.m32853d((C8153a) this.f$1, this.f$2);
                }
            });
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public List<String> mo31580a(long j) {
        try {
            return mo31576a().mo31544p().mo31934a(j);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public void mo31586a(String str, String str2, boolean z) {
        try {
            int a = mo31576a().mo31544p().mo31915a(3, str, str2, z);
            C13479a.m54772d("DatabaseManager", "updateListTypes: ret=" + a);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public void mo31588a(String str, boolean z) {
        try {
            int a = mo31576a().mo31544p().mo31920a(str, z);
            C13479a.m54764b("DatabaseManager", "updateDocPined()...ret = " + a);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: b */
    public void mo31602b(String str, boolean z) {
        try {
            int b = mo31576a().mo31544p().mo31947b(str, z);
            C13479a.m54764b("DatabaseManager", "updateDocStar()...ret = " + b);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: c */
    public void mo31612c(String str, boolean z) {
        try {
            int c = mo31576a().mo31544p().mo31961c(str, z);
            C13479a.m54764b("DatabaseManager", "updateDocSubscribed()...ret = " + c);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public void mo31585a(String str, String str2) {
        try {
            int a = mo31576a().mo31544p().mo31917a(str, str2);
            C13479a.m54764b("DatabaseManager", "updateDocSize()...ret = " + a);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public void mo31591a(List<C8175b> list, List<C8201j> list2, List<C8176c> list3, int i, FolderSortStrategy folderSortStrategy) {
        try {
            mo31576a().mo7539a(new Runnable(list, list2, folderSortStrategy, i, list3) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$wbafMWRtvv1rJ55blEqhSepT2VQ */
                public final /* synthetic */ List f$1;
                public final /* synthetic */ List f$2;
                public final /* synthetic */ FolderSortStrategy f$3;
                public final /* synthetic */ int f$4;
                public final /* synthetic */ List f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    C8153a.this.m32843a((C8153a) this.f$1, this.f$2, (List) this.f$3, (FolderSortStrategy) this.f$4, (int) this.f$5);
                }
            });
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: b */
    public void mo31603b(List<C8175b> list, List<C8201j> list2) {
        try {
            mo31576a().mo7539a(new Runnable(list, list2) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$SQv0YEH82LPzBv8s8_kmKCcHT5c */
                public final /* synthetic */ List f$1;
                public final /* synthetic */ List f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C8153a.this.m32851c((C8153a) this.f$1, this.f$2);
                }
            });
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: b */
    public void mo31601b(String str, String str2) {
        try {
            int b = mo31576a().mo31544p().mo31945b(str, str2);
            C13479a.m54764b("DatabaseManager", "updateTitle: ret=" + b);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public List<C8175b> mo31581a(Set<String> set) {
        try {
            C13479a.m54764b("DatabaseManager", "queryListCached()...");
            return mo31576a().mo31544p().mo31936a(set);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public void mo31582a(FolderSortStrategy folderSortStrategy) {
        try {
            long a = mo31576a().mo16369m().mo31911a(folderSortStrategy);
            C13479a.m54772d("DatabaseManager", "insertSortStrategy()...: ret=" + a);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public List<C8177d> mo31578a(int i, FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null) {
            return mo31576a().mo31544p().mo31931a(i, folderSortStrategy.mo31554d(), folderSortStrategy.mo31560f(), folderSortStrategy.mo31549b(), folderSortStrategy.mo31558e(), folderSortStrategy.mo31545a());
        }
        try {
            return new ArrayList();
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList();
        }
    }

    /* renamed from: b */
    public void mo31604b(List<C8175b> list, List<C8201j> list2, List<C8176c> list3, int i, FolderSortStrategy folderSortStrategy) {
        try {
            mo31576a().mo7539a(new Runnable(i, list, list2, folderSortStrategy, list3) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$zLdzjBhnoT2ZXgNFVWuTbjVGo2Q */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ List f$2;
                public final /* synthetic */ List f$3;
                public final /* synthetic */ FolderSortStrategy f$4;
                public final /* synthetic */ List f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    C8153a.this.m32846b((C8153a) this.f$1, (int) this.f$2, this.f$3, (List) this.f$4, (FolderSortStrategy) this.f$5);
                }
            });
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: c */
    public void mo31613c(List<C8175b> list, List<C8201j> list2, List<C8176c> list3, int i, FolderSortStrategy folderSortStrategy) {
        try {
            mo31576a().mo7539a(new Runnable(i, list, list2, folderSortStrategy, list3) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$0F_QRDTi7m_MuaojPBN1iqq6hi8 */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ List f$2;
                public final /* synthetic */ List f$3;
                public final /* synthetic */ FolderSortStrategy f$4;
                public final /* synthetic */ List f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    C8153a.this.m32839a((C8153a) this.f$1, (int) this.f$2, this.f$3, (List) this.f$4, (FolderSortStrategy) this.f$5);
                }
            });
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public void mo31590a(List<C8175b> list, List<C8201j> list2, int i) {
        try {
            mo31576a().mo7539a(new Runnable(i, list, list2) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$UFBbIe4VH3BYLwf0F4a77EibtWo */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ List f$2;
                public final /* synthetic */ List f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    C8153a.this.m32838a((C8153a) this.f$1, (int) this.f$2, this.f$3);
                }
            });
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public void mo31592a(boolean z) {
        try {
            mo31576a().mo31544p().mo31937a(z);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: d */
    public void mo31620d(String str, String str2) {
        try {
            int a = mo31576a().mo31542n().mo32167a(str, str2);
            C13479a.m54764b("DatabaseManager", "updateRecentWikiTitle()...ret = " + a);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: b */
    public static C8153a m32844b() {
        return m32845b(C13615c.f35773a);
    }

    /* renamed from: l */
    public LiveData<List<C8202k>> mo31645l() {
        try {
            return new AbstractC13668a<List<C8202k>>() {
                /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass38 */

                @Override // com.bytedance.ee.util.p706i.AbstractC13668a
                /* renamed from: f */
                public LiveData<List<C8202k>> mo31656f() {
                    return C8153a.this.mo31576a().mo31542n().mo32169a();
                }
            };
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C1174u();
        }
    }

    /* renamed from: g */
    public int mo31631g() {
        try {
            return mo31576a().mo31544p().mo31954c(4, C8275a.f22370c.mo32555b());
        } catch (Exception e) {
            C13606d.m55244a(e);
            return 0;
        }
    }

    /* renamed from: i */
    public LiveData<List<C8200i>> mo31638i() {
        try {
            return mo31576a().mo31544p().mo31926a(2);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C1174u();
        }
    }

    /* renamed from: k */
    public List<C8200i> mo31642k() {
        try {
            List<C8200i> b = mo31576a().mo31544p().mo31950b(7);
            m32858j(b);
            return b;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList();
        }
    }

    /* renamed from: m */
    public List<String> mo31647m() {
        try {
            return mo31576a().mo31544p().mo31930a();
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList();
        }
    }

    /* renamed from: p */
    public void mo31652p() {
        try {
            mo31576a().mo31542n().mo32172c();
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: r */
    public List<C8213o> mo31654r() {
        try {
            return mo31576a().mo31543o().mo32220b();
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList();
        }
    }

    /* renamed from: s */
    public LiveData<List<C8213o>> mo31655s() {
        try {
            return mo31576a().mo31543o().mo32221c();
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new LiveData<List<C8213o>>() {
                /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass39 */
            };
        }
    }

    /* renamed from: h */
    public int mo31635h() {
        try {
            int d = mo31576a().mo31544p().mo31962d(0);
            C13479a.m54772d("DatabaseManager", "deleteDocStatusAll()... ret = " + d);
            return d;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: o */
    public List<C8202k> mo31651o() {
        try {
            return mo31576a().mo31542n().mo32171b();
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList();
        }
    }

    /* renamed from: q */
    public void mo31653q() {
        try {
            int a = mo31576a().mo31543o().mo32212a();
            C13479a.m54772d("DatabaseManager", "clearWikiSpace()...ret = " + a);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: e */
    public LiveData<List<C8200i>> mo31622e() {
        try {
            return mo31576a().mo31544p().mo31928a(4, C8275a.f22370c.mo32555b(), false);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C1174u();
        }
    }

    /* renamed from: n */
    public List<C8202k> mo31649n() {
        List<C8202k> o = mo31651o();
        List<String> m = mo31647m();
        HashMap hashMap = new HashMap();
        if (!CollectionUtils.isEmpty(o) && !CollectionUtils.isEmpty(m)) {
            for (String str : m) {
                hashMap.put(str, str);
            }
            for (C8202k kVar : o) {
                String str2 = (String) hashMap.get(kVar.mo32136a());
                String str3 = (String) hashMap.get(kVar.mo32161l());
                if (!(str2 == null || str3 == null)) {
                    kVar.mo32140b(2);
                }
            }
        }
        if (o != null) {
            return o;
        }
        return new ArrayList();
    }

    /* renamed from: j */
    public void mo31641j() {
        try {
            int a = mo31576a().mo31544p().mo31914a(1, 7, 9, "fake_");
            int b = mo31576a().mo31544p().mo31944b("fake_");
            C13479a.m54772d("DatabaseManager", "deleteOnlineListTypeAndDocMetas()...listTypeRet = " + a + ", docMetaRet = " + b);
        } catch (Exception e) {
            C13479a.m54758a("DatabaseManager", "deleteOnlineListTypeAndDocMetas()...error = " + e);
            C13606d.m55244a(e);
        }
    }

    /* renamed from: c */
    public LiveData<List<C8200i>> mo31608c() {
        try {
            return new AbstractC13668a<List<C8200i>>() {
                /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass37 */

                @Override // com.bytedance.ee.util.p706i.AbstractC13668a
                /* renamed from: f */
                public LiveData<List<C8200i>> mo31656f() {
                    return C8153a.this.mo31576a().mo31544p().mo31966d(4, C8275a.f22370c.mo32555b());
                }
            };
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C1174u();
        }
    }

    /* renamed from: f */
    public void mo31629f() {
        try {
            mo31576a().mo31544p().mo31951b(4, C8275a.f22370c.mo32555b());
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: d */
    public LiveData<List<C8200i>> mo31617d() {
        try {
            return mo31576a().mo31544p().mo31927a(4, C8275a.f22370c.mo32555b());
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C1174u();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m32860l(List list) {
        mo31652p();
        mo31626e(list);
    }

    /* renamed from: a */
    public LiveData<List<C8200i>> mo31574a(final int i) {
        try {
            return new AbstractC13668a<List<C8200i>>() {
                /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass36 */

                @Override // com.bytedance.ee.util.p706i.AbstractC13668a
                /* renamed from: f */
                public LiveData<List<C8200i>> mo31656f() {
                    return C8153a.this.mo31576a().mo31544p().mo31926a(i);
                }
            };
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C1174u();
        }
    }

    /* renamed from: h */
    public int mo31636h(String str) {
        return mo31576a().mo31544p().mo31971f(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32841a(Boolean bool) throws Exception {
        m32844b().mo31618d(100);
        m32844b().mo31641j();
    }

    /* renamed from: b */
    public int mo31597b(List<String> list) {
        int i = 0;
        if (com.larksuite.framework.utils.CollectionUtils.isEmpty(list)) {
            return 0;
        }
        for (String str : list) {
            mo31621e(str);
            i++;
        }
        return i;
    }

    /* renamed from: e */
    public int mo31621e(String str) {
        try {
            mo31576a().mo7535a(new Callable(str) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$D6FEm3fjSsLqK4mDzTEdREofr0 */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C8153a.this.m32861p(this.f$1);
                }
            });
            return -1;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: f */
    public C8200i mo31628f(String str) {
        try {
            return mo31576a().mo31544p().mo31949b(str, 9);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C8200i();
        }
    }

    /* renamed from: h */
    public void mo31637h(List<C8213o> list) {
        try {
            mo31576a().mo7539a(new Runnable(list) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$f_IqYH2fnVo6_pssFelBZ5XrR80 */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C8153a.this.m32859k((C8153a) this.f$1);
                }
            });
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: n */
    public C8213o mo31648n(String str) {
        try {
            return mo31576a().mo31543o().mo32219b(str);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return null;
        }
    }

    /* renamed from: o */
    public C8175b mo31650o(String str) {
        try {
            return mo31576a().mo31544p().mo31929a(str);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return null;
        }
    }

    /* renamed from: b */
    private static C8153a m32845b(Context context) {
        C13479a.m54772d("DatabaseManager", "load: ");
        if (f21759a == null) {
            synchronized (C8153a.class) {
                if (f21759a == null) {
                    C13479a.m54772d("DatabaseManager", "load: new");
                    f21759a = new C8153a(context);
                    m32840a(context);
                }
            }
        }
        return f21759a;
    }

    /* renamed from: i */
    private long[] m32857i(List<C8175b> list) {
        if (list == null) {
            return new long[0];
        }
        try {
            long[] jArr = new long[list.size()];
            for (int i = 0; i < list.size(); i++) {
                jArr[i] = mo31573a(list.get(i));
            }
            return jArr;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new long[0];
        }
    }

    /* renamed from: j */
    private void m32858j(List<C8200i> list) {
        if (!com.larksuite.framework.utils.CollectionUtils.isEmpty(list)) {
            for (C8200i iVar : list) {
                if (!C8212n.m33653a(iVar.mo32015S())) {
                    iVar.mo32052g(5);
                } else {
                    iVar.mo32052g(7);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m32859k(List list) {
        int a = mo31576a().mo31543o().mo32212a();
        long[] a2 = mo31576a().mo31543o().mo32217a(list);
        C13479a.m54772d("DatabaseManager", "clearAndSaveWikiSpace: delete = " + a + ", ret= " + Arrays.toString(a2));
    }

    /* renamed from: l */
    public int mo31644l(String str) {
        int i = 0;
        try {
            i = mo31576a().mo31542n().mo32166a(str);
            C13479a.m54772d("DatabaseManager", "delete: ret=" + i);
            return i;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return i;
        }
    }

    /* renamed from: m */
    public int mo31646m(String str) {
        try {
            int a = mo31576a().mo31543o().mo32213a(str);
            C13479a.m54764b("DatabaseManager", "deleteWikiSpaceByObjToken()...ret = " + a);
            return a;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Integer m32861p(String str) throws Exception {
        int i;
        int c = mo31576a().mo31544p().mo31958c(str, NodeType.SHORT_CUT.getValue());
        int e = mo31576a().mo31544p().mo31969e(str);
        if (e == 0) {
            i = mo31576a().mo31544p().mo31957c(str);
        } else {
            i = 0;
        }
        C13479a.m54764b("DatabaseManager", "deleteListDocByObjToken: typeRet=" + c + ", count = " + e + ", metaRet = " + i);
        return Integer.valueOf(i);
    }

    /* renamed from: g */
    public void mo31633g(String str) {
        C13479a.m54764b("DatabaseManager", "saveDocCachedStatus token: ");
        if (!TextUtils.isEmpty(str)) {
            AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(str) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$L_VoYiuOz55vTd3VomdXwfcAZk */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8153a.this.m32856f((C8153a) this.f$1, (String) obj);
                }
            }, $$Lambda$a$CzrpWy1zR11wpyF1vSr6NnSABgA.INSTANCE);
        }
    }

    /* renamed from: i */
    public FolderSortStrategy mo31639i(String str) {
        try {
            return mo31576a().mo16369m().mo31912a(str);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new FolderSortStrategy();
        }
    }

    /* renamed from: j */
    public List<Document> mo31640j(String str) {
        List<C8200i> list;
        try {
            list = mo31576a().mo31544p().mo31932a(2, str);
        } catch (Exception e) {
            C13606d.m55244a(e);
            list = null;
        }
        HashSet hashSet = new HashSet();
        if (!com.larksuite.framework.utils.CollectionUtils.isEmpty(list)) {
            hashSet.addAll(C8200i.m33450a(list));
        }
        ArrayList arrayList = new ArrayList(hashSet.size());
        arrayList.addAll(hashSet);
        return arrayList;
    }

    /* renamed from: k */
    public boolean mo31643k(String str) {
        try {
            return !com.larksuite.framework.utils.CollectionUtils.isEmpty(mo31576a().mo31544p().mo31935a(str, 7));
        } catch (Exception e) {
            C13606d.m55244a(e);
            return false;
        }
    }

    /* renamed from: c */
    public int mo31606c(List<String> list) {
        C13479a.m54764b("DatabaseManager", "saveCachedStatus(List<String> objTokens)");
        boolean z = false;
        try {
            for (String str : list) {
                if (mo31576a().mo31544p().mo31971f(str) != 2 && mo31576a().mo31544p().mo31964d(str, 2) <= 0) {
                    C8175b bVar = new C8175b();
                    bVar.mo31679a(str);
                    bVar.mo31682b(2);
                    if (mo31576a().mo31544p().mo31922a(bVar) <= 0) {
                        z = true;
                    }
                }
            }
            if (z) {
                return -1;
            }
            return 1;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: e */
    public List<C8213o> mo31623e(int i) {
        try {
            return mo31576a().mo31543o().mo32216a(i);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList();
        }
    }

    /* renamed from: g */
    public void mo31634g(List<C8213o> list) {
        try {
            long[] a = mo31576a().mo31543o().mo32217a(list);
            C13479a.m54772d("DatabaseManager", "insertWikiSpace: ret=" + Arrays.toString(a));
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public static void m32840a(Context context) {
        long d = C13675f.m55525d(context.getDatabasePath(DBController.m55314a().mo50585a(context, "bear.db")).getAbsolutePath()) / 1024;
        C13479a.m54772d("DatabaseManager", " checkAndReduceDb   dbSize = " + d);
        if (d > 1048576) {
            AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b($$Lambda$a$__NG4gExmPiMNnAssrMFdFCrRs.INSTANCE, $$Lambda$a$JAP38QX41YyD7N7VkeIFgp7yEK8.INSTANCE);
        }
    }

    /* renamed from: d */
    public int mo31616d(List<String> list) {
        C13479a.m54764b("DatabaseManager", "delCachedStatus(List<String> doc_tokens)");
        if (com.larksuite.framework.utils.CollectionUtils.isEmpty(list)) {
            return -1;
        }
        try {
            return mo31576a().mo31544p().mo31921a(list, 0);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    private C8153a(Context context) {
        C81541 r1 = new RoomDatabase.AbstractC1417b() {
            /* class com.bytedance.ee.bear.list.cache.C8153a.C81541 */

            @Override // androidx.room.RoomDatabase.AbstractC1417b
            /* renamed from: a */
            public void mo7559a(AbstractC1082b bVar) {
                super.mo7559a(bVar);
                C13479a.m54772d("DatabaseManager", "onCreate: ");
            }

            @Override // androidx.room.RoomDatabase.AbstractC1417b
            /* renamed from: b */
            public void mo7560b(AbstractC1082b bVar) {
                super.mo7560b(bVar);
                C13479a.m54772d("DatabaseManager", "onOpen: ");
            }
        };
        AnonymousClass12 r2 = new AbstractC1420a(1, 2) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass12 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `TrashDoc` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `token` TEXT, `type` TEXT, `create_uid` TEXT, `creator_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `expire_time` TEXT, `obj_token` TEXT, `url` TEXT)");
            }
        };
        AnonymousClass23 r5 = new AbstractC1420a(3, 4) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass23 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("update PersonalDoc set filepath='' where filepath='/'");
                bVar.execSQL("update RecentDoc set filepath='' where filepath='/'");
                bVar.execSQL("update ShareDoc set filepath='' where filepath='/'");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `OfflineOperateDoc` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `fakeToken` TEXT, `groups` INTEGER NOT NULL, `operator` INTEGER NOT NULL, `userid` TEXT, `needSync` INTEGER NOT NULL, `filepath` TEXT, `name` TEXT, `token` TEXT, `type` TEXT, `create_uid` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `obj_token` TEXT, `url` TEXT)");
            }
        };
        AnonymousClass34 r8 = new AbstractC1420a(4, 5) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass34 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `PersonalDoc`");
                bVar.execSQL("DROP TABLE IF EXISTS `RecentDoc`");
                bVar.execSQL("DROP TABLE IF EXISTS `ShareDoc`");
                bVar.execSQL("DROP TABLE IF EXISTS `TrashDoc`");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `PersonalDoc` (`token` TEXT NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `type` TEXT, `create_uid` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `obj_token` TEXT, `url` TEXT, `fake_token` TEXT, `needSync` INTEGER NOT NULL, PRIMARY KEY(`token`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `RecentDoc` (`token` TEXT NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `type` TEXT, `create_uid` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `obj_token` TEXT, `url` TEXT, `fake_token` TEXT, `needSync` INTEGER NOT NULL, PRIMARY KEY(`token`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `ShareDoc` (`token` TEXT NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `type` TEXT, `create_uid` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `obj_token` TEXT, `url` TEXT, `fake_token` TEXT, `needSync` INTEGER NOT NULL, PRIMARY KEY(`token`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `TrashDoc` (`token` TEXT NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `type` TEXT, `create_uid` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `expire_time` TEXT, `obj_token` TEXT, `url` TEXT, `fake_token` TEXT, `needSync` INTEGER NOT NULL, PRIMARY KEY(`token`))");
            }
        };
        AnonymousClass40 r7 = new AbstractC1420a(5, 6) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass40 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN space_id TEXT");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN link_token TEXT");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN space_id TEXT");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN link_token TEXT");
                bVar.execSQL("ALTER TABLE TrashDoc ADD COLUMN space_id TEXT");
                bVar.execSQL("ALTER TABLE TrashDoc ADD COLUMN link_token TEXT");
            }
        };
        AnonymousClass41 r9 = new AbstractC1420a(6, 7) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass41 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `RecentDoc`");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `RecentDoc` (`userid` TEXT, `filepath` TEXT, `name` TEXT, `type` TEXT, `create_uid` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `obj_token` TEXT NOT NULL, `url` TEXT, `fake_token` TEXT, `needSync` INTEGER NOT NULL, PRIMARY KEY(`obj_token`))");
            }
        };
        AnonymousClass42 r10 = new AbstractC1420a(7, 8) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass42 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `StatusDoc` (`doc_token` TEXT NOT NULL, `doc_type` INTEGER NOT NULL, `doc_sync_status` INTEGER NOT NULL, `doc_cache_status` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, PRIMARY KEY(`doc_token`,`doc_type`))");
                bVar.execSQL("CREATE INDEX IF NOT EXISTS index_doc_token ON StatusDoc(`doc_token`)");
            }
        };
        AnonymousClass43 r11 = new AbstractC1420a(8, 9) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass43 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN is_external INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN is_external INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN is_external INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE TrashDoc ADD COLUMN is_external INTEGER NOT NULL DEFAULT 0");
            }
        };
        AnonymousClass44 r12 = new AbstractC1420a(9, 10) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass44 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `PinedDoc` (`uuid` TEXT NOT NULL PRIMARY KEY, `userid` TEXT, `token` TEXT, `name` TEXT, `type` TEXT, `pin_time` TEXT, `is_pined` INTEGER NOT NULL DEFAULT 0, `edit_uid` TEXT, `edit_time` TEXT, `owner_id` TEXT, `space_id` TEXT, `share_root` INTEGER NOT NULL DEFAULT 0, `is_stared` INTEGER NOT NULL DEFAULT 0, `imgUrl` TEXT, `imgTypes` TEXT, `is_external` INTEGER NOT NULL DEFAULT 0)");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `StarDoc` (`uuid` TEXT NOT NULL PRIMARY KEY, `token` TEXT, `userid` TEXT, `name` TEXT, `type` INTEGER NOT NULL DEFAULT 0, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `obj_token` TEXT, `space_id` TEXT, `star_time` TEXT, `is_external` INTEGER NOT NULL DEFAULT 0)");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN is_star INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN is_pine  INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN is_star INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN is_pine  INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN is_star INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN is_pine  INTEGER NOT NULL DEFAULT 0");
            }
        };
        C81552 r13 = new AbstractC1420a(10, 11) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.C81552 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN share_time TEXT");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN open_time TEXT");
            }
        };
        C81563 r14 = new AbstractC1420a(11, 12) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.C81563 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE OfflineOperateDoc ADD COLUMN offline_create INTEGER NOT NULL DEFAULT 0");
            }
        };
        C81574 r15 = new AbstractC1420a(12, 13) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.C81574 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN filepath TEXT");
            }
        };
        C81585 r4 = new AbstractC1420a(13, 14) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.C81585 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE PinedDoc ADD COLUMN url TEXT");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN url TEXT");
            }
        };
        C81596 r6 = new AbstractC1420a(14, 15) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.C81596 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN offline_create INTEGER NOT NULL DEFAULT 0");
            }
        };
        C81607 r3 = new AbstractC1420a(15, 16) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.C81607 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN subtype TEXT");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN subtype TEXT");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN subtype TEXT");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN subtype TEXT");
                bVar.execSQL("ALTER TABLE OfflineOperateDoc ADD COLUMN subtype TEXT");
                bVar.execSQL("ALTER TABLE PinedDoc ADD COLUMN subtype TEXT");
            }
        };
        C81618 r42 = new AbstractC1420a(16, 17) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.C81618 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `FolderSortStrategy` (`obj_token` TEXT PRIMARY KEY NOT NULL, `strategy` INTEGER NOT NULL, `update_time` TEXT)");
                bVar.execSQL("ALTER TABLE OfflineOperateDoc ADD COLUMN create_time TEXT");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN create_time TEXT");
            }
        };
        C81629 r62 = new AbstractC1420a(17, 18) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.C81629 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN extra TEXT");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN extra TEXT");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN extra TEXT");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN extra TEXT");
                bVar.execSQL("ALTER TABLE OfflineOperateDoc ADD COLUMN extra TEXT");
                bVar.execSQL("ALTER TABLE PinedDoc ADD COLUMN extra TEXT");
            }
        };
        AnonymousClass10 r32 = new AbstractC1420a(18, 19) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass10 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `OfflineOperateDoc_New` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `fakeToken` TEXT, `groups` INTEGER NOT NULL, `operator` INTEGER NOT NULL, `userid` TEXT, `needSync` INTEGER NOT NULL, `filepath` TEXT, `name` TEXT, `token` TEXT, `type` TEXT, `owner_id` TEXT, `create_tenant_id` TEXT, `create_time` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `obj_token` TEXT, `url` TEXT, `subtype` TEXT, `offline_create` INTEGER NOT NULL DEFAULT 0, `extra` TEXT)");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `PersonalDoc_New` (`token` TEXT PRIMARY KEY NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `type` TEXT, `owner_id` TEXT, `create_tenant_id` TEXT, `create_time` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `obj_token` TEXT, `url` TEXT, `fake_token` TEXT, `needSync` INTEGER NOT NULL, `space_id` TEXT, `is_external` INTEGER NOT NULL DEFAULT 0, `is_star` INTEGER NOT NULL DEFAULT 0, `is_pine` INTEGER NOT NULL DEFAULT 0, `subtype` TEXT, `extra` TEXT)");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `RecentDoc_New` (`obj_token` TEXT PRIMARY KEY NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `type` TEXT, `owner_id` TEXT, `create_tenant_id` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `url` TEXT, `fake_token` TEXT, `needSync` INTEGER NOT NULL, `is_external` INTEGER NOT NULL DEFAULT 0, `is_star` INTEGER NOT NULL DEFAULT 0, `is_pine` INTEGER NOT NULL DEFAULT 0, `open_time` TEXT, `subtype` TEXT, `offline_create` INTEGER NOT NULL DEFAULT 0, `extra` TEXT)");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `ShareDoc_New` (`token` TEXT PRIMARY KEY NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `type` TEXT, `owner_id` TEXT, `tenant_id` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `obj_token` TEXT, `url` TEXT, `fake_token` TEXT, `needSync` INTEGER NOT NULL, `space_id` TEXT, `is_external` INTEGER NOT NULL DEFAULT 0, `is_star` INTEGER NOT NULL DEFAULT 0, `is_pine` INTEGER NOT NULL DEFAULT 0, `share_time` TEXT, `subtype` TEXT, `extra` TEXT)");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `TrashDoc_New` (`token` TEXT PRIMARY KEY NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `type` TEXT, `owner_id` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `expire_time` TEXT, `obj_token` TEXT, `url` TEXT, `fake_token` TEXT, `needSync` INTEGER NOT NULL, `space_id` TEXT, `is_external` INTEGER NOT NULL DEFAULT 0)");
                bVar.execSQL("INSERT INTO OfflineOperateDoc_New(id, fakeToken, groups, operator, userid, needSync, filepath, name, token, type, owner_id, create_time, creator_cn_name, creator_en_name, edit_uid, edit_time, obj_token, url, subtype, offline_create, extra) SELECT id, fakeToken, groups, operator, userid, needSync, filepath, name, token, type, create_uid, create_time, creator_cn_name, creator_en_name, edit_uid, edit_time, obj_token, url, subtype, offline_create, extra FROM OfflineOperateDoc");
                bVar.execSQL("INSERT INTO PersonalDoc_New(token, userid, filepath, name, type, owner_id, create_time, creator_cn_name, creator_en_name, edit_uid, edit_time, obj_token, url, fake_token, needSync, space_id, is_external, is_star, is_pine, subtype, extra) SELECT token, userid, filepath, name, type, create_uid, create_time, creator_cn_name, creator_en_name, edit_uid, edit_time, obj_token, url, fake_token, needSync, space_id, is_external, is_star, is_pine, subtype, extra FROM PersonalDoc");
                bVar.execSQL("INSERT INTO RecentDoc_New(obj_token, userid, filepath, name, type, owner_id, creator_cn_name, creator_en_name, edit_uid, edit_time, url, fake_token, needSync, is_external, is_star, is_pine, open_time, subtype, offline_create, extra) SELECT obj_token, userid, filepath, name, type, create_uid, creator_cn_name, creator_en_name, edit_uid, edit_time, url, fake_token, needSync, is_external, is_star, is_pine, open_time, subtype, offline_create, extra FROM RecentDoc");
                bVar.execSQL("INSERT INTO ShareDoc_New(token, userid, filepath, name, type, owner_id, creator_cn_name, creator_en_name, edit_uid, edit_time, obj_token, url, fake_token, needSync, space_id, is_external, is_star, is_pine, share_time, subtype, extra) SELECT token, userid, filepath, name, type, create_uid, creator_cn_name, creator_en_name, edit_uid, edit_time, obj_token, url, fake_token, needSync, space_id, is_external, is_star, is_pine, share_time, subtype, extra FROM ShareDoc");
                bVar.execSQL("INSERT INTO TrashDoc_New(token, userid, filepath, name, type, owner_id, creator_cn_name, creator_en_name, edit_uid, edit_time, expire_time, obj_token, url, fake_token, needSync, space_id, is_external) SELECT token, userid, filepath, name, type, create_uid, creator_cn_name, creator_en_name, edit_uid, edit_time, expire_time, obj_token, url, fake_token, needSync, space_id, is_external FROM TrashDoc");
                bVar.execSQL("DROP TABLE IF EXISTS 'OfflineOperateDoc'");
                bVar.execSQL("DROP TABLE IF EXISTS 'PersonalDoc'");
                bVar.execSQL("DROP TABLE IF EXISTS 'RecentDoc'");
                bVar.execSQL("DROP TABLE IF EXISTS 'ShareDoc'");
                bVar.execSQL("DROP TABLE IF EXISTS 'TrashDoc'");
                bVar.execSQL("ALTER TABLE OfflineOperateDoc_New RENAME TO OfflineOperateDoc");
                bVar.execSQL("ALTER TABLE PersonalDoc_New RENAME TO PersonalDoc");
                bVar.execSQL("ALTER TABLE RecentDoc_New RENAME TO RecentDoc");
                bVar.execSQL("ALTER TABLE ShareDoc_New RENAME TO ShareDoc");
                bVar.execSQL("ALTER TABLE TrashDoc_New RENAME TO TrashDoc");
                bVar.execSQL("ALTER TABLE PinedDoc ADD COLUMN tenant_id TEXT");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN owner_id TEXT");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN create_tenant_id TEXT");
            }
        };
        AnonymousClass11 r43 = new AbstractC1420a(19, 20) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass11 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN icon_url TEXT");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN icon_key TEXT");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN icon_nonce TEXT");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN icon_encrypted_type INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN icon_url TEXT");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN icon_key TEXT");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN icon_nonce TEXT");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN icon_encrypted_type INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN icon_url TEXT");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN icon_key TEXT");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN icon_nonce TEXT");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN icon_encrypted_type INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN icon_url TEXT");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN icon_key TEXT");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN icon_nonce TEXT");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN icon_encrypted_type INTEGER NOT NULL DEFAULT 0");
            }
        };
        AnonymousClass13 r63 = new AbstractC1420a(20, 21) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass13 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN is_share_root INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN is_share_root INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN is_share_root INTEGER NOT NULL DEFAULT 0");
            }
        };
        AnonymousClass14 r33 = new AbstractC1420a(21, 22) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass14 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `RecentPull` (`time_range` TEXT NOT NULL PRIMARY KEY, `smaller_time` TEXT, `bigger_time` TEXT, `last_label` TEXT, `uid` TEXT)");
            }
        };
        AnonymousClass15 r44 = new AbstractC1420a(22, 23) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass15 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `MineDoc` (`obj_token` TEXT PRIMARY KEY NOT NULL,`user_id` TEXT,`owner_id` TEXT,`filepath` TEXT,`name` TEXT,`type` INTEGER NOT NULL DEFAULT 2,`create_tenant_id` TEXT,`create_time` TEXT,`creator_cn_name` TEXT,`creator_en_name` TEXT,`edit_uid` TEXT,`edit_time` TEXT,`url` TEXT,`thumbnail` TEXT,`fake_token` TEXT,`needSync` INTEGER NOT NULL DEFAULT 0,`is_stared` INTEGER NOT NULL DEFAULT 0,`subtype` TEXT,`parent` TEXT,`extra` TEXT,`icon` TEXT,`icon_key` TEXT,`icon_nonce` TEXT,`icon_encrypted_type` INTEGER NOT NULL DEFAULT 0)");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN thumbnail TEXT");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN thumbnail TEXT");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN thumbnail TEXT");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN thumbnail TEXT");
                bVar.execSQL("ALTER TABLE FolderSortStrategy ADD COLUMN type INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE FolderSortStrategy ADD COLUMN file_type TEXT");
                bVar.execSQL("ALTER TABLE FolderSortStrategy ADD COLUMN forbidden_file_type TEXT");
                bVar.execSQL("ALTER TABLE FolderSortStrategy ADD COLUMN is_asc INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("UPDATE FolderSortStrategy SET strategy = 5, is_asc = 1 WHERE strategy = 1");
                bVar.execSQL("UPDATE FolderSortStrategy SET strategy = 5, is_asc = 0 WHERE strategy = 2");
                bVar.execSQL("UPDATE FolderSortStrategy SET strategy = 4, is_asc = 1 WHERE strategy = 3");
                bVar.execSQL("UPDATE FolderSortStrategy SET strategy = 4, is_asc = 0 WHERE strategy = 4");
                bVar.execSQL("UPDATE FolderSortStrategy SET strategy = 3, is_asc = 1 WHERE strategy = 5");
                bVar.execSQL("UPDATE FolderSortStrategy SET strategy = 3, is_asc = 0 WHERE strategy = 6");
                bVar.execSQL("UPDATE FolderSortStrategy SET strategy = 0, is_asc = 1 WHERE strategy = 7");
                bVar.execSQL("UPDATE FolderSortStrategy SET strategy = 0, is_asc = 0 WHERE strategy = 8");
            }
        };
        AnonymousClass16 r34 = new AbstractC1420a(23, 24) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass16 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN is_top INTEGER NOT NULL DEFAULT 0");
            }
        };
        AnonymousClass17 r45 = new AbstractC1420a(24, 25) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass17 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("DELETE FROM RecentDoc");
            }
        };
        AnonymousClass18 r35 = new AbstractC1420a(25, 26) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass18 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE MineDoc ADD COLUMN offline_create INTEGER NOT NULL DEFAULT 0");
            }
        };
        AnonymousClass19 r46 = new AbstractC1420a(26, 27) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass19 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("DELETE FROM RecentDoc");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN create_time TEXT");
                bVar.execSQL("DELETE FROM RecentPull");
            }
        };
        AnonymousClass20 r36 = new AbstractC1420a(27, 28) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass20 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("DELETE FROM RecentDoc");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN my_edit_time TEXT");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN activity_time TEXT");
                bVar.execSQL("ALTER TABLE FolderSortStrategy ADD COLUMN user_id TEXT");
                bVar.execSQL("DELETE FROM RecentPull");
            }
        };
        AnonymousClass21 r47 = new AbstractC1420a(28, 29) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass21 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `PinedDoc`");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `PinedDoc` (`obj_token` TEXT NOT NULL PRIMARY KEY, `user_id` TEXT, `name` TEXT, `type` INTEGER NOT NULL DEFAULT 2, `pin_time` TEXT, `is_pined` INTEGER NOT NULL DEFAULT 0, `edit_uid` TEXT, `edit_time` TEXT, `owner_id` TEXT, `creator_en_name` TEXT, `creator_cn_name` TEXT, `create_time` TEXT, `tenant_id` TEXT, `space_id` TEXT, `share_root` INTEGER NOT NULL DEFAULT 0, `is_stared` INTEGER NOT NULL DEFAULT 0, `thumbnail` TEXT, `url` TEXT, `subtype` TEXT, `extra` TEXT, `is_external` INTEGER NOT NULL DEFAULT 0)");
            }
        };
        AnonymousClass22 r37 = new AbstractC1420a(29, 30) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass22 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("DELETE FROM RecentDoc");
                bVar.execSQL("ALTER TABLE MineDoc ADD COLUMN is_pin INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE MineDoc ADD COLUMN copiable INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN copiable INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE PinedDoc ADD COLUMN copiable INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN copiable INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN copiable INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN copiable INTEGER NOT NULL DEFAULT 0");
            }
        };
        AnonymousClass24 r48 = new AbstractC1420a(30, 31) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass24 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `RecentDoc`");
                bVar.execSQL("DROP TABLE IF EXISTS `MineDoc`");
                bVar.execSQL("DROP TABLE IF EXISTS `PersonalDoc`");
                bVar.execSQL("DROP TABLE IF EXISTS `ShareDoc`");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `PersonalDoc` (`token` TEXT NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `type` TEXT, `owner_id` TEXT, `create_tenant_id` TEXT, `create_time` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `obj_token` TEXT, `url` TEXT, `fake_token` TEXT, `space_id` TEXT, `is_share_root` INTEGER NOT NULL, `is_external` INTEGER NOT NULL, `is_star` INTEGER NOT NULL, `is_pine` INTEGER NOT NULL, `subtype` TEXT, `extra` TEXT, `icon_url` TEXT, `icon_key` TEXT, `icon_nonce` TEXT, `icon_encrypted_type` INTEGER NOT NULL, `thumbnail` TEXT, `copiable` INTEGER NOT NULL, PRIMARY KEY(`token`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `RecentDoc` (`obj_token` TEXT NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `type` TEXT, `owner_id` TEXT, `create_tenant_id` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `url` TEXT, `fake_token` TEXT, `is_external` INTEGER NOT NULL, `is_star` INTEGER NOT NULL, `is_pine` INTEGER NOT NULL, `open_time` TEXT, `subtype` TEXT, `extra` TEXT, `icon_url` TEXT, `icon_key` TEXT, `icon_nonce` TEXT, `icon_encrypted_type` INTEGER NOT NULL, `thumbnail` TEXT, `create_time` TEXT, `my_edit_time` TEXT, `activity_time` TEXT, `copiable` INTEGER NOT NULL, PRIMARY KEY(`obj_token`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `ShareDoc` (`token` TEXT NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `type` TEXT, `owner_id` TEXT, `tenant_id` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `obj_token` TEXT, `url` TEXT, `fake_token` TEXT, `space_id` TEXT, `is_share_root` INTEGER NOT NULL, `is_external` INTEGER NOT NULL, `is_star` INTEGER NOT NULL, `is_pine` INTEGER NOT NULL, `share_time` TEXT, `subtype` TEXT, `extra` TEXT, `icon_url` TEXT, `icon_key` TEXT, `icon_nonce` TEXT, `icon_encrypted_type` INTEGER NOT NULL, `thumbnail` TEXT, `copiable` INTEGER NOT NULL, PRIMARY KEY(`token`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `MineDoc` (`obj_token` TEXT NOT NULL, `user_id` TEXT, `owner_id` TEXT, `filepath` TEXT, `name` TEXT, `type` INTEGER NOT NULL, `create_tenant_id` TEXT, `create_time` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `url` TEXT, `thumbnail` TEXT, `fake_token` TEXT, `is_stared` INTEGER NOT NULL, `is_pin` INTEGER NOT NULL, `subtype` TEXT, `parent` TEXT, `extra` TEXT, `icon` TEXT, `icon_key` TEXT, `icon_nonce` TEXT, `icon_encrypted_type` INTEGER NOT NULL, `copiable` INTEGER NOT NULL, PRIMARY KEY(`obj_token`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `ManualOfflineDoc` (`obj_token` TEXT NOT NULL, `userid` TEXT NOT NULL, `name` TEXT, `size` TEXT, `type` INTEGER NOT NULL DEFAULT 2, `subType` TEXT, `icon_url` TEXT, `icon_key` TEXT, `icon_nonce` TEXT, `icon_encrypted_type` INTEGER NOT NULL DEFAULT 0, `is_external` INTEGER NOT NULL DEFAULT 0, `url` TEXT, `add_time` TEXT, `edit_time` TEXT, `copiable` INTEGER NOT NULL DEFAULT 0, `is_info_complete` INTEGER NOT NULL DEFAULT 0, `owner_id` TEXT, `create_tenant_id` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `open_time` TEXT, `create_time` TEXT, `fake_token` TEXT, `is_star` INTEGER NOT NULL DEFAULT 0, `is_top` INTEGER NOT NULL DEFAULT 0, `extra` TEXT, `thumbnail` TEXT, `is_backend_save` INTEGER NOT NULL DEFAULT 0, `is_need_wifi_download` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`obj_token`,`userid`))");
            }
        };
        AnonymousClass25 r38 = new AbstractC1420a(31, 32) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass25 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN share_version INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN permission INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN share_version INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN permission INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN share_version INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN permission INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE PinedDoc ADD COLUMN share_version INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE PinedDoc ADD COLUMN permission INTEGER NOT NULL DEFAULT 0");
            }
        };
        AnonymousClass26 r49 = new AbstractC1420a(32, 33) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass26 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `RecentWiki`");
                bVar.execSQL("DROP TABLE IF EXISTS `WikiSpace`");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `RecentWiki` (`wiki_id` TEXT NOT NULL PRIMARY KEY, `userid` TEXT, `wiki_token` TEXT, `space_id` TEXT, `open_time` TEXT,`open_count` TEXT,`title` TEXT,`owner_id` TEXT,`creator_cn_name` TEXT,`creator_en_name` TEXT,`edit_uid` TEXT,`edit_time` TEXT,`url` TEXT,`obj_type` INTEGER NOT NULL DEFAULT 0, `obj_token` TEXT)");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `WikiSpace` (`space_id` TEXT NOT NULL PRIMARY KEY, `user_id` TEXT, `space_name` TEXT, `space_icon` TEXT, `attr` INTEGER NOT NULL DEFAULT 0, `description` TEXT,`is_star` INTEGER NOT NULL DEFAULT 0, `browse_time` TEXT,`wiki_token` TEXT,`obj_type` INTEGER NOT NULL DEFAULT 0, `obj_token` TEXT)");
            }
        };
        AnonymousClass27 r39 = new AbstractC1420a(33, 34) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass27 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE WikiSpace ADD COLUMN origin TEXT");
                bVar.execSQL("ALTER TABLE WikiSpace ADD COLUMN thumbnail TEXT");
                bVar.execSQL("ALTER TABLE WikiSpace ADD COLUMN cover_key TEXT");
                bVar.execSQL("ALTER TABLE WikiSpace ADD COLUMN is_graph_dark INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE WikiSpace ADD COLUMN color_value TEXT");
            }
        };
        AnonymousClass28 r410 = new AbstractC1420a(34, 35) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass28 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN is_visited INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN is_hidden INTEGER NOT NULL DEFAULT 0");
            }
        };
        AnonymousClass29 r310 = new AbstractC1420a(35, 36) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass29 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE ManualOfflineDoc ADD COLUMN thumbnail_url TEXT");
                bVar.execSQL("ALTER TABLE ManualOfflineDoc ADD COLUMN thumbnail_secret TEXT");
                bVar.execSQL("ALTER TABLE ManualOfflineDoc ADD COLUMN thumbnail_nonce TEXT");
                bVar.execSQL("ALTER TABLE ManualOfflineDoc ADD COLUMN thumbnail_type INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE MineDoc ADD COLUMN thumbnail_url TEXT");
                bVar.execSQL("ALTER TABLE MineDoc ADD COLUMN thumbnail_secret TEXT");
                bVar.execSQL("ALTER TABLE MineDoc ADD COLUMN thumbnail_nonce TEXT");
                bVar.execSQL("ALTER TABLE MineDoc ADD COLUMN thumbnail_type INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN thumbnail_url TEXT");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN thumbnail_secret TEXT");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN thumbnail_nonce TEXT");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN thumbnail_type INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE PinedDoc ADD COLUMN thumbnail_url TEXT");
                bVar.execSQL("ALTER TABLE PinedDoc ADD COLUMN thumbnail_secret TEXT");
                bVar.execSQL("ALTER TABLE PinedDoc ADD COLUMN thumbnail_nonce TEXT");
                bVar.execSQL("ALTER TABLE PinedDoc ADD COLUMN thumbnail_type INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN thumbnail_url TEXT");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN thumbnail_secret TEXT");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN thumbnail_nonce TEXT");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN thumbnail_type INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN thumbnail_url TEXT");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN thumbnail_secret TEXT");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN thumbnail_nonce TEXT");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN thumbnail_type INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN thumbnail_url TEXT");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN thumbnail_secret TEXT");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN thumbnail_nonce TEXT");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN thumbnail_type INTEGER NOT NULL DEFAULT 0");
            }
        };
        AnonymousClass30 r411 = new AbstractC1420a(36, 37) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass30 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                try {
                    bVar.execSQL("CREATE TABLE IF NOT EXISTS `ManualOfflineDocNew` (`obj_token` TEXT NOT NULL, `userid` TEXT, `name` TEXT, `size` TEXT, `type` INTEGER NOT NULL DEFAULT 2, `subType` TEXT, `icon_url` TEXT, `icon_key` TEXT, `icon_nonce` TEXT, `icon_encrypted_type` INTEGER NOT NULL DEFAULT 0, `is_external` INTEGER NOT NULL DEFAULT 0, `url` TEXT, `add_time` TEXT, `edit_time` TEXT, `copiable` INTEGER NOT NULL DEFAULT 0, `is_info_complete` INTEGER NOT NULL DEFAULT 0, `owner_id` TEXT, `create_tenant_id` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `open_time` TEXT, `create_time` TEXT, `fake_token` TEXT, `is_star` INTEGER NOT NULL DEFAULT 0, `is_top` INTEGER NOT NULL DEFAULT 0, `extra` TEXT, `thumbnail` TEXT, `thumbnail_url` TEXT, `thumbnail_secret` TEXT, `thumbnail_nonce` TEXT, `thumbnail_type` INTEGER NOT NULL DEFAULT 0, `is_backend_save` INTEGER NOT NULL DEFAULT 0, `is_need_wifi_download` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`obj_token`))");
                    bVar.execSQL("insert into ManualOfflineDocNew select * from ManualOfflineDoc");
                    bVar.execSQL("drop table ManualOfflineDoc");
                    bVar.execSQL("alter table ManualOfflineDocNew rename to ManualOfflineDoc");
                } catch (Exception e) {
                    C13606d.m55245a("DatabaseManager", e);
                    bVar.execSQL("drop table ManualOfflineDoc");
                    bVar.execSQL("CREATE TABLE IF NOT EXISTS `ManualOfflineDoc` (`obj_token` TEXT NOT NULL, `userid` TEXT, `name` TEXT, `size` TEXT, `type` INTEGER NOT NULL DEFAULT 2, `subType` TEXT, `icon_url` TEXT, `icon_key` TEXT, `icon_nonce` TEXT, `icon_encrypted_type` INTEGER NOT NULL DEFAULT 0, `is_external` INTEGER NOT NULL DEFAULT 0, `url` TEXT, `add_time` TEXT, `edit_time` TEXT, `copiable` INTEGER NOT NULL DEFAULT 0, `is_info_complete` INTEGER NOT NULL DEFAULT 0, `owner_id` TEXT, `create_tenant_id` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `open_time` TEXT, `create_time` TEXT, `fake_token` TEXT, `is_star` INTEGER NOT NULL DEFAULT 0, `is_top` INTEGER NOT NULL DEFAULT 0, `extra` TEXT, `thumbnail` TEXT, `thumbnail_url` TEXT, `thumbnail_secret` TEXT, `thumbnail_nonce` TEXT, `thumbnail_type` INTEGER NOT NULL DEFAULT 0, `is_backend_save` INTEGER NOT NULL DEFAULT 0, `is_need_wifi_download` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`obj_token`))");
                }
            }
        };
        AnonymousClass31 r311 = new AbstractC1420a(37, 38) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass31 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE ManualOfflineDoc ADD COLUMN document_icon_key TEXT");
                bVar.execSQL("ALTER TABLE ManualOfflineDoc ADD COLUMN document_icon_type INTEGER NOT NULL DEFAULT -1");
                bVar.execSQL("ALTER TABLE ManualOfflineDoc ADD COLUMN document_icon_fsunit TEXT");
                bVar.execSQL("ALTER TABLE MineDoc ADD COLUMN document_icon_key TEXT");
                bVar.execSQL("ALTER TABLE MineDoc ADD COLUMN document_icon_type INTEGER NOT NULL DEFAULT -1");
                bVar.execSQL("ALTER TABLE MineDoc ADD COLUMN document_icon_fsunit TEXT");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN document_icon_key TEXT");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN document_icon_type INTEGER NOT NULL DEFAULT -1");
                bVar.execSQL("ALTER TABLE PersonalDoc ADD COLUMN document_icon_fsunit TEXT");
                bVar.execSQL("ALTER TABLE PinedDoc ADD COLUMN document_icon_key TEXT");
                bVar.execSQL("ALTER TABLE PinedDoc ADD COLUMN document_icon_type INTEGER NOT NULL DEFAULT -1");
                bVar.execSQL("ALTER TABLE PinedDoc ADD COLUMN document_icon_fsunit TEXT");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN document_icon_key TEXT");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN document_icon_type INTEGER NOT NULL DEFAULT -1");
                bVar.execSQL("ALTER TABLE RecentDoc ADD COLUMN document_icon_fsunit TEXT");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN document_icon_key TEXT");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN document_icon_type INTEGER NOT NULL DEFAULT -1");
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN document_icon_fsunit TEXT");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN document_icon_key TEXT");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN document_icon_type INTEGER NOT NULL DEFAULT -1");
                bVar.execSQL("ALTER TABLE StarDoc ADD COLUMN document_icon_fsunit TEXT");
            }
        };
        AnonymousClass32 r412 = new AbstractC1420a(38, 39) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass32 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE ShareDoc ADD COLUMN create_time TEXT");
            }
        };
        AnonymousClass33 r312 = new AbstractC1420a(39, 40) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass33 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE MineDoc ADD COLUMN is_external INTEGER NOT NULL DEFAULT 0");
            }
        };
        DBController.m55314a().mo50588a("bear.db", new DBController.C13632a(context).mo50597a("bear.db").mo50596a(BearDatabase.class).mo50595a(r1).mo50598a(r2).mo50598a(new AbstractC1420a(2, 3) {
            /* class com.bytedance.ee.bear.list.cache.C8153a.AnonymousClass35 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `PersonalDoc`");
                bVar.execSQL("DROP TABLE IF EXISTS `RecentDoc`");
                bVar.execSQL("DROP TABLE IF EXISTS `ShareDoc`");
                bVar.execSQL("DROP TABLE IF EXISTS `TrashDoc`");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `PersonalDoc` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `token` TEXT, `type` TEXT, `create_uid` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `obj_token` TEXT, `url` TEXT)");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `RecentDoc` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `token` TEXT, `type` TEXT, `create_uid` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `obj_token` TEXT, `url` TEXT)");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `ShareDoc` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `token` TEXT, `type` TEXT, `create_uid` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `obj_token` TEXT, `url` TEXT)");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `TrashDoc` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userid` TEXT, `filepath` TEXT, `name` TEXT, `token` TEXT, `type` TEXT, `create_uid` TEXT, `creator_cn_name` TEXT, `creator_en_name` TEXT, `edit_uid` TEXT, `edit_time` TEXT, `expire_time` TEXT, `obj_token` TEXT, `url` TEXT)");
            }
        }).mo50598a(r5).mo50598a(r8).mo50598a(r7).mo50598a(r9).mo50598a(r10).mo50598a(r11).mo50598a(r12).mo50598a(r13).mo50598a(r14).mo50598a(r15).mo50598a(r4).mo50598a(r6).mo50598a(r3).mo50598a(r42).mo50598a(r62).mo50598a(r32).mo50598a(r43).mo50598a(r63).mo50598a(r33).mo50598a(r44).mo50598a(r34).mo50598a(r45).mo50598a(r35).mo50598a(r46).mo50598a(r36).mo50598a(r47).mo50598a(r37).mo50598a(r48).mo50598a(r38).mo50598a(r49).mo50598a(r39).mo50598a(r410).mo50598a(r310).mo50598a(r411).mo50598a(r311).mo50598a(r412).mo50598a(r312).mo50598a(new C8163a()).mo50598a(new C8164b()).mo50598a(new C8165c()).mo50598a(new C8166d()).mo50598a(new C8167e()).mo50598a(new C8168f()).mo50598a(new C8169g()).mo50598a(new C8170h()).mo50598a(new C8171i()).mo50598a(new C8172j()).mo50598a(new C8173k()).mo50598a(new C8174l()));
    }

    /* renamed from: c */
    public void mo31609c(int i) {
        try {
            mo31576a().mo31544p().mo31953c(i);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: f */
    public void mo31630f(List<C8202k> list) {
        try {
            mo31576a().mo7539a(new Runnable(list) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$o8eG4rlxWDHUK33cdjsxcPC3pH8 */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C8153a.this.m32860l((C8153a) this.f$1);
                }
            });
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: c */
    public void mo31610c(String str) {
        try {
            int d = mo31576a().mo31544p().mo31963d(str);
            C13479a.m54772d("DatabaseManager", "delete: ret=" + d);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: d */
    public void mo31618d(int i) {
        try {
            int a = mo31576a().mo16369m().mo31910a(i);
            C13479a.m54772d("DatabaseManager", "deleteAllSortStrategy()...: ret=" + a);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: e */
    public void mo31626e(List<C8202k> list) {
        try {
            long[] a = mo31576a().mo31542n().mo32170a(list);
            C13479a.m54772d("DatabaseManager", "insertRecentWiki: ret=" + Arrays.toString(a));
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: d */
    public void mo31619d(String str) {
        try {
            int e = mo31576a().mo31544p().mo31968e(3, str);
            C13479a.m54772d("DatabaseManager", "delete: ret=" + e);
        } catch (Exception e2) {
            C13606d.m55244a(e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ int m32850c(int i, List list) {
        return mo31576a().mo31544p().mo31943b(i, list);
    }

    /* renamed from: c */
    public long mo31607c(C8175b bVar, C8201j jVar) {
        try {
            return (long) ((Integer) mo31576a().mo7535a(new Callable(bVar, jVar) {
                /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$kxnzAO_E0AvxbnsQe92_q0kZgkU */
                public final /* synthetic */ C8175b f$1;
                public final /* synthetic */ C8201j f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C8153a.this.m32852d(this.f$1, this.f$2);
                }
            })).intValue();
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: d */
    public int mo31615d(String str, boolean z) {
        try {
            return mo31576a().mo31544p().mo31965d(str, z);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m32851c(List list, List list2) {
        mo31631g();
        long[] i = m32857i(list);
        long[] a = mo31576a().mo31544p().mo31938a(list2);
        C13479a.m54772d("DatabaseManager", "insertShareDoc: metaRet=" + Arrays.toString(i) + " typeRet=" + Arrays.toString(a));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Integer m32852d(C8175b bVar, C8201j jVar) throws Exception {
        int i;
        long a = mo31576a().mo31544p().mo31922a(bVar);
        long a2 = mo31576a().mo31544p().mo31923a(jVar);
        if (a <= 0 || a2 <= 0) {
            i = -1;
        } else {
            i = 1;
        }
        return Integer.valueOf(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m32854e(C8175b bVar, C8201j jVar) {
        long a = mo31573a(bVar);
        long[] a2 = mo31576a().mo31544p().mo31940a(jVar);
        C13479a.m54772d("DatabaseManager", "insertRecentDocIgnoreTypeExist: metaRet=" + a + " \n typeRet=" + Arrays.toString(a2));
    }

    /* renamed from: a */
    public int mo31570a(int i, List<String> list) {
        int i2 = 0;
        try {
            i2 = mo31576a().mo31544p().mo31916a(i, list);
            C13479a.m54772d("DatabaseManager", "delete: ret=" + i2);
            return i2;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return i2;
        }
    }

    /* renamed from: f */
    public int mo31627f(String str, boolean z) {
        try {
            int a = mo31576a().mo31543o().mo32215a(str, z);
            C13479a.m54764b("DatabaseManager", "updateWikiSpaceStar()...ret = " + a);
            return a;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: g */
    public int mo31632g(String str, boolean z) {
        try {
            int b = mo31576a().mo31543o().mo32218b(str, z);
            C13479a.m54764b("DatabaseManager", "updateWikiSpaceStar()...ret = " + b);
            return b;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m32847b(C8175b bVar, List list) {
        long a = mo31573a(bVar);
        long[] a2 = mo31576a().mo31544p().mo31938a(list);
        C13479a.m54772d("DatabaseManager", "insertRecentDocIgnoreTypeExist: metaRet=" + a + " \n typeRet=" + Arrays.toString(a2));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m32853d(List list, List list2) {
        long[] i = m32857i(list);
        long[] a = mo31576a().mo31544p().mo31938a(list2);
        C13479a.m54772d("DatabaseManager", "insertRecentDocIgnoreTypeExist: metaRet=" + Arrays.toString(i) + " \n typeRet=" + Arrays.toString(a));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m32855f(C8175b bVar, C8201j jVar) {
        long[] a = mo31576a().mo31544p().mo31939a(bVar);
        long[] a2 = mo31576a().mo31544p().mo31940a(jVar);
        C13479a.m54772d("DatabaseManager", "insertRecentDocIgnoreTypeExist: metaRet=" + Arrays.toString(a) + " \n typeRet=" + Arrays.toString(a2));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m32856f(String str, String str2) throws Exception {
        if (mo31576a().mo31544p().mo31971f(str) != 2 && mo31576a().mo31544p().mo31964d(str, 2) <= 0) {
            C8175b bVar = new C8175b();
            bVar.mo31679a(str);
            bVar.mo31682b(2);
            bVar.mo31710i(String.valueOf(System.currentTimeMillis() / 1000));
            mo31576a().mo31544p().mo31922a(bVar);
        }
    }

    /* renamed from: e */
    public void mo31624e(String str, String str2) {
        try {
            int a = mo31576a().mo31543o().mo32214a(str, str2);
            C13479a.m54764b("DatabaseManager", "updateWikiSpaceTitle()...ret = " + a);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: b */
    public int mo31594b(int i, String str) {
        int i2 = -1;
        try {
            i2 = mo31576a().mo31544p().mo31942b(i, str);
            C13479a.m54764b("DatabaseManager", "deleteListDocRecordByObjToken()...ret = " + i2);
            return i2;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return i2;
        }
    }

    /* renamed from: e */
    public void mo31625e(String str, boolean z) {
        try {
            mo31576a().mo31544p().mo31970e(str, z);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: b */
    public int mo31595b(int i, List<String> list) {
        int a = C13636b.m55345a(list, new AbstractC13648i(i) {
            /* class com.bytedance.ee.bear.list.cache.$$Lambda$a$ctWDXR5v0i1Xl1EU8e5y6yN2K0c */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.util.db.AbstractC13648i
            public final int doCommand(List list) {
                return C8153a.this.m32850c(this.f$1, list);
            }
        }, mo31576a());
        C13479a.m54764b("DatabaseManager", "deleteRecentDocNotInObjTokenList: ret=" + a);
        return a;
    }

    /* renamed from: c */
    public void mo31611c(String str, String str2) {
        try {
            int c = mo31576a().mo31544p().mo31959c(str, str2);
            C13479a.m54764b("DatabaseManager", "updateShortcutTitle: ret=" + c);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32838a(int i, List list, List list2) {
        mo31576a().mo31544p().mo31953c(i);
        long[] i2 = m32857i(list);
        long[] a = mo31576a().mo31544p().mo31938a(list2);
        C13479a.m54772d("DatabaseManager", "clearAndSaveListDoc: metaRet=" + Arrays.toString(i2) + " \n typeRet=" + Arrays.toString(a));
    }

    /* renamed from: c */
    public int mo31605c(String str, String str2, String str3) {
        int i = 0;
        try {
            i = mo31576a().mo31544p().mo31960c(str, str2, str3);
            C13479a.m54764b("DatabaseManager", "updateOfflineOperateDocTitleAndEditTimeByFakeToken()...ret = " + i);
            return i;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return i;
        }
    }

    /* renamed from: d */
    public int mo31614d(String str, String str2, String str3) {
        int i = 0;
        try {
            i = mo31576a().mo31542n().mo32168a(str, str2, str3);
            C13479a.m54764b("DatabaseManager", "updateRecentWikiTitleAndEditTimeByObjToken()...ret = " + i);
            return i;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m32848b(String str, List list, List list2) {
        int c = mo31576a().mo31544p().mo31956c(3, str, "fake_");
        long[] i = m32857i(list);
        long[] a = mo31576a().mo31544p().mo31938a(list2);
        C13479a.m54772d("DatabaseManager", "delete: ret=" + c + ", save count = " + Arrays.toString(i) + " typeCount=" + Arrays.toString(a));
    }

    /* renamed from: a */
    public int mo31571a(String str, String str2, int i) {
        int i2 = 0;
        try {
            i2 = mo31576a().mo31544p().mo31918a(str, str2, i);
            C13479a.m54772d("DatabaseManager", "updateRecentDoc: ret=" + i2);
            return i2;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return i2;
        }
    }

    /* renamed from: a */
    public int mo31572a(String str, String str2, String str3) {
        try {
            mo31576a().mo31544p().mo31946b(str, str2, str3);
            C13479a.m54764b("DatabaseManager", "updateDocTitleAndEditTime()...ret = " + 0);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
        return 0;
    }

    /* renamed from: b */
    public int mo31596b(String str, String str2, String str3) {
        int i = -1;
        try {
            i = mo31576a().mo31544p().mo31919a(str, str2, str3);
            C13479a.m54764b("DatabaseManager", "updateObjTokenAndToken: ret=" + i);
            return i;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32839a(int i, List list, List list2, FolderSortStrategy folderSortStrategy, List list3) {
        mo31576a().mo31544p().mo31953c(i);
        long[] i2 = m32857i(list);
        long[] a = mo31576a().mo31544p().mo31938a(list2);
        C13479a.m54772d("DatabaseManager", "clearAndSaveListDoc: metaRet=" + Arrays.toString(i2) + " \n typeRet=" + Arrays.toString(a));
        if (folderSortStrategy != null) {
            int b = mo31576a().mo31544p().mo31941b(i, folderSortStrategy.mo31554d(), folderSortStrategy.mo31560f(), folderSortStrategy.mo31549b(), folderSortStrategy.mo31558e(), folderSortStrategy.mo31545a());
            long[] b2 = mo31576a().mo31544p().mo31952b(list3);
            C13479a.m54772d("DatabaseManager", "clearAndSaveListDoc: insertFilterCacheRet=" + Arrays.toString(b2) + " \n deleteFilterCacheRet = " + b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m32846b(int i, List list, List list2, FolderSortStrategy folderSortStrategy, List list3) {
        int c = mo31576a().mo31544p().mo31955c(i, "fake_");
        long[] i2 = m32857i(list);
        long[] a = mo31576a().mo31544p().mo31938a(list2);
        C13479a.m54772d("DatabaseManager", "clearAndSaveListDoc: metaRet=" + Arrays.toString(i2) + " \n typeRet=" + Arrays.toString(a) + " \n listTypeRet = " + c);
        if (folderSortStrategy != null) {
            int b = mo31576a().mo31544p().mo31941b(i, folderSortStrategy.mo31554d(), folderSortStrategy.mo31560f(), folderSortStrategy.mo31549b(), folderSortStrategy.mo31558e(), folderSortStrategy.mo31545a());
            long[] b2 = mo31576a().mo31544p().mo31952b(list3);
            C13479a.m54772d("DatabaseManager", "clearAndSaveListDoc: insertFilterCacheRet=" + Arrays.toString(b2) + " \n deleteFilterCacheRet = " + b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32843a(List list, List list2, FolderSortStrategy folderSortStrategy, int i, List list3) {
        mo31629f();
        long[] i2 = m32857i(list);
        long[] a = mo31576a().mo31544p().mo31938a(list2);
        C13479a.m54772d("DatabaseManager", "insertShareDoc: metaRet=" + Arrays.toString(i2) + " typeRet=" + Arrays.toString(a));
        if (folderSortStrategy != null) {
            int b = mo31576a().mo31544p().mo31941b(i, folderSortStrategy.mo31554d(), folderSortStrategy.mo31560f(), folderSortStrategy.mo31549b(), folderSortStrategy.mo31558e(), folderSortStrategy.mo31545a());
            long[] b2 = mo31576a().mo31544p().mo31952b(list3);
            C13479a.m54772d("DatabaseManager", "clearAndSaveListDoc: insertFilterCacheRet=" + Arrays.toString(b2) + ", deleteFilterCacheRet = " + b);
        }
    }
}
