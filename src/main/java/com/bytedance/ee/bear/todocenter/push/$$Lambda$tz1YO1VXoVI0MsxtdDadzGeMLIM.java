package com.bytedance.ee.bear.todocenter.push;

import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.todocenter.push.-$$Lambda$tz1YO1VXoVI0MsxtdDadzGeMLIM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$tz1YO1VXoVI0MsxtdDadzGeMLIM implements Consumer {
    public static final /* synthetic */ $$Lambda$tz1YO1VXoVI0MsxtdDadzGeMLIM INSTANCE = new $$Lambda$tz1YO1VXoVI0MsxtdDadzGeMLIM();

    private /* synthetic */ $$Lambda$tz1YO1VXoVI0MsxtdDadzGeMLIM() {
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        ((AbstractC11711d) obj).unregisterTodoPushListener();
    }
}
