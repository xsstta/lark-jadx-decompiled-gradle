package com.ss.android.lark.contact.feat.contact_external.view;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"com/ss/android/lark/contact/feat/contact_external/view/IndexRecyclerViewAdapter$1", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "remove", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class IndexRecyclerViewAdapter$1 extends ArrayList<DATA> {
    final /* synthetic */ IndexRecyclerViewAdapter this$0;

    public int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    public void clear() {
        this.this$0.f91687b.clear();
        super.clear();
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    IndexRecyclerViewAdapter$1(IndexRecyclerViewAdapter dVar) {
        this.this$0 = dVar;
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public final DATA remove(int i) {
        return (DATA) removeAt(i);
    }

    public Object removeAt(int i) {
        return super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.ArrayList
    public boolean addAll(Collection<? extends DATA> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        boolean addAll = super.addAll(collection);
        this.this$0.mo130863a();
        return addAll;
    }

    @Override // java.util.List, java.util.ArrayList
    public boolean remove(Object obj) {
        boolean remove = super.remove(obj);
        this.this$0.mo130863a();
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.util.ArrayList
    public boolean add(DATA data) {
        boolean add = super.add(data);
        this.this$0.mo130863a();
        return add;
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public void add(int i, DATA data) {
        this.this$0.mo130863a();
        super.add(i, data);
    }
}
