package com.larksuite.component.universe_design.image;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 <2\u00020\u0001:\u0002;<B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\r\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,J\u0010\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020/H\u0002J\"\u0010-\u001a\u00020'2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014J\b\u00100\u001a\u00020'H\u0014J\u0012\u00101\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0018\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\tH\u0014J(\u00105\u001a\u00020'2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\tH\u0014J\b\u0010:\u001a\u00020%H\u0002R$\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\"\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010#\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/larksuite/component/universe_design/image/UDAvatar;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "avatarSize", "getAvatarSize", "()I", "setAvatarSize", "(I)V", "avatarSizeInPixel", "borderColor", "getBorderColor", "setBorderColor", "borderPaint", "Landroid/graphics/Paint;", "borderStyle", "getBorderStyle", "setBorderStyle", "borderWidth", "", "getBorderWidth", "()Ljava/lang/Float;", "setBorderWidth", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "cornerRadius", "isDrawBorderDelegate", "", "drawBorder", "", "canvas", "Landroid/graphics/Canvas;", "drawBorderDelegate", "Landroid/widget/FrameLayout;", "drawBorderDelegate$universe_ui_avatar_release", "init", "ta", "Landroid/content/res/TypedArray;", "onAvatarSizeChanged", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "shouldDrawBorder", "AvatarOutlineProvider", "Companion", "universe-ui-avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDAvatar extends AppCompatImageView {

    /* renamed from: a */
    public static final Companion f63440a = new Companion(null);

    /* renamed from: b */
    private int f63441b;

    /* renamed from: c */
    private int f63442c;

    /* renamed from: d */
    private Float f63443d;

    /* renamed from: e */
    private Paint f63444e;

    /* renamed from: f */
    private float f63445f;

    /* renamed from: g */
    private boolean f63446g;

    /* renamed from: h */
    private int f63447h;

    /* renamed from: i */
    private int f63448i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/larksuite/component/universe_design/image/UDAvatar$Companion;", "", "()V", "AVATAR_LARGE", "", "AVATAR_MIDDLE", "AVATAR_MINI", "AVATAR_SMALL", "BORDER_CIRCLE", "BORDER_RECTANGULAR", "universe-ui-avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.image.UDAvatar$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getAvatarSize() {
        return this.f63447h;
    }

    public final int getBorderColor() {
        return this.f63442c;
    }

    public final int getBorderStyle() {
        return this.f63441b;
    }

    public final Float getBorderWidth() {
        return this.f63443d;
    }

    /* renamed from: c */
    private final boolean m92861c() {
        float f;
        if (!this.f63446g && this.f63442c != 0) {
            Float f2 = this.f63443d;
            if (f2 != null) {
                f = f2.floatValue();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            if (f > BitmapDescriptorFactory.HUE_RED) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final FrameLayout mo90989b() {
        int i;
        int i2;
        if (!this.f63446g) {
            this.f63446g = true;
            FrameLayout frameLayout = new FrameLayout(getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            Float f = this.f63443d;
            if (f != null) {
                i = (int) f.floatValue();
            } else {
                i = 0;
            }
            gradientDrawable.setStroke(i, this.f63442c);
            gradientDrawable.setCornerRadius(((float) this.f63448i) / 2.0f);
            frameLayout.setBackground(gradientDrawable);
            Float f2 = this.f63443d;
            if (f2 != null) {
                i2 = (int) f2.floatValue();
            } else {
                i2 = 0;
            }
            int i3 = i2 - 0;
            frameLayout.setPadding(i3, i3, i3, i3);
            frameLayout.addView(this, new FrameLayout.LayoutParams(-2, -2));
            this.f63448i -= i3;
            return frameLayout;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            return (FrameLayout) parent;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo90987a() {
        float f;
        float f2;
        int i = this.f63447h;
        if (i == -4) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            f = UDDimenUtils.m93311c(context, (int) R.dimen.ud_avatar_size_mini);
        } else if (i == -3) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            f = UDDimenUtils.m93311c(context2, (int) R.dimen.ud_avatar_size_small);
        } else if (i == -2) {
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            f = UDDimenUtils.m93311c(context3, (int) R.dimen.ud_avatar_size_middle);
        } else if (i != -1) {
            f = (float) i;
        } else {
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            f = UDDimenUtils.m93311c(context4, (int) R.dimen.ud_avatar_size_large);
        }
        this.f63448i = (int) f;
        int i2 = this.f63447h;
        if (i2 == -4) {
            Context context5 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context5, "context");
            f2 = UDDimenUtils.m93311c(context5, (int) R.dimen.ud_avatar_rectangular_corner_radius_mini);
        } else if (i2 == -3) {
            Context context6 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context6, "context");
            f2 = UDDimenUtils.m93311c(context6, (int) R.dimen.ud_avatar_rectangular_corner_radius_small);
        } else if (i2 == -2) {
            Context context7 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context7, "context");
            f2 = UDDimenUtils.m93311c(context7, (int) R.dimen.ud_avatar_rectangular_corner_radius_middle);
        } else if (i2 != -1) {
            Context context8 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context8, "context");
            f2 = UDDimenUtils.m93311c(context8, (int) R.dimen.ud_avatar_rectangular_corner_radius_large);
        } else {
            Context context9 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context9, "context");
            f2 = UDDimenUtils.m93311c(context9, (int) R.dimen.ud_avatar_rectangular_corner_radius_large);
        }
        this.f63445f = f2;
    }

    public final void setBorderColor(int i) {
        this.f63442c = i;
    }

    public final void setBorderStyle(int i) {
        this.f63441b = i;
    }

    public final void setBorderWidth(Float f) {
        this.f63443d = f;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m92860a(canvas);
    }

    public final void setAvatarSize(int i) {
        this.f63447h = i;
        mo90987a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDAvatar(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m92859a(TypedArray typedArray) {
        this.f63445f = (float) typedArray.getDimensionPixelSize(4, -1);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(3, -1);
        if (dimensionPixelSize > 0) {
            this.f63443d = Float.valueOf((float) dimensionPixelSize);
        }
        this.f63442c = typedArray.getColor(1, 0);
        this.f63441b = typedArray.getInt(2, 0);
        int type = typedArray.getType(5);
        if (type == 5) {
            setAvatarSize(typedArray.getDimensionPixelSize(5, 0));
        } else if (16 <= type && 31 >= type) {
            setAvatarSize(typedArray.getInt(5, -1));
        }
    }

    /* renamed from: a */
    private final void m92860a(Canvas canvas) {
        float f;
        float f2;
        if (m92861c()) {
            Paint paint = this.f63444e;
            float f3 = BitmapDescriptorFactory.HUE_RED;
            if (paint != null) {
                Float f4 = this.f63443d;
                if (f4 != null) {
                    f2 = f4.floatValue();
                } else {
                    f2 = BitmapDescriptorFactory.HUE_RED;
                }
                paint.setStrokeWidth(f2);
            }
            Float f5 = this.f63443d;
            if (f5 != null) {
                f = f5.floatValue();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            if (f > BitmapDescriptorFactory.HUE_RED) {
                Paint paint2 = this.f63444e;
                if (paint2 != null) {
                    paint2.setColor(this.f63442c);
                }
                Float f6 = this.f63443d;
                if (f6 != null) {
                    f3 = f6.floatValue();
                }
                float f7 = f3 / ((float) 3);
                float width = ((float) getWidth()) / 2.0f;
                float height = ((float) getHeight()) / 2.0f;
                if (this.f63441b != 0) {
                    RectF rectF = new RectF(f7, f7, ((float) getWidth()) - f7, ((float) getHeight()) - f7);
                    float f8 = this.f63445f;
                    if (f8 < ((float) 0)) {
                        f8 = Math.min(width, height) - f7;
                    }
                    Paint paint3 = this.f63444e;
                    if (paint3 != null && canvas != null) {
                        canvas.drawRoundRect(rectF, f8, f8, paint3);
                        return;
                    }
                    return;
                }
                float min = Math.min(width, height) - f7;
                Paint paint4 = this.f63444e;
                if (paint4 != null && canvas != null) {
                    canvas.drawCircle(width, height, min, paint4);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/universe_design/image/UDAvatar$AvatarOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "width", "", "height", "cornerRadius", "", "(IIF)V", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "universe-ui-avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.image.UDAvatar$a */
    private static final class AvatarOutlineProvider extends ViewOutlineProvider {

        /* renamed from: a */
        private final int f63449a;

        /* renamed from: b */
        private final int f63450b;

        /* renamed from: c */
        private float f63451c;

        public void getOutline(View view, Outline outline) {
            if (outline != null) {
                outline.setRoundRect(0, 0, this.f63449a, this.f63450b, this.f63451c);
            }
        }

        public AvatarOutlineProvider(int i, int i2, float f) {
            this.f63449a = i;
            this.f63450b = i2;
            this.f63451c = f;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f63448i;
        setMeasuredDimension(i3, i3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDAvatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDAvatar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo90988a(AttributeSet attributeSet, int i, int i2) {
        Paint paint = new Paint();
        this.f63444e = paint;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
        }
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_avatar_background, R.attr.ud_avatar_borderColor, R.attr.ud_avatar_borderStyle, R.attr.ud_avatar_borderWidth, R.attr.ud_avatar_cornerRadius, R.attr.ud_avatar_size, R.attr.ud_avatar_text, R.attr.ud_avatar_textColor, R.attr.ud_avatar_textSize}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        m92859a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        setClipToOutline(true);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r3 < ((float) 0)) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        /*
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            int r3 = r0.f63441b
            if (r3 == 0) goto L_0x000f
            float r3 = r0.f63445f
            r4 = 0
            float r4 = (float) r4
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0017
        L_0x000f:
            int r3 = java.lang.Math.min(r1, r2)
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
        L_0x0017:
            com.larksuite.component.universe_design.image.UDAvatar$a r4 = new com.larksuite.component.universe_design.image.UDAvatar$a
            r4.<init>(r1, r2, r3)
            android.view.ViewOutlineProvider r4 = (android.view.ViewOutlineProvider) r4
            r0.setOutlineProvider(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.universe_design.image.UDAvatar.onSizeChanged(int, int, int, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDAvatar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63447h = -1;
        mo90988a(attributeSet, i, i2);
    }
}
