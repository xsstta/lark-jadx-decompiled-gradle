package com.ss.android.lark.mail.impl.home.threadlist;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mail/impl/home/threadlist/ThreadListComponent$setupRecyclerView$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "onItemsChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ThreadListComponent$setupRecyclerView$1 extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ ThreadListComponent f108394a;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onItemsChanged(recyclerView);
        C42593a aVar = this.f108394a.f108473e;
        if (aVar == null) {
            return;
        }
        if (aVar.mo153120c() <= 0) {
            this.f108394a.mo153185c().mo153151d().setVisible(false);
        } else {
            this.f108394a.mo153185c().mo153151d().setVisible(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ThreadListComponent$setupRecyclerView$1(ThreadListComponent bVar, Context context, int i, boolean z) {
        super(context, i, z);
        this.f108394a = bVar;
    }
}
