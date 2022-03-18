package com.ss.android.lark.searchcommon.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchPlaceholderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "itemType", "", "(Landroid/view/View;I)V", "getItemType", "()I", "more", "Landroid/widget/ImageView;", "getMore", "()Landroid/widget/ImageView;", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "getView", "()Landroid/view/View;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.h */
public final class SearchPlaceholderViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final TextView f133795a = ((TextView) this.itemView.findViewById(R.id.title));

    /* renamed from: b */
    private final ImageView f133796b = ((ImageView) this.itemView.findViewById(R.id.more));

    /* renamed from: c */
    private final View f133797c;

    /* renamed from: d */
    private final int f133798d;

    /* renamed from: a */
    public final TextView mo184978a() {
        return this.f133795a;
    }

    /* renamed from: b */
    public final ImageView mo184979b() {
        return this.f133796b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchPlaceholderViewHolder(View view, int i) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f133797c = view;
        this.f133798d = i;
    }
}
