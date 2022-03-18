package com.ss.android.lark.search.redesign.filter;

import com.bytedance.lark.pb.basic.v1.Doc;
import com.ss.android.lark.widget.searchfilter.FilterData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/search/redesign/filter/DocFormatFilterData;", "Lcom/ss/android/lark/widget/searchfilter/FilterData;", "id", "", "(Ljava/lang/String;)V", "formatList", "", "Lcom/bytedance/lark/pb/basic/v1/Doc$Type;", "getFormatList", "()Ljava/util/List;", "setFormatList", "(Ljava/util/List;)V", "isUsable", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.filter.c */
public final class DocFormatFilterData extends FilterData {

    /* renamed from: a */
    private List<Doc.Type> f132702a = new ArrayList();

    /* renamed from: a */
    public final List<Doc.Type> mo183346a() {
        return this.f132702a;
    }

    /* renamed from: b */
    public final boolean mo183347b() {
        return !this.f132702a.isEmpty();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocFormatFilterData(String str) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "id");
    }
}
