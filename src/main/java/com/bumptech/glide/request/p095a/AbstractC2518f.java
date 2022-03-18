package com.bumptech.glide.request.p095a;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.p096b.AbstractC2529b;

/* renamed from: com.bumptech.glide.request.a.f */
public abstract class AbstractC2518f<Z> extends AbstractC2523k<ImageView, Z> implements AbstractC2529b.AbstractC2530a {

    /* renamed from: b */
    private Animatable f8184b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11174a(Z z);

    @Override // com.bumptech.glide.manager.AbstractC2500i, com.bumptech.glide.request.p095a.AbstractC2511a
    /* renamed from: f */
    public void mo10427f() {
        Animatable animatable = this.f8184b;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i, com.bumptech.glide.request.p095a.AbstractC2511a
    /* renamed from: g */
    public void mo10428g() {
        Animatable animatable = this.f8184b;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public AbstractC2518f(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: b */
    private void m10694b(Z z) {
        mo11174a((Object) z);
        m10695c((Object) z);
    }

    /* renamed from: e */
    public void mo11185e(Drawable drawable) {
        ((ImageView) this.f8189a).setImageDrawable(drawable);
    }

    /* renamed from: c */
    private void m10695c(Z z) {
        if (z instanceof Animatable) {
            Z z2 = z;
            this.f8184b = z2;
            z2.start();
            return;
        }
        this.f8184b = null;
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: b */
    public void mo10444b(Drawable drawable) {
        super.mo10444b(drawable);
        m10694b((Object) null);
        mo11185e(drawable);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2523k, com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public void mo11036a(Drawable drawable) {
        super.mo11036a(drawable);
        Animatable animatable = this.f8184b;
        if (animatable != null) {
            animatable.stop();
        }
        m10694b((Object) null);
        mo11185e(drawable);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2523k, com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: c */
    public void mo11172c(Drawable drawable) {
        super.mo11172c(drawable);
        m10694b((Object) null);
        mo11185e(drawable);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public void mo10442a(Z z, AbstractC2529b<? super Z> bVar) {
        if (bVar == null || !bVar.mo11202a(z, this)) {
            m10694b((Object) z);
        } else {
            m10695c((Object) z);
        }
    }
}
