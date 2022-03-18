package com.larksuite.component.ui.layout.plus;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.core.content.ContextCompat;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.layout.ILKUILayout;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u0000 X2\u00020\u0001:\u0001XB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0002JH\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000fH\u0002J(\u0010+\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0002J\b\u0010,\u001a\u00020\u0014H\u0002J\u0006\u0010-\u001a\u00020\u000fJ\u0006\u0010.\u001a\u00020\u000fJ\b\u0010/\u001a\u000200H\u0016J\u0006\u00101\u001a\u00020\u000fJ\u0006\u00102\u001a\u00020\u000fJ\u0006\u00103\u001a\u00020\u000fJ\b\u00104\u001a\u00020\u0016H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u00105\u001a\u00020 2\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020:H\u0016J(\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020\f2\u0006\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020\fH\u0016J\u0010\u0010@\u001a\u00020 2\b\b\u0001\u0010A\u001a\u00020\fJ\u000e\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020\fJ\u000e\u0010D\u001a\u00020 2\u0006\u0010E\u001a\u00020\u000fJ\u000e\u0010F\u001a\u00020 2\u0006\u0010G\u001a\u00020\u000fJ\b\u0010H\u001a\u00020 H\u0002J\u000e\u0010I\u001a\u00020 2\u0006\u0010J\u001a\u00020\fJ\u000e\u0010K\u001a\u00020 2\u0006\u0010L\u001a\u00020\u000fJ&\u0010K\u001a\u00020 2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000fJ&\u0010M\u001a\u00020 2\u0006\u0010N\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fJ\u000e\u0010M\u001a\u00020 2\u0006\u0010R\u001a\u00020\fJ,\u0010S\u001a\u00020 *\u00020\u00142\u0006\u0010T\u001a\u00020\u000f2\u0006\u0010U\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020\fH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\bR\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lcom/larksuite/component/ui/layout/plus/RoundShapeLKUIPlus;", "Lcom/larksuite/component/ui/layout/plus/BaseInnerPlus;", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "(Lcom/larksuite/component/ui/layout/ILKUILayout;)V", "boardPaint", "Landroid/graphics/Paint;", "getBoardPaint", "()Landroid/graphics/Paint;", "boardPaint$delegate", "Lkotlin/Lazy;", "boarderColor", "", "borderMode", "borderWidth", "", "clearPaint", "getClearPaint", "clearPaint$delegate", "clearPath", "Landroid/graphics/Path;", "isVeryLargeThanScreen", "", "originPaddingBottom", "originPaddingLeft", "originPaddingRight", "originPaddingTop", "radiusLeftBottom", "radiusLeftTop", "radiusRightBottom", "radiusRightTop", "amendPadding", "", "createPathKey", "", "left", "top", "right", "bottom", "leftTopRadiusInDp", "leftBottomRadiusInDp", "rightTopRadiusInDp", "rightBottomRadiusInDp", "getBorderPath", "getClearCanvasPath", "getLeftBottomRadius", "getLeftTopRadius", "getPlusType", "Lcom/larksuite/component/ui/layout/plus/InnerPlusType;", "getRadius", "getRightBottomRadius", "getRightTopRadius", "hasBorder", "onDelegateDispatchDrawEnd", "canvas", "Landroid/graphics/Canvas;", "onDelegateSetPaddingStart", "paddingData", "Landroid/graphics/Rect;", "onDelegateSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "setBorderColor", "color", "setBorderMode", "mode", "setBorderWidth", "widthInDp", "setBorderWidthInPx", "widthInPx", "setClipOutline", "setPadding", "padding", "setRadius", "radiusInDp", "setRadiusInPx", "leftTopRadius", "leftBottomRadius", "rightTopRadius", "rightBottomRadius", "radiusInPx", "arcTo", "x", "y", "radius", "rotations", "Companion", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RoundShapeLKUIPlus extends BaseInnerPlus {
    public static final Companion Companion = new Companion(null);
    private static final RoundShapeLKUIPlus$Companion$sPathCache$1 sPathCache = new RoundShapeLKUIPlus$Companion$sPathCache$1();
    private final Lazy boardPaint$delegate = LazyKt.lazy(C25673b.INSTANCE);
    private int boarderColor;
    private int borderMode;
    private float borderWidth;
    private final Lazy clearPaint$delegate = LazyKt.lazy(C25674c.INSTANCE);
    private Path clearPath = new Path();
    private boolean isVeryLargeThanScreen;
    private int originPaddingBottom;
    private int originPaddingLeft;
    private int originPaddingRight;
    private int originPaddingTop;
    private float radiusLeftBottom;
    public float radiusLeftTop;
    private float radiusRightBottom;
    private float radiusRightTop;

    private final Paint getBoardPaint() {
        return (Paint) this.boardPaint$delegate.getValue();
    }

    private final Paint getClearPaint() {
        return (Paint) this.clearPaint$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u00020\u00078\u0002X\u0004¢\u0006\n\n\u0002\u0010\t\u0012\u0004\b\b\u0010\u0002¨\u0006\n"}, d2 = {"Lcom/larksuite/component/ui/layout/plus/RoundShapeLKUIPlus$Companion;", "", "()V", "MODE_INSET", "", "MODE_OVERLAY", "sPathCache", "com/larksuite/component/ui/layout/plus/RoundShapeLKUIPlus$Companion$sPathCache$1", "sPathCache$annotations", "Lcom/larksuite/component/ui/layout/plus/RoundShapeLKUIPlus$Companion$sPathCache$1;", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.plus.RoundShapeLKUIPlus$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final float getLeftBottomRadius() {
        return this.radiusLeftBottom;
    }

    public final float getLeftTopRadius() {
        return this.radiusLeftTop;
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseInnerPlus
    public InnerPlusType getPlusType() {
        return InnerPlusType.ROUND_SHAPE;
    }

    public final float getRadius() {
        return this.radiusLeftTop;
    }

    public final float getRightBottomRadius() {
        return this.radiusRightBottom;
    }

    public final float getRightTopRadius() {
        return this.radiusRightTop;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.plus.RoundShapeLKUIPlus$b */
    static final class C25673b extends Lambda implements Function0<Paint> {
        public static final C25673b INSTANCE = new C25673b();

        C25673b() {
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

    private final boolean hasBorder() {
        if (this.borderWidth <= ((float) 0) || this.boarderColor == 0) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.plus.RoundShapeLKUIPlus$c */
    static final class C25674c extends Lambda implements Function0<Paint> {
        public static final C25674c INSTANCE = new C25674c();

        C25674c() {
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

    private final void amendPadding() {
        int i;
        if (this.borderMode == 1) {
            i = (int) this.borderWidth;
        } else {
            i = 0;
        }
        getLayout().setPadding(this.originPaddingLeft + i, this.originPaddingTop + i, this.originPaddingRight + i, this.originPaddingBottom + i);
    }

    private final Path getClearCanvasPath() {
        this.clearPath.reset();
        this.clearPath.set(getBorderPath(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getLayout().getWidth(), (float) getLayout().getHeight()));
        this.clearPath.toggleInverseFillType();
        return this.clearPath;
    }

    private final boolean isVeryLargeThanScreen() {
        C25654c a = C25655d.m91902a(getContext());
        int width = getLayout().getWidth();
        Intrinsics.checkExpressionValueIsNotNull(a, "screeSize");
        if (width > a.mo89313a() * 2 || getLayout().getHeight() > a.mo89314b() * 2) {
            return true;
        }
        return false;
    }

    private final void setClipOutline() {
        float f = this.radiusLeftTop;
        if (f == this.radiusRightTop && f == this.radiusLeftBottom && f == this.radiusRightBottom) {
            getLayout().setOutlineProvider(new C25675d(this));
            getLayout().setClipToOutline(true);
        } else {
            getLayout().setClipToOutline(false);
            getLayout().setOutlineProvider(null);
        }
        getLayout().invalidate();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/larksuite/component/ui/layout/plus/RoundShapeLKUIPlus$setClipOutline$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.plus.RoundShapeLKUIPlus$d */
    public static final class C25675d extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ RoundShapeLKUIPlus f62726a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25675d(RoundShapeLKUIPlus roundShapeLKUIPlus) {
            this.f62726a = roundShapeLKUIPlus;
        }

        public void getOutline(View view, Outline outline) {
            if (outline != null) {
                outline.setRoundRect(0, 0, this.f62726a.getLayout().getWidth(), this.f62726a.getLayout().getHeight(), this.f62726a.radiusLeftTop);
            }
        }
    }

    public final void setPadding(int i) {
        getLayout().setPadding(i, i, i, i);
    }

    public final void setBorderColor(int i) {
        this.boarderColor = i;
        getLayout().invalidate();
    }

    public final void setBorderWidth(float f) {
        setBorderWidthInPx(C25653b.m91892a(getContext(), f));
    }

    public final void setRadius(float f) {
        setRadiusInPx((int) C25653b.m91892a(getContext(), f));
    }

    public final void setBorderMode(int i) {
        boolean z;
        if (this.borderMode != i) {
            z = true;
        } else {
            z = false;
        }
        this.borderMode = i;
        amendPadding();
        if (z) {
            setClipOutline();
        }
    }

    public final void setBorderWidthInPx(float f) {
        boolean z;
        if (this.borderWidth != f) {
            z = true;
        } else {
            z = false;
        }
        this.borderWidth = f;
        amendPadding();
        if (z) {
            setClipOutline();
        }
    }

    public final void setRadiusInPx(int i) {
        float f = (float) i;
        this.radiusLeftTop = f;
        this.radiusLeftBottom = f;
        this.radiusRightTop = f;
        this.radiusRightBottom = f;
        setClipOutline();
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseLKUIPlus
    public void onDelegateSetPaddingStart(Rect rect) {
        int i;
        Intrinsics.checkParameterIsNotNull(rect, "paddingData");
        this.originPaddingLeft = rect.left;
        this.originPaddingTop = rect.top;
        this.originPaddingRight = rect.right;
        this.originPaddingBottom = rect.bottom;
        if (this.borderMode == 1) {
            i = (int) this.borderWidth;
        } else {
            i = 0;
        }
        rect.left = this.originPaddingLeft + i;
        rect.top = this.originPaddingTop + i;
        rect.right = this.originPaddingRight + i;
        rect.bottom = this.originPaddingBottom + i;
        super.onDelegateSetPaddingStart(rect);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundShapeLKUIPlus(ILKUILayout iLKUILayout) {
        super(iLKUILayout);
        Intrinsics.checkParameterIsNotNull(iLKUILayout, "layout");
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(getAttrs(), new int[]{R.attr.rl_border_color, R.attr.rl_border_mode, R.attr.rl_border_width, R.attr.rl_radius, R.attr.rl_radius_left_bottom, R.attr.rl_radius_left_top, R.attr.rl_radius_right_bottom, R.attr.rl_radius_right_top}, 0, 0);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "getContext().obtainStyle…Layout,\n            0, 0)");
        float dimension = obtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED);
        this.radiusLeftTop = obtainStyledAttributes.getDimension(5, dimension);
        this.radiusLeftBottom = obtainStyledAttributes.getDimension(4, dimension);
        this.radiusRightTop = obtainStyledAttributes.getDimension(7, dimension);
        this.radiusRightBottom = obtainStyledAttributes.getDimension(6, dimension);
        this.borderWidth = obtainStyledAttributes.getDimension(2, BitmapDescriptorFactory.HUE_RED);
        this.boarderColor = obtainStyledAttributes.getColor(0, ContextCompat.getColor(getContext(), R.color.lkui_N200));
        this.borderMode = obtainStyledAttributes.getInt(1, 0);
        obtainStyledAttributes.recycle();
        this.originPaddingLeft = getLayout().getPaddingLeft();
        this.originPaddingTop = getLayout().getPaddingTop();
        this.originPaddingRight = getLayout().getPaddingRight();
        this.originPaddingBottom = getLayout().getPaddingBottom();
        if (this.borderWidth > ((float) 0) && this.borderMode == 1) {
            amendPadding();
        }
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseLKUIPlus
    public void onDelegateDispatchDrawEnd(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (!getLayout().getClipToOutline() && this.isVeryLargeThanScreen) {
            canvas.clipPath(getBorderPath(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getLayout().getWidth(), (float) getLayout().getHeight()));
        }
        try {
            if (hasBorder()) {
                getBoardPaint().setColor(this.boarderColor);
                getBoardPaint().setStrokeWidth(this.borderWidth * ((float) 2));
                canvas.drawPath(getBorderPath(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getLayout().getWidth(), (float) getLayout().getHeight()), getBoardPaint());
            }
            if (getLayout().getClipToOutline() || this.isVeryLargeThanScreen) {
                getLayout().setLayerType(0, null);
                return;
            }
            getLayout().setLayerType(2, null);
            canvas.drawPath(getClearCanvasPath(), getClearPaint());
        } catch (RuntimeException e) {
            String message = e.getMessage();
            if (message != null && !StringsKt.contains$default((CharSequence) message, (CharSequence) "recycled bitmap", false, 2, (Object) null)) {
                throw e;
            }
        }
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseLKUIPlus
    public void onDelegateSizeChanged(int i, int i2, int i3, int i4) {
        super.onDelegateSizeChanged(i, i2, i3, i4);
        this.isVeryLargeThanScreen = isVeryLargeThanScreen();
        setClipOutline();
    }

    public final void setRadiusInPx(float f, float f2, float f3, float f4) {
        this.radiusLeftTop = f;
        this.radiusLeftBottom = f2;
        this.radiusRightTop = f3;
        this.radiusRightBottom = f4;
        setClipOutline();
    }

    public final void setRadius(float f, float f2, float f3, float f4) {
        setRadiusInPx(C25653b.m91892a(getContext(), f), C25653b.m91892a(getContext(), f2), C25653b.m91892a(getContext(), f3), C25653b.m91892a(getContext(), f4));
    }

    private final Path getBorderPath(float f, float f2, float f3, float f4) {
        RoundShapeLKUIPlus$Companion$sPathCache$1 roundShapeLKUIPlus$Companion$sPathCache$1 = sPathCache;
        Path path = (Path) roundShapeLKUIPlus$Companion$sPathCache$1.get((Object) createPathKey(f, f2, f3, f4, this.radiusLeftTop, this.radiusLeftBottom, this.radiusRightTop, this.radiusRightBottom));
        if (path != null) {
            return path;
        }
        Path path2 = new Path();
        path2.reset();
        path2.moveTo(this.radiusLeftTop + f, f2);
        path2.lineTo(f3 - this.radiusRightTop, f2);
        float f5 = this.radiusRightTop;
        arcTo(path2, f3 - f5, f2 + f5, f5, -1);
        path2.lineTo(f3, f4 - this.radiusRightBottom);
        float f6 = this.radiusRightBottom;
        arcTo(path2, f3 - f6, f4 - f6, f6, 0);
        path2.lineTo(this.radiusLeftBottom + f, f4);
        float f7 = this.radiusLeftBottom;
        arcTo(path2, f + f7, f4 - f7, f7, 1);
        path2.lineTo(f, this.radiusLeftTop + f2);
        float f8 = this.radiusLeftTop;
        arcTo(path2, f + f8, f2 + f8, f8, 2);
        path2.lineTo(this.radiusLeftTop + f, f2);
        path2.close();
        roundShapeLKUIPlus$Companion$sPathCache$1.put(createPathKey(f, f2, f3, f4, this.radiusLeftTop, this.radiusLeftBottom, this.radiusRightTop, this.radiusRightBottom), path2);
        return path2;
    }

    private final void arcTo(Path path, float f, float f2, float f3, int i) {
        path.arcTo(f - f3, f2 - f3, f + f3, f2 + f3, ((float) i) * 90.0f, 90.0f, false);
    }

    private final String createPathKey(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return "l:" + ((int) f) + " ,t:" + ((int) f2) + " ,r:" + ((int) f3) + " ,b:" + ((int) f4) + " ,lt:" + ((int) f5) + ", lb = " + ((int) f6) + ", rt = " + ((int) f7) + " , rb = " + ((int) f8);
    }
}
