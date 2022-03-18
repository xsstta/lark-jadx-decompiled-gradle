package com.bytedance.ee.bear.drive.biz.cache;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.drive.biz.preview.pdf.StreamingCache;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Function;
import java.io.File;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.biz.cache.b */
class C6331b {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m25423a(File file) throws Exception {
        if (!file.exists() || file.length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m25420a(AbstractC6927d dVar, AbstractC6949c cVar, StreamingCache streamingCache) {
        boolean z;
        if (dVar == null || cVar == null || streamingCache == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveStreamingFileCache param error, previewFileStrategy=");
            sb.append(dVar);
            sb.append(", fileModel is null=");
            if (cVar == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54758a("DriveComponent", sb.toString());
            return;
        }
        C6880a a = C6880a.m27065a();
        AbstractC6946a a2 = cVar.mo27371a();
        AbstractC68307f.m265083a(new File(streamingCache.getFilePath())).mo237985a(C11678b.m48479c()).mo237998a((AbstractC68322n) $$Lambda$b$O5dUgxAj96r7rRRhWg_52z3AWcU.INSTANCE).mo238014c(new Function(a, 0, dVar.mo27240a(a2), a2, dVar, cVar) {
            /* class com.bytedance.ee.bear.drive.biz.cache.$$Lambda$b$TdyFEA4jYO54sClpA50rL99OA */
            public final /* synthetic */ C6880a f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ AbstractC6946a f$4;
            public final /* synthetic */ AbstractC6927d f$5;
            public final /* synthetic */ AbstractC6949c f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6331b.m25419a(StreamingCache.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (File) obj);
            }
        }).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48479c()).mo238001b($$Lambda$b$oOPspYRX0T4UcAq9bFgGzMtx88A.INSTANCE, $$Lambda$b$4cMGJ7qURrrFYrceYUsUUlHQFLc.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m25419a(StreamingCache streamingCache, C6880a aVar, int i, String str, AbstractC6946a aVar2, AbstractC6927d dVar, AbstractC6949c cVar, File file) throws Exception {
        return aVar.mo27079a(0, i, str, "", aVar2.mo27322a().f18785a, aVar2.mo27322a().mo27364g(), aVar2.mo27333d(), dVar.mo27245b(), cVar.mo27375e(), aVar2.mo27322a().mo27358a(), JSON.toJSONString(streamingCache), "", "", aVar2.mo27351r(), true, aVar2.mo27322a().f18791g);
    }
}
