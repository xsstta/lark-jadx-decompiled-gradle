package com.ss.android.lark.app;

import com.larksuite.component.air.AirApplication;
import dagger.hilt.android.internal.managers.AbstractC68156f;
import dagger.hilt.android.internal.managers.C68155e;
import dagger.hilt.android.internal.p3449b.C68130c;
import dagger.hilt.internal.AbstractC68168c;
import dagger.hilt.internal.C68172f;

/* renamed from: com.ss.android.lark.app.b */
abstract class AbstractApplicationC28849b extends AirApplication implements AbstractC68168c {
    private final C68155e componentManager = new C68155e(new AbstractC68156f() {
        /* class com.ss.android.lark.app.AbstractApplicationC28849b.C288501 */

        @Override // dagger.hilt.android.internal.managers.AbstractC68156f
        /* renamed from: a */
        public Object mo102514a() {
            return C28829a.m105612b().mo102470a(new C68130c(AbstractApplicationC28849b.this)).mo102471a();
        }
    });

    public final C68155e componentManager() {
        return this.componentManager;
    }

    AbstractApplicationC28849b() {
    }

    @Override // dagger.hilt.internal.AbstractC68167b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // com.larksuite.component.air.AirApplication
    public void onCreate() {
        ((AbstractC28857c) generatedComponent()).mo102451a((LarkApplication) C68172f.m264816a(this));
        super.onCreate();
    }
}
