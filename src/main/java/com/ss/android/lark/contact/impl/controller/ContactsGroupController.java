package com.ss.android.lark.contact.impl.controller;

import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.IContactsGroupController;
import com.ss.android.lark.biz.core.api.PickType;
import com.ss.android.lark.contact.impl.contacts_group.groupframe.ContactsGroupOwnerFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\u0015\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/contact/impl/controller/ContactsGroupController;", "Lcom/ss/android/lark/biz/core/api/IContactsGroupController;", "()V", "fragment", "Lcom/ss/android/lark/contact/impl/contacts_group/groupframe/ContactsGroupOwnerFragment;", "asFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "init", "multiSelectMode", "", "pickType", "Lcom/ss/android/lark/biz/core/api/PickType;", "setContainedChatId", "", "chaIds", "", "", "setGroupOperationListener", "listener", "Lcom/ss/android/lark/biz/core/api/IContactsGroupController$IOnOperationListener;", "setPickType", "setSelectChatIds", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.a.b */
public final class ContactsGroupController implements IContactsGroupController {

    /* renamed from: a */
    public ContactsGroupOwnerFragment f91770a;

    @Override // com.ss.android.lark.biz.core.api.IContactsGroupController
    /* renamed from: a */
    public BaseFragment mo105763a() {
        ContactsGroupOwnerFragment aVar = this.f91770a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment");
        }
        return aVar;
    }

    @Override // com.ss.android.lark.biz.core.api.IContactsGroupController
    /* renamed from: a */
    public void mo105765a(PickType pickType) {
        Intrinsics.checkParameterIsNotNull(pickType, "pickType");
        if (this.f91770a != null) {
            ContactsGroupOwnerFragment aVar = this.f91770a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragment");
            }
            aVar.mo105765a(pickType);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.IContactsGroupController
    /* renamed from: a */
    public void mo105766a(IContactsGroupController.IOnOperationListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        ContactsGroupOwnerFragment aVar2 = this.f91770a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment");
        }
        aVar2.mo105766a(aVar);
    }

    @Override // com.ss.android.lark.biz.core.api.IContactsGroupController
    /* renamed from: b */
    public void mo105768b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "chaIds");
        if (this.f91770a != null) {
            ContactsGroupOwnerFragment aVar = this.f91770a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragment");
            }
            aVar.mo105768b(list);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.IContactsGroupController
    /* renamed from: a */
    public void mo105767a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "chaIds");
        if (this.f91770a != null) {
            ContactsGroupOwnerFragment aVar = this.f91770a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragment");
            }
            aVar.mo105767a(list);
        }
    }

    /* renamed from: b */
    public ContactsGroupController mo105764a(boolean z, PickType pickType) {
        Intrinsics.checkParameterIsNotNull(pickType, "pickType");
        ContactsGroupController bVar = this;
        ContactsGroupOwnerFragment aVar = new ContactsGroupOwnerFragment();
        aVar.mo105764a(z, pickType);
        bVar.f91770a = aVar;
        return bVar;
    }
}
