package com.bytedance.ies.bullet.service.base;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.n */
public final /* synthetic */ class C14419n {

    /* renamed from: a */
    public static final /* synthetic */ int[] f37911a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f37912b;

    static {
        int[] iArr = new int[ResourceType.values().length];
        f37911a = iArr;
        iArr[ResourceType.ASSET.ordinal()] = 1;
        int[] iArr2 = new int[ResourceFrom.values().length];
        f37912b = iArr2;
        iArr2[ResourceFrom.GECKO.ordinal()] = 1;
        iArr2[ResourceFrom.BUILTIN.ordinal()] = 2;
        iArr2[ResourceFrom.CDN.ordinal()] = 3;
        iArr2[ResourceFrom.LOCAL_FILE.ordinal()] = 4;
    }
}
