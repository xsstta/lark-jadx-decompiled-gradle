package com.ss.android.lark.integrator.im.chat;

import com.ss.android.lark.C29407b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.utils.LarkContext;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.C68119b;

@Module
/* renamed from: com.ss.android.lark.integrator.im.chat.a */
public abstract class AbstractC39484a {

    /* renamed from: com.ss.android.lark.integrator.im.chat.a$a */
    public interface AbstractC39485a {
        /* renamed from: a */
        C29407b mo102450a();
    }

    /* renamed from: a */
    public static C29407b m156004a() {
        return ((AbstractC39485a) C68119b.m264753a(LarkContext.getApplication(), AbstractC39485a.class)).mo102450a();
    }

    @Provides
    /* renamed from: a */
    public static C29407b m156005a(AbstractC36474h hVar) {
        C39603g.m157159a().getCoreDependency().mo143398X();
        return new C29407b(hVar);
    }
}
