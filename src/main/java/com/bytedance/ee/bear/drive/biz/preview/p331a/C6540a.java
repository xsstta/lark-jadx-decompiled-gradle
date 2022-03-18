package com.bytedance.ee.bear.drive.biz.preview.p331a;

import android.content.Context;
import com.bytedance.ee.bear.archive_api.IArchiveApi;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.bear.drive.biz.plugin.C6527a;
import com.bytedance.ee.bear.libarchive.ArchiveEntry;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.C26320t;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.biz.preview.a.a */
public class C6540a {
    /* renamed from: b */
    public static AbstractC68307f<List<ArchiveEntry>> m26267b(String str) {
        return C6527a.m26177a().mo26085g().mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.drive.biz.preview.p331a.$$Lambda$a$OBh5Sf6_ISjANomzbnfodt6IO8 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6540a.m269380lambda$OBh5Sf6_ISjANomzbnfodt6IO8(this.f$0, (IArchiveApi) obj);
            }
        });
    }

    /* renamed from: a */
    public static AbstractC68307f<Boolean> m26259a(String str) {
        return C6527a.m26177a().mo26085g().mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.drive.biz.preview.p331a.$$Lambda$a$LnvDh4VC_VriVTv5KKTaXdgnrmI */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6540a.lambda$LnvDh4VC_VriVTv5KKTaXdgnrmI(this.f$0, (IArchiveApi) obj);
            }
        });
    }

    /* renamed from: b */
    private static void m26269b(AbstractC68323g<String> gVar, String str) {
        gVar.onNext(str);
        gVar.onComplete();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Boolean m26268b(String str, IArchiveApi iArchiveApi) throws Exception {
        return Boolean.valueOf(iArchiveApi.isEncrypted(str));
    }

    /* renamed from: a */
    private static void m26264a(AbstractC68323g<String> gVar, String str) {
        gVar.onError(new Throwable(str));
        gVar.onComplete();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m26265a(String str, AbstractC68323g gVar, Integer num) throws Exception {
        C13479a.m54764b("ArchiveHelper", "extractEntry result = " + num);
        if (num.intValue() != 0) {
            File file = new File(str);
            if (file.exists()) {
                boolean delete = file.delete();
                C13479a.m54764b("ArchiveHelper", "extractEntry()...delete Result = " + delete);
            }
            m26264a(gVar, "extractEntry()...failed, code = " + num);
            return;
        }
        C13479a.m54764b("ArchiveHelper", "extractEntry success");
        m26269b(gVar, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m26266a(String str, AbstractC68323g gVar, Throwable th) throws Exception {
        C13479a.m54758a("ArchiveHelper", "extractEntry()...error = " + th);
        File file = new File(str);
        if (file.exists()) {
            C13479a.m54764b("ArchiveHelper", "delete error file cache");
            file.delete();
        }
        m26264a(gVar, th.getMessage());
    }

    /* renamed from: a */
    private static AbstractC68307f<Integer> m26260a(String str, String str2, String str3, String str4) {
        return C6527a.m26177a().mo26085g().mo238020d(new Function(str, str2, str3, str4) {
            /* class com.bytedance.ee.bear.drive.biz.preview.p331a.$$Lambda$a$_5z0qHuq7dEx4cqLefiLImZwmO0 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6540a.lambda$_5z0qHuq7dEx4cqLefiLImZwmO0(this.f$0, this.f$1, this.f$2, this.f$3, (IArchiveApi) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Integer m26261a(String str, String str2, String str3, String str4, IArchiveApi iArchiveApi) throws Exception {
        return Integer.valueOf(iArchiveApi.extractEntry(str, str2, str3, str4));
    }

    /* renamed from: a */
    public static AbstractC68307f<String> m26258a(Context context, String str, String str2, long j, String str3) {
        return AbstractC68307f.m265080a(new AbstractC68324h(context, str, str2, j, str3) {
            /* class com.bytedance.ee.bear.drive.biz.preview.p331a.$$Lambda$a$7H2Zp0F90aCCumms0lJlwmu3478 */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ long f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r6;
            }

            @Override // io.reactivex.AbstractC68324h
            public final void subscribe(AbstractC68323g gVar) {
                C6540a.lambda$7H2Zp0F90aCCumms0lJlwmu3478(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, gVar);
            }
        }, BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m26263a(Context context, String str, String str2, long j, String str3, AbstractC68323g gVar) throws Exception {
        String a = CCMStorage.m21713a(context, Biz.DRIVE, "archive");
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = C26320t.m95317a(new File(str));
        C13479a.m54764b("ArchiveHelper", "extractEntry()...destRootPath = " + a + ", md5 = " + a2 + " costTime=" + (System.currentTimeMillis() - currentTimeMillis));
        if (a2 == null) {
            m26264a(gVar, "extractEntry()...srcFileMD5 is null");
            return;
        }
        String str4 = a + File.separator + a2 + File.separator;
        File file = new File(str4);
        if ((!file.exists() || !file.isDirectory()) && !file.mkdirs()) {
            m26264a(gVar, "extractEntry()...destRootPath mkdir failed");
            return;
        }
        String str5 = str4 + str2;
        C13479a.m54772d("ArchiveHelper", "extractEntry()...destEntryFilePath = " + str5);
        File file2 = new File(str5);
        boolean exists = file2.exists();
        if (!exists || file2.length() != j) {
            C13479a.m54764b("ArchiveHelper", "extractEntry()...entry file not cached");
            if (exists) {
                file2.delete();
            }
            m26260a(str, str2, str4, str3).mo238001b(new Consumer(str5, gVar) {
                /* class com.bytedance.ee.bear.drive.biz.preview.p331a.$$Lambda$a$8NHbFDMHfBBnkxQBYx9Rq33Vdqs */
                public final /* synthetic */ String f$0;
                public final /* synthetic */ AbstractC68323g f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6540a.lambda$8NHbFDMHfBBnkxQBYx9Rq33Vdqs(this.f$0, this.f$1, (Integer) obj);
                }
            }, new Consumer(str5, gVar) {
                /* class com.bytedance.ee.bear.drive.biz.preview.p331a.$$Lambda$a$v2vQXyS1A4MMhTMlly3bFzrW8 */
                public final /* synthetic */ String f$0;
                public final /* synthetic */ AbstractC68323g f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6540a.m269381lambda$v2vQXyS1A4MMhTMlly3bFzrW8(this.f$0, this.f$1, (Throwable) obj);
                }
            });
            return;
        }
        C13479a.m54764b("ArchiveHelper", "extractEntry()...entry file has cached");
        m26269b(gVar, str5);
    }
}
