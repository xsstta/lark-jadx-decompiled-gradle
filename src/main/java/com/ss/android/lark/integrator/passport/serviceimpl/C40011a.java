package com.ss.android.lark.integrator.passport.serviceimpl;

import com.ss.android.lark.passport.infra.service.IDomainService;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.a */
public final /* synthetic */ class C40011a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f101754a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f101755b;

    static {
        int[] iArr = new int[IDomainService.UrlUnitType.values().length];
        f101754a = iArr;
        iArr[IDomainService.UrlUnitType.CURRENT_UNIT.ordinal()] = 1;
        iArr[IDomainService.UrlUnitType.HOST_UNIT.ordinal()] = 2;
        int[] iArr2 = new int[IDomainService.UrlUnitType.values().length];
        f101755b = iArr2;
        iArr2[IDomainService.UrlUnitType.CURRENT_UNIT.ordinal()] = 1;
        iArr2[IDomainService.UrlUnitType.HOST_UNIT.ordinal()] = 2;
    }
}
