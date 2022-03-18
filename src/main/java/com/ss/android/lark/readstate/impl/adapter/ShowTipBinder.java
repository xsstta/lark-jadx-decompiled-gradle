package com.ss.android.lark.readstate.impl.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.readstate.impl.detail.C53123f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/readstate/impl/adapter/ShowTipBinder;", "Lcom/ss/android/lark/readstate/impl/adapter/IBinder;", "Lcom/ss/android/lark/readstate/impl/detail/ReadStateEntity;", "Lcom/ss/android/lark/readstate/impl/adapter/ShowTipBinder$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "item", "isLastOne", "", "onCreateViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "ViewHolder", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.readstate.impl.adapter.e */
public final class ShowTipBinder implements IBinder<C53123f, ViewHolder> {
    /* renamed from: a */
    public void mo181377a(ViewHolder aVar, C53123f fVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(fVar, "item");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/readstate/impl/adapter/ShowTipBinder$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.readstate.impl.adapter.e$a */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
        }
    }

    /* renamed from: a */
    public ViewHolder mo181379b(Context context, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(context).inflate(R.layout.readstate_item_bottom_search_tip, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ViewHolder(inflate);
    }
}
