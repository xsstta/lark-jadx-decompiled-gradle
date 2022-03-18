package com.ss.android.lark.readstate.impl.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.readstate.impl.detail.C53123f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/readstate/impl/adapter/SectionTipBinder;", "Lcom/ss/android/lark/readstate/impl/adapter/IBinder;", "Lcom/ss/android/lark/readstate/impl/detail/ReadStateEntity;", "Lcom/ss/android/lark/readstate/impl/adapter/SectionTipBinder$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "item", "isLastOne", "", "onCreateViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "ViewHolder", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.readstate.impl.adapter.d */
public final class SectionTipBinder implements IBinder<C53123f, ViewHolder> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/readstate/impl/adapter/SectionTipBinder$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.readstate.impl.adapter.d$a */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final TextView f131321a;

        /* renamed from: a */
        public final TextView mo181386a() {
            return this.f131321a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            View findViewById = view.findViewById(R.id.section_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.section_name)");
            this.f131321a = (TextView) findViewById;
        }
    }

    /* renamed from: a */
    public ViewHolder mo181379b(Context context, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(context).inflate(R.layout.section_tip_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ViewHolder(inflate);
    }

    /* renamed from: a */
    public void mo181377a(ViewHolder aVar, C53123f fVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(fVar, "item");
        if (fVar.f131383h != 0) {
            aVar.mo181386a().setText(fVar.f131383h);
            aVar.mo181386a().setVisibility(0);
            return;
        }
        aVar.mo181386a().setVisibility(8);
    }
}
