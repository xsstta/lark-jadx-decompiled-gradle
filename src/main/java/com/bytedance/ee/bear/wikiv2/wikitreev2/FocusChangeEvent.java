package com.bytedance.ee.bear.wikiv2.wikitreev2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/FocusChangeEvent;", "", "spaceId", "", "wikiToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getSpaceId", "()Ljava/lang/String;", "getWikiToken", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.c */
public final class FocusChangeEvent {

    /* renamed from: a */
    private final String f33290a;

    /* renamed from: b */
    private final String f33291b;

    /* renamed from: a */
    public final String mo47269a() {
        return this.f33290a;
    }

    /* renamed from: b */
    public final String mo47270b() {
        return this.f33291b;
    }

    public FocusChangeEvent(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        Intrinsics.checkParameterIsNotNull(str2, "wikiToken");
        this.f33290a = str;
        this.f33291b = str2;
    }
}
