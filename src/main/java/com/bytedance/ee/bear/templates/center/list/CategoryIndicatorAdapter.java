package com.bytedance.ee.bear.templates.center.list;

import android.content.res.Resources;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002H\u0014J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/CategoryIndicatorAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "Lcom/bytedance/ee/bear/templates/center/list/CategoryIndicatorAdapter$ViewHolder;", "()V", "selectedPosition", "", "convert", "", "helper", "item", "setSelectedPosition", "pos", "ViewHolder", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.b */
public final class CategoryIndicatorAdapter extends BaseQuickAdapter<CategoryTab, ViewHolder> {

    /* renamed from: a */
    private int f30933a;

    public CategoryIndicatorAdapter() {
        super((int) R.layout.categories_item_v4);
    }

    /* renamed from: b */
    public final void mo33373b(int i) {
        this.f30933a = i;
        notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/CategoryIndicatorAdapter$ViewHolder;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/templates/center/list/CategoryIndicatorAdapter;Landroid/view/View;)V", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.b$a */
    public final class ViewHolder extends C20923c {

        /* renamed from: a */
        final /* synthetic */ CategoryIndicatorAdapter f30934a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CategoryIndicatorAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f30934a = bVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(ViewHolder aVar, CategoryTab categoryTab) {
        Intrinsics.checkParameterIsNotNull(aVar, "helper");
        Intrinsics.checkParameterIsNotNull(categoryTab, "item");
        aVar.mo70737a(R.id.categoriesTv, categoryTab.getCategoryTabName());
        int indexOf = mo70673b().indexOf(categoryTab);
        View view = aVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "helper.itemView");
        Resources resources = view.getResources();
        if (indexOf == this.f30933a) {
            aVar.mo70743c(R.id.categoriesTv, resources.getColor(R.color.primary_pri_500));
            aVar.mo70741b(R.id.categoriesTv, R.drawable.catagore_item_select_bg);
            return;
        }
        aVar.mo70743c(R.id.categoriesTv, resources.getColor(R.color.icon_n2));
        aVar.mo70741b(R.id.categoriesTv, R.drawable.catagore_item_bg);
    }
}
