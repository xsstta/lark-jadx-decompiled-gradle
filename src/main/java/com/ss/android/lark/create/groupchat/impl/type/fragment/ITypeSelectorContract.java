package com.ss.android.lark.create.groupchat.impl.type.fragment;

import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.create.groupchat.dto.CreateGroupMode;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/type/fragment/ITypeSelectorContract;", "", "()V", "IModel", "IView", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.c */
public final class ITypeSelectorContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/type/fragment/ITypeSelectorContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "groupCreateInfo", "Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "getGroupCreateInfo", "()Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "createGroupGuideFinish", "", "isNeedShowCreateGroupGuide", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.c$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        GroupCreateInfo mo134240a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J0\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/type/fragment/ITypeSelectorContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/ITypeSelectorContract$IView$Delegate;", "go2NextPage", "", "groupCreateInfo", "Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "initView", "isPublic", "", "isCrossTenant", "isCrossWithKa", "hasMultiEntity", "chatMode", "Lcom/ss/android/lark/create/groupchat/dto/CreateGroupMode;", "Delegate", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.c$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/type/fragment/ITypeSelectorContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onCreateGroupGuideFinish", "", "onNeedShowCreateGroupGuide", "", "onNextStep", "isPublic", "chatMode", "Lcom/ss/android/lark/create/groupchat/dto/CreateGroupMode;", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.c$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo134243a(boolean z, CreateGroupMode createGroupMode);
        }

        /* renamed from: a */
        void mo134241a(GroupCreateInfo groupCreateInfo);

        /* renamed from: a */
        void mo134242a(boolean z, boolean z2, boolean z3, boolean z4, CreateGroupMode createGroupMode);
    }
}
