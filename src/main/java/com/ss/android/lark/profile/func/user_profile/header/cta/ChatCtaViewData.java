package com.ss.android.lark.profile.func.user_profile.header.cta;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/cta/ChatCtaViewData;", "Lcom/ss/android/lark/profile/func/user_profile/header/cta/PredefineCtaViewData;", "enable", "", "name", "", ShareHitPoint.f121869d, "", "drawableRes", "denyReason", "denyReasonDes", "showGuide", "(ZLjava/lang/String;IIILjava/lang/String;Z)V", "getShowGuide", "()Z", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.header.cta.a */
public final class ChatCtaViewData extends PredefineCtaViewData {

    /* renamed from: b */
    private final boolean f130202b;

    /* renamed from: e */
    public final boolean mo179823e() {
        return this.f130202b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatCtaViewData(boolean z, String str, int i, int i2, int i3, String str2, boolean z2) {
        super(z, str, i, i2, i3, str2);
        Intrinsics.checkParameterIsNotNull(str2, "denyReasonDes");
        this.f130202b = z2;
    }
}
