package com.bytedance.ee.bear.drive.biz.cache;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p701d.C13615c;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.concurrent.Callable;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.biz.cache.d */
class C6333d {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25446a(Boolean bool) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m25449b(Boolean bool) throws Exception {
    }

    C6333d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m25448a(File file) throws Exception {
        if (!file.exists() || file.length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m25444a(AbstractC6927d dVar, C7086a aVar) {
        boolean z;
        if (dVar == null || aVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveStandAloneCache param error, previewFileStrategy=");
            sb.append(dVar);
            sb.append(", fileModel is null=");
            if (aVar == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54758a("StreamingCacheUtils", sb.toString());
            return;
        }
        String a = dVar.mo27240a(aVar);
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238014c(new Function(0, a, aVar, dVar) {
            /* class com.bytedance.ee.bear.drive.biz.cache.$$Lambda$d$ccFLfwSWRoS2Jf0OCYECA0amZo */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ C7086a f$3;
            public final /* synthetic */ AbstractC6927d f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6333d.m25442a(C6880a.this, this.f$1, this.f$2, this.f$3, this.f$4, (String) obj);
            }
        }).mo238001b($$Lambda$d$qwrsgRO63oa47lNecmEL0aCxUZs.INSTANCE, $$Lambda$d$nwYIJRKVZGyVnDa6ojmEsVV6KE.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m25440a(File file, byte[] bArr, File file2) throws Exception {
        if (!file.exists()) {
            file.mkdirs();
        }
        return Boolean.valueOf(C13675f.m55507a(bArr, file2));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ File m25439a(String str, C7086a aVar, File file) throws Exception {
        File file2 = new File(C6880a.m27088b(C13615c.f35773a).getAbsolutePath(), str);
        File file3 = new File(file2.getAbsolutePath() + "_" + System.currentTimeMillis());
        synchronized (C6333d.class) {
            aVar.mo27334d(file2.getAbsolutePath());
            if (!TextUtils.equals(file2.getParentFile().getAbsolutePath(), file.getParentFile().getAbsolutePath())) {
                file3.delete();
                C13675f.m55514b(file, file3);
                file3.renameTo(file2);
            }
        }
        return file2;
    }

    /* renamed from: a */
    public static void m25445a(AbstractC6927d dVar, C7086a aVar, String str) {
        boolean z;
        if (dVar == null || aVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveStreamingDownloadFile param error, previewFileStrategy=");
            sb.append(dVar);
            sb.append(", fileModel is null=");
            if (aVar == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54758a("StreamingCacheUtils", sb.toString());
            return;
        }
        C6880a a = C6880a.m27065a();
        String a2 = dVar.mo27240a(aVar);
        AbstractC68307f.m265083a(new File(str)).mo237985a(C11678b.m48479c()).mo237998a((AbstractC68322n) $$Lambda$d$OoDrgYKzp5iyaQfzX0g4_jTdc.INSTANCE).mo238020d(new Function(a2, aVar) {
            /* class com.bytedance.ee.bear.drive.biz.cache.$$Lambda$d$38TCbcW0MSjk7jHp7RLQTDFX9Y */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ C7086a f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6333d.m25439a(this.f$0, this.f$1, (File) obj);
            }
        }).mo238014c(new Function(0, a2, aVar, dVar) {
            /* class com.bytedance.ee.bear.drive.biz.cache.$$Lambda$d$n4oo2TFilfsCepK_3WqcSfkXVE */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ C7086a f$3;
            public final /* synthetic */ AbstractC6927d f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6333d.m25441a(C6880a.this, this.f$1, this.f$2, this.f$3, this.f$4, (File) obj);
            }
        }).mo238001b($$Lambda$d$bLRdOBfGYrLTZ6bsvM9GxA1myMk.INSTANCE, $$Lambda$d$vgaRQrFzTVTwlb7KdJs5TfLQ8.INSTANCE);
    }

    /* renamed from: a */
    public static void m25443a(Context context, AbstractC6927d dVar, final C7086a aVar, byte[] bArr) {
        boolean z;
        if (dVar == null || aVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveProgressiveSource param error, previewFileStrategy=");
            sb.append(dVar);
            sb.append(", fileModel is null=");
            if (aVar == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54758a("StreamingCacheUtils", sb.toString());
            return;
        }
        C13479a.m54764b("StreamingCacheUtils", "saveProgressiveSource start!!!");
        final C6880a a = C6880a.m27065a();
        if (dVar.mo27243a(aVar.mo27322a().f18787c, aVar.mo27333d())) {
            C13479a.m54764b("StreamingCacheUtils", "saveProgressiveSource canCache!!!");
            final String a2 = dVar.mo27240a(aVar);
            File b = C6880a.m27088b(context);
            File file = new File(b, a2);
            aVar.mo27334d(file.getAbsolutePath());
            AbstractC68307f.m265099b((Callable) new Callable(b, bArr, file) {
                /* class com.bytedance.ee.bear.drive.biz.cache.$$Lambda$d$uhFopyCceakuUA559qtpyWne2vE */
                public final /* synthetic */ File f$0;
                public final /* synthetic */ byte[] f$1;
                public final /* synthetic */ File f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C6333d.m25440a(this.f$0, this.f$1, this.f$2);
                }
            }).mo238014c(new Function<Boolean, AbstractC70020b<Boolean>>() {
                /* class com.bytedance.ee.bear.drive.biz.cache.C6333d.C63363 */

                /* renamed from: a */
                public AbstractC70020b<Boolean> apply(Boolean bool) throws Exception {
                    return bool.booleanValue() ? a.mo27081a(0, a2, aVar.mo27343j(), aVar.mo27322a().f18785a, aVar.mo27322a().mo27364g(), aVar.mo27333d(), "1", aVar.mo27322a().f19098q, aVar.mo27322a().mo27358a(), "", aVar.mo27351r(), aVar.mo27322a().f18791g) : AbstractC68307f.m265083a((Object) false);
                }
            }).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<Boolean>() {
                /* class com.bytedance.ee.bear.drive.biz.cache.C6333d.C63341 */

                /* renamed from: a */
                public void accept(Boolean bool) throws Exception {
                    if (bool.booleanValue()) {
                        C13479a.m54764b("StreamingCacheUtils", "saveProgressiveSource success!!!");
                    } else {
                        C13479a.m54764b("StreamingCacheUtils", "saveProgressiveSource failure!!!");
                    }
                }
            }, new Consumer<Throwable>() {
                /* class com.bytedance.ee.bear.drive.biz.cache.C6333d.C63352 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    C13479a.m54758a("StreamingCacheUtils", "saveProgressiveSource error!!!, e = " + th.getMessage());
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m25442a(C6880a aVar, int i, String str, C7086a aVar2, AbstractC6927d dVar, String str2) throws Exception {
        return aVar.mo27082a(i, str, aVar2.mo27343j(), aVar2.mo27322a().f18785a, aVar2.mo27322a().mo27364g(), aVar2.mo27333d(), dVar.mo27245b(), aVar2.mo27322a().f19098q, aVar2.mo27322a().mo27358a(), aVar2.mo27339f(), aVar2.mo27351r(), true, aVar2.mo27322a().f18791g);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m25441a(C6880a aVar, int i, String str, C7086a aVar2, AbstractC6927d dVar, File file) throws Exception {
        return aVar.mo27081a(i, str, aVar2.mo27343j(), aVar2.mo27322a().f18785a, aVar2.mo27322a().mo27364g(), aVar2.mo27333d(), dVar.mo27245b(), aVar2.mo27322a().f19098q, aVar2.mo27322a().mo27358a(), aVar2.mo27339f(), aVar2.mo27351r(), aVar2.mo27322a().f18791g).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48479c());
    }
}
