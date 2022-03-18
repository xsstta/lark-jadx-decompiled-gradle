package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.ae */
public final class C22089ae implements Continuation<Void, Task<List<Task<?>>>> {

    /* renamed from: a */
    private final /* synthetic */ Collection f53734a;

    C22089ae(Collection collection) {
        this.f53734a = collection;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.tasks.Task] */
    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<List<Task<?>>> then(Task<Void> task) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f53734a);
        return Tasks.forResult(arrayList);
    }
}
