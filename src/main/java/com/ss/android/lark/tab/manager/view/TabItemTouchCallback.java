package com.ss.android.lark.tab.manager.view;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.p943f.p944a.AbstractC20983m;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/tab/manager/view/TabItemTouchCallback;", "Lcom/ss/android/lark/tab/manager/view/TranslationZDragCallback;", "adapter", "Lcom/ss/android/lark/tab/manager/view/TabItemTouchCallback$ItemTouchAdapterImpl;", "(Lcom/ss/android/lark/tab/manager/view/TabItemTouchCallback$ItemTouchAdapterImpl;)V", "getAdapter", "()Lcom/ss/android/lark/tab/manager/view/TabItemTouchCallback$ItemTouchAdapterImpl;", "getMovementFlags", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "isLongPressDragEnabled", "", "onMove", ShareHitPoint.f121868c, "target", "onSwiped", "", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "ItemDragType", "ItemTouchAdapterImpl", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class TabItemTouchCallback extends TranslationZDragCallback {

    /* renamed from: b */
    private final ItemTouchAdapterImpl f136388b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/tab/manager/view/TabItemTouchCallback$ItemDragType;", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ItemDragType {
        public static final Companion Companion = Companion.f136389a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/tab/manager/view/TabItemTouchCallback$ItemDragType$Companion;", "", "()V", "DRAG_ABLE", "", "UN_DRAG_ABLE", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.tab.manager.view.TabItemTouchCallback$ItemDragType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f136389a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/tab/manager/view/TabItemTouchCallback$ItemTouchAdapterImpl;", "", "autoOpenDrag", "", "onItemMove", "", "fromPosition", "", "toPosition", "onStartDrag", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.view.TabItemTouchCallback$a */
    public interface ItemTouchAdapterImpl {
        /* renamed from: a */
        void mo188355a(int i, int i2);

        /* renamed from: a */
        boolean mo188356a();

        /* renamed from: b */
        void mo188357b();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public void mo6575a(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public boolean mo6577a() {
        return this.f136388b.mo188356a();
    }

    public TabItemTouchCallback(ItemTouchAdapterImpl aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "adapter");
        this.f136388b = aVar;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a, androidx.recyclerview.widget.ItemTouchHelper.AbstractC1309d
    /* renamed from: a */
    public int mo6570a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int i;
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) || (layoutManager instanceof StaggeredGridLayoutManager)) {
            i = 15;
        } else {
            i = 3;
        }
        return AbstractC20983m.m5979b(i, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public boolean mo6586b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(viewHolder, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(viewHolder2, "target");
        if (viewHolder.getItemViewType() == 1 || viewHolder2.getItemViewType() == 1 || viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
            return false;
        }
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (adapterPosition < adapterPosition2) {
            this.f136388b.mo188357b();
            while (adapterPosition < adapterPosition2) {
                int i = adapterPosition + 1;
                this.f136388b.mo188355a(adapterPosition, i);
                adapterPosition = i;
            }
        } else {
            this.f136388b.mo188357b();
            int i2 = adapterPosition2 + 1;
            if (adapterPosition >= i2) {
                while (true) {
                    this.f136388b.mo188355a(adapterPosition, adapterPosition - 1);
                    if (adapterPosition == i2) {
                        break;
                    }
                    adapterPosition--;
                }
            }
        }
        return true;
    }
}
