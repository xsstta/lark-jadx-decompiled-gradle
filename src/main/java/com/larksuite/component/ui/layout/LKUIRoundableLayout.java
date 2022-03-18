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
import android.widget.FrameLayout;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b'\b\u0016\u0018\u0000 V2\u00020\u0001:\u0001VB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\"\u001a\u00020#H\u0002JH\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0002J\u0010\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u000200H\u0014J(\u00101\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0012H\u0002J\b\u00102\u001a\u00020\u0017H\u0002J\u0006\u00103\u001a\u00020\u0012J\u0006\u00104\u001a\u00020\u0012J\u0006\u00105\u001a\u00020\u0012J\u0006\u00106\u001a\u00020\u0012J\u0006\u00107\u001a\u00020\u0012J\b\u00108\u001a\u00020\u0019H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J(\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0007H\u0014J\u0010\u0010>\u001a\u00020#2\b\b\u0001\u0010?\u001a\u00020\u0007J\u000e\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020\u0007J\u000e\u0010B\u001a\u00020#2\u0006\u0010C\u001a\u00020\u0012J\u000e\u0010D\u001a\u00020#2\u0006\u0010E\u001a\u00020\u0012J\b\u0010F\u001a\u00020#H\u0002J\u000e\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020\u0007J(\u0010G\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0016J\u000e\u0010I\u001a\u00020#2\u0006\u0010J\u001a\u00020\u0012J&\u0010I\u001a\u00020#2\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012J&\u0010K\u001a\u00020#2\u0006\u0010L\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u00122\u0006\u0010N\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u0012J\u000e\u0010K\u001a\u00020#2\u0006\u0010P\u001a\u00020\u0007J,\u0010Q\u001a\u00020#*\u00020\u00172\u0006\u0010R\u001a\u00020\u00122\u0006\u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u0007H\u0002R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0014\u0010\fR\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Lcom/larksuite/component/ui/layout/LKUIRoundableLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "boardPaint", "Landroid/graphics/Paint;", "getBoardPaint", "()Landroid/graphics/Paint;", "boardPaint$delegate", "Lkotlin/Lazy;", "boarderColor", "borderMode", "borderWidth", "", "clearPaint", "getClearPaint", "clearPaint$delegate", "clearPath", "Landroid/graphics/Path;", "isVeryLargeThanScreen", "", "originPaddingBottom", "originPaddingLeft", "originPaddingRight", "originPaddingTop", "radiusLeftBottom", "radiusLeftTop", "radiusRightBottom", "radiusRightTop", "amendPadding", "", "createPathKey", "", "left", "top", "right", "bottom", "leftTopRadiusInDp", "leftBottomRadiusInDp", "rightTopRadiusInDp", "rightBottomRadiusInDp", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "getBorderPath", "getClearCanvasPath", "getLeftBottomRadius", "getLeftTopRadius", "getRadius", "getRightBottomRadius", "getRightTopRadius", "hasBorder", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "setBorderColor", "color", "setBorderMode", "mode", "setBorderWidth", "widthInDp", "setBorderWidthInPx", "widthInPx", "setClipOutline", "setPadding", "padding", "setRadius", "radiusInDp", "setRadiusInPx", "leftTopRadius", "leftBottomRadius", "rightTopRadius", "rightBottomRadius", "radiusInPx", "arcTo", "x", "y", "radius", "rotations", "Companion", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public class LKUIRoundableLayout extends FrameLayout {

    /* renamed from: b */
    public static final Companion f62699b = new Companion(null);

    /* renamed from: q */
    private static final LKUIRoundableLayout$Companion$sPathCache$1 f62700q = new LKUIRoundableLayout$Companion$sPathCache$1();

    /* renamed from: a */
    public float f62701a;

    /* renamed from: c */
    private float f62702c;

    /* renamed from: d */
    private float f62703d;

    /* renamed from: e */
    private float f62704e;

    /* renamed from: f */
    private int f62705f;

    /* renamed from: g */
    private int f62706g;

    /* renamed from: h */
    private int f62707h;

    /* renamed from: i */
    private int f62708i;

    /* renamed from: j */
    private float f62709j;

    /* renamed from: k */
    private int f62710k;

    /* renamed from: l */
    private final Lazy f62711l;

    /* renamed from: m */
    private final Lazy f62712m;

    /* renamed from: n */
    private Path f62713n;

    /* renamed from: o */
    private int f62714o;

    /* renamed from: p */
    private boolean f62715p;

    public LKUIRoundableLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public LKUIRoundableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Paint getBoardPaint() {
        return (Paint) this.f62711l.getValue();
    }

    private final Paint getClearPaint() {
        return (Paint) this.f62712m.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u00020\u00078\u0002X\u0004¢\u0006\n\n\u0002\u0010\t\u0012\u0004\b\b\u0010\u0002¨\u0006\n"}, d2 = {"Lcom/larksuite/component/ui/layout/LKUIRoundableLayout$Companion;", "", "()V", "MODE_INSET", "", "MODE_OVERLAY", "sPathCache", "com/larksuite/component/ui/layout/LKUIRoundableLayout$Companion$sPathCache$1", "sPathCache$annotations", "Lcom/larksuite/component/ui/layout/LKUIRoundableLayout$Companion$sPathCache$1;", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.LKUIRoundableLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final float getLeftBottomRadius() {
        return this.f62703d;
    }

    public final float getLeftTopRadius() {
        return this.f62701a;
    }

    public final float getRadius() {
        return this.f62701a;
    }

    public final float getRightBottomRadius() {
        return this.f62704e;
    }

    public final float getRightTopRadius() {
        return this.f62702c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.LKUIRoundableLayout$b */
    static final class C25670b extends Lambda implements Function0<Paint> {
        public static final C25670b INSTANCE = new C25670b();

        C25670b() {
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
    private final boolean mo157511a() {
        if (this.f62709j <= ((float) 0) || this.f62710k == 0) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.LKUIRoundableLayout$c */
    static final class C25671c extends Lambda implements Function0<Paint> {
        public static final C25671c INSTANCE = new C25671c();

        C25671c() {
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
    private final void mo157501d() {
        int i;
        if (this.f62714o == 1) {
            i = (int) this.f62709j;
        } else {
            i = 0;
        }
        super.setPadding(this.f62705f + i, this.f62706g + i, this.f62707h + i, this.f62708i + i);
    }

    /* renamed from: b */
    private final boolean mo186210b() {
        C25654c a = C25655d.m91902a(getContext());
        int width = getWidth();
        Intrinsics.checkExpressionValueIsNotNull(a, "screeSize");
        if (width > a.mo89313a() * 2 || getHeight() > a.mo89314b() * 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m92014c() {
        float f = this.f62701a;
        if (f == this.f62702c && f == this.f62703d && f == this.f62704e) {
            setOutlineProvider(new C25672d(this));
            setClipToOutline(true);
        } else {
            setClipToOutline(false);
            setOutlineProvider(null);
        }
        invalidate();
    }

    private final Path getClearCanvasPath() {
        this.f62713n.reset();
        this.f62713n.set(m92013c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight()));
        this.f62713n.toggleInverseFillType();
        return this.f62713n;
    }

    public final void setPadding(int i) {
        setPadding(i, i, i, i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/larksuite/component/ui/layout/LKUIRoundableLayout$setClipOutline$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.LKUIRoundableLayout$d */
    public static final class C25672d extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ LKUIRoundableLayout f62716a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25672d(LKUIRoundableLayout lKUIRoundableLayout) {
            this.f62716a = lKUIRoundableLayout;
        }

        public void getOutline(View view, Outline outline) {
            if (outline != null) {
                outline.setRoundRect(0, 0, this.f62716a.getWidth(), this.f62716a.getHeight(), this.f62716a.f62701a);
            }
        }
    }

    public final void setBorderColor(int i) {
        this.f62710k = i;
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
        this.f62701a = f;
        this.f62703d = f;
        this.f62702c = f;
        this.f62704e = f;
        m92014c();
    }

    public final void setBorderMode(int i) {
        boolean z;
        if (this.f62714o != i) {
            z = true;
        } else {
            z = false;
        }
        this.f62714o = i;
        mo157501d();
        if (z) {
            m92014c();
        }
    }

    public final void setBorderWidthInPx(float f) {
        boolean z;
        if (this.f62709j != f) {
            z = true;
        } else {
            z = false;
        }
        this.f62709j = f;
        mo157501d();
        if (z) {
            m92014c();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (!getClipToOutline() && this.f62715p) {
            canvas.clipPath(m92013c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight()));
        }
        try {
            super.dispatchDraw(canvas);
            if (mo157511a()) {
                getBoardPaint().setColor(this.f62710k);
                getBoardPaint().setStrokeWidth(this.f62709j * ((float) 2));
                canvas.drawPath(m92013c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight()), getBoardPaint());
            }
            if (getClipToOutline() || this.f62715p) {
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
    public LKUIRoundableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f62711l = LazyKt.lazy(C25670b.INSTANCE);
        this.f62712m = LazyKt.lazy(C25671c.INSTANCE);
        this.f62713n = new Path();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.rl_border_color, R.attr.rl_border_mode, R.attr.rl_border_width, R.attr.rl_radius, R.attr.rl_radius_left_bottom, R.attr.rl_radius_left_top, R.attr.rl_radius_right_bottom, R.attr.rl_radius_right_top}, 0, 0);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…KUIRoundableLayout, 0, 0)");
        float dimension = obtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED);
        this.f62701a = obtainStyledAttributes.getDimension(5, dimension);
        this.f62703d = obtainStyledAttributes.getDimension(4, dimension);
        this.f62702c = obtainStyledAttributes.getDimension(7, dimension);
        this.f62704e = obtainStyledAttributes.getDimension(6, dimension);
        this.f62709j = obtainStyledAttributes.getDimension(2, BitmapDescriptorFactory.HUE_RED);
        this.f62710k = obtainStyledAttributes.getColor(0, ContextCompat.getColor(context, R.color.ud_N200));
        this.f62714o = obtainStyledAttributes.getInt(1, 0);
        obtainStyledAttributes.recycle();
        this.f62705f = getPaddingLeft();
        this.f62706g = getPaddingTop();
        this.f62707h = getPaddingRight();
        this.f62708i = getPaddingBottom();
        if (this.f62709j > ((float) 0) && this.f62714o == 1) {
            mo157501d();
        }
    }

    /* renamed from: b */
    public final void mo89663b(float f, float f2, float f3, float f4) {
        this.f62701a = f;
        this.f62703d = f2;
        this.f62702c = f3;
        this.f62704e = f4;
        m92014c();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f62715p = mo186210b();
        m92014c();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f62705f = i;
        this.f62706g = i2;
        this.f62707h = i3;
        this.f62708i = i4;
        mo157501d();
    }

    /* renamed from: a */
    public final void mo89662a(float f, float f2, float f3, float f4) {
        mo89663b(C25653b.m91892a(getContext(), f), C25653b.m91892a(getContext(), f2), C25653b.m91892a(getContext(), f3), C25653b.m91892a(getContext(), f4));
    }

    /* renamed from: c */
    private final Path m92013c(float f, float f2, float f3, float f4) {
        LKUIRoundableLayout$Companion$sPathCache$1 lKUIRoundableLayout$Companion$sPathCache$1 = f62700q;
        Path path = (Path) lKUIRoundableLayout$Companion$sPathCache$1.get((Object) m92009a(f, f2, f3, f4, this.f62701a, this.f62703d, this.f62702c, this.f62704e));
        if (path != null) {
            return path;
        }
        Path path2 = new Path();
        path2.reset();
        path2.moveTo(this.f62701a + f, f2);
        path2.lineTo(f3 - this.f62702c, f2);
        float f5 = this.f62702c;
        m92010a(path2, f3 - f5, f2 + f5, f5, -1);
        path2.lineTo(f3, f4 - this.f62704e);
        float f6 = this.f62704e;
        m92010a(path2, f3 - f6, f4 - f6, f6, 0);
        path2.lineTo(this.f62703d + f, f4);
        float f7 = this.f62703d;
        m92010a(path2, f + f7, f4 - f7, f7, 1);
        path2.lineTo(f, this.f62701a + f2);
        float f8 = this.f62701a;
        m92010a(path2, f + f8, f2 + f8, f8, 2);
        path2.lineTo(this.f62701a + f, f2);
        path2.close();
        lKUIRoundableLayout$Companion$sPathCache$1.put(m92009a(f, f2, f3, f4, this.f62701a, this.f62703d, this.f62702c, this.f62704e), path2);
        return path2;
    }

    /* renamed from: a */
    private final void m92010a(Path path, float f, float f2, float f3, int i) {
        path.arcTo(f - f3, f2 - f3, f + f3, f2 + f3, ((float) i) * 90.0f, 90.0f, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LKUIRoundableLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    private final String m92009a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return "l:" + ((int) f) + " ,t:" + ((int) f2) + " ,r:" + ((int) f3) + " ,b:" + ((int) f4) + " ,lt:" + ((int) f5) + ", lb = " + ((int) f6) + ", rt = " + ((int) f7) + " , rb = " + ((int) f8);
    }
}
