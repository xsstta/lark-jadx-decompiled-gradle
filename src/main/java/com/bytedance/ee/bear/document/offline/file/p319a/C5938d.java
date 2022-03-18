package com.bytedance.ee.bear.document.offline.file.p319a;

import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.document.offline.file.a.d */
public class C5938d {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m23939a(ArrayList arrayList) throws Exception {
        if (C5955d.m24025b().mo24094c(arrayList).length != 0) {
            return true;
        }
        throw new IllegalStateException("Insert db fail !");
    }

    /* renamed from: a */
    public static AbstractC68307f<Boolean> m23938a(String str, Map<String, String> map, boolean z) {
        if (map == null || map.isEmpty()) {
            return AbstractC68307f.m265084a((Throwable) new IllegalStateException("empty files"));
        }
        return AbstractC68307f.m265083a(map).mo237985a(C11678b.m48479c()).mo238020d(new Function(str, z) {
            /* class com.bytedance.ee.bear.document.offline.file.p319a.$$Lambda$d$lCrFgdkONJlws2RqG5qqOYog8GU */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ boolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5938d.m23940a(this.f$0, this.f$1, (Map) obj);
            }
        }).mo238020d($$Lambda$d$rcCwYdFc1MybzhmnCvuNnqueTww.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ArrayList m23940a(String str, boolean z, Map map) throws Exception {
        String str2 = C6313i.m25327a().mo25399g(str).f17447b;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            C5937c cVar = new C5937c();
            if (C13675f.m55529e(z, str3)) {
                cVar.mo23956a(C13675f.m55511b(z, str3) + "_" + System.currentTimeMillis());
                cVar.mo23958b(str2);
                cVar.mo23964e((String) entry.getKey());
                if (z) {
                    cVar.mo23972i(str3);
                    cVar.mo23962d("");
                } else {
                    cVar.mo23972i("");
                    cVar.mo23962d(new File(str3).getAbsolutePath());
                }
                cVar.mo23955a(Long.valueOf(C13675f.m55526d(z, str3)));
                cVar.mo23960c(str);
                arrayList.add(cVar);
            }
        }
        C13479a.m54764b("SelectFileManagerV2", "save files : fileModels = " + arrayList.toString());
        return arrayList;
    }
}
