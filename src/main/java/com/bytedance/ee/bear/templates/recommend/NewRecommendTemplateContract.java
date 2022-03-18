package com.bytedance.ee.bear.templates.recommend;

import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.larksuite.framework.mvp.IView;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateContract;", "", "IModel", "IView", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.recommend.a */
public interface NewRecommendTemplateContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H&J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "createTemplate", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "parentToken", "", "module", "loadRecommendTemplates", "Lcom/bytedance/ee/bear/templates/recommend/RecommendTemplates;", "setSelectedTemplate", "", "fromRecommend", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.a$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        AbstractC68307f<RecommendTemplates> mo44543a();

        /* renamed from: a */
        AbstractC68307f<DocumentCreateInfo> mo44544a(TemplateV4 templateV4, String str, String str2);

        /* renamed from: a */
        void mo44545a(TemplateV4 templateV4, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00042\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateContract$IView$IViewDelegate;", "hideCreateLoading", "", "showCreateLoading", "showDataLoading", "showLoadFailed", "throwable", "", "showTemplates", "templates", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "Lkotlin/collections/ArrayList;", "updateEnable", "enable", "", "IViewDelegate", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.a$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateContract$IView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onMoreClicked", "", "onTemplateSelected", "position", "", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.recommend.a$b$a */
        public interface IViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo44551a();

            /* renamed from: a */
            void mo44552a(int i, TemplateV4 templateV4);
        }

        /* renamed from: a */
        void mo44546a();

        /* renamed from: a */
        void mo44547a(Throwable th);

        /* renamed from: a */
        void mo44548a(ArrayList<TemplateV4> arrayList);

        /* renamed from: b */
        void mo44549b();

        /* renamed from: c */
        void mo44550c();
    }
}
