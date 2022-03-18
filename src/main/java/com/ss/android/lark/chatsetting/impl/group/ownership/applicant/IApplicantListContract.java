package com.ss.android.lark.chatsetting.impl.group.ownership.applicant;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/IApplicantListContract;", "", "()V", "IModel", "IView", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.j */
public final class IApplicantListContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u001c\u0010\r\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000bH&J\u001e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH&J.\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH&¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/IApplicantListContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatName", "", "hasMore", "", "loadInitData", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/InitData;", "loadMoreData", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantViewData;", "setGroupChatAddMemberApprove", "needApply", "updateApplyChatterStatus", "chatId", "inviteeId", "isApproved", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.j$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        String mo128096a();

        /* renamed from: a */
        void mo128097a(IGetDataCallback<InitData> iGetDataCallback);

        /* renamed from: a */
        void mo128098a(String str, String str2, boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo128099a(boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        Chat mo128100b();

        /* renamed from: b */
        void mo128101b(IGetDataCallback<List<ApplicantViewData>> iGetDataCallback);

        /* renamed from: c */
        boolean mo128102c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017J\b\u0010\u0003\u001a\u00020\u0004H&J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0016\u0010\u0011\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0016H&¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/IApplicantListContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/IApplicantListContract$IView$Delegate;", "clearApplicantList", "", "go2Profile", "userId", "", "chatName", "initView", "initData", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/InitData;", "removeItem", "id", "resetApproveSwitchBtn", "boolean", "", "showLoadData", "list", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantViewData;", "showToast", "", "Delegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.j$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\tH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/IApplicantListContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "hasMore", "", "onCloseBtnClick", "", "position", "", "id", "", "onDoneBtnClick", "onLoadMoreData", "onSwitchBtnCheckedChange", "isChecked", "onUserClick", "userId", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.j$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo128109a(int i, String str);

            /* renamed from: a */
            void mo128110a(String str);

            /* renamed from: a */
            void mo128111a(boolean z);

            /* renamed from: a */
            boolean mo128112a();

            /* renamed from: b */
            void mo128113b();

            /* renamed from: b */
            void mo128114b(int i, String str);
        }

        /* renamed from: a */
        void mo128120a();

        /* renamed from: a */
        void mo128121a(int i);

        /* renamed from: a */
        void mo128123a(InitData kVar);

        /* renamed from: a */
        void mo128124a(String str);

        /* renamed from: a */
        void mo128125a(String str, String str2);

        /* renamed from: a */
        void mo128126a(List<ApplicantViewData> list);

        /* renamed from: a */
        void mo128127a(boolean z);
    }
}
