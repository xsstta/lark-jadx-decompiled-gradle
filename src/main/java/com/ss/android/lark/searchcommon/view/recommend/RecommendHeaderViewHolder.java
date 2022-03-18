package com.ss.android.lark.searchcommon.view.recommend;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/recommend/RecommendHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "more", "Landroid/widget/ImageView;", "getMore", "()Landroid/widget/ImageView;", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.recommend.c */
public final class RecommendHeaderViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final TextView f133827a;

    /* renamed from: b */
    private final ImageView f133828b;

    /* renamed from: a */
    public final TextView mo185017a() {
        return this.f133827a;
    }

    /* renamed from: b */
    public final ImageView mo185018b() {
        return this.f133828b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendHeaderViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        View findViewById = view.findViewById(R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.title)");
        this.f133827a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.more);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.more)");
        this.f133828b = (ImageView) findViewById2;
    }
}
