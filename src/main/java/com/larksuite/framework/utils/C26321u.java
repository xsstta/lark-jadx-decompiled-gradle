package com.larksuite.framework.utils;

import com.larksuite.framework.utils.MediaStoreUtil;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.utils.u */
public final /* synthetic */ class C26321u {

    /* renamed from: a */
    public static final /* synthetic */ int[] f64965a;

    static {
        int[] iArr = new int[MediaStoreUtil.DirType.values().length];
        f64965a = iArr;
        iArr[MediaStoreUtil.DirType.MUSIC.ordinal()] = 1;
        iArr[MediaStoreUtil.DirType.DOCUMENTS.ordinal()] = 2;
        iArr[MediaStoreUtil.DirType.MOVIES.ordinal()] = 3;
        iArr[MediaStoreUtil.DirType.DCIM.ordinal()] = 4;
        iArr[MediaStoreUtil.DirType.PICTURES.ordinal()] = 5;
        iArr[MediaStoreUtil.DirType.DOWNLOADS.ordinal()] = 6;
    }
}
