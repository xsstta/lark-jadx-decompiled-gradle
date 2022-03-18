package com.ss.android.lark.core.p1775l;

import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.utils.LarkContext;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.C68119b;

@Module
/* renamed from: com.ss.android.lark.core.l.b */
public abstract class AbstractC36232b {

    /* renamed from: com.ss.android.lark.core.l.b$a */
    public interface AbstractC36233a {
        /* renamed from: d */
        C52239a mo102453d();
    }

    /* renamed from: a */
    public static C52239a m142703a() {
        return ((AbstractC36233a) C68119b.m264753a(LarkContext.getApplication(), AbstractC36233a.class)).mo102453d();
    }

    @Provides
    /* renamed from: a */
    public static C52239a m142704a(IProfileModuleDependency iProfileModuleDependency) {
        return new C52239a(iProfileModuleDependency);
    }
}
