package com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare;

import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.IView;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract;", "", "IModel", "IView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.f */
public interface IFormCollaboratorManagerContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "fetchCollaborators", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "loadMore", "currentShareUserInfoResult", "removeCollaborators", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.f$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        AbstractC68307f<ShareUserInfoResult> mo37155a();

        /* renamed from: a */
        AbstractC68307f<ShareUserInfoResult> mo37156a(ShareUserInfoResult shareUserInfoResult);

        /* renamed from: a */
        AbstractC68307f<SimpleRequestResult> mo37157a(UserInfo userInfo);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\u00042\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH&J\b\u0010\u000e\u001a\u00020\u0004H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract$IView$IViewDelegate;", "finishLoadMore", "", "hideLoading", "setLoadMoreEnable", "enable", "", "showCollaborators", "collaborators", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "showLoading", "updateTitle", "num", "", "IViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.f$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract$IView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "loadMore", "", "onBackClicked", "onInviteMemberClicked", "onRemoveUserClicked", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.f$b$a */
        public interface IViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo37161a(UserInfo userInfo);

            /* renamed from: b */
            void mo37162b();

            /* renamed from: c */
            void mo37163c();

            /* renamed from: d */
            void mo37164d();
        }

        /* renamed from: a */
        void mo37176a();

        /* renamed from: a */
        void mo37177a(int i);

        /* renamed from: a */
        void mo37180a(ArrayList<UserInfo> arrayList);

        /* renamed from: a */
        void mo37181a(boolean z);

        /* renamed from: b */
        void mo37182b();

        /* renamed from: c */
        void mo37183c();
    }
}
