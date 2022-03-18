package com.bytedance.ee.bear.net;

import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.net.-$$Lambda$mBnQdinWk976tso0Glo1KxmT75Y  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$mBnQdinWk976tso0Glo1KxmT75Y implements Function {
    public static final /* synthetic */ $$Lambda$mBnQdinWk976tso0Glo1KxmT75Y INSTANCE = new $$Lambda$mBnQdinWk976tso0Glo1KxmT75Y();

    private /* synthetic */ $$Lambda$mBnQdinWk976tso0Glo1KxmT75Y() {
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return ((RawServerResult) obj).getJson();
    }
}
