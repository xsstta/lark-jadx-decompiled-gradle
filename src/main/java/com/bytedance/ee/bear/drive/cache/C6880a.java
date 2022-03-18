package com.bytedance.ee.bear.drive.cache;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.drive.DriveCache;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.bear.drive.common.C6895h;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.dao.C6965c;
import com.bytedance.ee.bear.drive.dao.p351a.C6956b;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.model.C7088b;
import com.bytedance.ee.bear.drive.preload.C7115c;
import com.bytedance.ee.bear.drive.services.AbstractC7181i;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p700c.C13602d;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.cache.a */
public class C6880a {

    /* renamed from: b */
    private static volatile C6880a f18648b;

    /* renamed from: c */
    private static volatile boolean f18649c;

    /* renamed from: a */
    private Context f18650a;

    /* renamed from: d */
    private an f18651d = ((an) KoinJavaComponent.m268610a(an.class));

    /* renamed from: e */
    private C10917c f18652e;

    /* renamed from: f */
    private PersistenceSharedPreference f18653f;

    /* renamed from: h */
    private void m27114h() {
    }

    /* renamed from: g */
    public void mo27095g() {
    }

    /* renamed from: a */
    public static void m27087a(boolean z) {
        f18649c = z;
    }

    /* renamed from: a */
    public static String m27075a(AbstractC6949c cVar) {
        return cVar == null ? "" : m27074a(cVar.mo27371a());
    }

    /* renamed from: a */
    public static String m27074a(AbstractC6946a aVar) {
        if (aVar == null) {
            return "";
        }
        if (aVar instanceof C7086a) {
            return m27076a(aVar.mo27322a().f18785a);
        }
        if (aVar instanceof C7088b) {
            return m27077a(((C7088b) aVar).mo27322a().f19101m, aVar.mo27322a().f18785a);
        }
        return "";
    }

    /* renamed from: a */
    public static String m27076a(String str) {
        return C13602d.m55222a(str);
    }

    /* renamed from: a */
    public static String m27077a(String str, String str2) {
        return C13602d.m55222a("_drivesdk_" + str + "_" + str2);
    }

