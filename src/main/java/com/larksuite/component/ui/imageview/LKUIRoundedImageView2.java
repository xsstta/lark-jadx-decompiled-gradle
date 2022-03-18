package com.larksuite.component.ui.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0014J\u0010\u0010&\u001a\u00020\"2\b\b\u0001\u0010'\u001a\u00020\u0007J\u0010\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010\u0016J\u0010\u0010*\u001a\u00020\"2\b\b\u0001\u0010+\u001a\u00020\u001dJ\u000e\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u001dJ\b\u0010.\u001a\u00020\"H\u0002J\u000e\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\u001fJ\u0010\u00101\u001a\u00020\"2\b\b\u0001\u00102\u001a\u00020\u001dJ\u000e\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u001dR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBoardPaint", "Landroid/graphics/Paint;", "getMBoardPaint", "()Landroid/graphics/Paint;", "mBoardPaint$delegate", "Lkotlin/Lazy;", "mBordRectF", "Landroid/graphics/RectF;", "getMBordRectF", "()Landroid/graphics/RectF;", "mBordRectF$delegate", "mBorderColor", "mBorderDrawable", "Landroid/graphics/drawable/Drawable;", "mBorderPath", "Landroid/graphics/Path;", "getMBorderPath", "()Landroid/graphics/Path;", "mBorderPath$delegate", "mBorderWidth", "", "mIsOval", "", "mRadius", "drawBorderIfNeed", "", "canvas", "Landroid/graphics/Canvas;", "onDraw", "setBorderColor", "borderColor", "setBorderDrawable", "drawable", "setBorderWidth", "width", "setBorderWidthInDp", "widthInDp", "setClipOutlineIfNeed", "setOval", "isOval", "setRadius", "radius", "setRadiusInDp", "radiusInDp", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public class LKUIRoundedImageView2 extends AppCompatImageView {
    private HashMap _$_findViewCache;
    private final Lazy mBoardPaint$delegate;
    private final Lazy mBordRectF$delegate;
    private int mBorderColor;
    private Drawable mBorderDrawable;
    private final Lazy mBorderPath$delegate;
    private float mBorderWidth;
    public boolean mIsOval;
    public float mRadius;

    public LKUIRoundedImageView2(Context context) {
        this(context, null, 0, 6, null);
    }

    public LKUIRoundedImageView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Paint getMBoardPaint() {
        return (Paint) this.mBoardPaint$delegate.getValue();
    }

    private final RectF getMBordRectF() {
        return (RectF) this.mBordRectF$delegate.getValue();
    }

    private final Path getMBorderPath() {
        return (Path) this.mBorderPath$delegate.getValue();
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/RectF;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.imageview.LKUIRoundedImageView2$b */
    static final class C25657b extends Lambda implements Function0<RectF> {
        public static final C25657b INSTANCE = new C25657b();

        C25657b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RectF invoke() {
            return new RectF();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Path;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.imageview.LKUIRoundedImageView2$c */
    static final class C25658c extends Lambda implements Function0<Path> {
        public static final C25658c INSTANCE = new C25658c();

        C25658c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Path invoke() {
            return new Path();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.imageview.LKUIRoundedImageView2$a */
    static final class C25656a extends Lambda implements Function0<Paint> {
        public static final C25656a INSTANCE = new C25656a();

        C25656a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Paint invoke() {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    private final void setClipOutlineIfNeed() {
        if (this.mIsOval || this.mRadius != BitmapDescriptorFactory.HUE_RED) {
            setOutlineProvider(new C25659d(this));
            setClipToOutline(true);
        } else {
            setClipToOutline(false);
            setOutlineProvider(null);
        }
        invalidate();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/larksuite/component/ui/imageview/LKUIRoundedImageView2$setClipOutlineIfNeed$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.imageview.LKUIRoundedImageView2$d */
    public static final class C25659d extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ LKUIRoundedImageView2 f62637a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25659d(LKUIRoundedImageView2 lKUIRoundedImageView2) {
            this.f62637a = lKUIRoundedImageView2;
        }

        public void getOutline(View view, Outline outline) {
            if (this.f62637a.mIsOval) {
                if (outline != null) {
                    outline.setOval(0, 0, this.f62637a.getWidth(), this.f62637a.getHeight());
                }
            } else if (outline != null) {
                outline.setRoundRect(0, 0, this.f62637a.getWidth(), this.f62637a.getHeight(), this.f62637a.mRadius);
            }
        }
    }

    public final void setBorderColor(int i) {
        this.mBorderColor = i;
        invalidate();
    }

    public final void setBorderDrawable(Drawable drawable) {
        this.mBorderDrawable = drawable;
        invalidate();
    }

    public final void setBorderWidth(float f) {
        this.mBorderWidth = f;
        invalidate();
    }

    public final void setOval(boolean z) {
        this.mIsOval = z;
        setClipOutlineIfNeed();
    }

    public final void setRadius(float f) {
        this.mRadius = f;
        setClipOutlineIfNeed();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        drawBorderIfNeed(canvas);
    }

    public final void setBorderWidthInDp(float f) {
        setBorderWidth(C25653b.m91892a(getContext(), f));
    }

    public final void setRadiusInDp(float f) {
        setRadius(C25653b.m91892a(getContext(), f));
    }

    private final void drawBorderIfNeed(Canvas canvas) {
        Drawable drawable = this.mBorderDrawable;
        if (drawable != null) {
            if (drawable != null) {
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            }
            Drawable drawable2 = this.mBorderDrawable;
            if (drawable2 != null) {
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        float f = this.mBorderWidth;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            float f2 = (f * 1.0f) / ((float) 2);
            getMBordRectF().set((float) getPaddingLeft(), (float) getPaddingTop(), ((float) getWidth()) - ((float) getPaddingRight()), ((float) getHeight()) - ((float) getPaddingBottom()));
            getMBordRectF().inset(f2, f2);
            getMBoardPaint().setColor(this.mBorderColor);
            getMBoardPaint().setStrokeWidth(this.mBorderWidth);
            Path mBorderPath = getMBorderPath();
            mBorderPath.reset();
            if (this.mIsOval) {
                mBorderPath.addOval(getMBordRectF(), Path.Direction.CW);
            } else {
                RectF mBordRectF = getMBordRectF();
                float f3 = this.mRadius;
                mBorderPath.addRoundRect(mBordRectF, f3, f3, Path.Direction.CW);
            }
            if (canvas != null) {
                canvas.drawPath(mBorderPath, getMBoardPaint());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LKUIRoundedImageView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.border_color, R.attr.border_drawable, R.attr.border_width, R.attr.oval, R.attr.radius}, 0, 0);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…IRoundedImageView2, 0, 0)");
        float dimension = obtainStyledAttributes.getDimension(4, BitmapDescriptorFactory.HUE_RED);
        boolean z = obtainStyledAttributes.getBoolean(3, false);
        float dimension2 = obtainStyledAttributes.getDimension(2, BitmapDescriptorFactory.HUE_RED);
        int color = obtainStyledAttributes.getColor(0, ContextCompat.getColor(context, R.color.lkui_N200));
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        setRadius(dimension);
        setOval(z);
        setBorderWidth(dimension2);
        setBorderColor(color);
        setBorderDrawable(drawable);
        this.mBoardPaint$delegate = LazyKt.lazy(C25656a.INSTANCE);
        this.mBorderPath$delegate = LazyKt.lazy(C25658c.INSTANCE);
        this.mBordRectF$delegate = LazyKt.lazy(C25657b.INSTANCE);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LKUIRoundedImageView2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
