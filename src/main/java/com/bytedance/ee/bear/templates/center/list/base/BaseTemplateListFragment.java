package com.bytedance.ee.bear.templates.center.list.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\u001a\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "presenter", "Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListPresenter;", "getIModel", "Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListModel;", "getIPresenter", "model", "view", "Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListView;", "getIView", "rootView", "Landroid/view/View;", "initMVP", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.a.a */
public abstract class BaseTemplateListFragment extends Fragment {

    /* renamed from: a */
    private BaseTemplateListPresenter f30857a;

    /* renamed from: b */
    private HashMap f30858b;

    /* renamed from: a */
    public abstract BaseTemplateListPresenter mo44129a(IBaseTemplateListModel eVar, IBaseTemplateListView fVar);

    /* renamed from: a */
    public abstract IBaseTemplateListModel mo44130a();

    /* renamed from: a */
    public abstract IBaseTemplateListView mo44131a(View view);

    /* renamed from: b */
    public void mo44132b() {
        HashMap hashMap = this.f30858b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        BaseTemplateListPresenter cVar = this.f30857a;
        if (cVar != null) {
            cVar.destroy();
        }
        mo44132b();
    }

    /* renamed from: b */
    private final void m47731b(View view) {
        BaseTemplateListPresenter a = mo44129a(mo44130a(), mo44131a(view));
        this.f30857a = a;
        if (a != null) {
            a.create();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m47731b(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_template_center_list_layout, viewGroup, false);
    }
}
