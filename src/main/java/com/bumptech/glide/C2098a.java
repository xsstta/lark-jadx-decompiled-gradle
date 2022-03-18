package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.manager.AbstractC2499h;
import com.bumptech.glide.manager.AbstractC2505l;
import com.bumptech.glide.manager.C2502k;
import com.ss.android.lark.app.glide.C28903c;

/* renamed from: com.bumptech.glide.a */
final class C2098a implements C2502k.AbstractC2504a {
    C2098a() {
    }

    @Override // com.bumptech.glide.manager.C2502k.AbstractC2504a
    /* renamed from: a */
    public ComponentCallbacks2C2126g mo10319a(ComponentCallbacks2C2115c cVar, AbstractC2499h hVar, AbstractC2505l lVar, Context context) {
        return new C28903c(cVar, hVar, lVar, context);
    }
}
