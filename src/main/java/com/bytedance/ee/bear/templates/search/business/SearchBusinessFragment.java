package com.bytedance.ee.bear.templates.search.business;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.templates.search.base.BaseFragment;
import com.bytedance.ee.bear.templates.search.base.BasePresenter;
import com.bytedance.ee.bear.templates.search.base.BaseView;
import com.bytedance.ee.bear.templates.search.base.ISearchListModel;
import com.bytedance.ee.bear.templates.search.base.ISearchListView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/business/SearchBusinessFragment;", "Lcom/bytedance/ee/bear/templates/search/base/BaseFragment;", "()V", "getIModel", "Lcom/bytedance/ee/bear/templates/search/base/ISearchListModel;", "getIPresenter", "Lcom/bytedance/ee/bear/templates/search/base/BasePresenter;", "model", "view", "Lcom/bytedance/ee/bear/templates/search/base/ISearchListView;", "getIView", "rootView", "Landroid/view/View;", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.search.b.b */
public final class SearchBusinessFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f31368a = new Companion(null);

    /* renamed from: b */
    private HashMap f31369b;

    @Override // com.bytedance.ee.bear.templates.search.base.BaseFragment
    /* renamed from: b */
    public void mo44632b() {
        HashMap hashMap = this.f31369b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.templates.search.base.BaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44632b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/business/SearchBusinessFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo44680a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Fragment instantiate = Fragment.instantiate(context, SearchBusinessFragment.class.getName(), new Bundle());
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "instantiate(context, Sea…lass.java.name, Bundle())");
            return instantiate;
        }
    }

    @Override // com.bytedance.ee.bear.templates.search.base.BaseFragment
    /* renamed from: a */
    public ISearchListModel mo44629a() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
        return new BusinessModel(activity);
    }

    @Override // com.bytedance.ee.bear.templates.search.base.BaseFragment
    /* renamed from: a */
    public ISearchListView mo44630a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
        BaseView eVar = new BaseView(activity, this, view, 6);
        BaseView eVar2 = eVar;
        mo44631a(eVar2);
        eVar.mo44668a(getUserVisibleHint());
        return eVar2;
    }

    @Override // com.bytedance.ee.bear.templates.search.base.BaseFragment
    /* renamed from: a */
    public BasePresenter mo44628a(ISearchListModel fVar, ISearchListView gVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "model");
        Intrinsics.checkParameterIsNotNull(gVar, "view");
        return new BasePresenter(this, fVar, gVar);
    }
}
