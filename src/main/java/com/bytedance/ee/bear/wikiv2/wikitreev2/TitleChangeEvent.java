package com.bytedance.ee.bear.wikiv2.wikitreev2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/TitleChangeEvent;", "", "spaceId", "", "wikiToken", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSpaceId", "()Ljava/lang/String;", "getTitle", "getWikiToken", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.e */
public final class TitleChangeEvent {

    /* renamed from: a */
    private final String f33311a;

    /* renamed from: b */
    private final String f33312b;

    /* renamed from: c */
    private final String f33313c;

    /* renamed from: a */
    public final String mo47303a() {
        return this.f33311a;
    }

    /* renamed from: b */
    public final String mo47304b() {
        return this.f33312b;
    }

    /* renamed from: c */
    public final String mo47305c() {
        return this.f33313c;
    }

    public TitleChangeEvent(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        Intrinsics.checkParameterIsNotNull(str2, "wikiToken");
        Intrinsics.checkParameterIsNotNull(str3, "title");
        this.f33311a = str;
        this.f33312b = str2;
        this.f33313c = str3;
    }
}
