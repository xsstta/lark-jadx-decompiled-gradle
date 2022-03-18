package com.ss.android.lark.app.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.ComponentCallbacks2C2126g;
import com.bumptech.glide.load.resource.p093d.C2468c;
import com.bumptech.glide.manager.AbstractC2499h;
import com.bumptech.glide.manager.AbstractC2505l;
import com.bumptech.glide.request.C2537g;
import java.io.File;

/* renamed from: com.ss.android.lark.app.glide.c */
public class C28903c extends ComponentCallbacks2C2126g {
    /* renamed from: p */
    public C28902b<Bitmap> mo10430i() {
        return (C28902b) super.mo10430i();
    }

    /* renamed from: q */
    public C28902b<C2468c> mo10431j() {
        return (C28902b) super.mo10431j();
    }

    /* renamed from: r */
    public C28902b<Drawable> mo10432k() {
        return (C28902b) super.mo10432k();
    }

    /* renamed from: s */
    public C28902b<File> mo10433l() {
        return (C28902b) super.mo10433l();
    }

    /* renamed from: t */
    public C28902b<File> mo10434m() {
        return (C28902b) super.mo10434m();
    }

    /* renamed from: b */
    public C28902b<Drawable> mo10409a(Bitmap bitmap) {
        return (C28902b) super.mo10409a(bitmap);
    }

    /* renamed from: b */
    public C28902b<Drawable> mo10410a(Uri uri) {
        return (C28902b) super.mo10410a(uri);
    }

    /* renamed from: c */
    public <ResourceType> C28902b<ResourceType> mo10412a(Class<ResourceType> cls) {
        return new C28902b<>(this.f7363a, this, cls, this.f7364b);
    }

    /* renamed from: b */
    public C28902b<Drawable> mo10411a(File file) {
        return (C28902b) super.mo10411a(file);
    }

    /* renamed from: b */
    public C28902b<Drawable> mo10413a(Integer num) {
        return (C28902b) super.mo10413a(num);
    }

    /* renamed from: b */
    public C28902b<Drawable> mo10414a(Object obj) {
        return (C28902b) super.mo10414a(obj);
    }

    /* renamed from: b */
    public C28902b<Drawable> mo10415a(String str) {
        return (C28902b) super.mo10415a(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bumptech.glide.ComponentCallbacks2C2126g
    /* renamed from: a */
    public void mo10419a(C2537g gVar) {
        if (gVar instanceof C28901a) {
            super.mo10419a(gVar);
        } else {
            super.mo10419a((C2537g) new C28901a().mo10403b(gVar));
        }
    }

    public C28903c(ComponentCallbacks2C2115c cVar, AbstractC2499h hVar, AbstractC2505l lVar, Context context) {
        super(cVar, hVar, lVar, context);
    }
}
