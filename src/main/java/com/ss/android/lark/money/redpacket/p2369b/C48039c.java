package com.ss.android.lark.money.redpacket.p2369b;

import com.ss.android.lark.pb.entities.Crypto;
import com.ss.android.lark.pb.entities.HongbaoCover;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.redpacket.b.c */
public final /* synthetic */ class C48039c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f120933a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f120934b;

    static {
        int[] iArr = new int[HongbaoCover.CoverType.values().length];
        f120933a = iArr;
        iArr[HongbaoCover.CoverType.TEMPLATE.ordinal()] = 1;
        iArr[HongbaoCover.CoverType.CUSTOMIZE.ordinal()] = 2;
        int[] iArr2 = new int[Crypto.Type.values().length];
        f120934b = iArr2;
        iArr2[Crypto.Type.AES_256_GCM.ordinal()] = 1;
        iArr2[Crypto.Type.AES_CTR.ordinal()] = 2;
        iArr2[Crypto.Type.CRYPTO_SDK_UNIFIED.ordinal()] = 3;
        iArr2[Crypto.Type.CRYPTO_SDK_DOWNGRADE.ordinal()] = 4;
        iArr2[Crypto.Type.CRYPTO_SDK_THIRDPARTY.ordinal()] = 5;
        iArr2[Crypto.Type.SM4_128.ordinal()] = 6;
    }
}
