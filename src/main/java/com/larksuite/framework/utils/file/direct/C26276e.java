package com.larksuite.framework.utils.file.direct;

import com.larksuite.framework.utils.file.direct.DirectFileAccess;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.utils.file.direct.e */
public final /* synthetic */ class C26276e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f64897a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f64898b;

    static {
        int[] iArr = new int[DirectFileAccess.ScopedStorage.values().length];
        f64897a = iArr;
        iArr[DirectFileAccess.ScopedStorage.APP.ordinal()] = 1;
        iArr[DirectFileAccess.ScopedStorage.SHARED.ordinal()] = 2;
        int[] iArr2 = new int[DirectFileAccess.StorageLocation.values().length];
        f64898b = iArr2;
        iArr2[DirectFileAccess.StorageLocation.INTERNAL.ordinal()] = 1;
        iArr2[DirectFileAccess.StorageLocation.EXTERNAL.ordinal()] = 2;
    }
}
