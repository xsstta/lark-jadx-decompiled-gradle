package com.ss.android.lark.integrator.im.p2028h;

import com.ss.android.lark.favorite.C37081c;
import com.ss.android.lark.favorite.p1835a.AbstractC37078a;
import com.ss.android.lark.utils.LarkContext;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.C68119b;

@Module
/* renamed from: com.ss.android.lark.integrator.im.h.b */
public abstract class AbstractC39636b {

    /* renamed from: com.ss.android.lark.integrator.im.h.b$a */
    public interface AbstractC39637a {
        /* renamed from: e */
        C37081c mo102454e();
    }

    /* renamed from: a */
    public static C37081c m157290a() {
        return ((AbstractC39637a) C68119b.m264753a(LarkContext.getApplication(), AbstractC39637a.class)).mo102454e();
    }

    @Provides
    /* renamed from: a */
    public static C37081c m157291a(AbstractC37078a aVar) {
        return new C37081c(aVar);
    }
}
