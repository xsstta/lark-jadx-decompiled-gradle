package com.ss.android.lark.searchcommon.view.feedback;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/feedback/SearchFeedbackViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "content", "getContent", "()Landroid/view/View;", "footer", "getFooter", "header", "getHeader", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.feedback.c */
public final class SearchFeedbackViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f133763a;

    /* renamed from: b */
    private final View f133764b;

    /* renamed from: c */
    private final View f133765c;

    /* renamed from: a */
    public final View mo184938a() {
        return this.f133763a;
    }

    /* renamed from: b */
    public final View mo184939b() {
        return this.f133764b;
    }

    /* renamed from: c */
    public final View mo184940c() {
        return this.f133765c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFeedbackViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(R.id.content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.content)");
        this.f133763a = findViewById;
        View findViewById2 = view.findViewById(R.id.header);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.header)");
        this.f133764b = findViewById2;
        View findViewById3 = view.findViewById(R.id.footer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.footer)");
        this.f133765c = findViewById3;
    }
}
