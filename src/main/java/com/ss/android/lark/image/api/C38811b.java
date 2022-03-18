package com.ss.android.lark.image.api;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.ss.android.lark.image.api.b */
public class C38811b extends C38818i<Drawable> {

    /* renamed from: a */
    ImageView f99761a;

    /* renamed from: a */
    public ImageView mo142223a() {
        return this.f99761a;
    }

    public C38811b(ImageView imageView) {
        this.f99761a = imageView;
    }

    @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
    /* renamed from: c */
    public void mo142224c(Drawable drawable) {
        super.mo142224c(drawable);
        this.f99761a.setImageDrawable(null);
        this.f99761a.setImageDrawable(drawable);
    }
}
