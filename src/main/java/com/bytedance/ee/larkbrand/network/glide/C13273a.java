package com.bytedance.ee.larkbrand.network.glide;

import android.content.Context;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.Registry;
import com.bumptech.glide.p080a.AbstractC2102d;
import com.bytedance.ee.larkbrand.network.glide.C13275c;
import java.io.InputStream;

/* renamed from: com.bytedance.ee.larkbrand.network.glide.a */
public class C13273a extends AbstractC2102d {
    @Override // com.bumptech.glide.p080a.AbstractC2104f, com.bumptech.glide.p080a.AbstractC2102d
    public void registerComponents(Context context, ComponentCallbacks2C2115c cVar, Registry registry) {
        registry.mo10300a(GlideRequest.class, InputStream.class, new C13275c.C13276a());
    }
}
