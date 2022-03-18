package com.bytedance.ee.bear.document.offline.offlinestorage;

import android.content.Context;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.C1174u;
import androidx.lifecycle.LiveData;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.RoomDatabase;
import androidx.room.p047a.AbstractC1420a;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.offline.OfflineDocsPriority;
import com.bytedance.ee.bear.document.offline.file.p319a.C5937c;
import com.bytedance.ee.bear.document.offline.sync.C6002l;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6026d;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.db.AbstractC13648i;
import com.bytedance.ee.util.db.C13636b;
import com.bytedance.ee.util.db.DBController;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p716r.C13721c;
import com.larksuite.framework.utils.LarkUriUtil;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.cipher.CipherException;
import com.ss.android.lark.diskmanage.cipher.DecryptException;
import com.ss.android.lark.utils.C57788ai;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.offlinestorage.d */
public class C5955d {

    /* renamed from: d */
    private static volatile C5955d f16679d;

    /* renamed from: f */
    private static AbstractC1420a f16680f = new AbstractC1420a(1, 2) {
        /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.C59561 */

        @Override // androidx.room.p047a.AbstractC1420a
        /* renamed from: a */
        public void mo7566a(AbstractC1082b bVar) {
            bVar.execSQL("ALTER TABLE ResourceData ADD COLUMN url TEXT");
        }
    };

