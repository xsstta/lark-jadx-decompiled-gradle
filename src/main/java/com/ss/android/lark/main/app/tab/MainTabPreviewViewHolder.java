package com.ss.android.lark.main.app.tab;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/main/app/tab/MainTabPreviewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "getParent", "()Landroid/view/ViewGroup;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.tab.h */
public final class MainTabPreviewViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final ImageView f112546a;

    /* renamed from: b */
    private final TextView f112547b;

    /* renamed from: c */
    private final ViewGroup f112548c;

    /* renamed from: a */
    public final ImageView mo157606a() {
        return this.f112546a;
    }

    /* renamed from: b */
    public final TextView mo157607b() {
        return this.f112547b;
    }

    /* renamed from: c */
    public final ViewGroup mo157608c() {
        return this.f112548c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainTabPreviewViewHolder(View view, ViewGroup viewGroup) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        this.f112548c = viewGroup;
        View g = ViewCompat.m4080g(view, (int) R.id.main_nav_editor_main_tab_preview_image);
        Intrinsics.checkExpressionValueIsNotNull(g, "ViewCompat.requireViewBy…r_main_tab_preview_image)");
        this.f112546a = (ImageView) g;
        View g2 = ViewCompat.m4080g(view, (int) R.id.main_nav_editor_main_tab_preview_text);
        Intrinsics.checkExpressionValueIsNotNull(g2, "ViewCompat.requireViewBy…or_main_tab_preview_text)");
        this.f112547b = (TextView) g2;
    }
}
