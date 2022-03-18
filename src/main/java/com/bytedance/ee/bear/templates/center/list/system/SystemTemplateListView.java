package com.bytedance.ee.bear.templates.center.list.system;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.banner.AbstractC4339e;
import com.bytedance.ee.bear.banner.bean.BannerScene;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.Tab2;
import com.bytedance.ee.bear.templates.center.list.Category;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListView;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.p3520e.C70042b;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ0\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\"H\u0002J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateListView;", "Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "rootView", "Landroid/view/View;", "(Landroidx/fragment/app/FragmentActivity;Landroidx/fragment/app/Fragment;Landroid/view/View;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "mDocsBannerManager", "Lcom/bytedance/ee/bear/banner/IDocsBannerManager;", "addTemplateGroup", "", "categoryTabList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "Lkotlin/collections/ArrayList;", "pageNumber", "", ShareHitPoint.f121868c, "create", "destroy", "getEmptyCategory", "Lcom/bytedance/ee/bear/list/loadstateview/EmptyCategory;", "getTab", "Lcom/bytedance/ee/bear/templates/center/Tab2;", "getType", "initUGBanner", "isFilterEmpty", "", "isSameCategory", AbstractC60044a.f149675a, "Lcom/bytedance/ee/bear/templates/center/list/Category;", C63954b.f161494a, "merge", "category", "showSingleCategoryTab", "categoryTab", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.d.d */
public final class SystemTemplateListView extends BaseTemplateListView {

    /* renamed from: f */
    private AbstractC4339e f30990f;

    /* renamed from: g */
    private final Fragment f30991g;

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: p */
    public int mo44205p() {
        return 1;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: r */
    public Tab2 mo44207r() {
        return Tab2.SYSTEM;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m47938s();
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: o */
    public EmptyCategory mo44204o() {
        EmptyCategory emptyCategory = EmptyCategory.f23251o;
        Intrinsics.checkExpressionValueIsNotNull(emptyCategory, "EmptyCategory.EMPTY_CATEGORY_TEMPLATE_SYSTEM");
        return emptyCategory;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListView, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        AbstractC4339e eVar = this.f30990f;
        if (eVar != null) {
            eVar.mo16919c();
        }
        super.destroy();
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: q */
    public boolean mo44206q() {
        C8275a b = mo44191f().getSystemFilterLiveData().mo5927b();
        boolean z = C8275a.f22369b;
        if (z == null) {
            z = true;
        }
        return Intrinsics.areEqual(b, z);
    }

    /* renamed from: s */
    private final void m47938s() {
        boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.ug.reach.banner.enable", false);
        AbstractC4339e eVar = (AbstractC4339e) KoinJavaComponent.m268613a(AbstractC4339e.class, C70042b.m268676a("template"), null, 4, null);
        this.f30990f = eVar;
        if (eVar != null) {
            eVar.mo16917a(a);
        }
        AbstractC4339e eVar2 = this.f30990f;
        if (eVar2 != null) {
            eVar2.mo16915a(BannerScene.TEMPLATE);
        }
        AbstractC4339e eVar3 = this.f30990f;
        if (eVar3 != null) {
            eVar3.mo16914a((ViewGroup) mo44199n().findViewById(R.id.topContainer), mo44198m());
        }
        AbstractC4339e eVar4 = this.f30990f;
        if (eVar4 != null) {
            eVar4.mo16913a();
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView, com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListView
    /* renamed from: a */
    public void mo44179a(CategoryTab categoryTab) {
        Intrinsics.checkParameterIsNotNull(categoryTab, "categoryTab");
        super.mo44179a(categoryTab);
        if (categoryTab.getCategoryList().size() == 1 && !categoryTab.getCategoryList().get(0).getLoadFirstTab()) {
            mo44192g();
        }
    }

    /* renamed from: a */
    private final void m47936a(Category category) {
        Long l;
        List<Number> sorted = CollectionsKt.sorted(CollectionsKt.toList(category.getCategoryPage().keySet()));
        category.getTemplates().clear();
        category.getTemplateMap().clear();
        for (Number number : sorted) {
            List<TemplateV4> list = category.getCategoryPage().get(Integer.valueOf(number.intValue()));
            if (list != null) {
                for (T t : list) {
                    if (!category.getTemplateMap().containsKey(t.getId())) {
                        category.getTemplates().add(t);
                        category.getTemplateMap().put(t.getId(), t);
                    } else {
                        TemplateV4 templateV4 = category.getTemplateMap().get(t.getId());
                        long updateTime = t.getUpdateTime();
                        if (templateV4 != null) {
                            l = Long.valueOf(templateV4.getUpdateTime());
                        } else {
                            l = null;
                        }
                        if (l == null) {
                            Intrinsics.throwNpe();
                        }
                        if (updateTime > l.longValue()) {
                            category.getTemplates().remove(templateV4);
                            category.getTemplates().add(t);
                            category.getTemplateMap().put(t.getId(), t);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m47937a(Category category, Category category2) {
        if (Intrinsics.areEqual(category.getName(), category2.getName()) || (category.getCategoryId() != -1 && category.getCategoryId() == category2.getCategoryId())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SystemTemplateListView(FragmentActivity fragmentActivity, Fragment fragment, View view) {
        super(fragmentActivity, fragment, view);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f30991g = fragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0044 A[SYNTHETIC] */
    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView, com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListView
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44183a(java.util.ArrayList<com.bytedance.ee.bear.templates.center.list.CategoryTab> r13, int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.templates.center.list.system.SystemTemplateListView.mo44183a(java.util.ArrayList, int, int):void");
    }
}
