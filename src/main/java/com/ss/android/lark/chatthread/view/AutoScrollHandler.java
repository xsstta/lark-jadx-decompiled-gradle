package com.ss.android.lark.chatthread.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004J\u0006\u0010\f\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chatthread/view/AutoScrollHandler;", "", "()V", "mAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "mObserver", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "attach", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "detach", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatthread.view.a */
public final class AutoScrollHandler {

    /* renamed from: a */
    private RecyclerView.Adapter<?> f90893a;

    /* renamed from: b */
    private RecyclerView.AdapterDataObserver f90894b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chatthread/view/AutoScrollHandler$attach$1", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onItemRangeInserted", "", "positionStart", "", "itemCount", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.a$a */
    public static final class C35192a extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f90895a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView.Adapter f90896b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatthread.view.a$a$a */
        static final class RunnableC35193a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35192a f90897a;

            RunnableC35193a(C35192a aVar) {
                this.f90897a = aVar;
            }

            public final void run() {
                this.f90897a.f90895a.smoothScrollToPosition(this.f90897a.f90896b.getItemCount() - 1);
            }
        }

        C35192a(RecyclerView recyclerView, RecyclerView.Adapter adapter) {
            this.f90895a = recyclerView;
            this.f90896b = adapter;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f90895a.getLayoutManager();
            if (linearLayoutManager == null) {
                Intrinsics.throwNpe();
            }
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (findLastVisibleItemPosition != -1 && findLastVisibleItemPosition >= i - 1 && i + i2 == this.f90896b.getItemCount()) {
                this.f90895a.postDelayed(new RunnableC35193a(this), 500);
            }
        }
    }

    /* renamed from: a */
    public final void mo129629a() {
        RecyclerView.Adapter<?> adapter = this.f90893a;
        if (adapter != null) {
            RecyclerView.AdapterDataObserver adapterDataObserver = this.f90894b;
            if (adapterDataObserver != null) {
                adapter.unregisterAdapterDataObserver(adapterDataObserver);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: a */
    public final void mo129630a(RecyclerView recyclerView, RecyclerView.Adapter<?> adapter) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        this.f90893a = adapter;
        C35192a aVar = new C35192a(recyclerView, adapter);
        this.f90894b = aVar;
        if (aVar != null) {
            adapter.registerAdapterDataObserver(aVar);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
