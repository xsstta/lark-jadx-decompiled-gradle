package com.ss.android.lark.stepcount;

import android.content.Context;
import com.ss.android.lark.stepcount.p2712a.AbstractC54989a;
import com.ss.android.lark.stepcount.service.AbstractC54994a;
import com.ss.android.lark.stepcount.service.IStepCountManisService;
import com.ss.android.lark.stepcount.service.impl.C54995a;
import ee.android.framework.manis.C68183b;

/* renamed from: com.ss.android.lark.stepcount.a */
public class C54988a {

    /* renamed from: a */
    private static volatile AbstractC54989a f135916a;

    /* renamed from: a */
    public AbstractC54994a mo187772a() {
        return C54995a.m213613b();
    }

    public C54988a(AbstractC54989a aVar) {
        f135916a = aVar;
    }

    /* renamed from: a */
    public IStepCountManisService mo187771a(Context context) {
        return (IStepCountManisService) C68183b.m264839a().mo237086a(context, IStepCountManisService.class);
    }
}
