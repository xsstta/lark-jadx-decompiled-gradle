package com.ss.android.lark.tab.space.tab.add.common;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0001\u0010J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H&¢\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000fH&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/common/IItemBinder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "D", "", "bindViewHolder", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemClickListener", "Lcom/ss/android/lark/tab/space/tab/add/common/IItemBinder$OnItemClickListener;", "OnItemClickListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.tab.add.common.b */
public interface IItemBinder<VH extends RecyclerView.ViewHolder, D> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0002H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/common/IItemBinder$OnItemClickListener;", "D", "", "onItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.common.b$a */
    public interface OnItemClickListener<D> {
        /* renamed from: a */
        void mo188562a(D d);
    }
}
