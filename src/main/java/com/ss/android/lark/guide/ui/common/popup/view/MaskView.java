package com.ss.android.lark.guide.ui.common.popup.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001c\u001a\u00020\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0012H\u0014J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0014J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\tJ\u000e\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\tJ\u000e\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\tJ\u000e\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\tJ\u000e\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u0014J\u0010\u0010-\u001a\u00020\u001d2\b\u0010.\u001a\u0004\u0018\u00010/R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/lark/guide/ui/common/popup/view/MaskView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mChangedHeight", "mCorner", "mEraser", "Landroid/graphics/Paint;", "mEraserBitmap", "Landroid/graphics/Bitmap;", "mEraserCanvas", "Landroid/graphics/Canvas;", "mFirstFlag", "", "mFullingPaint", "mInitHeight", "mNeedHighlight", "mOverlayRect", "Landroid/graphics/RectF;", "mStyle", "mTargetRect", "onDetachedFromWindow", "", "onDraw", "canvas", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setFullingAlpha", "alpha", "setFullingColor", "color", "setHighTargetGraphStyle", "style", "setHighlightTargetCorner", "corner", "setTargetHighlight", "enable", "setTargetRect", "rect", "Landroid/graphics/Rect;", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class MaskView extends View {

    /* renamed from: a */
    private final RectF f99489a;

    /* renamed from: b */
    private final RectF f99490b;

    /* renamed from: c */
    private final Paint f99491c;

    /* renamed from: d */
    private boolean f99492d;

    /* renamed from: e */
    private int f99493e;

    /* renamed from: f */
    private int f99494f;

    /* renamed from: g */
    private final Paint f99495g;

    /* renamed from: h */
    private Bitmap f99496h;

    /* renamed from: i */
    private final Canvas f99497i;

    /* renamed from: j */
    private int f99498j;

    /* renamed from: k */
    private int f99499k;

    /* renamed from: l */
    private boolean f99500l;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            clearFocus();
            this.f99497i.setBitmap(null);
            this.f99496h = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void setHighTargetGraphStyle(int i) {
        this.f99494f = i;
    }

    public final void setHighlightTargetCorner(int i) {
        this.f99493e = i;
    }

    public final void setTargetHighlight(boolean z) {
        this.f99492d = z;
    }

    public MaskView(Context context) {
        this(context, null, 0);
    }

    public final void setFullingAlpha(int i) {
        this.f99491c.setAlpha(i);
    }

    public final void setFullingColor(int i) {
        this.f99491c.setColor(i);
    }

    public final void setTargetRect(Rect rect) {
        this.f99489a.set(rect);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f99496h != null) {
            int i = this.f99499k;
            if (i != 0) {
                this.f99489a.offset(BitmapDescriptorFactory.HUE_RED, (float) i);
                this.f99498j += this.f99499k;
                this.f99499k = 0;
            }
            Bitmap bitmap = this.f99496h;
            if (bitmap != null) {
                bitmap.eraseColor(0);
            }
            this.f99497i.drawColor(this.f99491c.getColor());
            if (this.f99492d) {
                float f = (float) this.f99493e;
                int i2 = this.f99494f;
                if (i2 == 0) {
                    this.f99497i.drawCircle(this.f99489a.centerX(), this.f99489a.centerY(), this.f99489a.width() / ((float) 2), this.f99495g);
                } else if (i2 != 1) {
                    this.f99497i.drawRoundRect(this.f99489a, f, f, this.f99495g);
                } else {
                    this.f99497i.drawRoundRect(this.f99489a, f, f, this.f99495g);
                }
            }
            Bitmap bitmap2 = this.f99496h;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, this.f99490b.left, this.f99490b.top, (Paint) null);
            }
        }
    }

    public MaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        if (this.f99500l) {
            this.f99498j = size2;
            this.f99500l = false;
        }
        int i4 = this.f99498j;
        if (i4 > size2 || i4 < size2) {
            i3 = size2 - i4;
        }
        this.f99499k = i3;
        setMeasuredDimension(size, size2);
        this.f99490b.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) size, (float) size2);
    }

    public MaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f99489a = new RectF();
        RectF rectF = new RectF();
        this.f99490b = rectF;
        this.f99494f = 1;
        this.f99500l = true;
        setWillNotDraw(false);
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i2, (float) i3);
            this.f99496h = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.f99496h;
            if (bitmap == null) {
                Intrinsics.throwNpe();
            }
            this.f99497i = new Canvas(bitmap);
            this.f99491c = new Paint();
            Paint paint = new Paint();
            this.f99495g = paint;
            paint.setColor(-1);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setFlags(1);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
