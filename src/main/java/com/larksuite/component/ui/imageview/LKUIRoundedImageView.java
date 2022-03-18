package com.larksuite.component.ui.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.C25664b;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;

public class LKUIRoundedImageView extends AppCompatImageView {
    float mBadgeCenterX;
    float mBadgeCenterY;
    boolean mBadgeEnable;
    private int mBadgePadding;
    private int mBadgePosAngle;
    private int mBadgeTextColor;
    private int mBadgeTextSize;
    private RectF mBordRectF;
    private int mBorderColor;
    Drawable mBorderDrawable;
    private int mBorderPadding;
    private Paint mBorderPaint;
    private float mBorderWidth;
    private Paint mClearPaint;
    private Path mClearPath;
    private Matrix mImageMatrix;
    Paint mImagePaint;
    private RectF mImageRectF;
    private boolean mIsOval;
    private boolean mIsTouchSelectModeEnabled;
    C25664b mLkUIBadgeDrawable;
    private Path mPath;
    private float[] mRadiusii;
    private final int mSelectedBorderColor;
    private PorterDuffColorFilter mSelectedColorFilter;
    private final int mSelectedMaskColor;
    private RectF mViewRectF;

    public boolean isOval() {
        return this.mIsOval;
    }

    public float getCornerRadius() {
        return this.mRadiusii[0];
    }

    public C25664b getBadgeDrawable() {
        if (this.mLkUIBadgeDrawable == null) {
            C25664b a = new C25664b.C25666a().mo89425c((float) this.mBadgePadding).mo89418a((float) this.mBadgeTextSize).mo89419a(this.mBadgeTextColor).mo89422a();
            this.mLkUIBadgeDrawable = a;
            a.setCallback(this);
            this.mBadgeEnable = true;
        }
        return this.mLkUIBadgeDrawable;
    }

    private void init() {
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(2, null);
        }
        Paint paint = new Paint();
        this.mImagePaint = paint;
        paint.setFilterBitmap(true);
        this.mImagePaint.setAntiAlias(true);
        this.mImagePaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mPath = new Path();
        Paint paint2 = new Paint();
        this.mBorderPaint = paint2;
        paint2.setAntiAlias(true);
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
        if (this.mSelectedMaskColor != 0) {
            this.mSelectedColorFilter = new PorterDuffColorFilter(this.mSelectedMaskColor, PorterDuff.Mode.DARKEN);
        }
        this.mImageMatrix = new Matrix();
        Paint paint3 = new Paint(1);
        this.mClearPaint = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private void compute() {
        this.mViewRectF.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
        Drawable drawable = this.mBorderDrawable;
        if (drawable != null) {
            drawable.setBounds((int) this.mViewRectF.left, (int) this.mViewRectF.top, (int) this.mViewRectF.right, (int) this.mViewRectF.bottom);
        }
        float f = (this.mBorderWidth * 1.0f) / 2.0f;
        this.mBordRectF.set(this.mViewRectF);
        this.mBordRectF.inset(f, f);
        this.mImageRectF.set(this.mViewRectF);
        RectF rectF = this.mImageRectF;
        float f2 = this.mBorderWidth;
        int i = this.mBorderPadding;
        rectF.inset(((float) i) + f2, f2 + ((float) i));
        if (this.mIsOval && this.mLkUIBadgeDrawable != null) {
            this.mBadgeCenterX = (float) (((double) (getWidth() / 2)) + (Math.cos((((double) this.mBadgePosAngle) * 6.283185307179586d) / 360.0d) * ((double) (this.mBordRectF.width() / 2.0f))));
            this.mBadgeCenterY = (float) (((double) (getHeight() / 2)) + (Math.sin((((double) this.mBadgePosAngle) * 6.283185307179586d) / 360.0d) * ((double) (this.mBordRectF.height() / 2.0f))));
            this.mBadgeCenterX = Math.min(this.mBadgeCenterX, (float) (getWidth() - (this.mLkUIBadgeDrawable.getIntrinsicWidth() / 2)));
            this.mBadgeCenterY = Math.max(this.mBadgeCenterY, (float) (this.mLkUIBadgeDrawable.getIntrinsicHeight() / 2));
        }
    }

    public void setCornerRadiusDP(float f) {
        setCornerRadiusDP(f, f, f, f);
    }

    public LKUIRoundedImageView(Context context) {
        this(context, null);
    }

    public void setBadgeEnable(boolean z) {
        this.mBadgeEnable = z;
        invalidate();
    }

