package com.ss.android.lark.core.dependency;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.abtest.api.IABTestService;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/core/dependency/IMomentsDependency;", "", "getMomentsName", "", "getProfileMomentsFragment", "Landroidx/fragment/app/Fragment;", "userId", "isMomentsSettingEnable", "", "onABExperimentsInit", "", "module", "Lcom/ss/android/lark/abtest/api/IABTestService;", "startMomentsSettingActivity", "activity", "Landroid/app/Activity;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.core.dependency.k */
public interface IMomentsDependency {
    /* renamed from: a */
    Fragment mo132985a(String str);

    /* renamed from: a */
    void mo132986a(Activity activity);

    /* renamed from: a */
    void mo132987a(IABTestService iABTestService);

    /* renamed from: a */
    boolean mo132988a();

    /* renamed from: b */
    String mo132989b();
}
