package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite;

import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.IView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract;", "", "IModel", "IView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c */
public interface IInviteMemberManagerContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\fH&¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getSelectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "inviteUsers", "", "notify", "", "isContainerPerm", "notes", "", "callback", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "removeSelectedUses", "userInfo", "sendNotifyRequest", "notificationId", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        ArrayList<UserInfo> mo36861a();

        /* renamed from: a */
        void mo36862a(UserInfo userInfo);

        /* renamed from: a */
        void mo36867a(String str);

        /* renamed from: a */
        void mo36868a(boolean z, boolean z2, String str, AbstractC5204e<InviteResult> eVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eJ\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J \u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0006H&J\b\u0010\u0010\u001a\u00020\u0006H&J\u0016\u0010\u0011\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&J\u001e\u0010\u0015\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0004H&J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0004H&J \u0010\u0018\u001a\u00020\u00062\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cH&J\b\u0010\u001d\u001a\u00020\u0006H&¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView$IViewDelegate;", "getNotes", "", "hideLoading", "", "isSelectContainerPerm", "", "isSendNotify", "showInviteFailedToast", "throwable", "", "token", "module", "showInviteSuccessToast", "showLoading", "showNotNotifyToast", "notNotifyUsers", "", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserEntity;", "showNotNotifyToastWithOperate", "notificationId", "showOperateSuccessToast", "showUsers", "selectedUserList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "updateBannerVisible", "IViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0004H&¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "getSelectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "onBack", "", "onInviteBtnClick", "onOperateToastDismiss", "notificationId", "", "onRemoveSelectedUser", "userInfo", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c$b$a */
        public interface IViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo36875a();

            /* renamed from: a */
            void mo36876a(UserInfo userInfo);

            /* renamed from: a */
            void mo36877a(String str);

            /* renamed from: b */
            void mo36878b();

            /* renamed from: c */
            ArrayList<UserInfo> mo36879c();
        }

        /* renamed from: a */
        void mo36887a(String str);

        /* renamed from: a */
        void mo36888a(Throwable th, String str, String str2);

        /* renamed from: a */
        void mo36889a(ArrayList<UserInfo> arrayList);

        /* renamed from: a */
        void mo36890a(List<? extends NotNotifyUserEntity> list);

        /* renamed from: a */
        void mo36891a(List<? extends NotNotifyUserEntity> list, String str);

        /* renamed from: h */
        boolean mo36897h();

        /* renamed from: i */
        boolean mo36898i();

        /* renamed from: j */
        String mo36899j();

        /* renamed from: k */
        void mo36900k();

        /* renamed from: l */
        void mo36901l();

        /* renamed from: m */
        void mo36902m();

        /* renamed from: n */
        void mo36883n();
    }
}
