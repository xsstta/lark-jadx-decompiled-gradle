package com.larksuite.component.ui.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.p1153e.C25654c;
import com.larksuite.component.ui.p1153e.C25655d;
import com.larksuite.suite.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b'\u0018\u0000 V2\u00020\u0001:\u0001VB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\"\u001a\u00020#H\u0002JH\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0002J\u0010\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u000200H\u0014J(\u00101\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0012H\u0002J\b\u00102\u001a\u00020\u0017H\u0002J\u0006\u00103\u001a\u00020\u0012J\u0006\u00104\u001a\u00020\u0012J\u0006\u00105\u001a\u00020\u0012J\u0006\u00106\u001a\u00020\u0012J\u0006\u00107\u001a\u00020\u0012J\b\u00108\u001a\u00020\u0019H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J(\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0007H\u0014J\u0010\u0010>\u001a\u00020#2\b\b\u0001\u0010?\u001a\u00020\u0007J\u000e\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020\u0007J\u000e\u0010B\u001a\u00020#2\u0006\u0010C\u001a\u00020\u0012J\u000e\u0010D\u001a\u00020#2\u0006\u0010E\u001a\u00020\u0012J\b\u0010F\u001a\u00020#H\u0002J\u000e\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020\u0007J(\u0010G\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0016J\u000e\u0010I\u001a\u00020#2\u0006\u0010J\u001a\u00020\u0012J&\u0010I\u001a\u00020#2\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012J&\u0010K\u001a\u00020#2\u0006\u0010L\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u00122\u0006\u0010N\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u0012J\u000e\u0010K\u001a\u00020#2\u0006\u0010P\u001a\u00020\u0007J,\u0010Q\u001a\u00020#*\u00020\u00172\u0006\u0010R\u001a\u00020\u00122\u0006\u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u0007H\u0002R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0014\u0010\fR\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Lcom/larksuite/component/ui/layout/LKUIRoundLinearLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "boardPaint", "Landroid/graphics/Paint;", "getBoardPaint", "()Landroid/graphics/Paint;", "boardPaint$delegate", "Lkotlin/Lazy;", "boarderColor", "borderMode", "borderWidth", "", "clearPaint", "getClearPaint", "clearPaint$delegate", "clearPath", "Landroid/graphics/Path;", "isVeryLargeThanScreen", "", "originPaddingBottom", "originPaddingLeft", "originPaddingRight", "originPaddingTop", "radiusLeftBottom", "radiusLeftTop", "radiusRightBottom", "radiusRightTop", "amendPadding", "", "createPathKey", "", "left", "top", "right", "bottom", "leftTopRadiusInDp", "leftBottomRadiusInDp", "rightTopRadiusInDp", "rightBottomRadiusInDp", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "getBorderPath", "getClearCanvasPath", "getLeftBottomRadius", "getLeftTopRadius", "getRadius", "getRightBottomRadius", "getRightTopRadius", "hasBorder", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "setBorderColor", "color", "setBorderMode", "mode", "setBorderWidth", "widthInDp", "setBorderWidthInPx", "widthInPx", "setClipOutline", "setPadding", "padding", "setRadius", "radiusInDp", "setRadiusInPx", "leftTopRadius", "leftBottomRadius", "rightTopRadius", "rightBottomRadius", "radiusInPx", "arcTo", "x", "y", "radius", "rotations", "Companion", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LKUIRoundLinearLayout extends LinearLayout {

    /* renamed from: b */
    public static final Companion f62681b = new Companion(null);

    /* renamed from: q */
    private static final LKUIRoundLinearLayout$Companion$sPathCache$1 f62682q = new LKUIRoundLinearLayout$Companion$sPathCache$1();

    /* renamed from: a */
    public float f62683a;

    /* renamed from: c */
    private float f62684c;

    /* renamed from: d */
    private float f62685d;

    /* renamed from: e */
    private float f62686e;

    /* renamed from: f */
    private int f62687f;

    /* renamed from: g */
    private int f62688g;

    /* renamed from: h */
    private int f62689h;

    /* renamed from: i */
    private int f62690i;

    /* renamed from: j */
    private float f62691j;

    /* renamed from: k */
    private int f62692k;

    /* renamed from: l */
    private final Lazy f62693l;

    /* renamed from: m */
    private final Lazy f62694m;

    /* renamed from: n */
    private Path f62695n;

    /* renamed from: o */
    private int f62696o;

    /* renamed from: p */
    private boolean f62697p;

    public LKUIRoundLinearLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public LKUIRoundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Paint getBoardPaint() {
        return (Paint) this.f62693l.getValue();
    }

    private final Paint getClearPaint() {
        return (Paint) this.f62694m.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u00020\u00078\u0002X\u0004¢\u0006\n\n\u0002\u0010\t\u0012\u0004\b\b\u0010\u0002¨\u0006\n"}, d2 = {"Lcom/larksuite/component/ui/layout/LKUIRoundLinearLayout$Companion;", "", "()V", "MODE_INSET", "", "MODE_OVERLAY", "sPathCache", "com/larksuite/component/ui/layout/LKUIRoundLinearLayout$Companion$sPathCache$1", "sPathCache$annotations", "Lcom/larksuite/component/ui/layout/LKUIRoundLinearLayout$Companion$sPathCache$1;", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.LKUIRoundLinearLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final float getLeftBottomRadius() {
        return this.f62685d;
    }

    public final float getLeftTopRadius() {
        return this.f62683a;
    }

    public final float getRadius() {
        return this.f62683a;
    }

    public final float getRightBottomRadius() {
        return this.f62686e;
    }

    public final float getRightTopRadius() {
        return this.f62684c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.LKUIRoundLinearLayout$b */
    static final class C25667b extends Lambda implements Function0<Paint> {
        public static final C25667b INSTANCE = new C25667b();

        C25667b() {
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

    /* renamed from: a */
    private final boolean m92002a() {
        if (this.f62691j <= ((float) 0) || this.f62692k == 0) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.LKUIRoundLinearLayout$c */
    static final class C25668c extends Lambda implements Function0<Paint> {
        public static final C25668c INSTANCE = new C25668c();

        C25668c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Paint invoke() {
            Paint paint = new Paint(1);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            return paint;
        }
    }

    /* renamed from: d */
    private final void m92006d() {
        int i;
        if (this.f62696o == 1) {
            i = (int) this.f62691j;
        } else {
            i = 0;
        }
        super.setPadding(this.f62687f + i, this.f62688g + i, this.f62689h + i, this.f62690i + i);
    }

    /* renamed from: b */
    private final boolean m92003b() {
        C25654c a = C25655d.m91902a(getContext());
        int width = getWidth();
        Intrinsics.checkExpressionValueIsNotNull(a, "screeSize");
        if (width > a.mo89313a() * 2 || getHeight() > a.mo89314b() * 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m92005c() {
        float f = this.f62683a;
        if (f == this.f62684c && f == this.f62685d && f == this.f62686e) {
            setOutlineProvider(new C25669d(this));
            setClipToOutline(true);
        } else {
            setClipToOutline(false);
            setOutlineProvider(null);
        }
        invalidate();
    }

    private final Path getClearCanvasPath() {
        this.f62695n.reset();
        this.f62695n.set(m92004c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight()));
        this.f62695n.toggleInverseFillType();
        return this.f62695n;
    }

    public final void setPadding(int i) {
        setPadding(i, i, i, i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/larksuite/component/ui/layout/LKUIRoundLinearLayout$setClipOutline$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.LKUIRoundLinearLayout$d */
    public static final class C25669d extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ LKUIRoundLinearLayout f62698a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25669d(LKUIRoundLinearLayout lKUIRoundLinearLayout) {
            this.f62698a = lKUIRoundLinearLayout;
        }

        public void getOutline(View view, Outline outline) {
            if (outline != null) {
                outline.setRoundRect(0, 0, this.f62698a.getWidth(), this.f62698a.getHeight(), this.f62698a.f62683a);
            }
        }
    }

    public final void setBorderColor(int i) {
        this.f62692k = i;
        invalidate();
    }

    public final void setBorderWidth(float f) {
        setBorderWidthInPx(C25653b.m91892a(getContext(), f));
    }

    public final void setRadius(float f) {
        setRadiusInPx((int) C25653b.m91892a(getContext(), f));
    }

    public final void setRadiusInPx(int i) {
        float f = (float) i;
        this.f62683a = f;
        this.f62685d = f;
        this.f62684c = f;
        this.f62686e = f;
        m92005c();
    }

    public final void setBorderMode(int i) {
        boolean z;
        if (this.f62696o != i) {
            z = true;
        } else {
            z = false;
        }
        this.f62696o = i;
        m92006d();
        if (z) {
            m92005c();
        }
    }

    public final void setBorderWidthInPx(float f) {
        boolean z;
        if (this.f62691j != f) {
            z = true;
        } else {
            z = false;
        }
        this.f62691j = f;
        m92006d();
        if (z) {
            m92005c();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (!getClipToOutline() && this.f62697p) {
            canvas.clipPath(m92004c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight()));
        }
        try {
            super.dispatchDraw(canvas);
            if (m92002a()) {
                getBoardPaint().setColor(this.f62692k);
                getBoardPaint().setStrokeWidth(this.f62691j * ((float) 2));
                canvas.drawPath(m92004c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight()), getBoardPaint());
            }
            if (getClipToOutline() || this.f62697p) {
                setLayerType(0, null);
                return;
            }
            setLayerType(2, null);
            canvas.drawPath(getClearCanvasPath(), getClearPaint());
        } catch (RuntimeException e) {
            String message = e.getMessage();
            if (message != null && !StringsKt.contains$default((CharSequence) message, (CharSequence) "recycled bitmap", false, 2, (Object) null)) {
                throw e;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LKUIRoundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f62693l = LazyKt.lazy(C25667b.INSTANCE);
        this.f62694m = LazyKt.lazy(C25668c.INSTANCE);
        this.f62695n = new Path();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.rl_border_color, R.attr.rl_border_mode, R.attr.rl_border_width, R.attr.rl_radius, R.attr.rl_radius_left_bottom, R.attr.rl_radius_left_top, R.attr.rl_radius_right_bottom, R.attr.rl_radius_right_top}, 0, 0);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…KUIRoundableLayout, 0, 0)");
        float dimension = obtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED);
        this.f62683a = obtainStyledAttributes.getDimension(5, dimension);
        this.f62685d = obtainStyledAttributes.getDimension(4, dimension);
        this.f62684c = obtainStyledAttributes.getDimension(7, dimension);
        this.f62686e = obtainStyledAttributes.getDimension(6, dimension);
        this.f62691j = obtainStyledAttributes.getDimension(2, BitmapDescriptorFactory.HUE_RED);
        this.f62692k = obtainStyledAttributes.getColor(0, ContextCompat.getColor(context, R.color.ud_N200));
        this.f62696o = obtainStyledAttributes.getInt(1, 0);
        obtainStyledAttributes.recycle();
        this.f62687f = getPaddingLeft();
        this.f62688g = getPaddingTop();
        this.f62689h = getPaddingRight();
        this.f62690i = getPaddingBottom();
        if (this.f62691j > ((float) 0) && this.f62696o == 1) {
            m92006d();
        }
    }

    /* renamed from: b */
    public final void mo89624b(float f, float f2, float f3, float f4) {
        this.f62683a = f;
        this.f62685d = f2;
        this.f62684c = f3;
        this.f62686e = f4;
        m92005c();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f62697p = m92003b();
        m92005c();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f62687f = i;
        this.f62688g = i2;
        this.f62689h = i3;
        this.f62690i = i4;
        m92006d();
    }

    /* renamed from: a */
    public final void mo89623a(float f, float f2, float f3, float f4) {
        mo89624b(C25653b.m91892a(getContext(), f), C25653b.m91892a(getContext(), f2), C25653b.m91892a(getContext(), f3), C25653b.m91892a(getContext(), f4));
    }

    /* renamed from: c */
    private final Path m92004c(float f, float f2, float f3, float f4) {
        LKUIRoundLinearLayout$Companion$sPathCache$1 lKUIRoundLinearLayout$Companion$sPathCache$1 = f62682q;
        Path path = (Path) lKUIRoundLinearLayout$Companion$sPathCache$1.get((Object) m92000a(f, f2, f3, f4, this.f62683a, this.f62685d, this.f62684c, this.f62686e));
        if (path != null) {
            return path;
        }
        Path path2 = new Path();
        path2.reset();
        path2.moveTo(this.f62683a + f, f2);
        path2.lineTo(f3 - this.f62684c, f2);
        float f5 = this.f62684c;
        m92001a(path2, f3 - f5, f2 + f5, f5, -1);
        path2.lineTo(f3, f4 - this.f62686e);
        float f6 = this.f62686e;
        m92001a(path2, f3 - f6, f4 - f6, f6, 0);
        path2.lineTo(this.f62685d + f, f4);
        float f7 = this.f62685d;
        m92001a(path2, f + f7, f4 - f7, f7, 1);
        path2.lineTo(f, this.f62683a + f2);
        float f8 = this.f62683a;
        m92001a(path2, f + f8, f2 + f8, f8, 2);
        path2.lineTo(this.f62683a + f, f2);
        path2.close();
        lKUIRoundLinearLayout$Companion$sPathCache$1.put(m92000a(f, f2, f3, f4, this.f62683a, this.f62685d, this.f62684c, this.f62686e), path2);
        return path2;
    }

    /* renamed from: a */
    private final void m92001a(Path path, float f, float f2, float f3, int i) {
        path.arcTo(f - f3, f2 - f3, f + f3, f2 + f3, ((float) i) * 90.0f, 90.0f, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LKUIRoundLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    private final String m92000a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return "l:" + ((int) f) + " ,t:" + ((int) f2) + " ,r:" + ((int) f3) + " ,b:" + ((int) f4) + " ,lt:" + ((int) f5) + ", lb = " + ((int) f6) + ", rt = " + ((int) f7) + " , rb = " + ((int) f8);
    }
}
