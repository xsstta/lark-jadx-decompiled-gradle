package com.bytedance.ee.bear.wikiv2.wikitreev2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/DoFavoriteEvent;", "", "spaceId", "", "wikiToken", "switchOn", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getSpaceId", "()Ljava/lang/String;", "getSwitchOn", "()Z", "getWikiToken", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a */
public final class DoFavoriteEvent {

    /* renamed from: a */
    private final String f33254a;

    /* renamed from: b */
    private final String f33255b;

    /* renamed from: c */
    private final boolean f33256c;

    /* renamed from: a */
    public final String mo47239a() {
        return this.f33254a;
    }

    /* renamed from: b */
    public final String mo47240b() {
        return this.f33255b;
    }

    /* renamed from: c */
    public final boolean mo47241c() {
        return this.f33256c;
    }

    public DoFavoriteEvent(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        Intrinsics.checkParameterIsNotNull(str2, "wikiToken");
        this.f33254a = str;
        this.f33255b = str2;
        this.f33256c = z;
    }
}
