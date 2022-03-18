package com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.member_manage.impl.base.adapter.C45047e;
import com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.searchcommon.view.avataritem.checkbox.CheckBoxModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminBinder;", "Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder;", "Lcom/ss/android/lark/member_manage/impl/base/adapter/GroupMemberManageViewHolder;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "()V", "bindData", "", "holder", "bean", "bindSelectCheckBox", "getHeaderId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "position", "getSelectMode", "handleItemLongClick", "longClickListener", "Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnItemLongClickListener;", "handleSelectableItemClick", "changeListener", "Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnSelectChangeListener;", "handleUnSelectableItemClick", "clickListener", "Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnUnSelectedItemClickListener;", "isSelectable", "", "needShowOwnerLabel", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.a */
public final class AddChatAdminBinder implements IFuncBinder<C45047e, C45084c> {
    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public int mo159325a() {
        return 2;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: b */
    public boolean mo159332b() {
        return true;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public boolean mo159331a(C45084c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (cVar.mo159508d() || cVar.mo159511f()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo159327a(C45047e eVar, C45084c cVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "holder");
        Intrinsics.checkParameterIsNotNull(cVar, "bean");
        m179049b(eVar, cVar);
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
    private final void m179049b(C45047e eVar, C45084c cVar) {
        if (cVar.mo159508d()) {
            eVar.f114059a.mo184665a(new CheckBoxModel(cVar.mo159504b(), false, false));
        } else if (cVar.mo159511f()) {
            eVar.f114059a.mo184665a(new CheckBoxModel(cVar.mo159504b(), false, true));
        } else {
            eVar.f114059a.mo184665a(new CheckBoxModel(cVar.mo159504b(), true, true));
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public void mo159328a(C45084c cVar, IFuncBinder.AbstractC45038a aVar) {
        if (aVar != null) {
            aVar.onItemLongClick(cVar);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public void mo159329a(C45084c cVar, IFuncBinder.AbstractC45039b bVar) {
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (bVar == null) {
            return;
        }
        if (cVar.mo159504b()) {
            bVar.mo159334a(cVar);
        } else {
            bVar.mo159335b(cVar);
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
