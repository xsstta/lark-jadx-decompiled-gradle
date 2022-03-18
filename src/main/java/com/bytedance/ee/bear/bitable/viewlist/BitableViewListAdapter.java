package com.bytedance.ee.bear.bitable.viewlist;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00072\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0014\u0010\u0017\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rR*\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListAdapter$ViewsViewHolder;", "()V", "onItemClickListener", "Lkotlin/Function1;", "Lcom/bytedance/ee/bear/bitable/viewlist/BiTableViewItem;", "", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "viewList", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateViewList", "ViewsViewHolder", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.viewlist.a */
public final class BitableViewListAdapter extends RecyclerView.Adapter<ViewsViewHolder> {

    /* renamed from: a */
    public List<BiTableViewItem> f14251a;

    /* renamed from: b */
    private Function1<? super BiTableViewItem, Unit> f14252b;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.bytedance.ee.bear.bitable.viewlist.BiTableViewItem, kotlin.Unit>, kotlin.jvm.functions.Function1<com.bytedance.ee.bear.bitable.viewlist.BiTableViewItem, kotlin.Unit> */
    /* renamed from: a */
    public final Function1<BiTableViewItem, Unit> mo19011a() {
        return this.f14252b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<BiTableViewItem> list = this.f14251a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo19014a(Function1<? super BiTableViewItem, Unit> function1) {
        this.f14252b = function1;
    }

    /* renamed from: a */
    public final void mo19013a(List<BiTableViewItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "viewList");
        this.f14251a = list;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public ViewsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bitable_view_list_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…list_item, parent, false)");
        return new ViewsViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewsViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        List<BiTableViewItem> list = this.f14251a;
        if (list != null) {
            aVar.mo19015a(list.get(i), i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListAdapter$ViewsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListAdapter;Landroid/view/View;)V", "container", "Landroid/widget/RelativeLayout;", "viewName", "Landroid/widget/TextView;", "viewType", "Landroid/widget/ImageView;", "bindView", "", "viewItem", "Lcom/bytedance/ee/bear/bitable/viewlist/BiTableViewItem;", "position", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.viewlist.a$a */
    public final class ViewsViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ BitableViewListAdapter f14253a;

        /* renamed from: b */
        private RelativeLayout f14254b;

        /* renamed from: c */
        private TextView f14255c;

        /* renamed from: d */
        private ImageView f14256d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewsViewHolder(BitableViewListAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f14253a = aVar;
            View findViewById = view.findViewById(R.id.item_container);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.item_container)");
            this.f14254b = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tv_view_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.tv_view_name)");
            this.f14255c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.iv_view_type);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.iv_view_type)");
            this.f14256d = (ImageView) findViewById3;
            this.f14254b.setOnClickListener(new AbstractView$OnClickListenerC11839e(this) {
                /* class com.bytedance.ee.bear.bitable.viewlist.BitableViewListAdapter.ViewsViewHolder.C48521 */

                /* renamed from: a */
                final /* synthetic */ ViewsViewHolder f14257a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f14257a = r1;
                }

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    BiTableViewItem biTableViewItem;
                    Function1<BiTableViewItem, Unit> a = this.f14257a.f14253a.mo19011a();
                    if (a != null) {
                        List<BiTableViewItem> list = this.f14257a.f14253a.f14251a;
                        if (list != null) {
                            biTableViewItem = list.get(this.f14257a.getAdapterPosition());
                        } else {
                            biTableViewItem = null;
                        }
                        a.invoke(biTableViewItem);
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo19015a(BiTableViewItem biTableViewItem, int i) {
            Drawable drawable;
            Intrinsics.checkParameterIsNotNull(biTableViewItem, "viewItem");
            this.f14255c.setText(biTableViewItem.getTitle());
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            int color = view.getResources().getColor(R.color.icon_n1);
            String valueOf = String.valueOf(biTableViewItem.getType());
            String name = BiTableViewType.Grid.name();
            Locale locale = Locale.ENGLISH;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ENGLISH");
            if (name != null) {
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (Intrinsics.areEqual(valueOf, lowerCase)) {
                    View view2 = this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    drawable = view2.getResources().getDrawable(R.drawable.ud_icon_bitablegrid_outlined);
                } else {
                    String name2 = BiTableViewType.KanBan.name();
                    Locale locale2 = Locale.ENGLISH;
                    Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.ENGLISH");
                    if (name2 != null) {
                        String lowerCase2 = name2.toLowerCase(locale2);
                        Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                        if (Intrinsics.areEqual(valueOf, lowerCase2)) {
                            View view3 = this.itemView;
                            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                            drawable = view3.getResources().getDrawable(R.drawable.ud_icon_bitablekanban_outlined);
                        } else {
                            String name3 = BiTableViewType.Gantt.name();
                            Locale locale3 = Locale.ENGLISH;
                            Intrinsics.checkExpressionValueIsNotNull(locale3, "Locale.ENGLISH");
                            if (name3 != null) {
                                String lowerCase3 = name3.toLowerCase(locale3);
                                Intrinsics.checkExpressionValueIsNotNull(lowerCase3, "(this as java.lang.String).toLowerCase(locale)");
                                if (Intrinsics.areEqual(valueOf, lowerCase3)) {
                                    View view4 = this.itemView;
                                    Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                                    drawable = view4.getResources().getDrawable(R.drawable.ud_icon_bitablegantt_outlined);
                                } else {
                                    String name4 = BiTableViewType.Gallery.name();
                                    Locale locale4 = Locale.ENGLISH;
                                    Intrinsics.checkExpressionValueIsNotNull(locale4, "Locale.ENGLISH");
                                    if (name4 != null) {
                                        String lowerCase4 = name4.toLowerCase(locale4);
                                        Intrinsics.checkExpressionValueIsNotNull(lowerCase4, "(this as java.lang.String).toLowerCase(locale)");
                                        if (Intrinsics.areEqual(valueOf, lowerCase4)) {
                                            View view5 = this.itemView;
                                            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                                            drawable = view5.getResources().getDrawable(R.drawable.ud_icon_bitablegallery_outlined);
                                        } else {
                                            View view6 = this.itemView;
                                            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                                            drawable = view6.getResources().getDrawable(R.drawable.ud_icon_bitablegrid_outlined);
                                        }
                                    } else {
                                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                    }
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                if (Intrinsics.areEqual((Object) biTableViewItem.getActive(), (Object) true)) {
                    View view7 = this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                    color = view7.getResources().getColor(R.color.primary_pri_500);
                }
                this.f14256d.setBackground(drawable);
                this.f14256d.setBackgroundTintList(ColorStateList.valueOf(color));
                this.f14255c.setTextColor(color);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }
}
