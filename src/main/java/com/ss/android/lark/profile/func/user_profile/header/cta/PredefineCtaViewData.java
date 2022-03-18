package com.ss.android.lark.profile.func.user_profile.header.cta;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/cta/PredefineCtaViewData;", "Lcom/ss/android/lark/profile/func/user_profile/header/cta/BaseCtaViewData;", "enable", "", "name", "", ShareHitPoint.f121869d, "", "drawableRes", "denyReason", "denyReasonDes", "(ZLjava/lang/String;IIILjava/lang/String;)V", "getDrawableRes", "()I", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.header.cta.e */
public class PredefineCtaViewData extends BaseCtaViewData {

    /* renamed from: b */
    private final int f130216b;

    /* renamed from: f */
    public final int mo179832f() {
        return this.f130216b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PredefineCtaViewData(boolean z, String str, int i, int i2, int i3, String str2) {
        super(i, z, str, i3, str2);
        Intrinsics.checkParameterIsNotNull(str2, "denyReasonDes");
        this.f130216b = i2;
    }
}
