package com.ss.android.lark.profile.func.v3.userprofile.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001dH\u0002J\u0010\u0010(\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020+H\u0014J\u0010\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020.H\u0016J\u0018\u0010/\u001a\u00020#2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001dH\u0014J\u0010\u00100\u001a\u00020\t2\u0006\u0010-\u001a\u00020.H\u0016J\f\u00101\u001a\u00020\u001d*\u00020%H\u0002R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00062"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/view/TextViewTagLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isTagTailing", "", "onTagClickListener", "Landroid/view/View$OnClickListener;", "getOnTagClickListener", "()Landroid/view/View$OnClickListener;", "setOnTagClickListener", "(Landroid/view/View$OnClickListener;)V", "tagBounds", "Landroid/graphics/Rect;", "value", "Landroid/graphics/drawable/Drawable;", "tagDrawable", "getTagDrawable", "()Landroid/graphics/drawable/Drawable;", "setTagDrawable", "(Landroid/graphics/drawable/Drawable;)V", "tagOffsetX", "", "tagOffsetY", "tagPaddingLeft", "", "getTagPaddingLeft", "()I", "setTagPaddingLeft", "(I)V", "measureTagOnTextView", "", "textView", "Landroid/widget/TextView;", "widthMeasureSpec", "heightMeasureSpec", "offsetTagDrawable", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "onMeasure", "onTouchEvent", "realLineCount", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TextViewTagLayout extends FrameLayout {

    /* renamed from: a */
    private Drawable f130663a;

    /* renamed from: b */
    private int f130664b;

    /* renamed from: c */
    private View.OnClickListener f130665c;

    /* renamed from: d */
    private boolean f130666d;

    /* renamed from: e */
    private final Rect f130667e = new Rect();

    /* renamed from: f */
    private float f130668f;

    /* renamed from: g */
    private float f130669g;

    public final View.OnClickListener getOnTagClickListener() {
        return this.f130665c;
    }

    public final Drawable getTagDrawable() {
        return this.f130663a;
    }

    public final int getTagPaddingLeft() {
        return this.f130664b;
    }

    public final void setOnTagClickListener(View.OnClickListener onClickListener) {
        this.f130665c = onClickListener;
    }

    public final void setTagPaddingLeft(int i) {
        this.f130664b = i;
    }

    public final void setTagDrawable(Drawable drawable) {
        this.f130663a = drawable;
        requestLayout();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextViewTagLayout(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setWillNotDraw(false);
    }

    /* renamed from: b */
    private final int m204554b(TextView textView) {
        if (textView.getLineCount() > textView.getMaxLines()) {
            return textView.getMaxLines();
        }
        return textView.getLineCount();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(this.f130668f, this.f130669g);
        Drawable drawable = this.f130663a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (this.f130663a != null && motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.f130665c != null && this.f130667e.contains(x, y)) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r2 != 2) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            android.graphics.drawable.Drawable r0 = r5.f130663a
            if (r0 == 0) goto L_0x003c
            float r0 = r6.getX()
            int r0 = (int) r0
            float r1 = r6.getY()
            int r1 = (int) r1
            int r2 = r6.getAction()
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 == r3) goto L_0x0020
            r4 = 2
            if (r2 == r4) goto L_0x0033
            goto L_0x003c
        L_0x0020:
            android.graphics.Rect r2 = r5.f130667e
            boolean r0 = r2.contains(r0, r1)
            if (r0 == 0) goto L_0x003c
            android.view.View$OnClickListener r6 = r5.f130665c
            if (r6 == 0) goto L_0x0032
            r0 = r5
            android.view.View r0 = (android.view.View) r0
            r6.onClick(r0)
        L_0x0032:
            return r3
        L_0x0033:
            android.graphics.Rect r2 = r5.f130667e
            boolean r0 = r2.contains(r0, r1)
            if (r0 == 0) goto L_0x003c
            return r3
        L_0x003c:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.v3.userprofile.view.TextViewTagLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private final void m204552a(TextView textView) {
        float f;
        float f2;
        Drawable drawable = this.f130663a;
        if (drawable == null) {
            this.f130667e.setEmpty();
            return;
        }
        TextPaint paint = textView.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "textView.paint");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (textView.getLayout() != null) {
            if (this.f130666d) {
                f = textView.getLayout().getLineWidth(m204554b(textView) - 1) + ((float) getPaddingLeft()) + ((float) this.f130664b);
                f2 = ((float) textView.getLayout().getLineTop(m204554b(textView) - 1)) + ((fontMetrics.descent - fontMetrics.ascent) / ((float) 2)) + (fontMetrics.ascent - fontMetrics.top);
            } else {
                f2 = ((fontMetrics.bottom - fontMetrics.top) / ((float) 2)) + ((float) textView.getLayout().getLineBottom(m204554b(textView) - 1));
                f = (float) getPaddingLeft();
            }
            float f3 = f2 - (((float) drawable.getBounds().bottom) / 2.0f);
            this.f130667e.set(drawable.getBounds());
            this.f130667e.offset((int) f, (int) f3);
            this.f130668f = f;
            this.f130669g = f3;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View childAt = getChildAt(0);
        if (childAt != null && (childAt instanceof TextView)) {
            TextView textView = (TextView) childAt;
            m204553a(textView, i, i2);
            m204552a(textView);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextViewTagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setWillNotDraw(false);
    }

    /* renamed from: a */
    private final void m204553a(TextView textView, int i, int i2) {
        Rect bounds;
        int i3;
        Drawable drawable = this.f130663a;
        if (drawable != null) {
            int i4 = 0;
            if (drawable != null) {
                int i5 = drawable.getBounds().right;
                Layout layout = textView.getLayout();
                if (layout == null) {
                    this.f130666d = false;
                } else {
                    int mode = View.MeasureSpec.getMode(i);
                    int size = View.MeasureSpec.getSize(i);
                    if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                        i3 = Math.max(size, layout.getWidth());
                    } else {
                        i3 = layout.getWidth();
                    }
                    boolean z = true;
                    if (((float) i3) < layout.getLineWidth(m204554b(textView) - 1) + ((float) i5) + ((float) getPaddingLeft()) + ((float) getPaddingRight()) + ((float) this.f130664b)) {
                        z = false;
                    }
                    this.f130666d = z;
                }
            }
            if (this.f130666d) {
                int measuredWidth = getMeasuredWidth();
                Drawable drawable2 = this.f130663a;
                if (!(drawable2 == null || (bounds = drawable2.getBounds()) == null)) {
                    i4 = bounds.right;
                }
                setMeasuredDimension(measuredWidth + i4 + this.f130664b, getMeasuredHeight());
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            int lineHeight = textView.getLineHeight();
            if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension(getMeasuredWidth(), Math.min(lineHeight + getMeasuredHeight(), size2));
            } else {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + lineHeight);
            }
        }
    }
}
