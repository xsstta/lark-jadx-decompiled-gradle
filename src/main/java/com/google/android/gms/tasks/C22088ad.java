package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.ad */
public final class C22088ad implements Continuation<Void, List<TResult>> {

    /* renamed from: a */
    private final /* synthetic */ Collection f53733a;

    C22088ad(Collection collection) {
        this.f53733a = collection;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.tasks.Task] */
    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task<Void> task) throws Exception {
        if (this.f53733a.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Task task2 : this.f53733a) {
            arrayList.add(task2.getResult());
        }
        return arrayList;
    }
}
