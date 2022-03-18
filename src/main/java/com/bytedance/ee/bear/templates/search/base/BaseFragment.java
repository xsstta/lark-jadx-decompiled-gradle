package com.bytedance.ee.bear.templates.search.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u001a\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "presenter", "Lcom/bytedance/ee/bear/templates/search/base/BasePresenter;", "searchView", "Lcom/bytedance/ee/bear/templates/search/base/ISearchListView;", "getSearchView", "()Lcom/bytedance/ee/bear/templates/search/base/ISearchListView;", "setSearchView", "(Lcom/bytedance/ee/bear/templates/search/base/ISearchListView;)V", "getIModel", "Lcom/bytedance/ee/bear/templates/search/base/ISearchListModel;", "getIPresenter", "model", "view", "getIView", "rootView", "Landroid/view/View;", "initMVP", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "setUserVisibleHint", "isVisibleToUser", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.search.a.a */
public abstract class BaseFragment extends Fragment {

    /* renamed from: a */
    private BasePresenter f31311a;

    /* renamed from: b */
    private ISearchListView f31312b;

    /* renamed from: c */
    private HashMap f31313c;

    /* renamed from: a */
    public abstract BasePresenter mo44628a(ISearchListModel fVar, ISearchListView gVar);

    /* renamed from: a */
    public abstract ISearchListModel mo44629a();

    /* renamed from: a */
    public abstract ISearchListView mo44630a(View view);

    /* renamed from: b */
    public void mo44632b() {
        HashMap hashMap = this.f31313c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        BasePresenter bVar = this.f31311a;
        if (bVar != null) {
            bVar.destroy();
        }
        mo44632b();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        ISearchListView gVar = this.f31312b;
        if (gVar != null) {
            gVar.mo44668a(z);
        }
        super.setUserVisibleHint(z);
    }

    /* renamed from: b */
    private final void m48272b(View view) {
        BasePresenter a = mo44628a(mo44629a(), mo44630a(view));
        this.f31311a = a;
        if (a != null) {
            a.create();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo44631a(ISearchListView gVar) {
        this.f31312b = gVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m48272b(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_template_center_list_layout, viewGroup, false);
    }
}
