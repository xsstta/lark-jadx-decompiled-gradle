package com.ss.android.lark.forward.impl.parser;

import com.ss.android.lark.forward.dto.C38389a;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/forward/impl/parser/ParserFactory;", "", "()V", "feedPreviewParser", "Lcom/ss/android/lark/forward/impl/parser/FeedPreviewParser;", "parse", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "feedPreview", "Lcom/ss/android/lark/forward/dto/FeedSourceData;", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.forward.impl.b.b */
public final class ParserFactory {

    /* renamed from: a */
    private final FeedPreviewParser f98776a = new FeedPreviewParser();

    /* renamed from: a */
    public final SearchBaseInfo mo140965a(C38389a aVar) {
        return this.f98776a.mo140964a(aVar);
    }
}
