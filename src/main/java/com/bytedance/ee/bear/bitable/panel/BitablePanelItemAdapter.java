package com.bytedance.ee.bear.bitable.panel;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.panel.BitablePanelModel;
import com.bytedance.ee.bear.facade.common.widget.RoundFrameLayout;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\t2\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0014\u0010\u0017\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/panel/BitablePanelItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelItemAdapter$ViewsVH;", "()V", "itemList", "", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelModel$BitablePanelItem;", "onItemClickListener", "Lkotlin/Function1;", "", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateItemList", "list", "", "ViewsVH", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.panel.b */
public final class BitablePanelItemAdapter extends RecyclerView.Adapter<ViewsVH> {

    /* renamed from: a */
    private List<BitablePanelModel.BitablePanelItem> f14133a = new ArrayList();

    /* renamed from: b */
    private Function1<? super BitablePanelModel.BitablePanelItem, Unit> f14134b;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.bytedance.ee.bear.bitable.panel.BitablePanelModel$BitablePanelItem, kotlin.Unit>, kotlin.jvm.functions.Function1<com.bytedance.ee.bear.bitable.panel.BitablePanelModel$BitablePanelItem, kotlin.Unit> */
    /* renamed from: a */
    public final Function1<BitablePanelModel.BitablePanelItem, Unit> mo18846a() {
        return this.f14134b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f14133a.size();
    }

    /* renamed from: a */
    public final void mo18849a(Function1<? super BitablePanelModel.BitablePanelItem, Unit> function1) {
        this.f14134b = function1;
    }

