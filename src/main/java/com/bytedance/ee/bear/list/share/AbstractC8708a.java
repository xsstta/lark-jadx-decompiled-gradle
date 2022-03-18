package com.bytedance.ee.bear.list.share;

import com.bytedance.ee.bear.list.AbstractC8457h;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.list.share.a */
public abstract class AbstractC8708a implements AbstractC8457h {
    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m36461c(ArrayList arrayList) throws Exception {
        C8153a.m32844b().mo31589a(C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 4));
    }

    /* renamed from: a */
    public void mo33765a(String str) {
        C13479a.m54764b("ShareToMeListCache", "delete()...");
        AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$a$kf_nyj7C2_BBJ8olQHXH0tWcD84 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC8708a.m36458a(this.f$0, (String) obj);
            }
        }, $$Lambda$a$F8XB9ZMVL_C7oOOCpVt2L53PDT0.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: b */
    public void mo32621b(ArrayList<Document> arrayList) {
        C13479a.m54764b("ShareToMeListCache", "save()...");
        AbstractC68307f.m265083a((Object) arrayList).mo237985a(C11678b.m48479c()).mo238001b($$Lambda$a$kMx_sFOoAPaZxZB1gfgVMvxfbi8.INSTANCE, $$Lambda$a$5bODsoAAIpItDrpiJpnh_L6x6AQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36458a(String str, String str2) throws Exception {
        C8153a.m32844b().mo31594b(4, str);
    }
}
