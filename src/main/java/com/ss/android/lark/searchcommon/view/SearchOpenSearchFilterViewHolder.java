package com.ss.android.lark.searchcommon.view;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchOpenSearchFilterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mTitleTv", "Landroid/widget/TextView;", "getMTitleTv", "()Landroid/widget/TextView;", "setMTitleTv", "(Landroid/widget/TextView;)V", "getView", "()Landroid/view/View;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.g */
public final class SearchOpenSearchFilterViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private TextView f133766a;

    /* renamed from: b */
    private final View f133767b;

    /* renamed from: a */
    public final TextView mo184941a() {
        return this.f133766a;
    }

    /* renamed from: b */
    public final View mo184942b() {
        return this.f133767b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchOpenSearchFilterViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f133767b = view;
        View findViewById = view.findViewById(R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.title)");
        this.f133766a = (TextView) findViewById;
    }
}
