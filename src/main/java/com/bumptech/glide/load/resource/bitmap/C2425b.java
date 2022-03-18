package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.AbstractC2392h;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
public class C2425b implements AbstractC2392h<BitmapDrawable> {

    /* renamed from: a */
    private final AbstractC2283e f7973a;

    /* renamed from: b */
    private final AbstractC2392h<Bitmap> f7974b;

    @Override // com.bumptech.glide.load.AbstractC2392h
    /* renamed from: a */
    public EncodeStrategy mo10905a(C2390f fVar) {
        return this.f7974b.mo10905a(fVar);
    }

    public C2425b(AbstractC2283e eVar, AbstractC2392h<Bitmap> hVar) {
        this.f7973a = eVar;
        this.f7974b = hVar;
    }

    /* renamed from: a */
    public boolean mo10479a(AbstractC2383u<BitmapDrawable> uVar, File file, C2390f fVar) {
        return this.f7974b.mo10479a(new C2428e(uVar.mo10878d().getBitmap(), this.f7973a), file, fVar);
    }
}
