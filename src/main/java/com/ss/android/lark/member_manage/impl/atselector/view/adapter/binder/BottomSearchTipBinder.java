package com.ss.android.lark.member_manage.impl.atselector.view.adapter.binder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.atselector.bean.BottomSearchTipBean;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.AbstractC45032b;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder.BottomSearchTipViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/atselector/view/adapter/binder/BottomSearchTipBinder;", "Lcom/ss/android/lark/member_manage/impl/atselector/view/adapter/IAtDataBinder;", "Lcom/ss/android/lark/member_manage/impl/atselector/bean/BottomSearchTipBean;", "Lcom/ss/android/lark/member_manage/impl/atselector/view/adapter/holder/BottomSearchTipViewHolder;", "container", "Lcom/ss/android/lark/member_manage/GroupMemberManageModule$IItemContainer;", "(Lcom/ss/android/lark/member_manage/GroupMemberManageModule$IItemContainer;)V", "bindData", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "position", "", "createHolder", "parent", "Landroid/view/ViewGroup;", "getHeaderId", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.atselector.view.adapter.a.e */
public final class BottomSearchTipBinder implements AbstractC45032b<BottomSearchTipBean, BottomSearchTipViewHolder> {
    /* renamed from: a */
    public long mo159267a(BottomSearchTipBean bottomSearchTipBean) {
        return -1;
    }

    /* renamed from: a */
    public void mo159269a(BottomSearchTipViewHolder aVar, BottomSearchTipBean bottomSearchTipBean, int i) {
    }

    public BottomSearchTipBinder(GroupMemberManageModule.IItemContainer iItemContainer) {
        Intrinsics.checkParameterIsNotNull(iItemContainer, "container");
    }

    /* renamed from: b */
    public BottomSearchTipViewHolder mo159268a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.group_member_item_bottom_search_tip, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new BottomSearchTipViewHolder(inflate);
    }
}
