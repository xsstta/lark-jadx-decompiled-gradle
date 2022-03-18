package com.ss.android.lark.searchcommon.view;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchShowMoreViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "more", "Landroid/widget/TextView;", "getMore", "()Landroid/widget/TextView;", "title", "getTitle", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.l */
public final class SearchShowMoreViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final TextView f133806a;

    /* renamed from: b */
    private final TextView f133807b;

    /* renamed from: a */
    public final TextView mo184988a() {
        return this.f133806a;
    }

    /* renamed from: b */
    public final TextView mo184989b() {
        return this.f133807b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchShowMoreViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.title)");
        this.f133806a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.more);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.more)");
        this.f133807b = (TextView) findViewById2;
    }
}
