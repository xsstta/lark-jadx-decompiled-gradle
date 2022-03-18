package com.larksuite.framework.utils.file.direct;

import com.larksuite.framework.utils.file.direct.DirectFileAccess;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.utils.file.direct.b */
public final /* synthetic */ class C26274b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f64894a;

    static {
        int[] iArr = new int[DirectFileAccess.PathType.values().length];
        f64894a = iArr;
        iArr[DirectFileAccess.PathType.CACHE.ordinal()] = 1;
        iArr[DirectFileAccess.PathType.FILES.ordinal()] = 2;
        iArr[DirectFileAccess.PathType.ROOT.ordinal()] = 3;
    }
}
