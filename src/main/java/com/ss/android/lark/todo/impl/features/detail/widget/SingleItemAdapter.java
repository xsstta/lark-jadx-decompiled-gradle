package com.ss.android.lark.todo.impl.features.detail.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/widget/SingleItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/todo/impl/features/detail/widget/SingleItemAdapter$InnerHolder;", "contentView", "Landroid/view/View;", "(Landroid/view/View;)V", "currentWrapper", "Landroid/view/ViewGroup;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "viewType", "Companion", "InnerHolder", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.widget.c */
public final class SingleItemAdapter extends RecyclerView.Adapter<InnerHolder> {

    /* renamed from: a */
    public static final Companion f140216a = new Companion(null);

    /* renamed from: b */
    private ViewGroup f140217b;

    /* renamed from: c */
    private final View f140218c;

    /* renamed from: a */
    public void onBindViewHolder(InnerHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/widget/SingleItemAdapter$Companion;", "", "()V", "wrap", "Lcom/ss/android/lark/todo/impl/features/detail/widget/SingleItemAdapter;", "view", "Landroid/view/View;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.widget.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final SingleItemAdapter mo193097a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            return new SingleItemAdapter(view);
        }
    }

    public SingleItemAdapter(View view) {
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        this.f140218c = view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/widget/SingleItemAdapter$InnerHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "wrapper", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "getWrapper", "()Landroid/view/ViewGroup;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.widget.c$b */
    public static final class InnerHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ViewGroup f140219a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InnerHolder(ViewGroup viewGroup) {
            super(viewGroup);
            Intrinsics.checkParameterIsNotNull(viewGroup, "wrapper");
            this.f140219a = viewGroup;
            setIsRecyclable(false);
        }
    }

    /* renamed from: a */
    public InnerHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        FrameLayout frameLayout = new FrameLayout(this.f140218c.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ViewGroup viewGroup2 = this.f140217b;
        if (viewGroup2 != null) {
            viewGroup2.removeViewInLayout(this.f140218c);
            viewGroup2.endViewTransition(this.f140218c);
        }
        if (this.f140218c.getParent() == null) {
            frameLayout.addView(this.f140218c);
        }
        FrameLayout frameLayout2 = frameLayout;
        this.f140217b = frameLayout2;
        return new InnerHolder(frameLayout2);
    }
}
