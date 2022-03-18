package com.ss.android.lark.profile.func.v3.userprofile.cta;

import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/cta/ChatCtaViewBinder;", "Lcom/ss/android/lark/profile/func/v3/userprofile/cta/CtaViewBinder;", "()V", "getIconResource", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState$CtaInfo;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.a.a */
public final class ChatCtaViewBinder extends CtaViewBinder {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.profile.func.v3.userprofile.cta.CtaViewBinder
    /* renamed from: a */
    public int mo179965a(UserProfileState.CtaInfo aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$getIconResource");
        if (aVar.mo180070g()) {
            return R.drawable.ud_icon_history_outlined;
        }
        Integer num = mo179966a().get(aVar.mo180066d());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
