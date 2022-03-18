package com.bytedance.ee.bear.list.folder;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ee.bear.list.AbstractC8457h;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8175b;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.cache.C8201j;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.folder.a */
public abstract class AbstractC8314a implements AbstractC8457h {

    /* renamed from: a */
    protected String f22477a;

    public AbstractC8314a(String str) {
        this.f22477a = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m34378d(ArrayList arrayList) throws Exception {
        Pair<List<C8175b>, List<C8201j>> c = m34377c(arrayList);
        C8153a.m32844b().mo31589a((List) c.first, (List) c.second);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: b */
    public void mo32621b(ArrayList<Document> arrayList) {
        C13479a.m54764b("PersonalCache", "save()...");
        AbstractC68307f.m265083a((Object) arrayList).mo237985a(C11678b.m48479c()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$a$Jt8OFnlhrbsnNywKDZQ7ZGk3qkI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC8314a.this.m34378d((ArrayList) obj);
            }
        }, $$Lambda$a$HS3LXIULe1I9nqT8tM9oMnWjI.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public void mo32620a(ArrayList<Document> arrayList) {
        C13479a.m54764b("PersonalCache", "clearAndSave()...");
        AbstractC68307f.m265083a(this.f22477a).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$a$QBu4FhjbtuaC7VQS3Y6F1lt6vn8 */
            public final /* synthetic */ ArrayList f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC8314a.m34375a(this.f$0, (String) obj);
            }
        }, $$Lambda$a$T2nnuL_fJlLT1qm1pf8irqFIAL0.INSTANCE);
    }

    /* renamed from: c */
    private Pair<List<C8175b>, List<C8201j>> m34377c(ArrayList<Document> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (C13657b.m55421a(arrayList)) {
            return new Pair<>(arrayList2, arrayList3);
        }
        Iterator<Document> it = arrayList.iterator();
        while (it.hasNext()) {
            Document next = it.next();
            if (TextUtils.isEmpty(next.mo32375B()) && !TextUtils.isEmpty(next.mo32475p())) {
                arrayList2.add(C8200i.m33446a(next));
                arrayList3.add(C8200i.m33447a(next, 3));
            }
        }
        return new Pair<>(arrayList2, arrayList3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m34375a(ArrayList arrayList, String str) throws Exception {
        C8153a.m32844b().mo31587a(str, C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 3));
    }
}
