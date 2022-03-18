package com.ss.android.lark.member_manage.impl.base.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004J\u0017\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u000eH&¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/base/adapter/IAdapterBinder;", "Data", "ViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "getItemId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)J", "onBindViewHolder", "", "holder", "item", "showShadow", "", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Z)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.base.adapter.f */
public interface IAdapterBinder<Data, ViewHolder extends RecyclerView.ViewHolder> {
    /* renamed from: a */
    long mo159342a(Data data);

    /* renamed from: a */
    void mo159344a(ViewHolder viewholder, Data data, boolean z);

    /* renamed from: b */
    ViewHolder mo159346b(ViewGroup viewGroup, int i);
}
