package com.bytedance.ies.xbridge.model.context;

import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ies/xbridge/model/context/XWeakContextHolder;", "T", "Lcom/bytedance/ies/xbridge/model/context/IXContextProvider;", "t", "(Ljava/lang/Object;)V", "ref", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "provideInstance", "()Ljava/lang/Object;", "release", "", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.d.b.d */
public final class XWeakContextHolder<T> implements IXContextProvider<T> {

    /* renamed from: a */
    private WeakReference<T> f38029a;

    @Override // com.bytedance.ies.xbridge.api.IReleasable
    /* renamed from: a */
    public void mo52927a() {
        WeakReference<T> weakReference = this.f38029a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f38029a = null;
    }

    @Override // com.bytedance.ies.xbridge.model.context.IXContextProvider
    /* renamed from: b */
    public T mo53114b() {
        WeakReference<T> weakReference = this.f38029a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public XWeakContextHolder(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.f38029a = weakReference;
    }
}
