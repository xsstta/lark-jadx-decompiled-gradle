package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmCommentIndicatorView;", "Landroid/widget/FrameLayout;", "mContext", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "def", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/ss/android/lark/mm/widget/MmCommentIndicatorView$MmCommentIndicatorAdapter;", "currentIndex", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getCurrentIndex", "setCurrentIndex", "", "setTotalCount", "totalCount", "MmCommentIndicatorAdapter", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmCommentIndicatorView extends FrameLayout {

    /* renamed from: a */
    private final RecyclerView f118709a;

    /* renamed from: b */
    private MmCommentIndicatorAdapter f118710b;

    /* renamed from: c */
    private LinearLayoutManager f118711c;

    /* renamed from: d */
    private int f118712d;

    /* renamed from: e */
    private final Context f118713e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmCommentIndicatorView$MmCommentIndicatorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "currentIndex", "", "lastIndex", "totalCount", "getItemCount", "makeIndicator", "Landroid/view/View;", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCurrentIndex", "setTotalCount", "MmCommentIndicatorViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmCommentIndicatorView$a */
    public static final class MmCommentIndicatorAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a */
        private int f118714a;

        /* renamed from: b */
        private int f118715b;

        /* renamed from: c */
        private int f118716c = -1;

        /* renamed from: d */
        private final Context f118717d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmCommentIndicatorView$MmCommentIndicatorAdapter$MmCommentIndicatorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "contentView", "Landroid/view/View;", "(Landroid/view/View;)V", "getContentView", "()Landroid/view/View;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.widget.MmCommentIndicatorView$a$a */
        public static final class MmCommentIndicatorViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            private final View f118718a;

            /* renamed from: a */
            public final View mo165582a() {
                return this.f118718a;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public MmCommentIndicatorViewHolder(View view) {
                super(view);
                Intrinsics.checkParameterIsNotNull(view, "contentView");
                this.f118718a = view;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f118714a;
        }

        /* renamed from: a */
        private final View m186633a() {
            View view = new View(this.f118717d);
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            view.setBackground(UDIconUtils.getIconDrawable(context, R.drawable.mm_comment_list_indicator_selector));
            return view;
        }

        /* renamed from: a */
        public final void mo165580a(int i) {
            this.f118714a = i;
            notifyDataSetChanged();
        }

        public MmCommentIndicatorAdapter(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f118717d = context;
        }

        /* renamed from: b */
        public final void mo165581b(int i) {
            this.f118715b = i;
            notifyItemChanged(i);
            notifyItemChanged(this.f118716c);
            this.f118716c = this.f118715b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            return new MmCommentIndicatorViewHolder(m186633a());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
            if (viewHolder instanceof MmCommentIndicatorViewHolder) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(UIUtils.dp2px(this.f118717d, 16.0f), UIUtils.dp2px(this.f118717d, 4.0f));
                marginLayoutParams.setMarginEnd(UIUtils.dp2px(this.f118717d, 8.0f));
                View a = ((MmCommentIndicatorViewHolder) viewHolder).mo165582a();
                if (i == this.f118715b) {
                    z = true;
                } else {
                    z = false;
                }
                a.setActivated(z);
                View view = viewHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public MmCommentIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getCurrentIndex() {
        return this.f118712d;
    }

    public final void setTotalCount(int i) {
        this.f118710b.mo165580a(i);
    }

    public final void setCurrentIndex(int i) {
        int i2;
        this.f118712d = i;
        this.f118710b.mo165581b(i);
        if (this.f118711c.findLastCompletelyVisibleItemPosition() <= i && i <= this.f118710b.getItemCount() - 1) {
            this.f118711c.scrollToPositionWithOffset(i - 2, 0);
        }
        if (this.f118711c.findFirstCompletelyVisibleItemPosition() >= i) {
            if (i == 0) {
                i2 = 0;
            } else {
                i2 = i - 1;
            }
            this.f118711c.scrollToPositionWithOffset(i2, 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmCommentIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f118713e = context;
        RecyclerView recyclerView = new RecyclerView(context);
        this.f118709a = recyclerView;
        MmCommentIndicatorAdapter aVar = new MmCommentIndicatorAdapter(context);
        this.f118710b = aVar;
        recyclerView.setAdapter(aVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.f118711c = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        addView(recyclerView, layoutParams);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MmCommentIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
