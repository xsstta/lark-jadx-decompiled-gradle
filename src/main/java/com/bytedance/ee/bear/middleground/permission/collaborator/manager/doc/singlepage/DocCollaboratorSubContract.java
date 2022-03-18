package com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage;

import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.IView;
import io.reactivex.AbstractC68307f;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubContract;", "", "IModel", "IView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.f */
public interface DocCollaboratorSubContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "checkRemoveMemberLock", "Lio/reactivex/Flowable;", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "checkSharePermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "checkUpdateMemberPermissionLock", "newPermission", "", "fetchCollaborators", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "lastLabel", "", "removeCollaborator", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "setCollaboratorPermission", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserResult;", "transferOwner", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.f$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        AbstractC68307f<IDocUserPermission> mo37254a();

        /* renamed from: a */
        AbstractC68307f<NotNotifyUserResult> mo37255a(int i, UserInfo userInfo);

        /* renamed from: a */
        AbstractC68307f<NotNotifyUserResult> mo37256a(UserInfo userInfo);

        /* renamed from: a */
        AbstractC68307f<ShareUserInfoResult> mo37257a(String str);

        /* renamed from: b */
        AbstractC68307f<Boolean> mo37258b(int i, UserInfo userInfo);

        /* renamed from: b */
        AbstractC68307f<SimpleRequestResult> mo37259b(UserInfo userInfo);

        /* renamed from: c */
        AbstractC68307f<Boolean> mo37260c(UserInfo userInfo);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015J\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\b\u0010\u0010\u001a\u00020\u0004H&J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH&¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubContract$IView$IViewDelegate;", "finishLoadMore", "", "setDescVisible", "visible", "", "setHasMore", "hasMore", "setLoading", "show", "showCollaborators", "collaborators", "", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "showLoadingImmediately", "updateCollaborator", "position", "", "userInfo", "IViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.f$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubContract$IView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onCollaboratorPermissionClick", "", "position", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onLoadMore", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.f$b$a */
        public interface IViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo37268a();

            /* renamed from: a */
            void mo37269a(int i, UserInfo userInfo);
        }

        /* renamed from: a */
        void mo37261a();

        /* renamed from: a */
        void mo37262a(int i, UserInfo userInfo);

        /* renamed from: a */
        void mo37263a(List<? extends UserInfo> list);

        /* renamed from: a */
        void mo37264a(boolean z);

        /* renamed from: b */
        void mo37265b();

        /* renamed from: b */
        void mo37266b(boolean z);

        /* renamed from: c */
        void mo37267c(boolean z);
    }
}
