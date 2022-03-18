package com.bytedance.ee.bear.list;

import com.bytedance.ee.bear.list.create.DocumentCreateInfoAdapter;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.list.-$$Lambda$-86TVNkgoyn5KFtGikcKhPnwQC0  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$86TVNkgoyn5KFtGikcKhPnwQC0 implements Function {
    public static final /* synthetic */ $$Lambda$86TVNkgoyn5KFtGikcKhPnwQC0 INSTANCE = new $$Lambda$86TVNkgoyn5KFtGikcKhPnwQC0();

    private /* synthetic */ $$Lambda$86TVNkgoyn5KFtGikcKhPnwQC0() {
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return ((DocumentCreateInfoAdapter) obj).toDocumentCreateInfo();
    }
}
