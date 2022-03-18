package com.ss.android.lark.profile.func.v3.userprofile;

import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import dagger.internal.AbstractC68174b;
import javax.inject.Provider;

public final class ax implements AbstractC68174b<UserProfileModelV3> {

    /* renamed from: a */
    private final Provider<IProfileModuleDependency> f130389a;

    /* renamed from: c */
    public static UserProfileModelV3 m204138c() {
        return new UserProfileModelV3();
    }

    /* renamed from: a */
    public UserProfileModelV3 mo47880b() {
        UserProfileModelV3 c = m204138c();
        ay.m204141a(c, this.f130389a.mo47880b());
        return c;
    }
}
