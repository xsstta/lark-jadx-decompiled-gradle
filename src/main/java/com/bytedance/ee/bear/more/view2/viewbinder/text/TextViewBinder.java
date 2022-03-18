package com.bytedance.ee.bear.more.view2.viewbinder.text;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.more.C10208e;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/text/TextViewBinder;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/IMoreViewBinder;", "Lcom/bytedance/ee/bear/more/moreprotocol/ITextMoreItem;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/text/TextViewBinder$TextViewHolder;", "()V", "TAG", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "TextViewHolder", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.view2.b.e.a */
public final class TextViewBinder {

    /* renamed from: a */
    public final String f27720a = "TextViewBinder";

    /* renamed from: a */
    public TextViewHolder mo39235a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.more_item_text, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new TextViewHolder(this, inflate);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J,\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/text/TextViewBinder$TextViewHolder;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/BaseMoreItemViewHolder;", "Lcom/bytedance/ee/bear/more/moreprotocol/ITextMoreItem;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/more/view2/viewbinder/text/TextViewBinder;Landroid/view/View;)V", "onBindViewHolder", "", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "moreItem", "position", "", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.b.e.a$a */
    public final class TextViewHolder extends BaseMoreItemViewHolder<ITextMoreItem> {

        /* renamed from: a */
        final /* synthetic */ TextViewBinder f27721a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.more.view2.b.e.a$a$a */
        public static final class View$OnClickListenerC10259a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ TextViewHolder f27722a;

            /* renamed from: b */
            final /* synthetic */ ITextMoreItem f27723b;

            /* renamed from: c */
            final /* synthetic */ boolean f27724c;

            View$OnClickListenerC10259a(TextViewHolder aVar, ITextMoreItem iTextMoreItem, boolean z) {
                this.f27722a = aVar;
                this.f27723b = iTextMoreItem;
                this.f27724c = z;
            }

            public final void onClick(View view) {
                if (!C13726a.m55676b(this.f27723b.getHost().mo39165b().getActivity())) {
                    C13479a.m54775e(this.f27722a.f27721a.f27720a, "item click, but act not active!!!");
                } else if (this.f27724c) {
                    this.f27723b.onClick();
                } else {
                    View view2 = this.f27722a.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    Toast.showText(view2.getContext(), this.f27723b.getUnableTips(), 0);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TextViewHolder(TextViewBinder aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f27721a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem, int] */
        @Override // com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo39217a(RecyclerView.Adapter adapter, ITextMoreItem iTextMoreItem, int i) {
            mo39236a((RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>>) adapter, iTextMoreItem, i);
        }

        /* renamed from: a */
        public void mo39236a(RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>> adapter, ITextMoreItem iTextMoreItem, int i) {
            boolean z;
            int i2;
            Intrinsics.checkParameterIsNotNull(adapter, "adapter");
            Intrinsics.checkParameterIsNotNull(iTextMoreItem, "moreItem");
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            boolean a = mo39218a(view, adapter, i);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            ((AppCompatImageView) view2.findViewById(R.id.icon)).setImageResource(iTextMoreItem.getIcon());
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView = (TextView) view3.findViewById(R.id.title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.title");
            textView.setText(iTextMoreItem.getTitle());
            boolean isEnable = iTextMoreItem.isEnable();
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            Context context = view4.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            Resources resources = context.getResources();
            if (isEnable) {
                View view5 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                C13747j.m55728a((ImageView) ((AppCompatImageView) view5.findViewById(R.id.icon)), iTextMoreItem.getIconTint());
                View view6 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                ((TextView) view6.findViewById(R.id.title)).setTextColor(resources.getColor(R.color.text_title));
            } else {
                View view7 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                C13747j.m55728a((ImageView) ((AppCompatImageView) view7.findViewById(R.id.icon)), (int) R.color.icon_disable);
                View view8 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
                ((TextView) view8.findViewById(R.id.title)).setTextColor(resources.getColor(R.color.text_disable));
            }
            int i3 = 0;
            if (!iTextMoreItem.needShowBadge() || !isEnable || !C10208e.m42528c(iTextMoreItem.getId())) {
                z = false;
            } else {
                z = true;
            }
            View view9 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            UDBadgeView uDBadgeView = (UDBadgeView) view9.findViewById(R.id.badge);
            Intrinsics.checkExpressionValueIsNotNull(uDBadgeView, "itemView.badge");
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            uDBadgeView.setVisibility(i2);
            View view10 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
            View findViewById = view10.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.divider");
            if (a) {
                i3 = 8;
            }
            findViewById.setVisibility(i3);
            this.itemView.setOnClickListener(new View$OnClickListenerC10259a(this, iTextMoreItem, isEnable));
        }
    }
}
