package dagger.hilt.android.internal.p3449b;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.internal.C68120a;

@Module
/* renamed from: dagger.hilt.android.internal.b.c */
public final class C68130c {

    /* renamed from: a */
    private final Context f171367a;

    /* access modifiers changed from: package-private */
    @Provides
    /* renamed from: a */
    public Application mo237040a() {
        return C68120a.m264754a(this.f171367a);
    }

    public C68130c(Context context) {
        this.f171367a = context;
    }
}
