package com.larksuite.component.universe_design.breadcrumb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0006\u0010\u0013\u001a\u00020\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0002J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tH\u0016J\u0016\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ\u0010\u0010 \u001a\u00020\u000e2\b\b\u0001\u0010!\u001a\u00020\tJ\u0014\u0010\"\u001a\u00020\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0$J\u0016\u0010%\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/larksuite/component/universe_design/breadcrumb/UDBreadcrumbAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/larksuite/component/universe_design/breadcrumb/UDBreadcrumbAdapter$BreadcrumbViewHolder;", "context", "Landroid/content/Context;", "onClickListener", "Lcom/larksuite/component/universe_design/breadcrumb/OnBreadcrumbItemClickListener;", "(Landroid/content/Context;Lcom/larksuite/component/universe_design/breadcrumb/OnBreadcrumbItemClickListener;)V", "itemMaxWidth", "", "items", "", "", "addItem", "", "item", "createItemView", "Landroid/view/View;", "getItemCount", "getItemMaxWidth", "isLastItem", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItems", "index", "count", "setItemMaxWidth", "maxWidth", "setItems", "itemList", "", "updateItem", "BreadcrumbViewHolder", "universe-ui-breadcrumb_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.breadcrumb.b */
public final class UDBreadcrumbAdapter extends RecyclerView.Adapter<BreadcrumbViewHolder> {

    /* renamed from: a */
    public final OnBreadcrumbItemClickListener f63087a;

    /* renamed from: b */
    private final List<String> f63088b = new ArrayList();

    /* renamed from: c */
    private int f63089c = Integer.MAX_VALUE;

    /* renamed from: d */
    private final Context f63090d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/breadcrumb/UDBreadcrumbAdapter$BreadcrumbViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "labelTv", "Landroid/widget/TextView;", "getLabelTv", "()Landroid/widget/TextView;", "universe-ui-breadcrumb_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.breadcrumb.b$a */
    public static final class BreadcrumbViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final TextView f63091a;

        /* renamed from: a */
        public final TextView mo90300a() {
            return this.f63091a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BreadcrumbViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(R.id.breadcrumb_label_tv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.breadcrumb_label_tv)");
            this.f63091a = (TextView) findViewById;
        }
    }

    /* renamed from: a */
    public final int mo90293a() {
        return this.f63089c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f63088b.size();
    }

    /* renamed from: b */
    private final View m92447b() {
        TextView textView = new TextView(this.f63090d, null, 0, R.style.UDBreadcrumbItemLabel);
        textView.setId(R.id.breadcrumb_label_tv);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setMaxWidth(this.f63089c);
        LinearLayout linearLayout = new LinearLayout(this.f63090d, null, 0, R.style.UDBreadcrumbItem);
        Context context = linearLayout.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, UDDimenUtils.m93313d(context, R.dimen.ud_breadcrumb_item_height)));
        linearLayout.setOrientation(0);
        linearLayout.addView(textView);
        return linearLayout;
    }

    /* renamed from: a */
    public final void mo90295a(int i) {
        this.f63089c = i;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.breadcrumb.b$b */
    public static final class View$OnClickListenerC25716b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDBreadcrumbAdapter f63092a;

        /* renamed from: b */
        final /* synthetic */ int f63093b;

        View$OnClickListenerC25716b(UDBreadcrumbAdapter bVar, int i) {
            this.f63092a = bVar;
            this.f63093b = i;
        }

        public final void onClick(View view) {
            this.f63092a.f63087a.onItemClick(this.f63093b);
        }
    }

    /* renamed from: b */
    private final boolean m92448b(int i) {
        if (i != getItemCount() - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo90299a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "itemList");
        this.f63088b.clear();
        this.f63088b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo90298a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "item");
        this.f63088b.add(str);
        notifyItemInserted(CollectionsKt.getLastIndex(this.f63088b));
        if (getItemCount() > 1) {
            notifyItemChanged(CollectionsKt.getLastIndex(this.f63088b) - 1);
        }
    }

    /* renamed from: a */
    public BreadcrumbViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new BreadcrumbViewHolder(m92447b());
    }

    public UDBreadcrumbAdapter(Context context, OnBreadcrumbItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "onClickListener");
        this.f63090d = context;
        this.f63087a = aVar;
    }

    /* renamed from: a */
    public final void mo90296a(int i, int i2) {
        boolean z;
        if (i + i2 == getItemCount()) {
            z = true;
        } else {
            z = false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            this.f63088b.remove(i);
        }
        notifyItemRangeRemoved(i, i2);
        if (z) {
            notifyItemChanged(getItemCount() - 1);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(BreadcrumbViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        aVar.mo90300a().setText(this.f63088b.get(i));
        View view = aVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        view.setEnabled(m92448b(i));
        aVar.mo90300a().setEnabled(m92448b(i));
        aVar.itemView.setOnClickListener(new View$OnClickListenerC25716b(this, i));
        if (aVar.mo90300a().getMaxWidth() != this.f63089c) {
            aVar.mo90300a().setMaxWidth(this.f63089c);
        }
    }
}