    /* renamed from: a */
    public AbstractC68307f<Boolean> mo27083a(long j) {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function(j) {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$NumBpl_FZDdE6heZWfP6Am0PwA */
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6880a.this.m27070a(this.f$1, (String) obj);
            }
        }).mo237988a((Consumer<? super Throwable>) $$Lambda$a$QzAqrOea72q7UHNnlbCWPJFJO4.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m27080a(long j, AbstractC7181i iVar) throws Exception {
        iVar.removeAll(Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27082a(Integer num) throws Exception {
        if (num.intValue() > 0) {
            this.f18653f.mo34037a("sync_status_doc_finished", true);
        }
        C13479a.m54764b("DRIVE_CACHE_FLOW", "sync to status_doc count=" + num);
    }

    /* renamed from: a */
    public AbstractC68307f<Boolean> mo27081a(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        return mo27079a(0, i, str, str2, str3, str4, str5, str6, str7, str8, str9, "", "", str10, false, z);
    }

    /* renamed from: a */
    public AbstractC68307f<Boolean> mo27082a(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2) {
        return mo27079a(0, i, str, str2, str3, str4, str5, str6, str7, str8, str9, "", "", str10, z, z2);
    }

    /* renamed from: a */
    public AbstractC68307f<Boolean> mo27080a(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z) {
        return mo27079a(1, i, str, str2, str3, str4, str5, str6, str7, str8, "", str9, str10, str11, false, z);
    }

    /* renamed from: a */
    public AbstractC68307f<Boolean> mo27079a(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, boolean z2) {
        return this.f18652e.mo41505a(AbstractC7181i.class, C11678b.m48479c()).mo238020d(new Function(i, i2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, z2) {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$ztBdE7RblKqQPV94w_i0KHKnDI */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ String f$10;
            public final /* synthetic */ String f$11;
            public final /* synthetic */ String f$12;
            public final /* synthetic */ String f$13;
            public final /* synthetic */ String f$14;
            public final /* synthetic */ boolean f$15;
            public final /* synthetic */ boolean f$16;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ String f$6;
            public final /* synthetic */ String f$7;
            public final /* synthetic */ String f$8;
            public final /* synthetic */ String f$9;

            {
                this.f$1 = r4;
                this.f$2 = r5;
                this.f$3 = r6;
                this.f$4 = r7;
                this.f$5 = r8;
                this.f$6 = r9;
                this.f$7 = r10;
                this.f$8 = r11;
                this.f$9 = r12;
                this.f$10 = r13;
                this.f$11 = r14;
                this.f$12 = r15;
                this.f$13 = r16;
                this.f$14 = r17;
                this.f$15 = r18;
                this.f$16 = r19;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6880a.this.m27069a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, this.f$16, (AbstractC7181i) obj);
            }
        });
    }

    /* renamed from: a */
    public DriveCache mo27076a(String str, boolean z) {
        m27114h();
        try {
            return (DriveCache) this.f18652e.mo41505a(AbstractC7181i.class, C11678b.m48479c()).mo238020d(new Function(str, z) {
                /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$lgcqP1uHVhhvXYomHmZFNfbJTyU */
                public final /* synthetic */ String f$0;
                public final /* synthetic */ boolean f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ((AbstractC7181i) obj).get(this.f$0, this.f$1);
                }
            }).mo238023d();
        } catch (Exception e) {
            if (e.getMessage() == null || !e.getMessage().contains("The mapper function returned a null value")) {
                C13479a.m54759a("DriveCacheManager", "getSync exception, key = " + str, e);
                return null;
            }
            C13479a.m54764b("DriveCacheManager", "cache not hit, key = " + str);
            return null;
        }
    }

    /* renamed from: a */
    public C6956b mo27077a(String str, String str2, String str3, String str4) {
        return C6965c.m27719a().mo27479c().mo27481a(str, str2, str3, str4);
    }

    /* renamed from: a */
    public List<C6956b> mo27085a(String str, String str2, String str3) {
        return C6965c.m27719a().mo27479c().mo27482a(str, str2, str3);
    }

    /* renamed from: a */
    public Disposable mo27078a(C6956b bVar) {
        m27114h();
        return AbstractC68307f.m265083a(bVar).mo237985a(C11678b.m48479c()).mo238001b($$Lambda$a$WmlaGZdn_irrEU1GPryjbAgkXE.INSTANCE, $$Lambda$a$lA0zg0Uoj6pWCMLt_5WBOKWubKc.INSTANCE);
    }

    /* renamed from: b */
    public AbstractC68307f<Boolean> mo27089b(String str, String str2, String str3) {
        return AbstractC68307f.m265099b((Callable) new Callable(str2, str3, str) {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$foze8IpvJ8qnomNStgKwzO83o1I */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6880a.this.m27104d(this.f$1, this.f$2, this.f$3);
            }
        }).mo238014c(new Function(str) {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$XlsxCeXJURBEGCdRuNq0RcIRYE */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6880a.this.m27099c(this.f$1, (String) obj);
            }
        });
    }

    /* renamed from: b */
    public void mo27090b(String str, String str2) {
        AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238014c(new Function(str, str2) {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$k_ouQdkFa1eamehrCiR5f_8VKpY */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6880a.this.m27100c(this.f$1, this.f$2, (String) obj);
            }
        }).mo238001b($$Lambda$a$YWpmBcmJAxYEl5qBsjvA85j9A.INSTANCE, $$Lambda$a$__gUBJYHC6xgnxlVKiuh7RtfdNM.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m27083a(Object obj) throws Exception {
        C13479a.m54764b("DRIVE_CACHE_FLOW", "update cache name result=" + obj);
    }

    /* renamed from: a */
    public AbstractC68307f<Boolean> mo27084a(ArrayList<String> arrayList) {
        return AbstractC68307f.m265083a((Object) arrayList).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$iGCVoiNR8GtkwnGH816PYkb9iOM */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6880a.this.m27091b((ArrayList) obj);
            }
        }).mo237988a((Consumer<? super Throwable>) $$Lambda$a$kC6Rur4uGAgnGrM8mtyRE8fnfc.INSTANCE);
    }

    /* renamed from: a */
    public boolean mo27086a(String str, int i, int i2) {
        m27114h();
        try {
            return ((Boolean) this.f18652e.mo41505a(AbstractC7181i.class, C11678b.m48479c()).mo238020d(new Function(str, i, i2) {
                /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$429oLhVMZ9jVvtcaxF800SEWA */
                public final /* synthetic */ String f$0;
                public final /* synthetic */ int f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C6880a.m27072a(this.f$0, this.f$1, this.f$2, (AbstractC7181i) obj);
                }
            }).mo238023d()).booleanValue();
        } catch (Exception e) {
            C13479a.m54761a("DriveCacheManager", e);
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m27078a(long j, AccountService.Account account, AbstractC7181i iVar) throws Exception {
        return iVar.getCacheByTypeBeforeModTime(0, 2, j, account.f14584a, account.f14592i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m27079a(long j, AccountService.Account account) throws Exception {
        return this.f18652e.mo41508c(AbstractC7181i.class).mo238020d(new Function(j, account) {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$Qr_vVfDyL01E8ogqJhUSvI4XU */
            public final /* synthetic */ long f$0;
            public final /* synthetic */ AccountService.Account f$1;

            {
                this.f$0 = r1;
                this.f$1 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6880a.m27078a(this.f$0, this.f$1, (AbstractC7181i) obj);
            }
        });
    }

    /* renamed from: a */
    public static C6880a m27065a() {
        if (f18648b == null) {
            synchronized (C6880a.class) {
                if (f18648b == null) {
                    f18648b = new C6880a(C13615c.f35773a, new C10917c(new C10929e()));
                }
            }
        }
        return f18648b;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ AccountService.Account m27115i() throws Exception {
        m27114h();
        AccountService.Account f = this.f18651d.mo16408f();
        if (f == null) {
            C13479a.m54775e("DRIVE_CACHE_FLOW", "get current account from cache is null.");
            f = this.f18651d.mo16406d();
        }
        if (f != null && f.mo19677a()) {
            return f;
        }
        C13479a.m54758a("DRIVE_CACHE_FLOW", "get current account null, put cache failed. account=" + f);
        return null;
    }

    /* renamed from: f */
    public List<DriveCache> mo27094f() {
        m27114h();
        try {
            return (List) this.f18652e.mo41505a(AbstractC7181i.class, C11678b.m48479c()).mo238020d($$Lambda$BrqR9kkXZT9EJyMs7bvEeG_5wNQ.INSTANCE).mo238023d();
        } catch (Exception e) {
            C13479a.m54761a("DriveCacheManager", e);
            return new ArrayList();
        }
    }

    /* renamed from: e */
    public AbstractC68307f<Boolean> mo27093e() {
        if (((Boolean) this.f18653f.mo34038b("sync_status_doc_finished", false)).booleanValue()) {
            return AbstractC68307f.m265083a((Object) true);
        }
        synchronized (C6880a.class) {
            List<DriveCache> f = mo27094f();
            ArrayList arrayList = new ArrayList();
            for (DriveCache driveCache : f) {
                arrayList.add(driveCache.mo20337g());
            }
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31509b(arrayList).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$xhY4ijHcXVSlx4cCtprvIkWGlh4 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6880a.this.m27082a((C6880a) ((Integer) obj));
                }
            }, $$Lambda$a$yGktEUmwKn4Gj7Oan33LIegSHec.INSTANCE);
        }
        return AbstractC68307f.m265083a((Object) true);
    }

    /* renamed from: c */
    public AbstractC68307f<Boolean> mo27091c() {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$1gdlEfwXbYEd5sIMYicBJQwG5wI */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6880a.this.m27107e((String) obj);
            }
        }).mo237988a((Consumer<? super Throwable>) $$Lambda$a$RwNVncZ9Tux7jNHR5QOOj1cwCUA.INSTANCE);
    }

    /* renamed from: d */
    public AbstractC68307f<Long> mo27092d() {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$gWhyAqfCo1y2b3kYiacd1u0N3hQ */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6880a.this.m27103d((String) obj);
            }
        }).mo237988a((Consumer<? super Throwable>) $$Lambda$a$MStTZORMMP5OGy53ilGFJNM8N0.INSTANCE);
    }

    /* renamed from: b */
    public static boolean m27096b() {
        return f18649c;
    }

    /* renamed from: i */
    public static File m27116i(Context context) {
        return m27088b(context);
    }

    /* renamed from: a */
    public static File m27068a(Context context) {
        return new File(CCMStorage.m21715b(context, Biz.DRIVE, "streamingOffline"));
    }

    /* renamed from: b */
    public static File m27088b(Context context) {
        return new File(CCMStorage.m21715b(context, Biz.DRIVE, "offlineV2"));
    }

    /* renamed from: c */
    public static File m27097c(Context context) {
        return new File(CCMStorage.m21715b(context, Biz.DOCS, "cover"));
    }

    /* renamed from: d */
    public static File m27102d(Context context) {
        return new File(CCMStorage.m21715b(context, Biz.DRIVE, "videoOffline"));
    }

    /* renamed from: e */
    public static File m27106e(Context context) {
        return new File(CCMStorage.m21715b(context, Biz.DRIVE, "excelOffline"));
    }

    /* renamed from: f */
    public static File m27109f(Context context) {
        return new File(CCMStorage.m21715b(context, Biz.DRIVE, "preloadVideo"));
    }

    /* renamed from: g */
    public static File m27111g(Context context) {
        return new File(CCMStorage.m21715b(context, Biz.DRIVE, "temp"));
    }

    /* renamed from: h */
    public static File m27113h(Context context) {
        return new File(CCMStorage.m21716c(context, Biz.DRIVE));
    }

    /* renamed from: j */
    public AbstractC68307f<Boolean> mo27096j(Context context) {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function(context) {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$_7YAOQDPEspHIxbZO8Uv3V_9Ow */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6880a.this.m27089b(this.f$1, (String) obj);
            }
        });
    }

    /* renamed from: k */
    public AbstractC68307f<Boolean> mo27097k(Context context) {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function(context) {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$XWwqNXrAGYAE_IiJ3tDxJEL2vmw */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6880a.m27071a(this.f$0, (String) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m27105d(Throwable th) throws Exception {
        C13479a.m54758a("DriveCacheManager", "syncToStatusDocIfNeed()...throwable = " + th);
    }

    /* renamed from: l */
    private boolean m27117l(Context context) {
        m27114h();
        synchronized (C6880a.class) {
            C13479a.m54764b("DriveCacheManager", "start delete temp drive file.");
            try {
                this.f18652e.mo41505a(AbstractC7181i.class, C11678b.m48479c()).mo238005b((Consumer) $$Lambda$a$MkanMH48QoonxvSL9NJrtjZ4pY.INSTANCE).mo238023d();
                C6895h.m27260a(m27111g(context).getAbsolutePath());
                C13479a.m54764b("DriveCacheManager", "delete temp drive file finish.");
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m27091b(ArrayList arrayList) throws Exception {
        m27114h();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        loop0:
        while (true) {
            int i = 0;
            while (it.hasNext()) {
                i++;
                arrayList2.add(m27076a((String) it.next()));
                if (i >= 900) {
                    this.f18652e.mo41508c(AbstractC7181i.class).mo238005b((Consumer) new Consumer(arrayList2) {
                        /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$4cB0dAYJQdi5QCZmFwXfK7dQv0g */
                        public final /* synthetic */ ArrayList f$0;

                        {
                            this.f$0 = r1;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            ((AbstractC7181i) obj).removeList(this.f$0);
                        }
                    }).mo238023d();
                    arrayList2 = new ArrayList();
                }
            }
            break loop0;
        }
        if (!C13657b.m55421a(arrayList2)) {
            this.f18652e.mo41508c(AbstractC7181i.class).mo238005b((Consumer) new Consumer(arrayList2) {
                /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$dluNyJKpd9BkgTYvv0MwMk8utas */
                public final /* synthetic */ ArrayList f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ((AbstractC7181i) obj).removeList(this.f$0);
                }
            }).mo238023d();
        }
        return true;
    }

    /* renamed from: c */
    public static String m27098c(String str) {
        if (C36808a.m145211c() != 1) {
            return null;
        }
        try {
            File g = m27111g(C13615c.f35773a);
            if (!g.exists()) {
                g.mkdirs();
            }
            File file = new File(str);
            File file2 = new File(g, file.getName());
            C26311p.m95271a(file, file2);
            if (file2.exists()) {
                C13479a.m54764b("DriveCacheManager", "copyAndGetTempPath new Path = " + file2.getCanonicalPath());
                return file2.getCanonicalPath();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Long m27103d(String str) throws Exception {
        long longValue;
        m27114h();
        synchronized (C6880a.class) {
            C13479a.m54764b("DriveCacheManager", "getCleanableCacheSize start..");
            longValue = ((Long) this.f18652e.mo41505a(AbstractC7181i.class, C11678b.m48479c()).mo238020d($$Lambda$B9Wk2jxnl7DVUNclMOkD7um7n8.INSTANCE).mo238023d()).longValue();
            C13479a.m54764b("DriveCacheManager", "getCleanableCacheSize finish, cleanable size: " + longValue);
        }
        return Long.valueOf(longValue);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m27092b(C6956b bVar) throws Exception {
        C6965c.m27719a().mo27479c().mo27480a(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ Boolean m27107e(String str) throws Exception {
        m27114h();
        synchronized (C6880a.class) {
            C13479a.m54764b("DriveCacheManager", "clean all cleanable drive cache file start..");
            C6895h.m27260a(m27113h(this.f18650a).getAbsolutePath());
            this.f18652e.mo41505a(AbstractC7181i.class, C11678b.m48479c()).mo238005b((Consumer) $$Lambda$a$5QOwMPXnVhwijFuBHm1ebPaWrw.INSTANCE).mo238023d();
            C6895h.m27260a(m27111g(this.f18650a).getAbsolutePath());
            C6895h.m27260a(m27102d(this.f18650a).getAbsolutePath());
            C6895h.m27260a(m27109f(this.f18650a).getAbsolutePath());
            C6895h.m27265c(m27088b(this.f18650a));
            C6895h.m27260a(m27097c(this.f18650a).getAbsolutePath());
            C6895h.m27260a(m27068a(this.f18650a).getAbsolutePath());
            C13479a.m54764b("DriveCacheManager", "clean all cleanable drive cache file finish");
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m27093b(AbstractC7181i iVar) throws Exception {
        iVar.removeAll(0);
        iVar.removeAll(1);
        iVar.removeAll(-1);
    }

    /* renamed from: b */
    public AbstractC68307f<List<DriveCache>> mo27087b(long j) {
        return AbstractC68307f.m265099b((Callable) new Callable() {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$Um6rBL3REvNTLFhC3Do8jHF9IM */

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6880a.this.m27115i();
            }
        }).mo238014c(new Function(j) {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$poG_sBXrdZtIVFxojG1pI1F400U */
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6880a.this.m27079a(this.f$1, (AccountService.Account) obj);
            }
        }).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48479c()).mo238011b((AbstractC70020b) AbstractC68307f.m265083a((Object) new ArrayList()));
    }

    /* renamed from: b */
    public AbstractC68307f<Boolean> mo27088b(String str) {
        return this.f18652e.mo41505a(AbstractC7181i.class, C11678b.m48479c()).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$nu_TdHx3DwphLhvoimaOJlC062A */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6880a.m27090b(this.f$0, (AbstractC7181i) obj);
            }
        });
    }

    private C6880a(Context context, C10917c cVar) {
        this.f18650a = context.getApplicationContext();
        this.f18652e = cVar;
        this.f18653f = new PersistenceSharedPreference("drive_cache_sp");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m27089b(Context context, String str) throws Exception {
        return Boolean.valueOf(m27117l(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ AbstractC70020b m27099c(String str, String str2) throws Exception {
        return this.f18652e.mo41508c(AbstractC7181i.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$_tgboc5HG_Fpx6EJk2srIbkxCS0 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6880a.m27073a(this.f$0, (AbstractC7181i) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Boolean m27090b(String str, AbstractC7181i iVar) throws Exception {
        return Boolean.valueOf(iVar.remove(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m27070a(long j, String str) throws Exception {
        m27114h();
        synchronized (C6880a.class) {
            C13479a.m54764b("DriveCacheManager", "clean all drive cache beforeTimeInMills file start..");
            C6895h.m27259a(j, m27113h(this.f18650a));
            this.f18652e.mo41505a(AbstractC7181i.class, C11678b.m48479c()).mo238005b((Consumer) new Consumer(j) {
                /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$q5R2IIqya_nLyIQaMeryo5YSzw */
                public final /* synthetic */ long f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6880a.m27080a(this.f$0, (AbstractC7181i) obj);
                }
            }).mo238023d();
            C6895h.m27259a(j, m27111g(this.f18650a));
            C6895h.m27259a(j, m27102d(this.f18650a));
            C6895h.m27259a(j, m27109f(this.f18650a));
            C6895h.m27263b(j, m27088b(this.f18650a));
            C6895h.m27259a(j, m27097c(this.f18650a));
            C6895h.m27259a(j, m27068a(this.f18650a));
            C13479a.m54764b("DriveCacheManager", "clean all drive cache beforeTimeInMills file finish");
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m27071a(Context context, String str) throws Exception {
        synchronized (C6880a.class) {
            File file = new File(context.getFilesDir(), AbstractC6882b.f18660b);
            String parent = file.getParent();
            File file2 = new File(parent, file.getName() + ".drive_delete");
            if (file.exists()) {
                if (file.renameTo(file2)) {
                    C6895h.m27260a(file2.getAbsolutePath());
                    file2.delete();
                } else {
                    C13479a.m54758a("DriveCacheManager", "rename deleteTempDownloadCacheFile file error");
                }
            } else if (file2.exists()) {
                C6895h.m27260a(file2.getAbsolutePath());
                file2.delete();
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m27073a(String str, AbstractC7181i iVar) throws Exception {
        return Boolean.valueOf(iVar.remove(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ String m27104d(String str, String str2, String str3) throws Exception {
        new C7115c().mo27844a(str, str2);
        m27114h();
        return str3;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ AbstractC70020b m27100c(String str, String str2, String str3) throws Exception {
        m27114h();
        return this.f18652e.mo41508c(AbstractC7181i.class).mo238005b((Consumer) new Consumer(str, str2) {
            /* class com.bytedance.ee.bear.drive.cache.$$Lambda$a$Wcv8vz24wtwF3ghSgy76cEBuxI */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC7181i) obj).updateCacheName(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public static C7086a m27066a(String str, DriveCache driveCache, String str2) {
        if (driveCache == null || TextUtils.isEmpty(str) || driveCache.mo20325b() == null) {
            C13479a.m54758a("DriveCacheManager", "driveCache or token is null");
            return null;
        }
        C7086a aVar = new C7086a(new C7086a.C7087a(driveCache.mo20335f(), driveCache.mo20341i(), null, 0, "", driveCache.mo20344j(), str, "", "", 0, "", driveCache.mo20330d(), "", 0, 0, str2, null));
        aVar.mo27328b(true);
        aVar.mo27326b(driveCache.mo20333e());
        if (driveCache.mo20325b().exists()) {
            aVar.mo27334d(driveCache.mo20325b().getAbsolutePath());
        } else {
            C13479a.m54775e("DriveCacheManager", "convertDriveCacheToFileModel() file not exists");
        }
        aVar.mo27319a(driveCache.mo20328c());
        aVar.mo27327b(driveCache.mo20347l());
        aVar.mo27337e(driveCache.mo20348m());
        C13479a.m54764b("DriveCacheManager", "file model cache file find success. objToken=" + C13598b.m55197d(str));
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m27072a(String str, int i, int i2, AbstractC7181i iVar) throws Exception {
        return Boolean.valueOf(iVar.convertCacheType(str, i, i2));
    }

    /* renamed from: a */
    public static C7088b m27067a(String str, String str2, String str3, DriveCache driveCache) {
        C7088b bVar = new C7088b(new C7088b.C7089a(driveCache.mo20335f(), driveCache.mo20341i(), null, 0, "", driveCache.mo20344j(), str, str2, str3, 0, "", null));
        bVar.mo27326b(driveCache.mo20333e());
        bVar.mo27319a(driveCache.mo20328c());
        bVar.mo27328b(true);
        if (driveCache.mo20325b().exists()) {
            bVar.mo27334d(driveCache.mo20325b().getAbsolutePath());
        } else {
            C13479a.m54775e("DriveCacheManager", "convertDriveCacheToFileModel() file not exists");
        }
        bVar.mo27337e(driveCache.mo20348m());
        bVar.mo27327b(driveCache.mo20347l());
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m27069a(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, boolean z2, AbstractC7181i iVar) throws Exception {
        AccountService.Account f = this.f18651d.mo16408f();
        if (f == null) {
            C13479a.m54775e("DRIVE_CACHE_FLOW", "get current account from cache is null.");
            f = this.f18651d.mo16406d();
        }
        if (f != null && f.mo19677a()) {
            return Boolean.valueOf(iVar.put(i, i2, str, str2, str3, str4, str5, str6, str7, str8, f.f14584a, f.f14592i, str9, str10, str11, str12, z, z2));
        }
        C13479a.m54758a("DRIVE_CACHE_FLOW", "get current account null, put cache failed. account=" + f);
        return false;
    }
}
