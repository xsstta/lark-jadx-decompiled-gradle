package com.ss.android.ugc.effectmanager.p3055e;

import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.ugc.effectplatform.model.algorithm.FetchModelType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.e.j */
public final /* synthetic */ class C60558j {

    /* renamed from: a */
    public static final /* synthetic */ int[] f151447a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f151448b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f151449c;

    static {
        int[] iArr = new int[FetchModelType.values().length];
        f151447a = iArr;
        iArr[FetchModelType.ORIGIN.ordinal()] = 1;
        iArr[FetchModelType.ZIP.ordinal()] = 2;
        int[] iArr2 = new int[com.ss.android.ugc.effectmanager.FetchModelType.values().length];
        f151448b = iArr2;
        iArr2[com.ss.android.ugc.effectmanager.FetchModelType.ORIGIN.ordinal()] = 1;
        iArr2[com.ss.android.ugc.effectmanager.FetchModelType.ZIP.ordinal()] = 2;
        int[] iArr3 = new int[DownloadableModelConfig.ModelFileEnv.values().length];
        f151449c = iArr3;
        iArr3[DownloadableModelConfig.ModelFileEnv.TEST.ordinal()] = 1;
        iArr3[DownloadableModelConfig.ModelFileEnv.ONLINE.ordinal()] = 2;
    }
}
