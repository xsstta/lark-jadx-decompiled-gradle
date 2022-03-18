package com.ss.android.lark.moments.impl.feed.model;

import androidx.lifecycle.C1177w;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u000bR\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/DataCacheLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "()V", "mDataCache", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "postValue", "", "value", "(Ljava/lang/Object;)V", "setValue", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.a */
public final class DataCacheLiveData<T> extends C1177w<T> {

    /* renamed from: a */
    private T f119934a;

    @Override // androidx.lifecycle.LiveData
    /* renamed from: b */
    public T mo5927b() {
        return this.f119934a;
    }

    @Override // androidx.lifecycle.C1177w, androidx.lifecycle.LiveData
    /* renamed from: a */
    public void mo5926a(T t) {
        this.f119934a = t;
        super.mo5926a((Object) t);
    }

    @Override // androidx.lifecycle.C1177w, androidx.lifecycle.LiveData
    /* renamed from: b */
    public void mo5929b(T t) {
        this.f119934a = t;
        super.mo5929b((Object) t);
    }
}
