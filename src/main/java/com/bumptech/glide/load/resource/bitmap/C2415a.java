package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.util.C2567j;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
public class C2415a<DataType> implements AbstractC2391g<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final AbstractC2391g<DataType, Bitmap> f7961a;

    /* renamed from: b */
    private final Resources f7962b;

    @Override // com.bumptech.glide.load.AbstractC2391g
    /* renamed from: a */
    public boolean mo10904a(DataType datatype, C2390f fVar) throws IOException {
        return this.f7961a.mo10904a(datatype, fVar);
    }

    public C2415a(Resources resources, AbstractC2391g<DataType, Bitmap> gVar) {
        this.f7962b = (Resources) C2567j.m10894a(resources);
        this.f7961a = (AbstractC2391g) C2567j.m10894a(gVar);
    }

    @Override // com.bumptech.glide.load.AbstractC2391g
    /* renamed from: a */
    public AbstractC2383u<BitmapDrawable> mo10903a(DataType datatype, int i, int i2, C2390f fVar) throws IOException {
        return C2447s.m10337a(this.f7962b, this.f7961a.mo10903a(datatype, i, i2, fVar));
    }
}