    public void setOval(boolean z) {
        this.mIsOval = z;
        invalidate();
    }

    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.mLkUIBadgeDrawable) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void setBadgePosAngle(int i) {
        if (this.mBadgePosAngle != i) {
            this.mBadgePosAngle = i;
            invalidate();
        }
    }

    public void setBorderColor(int i) {
        if (this.mBorderColor != i) {
            this.mBorderColor = i;
            invalidate();
        }
    }

    public void setBorderDrawable(Drawable drawable) {
        if (this.mBorderDrawable != drawable) {
            this.mBorderDrawable = drawable;
            invalidate();
        }
    }

    private boolean isDrawableValid(Drawable drawable) {
        if (drawable == null) {
            return false;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return true;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (getWidth() > 0 && getHeight() > 0) {
            compute();
            drawImage(canvas);
            drawBoard(canvas);
            drawBadge(canvas);
        }
    }

    public void setBorderPaddingInDp(float f) {
        float a = C25653b.m91892a(getContext(), f);
        if (a != ((float) this.mBorderPadding)) {
            this.mBorderPadding = (int) a;
            invalidate();
        }
    }

    public void setBorderWidthDP(float f) {
        float a = C25653b.m91892a(getContext(), f);
        if (a != this.mBorderWidth) {
            this.mBorderWidth = a;
            invalidate();
        }
    }

    public void setSelected(boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (z != isSelected()) {
            super.setSelected(z);
            if (z) {
                porterDuffColorFilter = this.mSelectedColorFilter;
            } else {
                porterDuffColorFilter = null;
            }
            setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    private void drawBadge(Canvas canvas) {
        C25664b bVar;
        if (this.mIsOval && this.mBadgeEnable && (bVar = this.mLkUIBadgeDrawable) != null && !bVar.mo89407a()) {
            canvas.save();
            canvas.translate(this.mBadgeCenterX, this.mBadgeCenterY);
            this.mLkUIBadgeDrawable.draw(canvas);
            canvas.restore();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            setSelected(false);
            return super.onTouchEvent(motionEvent);
        } else if (!this.mIsTouchSelectModeEnabled) {
            return super.onTouchEvent(motionEvent);
        } else {
            if (motionEvent.getAction() != 0) {
                setSelected(false);
            } else {
                setSelected(true);
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    private void drawBoard(Canvas canvas) {
        int i;
        if (this.mBorderWidth > BitmapDescriptorFactory.HUE_RED || this.mBorderDrawable != null) {
            Drawable drawable = this.mBorderDrawable;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            Paint paint = this.mBorderPaint;
            if (isSelected()) {
                i = this.mSelectedBorderColor;
            } else {
                i = this.mBorderColor;
            }
            paint.setColor(i);
            this.mBorderPaint.setStrokeWidth(this.mBorderWidth);
            this.mPath.reset();
            if (this.mIsOval) {
                this.mPath.addOval(this.mBordRectF, Path.Direction.CW);
            } else {
                this.mPath.addRoundRect(this.mBordRectF, this.mRadiusii, Path.Direction.CW);
            }
            canvas.drawPath(this.mPath, this.mBorderPaint);
        }
    }

    private void drawImage(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (isDrawableValid(drawable)) {
            Rect bounds = drawable.getBounds();
            if (bounds.width() != 0 && bounds.height() != 0) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = bounds.width();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = bounds.height();
                }
                float f = (float) intrinsicWidth;
                float f2 = (float) intrinsicHeight;
                float max = Math.max((this.mImageRectF.width() * 1.0f) / f, (this.mImageRectF.height() * 1.0f) / f2);
                this.mImageMatrix.reset();
                this.mImageMatrix.setScale(max, max);
                this.mImageMatrix.postTranslate((-((f * max) - ((float) getWidth()))) / 2.0f, (-((max * f2) - ((float) getHeight()))) / 2.0f);
                int saveCount = canvas.getSaveCount();
                canvas.save();
                this.mPath.reset();
                if (this.mIsOval) {
                    this.mPath.addOval(this.mImageRectF, Path.Direction.CW);
                } else {
                    this.mPath.addRoundRect(this.mImageRectF, this.mRadiusii, Path.Direction.CW);
                }
                Matrix matrix = this.mImageMatrix;
                if (matrix != null) {
                    canvas.setMatrix(matrix);
                }
                drawable.draw(canvas);
                if (getCropToPadding()) {
                    int scrollX = getScrollX();
                    int scrollY = getScrollY();
                    canvas.clipRect(getPaddingLeft() + scrollX, getPaddingTop() + scrollY, ((scrollX + getRight()) - getLeft()) - getPaddingRight(), ((scrollY + getBottom()) - getTop()) - getPaddingRight());
                }
                canvas.restoreToCount(saveCount);
                this.mClearPath.reset();
                this.mClearPath.set(this.mPath);
                this.mClearPath.toggleInverseFillType();
                canvas.drawPath(this.mClearPath, this.mClearPaint);
            }
        }
    }

    public LKUIRoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!this.mIsOval) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                boolean z2 = false;
                if (mode == Integer.MIN_VALUE || mode == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                    z2 = true;
                }
                float intrinsicWidth = (float) drawable.getIntrinsicWidth();
                float intrinsicHeight = (float) drawable.getIntrinsicHeight();
                float f = ((float) measuredWidth) / intrinsicWidth;
                float f2 = ((float) measuredHeight) / intrinsicHeight;
                if (z && z2) {
                    int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                    if (i3 >= 0 && f2 >= 1.0f) {
                        setMeasuredDimension((int) intrinsicWidth, (int) intrinsicHeight);
                    } else if (i3 >= 0) {
                        setMeasuredDimension((int) (intrinsicHeight * f2), measuredHeight);
                    } else if (f2 >= 1.0f) {
                        setMeasuredDimension(measuredWidth, (int) (intrinsicHeight * f));
                    } else if (f < f2) {
                        setMeasuredDimension(measuredWidth, (int) (intrinsicHeight * f));
                    } else {
                        setMeasuredDimension((int) (intrinsicWidth * f2), measuredHeight);
                    }
                } else if (z) {
                    setMeasuredDimension((int) (intrinsicWidth * f2), measuredHeight);
                } else if (z2) {
                    setMeasuredDimension(measuredWidth, (int) (intrinsicHeight * f));
                }
            }
        }
    }

    public LKUIRoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsTouchSelectModeEnabled = true;
        this.mBordRectF = new RectF();
        this.mImageRectF = new RectF();
        this.mViewRectF = new RectF();
        this.mRadiusii = new float[8];
        this.mClearPath = new Path();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.civ_badge_background, R.attr.civ_badge_icon, R.attr.civ_badge_min_size, R.attr.civ_badge_padding, R.attr.civ_badge_position_angle, R.attr.civ_badge_text, R.attr.civ_badge_text_color, R.attr.civ_badge_text_size, R.attr.civ_border_color, R.attr.civ_border_drawable, R.attr.civ_border_padding, R.attr.civ_border_width, R.attr.civ_oval, R.attr.civ_radius, R.attr.civ_radius_left_bottom, R.attr.civ_radius_left_top, R.attr.civ_radius_right_bottom, R.attr.civ_radius_right_top, R.attr.civ_selected_board_color, R.attr.civ_selected_mask_color, R.attr.civ_touch_select_enable}, i, 0);
        this.mBorderWidth = (float) obtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.mBorderColor = obtainStyledAttributes.getColor(8, -1);
        this.mBorderPadding = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.mBorderDrawable = obtainStyledAttributes.getDrawable(9);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        String string = obtainStyledAttributes.getString(5);
        Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
        this.mBadgeTextColor = obtainStyledAttributes.getColor(6, -1);
        this.mBadgePadding = obtainStyledAttributes.getDimensionPixelSize(3, (int) C25653b.m91892a(context, 2.0f));
        this.mBadgeTextSize = obtainStyledAttributes.getDimensionPixelSize(7, (int) C25653b.m91892a(context, 12.0f));
        this.mBadgePosAngle = obtainStyledAttributes.getInteger(4, -45);
        this.mIsTouchSelectModeEnabled = obtainStyledAttributes.getBoolean(20, true);
        this.mSelectedBorderColor = obtainStyledAttributes.getColor(18, this.mBorderColor);
        this.mSelectedMaskColor = obtainStyledAttributes.getColor(19, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(15, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(16, dimensionPixelSize);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(14, dimensionPixelSize);
        float[] fArr = this.mRadiusii;
        float f = (float) dimensionPixelSize2;
        fArr[1] = f;
        fArr[0] = f;
        float f2 = (float) dimensionPixelSize3;
        fArr[3] = f2;
        fArr[2] = f2;
        float f3 = (float) dimensionPixelSize4;
        fArr[5] = f3;
        fArr[4] = f3;
        float f4 = (float) dimensionPixelSize5;
        fArr[7] = f4;
        fArr[6] = f4;
        this.mIsOval = obtainStyledAttributes.getBoolean(12, false);
        obtainStyledAttributes.recycle();
        if (!(drawable == null && TextUtils.isEmpty(string) && drawable2 == null)) {
            this.mBadgeEnable = true;
            C25664b a = new C25664b.C25666a().mo89424b(drawable2).mo89420a(drawable).mo89425c((float) this.mBadgePadding).mo89424b(drawable2).mo89421a(string).mo89418a((float) this.mBadgeTextSize).mo89419a(this.mBadgeTextColor).mo89422a();
            this.mLkUIBadgeDrawable = a;
            a.setCallback(this);
        }
        init();
    }

    public void setCornerRadiusDP(float f, float f2, float f3, float f4) {
        float a = C25653b.m91892a(getContext(), f);
        float a2 = C25653b.m91892a(getContext(), f2);
        float a3 = C25653b.m91892a(getContext(), f3);
        float a4 = C25653b.m91892a(getContext(), f4);
        float[] fArr = this.mRadiusii;
        if (a != fArr[0] || a2 != fArr[2] || a3 != fArr[4] || a4 != fArr[6]) {
            fArr[1] = a;
            fArr[0] = a;
            fArr[3] = a2;
            fArr[2] = a2;
            fArr[5] = a3;
            fArr[4] = a3;
            fArr[7] = a4;
            fArr[6] = a4;
            this.mIsOval = false;
            invalidate();
        }
    }
}
