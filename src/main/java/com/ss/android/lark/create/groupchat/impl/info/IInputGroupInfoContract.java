package com.ss.android.lark.create.groupchat.impl.info;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/IInputGroupInfoContract;", "", "()V", "IModel", "IView", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.info.a */
public final class IInputGroupInfoContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/IInputGroupInfoContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "groupCreateInfo", "Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "getGroupCreateInfo", "()Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "checkGroupName", "", "name", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "createGroup", "context", "Landroid/content/Context;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.a$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        GroupCreateInfo mo133980a();

        /* renamed from: a */
        void mo133981a(Context context, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo133982a(String str, IGetDataCallback<Boolean> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tH&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/IInputGroupInfoContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/create/groupchat/impl/info/IInputGroupInfoContract$IView$Delegate;", "enableConfirmBtn", "", C63954b.f161494a, "", "initView", "chatName", "", "chatDesc", "onGroupChatCreate", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "showError", "errorMsg", "Delegate", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.a$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/IInputGroupInfoContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onCreateGroupBtnClicked", "", "context", "Landroid/content/Context;", "name", "", "desc", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.create.groupchat.impl.info.a$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo133987a(Context context, String str, String str2);
        }

        /* renamed from: a */
        void mo133983a(Chat chat);

        /* renamed from: a */
        void mo133984a(String str);

        /* renamed from: a */
        void mo133985a(String str, String str2);

        /* renamed from: a */
        void mo133986a(boolean z);
    }
}
