package com.airbnb.lottie.p070b;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.AbstractC1780b;
import com.airbnb.lottie.C1806f;
import com.airbnb.lottie.p071c.C1787d;
import com.airbnb.lottie.p071c.C1791h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.b.b */
public class C1782b {

    /* renamed from: a */
    private static final Object f6099a = new Object();

    /* renamed from: b */
    private final Context f6100b;

    /* renamed from: c */
    private String f6101c;

    /* renamed from: d */
    private AbstractC1780b f6102d;

    /* renamed from: e */
    private final Map<String, C1806f> f6103e;

    /* renamed from: a */
    public void mo9001a(AbstractC1780b bVar) {
        this.f6102d = bVar;
    }

    /* renamed from: a */
    public boolean mo9002a(Context context) {
        if ((context != null || this.f6100b != null) && !this.f6100b.equals(context)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public Bitmap mo8999a(String str) {
        C1806f fVar = this.f6103e.get(str);
        if (fVar == null) {
            return null;
        }
        Bitmap e = fVar.mo9108e();
        if (e != null) {
            return e;
        }
        AbstractC1780b bVar = this.f6102d;
        if (bVar != null) {
            Bitmap fetchBitmap = bVar.fetchBitmap(fVar);
            if (fetchBitmap != null) {
                m7951b(str, fetchBitmap);
            }
            return fetchBitmap;
        }
        String d = fVar.mo9107d();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!d.startsWith("data:") || d.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f6101c)) {
                    AssetManager assets = this.f6100b.getAssets();
                    return m7951b(str, C1791h.m8015a(BitmapFactory.decodeStream(assets.open(this.f6101c + d), null, options), fVar.mo9103a(), fVar.mo9105b()));
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException e2) {
                C1787d.m7972a("Unable to open asset.", e2);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(d.substring(d.indexOf(44) + 1), 0);
                return m7951b(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e3) {
                C1787d.m7972a("data URL did not have correct base64 format.", e3);
                return null;
            }
        }
    }

    /* renamed from: b */
    private Bitmap m7951b(String str, Bitmap bitmap) {
        synchronized (f6099a) {
            this.f6103e.get(str).mo9104a(bitmap);
        }
        return bitmap;
    }

    /* renamed from: a */
    public Bitmap mo9000a(String str, Bitmap bitmap) {
        if (bitmap == null) {
            C1806f fVar = this.f6103e.get(str);
            Bitmap e = fVar.mo9108e();
            fVar.mo9104a(null);
            return e;
        }
        Bitmap e2 = this.f6103e.get(str).mo9108e();
        m7951b(str, bitmap);
        return e2;
    }

    public C1782b(Drawable.Callback callback, String str, AbstractC1780b bVar, Map<String, C1806f> map) {
        this.f6101c = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f6101c;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.f6101c += '/';
            }
        }
        if (!(callback instanceof View)) {
            C1787d.m7973b("LottieDrawable must be inside of a view for images to work.");
            this.f6103e = new HashMap();
            this.f6100b = null;
            return;
        }
        this.f6100b = ((View) callback).getContext();
        this.f6103e = map;
        mo9001a(bVar);
    }
}
