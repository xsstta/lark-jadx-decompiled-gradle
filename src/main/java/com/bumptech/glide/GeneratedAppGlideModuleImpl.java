package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bytedance.ee.bear.facade.glide.BearGlideModule;
import com.bytedance.ee.larkbrand.network.glide.C13273a;
import com.ss.android.lark.app.glide.LarkGlideModule;
import java.util.Collections;
import java.util.Set;

final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a */
    private final LarkGlideModule f7266a = new LarkGlideModule();

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: a */
    public Set<Class<?>> mo10289a() {
        return Collections.emptySet();
    }

    @Override // com.bumptech.glide.p080a.AbstractC2099a
    /* renamed from: c */
    public boolean mo10292c() {
        return this.f7266a.mo10292c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C2098a mo10290b() {
        return new C2098a();
    }

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.ss.android.lark.app.glide.LarkGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bytedance.ee.bear.facade.glide.BearGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bytedance.ee.larkbrand.network.glide.OkHttpLibraryGlideModule");
        }
    }

    @Override // com.bumptech.glide.p080a.AbstractC2100b, com.bumptech.glide.p080a.AbstractC2099a
    /* renamed from: a */
    public void mo10291a(Context context, C2121d dVar) {
        this.f7266a.mo10291a(context, dVar);
    }

    @Override // com.bumptech.glide.p080a.AbstractC2104f, com.bumptech.glide.p080a.AbstractC2102d
    public void registerComponents(Context context, ComponentCallbacks2C2115c cVar, Registry registry) {
        new BearGlideModule().registerComponents(context, cVar, registry);
        new C13273a().registerComponents(context, cVar, registry);
        this.f7266a.registerComponents(context, cVar, registry);
    }
}
