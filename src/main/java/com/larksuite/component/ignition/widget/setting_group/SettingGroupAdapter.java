package com.larksuite.component.ignition.widget.setting_group;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\tH\u0002J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0016J\b\u0010\u001c\u001a\u00020\tH\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\tH\u0016J&\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\tH\u0016J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010+\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u00020\nH\u0016J\u0010\u00102\u001a\u00020\u00152\u0006\u0010.\u001a\u00020/H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u00063"}, d2 = {"Lcom/larksuite/component/ignition/widget/setting_group/SettingGroupAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "adapter", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "isItemStateful", "Lkotlin/Function1;", "", "", "()Lkotlin/jvm/functions/Function1;", "setItemStateful", "(Lkotlin/jvm/functions/Function1;)V", "value", "itemBackgroundColorResources", "getItemBackgroundColorResources", "()I", "setItemBackgroundColorResources", "(I)V", "bindBackground", "", "holder", "position", "getItemCount", "getItemId", "", "getItemViewType", "lastItemIndex", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDetachedFromRecyclerView", "onFailedToRecycleView", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "registerAdapterDataObserver", "observer", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "setHasStableIds", "hasStableIds", "unregisterAdapterDataObserver", "ignition-widget-settinggroup_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.component.ignition.widget.setting_group.a */
public final class SettingGroupAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private int f60004a = R.color.bg_setting_group_item;

    /* renamed from: b */
    private Function1<? super Integer, Boolean> f60005b = C24330a.INSTANCE;

    /* renamed from: c */
    private final Context f60006c;

    /* renamed from: d */
    private final RecyclerView.Adapter<RecyclerView.ViewHolder> f60007d;

    /* renamed from: a */
    public final int mo87047a() {
        return getItemCount() - 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f60007d.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f60007d.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f60007d.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        this.f60007d.setHasStableIds(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.component.ignition.widget.setting_group.a$a */
    static final class C24330a extends Lambda implements Function1<Integer, Boolean> {
        public static final C24330a INSTANCE = new C24330a();

        C24330a() {
            super(1);
        }

        public final boolean invoke(int i) {
            return true;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(invoke(num.intValue()));
        }
    }

    /* renamed from: a */
    public final void mo87048a(int i) {
        if (this.f60004a != i) {
            this.f60004a = i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        this.f60007d.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        this.f60007d.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        return this.f60007d.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        this.f60007d.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        this.f60007d.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        this.f60007d.onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        Intrinsics.checkParameterIsNotNull(adapterDataObserver, "observer");
        this.f60007d.registerAdapterDataObserver(adapterDataObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        Intrinsics.checkParameterIsNotNull(adapterDataObserver, "observer");
        this.f60007d.unregisterAdapterDataObserver(adapterDataObserver);
    }

    /* renamed from: a */
    public final void mo87049a(Function1<? super Integer, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.f60005b = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        this.f60007d.onBindViewHolder(viewHolder, i);
        m88799a(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        RecyclerView.ViewHolder onCreateViewHolder = this.f60007d.onCreateViewHolder(viewGroup, i);
        Intrinsics.checkExpressionValueIsNotNull(onCreateViewHolder, "adapter.onCreateViewHolder(parent, viewType)");
        return onCreateViewHolder;
    }

    public SettingGroupAdapter(Context context, RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        this.f60006c = context;
        this.f60007d = adapter;
        adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver(this) {
            /* class com.larksuite.component.ignition.widget.setting_group.SettingGroupAdapter.C243291 */

            /* renamed from: a */
            final /* synthetic */ SettingGroupAdapter f60008a;

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                this.f60008a.notifyDataSetChanged();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f60008a = r1;
            }

            /* renamed from: b */
            private final void m88804b(IntRange kVar) {
                if (kVar.mo239410a(this.f60008a.mo87047a()) && kVar.mo239399a() - 1 >= 0) {
                    this.f60008a.notifyItemChanged(kVar.mo239399a() - 1);
                }
            }

            /* renamed from: a */
            private final void m88803a(IntRange kVar) {
                if (kVar.mo239410a(0) && kVar.mo239400b() + 1 < this.f60008a.getItemCount()) {
                    this.f60008a.notifyItemChanged(kVar.mo239400b() + 1);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2) {
                this.f60008a.notifyItemRangeChanged(i, i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
                this.f60008a.notifyItemRangeInserted(i, i2);
                IntRange until = RangesKt.until(i, i2 + i);
                m88803a(until);
                m88804b(until);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i, int i2) {
                this.f60008a.notifyItemRangeRemoved(i, i2);
                IntRange until = RangesKt.until(i, i2 + i);
                m88803a(until);
                m88804b(until);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2, Object obj) {
                this.f60008a.notifyItemRangeChanged(i, i2, obj);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeMoved(int i, int i2, int i3) {
                for (int i4 = 0; i4 < i3; i4++) {
                    this.f60008a.notifyItemMoved(i + i4, i2 + i4);
                }
                IntRange until = RangesKt.until(i, i + i3);
                m88803a(until);
                m88804b(until);
                IntRange until2 = RangesKt.until(i2, i3 + i2);
                m88803a(until2);
                m88804b(until2);
            }
        });
    }

    /* renamed from: a */
    private final void m88799a(RecyclerView.ViewHolder viewHolder, int i) {
        View view = viewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        Drawable background = view.getBackground();
        if (!(background instanceof GradientDrawable)) {
            background = null;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (gradientDrawable == null) {
            gradientDrawable = new GradientDrawable();
            if (this.f60005b.invoke(Integer.valueOf(i)).booleanValue()) {
                gradientDrawable.setColor(UIUtils.getColorStateList(this.f60006c, this.f60004a));
            } else {
                gradientDrawable.setColor(UIUtils.getColor(this.f60006c, this.f60004a));
            }
        }
        SettingGroupUtils.f60020a.mo87061a(gradientDrawable, this.f60006c, i, getItemCount());
        View view2 = viewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        view2.setBackground(gradientDrawable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(list, "payloads");
        this.f60007d.onBindViewHolder(viewHolder, i, list);
        m88799a(viewHolder, i);
    }
}
