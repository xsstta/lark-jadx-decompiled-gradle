package com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/IJoinLeaveHistoryContract;", "", "IJoinLeaveHistoryModel", "IJoinLeaveHistoryView", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.a */
public interface IJoinLeaveHistoryContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u001c\u0010\t\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007H&J\b\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/IJoinLeaveHistoryContract$IJoinLeaveHistoryModel;", "Lcom/larksuite/framework/mvp/IModel;", "getChatById", "", "chatId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatJoinLeaveHistory", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData;", "hasMore", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.a$a */
    public interface IJoinLeaveHistoryModel extends IModel {
        /* renamed from: a */
        void mo128215a(IGetDataCallback<List<JoinLeaveViewData>> iGetDataCallback);

        /* renamed from: a */
        void mo128216a(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        boolean mo128217a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0004H&J\u0016\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\b\u0010\u000e\u001a\u00020\u0004H&J\u0016\u0010\u000f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\b\u0010\u0010\u001a\u00020\u0004H&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/IJoinLeaveHistoryContract$IJoinLeaveHistoryView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/IJoinLeaveHistoryContract$IJoinLeaveHistoryView$IDelegate;", "goChatProfile", "", "chatId", "", "hideLoading", "openChat", "refreshComplete", "showInitData", "joinLeaveDatas", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData;", "showLoadFailed", "showLoadMoreData", "showLoading", "IDelegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.a$b */
    public interface IJoinLeaveHistoryView extends IView<IDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/IJoinLeaveHistoryContract$IJoinLeaveHistoryView$IDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "contentCanLoadMore", "", "onChatClick", "", "chatId", "", "onContentLoadMore", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.a$b$a */
        public interface IDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo128225a(String str);

            /* renamed from: a */
            boolean mo128226a();

            /* renamed from: b */
            void mo128227b();
        }

        /* renamed from: a */
        void mo128218a();

        /* renamed from: a */
        void mo128219a(String str);

        /* renamed from: a */
        void mo128220a(List<JoinLeaveViewData> list);

        /* renamed from: b */
        void mo128221b();

        /* renamed from: b */
        void mo128222b(String str);

        /* renamed from: b */
        void mo128223b(List<JoinLeaveViewData> list);

        /* renamed from: c */
        void mo128224c();
    }
}
