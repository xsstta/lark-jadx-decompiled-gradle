package com.ss.android.lark.member_manage.impl.show_member.common;

import android.view.View;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.base.adapter.C45047e;
import com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.searchcommon.view.avataritem.checkbox.CheckBoxModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u001a\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\f\u0010 \u001a\u00020\u001e*\u00020\u0003H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/common/ReduceMemberBinder;", "Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder;", "Lcom/ss/android/lark/member_manage/impl/base/adapter/GroupMemberManageViewHolder;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "mChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "getMChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "setMChat", "selfUserId", "", "kotlin.jvm.PlatformType", "bindData", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bindSelectCheckBox", "item", "getHeaderId", "", "position", "getSelectMode", "handleSelectableItemClick", "listener", "Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnSelectChangeListener;", "handleUnSelectableItemClick", "clickListener", "Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnUnSelectedItemClickListener;", "isSelectable", "", "needShowOwnerLabel", "isIrremovable", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.show_member.a.a */
public final class ReduceMemberBinder implements IFuncBinder<C45047e, C45084c> {

    /* renamed from: a */
    private final String f114382a;

    /* renamed from: b */
    private Chat f114383b;

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public int mo159325a() {
        return 2;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public /* synthetic */ void mo159328a(C45084c cVar, IFuncBinder.AbstractC45038a aVar) {
        IFuncBinder.CC.$default$a(this, cVar, aVar);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: b */
    public boolean mo159332b() {
        return true;
    }

    public ReduceMemberBinder(Chat chat) {
        this.f114383b = chat;
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        IGroupMemberManageModuleDependency.AbstractC44878a accountDependency = a.getAccountDependency();
        Intrinsics.checkExpressionValueIsNotNull(accountDependency, "GroupMemberManageModule.…dency().accountDependency");
        this.f114382a = accountDependency.mo143795b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m179317b(com.ss.android.lark.member_manage.impl.bean.C45084c r7) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.member_manage.impl.show_member.common.ReduceMemberBinder.m179317b(com.ss.android.lark.member_manage.impl.bean.c):boolean");
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public boolean mo159331a(C45084c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return !cVar.mo159508d();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public int mo159326a(C45084c cVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (cVar.mo159508d()) {
            return -1;
        }
        return cVar.mo159514i() * 'd';
    }

    /* renamed from: b */
    private final void m179316b(C45047e eVar, C45084c cVar) {
        if (cVar.mo159508d()) {
            eVar.f114059a.mo184665a(new CheckBoxModel(cVar.mo159504b(), false, false));
        } else {
            eVar.f114059a.mo184665a(new CheckBoxModel(cVar.mo159504b()));
        }
    }

    /* renamed from: a */
    public void mo159327a(C45047e eVar, C45084c cVar) {
        if (eVar != null && cVar != null) {
            m179316b(eVar, cVar);
            if (m179317b(cVar)) {
                View view = eVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
                view.setEnabled(false);
                eVar.f114059a.mo184665a(new CheckBoxModel(false, false, false));
                return;
            }
            View view2 = eVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            view2.setEnabled(true);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public void mo159329a(C45084c cVar, IFuncBinder.AbstractC45039b bVar) {
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (bVar != null) {
            if (cVar.mo159504b()) {
                bVar.mo159334a(cVar);
            } else {
                bVar.mo159335b(cVar);
            }
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public void mo159330a(C45084c cVar, IFuncBinder.AbstractC45040c cVar2) {
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (cVar2 != null) {
            cVar2.mo159337a(cVar);
        }
    }
}
