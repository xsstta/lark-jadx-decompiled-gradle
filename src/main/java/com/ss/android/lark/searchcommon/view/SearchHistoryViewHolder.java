package com.ss.android.lark.searchcommon.view;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.searchcommon.view.foldtag.FoldTagFlowLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchHistoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "flowLayout", "Lcom/ss/android/lark/searchcommon/view/foldtag/FoldTagFlowLayout;", "itemType", "", "(Lcom/ss/android/lark/searchcommon/view/foldtag/FoldTagFlowLayout;I)V", "getFlowLayout", "()Lcom/ss/android/lark/searchcommon/view/foldtag/FoldTagFlowLayout;", "getItemType", "()I", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.d */
public final class SearchHistoryViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final FoldTagFlowLayout f133705a;

    /* renamed from: b */
    private final int f133706b;

    /* renamed from: a */
    public final FoldTagFlowLayout mo184887a() {
        return this.f133705a;
    }

    /* renamed from: b */
    public final int mo184888b() {
        return this.f133706b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchHistoryViewHolder(FoldTagFlowLayout cVar, int i) {
        super(cVar);
        Intrinsics.checkParameterIsNotNull(cVar, "flowLayout");
        this.f133705a = cVar;
        this.f133706b = i;
    }
}
