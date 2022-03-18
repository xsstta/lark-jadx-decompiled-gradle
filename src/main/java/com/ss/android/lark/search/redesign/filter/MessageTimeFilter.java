package com.ss.android.lark.search.redesign.filter;

import android.util.Pair;
import com.ss.android.lark.widget.searchfilter.FilterData;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR*\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/search/redesign/filter/MessageTimeFilter;", "Lcom/ss/android/lark/widget/searchfilter/FilterData;", "id", "", "(Ljava/lang/String;)V", "timePair", "Landroid/util/Pair;", "Ljava/util/Date;", "getTimePair", "()Landroid/util/Pair;", "setTimePair", "(Landroid/util/Pair;)V", "isUsable", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.filter.n */
public final class MessageTimeFilter extends FilterData {

    /* renamed from: a */
    private Pair<Date, Date> f132715a;

    /* renamed from: a */
    public final Pair<Date, Date> mo183377a() {
        return this.f132715a;
    }

    /* renamed from: b */
    public final boolean mo183379b() {
        if (this.f132715a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo183378a(Pair<Date, Date> pair) {
        this.f132715a = pair;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageTimeFilter(String str) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "id");
    }
}
