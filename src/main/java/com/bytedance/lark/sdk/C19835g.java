package com.bytedance.lark.sdk;

import com.bytedance.lark.sdk.LarkRequest;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.bytedance.lark.sdk.g */
public final /* synthetic */ class C19835g {

    /* renamed from: a */
    public static final /* synthetic */ int[] f48400a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f48401b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f48402c;

    static {
        int[] iArr = new int[LarkRequest.Method.values().length];
        f48400a = iArr;
        iArr[LarkRequest.Method.GET.ordinal()] = 1;
        iArr[LarkRequest.Method.POST.ordinal()] = 2;
        iArr[LarkRequest.Method.PUT.ordinal()] = 3;
        iArr[LarkRequest.Method.DELETE.ordinal()] = 4;
        iArr[LarkRequest.Method.PATCH.ordinal()] = 5;
        iArr[LarkRequest.Method.HEAD.ordinal()] = 6;
        int[] iArr2 = new int[LarkRequest.Priority.values().length];
        f48401b = iArr2;
        iArr2[LarkRequest.Priority.HIGH.ordinal()] = 1;
        iArr2[LarkRequest.Priority.MEDIUM.ordinal()] = 2;
        iArr2[LarkRequest.Priority.LOW.ordinal()] = 3;
        int[] iArr3 = new int[LarkRequest.Alias.values().length];
        f48402c = iArr3;
        iArr3[LarkRequest.Alias.UNKNOWN.ordinal()] = 1;
        iArr3[LarkRequest.Alias.API.ordinal()] = 2;
        iArr3[LarkRequest.Alias.FILE.ordinal()] = 3;
        iArr3[LarkRequest.Alias.OAPI.ordinal()] = 4;
        iArr3[LarkRequest.Alias.DRIVE.ordinal()] = 5;
        iArr3[LarkRequest.Alias.DOCS.ordinal()] = 6;
        iArr3[LarkRequest.Alias.MINA.ordinal()] = 7;
        iArr3[LarkRequest.Alias.OPEN.ordinal()] = 8;
        iArr3[LarkRequest.Alias.DOCS_API.ordinal()] = 9;
        iArr3[LarkRequest.Alias.PASSPORT.ordinal()] = 10;
    }
}
