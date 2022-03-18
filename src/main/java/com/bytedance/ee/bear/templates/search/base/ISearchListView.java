package com.bytedance.ee.bear.templates.search.base;

import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.larksuite.framework.mvp.IView;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 J \u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0004H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0019\u001a\u00020\u0004H&J\b\u0010\u001a\u001a\u00020\u0004H&J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0014H&¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/base/ISearchListView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/templates/search/base/ISearchListView$IViewDelegate;", "addTemplateGroup", "", "categoryTabList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "Lkotlin/collections/ArrayList;", "getCurrentCategoryTab", "getEmptyCategory", "Lcom/bytedance/ee/bear/list/loadstateview/EmptyCategory;", "getTab", "Lcom/bytedance/ee/bear/templates/center/Tab2;", "hideCreateLoading", "scrollToTargetCategory", "index", "", "setLoadMoreEnable", "enable", "", "showCategoryIndicator", "templateGroupTab", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "showCategoryTab", "showCreateLoading", "showDataLoading", "showLoadingFailed", "throwable", "", "visiableToUser", "visiable", "IViewDelegate", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.search.a.g */
public interface ISearchListView extends IView<IViewDelegate> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/base/ISearchListView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "loadMore", "", "onLoadFailed", "onSearchChange", "searchKey", "", "onTemplateClicked", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "onTemplateDelete", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.g$a */
    public interface IViewDelegate extends IView.IViewDelegate {
        /* renamed from: a */
        void mo44634a(TemplateV4 templateV4);

        /* renamed from: a */
        void mo44637a(String str);

        /* renamed from: b */
        void mo44639b(TemplateV4 templateV4);

        /* renamed from: d */
        void mo44641d();

        /* renamed from: e */
        void mo44642e();
    }

    /* renamed from: a */
    void mo44664a(TemplateGroupTab templateGroupTab);

    /* renamed from: a */
    void mo44666a(Throwable th);

    /* renamed from: a */
    void mo44667a(ArrayList<CategoryTab> arrayList);

    /* renamed from: a */
    void mo44668a(boolean z);

    /* renamed from: b */
    void mo44670b(boolean z);

    /* renamed from: e */
    CategoryTab mo44673e();

    /* renamed from: f */
    void mo44674f();

    /* renamed from: g */
    void mo44675g();

    /* renamed from: h */
    void mo44676h();
}
