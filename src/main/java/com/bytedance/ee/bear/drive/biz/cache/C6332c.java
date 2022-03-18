package com.bytedance.ee.bear.drive.biz.cache;

import android.text.TextUtils;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.loader.model.C7088b;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p701d.C13615c;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.concurrent.Callable;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.biz.cache.c */
class C6332c {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25432a(Boolean bool) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m25435b(Boolean bool) throws Exception {
    }

    C6332c() {
    }

    /* renamed from: a */
    public static void m25431a(C7088b bVar, byte[] bArr) {
        if (bVar == null || bVar.mo27322a() == null || bArr == null) {
            C13479a.m54764b("DriveSdk", "SdkStreamingCacheUtils#saveProgressiveSource param empty!!!");
            return;
        }
        C13479a.m54764b("DriveSdk", "SdkStreamingCacheUtils#saveProgressiveSource start!!!");
        C6880a a = C6880a.m27065a();
        String a2 = C6880a.m27077a(bVar.mo27322a().f19101m, bVar.mo27322a().f18785a);
        AbstractC68307f.m265099b((Callable) new Callable(a2, bVar, bArr) {
            /* class com.bytedance.ee.bear.drive.biz.cache.$$Lambda$c$oBqflZ4uJMpM2dWnFAGmi0sm6M */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ C7088b f$1;
            public final /* synthetic */ byte[] f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6332c.m25425a(this.f$0, this.f$1, this.f$2);
            }
        }).mo238014c(new Function(a2, bVar) {
            /* class com.bytedance.ee.bear.drive.biz.cache.$$Lambda$c$JPMd6bEbZzMP8LVkQd5Y92sgs */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ C7088b f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6332c.m25428a(C6880a.this, this.f$1, this.f$2, (Boolean) obj);
            }
        }).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e()).mo238001b($$Lambda$c$EgL4mdBdVfgLxD75uHguHuOSww.INSTANCE, $$Lambda$c$CBBAkTq6Iy2Zsr4x3TbOZ_6fqSk.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m25434a(File file) throws Exception {
        if (!file.exists() || file.length() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m25437c(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            C13479a.m54764b("DriveSdk", "SdkStreamingCacheUtils#saveProgressiveSource success!!!");
        } else {
            C13479a.m54764b("DriveSdk", "SdkStreamingCacheUtils#saveProgressiveSource failure!!!");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m25438c(Throwable th) throws Exception {
        C13479a.m54758a("DriveSdk", "SdkStreamingCacheUtils#saveProgressiveSource error!!!, e = " + th.getMessage());
    }

    /* renamed from: a */
    public static void m25429a(C7088b bVar) {
        if (bVar == null || bVar.mo27322a() == null) {
            C13479a.m54758a("DriveSdk", "SdkStreamingCacheUtils#saveStreamingDownloadFile param error");
            return;
        }
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238014c(new Function(0, C6880a.m27077a(bVar.mo27322a().f19101m, bVar.mo27322a().f18785a), bVar) {
            /* class com.bytedance.ee.bear.drive.biz.cache.$$Lambda$c$Hd8pjtX8mUzBq3trJMPX_GyV9qI */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ C7088b f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6332c.m25427a(C6880a.this, this.f$1, this.f$2, this.f$3, (String) obj);
            }
        }).mo238001b($$Lambda$c$zTYOR4LZ0AYg_AgQZoauBlwtrZc.INSTANCE, $$Lambda$c$8HcC62sJfhmvzkNBY8Qlc5f5JlE.INSTANCE);
    }

    /* renamed from: a */
    public static void m25430a(C7088b bVar, String str) {
        if (bVar == null || bVar.mo27322a() == null) {
            C13479a.m54758a("DriveSdk", "SdkStreamingCacheUtils#saveStreamingDownloadFile param error");
            return;
        }
        C6880a a = C6880a.m27065a();
        String a2 = C6880a.m27077a(bVar.mo27322a().f19101m, bVar.mo27322a().f18785a);
        AbstractC68307f.m265083a(new File(str)).mo237985a(C11678b.m48479c()).mo237998a((AbstractC68322n) $$Lambda$c$BQXiJ_LtINf44E9srcgOySyAVVM.INSTANCE).mo238020d(new Function(a2, bVar) {
            /* class com.bytedance.ee.bear.drive.biz.cache.$$Lambda$c$CodMZsOsfLnLz4lKicbBJq3E_tM */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ C7088b f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6332c.m25424a(this.f$0, this.f$1, (File) obj);
            }
        }).mo238014c(new Function(0, a2, bVar) {
            /* class com.bytedance.ee.bear.drive.biz.cache.$$Lambda$c$IbeVf9PP3723I61yVXdLIAiWw */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ C7088b f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6332c.m25426a(C6880a.this, this.f$1, this.f$2, this.f$3, (File) obj);
            }
        }).mo238001b($$Lambda$c$48iFbpyelKeWJ7MrOK314JC80Eg.INSTANCE, $$Lambda$c$F9wiRy06lCNbPc3k6PHnVFQsZcc.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m25425a(String str, C7088b bVar, byte[] bArr) throws Exception {
        File b = C6880a.m27088b(C13615c.f35773a);
        File file = new File(b, str);
        bVar.mo27334d(file.getAbsolutePath());
        if (!b.exists()) {
            b.mkdirs();
        }
        return Boolean.valueOf(C13675f.m55507a(bArr, file));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ File m25424a(String str, C7088b bVar, File file) throws Exception {
        File file2 = new File(C6880a.m27088b(C13615c.f35773a).getAbsolutePath(), str);
        File file3 = new File(file2.getAbsolutePath() + "_" + System.currentTimeMillis());
        synchronized (C6332c.class) {
            bVar.mo27334d(file2.getAbsolutePath());
            if (!TextUtils.equals(file2.getParentFile().getAbsolutePath(), file.getParentFile().getAbsolutePath())) {
                file3.delete();
                C13675f.m55514b(file, file3);
                file3.renameTo(file2);
            }
        }
        return file2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m25428a(C6880a aVar, String str, C7088b bVar, Boolean bool) throws Exception {
        return bool.booleanValue() ? aVar.mo27080a(0, str, bVar.mo27343j(), bVar.mo27322a().f18785a, bVar.mo27322a().mo27364g(), bVar.mo27333d(), "1", "", bVar.mo27322a().mo27358a(), bVar.mo27322a().f19101m, bVar.mo27322a().f18785a, bVar.mo27351r(), bVar.mo27322a().f18791g) : AbstractC68307f.m265083a((Object) false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m25426a(C6880a aVar, int i, String str, C7088b bVar, File file) throws Exception {
        return aVar.mo27080a(i, str, bVar.mo27343j(), bVar.mo27322a().f18785a, bVar.mo27322a().mo27364g(), bVar.mo27333d(), "1", "", bVar.mo27322a().mo27358a(), bVar.mo27322a().f19101m, bVar.mo27322a().f18785a, bVar.mo27351r(), bVar.mo27322a().f18791g).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48479c());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m25427a(C6880a aVar, int i, String str, C7088b bVar, String str2) throws Exception {
        return aVar.mo27080a(i, str, bVar.mo27343j(), bVar.mo27322a().f18785a, bVar.mo27322a().mo27364g(), bVar.mo27333d(), "1", "", bVar.mo27322a().mo27358a(), bVar.mo27322a().f19101m, bVar.mo27322a().f18785a, bVar.mo27351r(), true);
    }
}
