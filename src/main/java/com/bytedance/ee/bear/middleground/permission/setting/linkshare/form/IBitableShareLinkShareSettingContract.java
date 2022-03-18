package com.bytedance.ee.bear.middleground.permission.setting.linkshare.form;

import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.LinkShareItem;
import com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission;
import com.larksuite.framework.mvp.IView;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/IBitableShareLinkShareSettingContract;", "", "IModel", "IView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.e */
public interface IBitableShareLinkShareSettingContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/IBitableShareLinkShareSettingContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "fetchPublicPermission", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;", "updateLinkShareEntity", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "newLinkShareEntity", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.e$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        AbstractC68307f<IBitableSharePublicPermission> mo38310a();

        /* renamed from: a */
        AbstractC68307f<SimpleRequestResult> mo38311a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tJ\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/IBitableShareLinkShareSettingContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/IBitableShareLinkShareSettingContract$IView$IViewDelegate;", "hideLoading", "", "setCurrentItem", "currentItem", "", "showLoading", "IViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.e$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/IBitableShareLinkShareSettingContract$IView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onShareItemClick", "", "linkShareItem", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/LinkShareItem;", "currentItemType", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.e$b$a */
        public interface IViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo38315a(LinkShareItem linkShareItem, int i);
        }

        /* renamed from: a */
        void mo38323a();

        /* renamed from: a */
        void mo38324a(int i);

        /* renamed from: b */
        void mo38326b();
    }
}
