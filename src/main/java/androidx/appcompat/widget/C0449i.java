package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.AbstractC0781g;
import com.huawei.hms.android.HwBuildEx;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.i */
public class C0449i {

    /* renamed from: a */
    private static final int[] f1643a = {16843067, 16843068};

    /* renamed from: b */
    private final ProgressBar f1644b;

    /* renamed from: c */
    private Bitmap f1645c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap mo2604a() {
        return this.f1645c;
    }

    /* renamed from: b */
    private Shape mo2608b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    C0449i(ProgressBar progressBar) {
        this.f1644b = progressBar;
    }

    /* renamed from: a */
    private Drawable mo2607a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m1939a(animationDrawable.getFrame(i), true);
            a.setLevel(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        return animationDrawable2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2605a(AttributeSet attributeSet, int i) {
        C0427af a = C0427af.m1778a(this.f1644b.getContext(), attributeSet, f1643a, i, 0);
        Drawable b = a.mo2481b(0);
        if (b != null) {
            this.f1644b.setIndeterminateDrawable(mo2607a(b));
        }
        Drawable b2 = a.mo2481b(1);
        if (b2 != null) {
            this.f1644b.setProgressDrawable(m1939a(b2, false));
        }
        a.mo2482b();
    }

    /* renamed from: a */
    private Drawable m1939a(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof AbstractC0781g) {
            AbstractC0781g gVar = (AbstractC0781g) drawable;
            Drawable a = gVar.mo4324a();
            if (a != null) {
                gVar.mo4325a(m1939a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id == 16908301 || id == 16908303) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawableArr[i] = m1939a(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1645c == null) {
                this.f1645c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo2608b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }
}
