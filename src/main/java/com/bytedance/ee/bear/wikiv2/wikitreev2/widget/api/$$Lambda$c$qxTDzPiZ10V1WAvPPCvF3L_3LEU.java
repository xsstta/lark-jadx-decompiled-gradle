package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api;

import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetWikiVersionPuller;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.-$$Lambda$c$qxTDzPiZ10V1WAvPPCvF3L_3LEU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$c$qxTDzPiZ10V1WAvPPCvF3L_3LEU implements Function {
    public static final /* synthetic */ $$Lambda$c$qxTDzPiZ10V1WAvPPCvF3L_3LEU INSTANCE = new $$Lambda$c$qxTDzPiZ10V1WAvPPCvF3L_3LEU();

    private /* synthetic */ $$Lambda$c$qxTDzPiZ10V1WAvPPCvF3L_3LEU() {
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return ((GetWikiVersionPuller.Result) obj).version;
    }
}
