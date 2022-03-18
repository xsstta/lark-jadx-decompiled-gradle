package com.bytedance.ies.xbridge.model.collections.defaultimpl;

import com.bytedance.ies.xbridge.XKeyIterator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ies/xbridge/model/collections/defaultimpl/DefaultXKeyIteratorImpl;", "Lcom/bytedance/ies/xbridge/XKeyIterator;", "origin", "", "", "(Ljava/util/Iterator;)V", "hasNextKey", "", "nextKey", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.d.a.a.b */
public final class DefaultXKeyIteratorImpl implements XKeyIterator {

    /* renamed from: a */
    private final Iterator<String> f38023a;

    @Override // com.bytedance.ies.xbridge.XKeyIterator
    /* renamed from: a */
    public boolean mo53089a() {
        return this.f38023a.hasNext();
    }

    @Override // com.bytedance.ies.xbridge.XKeyIterator
    /* renamed from: b */
    public String mo53090b() {
        return this.f38023a.next();
    }

    public DefaultXKeyIteratorImpl(Iterator<String> it) {
        Intrinsics.checkParameterIsNotNull(it, "origin");
        this.f38023a = it;
    }
}
