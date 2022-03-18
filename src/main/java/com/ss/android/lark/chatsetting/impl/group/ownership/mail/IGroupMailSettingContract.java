package com.ss.android.lark.chatsetting.impl.group.ownership.mail;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/IGroupMailSettingContract;", "", "IModel", "IView", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.e */
public interface IGroupMailSettingContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\bH&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/IGroupMailSettingContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "confirm", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "currentGroupMailSendType", "Lcom/ss/android/lark/chat/entity/chat/Chat$GroupMailSendPermissionType;", "getChatId", "", "getChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", BottomDialog.f17198f, "getIsThread", "", "setGroupMailSendType", "enable", ShareHitPoint.f121869d, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.e$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        Chat.GroupMailSendPermissionType mo128276a();

        /* renamed from: a */
        void mo128277a(IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo128278a(boolean z, Chat.GroupMailSendPermissionType groupMailSendPermissionType);

        /* renamed from: b */
        boolean mo128279b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bJ\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/IGroupMailSettingContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/IGroupMailSettingContract$IView$Delegate;", "closeSetting", "", "refreshGroupMailSendType", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/chat/Chat$GroupMailSendPermissionType;", "showError", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "Delegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.e$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/IGroupMailSettingContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "confirm", "", "getChatId", "", "getIsThread", "", "onSetGroupMailSendType", "enable", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/chat/Chat$GroupMailSendPermissionType;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.e$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo128282a(boolean z, Chat.GroupMailSendPermissionType groupMailSendPermissionType);

            /* renamed from: a */
            boolean mo128283a();

            /* renamed from: b */
            void mo128284b();
        }

        /* renamed from: a */
        void mo128286a();

        /* renamed from: a */
        void mo128287a(ErrorResult errorResult);

        /* renamed from: a */
        void mo128288a(Chat.GroupMailSendPermissionType groupMailSendPermissionType);
    }
}
