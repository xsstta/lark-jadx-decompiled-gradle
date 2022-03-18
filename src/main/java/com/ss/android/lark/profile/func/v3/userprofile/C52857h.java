package com.ss.android.lark.profile.func.v3.userprofile;

import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.h */
public final /* synthetic */ class C52857h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f130653a;

    static {
        int[] iArr = new int[GetUserProfileResponse.CTA.CTAType.values().length];
        f130653a = iArr;
        iArr[GetUserProfileResponse.CTA.CTAType.CHAT.ordinal()] = 1;
        iArr[GetUserProfileResponse.CTA.CTAType.VOICE.ordinal()] = 2;
        iArr[GetUserProfileResponse.CTA.CTAType.VIDEO.ordinal()] = 3;
        iArr[GetUserProfileResponse.CTA.CTAType.CRYPTO_CHAT.ordinal()] = 4;
    }
}
