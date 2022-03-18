package com.bytedance.lark.sdk;

import com.bytedance.lark.pb.tool.v1.OnFetchResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.bytedance.lark.sdk.f */
public final /* synthetic */ class C19834f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f48398a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f48399b;

    static {
        int[] iArr = new int[OnFetchResponse.OnErrorResponse.Code.values().length];
        f48398a = iArr;
        iArr[OnFetchResponse.OnErrorResponse.Code.TIMEOUT.ordinal()] = 1;
        iArr[OnFetchResponse.OnErrorResponse.Code.OTHERS.ordinal()] = 2;
        iArr[OnFetchResponse.OnErrorResponse.Code.SDK.ordinal()] = 3;
        iArr[OnFetchResponse.OnErrorResponse.Code.OFFLINE.ordinal()] = 4;
        iArr[OnFetchResponse.OnErrorResponse.Code.IO.ordinal()] = 5;
        int[] iArr2 = new int[OnFetchResponse.OnHeaderResponse.Protocol.values().length];
        f48399b = iArr2;
        iArr2[OnFetchResponse.OnHeaderResponse.Protocol.UNKNOWN.ordinal()] = 1;
        iArr2[OnFetchResponse.OnHeaderResponse.Protocol.HTTP_1_1.ordinal()] = 2;
        iArr2[OnFetchResponse.OnHeaderResponse.Protocol.HTTP_2.ordinal()] = 3;
        iArr2[OnFetchResponse.OnHeaderResponse.Protocol.QUIC.ordinal()] = 4;
    }
}
