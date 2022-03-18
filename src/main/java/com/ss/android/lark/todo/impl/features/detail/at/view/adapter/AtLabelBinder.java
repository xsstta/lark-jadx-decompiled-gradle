package com.ss.android.lark.todo.impl.features.detail.at.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtSelectAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtLabelBinder;", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/IAtBinder;", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtLabelBean;", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtLabelBinder$AtLabelViewHolder;", "listener", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtSelectAdapter$OnItemSelectListener;", "(Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtSelectAdapter$OnItemSelectListener;)V", "getListener", "()Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtSelectAdapter$OnItemSelectListener;", "bindData", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "position", "", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "getHeaderId", "", "AtLabelViewHolder", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.adapter.d */
public final class AtLabelBinder implements IAtBinder<AtLabelBean, AtLabelViewHolder> {

    /* renamed from: a */
    private final AtSelectAdapter.OnItemSelectListener f139688a;

    /* renamed from: a */
    public long mo192281a(AtLabelBean cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return -1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtLabelBinder$AtLabelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mLabel", "Landroid/widget/TextView;", "getMLabel", "()Landroid/widget/TextView;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.adapter.d$a */
    public static final class AtLabelViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final TextView f139689a;

        /* renamed from: a */
        public final TextView mo192296a() {
            return this.f139689a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AtLabelViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            View findViewById = view.findViewById(R.id.label);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.label)");
            this.f139689a = (TextView) findViewById;
        }
    }

    public AtLabelBinder(AtSelectAdapter.OnItemSelectListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f139688a = bVar;
    }

    /* renamed from: a */
    public AtLabelViewHolder mo192287b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.todo_detail_at_label_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new AtLabelViewHolder(inflate);
    }

    /* renamed from: a */
    public void mo192285a(AtLabelViewHolder aVar, AtLabelBean cVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (cVar.mo192274c() != 3) {
            aVar.mo192296a().setVisibility(0);
            aVar.mo192296a().setText(cVar.mo192292d());
            return;
        }
        aVar.mo192296a().setVisibility(8);
    }
}
