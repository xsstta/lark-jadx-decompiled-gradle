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
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.p373a.AbstractC7356a;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.p373a.AbstractC7357b;

public class PhotoView extends AppCompatImageView {

    /* renamed from: a */
    private View$OnLayoutChangeListenerC7377j f19709a;

    /* renamed from: b */
    private ImageView.ScaleType f19710b;

    /* renamed from: c */
    private boolean f19711c;

    public View$OnLayoutChangeListenerC7377j getAttacher() {
        return this.f19709a;
    }

    public RectF getDisplayRect() {
        return this.f19709a.mo28730a();
    }

    public Matrix getImageMatrix() {
        return this.f19709a.mo28757f();
    }

    public float getMaximumScale() {
        return this.f19709a.mo28751c();
    }

    public float getMinimumScale() {
        return this.f19709a.mo28747b();
    }

    public float getScale() {
        return this.f19709a.mo28753d();
    }

    /* renamed from: a */
    private void m29410a() {
        this.f19709a = new View$OnLayoutChangeListenerC7377j(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f19710b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f19710b = null;
        }
    }

    public PhotoView(Context context) {
        this(context, null);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f19709a.mo28746a(z);
    }

    public void setDoubleTapScale(float f) {
        this.f19709a.mo28731a(f);
    }

    public void setMaximumScale(float f) {
        this.f19709a.mo28756e(f);
    }

    public void setMinimumScale(float f) {
        this.f19709a.mo28754d(f);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f19709a.mo28736a(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f19709a.mo28735a(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f19709a.mo28737a(onLongClickListener);
    }

    public void setOnMatrixChangeListener(AbstractC7356a aVar) {
        this.f19709a.mo28738a(aVar);
    }

    public void setOnOutsidePhotoTapListener(AbstractC7371d dVar) {
        this.f19709a.mo28740a(dVar);
    }

    public void setOnPhotoTapListener(AbstractC7372e eVar) {
        this.f19709a.mo28741a(eVar);
    }

    public void setOnScaleChangeListener(AbstractC7373f fVar) {
        this.f19709a.mo28742a(fVar);
    }

    public void setOnScaleEventListener(AbstractC7357b bVar) {
        this.f19709a.mo28739a(bVar);
    }

    public void setOnSingleFlingListener(AbstractC7374g gVar) {
        this.f19709a.mo28743a(gVar);
    }

    public void setOnViewDragListener(AbstractC7375h hVar) {
        this.f19709a.mo28744a(hVar);
    }

    public void setOnViewTapListener(AbstractC7376i iVar) {
        this.f19709a.mo28745a(iVar);
    }

    public void setRotationBy(float f) {
        this.f19709a.mo28752c(f);
    }

    public void setRotationTo(float f) {
        this.f19709a.mo28749b(f);
    }

    public void setScale(float f) {
        this.f19709a.mo28733a(f, true);
    }

    public void setZoomTransitionDuration(int i) {
        this.f19709a.mo28734a(i);
    }

    public void setZoomable(boolean z) {
        this.f19709a.mo28750b(z);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        View$OnLayoutChangeListenerC7377j jVar = this.f19709a;
        if (jVar != null) {
            jVar.mo28755e();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        View$OnLayoutChangeListenerC7377j jVar = this.f19709a;
        if (jVar != null) {
            jVar.mo28755e();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        View$OnLayoutChangeListenerC7377j jVar = this.f19709a;
        if (jVar != null) {
            jVar.mo28755e();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        View$OnLayoutChangeListenerC7377j jVar = this.f19709a;
        if (jVar != null && !this.f19711c) {
            jVar.mo28755e();
        }
        if (drawable != null) {
            this.f19711c = true;
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo28686a(float f, boolean z) {
        this.f19709a.mo28733a(f, z);
    }

    /* renamed from: a */
    public void mo28685a(float f, float f2, float f3) {
        this.f19709a.mo28732a(f, f2, f3, true);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29410a();
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f19709a.mo28755e();
        }
        return frame;
    }
}
