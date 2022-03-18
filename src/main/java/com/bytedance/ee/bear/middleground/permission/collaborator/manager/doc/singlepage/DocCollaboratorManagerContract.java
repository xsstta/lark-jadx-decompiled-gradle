package com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage;

import android.view.View;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.larksuite.framework.mvp.IView;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerContract;", "", "IModel", "IView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.a */
public interface DocCollaboratorManagerContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "checkLockState", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "fetchCollaboratorTotalNum", "", "unlock", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.a$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        AbstractC68307f<IDocPublicPermission> mo37218a();

        /* renamed from: b */
        AbstractC68307f<Boolean> mo37219b();

        /* renamed from: c */
        AbstractC68307f<Integer> mo37220c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0006H&J \u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0006H&¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerContract$IView$IViewDelegate;", "getCurrentTabIndex", "", "hideLockBanner", "", "hideSinglePageTab", "setTitle", "count", "showLockBanner", "tips", "", "canUnlock", "", "clickListener", "Landroid/view/View$OnClickListener;", "showSinglePageTab", "IViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.a$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerContract$IView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onBackClicked", "", "onInviteMemberClicked", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.a$b$a */
        public interface IViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo37228a();

            /* renamed from: b */
            void mo37229b();
        }

        /* renamed from: a */
        void mo37221a();

        /* renamed from: a */
        void mo37222a(int i);

        /* renamed from: a */
        void mo37223a(String str, boolean z, View.OnClickListener onClickListener);

        /* renamed from: b */
        void mo37224b();

        /* renamed from: c */
        void mo37225c();

        /* renamed from: d */
        void mo37226d();

        /* renamed from: e */
        int mo37227e();
    }
}
