package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Loading;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Result;", "action", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiAction;", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiAction;)V", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.c */
public final class Loading extends Result {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Loading(WikiAction wikiAction) {
        super(wikiAction, null);
        Intrinsics.checkParameterIsNotNull(wikiAction, "action");
    }
}
