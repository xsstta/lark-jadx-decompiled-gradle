package com.ss.android.lark.image.impl;

import com.ss.android.lark.image.api.DataSource;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.image.impl.g */
public final /* synthetic */ class C38895g {

    /* renamed from: a */
    public static final /* synthetic */ int[] f99936a;

    static {
        int[] iArr = new int[DataSource.values().length];
        f99936a = iArr;
        iArr[DataSource.LOCAL.ordinal()] = 1;
        iArr[DataSource.REMOTE.ordinal()] = 2;
        iArr[DataSource.DATA_DISK_CACHE.ordinal()] = 3;
        iArr[DataSource.RESOURCE_DISK_CACHE.ordinal()] = 4;
        iArr[DataSource.MEMORY_CACHE.ordinal()] = 5;
    }
}