    /* renamed from: g */
    private static AbstractC1420a f16681g = new AbstractC1420a(2, 3) {
        /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.AnonymousClass12 */

        @Override // androidx.room.p047a.AbstractC1420a
        /* renamed from: a */
        public void mo7566a(AbstractC1082b bVar) {
            C13479a.m54772d("OfflineDataManager", "migrate_2_3()...");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `file_model` (`name` TEXT NOT NULL, `token` TEXT NOT NULL, `doc_url` TEXT NOT NULL, `path` TEXT NOT NULL, `local_url` TEXT, `net_url` TEXT,  PRIMARY KEY(`name`, `token`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `at_object` (`id` TEXT NOT NULL, `cn_name` TEXT, `en_name` TEXT, `name` TEXT, `title` TEXT, `type` INTEGER NOT NULL, `token` TEXT, `content` TEXT, `edit_time` TEXT, `owner` TEXT, `desc` TEXT, `count` TEXT, `url` TEXT, `department` TEXT, `avatar_url` TEXT, PRIMARY KEY(`id`))");
        }
    };

    /* renamed from: h */
    private static AbstractC1420a f16682h = new AbstractC1420a(3, 4) {
        /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.AnonymousClass16 */

        @Override // androidx.room.p047a.AbstractC1420a
        /* renamed from: a */
        public void mo7566a(AbstractC1082b bVar) {
            bVar.execSQL("ALTER TABLE `at_object` ADD COLUMN isExternal INTEGER NOT NULL DEFAULT 0");
        }
    };

    /* renamed from: i */
    private static AbstractC1420a f16683i = new AbstractC1420a(4, 5) {
        /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.AnonymousClass17 */

        @Override // androidx.room.p047a.AbstractC1420a
        /* renamed from: a */
        public void mo7566a(AbstractC1082b bVar) {
        }
    };

    /* renamed from: j */
    private static AbstractC1420a f16684j = new AbstractC1420a(5, 6) {
        /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.AnonymousClass18 */

        @Override // androidx.room.p047a.AbstractC1420a
        /* renamed from: a */
        public void mo7566a(AbstractC1082b bVar) {
            bVar.execSQL("ALTER TABLE ResourceData ADD COLUMN resvalue_filepath TEXT");
        }
    };

    /* renamed from: m */
    private static AbstractC1420a f16685m = new AbstractC1420a(8, 9) {
        /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.AnonymousClass21 */

        @Override // androidx.room.p047a.AbstractC1420a
        /* renamed from: a */
        public void mo7566a(AbstractC1082b bVar) {
            bVar.execSQL("ALTER TABLE ResourceData ADD COLUMN subblock_preload_status INTEGER NOT NULL DEFAULT 0");
        }
    };

    /* renamed from: n */
    private static AbstractC1420a f16686n = new AbstractC1420a(9, 10) {
        /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.AnonymousClass22 */

        @Override // androidx.room.p047a.AbstractC1420a
        /* renamed from: a */
        public void mo7566a(AbstractC1082b bVar) {
            C13479a.m54772d("OfflineDataManager", "exe migration from 9 -> 10");
            bVar.execSQL("ALTER TABLE file_model ADD COLUMN file_modified_time INTEGER NOT NULL DEFAULT 0");
        }
    };

    /* renamed from: o */
    private static AbstractC1420a f16687o = new AbstractC1420a(10, 11) {
        /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.C59582 */

        @Override // androidx.room.p047a.AbstractC1420a
        /* renamed from: a */
        public void mo7566a(AbstractC1082b bVar) {
            C13479a.m54772d("OfflineDataManager", "exe migration from 10 -> 11");
        }
    };

    /* renamed from: a */
    public C5966e f16688a = new C5966e(52428800);

    /* renamed from: b */
    public C5980i f16689b;

    /* renamed from: c */
    public Context f16690c;

    /* renamed from: e */
    private DBController.AbstractC13633b f16691e;

    /* renamed from: k */
    private AbstractC1420a f16692k = new AbstractC1420a(6, 7) {
        /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.AnonymousClass19 */

        @Override // androidx.room.p047a.AbstractC1420a
        /* renamed from: a */
        public void mo7566a(AbstractC1082b bVar) {
            C5955d.this.mo24080a(bVar);
        }
    };

    /* renamed from: l */
    private AbstractC1420a f16693l = new AbstractC1420a(7, 8) {
        /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.AnonymousClass20 */

        @Override // androidx.room.p047a.AbstractC1420a
        /* renamed from: a */
        public void mo7566a(AbstractC1082b bVar) {
            bVar.execSQL("ALTER TABLE file_model ADD COLUMN upload_key TEXT");
        }
    };

    /* renamed from: p */
    private AbstractC1420a f16694p = new AbstractC1420a(11, 12) {
        /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.C59593 */

        @Override // androidx.room.p047a.AbstractC1420a
        /* renamed from: a */
        public void mo7566a(AbstractC1082b bVar) {
            bVar.execSQL("ALTER TABLE file_model ADD COLUMN new_upload_key TEXT");
        }
    };

    /* renamed from: q */
    private AbstractC1420a f16695q = new AbstractC1420a(12, 13) {
        /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.C59604 */

        @Override // androidx.room.p047a.AbstractC1420a
        /* renamed from: a */
        public void mo7566a(AbstractC1082b bVar) {
            bVar.execSQL("ALTER TABLE at_object ADD COLUMN sub_type INTEGER NOT NULL DEFAULT 0");
        }
    };

    /* renamed from: r */
    private AbstractC1420a f16696r = new AbstractC1420a(13, 14) {
        /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.C59615 */

        @Override // androidx.room.p047a.AbstractC1420a
        /* renamed from: a */
        public void mo7566a(AbstractC1082b bVar) {
            bVar.execSQL("ALTER TABLE `file_model` ADD COLUMN uri TEXT NOT NULL DEFAULT ''");
        }
    };

    /* renamed from: a */
    public synchronized OfflineDatabase mo24074a() {
        return (OfflineDatabase) DBController.m55314a().mo50590b("offlineData.db");
    }

    /* renamed from: a */
    public void mo24080a(AbstractC1082b bVar) {
        try {
            List<C5968f> a = C5954c.m24018a(bVar);
            if (a != null && a.size() > 0) {
                C5980i iVar = new C5980i(this.f16690c, new char[]{'$', '5', '2', '*', 'y', 'l', 'q'});
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C5968f fVar : a) {
                    if (fVar != null) {
                        if (!TextUtils.isEmpty(fVar.mo24137d())) {
                            iVar.mo24187b(fVar);
                            arrayList.add(fVar);
                        } else if (!TextUtils.isEmpty(fVar.mo24157q())) {
                            arrayList2.add(fVar);
                        }
                    }
                }
                C5954c.m24019a(bVar, arrayList);
                C5954c.m24020b(bVar, arrayList2);
            }
        } catch (Exception e) {
            C13479a.m54761a("OfflineDataManager", e);
        }
    }

    /* renamed from: a */
    public AbstractC68307f<C5968f> mo24078a(final String str, final String str2) {
        C5968f a = this.f16688a.mo24118a(str, str2);
        if (a != null) {
            return AbstractC68307f.m265083a(a);
        }
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function<String, C5968f>() {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.C59648 */

            /* renamed from: a */
            public C5968f apply(String str) throws Exception {
                int threadPriority = Process.getThreadPriority(Process.myTid());
                Process.setThreadPriority(-1);
                C5968f b = C5955d.this.mo24086b(str, str2);
                Process.setThreadPriority(threadPriority);
                if (b == null) {
                    return new C5968f();
                }
                return b;
            }
        });
    }

