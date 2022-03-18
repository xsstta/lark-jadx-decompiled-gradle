package com.ss.android.lark.profile.func.v3.userprofile.action;

import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import dagger.internal.AbstractC68174b;
import javax.inject.Provider;

/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.action.d */
public final class C52673d implements AbstractC68174b<ActionBtnDependencyImpl> {

    /* renamed from: a */
    private final Provider<FragmentActivity> f130375a;

    /* renamed from: b */
    private final Provider<BaseFragment> f130376b;

    /* renamed from: c */
    private final Provider<IActionBtnClickDependency> f130377c;

    /* renamed from: d */
    private final Provider<IProfileModuleDependency> f130378d;

    /* renamed from: a */
    public ActionBtnDependencyImpl mo47880b() {
        ActionBtnDependencyImpl a = m204111a(this.f130375a.mo47880b(), this.f130376b.mo47880b(), this.f130377c.mo47880b());
        C52674e.m204114a(a, this.f130378d.mo47880b());
        return a;
    }

    /* renamed from: a */
    public static ActionBtnDependencyImpl m204111a(FragmentActivity fragmentActivity, BaseFragment baseFragment, IActionBtnClickDependency fVar) {
        return new ActionBtnDependencyImpl(fragmentActivity, baseFragment, fVar);
    }
}
