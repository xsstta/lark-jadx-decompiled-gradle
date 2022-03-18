package com.ss.android.lark.chatsetting.impl.group.ownership.group_search;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/IGroupSearchEnableContract;", "", "IModel", "IView", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.c */
public interface IGroupSearchEnableContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/IGroupSearchEnableContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getChatById", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getCurChat", "getDefaultAvatarLocalPath", "", "context", "Landroid/content/Context;", "isInfoComplete", "", "updateGroupSearchEnable", "enable", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.c$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        Chat mo128180a();

        /* renamed from: a */
        String mo128181a(Context context);

        /* renamed from: a */
        void mo128182a(IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo128183a(boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        boolean mo128184b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fJ\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\n\u001a\u00020\u0004H&J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/IGroupSearchEnableContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/IGroupSearchEnableContract$IView$Delegate;", "gotoAvatarPage", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "targetImagePaths", "", "", "handleBackPressed", "updateView", "Delegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.c$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/IGroupSearchEnableContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "getCurChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isInfoComplete", "", "isPublic", "onAvatarLayoutClicked", "", "onSaveSetting", "isChecked", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.c$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo128190a();

            /* renamed from: a */
            void mo128191a(boolean z, IGetDataCallback<Chat> iGetDataCallback);

            /* renamed from: b */
            boolean mo128192b();

            /* renamed from: c */
            boolean mo128193c();

            /* renamed from: d */
            Chat mo128194d();
        }

        /* renamed from: a */
        void mo128165a(Chat chat);

        /* renamed from: a */
        void mo128166a(Chat chat, List<String> list);

        /* renamed from: c */
        void mo128171c();
    }
}
