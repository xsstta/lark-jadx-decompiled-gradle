package com.bytedance.ies.bullet.p782a.p783a;

import com.bytedance.ies.bullet.service.base.CustomLoaderType;
import com.bytedance.ies.bullet.service.base.resourceloader.config.LoaderType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.g */
public final /* synthetic */ class C14402g {

    /* renamed from: a */
    public static final /* synthetic */ int[] f37804a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f37805b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f37806c;

    static {
        int[] iArr = new int[CustomLoaderType.values().length];
        f37804a = iArr;
        iArr[CustomLoaderType.HIGH.ordinal()] = 1;
        iArr[CustomLoaderType.LOW.ordinal()] = 2;
        int[] iArr2 = new int[CustomLoaderType.values().length];
        f37805b = iArr2;
        iArr2[CustomLoaderType.HIGH.ordinal()] = 1;
        iArr2[CustomLoaderType.LOW.ordinal()] = 2;
        int[] iArr3 = new int[LoaderType.values().length];
        f37806c = iArr3;
        iArr3[LoaderType.GECKO.ordinal()] = 1;
        iArr3[LoaderType.BUILTIN.ordinal()] = 2;
        iArr3[LoaderType.CDN.ordinal()] = 3;
    }
}
