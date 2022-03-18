package com.ss.android.lark.searchcommon.view;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.reporter.SearchConsistencyReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u000e*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchRecyclerViewBaseAdapter;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Data", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "()V", "getTopNRptId", "", "position", "", "onBindViewHolder", "", "holder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.i */
public abstract class SearchRecyclerViewBaseAdapter<VH extends RecyclerView.ViewHolder, Data> extends LarkRecyclerViewBaseAdapter<VH, Data> {

    /* renamed from: b */
    public static final Companion f133799b = new Companion(null);

    /* renamed from: c */
    public abstract String mo159265c(int i);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchRecyclerViewBaseAdapter$Companion;", "", "()V", "TAG", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH vh, int i) {
        Intrinsics.checkParameterIsNotNull(vh, "holder");
        Log.m165379d("LarkSearch.Common.SearchRecyclerViewBaseAdapter", "onBindViewHolder, position: " + i);
        String c = mo159265c(i);
        if (c != null) {
            SearchConsistencyReporter.f133153a.mo183819a(i, c);
        }
    }
}
