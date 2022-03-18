package com.ss.android.lark.chatsetting.impl.post;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.dto.SelectChatterDTO;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/IPostTypeSettingContract;", "", "IModel", "IView", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.post.a */
public interface IPostTypeSettingContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\nH&J\u0018\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0010j\b\u0012\u0004\u0012\u00020\n`\u0011H&J\u001c\u0010\u0012\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0005H&J\b\u0010\u0015\u001a\u00020\u0016H&J&\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\b2\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u0005H&J,\u0010\u0019\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u0005H&¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/IPostTypeSettingContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "confirm", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/lang/Void;", "currentPostType", "Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;", "getChatId", "", "getChatName", "getChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", BottomDialog.f17198f, "getCurrentWhiteList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getPostWhiteList", "", "Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListViewData;", "isThread", "", "setPostType", ShareHitPoint.f121869d, "updateWhiteList", "selectChatters", "Lcom/ss/android/lark/chatsetting/dto/SelectChatterDTO;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.a$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        Chat.PostType mo129124a();

        /* renamed from: a */
        Chatter mo129125a(String str);

        /* renamed from: a */
        void mo129126a(IGetDataCallback<List<PostWhiteListViewData>> iGetDataCallback);

        /* renamed from: a */
        void mo129127a(Chat.PostType postType, IGetDataCallback<List<PostWhiteListViewData>> iGetDataCallback);

        /* renamed from: a */
        void mo129128a(List<SelectChatterDTO> list, IGetDataCallback<List<PostWhiteListViewData>> iGetDataCallback);

        /* renamed from: b */
        ArrayList<String> mo129129b();

        /* renamed from: b */
        void mo129130b(IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: c */
        String mo129131c();

        /* renamed from: d */
        boolean mo129132d();

        /* renamed from: e */
        String mo129133e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017J\b\u0010\u0003\u001a\u00020\u0004H&J(\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\tj\b\u0012\u0004\u0012\u00020\u0007`\nH&J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH&J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\"\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/IPostTypeSettingContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/chatsetting/impl/post/IPostTypeSettingContract$IView$Delegate;", "closePostSetting", "", "openEditWhiteList", "chatId", "", "whiteList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "refreshPostType", "postType", "Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;", "", "Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListViewData;", "showError", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "showProfile", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatName", "Delegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.a$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/IPostTypeSettingContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "confirm", "", "getChatId", "", "isThread", "", "onAvatarClicked", BottomDialog.f17198f, "onEditWhiteListClicked", "onSetPostType", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.post.a$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo129139a();

            /* renamed from: a */
            void mo129140a(Chat.PostType postType);

            /* renamed from: a */
            void mo129141a(String str);

            /* renamed from: b */
            void mo129142b();

            /* renamed from: c */
            boolean mo129143c();

            /* renamed from: d */
            String mo129144d();
        }

        /* renamed from: a */
        void mo129134a();

        /* renamed from: a */
        void mo129135a(ErrorResult errorResult);

        /* renamed from: a */
        void mo129136a(Chat.PostType postType, List<PostWhiteListViewData> list);

        /* renamed from: a */
        void mo129137a(Chatter chatter, String str, String str2);

        /* renamed from: a */
        void mo129138a(String str, ArrayList<String> arrayList);
    }
}
