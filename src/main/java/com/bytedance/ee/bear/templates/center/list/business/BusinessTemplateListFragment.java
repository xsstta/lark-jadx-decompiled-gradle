package com.bytedance.ee.bear.templates.center.list.business;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListFragment;
import com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListPresenter;
import com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel;
import com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/business/BusinessTemplateListFragment;", "Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListFragment;", "()V", "getIModel", "Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListModel;", "getIPresenter", "Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListPresenter;", "model", "view", "Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListView;", "getIView", "rootView", "Landroid/view/View;", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.b.a */
public final class BusinessTemplateListFragment extends BaseTemplateListFragment {

    /* renamed from: a */
    public static final Companion f30935a = new Companion(null);

    /* renamed from: b */
    private HashMap f30936b;

    @Override // com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListFragment
    /* renamed from: b */
    public void mo44132b() {
        HashMap hashMap = this.f30936b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44132b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/business/BusinessTemplateListFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo44209a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Fragment instantiate = Fragment.instantiate(context, BusinessTemplateListFragment.class.getName(), new Bundle());
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "instantiate(context, Bus…lass.java.name, Bundle())");
            return instantiate;
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListFragment
    /* renamed from: a */
    public IBaseTemplateListModel mo44130a() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
        return new BusinessTemplateListModel(activity);
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListFragment
    /* renamed from: a */
    public IBaseTemplateListView mo44131a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
        return new BusinessTemplateListView(activity, this, view);
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListFragment
    /* renamed from: a */
    public BaseTemplateListPresenter mo44129a(IBaseTemplateListModel eVar, IBaseTemplateListView fVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "model");
        Intrinsics.checkParameterIsNotNull(fVar, "view");
        String string = getString(R.string.Doc_List_EnterpriseTemplate);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.Doc_List_EnterpriseTemplate)");
        return new BaseTemplateListPresenter(this, eVar, fVar, string);
    }
}
