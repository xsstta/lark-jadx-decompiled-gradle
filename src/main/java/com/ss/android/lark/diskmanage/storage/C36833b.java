package com.ss.android.lark.diskmanage.storage;

import com.ss.android.lark.diskmanage.storage.Storage;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.diskmanage.storage.b */
public final /* synthetic */ class C36833b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f94666a;

    static {
        int[] iArr = new int[Storage.Type.values().length];
        f94666a = iArr;
        iArr[Storage.Type.INNER_CACHE.ordinal()] = 1;
        iArr[Storage.Type.CACHE.ordinal()] = 2;
        iArr[Storage.Type.INNER_FILES.ordinal()] = 3;
        iArr[Storage.Type.FILES.ordinal()] = 4;
        iArr[Storage.Type.STORAGE_LARK.ordinal()] = 5;
    }
}
