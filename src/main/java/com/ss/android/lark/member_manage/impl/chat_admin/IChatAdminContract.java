package com.ss.android.lark.member_manage.impl.chat_admin;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract;", "", "IModel", "IView", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.f */
public interface IChatAdminContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IModel;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/IGroupMemberBaseContract$IBaseModel;", "getCurrentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "updateChatAdmin", "", "chatId", "", "toAddUserIds", "", "toDelUserIds", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.f$a */
    public interface IModel extends IGroupMemberBaseContract.AbstractC45065a {
        /* renamed from: a */
        void mo159630a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bJ$\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IView;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/IGroupMemberBaseContract$IBaseView;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IView$Delegate;", "closeForResult", "", "toAddUserIds", "", "", "toDelUserIds", "goAddChatAdminActivity", "switchToReduceChatAdmin", "Delegate", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.f$b */
    public interface IView extends IGroupMemberBaseContract.AbstractC45066b<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IView$Delegate;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/IGroupMemberBaseContract$IBaseView$Delegate;", "onChatAdminUpdated", "", "chatId", "", "toAddUserIds", "", "toDelUserIds", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.f$b$a */
        public interface Delegate extends IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a {
            /* renamed from: a */
            void mo159635a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback);
        }

        /* renamed from: a */
        void mo159641a(List<String> list, List<String> list2);

        /* renamed from: l */
        void mo159643l();
    }
}
