package com.ss.android.lark.member_manage.impl.base.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/base/adapter/BottomSearchTipBinder;", "Lcom/ss/android/lark/member_manage/impl/base/adapter/IAdapterBinder;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "Lcom/ss/android/lark/member_manage/impl/base/adapter/BottomSearchTipViewHolder;", "()V", "getItemId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onBindViewHolder", "", "holder", "item", "showShadow", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.base.adapter.a */
public final class BottomSearchTipBinder implements IAdapterBinder<C45084c, BottomSearchTipViewHolder> {
    /* renamed from: a */
    public long mo159342a(C45084c cVar) {
        return (long) -1317164142;
    }

    /* renamed from: a */
    public void mo159344a(BottomSearchTipViewHolder bVar, C45084c cVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
    }

    /* renamed from: a */
    public BottomSearchTipViewHolder mo159346b(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new BottomSearchTipViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.group_member_item_bottom_search_tip, viewGroup, false));
    }
}
