package com.lynx.tasm.behavior.ui.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import com.lynx.tasm.behavior.C26673g;
import com.lynx.tasm.behavior.shadow.text.C26733n;
import com.lynx.tasm.behavior.ui.background.AbstractC26751a;
import com.lynx.tasm.utils.C26959m;

public class AndroidText extends View {
    private AbstractC26751a mGradient;
    protected boolean mHasImage;
    private int mOverflow = 0;
    private Picture mOverflowPicture = new Picture();
    private boolean mOverflowPictureDirty = true;
    private Rect mTextBounds = new Rect();
    protected Layout mTextLayout;

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public Layout getTextLayout() {
        return this.mTextLayout;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dispatchDetachImageSpan();
    }

    public CharSequence getText() {
        Layout layout = this.mTextLayout;
        if (layout != null) {
            return layout.getText();
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            AbstractC26821a.m97430a((Spanned) getText(), this);
        }
    }

    private void dispatchDetachImageSpan() {
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            AbstractC26821a[] aVarArr = (AbstractC26821a[]) spanned.getSpans(0, spanned.length(), AbstractC26821a.class);
            for (AbstractC26821a aVar : aVarArr) {
                aVar.mo67429b();
                aVar.mo67428a((Drawable.Callback) null);
            }
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC26821a aVar : (AbstractC26821a[]) spanned.getSpans(0, spanned.length(), AbstractC26821a.class)) {
                aVar.mo67432e();
            }
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC26821a aVar : (AbstractC26821a[]) spanned.getSpans(0, spanned.length(), AbstractC26821a.class)) {
                aVar.mo67430c();
            }
        }
    }

    private void drawOverflowPicture() {
        if (this.mOverflowPictureDirty && this.mTextLayout != null) {
            if (this.mOverflowPicture == null) {
                this.mOverflowPicture = new Picture();
            }
            Canvas beginRecording = this.mOverflowPicture.beginRecording(this.mTextLayout.getWidth(), this.mTextLayout.getHeight());
            beginRecording.save();
            if (Build.VERSION.SDK_INT >= 18 && getClipBounds() != null) {
                beginRecording.clipRect(getClipBounds());
            }
            AbstractC26751a aVar = this.mGradient;
            if (aVar != null) {
                aVar.setBounds(this.mTextBounds);
                this.mTextLayout.getPaint().setShader(this.mGradient.mo95160f());
            }
            this.mTextLayout.draw(beginRecording);
            beginRecording.restore();
            this.mOverflowPicture.endRecording();
            this.mOverflowPictureDirty = false;
        }
    }

    public void setOverflow(int i) {
        this.mOverflow = i;
    }

    /* access modifiers changed from: protected */
    public Layout generateTextLayout(C26733n nVar) {
        return nVar.mo94910a();
    }

    public void setTextGradient(String str) {
        this.mGradient = C26673g.m96601a(str);
    }

    public AndroidText(Context context) {
        super(context);
        setFocusable(true);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (C26959m.m97972a()) {
            if (this.mHasImage && (getText() instanceof Spanned)) {
                Spanned spanned = (Spanned) getText();
                for (AbstractC26821a aVar : (AbstractC26821a[]) spanned.getSpans(0, spanned.length(), AbstractC26821a.class)) {
                    if (aVar.mo67427a() == drawable) {
                        invalidate();
                        this.mOverflowPictureDirty = true;
                    }
                }
            }
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC26821a aVar : (AbstractC26821a[]) spanned.getSpans(0, spanned.length(), AbstractC26821a.class)) {
                if (aVar.mo67427a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.mTextLayout != null) {
            canvas.save();
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            if (this.mOverflow != 0) {
                drawOverflowPicture();
                canvas.drawPicture(this.mOverflowPicture);
            } else {
                AbstractC26751a aVar = this.mGradient;
                if (aVar != null) {
                    aVar.setBounds(this.mTextBounds);
                    this.mTextLayout.getPaint().setShader(this.mGradient.mo95160f());
                }
                this.mTextLayout.draw(canvas);
            }
            canvas.restore();
        }
    }

    public void setTextBundle(C26733n nVar) {
        dispatchDetachImageSpan();
        this.mTextLayout = generateTextLayout(nVar);
        this.mTextBounds = new Rect(0, 0, this.mTextLayout.getWidth(), this.mTextLayout.getHeight());
        boolean b = nVar.mo94911b();
        this.mHasImage = b;
        if (b && (getText() instanceof Spanned)) {
            AbstractC26821a.m97430a((Spanned) getText(), this);
        }
        setContentDescription(this.mTextLayout.getText());
        invalidate();
        this.mOverflowPictureDirty = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }
}
