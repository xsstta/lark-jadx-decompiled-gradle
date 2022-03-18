package com.bytedance.ee.bear.templates;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH&¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/templates/ITemplateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "showTemplate", "", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "deleteListener", "Lkotlin/Function0;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.b */
public abstract class ITemplateViewHolder extends RecyclerView.ViewHolder {
    /* renamed from: a */
    public abstract void mo43935a(TemplateV4 templateV4, Function0<Unit> function0);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ITemplateViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
    }
}
