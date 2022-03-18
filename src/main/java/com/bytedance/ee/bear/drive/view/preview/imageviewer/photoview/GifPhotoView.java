package com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.p373a.AbstractC7356a;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.p373a.AbstractC7357b;
import pl.droidsonroids.gif.GifImageView;

public class GifPhotoView extends GifImageView {

    /* renamed from: a */
    private View$OnLayoutChangeListenerC7377j f19706a;

    /* renamed from: b */
    private ImageView.ScaleType f19707b;

    /* renamed from: c */
    private boolean f19708c;

    public View$OnLayoutChangeListenerC7377j getAttacher() {
        return this.f19706a;
    }

    public RectF getDisplayRect() {
        return this.f19706a.mo28730a();
    }

    public Matrix getImageMatrix() {
        return this.f19706a.mo28757f();
    }

    public float getMaximumScale() {
        return this.f19706a.mo28751c();
    }

    public float getMinimumScale() {
        return this.f19706a.mo28747b();
    }

    public float getScale() {
        return this.f19706a.mo28753d();
    }

    /* renamed from: a */
    private void m29407a() {
        this.f19706a = new View$OnLayoutChangeListenerC7377j(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f19707b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f19707b = null;
        }
    }

    public GifPhotoView(Context context) {
        this(context, null);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f19706a.mo28746a(z);
    }

    public void setDoubleTapScale(float f) {
        this.f19706a.mo28731a(f);
    }

    public void setMaximumScale(float f) {
        this.f19706a.mo28756e(f);
    }

    public void setMinimumScale(float f) {
        this.f19706a.mo28754d(f);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f19706a.mo28736a(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f19706a.mo28735a(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f19706a.mo28737a(onLongClickListener);
    }

    public void setOnMatrixChangeListener(AbstractC7356a aVar) {
        this.f19706a.mo28738a(aVar);
    }

    public void setOnOutsidePhotoTapListener(AbstractC7371d dVar) {
        this.f19706a.mo28740a(dVar);
    }

    public void setOnPhotoTapListener(AbstractC7372e eVar) {
        this.f19706a.mo28741a(eVar);
    }

    public void setOnScaleChangeListener(AbstractC7373f fVar) {
        this.f19706a.mo28742a(fVar);
    }

    public void setOnScaleEventListener(AbstractC7357b bVar) {
        this.f19706a.mo28739a(bVar);
    }

    public void setOnSingleFlingListener(AbstractC7374g gVar) {
        this.f19706a.mo28743a(gVar);
    }

    public void setOnViewDragListener(AbstractC7375h hVar) {
        this.f19706a.mo28744a(hVar);
    }

    public void setOnViewTapListener(AbstractC7376i iVar) {
        this.f19706a.mo28745a(iVar);
    }

    public void setRotationBy(float f) {
        this.f19706a.mo28752c(f);
    }

    public void setRotationTo(float f) {
        this.f19706a.mo28749b(f);
    }

    public void setScale(float f) {
        this.f19706a.mo28733a(f, true);
    }

    public void setZoomTransitionDuration(int i) {
        this.f19706a.mo28734a(i);
    }

    public void setZoomable(boolean z) {
        this.f19706a.mo28750b(z);
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        View$OnLayoutChangeListenerC7377j jVar = this.f19706a;
        if (jVar != null) {
            jVar.mo28755e();
        }
    }

    @Override // pl.droidsonroids.gif.GifImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        View$OnLayoutChangeListenerC7377j jVar = this.f19706a;
        if (jVar != null) {
            jVar.mo28755e();
        }
    }

    @Override // pl.droidsonroids.gif.GifImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        View$OnLayoutChangeListenerC7377j jVar = this.f19706a;
        if (jVar != null) {
            jVar.mo28755e();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        View$OnLayoutChangeListenerC7377j jVar = this.f19706a;
        if (jVar != null && !this.f19708c) {
            jVar.mo28755e();
        }
        if (drawable != null) {
            this.f19708c = true;
        }
    }

    public GifPhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo28653a(float f, boolean z) {
        this.f19706a.mo28733a(f, z);
    }

    /* renamed from: a */
    public void mo28652a(float f, float f2, float f3) {
        this.f19706a.mo28732a(f, f2, f3, true);
    }

    public GifPhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29407a();
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f19706a.mo28755e();
        }
        return frame;
    }
}
