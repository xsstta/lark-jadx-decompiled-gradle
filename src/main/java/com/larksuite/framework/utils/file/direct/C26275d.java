package com.larksuite.framework.utils.file.direct;

import com.larksuite.framework.utils.file.direct.DirectFileAccess;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.utils.file.direct.d */
public final /* synthetic */ class C26275d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f64896a;

    static {
        int[] iArr = new int[DirectFileAccess.PathType.values().length];
        f64896a = iArr;
        iArr[DirectFileAccess.PathType.ROOT.ordinal()] = 1;
        iArr[DirectFileAccess.PathType.CACHE.ordinal()] = 2;
        iArr[DirectFileAccess.PathType.CODE_CACHE.ordinal()] = 3;
        iArr[DirectFileAccess.PathType.FILES.ordinal()] = 4;
    }
}
