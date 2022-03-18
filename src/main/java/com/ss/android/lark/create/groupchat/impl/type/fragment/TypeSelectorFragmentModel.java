package com.ss.android.lark.create.groupchat.impl.type.fragment;

import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.type.fragment.ITypeSelectorContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/ITypeSelectorContract$IModel;", "groupCreateInfo", "Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "(Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;)V", "getGroupCreateInfo", "()Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "createGroupGuideFinish", "", "isNeedShowCreateGroupGuide", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.d */
public final class TypeSelectorFragmentModel extends BaseModel implements ITypeSelectorContract.IModel {

    /* renamed from: a */
    private final GroupCreateInfo f93905a;

    @Override // com.ss.android.lark.create.groupchat.impl.type.fragment.ITypeSelectorContract.IModel
    /* renamed from: a */
    public GroupCreateInfo mo134240a() {
        return this.f93905a;
    }

    public TypeSelectorFragmentModel(GroupCreateInfo groupCreateInfo) {
        Intrinsics.checkParameterIsNotNull(groupCreateInfo, "groupCreateInfo");
        this.f93905a = groupCreateInfo;
    }
}
