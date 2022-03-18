package com.ss.android.lark.profile.func.user_profile.header.cta;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/cta/LinkCtaViewData;", "Lcom/ss/android/lark/profile/func/user_profile/header/cta/BaseCtaViewData;", "enable", "", "name", "", "url", "imgKey", "denyReason", "", "denyReasonDes", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getImgKey", "()Ljava/lang/String;", "getUrl", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.header.cta.d */
public final class LinkCtaViewData extends BaseCtaViewData {

    /* renamed from: b */
    private final String f130214b;

    /* renamed from: c */
    private final String f130215c;

    /* renamed from: e */
    public final String mo179831e() {
        return this.f130214b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkCtaViewData(boolean z, String str, String str2, String str3, int i, String str4) {
        super(1, z, str, i, str4);
        Intrinsics.checkParameterIsNotNull(str4, "denyReasonDes");
        this.f130214b = str2;
        this.f130215c = str3;
    }
}
