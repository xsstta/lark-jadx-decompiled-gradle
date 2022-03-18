package com.bytedance.ee.bear.templates.preview.group;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/group/TemplateSelectViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "img", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getImg", "()Landroid/widget/ImageView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "topBar", "getTopBar", "()Landroid/view/View;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.preview.group.c */
public final class TemplateSelectViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f31183a;

    /* renamed from: b */
    private final ImageView f31184b;

    /* renamed from: c */
    private final TextView f31185c;

    /* renamed from: a */
    public final View mo44493a() {
        return this.f31183a;
    }

    /* renamed from: b */
    public final ImageView mo44494b() {
        return this.f31184b;
    }

    /* renamed from: c */
    public final TextView mo44495c() {
        return this.f31185c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TemplateSelectViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f31183a = view.findViewById(R.id.template_top);
        this.f31184b = (ImageView) view.findViewById(R.id.templateImg);
        this.f31185c = (TextView) view.findViewById(R.id.templateNameTxt);
    }
}
