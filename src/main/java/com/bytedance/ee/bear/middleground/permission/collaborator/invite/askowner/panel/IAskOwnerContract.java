package com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel;

import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.larksuite.framework.mvp.IView;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/IAskOwnerContract;", "", "IModel", "IView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.f */
public interface IAskOwnerContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/IAskOwnerContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "askOwner", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "perm", "", "notes", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.f$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        AbstractC68307f<SimpleRequestResult> mo36988a(int i, String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/IAskOwnerContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/IAskOwnerContract$IView$IViewDelegate;", "getNotes", "", "getSelectedPermission", "", "IViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.f$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/IAskOwnerContract$IView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onOwnerNameClicked", "", "ownerId", "", "onRequestBtnClicked", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.f$b$a */
        public interface IViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo36994a();

            /* renamed from: a */
            void mo36995a(String str);
        }

        /* renamed from: b */
        String mo37001b();

        /* renamed from: c */
        int mo37002c();
    }
}
