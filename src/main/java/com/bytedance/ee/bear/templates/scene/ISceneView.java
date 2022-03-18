package com.bytedance.ee.bear.templates.scene;

import com.bytedance.ee.bear.templates.TemplateV4;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.mvp.IView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rJ\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/templates/scene/ISceneView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/templates/scene/ISceneView$IViewDelegate;", "getEmptyCategory", "Lcom/bytedance/ee/bear/list/loadstateview/EmptyCategory;", "showData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/templates/scene/TopicDataResult;", "showDataLoading", "showLoadingFailed", "throwable", "", "IViewDelegate", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.scene.e */
public interface ISceneView extends IView<IViewDelegate> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/templates/scene/ISceneView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "loadData", "", "topicID", "", "onLoadFailed", "onTemplateClicked", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.scene.e$a */
    public interface IViewDelegate extends IView.IViewDelegate {
        /* renamed from: a */
        void mo44590a(TemplateV4 templateV4);

        /* renamed from: a */
        void mo44591a(String str);

        /* renamed from: b */
        void mo44592b();
    }

    /* renamed from: a */
    void mo44598a(TopicDataResult topicDataResult);

    /* renamed from: a */
    void mo44600a(Throwable th);

    /* renamed from: d */
    void mo44603d();
}
