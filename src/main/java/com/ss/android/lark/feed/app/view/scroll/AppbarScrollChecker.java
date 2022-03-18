package com.ss.android.lark.feed.app.view.scroll;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/feed/app/view/scroll/AppbarScrollChecker;", "", "dataRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dependency", "Lcom/ss/android/lark/feed/app/view/scroll/AppbarScrollChecker$AppbarScrollCheckerDependency;", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/ss/android/lark/feed/app/view/scroll/AppbarScrollChecker$AppbarScrollCheckerDependency;)V", "mLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "checkAppbarStatus", "", "isRecyclerViewItemAllShown", "", "AppbarScrollCheckerDependency", "Companion", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.view.scroll.a */
public final class AppbarScrollChecker {

    /* renamed from: a */
    public static final Companion f97596a = new Companion(null);

    /* renamed from: b */
    private final LinearLayoutManager f97597b;

    /* renamed from: c */
    private final RecyclerView f97598c;

    /* renamed from: d */
    private final AppbarScrollCheckerDependency f97599d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/feed/app/view/scroll/AppbarScrollChecker$AppbarScrollCheckerDependency;", "", "getDataSpace", "", "onAppBarStateChange", "", "enable", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.scroll.a$a */
    public interface AppbarScrollCheckerDependency {
        /* renamed from: a */
        int mo139001a();

        /* renamed from: a */
        void mo139002a(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/feed/app/view/scroll/AppbarScrollChecker$Companion;", "", "()V", "TAG", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.scroll.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo139081a() {
        if (m149461b()) {
            this.f97599d.mo139002a(false);
        } else {
            this.f97599d.mo139002a(true);
        }
    }

    /* renamed from: b */
    private final boolean m149461b() {
        RecyclerView.Adapter adapter = this.f97598c.getAdapter();
        if (adapter == null) {
            return true;
        }
        Intrinsics.checkExpressionValueIsNotNull(adapter, "dataRecyclerView.adapter ?: return true");
        int findFirstCompletelyVisibleItemPosition = this.f97597b.findFirstCompletelyVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = this.f97597b.findLastCompletelyVisibleItemPosition();
        if (findFirstCompletelyVisibleItemPosition == -1 && findLastCompletelyVisibleItemPosition == -1) {
            Log.m165379d("AppbarScrollChecker", "disable appbarLayout: recyclerview item is empty");
            return true;
        }
        View childAt = this.f97597b.getChildAt(findFirstCompletelyVisibleItemPosition);
        if (childAt != null) {
            childAt.getHeight();
            adapter.getItemCount();
            this.f97599d.mo139001a();
            if (findFirstCompletelyVisibleItemPosition == 0 && childAt.getHeight() * adapter.getItemCount() <= this.f97599d.mo139001a()) {
                Log.m165379d("AppbarScrollChecker", "disable appbarLayout: recyclerview item is not enough");
                return true;
            }
        }
        Log.m165379d("AppbarScrollChecker", "enable appbarLayout");
        return false;
    }

    public AppbarScrollChecker(RecyclerView recyclerView, AppbarScrollCheckerDependency aVar) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "dataRecyclerView");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f97598c = recyclerView;
        this.f97599d = aVar;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            this.f97597b = (LinearLayoutManager) layoutManager;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }
}
