package com.ss.android.lark.mm.widget.avatar;

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
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 <2\u00020\u0001:\u0002;<B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\r\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,J\u0010\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020/H\u0002J\"\u0010-\u001a\u00020'2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014J\b\u00100\u001a\u00020'H\u0014J\u0012\u00101\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0018\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\tH\u0014J(\u00105\u001a\u00020'2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\tH\u0014J\b\u0010:\u001a\u00020%H\u0002R$\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010#\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/ss/android/lark/mm/widget/avatar/Avatar;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "avatarSize", "getAvatarSize", "()I", "setAvatarSize", "(I)V", "avatarSizeInPixel", "borderColor", "getBorderColor", "setBorderColor", "borderPaint", "Landroid/graphics/Paint;", "borderStyle", "getBorderStyle", "setBorderStyle", "borderWidth", "", "getBorderWidth", "()Ljava/lang/Float;", "setBorderWidth", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "cornerRadius", "isDrawBorderDelegate", "", "drawBorder", "", "canvas", "Landroid/graphics/Canvas;", "drawBorderDelegate", "Landroid/widget/FrameLayout;", "drawBorderDelegate$mm_release", "init", "ta", "Landroid/content/res/TypedArray;", "onAvatarSizeChanged", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "shouldDrawBorder", "AvatarOutlineProvider", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public class Avatar extends AppCompatImageView {

    /* renamed from: a */
    public static final Companion f118780a = new Companion(null);

    /* renamed from: b */
    private int f118781b;

    /* renamed from: c */
    private int f118782c;

    /* renamed from: d */
    private Float f118783d;

    /* renamed from: e */
    private Paint f118784e;

    /* renamed from: f */
    private float f118785f;

    /* renamed from: g */
    private boolean f118786g;

    /* renamed from: h */
    private int f118787h;

    /* renamed from: i */
    private int f118788i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mm/widget/avatar/Avatar$Companion;", "", "()V", "AVATAR_CUSTOM", "", "AVATAR_LARGE", "AVATAR_MAXI", "AVATAR_MIDDLE", "AVATAR_MINI", "AVATAR_SMALL", "BORDER_CIRCLE", "BORDER_RECTANGULAR", "TAG", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.avatar.Avatar$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getAvatarSize() {
        return this.f118787h;
    }

    public final int getBorderColor() {
        return this.f118782c;
    }

    public final int getBorderStyle() {
        return this.f118781b;
    }

    public final Float getBorderWidth() {
        return this.f118783d;
    }

    /* renamed from: c */
    private final boolean m186691c() {
        float f;
        if (!this.f118786g && this.f118782c != 0) {
            Float f2 = this.f118783d;
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
    public final FrameLayout mo165657b() {
        int i;
        int i2;
        if (!this.f118786g) {
            this.f118786g = true;
            FrameLayout frameLayout = new FrameLayout(getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            Float f = this.f118783d;
            if (f != null) {
                i = (int) f.floatValue();
            } else {
                i = 0;
            }
            gradientDrawable.setStroke(i, this.f118782c);
            gradientDrawable.setCornerRadius(((float) this.f118788i) / 2.0f);
            frameLayout.setBackground(gradientDrawable);
            Float f2 = this.f118783d;
            if (f2 != null) {
                i2 = (int) f2.floatValue();
            } else {
                i2 = 0;
            }
            int i3 = i2 - 0;
            frameLayout.setPadding(i3, i3, i3, i3);
            frameLayout.addView(this, new FrameLayout.LayoutParams(-2, -2));
            this.f118788i -= i3;
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
    public void mo165655a() {
        int i;
        int i2;
        int i3 = this.f118787h;
        if (i3 == -5) {
            i = UIUtils.getDimens(getContext(), R.dimen.avatar_size_mini);
        } else if (i3 == -4) {
            i = UIUtils.getDimens(getContext(), R.dimen.avatar_size_small);
        } else if (i3 == -3) {
            i = UIUtils.getDimens(getContext(), R.dimen.avatar_size_middle);
        } else if (i3 == -2) {
            i = UIUtils.getDimens(getContext(), R.dimen.avatar_size_large);
        } else if (i3 != -1) {
            i = UIUtils.dp2px(getContext(), (float) this.f118787h);
        } else {
            i = UIUtils.getDimens(getContext(), R.dimen.avatar_size_maxi);
        }
        this.f118788i = i;
        if (this.f118782c != 0) {
            int i4 = this.f118787h;
            if (i4 == -5) {
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                i2 = context.getResources().getDimensionPixelSize(R.dimen.avatar_border_width_mini);
            } else if (i4 == -4) {
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                i2 = context2.getResources().getDimensionPixelSize(R.dimen.avatar_border_width_small);
            } else if (i4 == -3) {
                Context context3 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "context");
                i2 = context3.getResources().getDimensionPixelSize(R.dimen.avatar_border_width_middle);
            } else if (i4 == -2) {
                Context context4 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context4, "context");
                i2 = context4.getResources().getDimensionPixelSize(R.dimen.avatar_border_width_large);
            } else if (i4 != -1) {
                Context context5 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context5, "context");
                i2 = context5.getResources().getDimensionPixelSize(R.dimen.avatar_border_width_large);
            } else {
                Context context6 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context6, "context");
                i2 = context6.getResources().getDimensionPixelSize(R.dimen.avatar_border_width_maxi);
            }
            this.f118783d = Float.valueOf((float) i2);
        }
    }

    public final void setBorderColor(int i) {
        this.f118782c = i;
    }

    public final void setBorderStyle(int i) {
        this.f118781b = i;
    }

    public final void setBorderWidth(Float f) {
        this.f118783d = f;
    }

    public final void setAvatarSize(int i) {
        this.f118787h = i;
        mo165655a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Avatar(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            m186690a(canvas);
        } catch (Exception e) {
            C45855f.m181664c("Avatar", e.getMessage());
        }
    }

    /* renamed from: a */
    private final void m186689a(TypedArray typedArray) {
        this.f118785f = (float) typedArray.getDimensionPixelSize(4, -1);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(3, -1);
        if (dimensionPixelSize > 0) {
            this.f118783d = Float.valueOf((float) dimensionPixelSize);
        }
        this.f118782c = typedArray.getColor(1, 0);
        this.f118781b = typedArray.getInt(2, 0);
        setAvatarSize(typedArray.getInt(5, -6));
    }

    /* renamed from: a */
    private final void m186690a(Canvas canvas) {
        float f;
        float f2;
        if (m186691c()) {
            Paint paint = this.f118784e;
            float f3 = BitmapDescriptorFactory.HUE_RED;
            if (paint != null) {
                Float f4 = this.f118783d;
                if (f4 != null) {
                    f2 = f4.floatValue();
                } else {
                    f2 = BitmapDescriptorFactory.HUE_RED;
                }
                paint.setStrokeWidth(f2);
            }
            Float f5 = this.f118783d;
            if (f5 != null) {
                f = f5.floatValue();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            if (f > BitmapDescriptorFactory.HUE_RED) {
                Paint paint2 = this.f118784e;
                if (paint2 != null) {
                    paint2.setColor(this.f118782c);
                }
                Float f6 = this.f118783d;
                if (f6 != null) {
                    f3 = f6.floatValue();
                }
                float f7 = f3 / ((float) 3);
                float width = ((float) getWidth()) / 2.0f;
                float height = ((float) getHeight()) / 2.0f;
                if (this.f118781b != 0) {
                    RectF rectF = new RectF(f7, f7, ((float) getWidth()) - f7, ((float) getHeight()) - f7);
                    float f8 = this.f118785f;
                    if (f8 < ((float) 0)) {
                        f8 = Math.min(width, height) - f7;
                    }
                    if (canvas != null) {
                        Paint paint3 = this.f118784e;
                        if (paint3 == null) {
                            Intrinsics.throwNpe();
                        }
                        canvas.drawRoundRect(rectF, f8, f8, paint3);
                        return;
                    }
                    return;
                }
                float min = Math.min(width, height) - f7;
                if (canvas != null) {
                    Paint paint4 = this.f118784e;
                    if (paint4 == null) {
                        Intrinsics.throwNpe();
                    }
                    canvas.drawCircle(width, height, min, paint4);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mm/widget/avatar/Avatar$AvatarOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "width", "", "height", "cornerRadius", "", "(IIF)V", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.avatar.Avatar$a */
    private static final class AvatarOutlineProvider extends ViewOutlineProvider {

        /* renamed from: a */
        private final int f118789a;

        /* renamed from: b */
        private final int f118790b;

        /* renamed from: c */
        private float f118791c;

        public void getOutline(View view, Outline outline) {
            if (outline != null) {
                outline.setRoundRect(0, 0, this.f118789a, this.f118790b, this.f118791c);
            }
        }

        public AvatarOutlineProvider(int i, int i2, float f) {
            this.f118789a = i;
            this.f118790b = i2;
            this.f118791c = f;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f118787h != -6) {
            int i3 = this.f118788i;
            setMeasuredDimension(i3, i3);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Avatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Avatar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo165656a(AttributeSet attributeSet, int i, int i2) {
        Paint paint = new Paint();
        this.f118784e = paint;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
        }
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.avatar_background, R.attr.avatar_borderColor, R.attr.avatar_borderStyle, R.attr.avatar_borderWidth, R.attr.avatar_cornerRadius, R.attr.avatar_sizeType, R.attr.avatar_text, R.attr.avatar_textColor, R.attr.avatar_textSize}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        m186689a(obtainStyledAttributes);
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
            int r3 = r0.f118781b
            if (r3 == 0) goto L_0x000f
            float r3 = r0.f118785f
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
            com.ss.android.lark.mm.widget.avatar.Avatar$a r4 = new com.ss.android.lark.mm.widget.avatar.Avatar$a
            r4.<init>(r1, r2, r3)
            android.view.ViewOutlineProvider r4 = (android.view.ViewOutlineProvider) r4
            r0.setOutlineProvider(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.widget.avatar.Avatar.onSizeChanged(int, int, int, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Avatar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f118787h = -6;
        mo165656a(attributeSet, i, i2);
    }
}
