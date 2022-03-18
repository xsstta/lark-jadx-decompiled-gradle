package com.bytedance.ee.bear.middleground.permission.setting.doc.v2.comment;

import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.larksuite.framework.mvp.IView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/IDocPermCommentContract;", "", "IModel", "IView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.e */
public interface IDocPermCommentContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/IDocPermCommentContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "updateCommentEdit", "", "callback", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "updateCommentRead", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.e$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo38162a(AbstractC10169g gVar);

        /* renamed from: b */
        void mo38163b(AbstractC10169g gVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/IDocPermCommentContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/IDocPermCommentContract$IView$IViewDelegate;", "setLoading", "", "visible", "", "updateView", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "IViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.e$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/IDocPermCommentContract$IView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onClickEditItem", "", "onClickReadItem", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.e$b$a */
        public interface IViewDelegate extends IView.IViewDelegate {
            /* renamed from: b */
            void mo38166b();

            /* renamed from: c */
            void mo38167c();
        }

        /* renamed from: a */
        void mo38172a(DocPermSetInfo docPermSetInfo);

        /* renamed from: a */
        void mo38173a(boolean z);
    }
}
