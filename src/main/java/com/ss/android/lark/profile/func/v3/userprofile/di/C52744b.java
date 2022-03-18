package com.ss.android.lark.profile.func.v3.userprofile.di;

import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.base.fragment.BaseFragment;
import dagger.internal.AbstractC68174b;
import dagger.internal.C68177e;
import javax.inject.Provider;

/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.di.b */
public final class C52744b implements AbstractC68174b<BaseFragment> {

    /* renamed from: a */
    private final Provider<FragmentActivity> f130463a;

    /* renamed from: a */
    public BaseFragment mo47880b() {
        return m204276a(this.f130463a.mo47880b());
    }

    /* renamed from: a */
    public static BaseFragment m204276a(FragmentActivity fragmentActivity) {
        return (BaseFragment) C68177e.m264826b(ProfileFragmentModule.f130462a.mo180206a(fragmentActivity));
    }
}