    /* renamed from: a */
    public final void mo18848a(List<? extends BitablePanelModel.BitablePanelItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        if (!Intrinsics.areEqual(this.f14133a, list)) {
            this.f14133a.clear();
            this.f14133a.addAll(list);
            notifyDataSetChanged();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/bitable/panel/BitablePanelItemAdapter$ViewsVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/bitable/panel/BitablePanelItemAdapter;Landroid/view/View;)V", "container", "Lcom/bytedance/ee/bear/facade/common/widget/RoundFrameLayout;", "divider", "leftIconIv", "Landroid/widget/ImageView;", "titleTv", "Landroid/widget/TextView;", "bindContainerStyle", "", "viewItem", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelModel$BitablePanelItem;", "isLastItem", "", "bindLeftIcon", "context", "Landroid/content/Context;", "bindText", "bindView", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.b$a */
    public final class ViewsVH extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public RoundFrameLayout f14135a;

        /* renamed from: b */
        final /* synthetic */ BitablePanelItemAdapter f14136b;

        /* renamed from: c */
        private final TextView f14137c;

        /* renamed from: d */
        private final ImageView f14138d;

        /* renamed from: e */
        private final View f14139e;

        /* renamed from: a */
        public final void mo18850a(BitablePanelModel.BitablePanelItem bitablePanelItem, boolean z) {
            Intrinsics.checkParameterIsNotNull(bitablePanelItem, "viewItem");
            Context context = this.f14135a.getContext();
            m19890b(bitablePanelItem, z);
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            m19888a(context, bitablePanelItem);
            m19889b(context, bitablePanelItem);
        }

        /* renamed from: b */
        private final void m19889b(Context context, BitablePanelModel.BitablePanelItem bitablePanelItem) {
            int i;
            this.f14137c.setText(bitablePanelItem.getText());
            TextView textView = this.f14137c;
            Resources resources = context.getResources();
            if (bitablePanelItem.isActive()) {
                i = R.color.primary_pri_500;
            } else {
                i = R.color.text_title;
            }
            textView.setTextColor(ColorStateList.valueOf(resources.getColor(i)));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewsVH(BitablePanelItemAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f14136b = bVar;
            View findViewById = view.findViewById(R.id.item_container);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.item_container)");
            this.f14135a = (RoundFrameLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tv_view_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.tv_view_name)");
            this.f14137c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.iv_view_type);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.iv_view_type)");
            this.f14138d = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.v_divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.v_divider)");
            this.f14139e = findViewById4;
            this.f14135a.setOnClickListener(new AbstractView$OnClickListenerC11839e(this) {
                /* class com.bytedance.ee.bear.bitable.panel.BitablePanelItemAdapter.ViewsVH.C48131 */

                /* renamed from: a */
                final /* synthetic */ ViewsVH f14140a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f14140a = r1;
                }

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    Object tag = this.f14140a.f14135a.getTag();
                    if (tag != null) {
                        BitablePanelModel.BitablePanelItem bitablePanelItem = (BitablePanelModel.BitablePanelItem) tag;
                        Function1<BitablePanelModel.BitablePanelItem, Unit> a = this.f14140a.f14136b.mo18846a();
                        if (a != null) {
                            a.invoke(bitablePanelItem);
                            return;
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.bitable.panel.BitablePanelModel.BitablePanelItem");
                }
            });
        }

        /* renamed from: a */
        private final void m19888a(Context context, BitablePanelModel.BitablePanelItem bitablePanelItem) {
            EPanelItemIcon ePanelLeftIcon = bitablePanelItem.getEPanelLeftIcon();
            if (ePanelLeftIcon != null) {
                ColorStateList colorStateList = null;
                if (bitablePanelItem.isActive()) {
                    this.f14138d.setImageResource(ePanelLeftIcon.activeImageRes);
                    ImageView imageView = this.f14138d;
                    if (ePanelLeftIcon.activeImageTintRes > 0) {
                        colorStateList = ColorStateList.valueOf(C13749l.m55755c(context, ePanelLeftIcon.activeImageTintRes));
                    }
                    imageView.setImageTintList(colorStateList);
                } else {
                    this.f14138d.setImageResource(ePanelLeftIcon.inactiveImageRes);
                    ImageView imageView2 = this.f14138d;
                    if (ePanelLeftIcon.inactiveImageTintRes > 0) {
                        colorStateList = ColorStateList.valueOf(C13749l.m55755c(context, ePanelLeftIcon.inactiveImageTintRes));
                    }
                    imageView2.setImageTintList(colorStateList);
                }
                this.f14138d.setVisibility(0);
                return;
            }
            this.f14138d.setVisibility(8);
        }

        /* renamed from: b */
        private final void m19890b(BitablePanelModel.BitablePanelItem bitablePanelItem, boolean z) {
            this.f14135a.setTag(bitablePanelItem);
            int dimensionPixelSize = this.f14135a.getResources().getDimensionPixelSize(R.dimen.space_radius_l);
            ViewGroup.LayoutParams layoutParams = this.f14135a.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int dimensionPixelSize2 = this.f14135a.getResources().getDimensionPixelSize(R.dimen.space_kit_len_16);
            BitablePanelModel.BitablePanelItem.GroupPosition groupPosition = bitablePanelItem.getGroupPosition();
            int i = 0;
            if (groupPosition != null) {
                int i2 = C4814c.f14141a[groupPosition.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (marginLayoutParams != null) {
                            marginLayoutParams.topMargin = 0;
                        }
                        if (marginLayoutParams != null) {
                            marginLayoutParams.bottomMargin = 0;
                        }
                        this.f14139e.setVisibility(0);
                    } else if (i2 == 3) {
                        if (marginLayoutParams != null) {
                            marginLayoutParams.topMargin = 0;
                        }
                        if (marginLayoutParams != null) {
                            if (!z) {
                                dimensionPixelSize2 = 0;
                            }
                            marginLayoutParams.bottomMargin = dimensionPixelSize2;
                        }
                        this.f14139e.setVisibility(8);
                        i = dimensionPixelSize;
                    }
                    dimensionPixelSize = 0;
                } else {
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = dimensionPixelSize2;
                    }
                    if (marginLayoutParams != null) {
                        marginLayoutParams.bottomMargin = 0;
                    }
                    this.f14139e.setVisibility(0);
                }
                this.f14135a.mo30242a(dimensionPixelSize, dimensionPixelSize, i, i);
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = dimensionPixelSize2;
            }
            if (marginLayoutParams != null) {
                if (!z) {
                    dimensionPixelSize2 = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize2;
            }
            this.f14139e.setVisibility(8);
            i = dimensionPixelSize;
            this.f14135a.mo30242a(dimensionPixelSize, dimensionPixelSize, i, i);
        }
    }

    /* renamed from: a */
    public ViewsVH onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bitable_view_list_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…                   false)");
        return new ViewsVH(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewsVH aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (i < this.f14133a.size()) {
            BitablePanelModel.BitablePanelItem bitablePanelItem = this.f14133a.get(i);
            boolean z = true;
            if (i != this.f14133a.size() - 1) {
                z = false;
            }
            aVar.mo18850a(bitablePanelItem, z);
        }
    }
}
