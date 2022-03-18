package com.ss.android.lark.todo.impl.features.detail.at.view.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtBean;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J%\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00020\u000fH&¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/IAtBinder;", "D", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtBean;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "bindData", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "position", "", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtBean;I)V", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getHeaderId", "", "(Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtBean;)J", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.adapter.f */
public interface IAtBinder<D extends AtBean, VH extends RecyclerView.ViewHolder> {
    /* renamed from: a */
    long mo192281a(D d);

    /* renamed from: a */
    void mo192285a(VH vh, D d, int i);

    /* renamed from: b */
    VH mo192287b(ViewGroup viewGroup);
}
