package com.ss.android.lark.time.format;

import com.ss.android.lark.time.format.entity.LengthType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.time.format.c */
public final /* synthetic */ class C56223c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f139158a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f139159b;

    static {
        int[] iArr = new int[LengthType.values().length];
        f139158a = iArr;
        iArr[LengthType.MIN.ordinal()] = 1;
        iArr[LengthType.SHORT.ordinal()] = 2;
        iArr[LengthType.LONG.ordinal()] = 3;
        int[] iArr2 = new int[LengthType.values().length];
        f139159b = iArr2;
        iArr2[LengthType.SHORT.ordinal()] = 1;
        iArr2[LengthType.LONG.ordinal()] = 2;
    }
}
