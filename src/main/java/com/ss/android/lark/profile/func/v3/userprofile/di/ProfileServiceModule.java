package com.ss.android.lark.profile.func.v3.userprofile.di;

import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.profile.service.C52904e;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/di/ProfileServiceModule;", "", "()V", "provideProfileLauncherService", "Lcom/ss/android/lark/biz/core/api/IProfileLauncherService;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
@Module
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.di.c */
public final class ProfileServiceModule {
    @Provides
    @Singleton
    /* renamed from: a */
    public final AbstractC29542ad mo180208a() {
        C52904e a = C52904e.m204638a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ProfileLauncherService.inst()");
        return a;
    }
}
