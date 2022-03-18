package com.bytedance.ee.bear.templates.center.list.custom;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.templates.center.Tab2;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/custom/CustomTemplateListView;", "Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "rootView", "Landroid/view/View;", "(Landroidx/fragment/app/FragmentActivity;Landroidx/lifecycle/LifecycleOwner;Landroid/view/View;)V", "getEmptyCategory", "Lcom/bytedance/ee/bear/list/loadstateview/EmptyCategory;", "getEmptyClickListener", "Lcom/bytedance/ee/bear/list/loadstateview/LoadStateView$EmptyStateHandler;", "getTab", "Lcom/bytedance/ee/bear/templates/center/Tab2;", "getType", "", "isFilterEmpty", "", "onTemplateGroupAllDelete", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.c.d */
public final class CustomTemplateListView extends BaseTemplateListView {
    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: p */
    public int mo44205p() {
        return 2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/templates/center/list/custom/CustomTemplateListView$getEmptyClickListener$1", "Lcom/bytedance/ee/bear/list/loadstateview/LoadStateView$EmptyStateHandler;", "onMasterButtonTouchEvent", "", "onMasterTextTouchEvent", "onSlaveButtonTouchEvent", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.c.d$a */
    public static final class C11509a implements LoadStateView.AbstractC8570b {
        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
        /* renamed from: a */
        public void mo32735a() {
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
        /* renamed from: b */
        public void mo32736b() {
        }

        C11509a() {
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
        /* renamed from: c */
        public void mo32737c() {
            ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17292a("https://www.feishu.cn/hc/zh-CN/articles/360049067736");
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: r */
    public Tab2 mo44207r() {
        return Tab2.CUSTOM;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListView
    /* renamed from: l */
    public LoadStateView.AbstractC8570b mo44197l() {
        return new C11509a();
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: o */
    public EmptyCategory mo44204o() {
        EmptyCategory emptyCategory;
        if (mo44190e()) {
            emptyCategory = EmptyCategory.f23252p;
        } else {
            emptyCategory = EmptyCategory.f23253q;
        }
        Intrinsics.checkExpressionValueIsNotNull(emptyCategory, "emptyCategory");
        return emptyCategory;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView
    /* renamed from: q */
    public boolean mo44206q() {
        C8275a b = mo44191f().getCustomFilterLiveData().mo5927b();
        boolean z = C8275a.f22369b;
        if (z == null) {
            z = true;
        }
        return Intrinsics.areEqual(b, z);
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListView, com.bytedance.ee.bear.templates.TemplateAdapter.TemplateClickListener
    /* renamed from: a */
    public void mo43996a() {
        if (mo44189d() >= 0 && mo44189d() < mo44185b().mo70673b().size()) {
            Object obj = mo44185b().mo70673b().get(mo44189d());
            Intrinsics.checkExpressionValueIsNotNull(obj, "categoryIndicatorAdapter.data[currentIndicatorPos]");
            mo44179a((CategoryTab) obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomTemplateListView(FragmentActivity fragmentActivity, LifecycleOwner lifecycleOwner, View view) {
        super(fragmentActivity, lifecycleOwner, view);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
    }
}
