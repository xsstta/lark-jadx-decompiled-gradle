package com.ss.android.lark.chatsetting.impl.group.ownership.sharing;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/ISharingHistoryContract;", "", "IModel", "IView", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.d */
public interface ISharingHistoryContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J&\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\r0\nH&J\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\nH&J\u001c\u0010\u0011\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\nH&J\u001c\u0010\u0013\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\nH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/ISharingHistoryContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "canLoadMore", "", "deactivateSharing", "", "selectedIds", "", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getChat", "chatId", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatter", BottomDialog.f17198f, "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "loadData", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData;", "loadInitData", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.d$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo128426a(IGetDataCallback<List<SharingHistoryViewData>> iGetDataCallback);

        /* renamed from: a */
        void mo128427a(String str, IGetDataCallback<Chatter> iGetDataCallback);

        /* renamed from: a */
        void mo128428a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        boolean mo128429a();

        /* renamed from: b */
        void mo128430b(IGetDataCallback<List<SharingHistoryViewData>> iGetDataCallback);

        /* renamed from: b */
        void mo128431b(String str, IGetDataCallback<Chat> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H&J\b\u0010\u000b\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H&J\b\u0010\u0012\u001a\u00020\u0004H&J\b\u0010\u0013\u001a\u00020\u0004H&J\u0018\u0010\u0014\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006H&J\b\u0010\u0016\u001a\u00020\u0004H&J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0007H&¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/ISharingHistoryContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/ISharingHistoryContract$IView$Delegate;", "activateItems", "", "ids", "", "", "addItemList", "items", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData;", "hideLoading", "openBotProfile", BottomDialog.f17198f, "openChatProfile", "chatId", "openChatWindow", "openUserProfile", "refreshComplete", "showError", "showInitData", "initData", "showLoading", "showToast", "msg", "Delegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.d$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u00052\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/ISharingHistoryContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "canLoadMore", "", "onChatClick", "", "chatId", "", "onChatterClick", BottomDialog.f17198f, "onConfirmClick", "selectedIds", "", "onLoadMore", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.d$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo128444a(String str);

            /* renamed from: a */
            void mo128445a(List<String> list);

            /* renamed from: a */
            boolean mo128446a();

            /* renamed from: b */
            void mo128447b();

            /* renamed from: b */
            void mo128448b(String str);
        }

        /* renamed from: a */
        void mo128432a();

        /* renamed from: a */
        void mo128433a(String str);

        /* renamed from: a */
        void mo128434a(List<SharingHistoryViewData> list);

        /* renamed from: b */
        void mo128435b();

        /* renamed from: b */
        void mo128436b(String str);

        /* renamed from: b */
        void mo128437b(List<SharingHistoryViewData> list);

        /* renamed from: c */
        void mo128438c();

        /* renamed from: c */
        void mo128439c(String str);

        /* renamed from: c */
        void mo128440c(List<String> list);

        /* renamed from: d */
        void mo128441d();

        /* renamed from: d */
        void mo128442d(String str);

        /* renamed from: e */
        void mo128443e(String str);
    }
}
