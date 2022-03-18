package com.bytedance.ee.bear.templates.center.list.custom;

import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListPresenter;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/custom/CustomTemplateListPresenter;", "Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListPresenter;", "fragment", "Landroidx/fragment/app/Fragment;", "model", "Lcom/bytedance/ee/bear/templates/center/list/custom/CustomTemplateListModel;", "view", "Lcom/bytedance/ee/bear/templates/center/list/custom/CustomTemplateListView;", "(Landroidx/fragment/app/Fragment;Lcom/bytedance/ee/bear/templates/center/list/custom/CustomTemplateListModel;Lcom/bytedance/ee/bear/templates/center/list/custom/CustomTemplateListView;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getModel", "()Lcom/bytedance/ee/bear/templates/center/list/custom/CustomTemplateListModel;", "getView", "()Lcom/bytedance/ee/bear/templates/center/list/custom/CustomTemplateListView;", "onCategoryClicked", "", "categoryTab", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.c.c */
public final class CustomTemplateListPresenter extends BaseTemplateListPresenter {

    /* renamed from: e */
    private final Fragment f30960e;

    /* renamed from: f */
    private final CustomTemplateListModel f30961f;

    /* renamed from: g */
    private final CustomTemplateListView f30962g;

    @Override // com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListPresenter
    /* renamed from: i */
    public Fragment mo44161i() {
        return this.f30960e;
    }

    /* renamed from: m */
    public CustomTemplateListModel mo44162j() {
        return this.f30961f;
    }

    /* renamed from: n */
    public CustomTemplateListView mo44163k() {
        return this.f30962g;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView.IViewDelegate, com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListPresenter
    /* renamed from: a */
    public void mo44151a(CategoryTab categoryTab) {
        int i;
        Intrinsics.checkParameterIsNotNull(categoryTab, "categoryTab");
        super.mo44151a(categoryTab);
        CharSequence categoryTabName = categoryTab.getCategoryTabName();
        if (Intrinsics.areEqual(categoryTabName, mo44161i().getString(R.string.Doc_List_My_Template))) {
            i = 1;
        } else if (Intrinsics.areEqual(categoryTabName, mo44161i().getString(R.string.Doc_List_Share_With_Me))) {
            i = 2;
        } else {
            i = 0;
        }
        mo44162j().mo44214b(i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CustomTemplateListPresenter(androidx.fragment.app.Fragment r5, com.bytedance.ee.bear.templates.center.list.custom.CustomTemplateListModel r6, com.bytedance.ee.bear.templates.center.list.custom.CustomTemplateListView r7) {
        /*
            r4 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.lang.String r0 = "model"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            r0 = r6
            com.bytedance.ee.bear.templates.center.list.a.e r0 = (com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel) r0
            r1 = r7
            com.bytedance.ee.bear.templates.center.list.a.f r1 = (com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView) r1
            r2 = 2131825532(0x7f11137c, float:1.9283923E38)
            java.lang.String r2 = r5.getString(r2)
            java.lang.String r3 = "fragment.getString(R.str….Doc_List_CustomTemplate)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r4.<init>(r5, r0, r1, r2)
            r4.f30960e = r5
            r4.f30961f = r6
            r4.f30962g = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.templates.center.list.custom.CustomTemplateListPresenter.<init>(androidx.fragment.app.Fragment, com.bytedance.ee.bear.templates.center.list.c.b, com.bytedance.ee.bear.templates.center.list.c.d):void");
    }
}
