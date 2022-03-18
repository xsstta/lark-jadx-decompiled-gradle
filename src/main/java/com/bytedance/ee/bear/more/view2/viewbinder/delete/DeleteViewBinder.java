package com.bytedance.ee.bear.more.view2.viewbinder.delete;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IDeleteMoreItem;
import com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/delete/DeleteViewBinder;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/IMoreViewBinder;", "Lcom/bytedance/ee/bear/more/moreprotocol/IDeleteMoreItem;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/delete/DeleteViewBinder$DeleteViewHolder;", "()V", "TAG", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "DeleteViewHolder", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.view2.b.b.a */
public final class DeleteViewBinder {

    /* renamed from: a */
    public final String f27696a = "DeleteViewBinder";

    /* renamed from: a */
    public DeleteViewHolder mo39221a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.more_item_text, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new DeleteViewHolder(this, inflate);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J,\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/delete/DeleteViewBinder$DeleteViewHolder;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/BaseMoreItemViewHolder;", "Lcom/bytedance/ee/bear/more/moreprotocol/IDeleteMoreItem;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/more/view2/viewbinder/delete/DeleteViewBinder;Landroid/view/View;)V", "onBindViewHolder", "", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "moreItem", "position", "", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.b.b.a$a */
    public final class DeleteViewHolder extends BaseMoreItemViewHolder<IDeleteMoreItem> {

        /* renamed from: a */
        final /* synthetic */ DeleteViewBinder f27697a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.more.view2.b.b.a$a$a */
        public static final class View$OnClickListenerC10255a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ DeleteViewHolder f27698a;

            /* renamed from: b */
            final /* synthetic */ IDeleteMoreItem f27699b;

            View$OnClickListenerC10255a(DeleteViewHolder aVar, IDeleteMoreItem iDeleteMoreItem) {
                this.f27698a = aVar;
                this.f27699b = iDeleteMoreItem;
            }

            public final void onClick(View view) {
                if (!C13726a.m55676b(this.f27699b.getHost().mo39165b().getActivity())) {
                    C13479a.m54775e(this.f27698a.f27697a.f27696a, "item click, but act not active!!!");
                } else {
                    this.f27699b.onClick();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeleteViewHolder(DeleteViewBinder aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f27697a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem, int] */
        @Override // com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo39217a(RecyclerView.Adapter adapter, IDeleteMoreItem iDeleteMoreItem, int i) {
            mo39222a((RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>>) adapter, iDeleteMoreItem, i);
        }

        /* renamed from: a */
        public void mo39222a(RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>> adapter, IDeleteMoreItem iDeleteMoreItem, int i) {
            Intrinsics.checkParameterIsNotNull(adapter, "adapter");
            Intrinsics.checkParameterIsNotNull(iDeleteMoreItem, "moreItem");
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            boolean a = mo39218a(view, adapter, i);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            ((AppCompatImageView) view2.findViewById(R.id.icon)).setImageResource(iDeleteMoreItem.getIcon());
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            C13747j.m55728a((ImageView) ((AppCompatImageView) view3.findViewById(R.id.icon)), iDeleteMoreItem.getIconTint());
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            TextView textView = (TextView) view4.findViewById(R.id.title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.title");
            textView.setText(iDeleteMoreItem.getTitle());
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            UDBadgeView uDBadgeView = (UDBadgeView) view5.findViewById(R.id.badge);
            Intrinsics.checkExpressionValueIsNotNull(uDBadgeView, "itemView.badge");
            int i2 = 8;
            uDBadgeView.setVisibility(8);
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            View findViewById = view6.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.divider");
            if (!a) {
                i2 = 0;
            }
            findViewById.setVisibility(i2);
            this.itemView.setOnClickListener(new View$OnClickListenerC10255a(this, iDeleteMoreItem));
        }
    }
}