    /* renamed from: a */
    public void mo24081a(AccountService.Account account, String str, String str2) {
        if (account == null) {
            C13479a.m54758a("OfflineDataManager", "account is null");
            return;
        }
        String a = m24023a(account);
        C5968f fVar = new C5968f();
        fVar.mo24128a(a);
        fVar.mo24136c(str);
        fVar.mo24138d(str2);
        this.f16688a.mo24119a(a, str, fVar);
        try {
            mo24074a().mo16369m().mo24160a(fVar);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public AbstractC68307f<Long> mo24076a(int i) {
        return AbstractC68307f.m265083a(Integer.valueOf(i)).mo237985a(C11678b.m48479c()).mo238020d(new Function<Integer, Long>() {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.C59659 */

            /* renamed from: a */
            public Long apply(Integer num) throws Exception {
                C13479a.m54764b("OfflineDataManager", "deleteResourceDataByAccessTime start");
                return Long.valueOf(C5955d.this.mo24073a(C5955d.this.mo24074a().mo16369m().mo24172b(true), num.intValue()));
            }
        });
    }

    /* renamed from: a */
    public AbstractC68307f<List<C5968f>> mo24077a(String str) {
        return AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.$$Lambda$d$qnxigg3rfNNPW5miqluyEE5_Kqk */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5955d.this.m24029e(this.f$1, (String) obj);
            }
        });
    }

    /* renamed from: a */
    public AbstractC68307f<Integer> mo24079a(List<String> list) {
        C13479a.m54772d("OfflineDataManager", "OfflineDataManager.deleteResourceDataByDocTokenList");
        return AbstractC68307f.m265083a((Object) list).mo237985a(C11678b.m48479c()).mo238020d(new Function<List<String>, Integer>() {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.AnonymousClass14 */

            /* renamed from: a */
            public Integer apply(List<String> list) throws Exception {
                if (list != null && list.size() > 0) {
                    for (String str : list) {
                        C5955d.this.f16688a.mo24120a(str);
                        C5955d.this.f16689b.mo24189b(str);
                        List<C5937c> c = C5955d.this.mo24093c(str);
                        if (c != null && c.size() > 0) {
                            for (C5937c cVar : c) {
                                if (!TextUtils.isEmpty(cVar.mo23961d())) {
                                    C13675f.m55494a(C5955d.this.f16690c, new File(cVar.mo23961d()));
                                }
                            }
                        }
                    }
                    C5955d.this.mo24095d(list);
                }
                return Integer.valueOf(C13636b.m55345a(list, new AbstractC13648i() {
                    /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.AnonymousClass14.C59571 */

                    @Override // com.bytedance.ee.util.db.AbstractC13648i
                    public int doCommand(List<String> list) {
                        return C5955d.this.mo24074a().mo16369m().mo24159a(list);
                    }
                }, C5955d.this.mo24074a()));
            }
        });
    }

    /* renamed from: b */
    public static C5955d m24025b() {
        if (f16679d == null) {
            m24024a(C13615c.f35773a);
        }
        return f16679d;
    }

    /* renamed from: c */
    public List<String> mo24092c() {
        try {
            return mo24074a().mo16369m().mo24175c();
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList();
        }
    }

    /* renamed from: d */
    public LiveData<List<String>> mo24096d() {
        try {
            return mo24074a().mo16369m().mo24161a();
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C1174u();
        }
    }

    /* renamed from: i */
    public List<String> mo24107i() {
        try {
            return mo24074a().mo24061n().mo23940a();
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList();
        }
    }

    /* renamed from: j */
    public AbstractC68307f<Boolean> mo24108j() {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.$$Lambda$d$cWXuhS5PR0auoc2mmUJ9BIzD6ag */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5955d.this.m24022a((Boolean) obj);
            }
        });
    }

    /* renamed from: f */
    public AbstractC68307f<Boolean> mo24102f() {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function<String, Boolean>() {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.AnonymousClass11 */

            /* renamed from: a */
            public Boolean apply(String str) throws Exception {
                long j;
                C13479a.m54764b("OfflineDataManager", "cleanAll start");
                C6002l.m24300a().mo24267b();
                DBController.m55314a().mo50592b(C5955d.this.f16690c, "offlineData.db");
                List<String> b = C5955d.this.mo24074a().mo16369m().mo24172b(true);
                if (C5955d.this.mo24074a().mo7540b().getWritableDatabase().isWriteAheadLoggingEnabled()) {
                    C5955d.this.mo24074a().mo7540b().getWritableDatabase().disableWriteAheadLogging();
                }
                if (b == null || b.size() == 0) {
                    C13479a.m54764b("OfflineDataManager", "cleanAll no need sync");
                    C5955d.this.mo24074a().mo7543d();
                    C5955d.this.mo24104g();
                    ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31491a();
                    j = 0;
                } else {
                    j = C5955d.this.mo24073a(b, 999);
                }
                C13479a.m54764b("OfflineDataManager", "cleanAll end size:" + j);
                return Boolean.TRUE;
            }
        });
    }

    /* renamed from: g */
    public void mo24104g() {
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238018d(new Consumer() {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.$$Lambda$d$i0mD26b4eoSGLR9A1H41XkIqe18 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5955d.this.m24035l((String) obj);
            }
        });
    }

    /* renamed from: h */
    public void mo24106h() {
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238018d(new Consumer() {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.$$Lambda$d$nxpKJLgNzns1YGn0noDTfbUnNg */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5955d.this.m24034k((String) obj);
            }
        });
    }

    /* renamed from: e */
    public List<OfflineDoc> mo24100e() {
        int i;
        String str = "https://" + C6313i.f17509a;
        List<C5968f> list = null;
        try {
            list = this.f16689b.mo24188b(mo24074a().mo16369m().mo24166a(true));
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (C5968f fVar : list) {
                if (TextUtils.isEmpty(fVar.mo24130b())) {
                    C13479a.m54764b("OfflineDataManager", "loadNeedSyncOfflineDoc use uri to get type, url=" + C13598b.m55197d(fVar.mo24153m()));
                    i = C8275a.m34051b(C6313i.m25327a().mo25399g(str + fVar.mo24153m()).f17446a);
                } else {
                    C13479a.m54764b("OfflineDataManager", "loadNeedSyncOfflineDoc use db saved type=" + fVar.mo24130b());
                    i = C8275a.m34051b(fVar.mo24130b());
                }
                C13479a.m54764b("OfflineDataManager", "loadNeedSyncOfflineDoc: type " + i);
                OfflineDoc offlineDoc = new OfflineDoc(fVar.mo24134c(), fVar.mo24134c(), C6313i.m25327a().mo25382a(C8275a.m34050a(i), fVar.mo24134c(), ""), OfflineDocsPriority.Low_Priority.ordinal(), i);
                if (!arrayList.contains(offlineDoc)) {
                    arrayList.add(offlineDoc);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private String m24028d(C5937c cVar) {
        String d = cVar.mo23961d();
        return TextUtils.isEmpty(d) ? cVar.mo23973j() : d;
    }

    /* renamed from: e */
    private boolean m24031e(C5937c cVar) {
        return TextUtils.isEmpty(cVar.mo23961d());
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m24034k(String str) throws Exception {
        try {
            this.f16688a.evictAll();
        } catch (Exception e) {
            C13479a.m54759a("OfflineDataManager", "deleteMemResource... err happens : ", e);
        }
    }

    /* renamed from: a */
    private String m24023a(AccountService.Account account) {
        return account.f14592i + "_" + account.f14584a + "_doc_cached_html";
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m24035l(String str) throws Exception {
        try {
            this.f16688a.evictAll();
            this.f16689b.mo24186a();
            mo24074a().mo16369m().mo24167b();
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: b */
    public int mo24082b(C5937c cVar) {
        try {
            return mo24074a().mo24061n().mo23944b(cVar);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: f */
    public int mo24101f(String str) {
        try {
            return mo24074a().mo24061n().mo23949d(str);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: g */
    public int mo24103g(String str) {
        try {
            return mo24074a().mo24061n().mo23950e(str);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: h */
    public List<C5968f> mo24105h(String str) {
        try {
            return mo24074a().mo16369m().mo24164a(str);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m24022a(Boolean bool) throws Exception {
        C13479a.m54764b("OfflineDataManager", "startVacuum");
        if (!mo24074a().mo7540b().getWritableDatabase().inTransaction()) {
            mo24074a().mo7540b().getWritableDatabase().execSQL("VACUUM");
        }
        return bool;
    }

    /* renamed from: c */
    private void m24026c(final Context context) {
        if (this.f16691e == null) {
            this.f16691e = new DBController.AbstractC13633b() {
                /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.C59637 */

                @Override // com.bytedance.ee.util.db.DBController.AbstractC13633b
                /* renamed from: a */
                public void mo24114a(String str) {
                    C5955d.this.f16689b = new C5980i(context, str.toCharArray(), false);
                }
            };
        }
        DBController.m55314a().mo50586a(this.f16691e);
        this.f16689b = new C5980i(context, DBController.m55314a().mo50591b().toCharArray(), false);
    }

    /* renamed from: e */
    private void m24030e(List<String> list) {
        try {
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31505a(list);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: i */
    public static String m24032i(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            String a = C36808a.m145200a(str);
            if (!TextUtils.isEmpty(a)) {
                return a;
            }
            return str;
        } catch (CipherException e) {
            C13479a.m54759a("OfflineDataManager", "replacePersistentFilePath... err happens : " + e.getErrorCode(), e);
            return str;
        }
    }

    /* renamed from: j */
    private String m24033j(String str) {
        String str2;
        String a = C13721c.m55643a(str);
        if (TextUtils.isEmpty(a) || Uri.parse(a).getScheme() == null) {
            str2 = null;
        } else {
            str2 = C6313i.m25327a().mo25400h(Uri.parse(a).getPath());
        }
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    /* renamed from: b */
    public int mo24083b(C5968f fVar) {
        if (fVar == null || fVar.mo24152l() == null) {
            return -1;
        }
        fVar.mo24125a(fVar.mo24152l().mo24334b());
        return mo24089c(fVar);
    }

    /* renamed from: d */
    public int mo24095d(List<String> list) {
        int a = C13636b.m55345a(list, new AbstractC13648i() {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.AnonymousClass15 */

            @Override // com.bytedance.ee.util.db.AbstractC13648i
            public int doCommand(List<String> list) {
                return C5955d.this.mo24074a().mo24061n().mo23945b(list);
            }
        }, mo24074a());
        C13479a.m54764b("OfflineDataManager", "deleteFileModelByTokenList ret = " + a);
        return a;
    }

    /* renamed from: c */
    private void m24027c(C5937c cVar) {
        String str;
        if (cVar != null) {
            Pair<Boolean, String> a = m24021a(m24031e(cVar), m24028d(cVar));
            boolean booleanValue = ((Boolean) a.first).booleanValue();
            String str2 = "";
            if (booleanValue) {
                str = (String) a.second;
            } else {
                str = str2;
            }
            cVar.mo23972i(str);
            if (!booleanValue) {
                str2 = (String) a.second;
            }
            cVar.mo23962d(str2);
        }
    }

    /* renamed from: b */
    public int mo24084b(List<C5968f> list) {
        if (list.size() <= 0) {
            return -1;
        }
        try {
            int b = mo24074a().mo16369m().mo24169b(this.f16689b.mo24185a(list));
            if (b > 0) {
                for (C5968f fVar : list) {
                    this.f16688a.mo24119a(fVar.mo24124a(), fVar.mo24134c(), fVar);
                }
            }
            return b;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: d */
    public C5937c mo24097d(String str) {
        try {
            C5937c b = mo24074a().mo24061n().mo23946b(str);
            m24027c(b);
            return b;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C5937c();
        }
    }

    /* renamed from: e */
    public C5937c mo24099e(String str) {
        try {
            C5937c c = mo24074a().mo24061n().mo23948c(m24033j(str));
            m24027c(c);
            return c;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C5937c();
        }
    }

    private C5955d(Context context) {
        this.f16690c = context;
        DBController.m55314a().mo50588a("offlineData.db", new DBController.C13632a(context).mo50597a("offlineData.db").mo50596a(OfflineDatabase.class).mo50595a(new RoomDatabase.AbstractC1417b() {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.C59626 */

            @Override // androidx.room.RoomDatabase.AbstractC1417b
            /* renamed from: a */
            public void mo7559a(AbstractC1082b bVar) {
                super.mo7559a(bVar);
                C13479a.m54772d("OfflineDataManager", "onCreate: ");
            }

            @Override // androidx.room.RoomDatabase.AbstractC1417b
            /* renamed from: b */
            public void mo7560b(AbstractC1082b bVar) {
                super.mo7560b(bVar);
                C13479a.m54772d("OfflineDataManager", "onOpen: ");
            }
        }).mo50594a(RoomDatabase.JournalMode.TRUNCATE).mo50598a(f16680f, f16681g, f16682h, f16683i, f16684j, this.f16692k, this.f16693l, f16685m, f16686n, f16687o, this.f16694p, this.f16695q, this.f16696r));
        m24026c(context);
    }

    /* renamed from: a */
    public static void m24024a(Context context) {
        if (f16679d == null) {
            synchronized (C5955d.class) {
                if (f16679d == null) {
                    f16679d = new C5955d(context);
                }
            }
        }
    }

    /* renamed from: b */
    public long mo24085b(Context context) {
        try {
            return this.f16689b.mo24181a(context);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: c */
    public int mo24089c(C5968f fVar) {
        try {
            int b = mo24074a().mo16369m().mo24168b(this.f16689b.mo24182a(fVar));
            if (b > 0) {
                this.f16688a.mo24119a(fVar.mo24124a(), fVar.mo24134c(), fVar);
            }
            return b;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: a */
    public int mo24070a(long j) {
        C13479a.m54764b("OfflineDataManager", "cleanUpTimeMills start. ");
        int i = 0;
        try {
            if (mo24074a().mo7540b().getWritableDatabase().isWriteAheadLoggingEnabled()) {
                mo24074a().mo7540b().getWritableDatabase().disableWriteAheadLogging();
            }
            List<C5968f> a = mo24074a().mo16369m().mo24163a(j, 999);
            if (a != null) {
                if (a.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (C5968f fVar : a) {
                        this.f16688a.mo24120a(fVar.mo24155o());
                        arrayList.add(fVar.mo24134c());
                    }
                    mo24095d(arrayList);
                    m24030e(arrayList);
                    mo24074a().mo16369m().mo24174c(arrayList);
                    this.f16689b.mo24191d(a);
                    i = a.size();
                    if (!mo24074a().mo7540b().getWritableDatabase().inTransaction()) {
                        mo24074a().mo7540b().getWritableDatabase().execSQL("VACUUM");
                    }
                    C13479a.m54764b("OfflineDataManager", "cleanUpTimeMills end, cleanSize:" + i);
                }
            }
            return i;
        } catch (Exception e) {
            C13479a.m54759a("OfflineDataManager", "cleanUpTimeMills fail. ", e);
            C13606d.m55244a(e);
            return 0;
        }
    }

    /* renamed from: c */
    public long mo24090c(int i) {
        try {
            if (mo24074a().mo7540b().getWritableDatabase().isWriteAheadLoggingEnabled()) {
                mo24074a().mo7540b().getWritableDatabase().disableWriteAheadLogging();
            }
            List<String> a = mo24074a().mo24061n().mo23941a(i);
            C13479a.m54764b("OfflineDataManager", "deleteFileModel... fetch fileModelPathList ");
            if (a != null && a.size() > 0) {
                C13479a.m54764b("OfflineDataManager", "deleteFileModel... ready to delete cnt = " + a.size());
                for (String str : a) {
                    File file = new File(str);
                    if (!file.isDirectory()) {
                        C13675f.m55494a(this.f16690c, file);
                    }
                    mo24074a().mo24061n().mo23950e(str);
                    C13479a.m54772d("OfflineDataManager", "deleteFileModel... ----> delete file : " + str);
                }
                mo24074a().mo24061n().mo23947c(a);
                C13479a.m54764b("OfflineDataManager", "deleteFileModel... delete finished");
            }
            if (!mo24074a().mo7540b().getWritableDatabase().inTransaction()) {
                mo24074a().mo7540b().getWritableDatabase().execSQL("VACUUM");
            }
            return (long) a.size();
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: a */
    public long mo24071a(C5937c cVar) {
        try {
            return mo24074a().mo24061n().mo23939a(cVar);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: b */
    public AbstractC68307f<Long> mo24087b(int i) {
        return AbstractC68307f.m265083a(Integer.valueOf(i)).mo237985a(C11678b.m48479c()).mo238020d(new Function<Integer, Long>() {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.AnonymousClass10 */

            /* renamed from: a */
            public Long apply(Integer num) throws Exception {
                C13479a.m54764b("OfflineDataManager", "deleteFileModelByLastModified start");
                return Long.valueOf(C5955d.this.mo24090c(num.intValue()));
            }
        });
    }

    /* renamed from: c */
    public List<C5937c> mo24093c(String str) {
        try {
            List<C5937c> a = mo24074a().mo24061n().mo23942a(str);
            if (a != null && !a.isEmpty()) {
                for (C5937c cVar : a) {
                    m24027c(cVar);
                }
            }
            return a;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public long mo24072a(C5968f fVar) {
        try {
            C5968f a = this.f16688a.mo24119a(fVar.mo24124a(), fVar.mo24134c(), fVar);
            a.mo24126a(new C6026d(a.mo24151k()));
            long a2 = mo24074a().mo16369m().mo24160a(this.f16689b.mo24182a(fVar));
            a.mo24131b((int) a2);
            return a2;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: b */
    public AbstractC68307f<Integer> mo24088b(final String str) {
        C13479a.m54772d("OfflineDataManager", "OfflineDataManager.deleteResourceDataByDocToken: token = ");
        return AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238020d(new Function<String, Integer>() {
            /* class com.bytedance.ee.bear.document.offline.offlinestorage.C5955d.AnonymousClass13 */

            /* renamed from: a */
            public Integer apply(String str) throws Exception {
                C5955d.this.f16688a.mo24120a(str);
                C5955d.this.f16689b.mo24189b(str);
                List<C5937c> c = C5955d.this.mo24093c(str);
                if (c != null && c.size() > 0) {
                    C5955d.this.mo24101f(str);
                    for (C5937c cVar : c) {
                        if (!TextUtils.isEmpty(cVar.mo23961d())) {
                            C13675f.m55494a(C5955d.this.f16690c, new File(cVar.mo23961d()));
                        }
                    }
                }
                return Integer.valueOf(C5955d.this.mo24074a().mo16369m().mo24173c(str));
            }
        });
    }

    /* renamed from: c */
    public long[] mo24094c(List<C5937c> list) {
        try {
            return mo24074a().mo24061n().mo23943a(list);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new long[0];
        }
    }

    /* renamed from: a */
    public C5968f mo24075a(AccountService.Account account, String str) {
        return mo24086b(m24023a(account), str);
    }

    /* renamed from: c */
    public C5968f mo24091c(String str, String str2) {
        C5968f a = this.f16688a.mo24118a(str, str2);
        if (a != null) {
            return a;
        }
        return new C5968f();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ List m24029e(String str, String str2) throws Exception {
        return this.f16689b.mo24188b(mo24074a().mo16369m().mo24171b(str));
    }

    /* renamed from: a */
    private Pair<Boolean, String> m24021a(boolean z, String str) {
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(Boolean.valueOf(z), str);
        }
        if (z) {
            try {
                Uri parse = Uri.parse(str);
                if (!LarkUriUtil.m95312h(this.f16690c, parse)) {
                    return new Pair<>(true, str);
                }
                str = C57788ai.m224257a(this.f16690c, parse);
            } catch (DecryptException e) {
                C13479a.m54759a("OfflineDataManager", "replaceTempDecryptFilePath... err happens : ", e);
                return new Pair<>(Boolean.valueOf(z), str);
            }
        }
        File a = C36808a.m145199a(new File(str), false);
        if (TextUtils.isEmpty(a.getAbsolutePath()) || !a.exists()) {
            return new Pair<>(Boolean.valueOf(z), str);
        }
        return new Pair<>(false, a.getAbsolutePath());
    }

    /* renamed from: d */
    public C5968f mo24098d(String str, String str2) {
        try {
            C5968f a = this.f16688a.mo24118a(str, str2);
            if (a != null) {
                if (a.mo24152l() == null) {
                    a.mo24126a(new C6026d(a.mo24151k()));
                }
                return a;
            }
            C5968f b = this.f16689b.mo24187b(mo24074a().mo16369m().mo24170b(str, str2));
            if (b != null) {
                b.mo24126a(new C6026d(b.mo24151k()));
                this.f16688a.mo24119a(b.mo24124a(), b.mo24134c(), b);
            }
            if (b != null) {
                return b;
            }
            return null;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C5968f();
        }
    }

    /* renamed from: b */
    public C5968f mo24086b(String str, String str2) {
        C5968f a = this.f16688a.mo24118a(str, str2);
        if (a != null) {
            return a;
        }
        try {
            C5968f b = this.f16689b.mo24187b(mo24074a().mo16369m().mo24162a(str, str2));
            if (b != null) {
                this.f16688a.mo24119a(str, str2, b);
            }
            return b;
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C5968f();
        }
    }

    /* renamed from: a */
    public long mo24073a(List<String> list, int i) {
        try {
            if (mo24074a().mo7540b().getWritableDatabase().isWriteAheadLoggingEnabled()) {
                mo24074a().mo7540b().getWritableDatabase().disableWriteAheadLogging();
            }
            List<C5952a> a = mo24074a().mo16369m().mo24165a(list, i);
            C13479a.m54764b("OfflineDataManager", "deleteSyncDocument fetch deleteResourceDataList ");
            if (a.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (C5952a aVar : a) {
                    if (aVar != null && !TextUtils.isEmpty(aVar.mo24064b())) {
                        String b = aVar.mo24064b();
                        arrayList.add(b);
                        this.f16688a.mo24120a(b);
                    }
                }
                if (arrayList.size() > 0) {
                    mo24095d(arrayList);
                    m24030e(arrayList);
                }
                C13479a.m54764b("OfflineDataManager", "deleteSyncDocument delete filemodel finished");
                mo24074a().mo16369m().mo24174c(arrayList);
                C13479a.m54764b("OfflineDataManager", "deleteSyncDocument delete ResourceData finished");
                this.f16689b.mo24190c(a);
                C13479a.m54764b("OfflineDataManager", "deleteSyncDocument delete file finished");
            }
            C13479a.m54764b("OfflineDataManager", "deleteSyncDocument all task finished");
            if (!mo24074a().mo7540b().getWritableDatabase().inTransaction()) {
                mo24074a().mo7540b().getWritableDatabase().execSQL("VACUUM");
            }
            return (long) a.size();
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }
}
