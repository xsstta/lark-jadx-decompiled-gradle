package com.airbnb.lottie.p070b;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.C1733a;
import com.airbnb.lottie.model.C1851h;
import com.airbnb.lottie.p071c.C1787d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.b.a */
public class C1781a {

    /* renamed from: a */
    private final C1851h<String> f6093a = new C1851h<>();

    /* renamed from: b */
    private final Map<C1851h<String>, Typeface> f6094b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f6095c = new HashMap();

    /* renamed from: d */
    private final AssetManager f6096d;

    /* renamed from: e */
    private C1733a f6097e;

    /* renamed from: f */
    private String f6098f = ".ttf";

    /* renamed from: a */
    public void mo8998a(C1733a aVar) {
        this.f6097e = aVar;
    }

    /* renamed from: a */
    private Typeface m7948a(String str) {
        String b;
        Typeface typeface = this.f6095c.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = null;
        C1733a aVar = this.f6097e;
        if (aVar != null) {
            typeface2 = aVar.mo8928a(str);
        }
        C1733a aVar2 = this.f6097e;
        if (!(aVar2 == null || typeface2 != null || (b = aVar2.mo8929b(str)) == null)) {
            typeface2 = Typeface.createFromAsset(this.f6096d, b);
        }
        if (typeface2 == null) {
            typeface2 = Typeface.createFromAsset(this.f6096d, "fonts/" + str + this.f6098f);
        }
        this.f6095c.put(str, typeface2);
        return typeface2;
    }

    public C1781a(Drawable.Callback callback, C1733a aVar) {
        this.f6097e = aVar;
        if (!(callback instanceof View)) {
            C1787d.m7973b("LottieDrawable must be inside of a view for images to work.");
            this.f6096d = null;
            return;
        }
        this.f6096d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    private Typeface m7947a(Typeface typeface, String str) {
        int i;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        } else {
            i = 0;
        }
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }

    /* renamed from: a */
    public Typeface mo8997a(String str, String str2) {
        this.f6093a.mo9265a(str, str2);
        Typeface typeface = this.f6094b.get(this.f6093a);
        if (typeface != null) {
            return typeface;
        }
        Typeface a = m7947a(m7948a(str), str2);
        this.f6094b.put(this.f6093a, a);
        return a;
    }
}
