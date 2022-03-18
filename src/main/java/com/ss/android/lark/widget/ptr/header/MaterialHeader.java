package com.ss.android.lark.widget.ptr.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.widget.ptr.AbstractC58934a;
import com.ss.android.lark.widget.ptr.AbstractRunnableC58938c;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.ptr.p2961a.C58935a;

public class MaterialHeader extends View implements AbstractC58934a {

    /* renamed from: a */
    public C58944a f145953a;

    /* renamed from: b */
    public float f145954b = 1.0f;

    /* renamed from: c */
    public Animation f145955c = new Animation() {
        /* class com.ss.android.lark.widget.ptr.header.MaterialHeader.C589391 */

        public void applyTransformation(float f, Transformation transformation) {
            MaterialHeader.this.f145954b = 1.0f - f;
            MaterialHeader.this.f145953a.setAlpha((int) (MaterialHeader.this.f145954b * 255.0f));
            MaterialHeader.this.invalidate();
        }
    };

    /* renamed from: d */
    private LKUIPtrFrameLayout f145956d;

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: b */
    public void mo166240b(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
    }

    /* renamed from: a */
    private void m228785a() {
        C58944a aVar = new C58944a(getContext(), this);
        this.f145953a = aVar;
        aVar.mo199967b(-1);
        this.f145953a.setCallback(this);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166237a(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        this.f145954b = 1.0f;
        this.f145953a.stop();
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: c */
    public void mo166241c(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        this.f145953a.setAlpha(255);
        this.f145953a.start();
    }

    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.f145953a) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void setColorSchemeColors(int[] iArr) {
        this.f145953a.mo199965a(iArr);
        invalidate();
    }

    public MaterialHeader(Context context) {
        super(context);
        m228785a();
    }

    public void setPtrFrameLayout(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        final C589402 r0 = new AbstractRunnableC58938c() {
            /* class com.ss.android.lark.widget.ptr.header.MaterialHeader.C589402 */

            public void run() {
                MaterialHeader materialHeader = MaterialHeader.this;
                materialHeader.startAnimation(materialHeader.f145955c);
            }
        };
        this.f145955c.setDuration(200);
        this.f145955c.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.lark.widget.ptr.header.MaterialHeader.animationAnimation$AnimationListenerC589413 */

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                r0.mo199940c();
            }
        });
        this.f145956d = lKUIPtrFrameLayout;
        lKUIPtrFrameLayout.setRefreshCompleteHook(r0);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = this.f145953a.getBounds();
        canvas.translate((float) (getPaddingLeft() + ((getMeasuredWidth() - this.f145953a.getIntrinsicWidth()) / 2)), (float) getPaddingTop());
        float f = this.f145954b;
        canvas.scale(f, f, bounds.exactCenterX(), bounds.exactCenterY());
        this.f145953a.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166238a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z) {
        this.f145953a.stop();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f145953a.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom(), 1073741824));
    }

    public MaterialHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m228785a();
    }

    public MaterialHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m228785a();
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166239a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z, byte b, C58935a aVar) {
        float min = Math.min(1.0f, aVar.mo199934y());
        if (b == 2) {
            this.f145953a.setAlpha((int) (255.0f * min));
            this.f145953a.mo199964a(true);
            this.f145953a.mo199962a(BitmapDescriptorFactory.HUE_RED, Math.min(0.8f, min * 0.8f));
            this.f145953a.mo199961a(Math.min(1.0f, min));
            this.f145953a.mo199966b((((0.4f * min) - 16.0f) + (min * 2.0f)) * 0.5f);
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int intrinsicHeight = this.f145953a.getIntrinsicHeight();
        this.f145953a.setBounds(0, 0, intrinsicHeight, intrinsicHeight);
    }
}
