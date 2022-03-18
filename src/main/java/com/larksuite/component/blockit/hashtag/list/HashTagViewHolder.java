package com.larksuite.component.blockit.hashtag.list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.blockit.hashtag.widget.SwipeLayout;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/HashTagViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "hashTagContainer", "getHashTagContainer", "()Landroid/view/View;", "ivDeleteHashTag", "Landroid/widget/ImageView;", "getIvDeleteHashTag", "()Landroid/widget/ImageView;", "nameTv", "Landroid/widget/TextView;", "getNameTv", "()Landroid/widget/TextView;", "swipeLayout", "Lcom/larksuite/component/blockit/hashtag/widget/SwipeLayout;", "getSwipeLayout", "()Lcom/larksuite/component/blockit/hashtag/widget/SwipeLayout;", "teamWorker", "getTeamWorker", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.blockit.hashtag.list.f */
public final class HashTagViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final TextView f59619a;

    /* renamed from: b */
    private final View f59620b;

    /* renamed from: c */
    private final SwipeLayout f59621c;

    /* renamed from: d */
    private final ImageView f59622d;

    /* renamed from: e */
    private final TextView f59623e;

    /* renamed from: a */
    public final TextView mo86538a() {
        return this.f59619a;
    }

    /* renamed from: b */
    public final View mo86539b() {
        return this.f59620b;
    }

    /* renamed from: c */
    public final SwipeLayout mo86540c() {
        return this.f59621c;
    }

    /* renamed from: d */
    public final ImageView mo86541d() {
        return this.f59622d;
    }

    /* renamed from: e */
    public final TextView mo86542e() {
        return this.f59623e;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HashTagViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(R.id.tvTagName);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tvTagName)");
        this.f59619a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.hashTagContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.hashTagContainer)");
        this.f59620b = findViewById2;
        View findViewById3 = view.findViewById(R.id.swipeLayout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.swipeLayout)");
        this.f59621c = (SwipeLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.ivDeleteHashTag);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.ivDeleteHashTag)");
        this.f59622d = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.tvTeamWorker);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.tvTeamWorker)");
        this.f59623e = (TextView) findViewById5;
    }
}
