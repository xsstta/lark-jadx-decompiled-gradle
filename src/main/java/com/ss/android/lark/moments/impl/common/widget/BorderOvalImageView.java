package com.ss.android.lark.moments.impl.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0014J\u0010\u0010&\u001a\u00020!2\b\b\u0001\u0010'\u001a\u00020\u0007J\u0010\u0010(\u001a\u00020!2\b\b\u0001\u0010)\u001a\u00020\u001bR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001e\u0010\f¨\u0006*"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/BorderOvalImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBoardPaint", "Landroid/graphics/Paint;", "getMBoardPaint", "()Landroid/graphics/Paint;", "mBoardPaint$delegate", "Lkotlin/Lazy;", "mBordRectF", "Landroid/graphics/RectF;", "getMBordRectF", "()Landroid/graphics/RectF;", "mBordRectF$delegate", "mBorderColor", "mBorderPath", "Landroid/graphics/Path;", "getMBorderPath", "()Landroid/graphics/Path;", "mBorderPath$delegate", "mBorderWidth", "", "mFixDistance", "mPaint", "getMPaint", "mPaint$delegate", "drawBorder", "", "canvas", "Landroid/graphics/Canvas;", "drawImage", "onDraw", "setBorderColor", "borderColor", "setBorderWidth", "width", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BorderOvalImageView extends AppCompatImageView {

    /* renamed from: a */
    private final int f119258a;

    /* renamed from: b */
    private float f119259b;

    /* renamed from: c */
    private int f119260c;

    /* renamed from: d */
    private final Lazy f119261d;

    /* renamed from: e */
    private final Lazy f119262e;

    /* renamed from: f */
    private final Lazy f119263f;

    /* renamed from: g */
    private final Lazy f119264g;

    public BorderOvalImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BorderOvalImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Paint getMBoardPaint() {
        return (Paint) this.f119261d.getValue();
    }

    private final RectF getMBordRectF() {
        return (RectF) this.f119264g.getValue();
    }

    private final Path getMBorderPath() {
        return (Path) this.f119263f.getValue();
    }

    private final Paint getMPaint() {
        return (Paint) this.f119262e.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/RectF;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.BorderOvalImageView$b */
    static final class C47284b extends Lambda implements Function0<RectF> {
        public static final C47284b INSTANCE = new C47284b();

        C47284b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RectF invoke() {
            return new RectF();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Path;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.BorderOvalImageView$c */
    static final class C47285c extends Lambda implements Function0<Path> {
        public static final C47285c INSTANCE = new C47285c();

        C47285c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Path invoke() {
            return new Path();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.BorderOvalImageView$d */
    static final class C47286d extends Lambda implements Function0<Paint> {
        public static final C47286d INSTANCE = new C47286d();

        C47286d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Paint invoke() {
            return new Paint(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.BorderOvalImageView$a */
    static final class C47283a extends Lambda implements Function0<Paint> {
        public static final C47283a INSTANCE = new C47283a();

        C47283a() {
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

    public final void setBorderColor(int i) {
        this.f119260c = i;
        invalidate();
    }

    public final void setBorderWidth(float f) {
        this.f119259b = f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        m187262a(canvas);
        m187263b(canvas);
    }

    /* renamed from: b */
    private final void m187263b(Canvas canvas) {
        float f = this.f119259b;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            float f2 = (f * 1.0f) / ((float) 2);
            getMBordRectF().set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
            getMBordRectF().inset(f2, f2);
            getMBoardPaint().setColor(this.f119260c);
            getMBoardPaint().setStrokeWidth(this.f119259b);
            Path mBorderPath = getMBorderPath();
            mBorderPath.reset();
            mBorderPath.addOval(getMBordRectF(), Path.Direction.CW);
            canvas.drawPath(mBorderPath, getMBoardPaint());
        }
    }

    /* renamed from: a */
    private final void m187262a(Canvas canvas) {
        Bitmap bitmap;
        int i;
        Drawable drawable = getDrawable();
        if (!(drawable instanceof BitmapDrawable)) {
            drawable = null;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            bitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(UIUtils.getColor(getContext(), R.color.ud_N00));
        }
        getMPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        float min = ((float) Math.min(getWidth(), getHeight())) / 2.0f;
        Intrinsics.checkExpressionValueIsNotNull(bitmap, "bitmap");
        float min2 = (2.0f * min) / ((float) Math.min(bitmap.getHeight(), bitmap.getWidth()));
        Shader shader = getMPaint().getShader();
        Matrix matrix = new Matrix();
        matrix.setScale(min2, min2);
        shader.setLocalMatrix(matrix);
        if (this.f119259b == BitmapDescriptorFactory.HUE_RED) {
            i = 0;
        } else {
            i = this.f119258a;
        }
        canvas.drawCircle(min, min, min - ((float) i), getMPaint());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderOvalImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f119258a = UIUtils.dp2px(context, 1.0f);
        this.f119261d = LazyKt.lazy(C47283a.INSTANCE);
        this.f119262e = LazyKt.lazy(C47286d.INSTANCE);
        this.f119263f = LazyKt.lazy(C47285c.INSTANCE);
        this.f119264g = LazyKt.lazy(C47284b.INSTANCE);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.border_color, R.attr.border_width}, 0, 0);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…orderOvalImageView, 0, 0)");
        this.f119259b = obtainStyledAttributes.getDimension(1, BitmapDescriptorFactory.HUE_RED);
        this.f119260c = obtainStyledAttributes.getColor(0, ContextCompat.getColor(context, R.color.bg_base));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BorderOvalImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
