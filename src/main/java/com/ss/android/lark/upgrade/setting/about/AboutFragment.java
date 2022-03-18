package com.ss.android.lark.upgrade.setting.about;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.upgrade.setting.about.mvp.AboutModel;
import com.ss.android.lark.upgrade.setting.about.mvp.AboutPresenter;
import com.ss.android.lark.upgrade.setting.about.mvp.MineAboutLarkView;
import com.ss.android.lark.utils.C57887w;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\u001a\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/AboutFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mPresenter", "Lcom/ss/android/lark/upgrade/setting/about/mvp/AboutPresenter;", "mRootView", "Landroid/view/View;", "initMVP", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onResume", "onViewCreated", "view", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.upgrade.setting.about.a */
public final class AboutFragment extends BaseFragment {

    /* renamed from: a */
    private AboutPresenter f142126a;

    /* renamed from: b */
    private View f142127b;

    /* renamed from: c */
    private HashMap f142128c;

    /* renamed from: a */
    public View mo195772a(int i) {
        if (this.f142128c == null) {
            this.f142128c = new HashMap();
        }
        View view = (View) this.f142128c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f142128c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo195773a() {
        HashMap hashMap = this.f142128c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        AboutPresenter bVar = this.f142126a;
        if (bVar != null) {
            bVar.destroy();
        }
        super.onDestroyView();
        mo195773a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AboutPresenter bVar = this.f142126a;
        if (bVar != null) {
            bVar.mo195808d();
        }
    }

    /* renamed from: b */
    private final void m223900b() {
        AboutModel aVar = new AboutModel();
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        AboutPresenter bVar = new AboutPresenter(aVar, new MineAboutLarkView(this, context));
        this.f142126a = bVar;
        if (bVar != null) {
            bVar.create();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        FragmentActivity activity;
        Window window;
        super.onActivityCreated(bundle);
        if (!DesktopUtil.m144301a((Context) getActivity()) && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            window.setBackgroundDrawable(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m223900b();
        C57887w.m224670a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        int i;
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        if (DesktopUtil.m144301a(context)) {
            i = R.layout.activity_about_desktop;
        } else {
            i = R.layout.activity_about;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.f142127b = inflate;
        return inflate;
    }
}
