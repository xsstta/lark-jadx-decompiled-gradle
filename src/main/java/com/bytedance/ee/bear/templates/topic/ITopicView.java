package com.bytedance.ee.bear.templates.topic;

import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/templates/topic/ITopicView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/templates/topic/ITopicView$IViewDelegate;", "getCurrentCategoryTab", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "getEmptyCategory", "Lcom/bytedance/ee/bear/list/loadstateview/EmptyCategory;", "hideCreateLoading", "", "showCreateLoading", "showData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/templates/topic/TopicDataResult;", "showDataLoading", "showLoadingFailed", "throwable", "", "IViewDelegate", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.topic.e */
public interface ITopicView extends IView<IViewDelegate> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/templates/topic/ITopicView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "loadData", "", "topicID", "", ShareHitPoint.f121869d, "", "onLoadFailed", "onTemplateClicked", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.e$a */
    public interface IViewDelegate extends IView.IViewDelegate {
        /* renamed from: a */
        void mo44717a(TemplateV4 templateV4);

        /* renamed from: a */
        void mo44720a(String str, int i);

        /* renamed from: c */
        void mo44722c();
    }

    /* renamed from: a */
    void mo44731a(TopicDataResult topicDataResult);

    /* renamed from: a */
    void mo44733a(Throwable th);

    /* renamed from: d */
    CategoryTab mo44736d();

    /* renamed from: e */
    void mo44737e();

    /* renamed from: f */
    void mo44738f();

    /* renamed from: g */
    void mo44739g();
}
