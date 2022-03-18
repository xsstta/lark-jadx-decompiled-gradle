package com.bytedance.ee.bear.drive.view.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bytedance.ee.log.C13479a;

public class RecyclingImageView extends ImageView {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.widget.RecyclingImageView$a */
    public static class C7565a extends BitmapDrawable {

        /* renamed from: a */
        private int f20550a;

        /* renamed from: b */
        private int f20551b;

        /* renamed from: c */
        private boolean f20552c;

        /* renamed from: b */
        private synchronized boolean m30349b() {
            boolean z;
            Bitmap bitmap = getBitmap();
            if (bitmap == null || bitmap.isRecycled()) {
                z = false;
            } else {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        private synchronized void m30348a() {
            if (this.f20550a <= 0 && this.f20551b <= 0 && this.f20552c && m30349b()) {
                getBitmap().recycle();
                C13479a.m54772d("RecyclingImageView", "the drawable cache and display ref counts = 0. recycle. ");
            }
        }

        /* renamed from: a */
        public void mo29690a(boolean z) {
            synchronized (this) {
                if (z) {
                    this.f20551b++;
                    this.f20552c = true;
                } else {
                    this.f20551b--;
                }
            }
            m30348a();
        }

        public C7565a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }
    }

    public RecyclingImageView(Context context) {
        super(context);
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new C7565a(getResources(), bitmap));
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        if (drawable instanceof BitmapDrawable) {
            drawable = new C7565a(getResources(), ((BitmapDrawable) drawable).getBitmap());
        }
        super.setImageDrawable(drawable);
        m30345a(drawable, true);
        m30345a(drawable2, false);
    }

    public RecyclingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo29686a(Bitmap bitmap, AbstractC2283e eVar) {
        mo29687a(new BitmapDrawable(getResources(), bitmap), eVar);
    }

    /* renamed from: a */
    private void m30345a(Drawable drawable, boolean z) {
        if (drawable instanceof C7565a) {
            ((C7565a) drawable).mo29690a(z);
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                m30345a(layerDrawable.getDrawable(i), z);
            }
        }
    }

    /* renamed from: a */
    public void mo29687a(Drawable drawable, AbstractC2283e eVar) {
        Bitmap bitmap;
        if (eVar == null) {
            setImageDrawable(drawable);
            return;
        }
        Drawable drawable2 = getDrawable();
        super.setImageDrawable(drawable);
        if ((drawable2 instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable2).getBitmap()) != null) {
            C13479a.m54772d("RecyclingImageView", "put previous bitmap into bitmap pool. ");
            eVar.mo10693a(bitmap);
        }
    }

    public RecyclingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
