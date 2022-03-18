package com.ss.android.lark.profile.func.v3.userprofile;

import android.os.Bundle;
import dagger.internal.AbstractC68174b;
import javax.inject.Provider;

public final class bd implements AbstractC68174b<UserProfileViewModel> {

    /* renamed from: a */
    private final Provider<Bundle> f130444a;

    /* renamed from: b */
    private final Provider<UserProfileModelV3> f130445b;

    /* renamed from: a */
    public UserProfileViewModel mo47880b() {
        UserProfileViewModel a = m204242a(this.f130444a.mo47880b());
        be.m204245a(a, this.f130445b.mo47880b());
        return a;
    }

    /* renamed from: a */
    public static UserProfileViewModel m204242a(Bundle bundle) {
        return new UserProfileViewModel(bundle);
    }
}
