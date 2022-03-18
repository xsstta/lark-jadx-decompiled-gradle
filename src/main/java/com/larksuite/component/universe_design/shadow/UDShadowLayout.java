package com.larksuite.component.universe_design.shadow;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001:\u0004PQRSB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0012\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u001c\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u001a\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u00020\tH\u0016J$\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\"\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0016J\"\u0010;\u001a\u0002032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010<\u001a\u0002032\b\b\u0001\u0010=\u001a\u00020\tJ\u001a\u0010>\u001a\u0002032\b\u0010?\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u00020\tH\u0002J\b\u0010@\u001a\u00020AH\u0014J\u0012\u0010B\u001a\u00020C2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u000207H\u0014J0\u0010E\u001a\u0002032\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\t2\u0006\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\t2\u0006\u0010K\u001a\u00020\tH\u0014J\u0018\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\tH\u0014J\b\u0010O\u001a\u000203H\u0002R&\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0013@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR$\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R$\u0010(\u001a\u00020'2\u0006\u0010\r\u001a\u00020'@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001f\u0010-\u001a\u00060.R\u00020\u00008BX\u0002¢\u0006\f\n\u0004\b1\u0010\u001e\u001a\u0004\b/\u00100¨\u0006T"}, d2 = {"Lcom/larksuite/component/universe_design/shadow/UDShadowLayout;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "shadowColor", "getShadowColor", "()I", "setShadowColor", "(I)V", "Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$Direction;", "shadowDirection", "getShadowDirection", "()Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$Direction;", "setShadowDirection", "(Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$Direction;)V", "shadowPaint", "Landroid/graphics/Paint;", "getShadowPaint", "()Landroid/graphics/Paint;", "shadowPaint$delegate", "Lkotlin/Lazy;", "Lcom/larksuite/component/universe_design/dimension/UDDimension;", "shadowRadius", "getShadowRadius", "()Lcom/larksuite/component/universe_design/dimension/UDDimension;", "setShadowRadius", "(Lcom/larksuite/component/universe_design/dimension/UDDimension;)V", "shadowRect", "Landroid/graphics/RectF;", "Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$Size;", "shadowSize", "getShadowSize", "()Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$Size;", "setShadowSize", "(Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$Size;)V", "shadowView", "Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$UDShadowView;", "getShadowView", "()Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$UDShadowView;", "shadowView$delegate", "addView", "", "child", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "index", "width", "height", "applyAttrs", "applyStyle", "styleId", "checkChildrenCountBeforeAddView", "view", "generateDefaultLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "generateLayoutParams", "Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$LayoutParams;", "lp", "onLayout", "changed", "", "l", "t", "r", C63954b.f161494a, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setUpPaint", "Direction", "LayoutParams", "Size", "UDShadowView", "universe-ui-shadow_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDShadowLayout extends ViewGroup {

    /* renamed from: a */
    public final RectF f63568a;

    /* renamed from: b */
    private Size f63569b;

    /* renamed from: c */
    private Direction f63570c;

    /* renamed from: d */
    private int f63571d;

    /* renamed from: e */
    private UDDimension f63572e;

    /* renamed from: f */
    private final Lazy f63573f;

    /* renamed from: g */
    private final Lazy f63574g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 *2\u00020\u0001:\u0001*B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0002\u0010\fB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\bH\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\bH\u0016J(\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006+"}, d2 = {"Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$LayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", C60375c.f150914a, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "width", "", "height", "(II)V", ShareHitPoint.f121868c, "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)V", "hasBottomMarginSet", "", "getHasBottomMarginSet$universe_ui_shadow_release", "()Z", "setHasBottomMarginSet$universe_ui_shadow_release", "(Z)V", "hasLeftMarginSet", "getHasLeftMarginSet$universe_ui_shadow_release", "setHasLeftMarginSet$universe_ui_shadow_release", "hasRightMarginSet", "getHasRightMarginSet$universe_ui_shadow_release", "setHasRightMarginSet$universe_ui_shadow_release", "hasTopMarginSet", "getHasTopMarginSet$universe_ui_shadow_release", "setHasTopMarginSet$universe_ui_shadow_release", "applyAttrs", "", "context", "setMarginEnd", "end", "setMarginStart", "start", "setMargins", "left", "top", "right", "bottom", "Companion", "universe-ui-shadow_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public static final Companion f63577a = new Companion(null);

        /* renamed from: b */
        private boolean f63578b;

        /* renamed from: c */
        private boolean f63579c;

        /* renamed from: d */
        private boolean f63580d;

        /* renamed from: e */
        private boolean f63581e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$LayoutParams$Companion;", "", "()V", "DEFAULT_MARGIN", "", "universe-ui-shadow_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.universe_design.shadow.UDShadowLayout$LayoutParams$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public final boolean mo91221a() {
            return this.f63578b;
        }

        /* renamed from: b */
        public final boolean mo91222b() {
            return this.f63579c;
        }

        /* renamed from: c */
        public final boolean mo91223c() {
            return this.f63580d;
        }

        /* renamed from: d */
        public final boolean mo91224d() {
            return this.f63581e;
        }

        public void setMarginEnd(int i) {
            super.setMarginEnd(i);
            if (getLayoutDirection() == 0) {
                this.f63580d = true;
            } else {
                this.f63578b = true;
            }
        }

        public void setMarginStart(int i) {
            super.setMarginStart(i);
            if (getLayoutDirection() == 0) {
                this.f63578b = true;
            } else {
                this.f63580d = true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            Intrinsics.checkParameterIsNotNull(layoutParams, ShareHitPoint.f121868c);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Intrinsics.checkParameterIsNotNull(context, C60375c.f150914a);
            m92979a(context, attributeSet);
        }

        /* renamed from: a */
        private final void m92979a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842998, 16842999, 16843000, 16843001, 16843002, 16843701, 16843702, 16844091, 16844092});
            if (obtainStyledAttributes.getDimensionPixelSize(0, -1) >= 0) {
                this.f63579c = true;
                this.f63578b = true;
                this.f63580d = true;
                this.f63581e = true;
            } else {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, -1);
                int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(8, -1);
                if (dimensionPixelSize >= 0) {
                    this.f63578b = true;
                    this.f63580d = true;
                } else {
                    if (obtainStyledAttributes.getDimensionPixelSize(1, -1) >= 0) {
                        this.f63578b = true;
                    }
                    if (obtainStyledAttributes.getDimensionPixelSize(3, -1) >= 0) {
                        this.f63580d = true;
                    }
                }
                if (dimensionPixelSize2 >= 0) {
                    this.f63579c = true;
                    this.f63581e = true;
                } else {
                    if (obtainStyledAttributes.getDimensionPixelSize(2, -1) >= 0) {
                        this.f63579c = true;
                    }
                    if (obtainStyledAttributes.getDimensionPixelSize(4, -1) >= 0) {
                        this.f63581e = true;
                    }
                    int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(5, -1);
                    int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(6, -1);
                    if (getLayoutDirection() == 0) {
                        if (dimensionPixelSize3 >= 0) {
                            this.f63578b = true;
                        }
                        if (dimensionPixelSize4 >= 0) {
                            this.f63580d = true;
                        }
                    } else {
                        if (dimensionPixelSize3 >= 0) {
                            this.f63580d = true;
                        }
                        if (dimensionPixelSize4 >= 0) {
                            this.f63578b = true;
                        }
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void setMargins(int i, int i2, int i3, int i4) {
            super.setMargins(i, i2, i3, i4);
            this.f63579c = true;
            this.f63578b = true;
            this.f63580d = true;
            this.f63581e = true;
        }
    }

    private final UDShadowView getShadowView() {
        return (UDShadowView) this.f63574g.getValue();
    }

    public final Paint getShadowPaint() {
        return (Paint) this.f63573f.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$Direction;", "", "x", "", "y", "(Ljava/lang/String;III)V", "getX$universe_ui_shadow_release", "()I", "getY$universe_ui_shadow_release", "NONE", "UP", "DOWN", "LEFT", "RIGHT", "universe-ui-shadow_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Direction {
        NONE(0, 0),
        UP(0, -1),
        DOWN(0, 1),
        LEFT(-1, 0),
        RIGHT(1, 0);
        

        /* renamed from: x */
        private final int f63575x;

        /* renamed from: y */
        private final int f63576y;

        public final int getX$universe_ui_shadow_release() {
            return this.f63575x;
        }

        public final int getY$universe_ui_shadow_release() {
            return this.f63576y;
        }

        private Direction(int i, int i2) {
            this.f63575x = i;
            this.f63576y = i2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$Size;", "", "blur", "Lcom/larksuite/component/universe_design/dimension/UDDimension;", "offset", "(Ljava/lang/String;ILcom/larksuite/component/universe_design/dimension/UDDimension;Lcom/larksuite/component/universe_design/dimension/UDDimension;)V", "getBlur$universe_ui_shadow_release", "()Lcom/larksuite/component/universe_design/dimension/UDDimension;", "getOffset$universe_ui_shadow_release", "NONE", "S1", "S2", "S3", "S4", "S5", "S", "M", "L", "universe-ui-shadow_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Size {
        NONE(new UDDimension.Dp(0), new UDDimension.Dp(0)),
        S1(new UDDimension.Dp(4), new UDDimension.Dp(2)),
        S2(new UDDimension.Dp(6), new UDDimension.Dp(2)),
        S3(new UDDimension.Dp(8), new UDDimension.Dp(4)),
        S4(new UDDimension.Dp(16), new UDDimension.Dp(6)),
        S5(new UDDimension.Dp(36), new UDDimension.Dp(8)),
        S(new UDDimension.Dp(6), new UDDimension.Dp(2)),
        M(new UDDimension.Dp(8), new UDDimension.Dp(4)),
        L(new UDDimension.Dp(16), new UDDimension.Dp(6));
        
        private final UDDimension blur;
        private final UDDimension offset;

        public final UDDimension getBlur$universe_ui_shadow_release() {
            return this.blur;
        }

        public final UDDimension getOffset$universe_ui_shadow_release() {
            return this.offset;
        }

        private Size(UDDimension aVar, UDDimension aVar2) {
            this.blur = aVar;
            this.offset = aVar2;
        }
    }

    public final int getShadowColor() {
        return this.f63571d;
    }

    public final Direction getShadowDirection() {
        return this.f63570c;
    }

    public final UDDimension getShadowRadius() {
        return this.f63572e;
    }

    public final Size getShadowSize() {
        return this.f63569b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.shadow.UDShadowLayout$b */
    static final class C25772b extends Lambda implements Function0<Paint> {
        public static final C25772b INSTANCE = new C25772b();

        C25772b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(0);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$UDShadowView;", "Lcom/larksuite/component/universe_design/shadow/UDShadowLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.shadow.UDShadowLayout$c */
    static final class C25773c extends Lambda implements Function0<UDShadowView> {
        final /* synthetic */ UDShadowLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25773c(UDShadowLayout uDShadowLayout) {
            super(0);
            this.this$0 = uDShadowLayout;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UDShadowView invoke() {
            UDShadowLayout uDShadowLayout = this.this$0;
            Context context = uDShadowLayout.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            return new UDShadowView(uDShadowLayout, context);
        }
    }

    /* renamed from: b */
    private final void m92974b() {
        UDDimension blur$universe_ui_shadow_release = this.f63569b.getBlur$universe_ui_shadow_release();
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        float a = blur$universe_ui_shadow_release.mo90193a(context);
        UDDimension offset$universe_ui_shadow_release = this.f63569b.getOffset$universe_ui_shadow_release();
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        float a2 = offset$universe_ui_shadow_release.mo90193a(context2);
        getShadowPaint().setShadowLayer(a, ((float) this.f63570c.getX$universe_ui_shadow_release()) * a2, a2 * ((float) this.f63570c.getY$universe_ui_shadow_release()), this.f63571d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDShadowLayout(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return new LayoutParams(context, attributeSet);
    }

    public void addView(View view) {
        m92973a(view, getChildCount());
        super.addView(view);
    }

    public final void setShadowColor(int i) {
        if (i != this.f63571d) {
            this.f63571d = i;
            m92974b();
            invalidate();
        }
    }

    public final void setShadowRadius(UDDimension aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "value");
        this.f63572e = aVar;
        invalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkParameterIsNotNull(layoutParams, "lp");
        return new LayoutParams(layoutParams);
    }

    public final void setShadowDirection(Direction direction) {
        Intrinsics.checkParameterIsNotNull(direction, "value");
        if (direction != this.f63570c) {
            this.f63570c = direction;
            m92974b();
            requestLayout();
        }
    }

    public final void setShadowSize(Size size) {
        Intrinsics.checkParameterIsNotNull(size, "value");
        if (size != this.f63569b) {
            this.f63569b = size;
            m92974b();
            requestLayout();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/shadow/UDShadowLayout$UDShadowView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Lcom/larksuite/component/universe_design/shadow/UDShadowLayout;Landroid/content/Context;)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "universe-ui-shadow_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.shadow.UDShadowLayout$a */
    public final class UDShadowView extends View {

        /* renamed from: a */
        final /* synthetic */ UDShadowLayout f63585a;

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            Intrinsics.checkParameterIsNotNull(canvas, "canvas");
            if (this.f63585a.getChildAt(1) != null) {
                UDDimension shadowRadius = this.f63585a.getShadowRadius();
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                float a = shadowRadius.mo90193a(context);
                canvas.drawRoundRect(this.f63585a.f63568a, a, a, this.f63585a.getShadowPaint());
            }
            super.onDraw(canvas);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UDShadowView(UDShadowLayout uDShadowLayout, Context context) {
            super(context);
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f63585a = uDShadowLayout;
            if (Build.VERSION.SDK_INT < 28) {
                setLayerType(1, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo91199a(int i) {
        m92972a(null, 0, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        m92973a(view, i);
        super.addView(view, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDShadowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m92973a(View view, int i) {
        boolean z;
        boolean z2 = true;
        if (getChildCount() < 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0 && (i != 0 || !(view instanceof UDShadowView))) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException("Must not add view at 0 in UDShadowLayout!".toString());
            }
            return;
        }
        throw new IllegalArgumentException("UDShadowLayout can host only one direct child".toString());
    }

    @Override // android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m92973a(view, getChildCount());
        super.addView(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        super.onMeasure(i, i2);
        View childAt = getChildAt(1);
        if (childAt != null) {
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                UDDimension blur$universe_ui_shadow_release = this.f63569b.getBlur$universe_ui_shadow_release();
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                float a = blur$universe_ui_shadow_release.mo90193a(context);
                UDDimension offset$universe_ui_shadow_release = this.f63569b.getOffset$universe_ui_shadow_release();
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                float a2 = offset$universe_ui_shadow_release.mo90193a(context2);
                int i6 = 0;
                if (layoutParams2.mo91222b()) {
                    i3 = 0;
                } else {
                    i3 = Math.max(0, (int) (a - (((float) this.f63570c.getY$universe_ui_shadow_release()) * a2)));
                }
                int i7 = i3 + 0;
                if (layoutParams2.mo91224d()) {
                    i4 = 0;
                } else {
                    i4 = Math.max(0, (int) ((((float) this.f63570c.getY$universe_ui_shadow_release()) * a2) + a));
                }
                int i8 = i7 + i4;
                if (layoutParams2.mo91221a()) {
                    i5 = 0;
                } else {
                    i5 = Math.max(0, (int) (a - (((float) this.f63570c.getX$universe_ui_shadow_release()) * a2)));
                }
                int i9 = i5 + 0;
                if (!layoutParams2.mo91223c()) {
                    i6 = Math.max(0, (int) (a + (a2 * ((float) this.f63570c.getX$universe_ui_shadow_release()))));
                }
                int i10 = i9 + i6;
                measureChildWithMargins(childAt, i, i10, i2, i8);
                setMeasuredDimension(childAt.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin + getPaddingLeft() + getPaddingRight() + i10, childAt.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin + getPaddingTop() + getPaddingBottom() + i8);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.shadow.UDShadowLayout.LayoutParams");
            }
        }
        getShadowView().measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        m92973a(view, getChildCount());
        super.addView(view, i, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDShadowLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 2131887142);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m92973a(view, i);
        super.addView(view, i, layoutParams);
    }

    /* renamed from: a */
    private final void m92972a(AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_shadow_color, R.attr.ud_shadow_direction, R.attr.ud_shadow_radius, R.attr.ud_shadow_size}, i, i2);
        setShadowSize(Size.values()[obtainStyledAttributes.getInt(3, this.f63569b.ordinal())]);
        setShadowDirection(Direction.values()[obtainStyledAttributes.getInt(1, this.f63570c.ordinal())]);
        setShadowColor(obtainStyledAttributes.getColor(0, this.f63571d));
        UDDimension aVar = this.f63572e;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        setShadowRadius(new UDDimension.Px(obtainStyledAttributes.getDimensionPixelSize(2, (int) aVar.mo90193a(context))));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDShadowLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63569b = Size.NONE;
        this.f63570c = Direction.NONE;
        this.f63572e = new UDDimension.Dp(0);
        this.f63573f = LazyKt.lazy(C25772b.INSTANCE);
        this.f63568a = new RectF();
        this.f63574g = LazyKt.lazy(new C25773c(this));
        addView(getShadowView(), 0, new LayoutParams(-1, -1));
        m92974b();
        m92972a(attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        View childAt = getChildAt(0);
        Intrinsics.checkExpressionValueIsNotNull(childAt, "shadowView");
        childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        View childAt2 = getChildAt(1);
        if (childAt2 != null) {
            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            if (layoutParams != null) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                UDDimension blur$universe_ui_shadow_release = this.f63569b.getBlur$universe_ui_shadow_release();
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                float a = blur$universe_ui_shadow_release.mo90193a(context);
                UDDimension offset$universe_ui_shadow_release = this.f63569b.getOffset$universe_ui_shadow_release();
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                float a2 = offset$universe_ui_shadow_release.mo90193a(context2);
                if (layoutParams2.mo91222b()) {
                    i6 = getPaddingTop();
                    i5 = layoutParams2.topMargin;
                } else {
                    i6 = getPaddingTop();
                    i5 = Math.max(0, (int) (a - (((float) this.f63570c.getY$universe_ui_shadow_release()) * a2)));
                }
                int i8 = i6 + i5;
                if (layoutParams2.mo91221a()) {
                    i7 = getPaddingLeft() + layoutParams2.leftMargin;
                } else {
                    i7 = Math.max(0, (int) (a - (a2 * ((float) this.f63570c.getX$universe_ui_shadow_release())))) + getPaddingLeft();
                }
                childAt2.layout(i7, i8, childAt2.getMeasuredWidth() + i7, childAt2.getMeasuredHeight() + i8);
                float f = (float) i7;
                float f2 = (float) i8;
                this.f63568a.set(f, f2, ((float) childAt2.getMeasuredWidth()) + f, ((float) childAt2.getMeasuredHeight()) + f2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.shadow.UDShadowLayout.LayoutParams");
        }
    }
}
