package com.bytedance.ee.bear.middleground.permission.widget.editpermdialog;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002H\u0014J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermItemModel;", "Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermAdapter$EditPermViewHolder;", "()V", "convert", "", "helper", "item", "getColor", "", "view", "Landroid/view/View;", "getTipsColor", "EditPermViewHolder", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.widget.a.a */
public final class EditPermAdapter extends BaseQuickAdapter<EditPermItemModel, EditPermViewHolder> {
    public EditPermAdapter() {
        super(R.layout.perm_edit_perm_dialog_item, new ArrayList());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermAdapter$EditPermViewHolder;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermAdapter;Landroid/view/View;)V", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.widget.a.a$a */
    public final class EditPermViewHolder extends C20923c {

        /* renamed from: a */
        final /* synthetic */ EditPermAdapter f27318a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public EditPermViewHolder(EditPermAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f27318a = aVar;
        }
    }

    /* renamed from: a */
    private final int m42100a(EditPermItemModel cVar, View view) {
        int i;
        if (cVar.mo38499e()) {
            i = cVar.mo38496b();
        } else {
            i = R.color.text_disable;
        }
        return view.getResources().getColor(i);
    }

    /* renamed from: b */
    private final int m42101b(EditPermItemModel cVar, View view) {
        int i;
        if (cVar.mo38499e()) {
            i = R.color.text_placeholder;
        } else {
            i = R.color.text_disable;
        }
        return view.getResources().getColor(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(EditPermViewHolder aVar, EditPermItemModel cVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "helper");
        Intrinsics.checkParameterIsNotNull(cVar, "item");
        C20923c a = aVar.mo70737a(R.id.descTv, cVar.mo38495a());
        View view = aVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "helper.itemView");
        C20923c a2 = a.mo70743c(R.id.descTv, m42100a(cVar, view)).mo70737a(R.id.tipTv, cVar.mo38497c());
        if (cVar.mo38497c().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        C20923c a3 = a2.mo70738a(R.id.tipTv, z);
        View view2 = aVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "helper.itemView");
        a3.mo70743c(R.id.tipTv, m42101b(cVar, view2)).mo70745d(R.id.descTv, cVar.mo38499e()).mo70738a(R.id.selectedIcon, cVar.mo38498d()).mo70738a(R.id.divider, cVar.mo38501f());
        if (!cVar.mo38499e() || cVar.mo38498d()) {
            aVar.itemView.setOnClickListener(null);
        } else {
            aVar.itemView.setOnClickListener(cVar.mo38502g());
        }
    }
}
