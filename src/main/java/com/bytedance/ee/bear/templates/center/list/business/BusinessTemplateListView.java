package com.bytedance.ee.bear.templates.center.list.business;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.templates.center.Tab2;
import com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/business/BusinessTemplateListView;", "Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "rootView", "Landroid/view/View;", "(Landroidx/fragment/app/FragmentActivity;Landroidx/lifecycle/LifecycleOwner;Landroid/view/View;)V", "getEmptyCategory", "Lcom/bytedance/ee/bear/list/loadstateview/EmptyCategory;", "getTab", "Lcom/bytedance/ee/bear/templates/center/Tab2;", "getType", "", "isFilterEmpty", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.b.c */
public final class BusinessTemplateListView extends BaseTemplateListView {
    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: p */
    public int mo44205p() {
        return 3;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: r */
    public Tab2 mo44207r() {
        return Tab2.BUSNISS;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: o */
    public EmptyCategory mo44204o() {
        EmptyCategory emptyCategory = EmptyCategory.f23255s;
        Intrinsics.checkExpressionValueIsNotNull(emptyCategory, "EmptyCategory.EMPTY_CATEGORY_TEMPLATE_BUSINESS");
        return emptyCategory;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: q */
    public boolean mo44206q() {
        C8275a b = mo44191f().getBusinessFilterLiveData().mo5927b();
        boolean z = C8275a.f22369b;
        if (z == null) {
            z = true;
        }
        return Intrinsics.areEqual(b, z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessTemplateListView(FragmentActivity fragmentActivity, LifecycleOwner lifecycleOwner, View view) {
        super(fragmentActivity, lifecycleOwner, view);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
    }
}
