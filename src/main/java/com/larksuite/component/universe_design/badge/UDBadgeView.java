package com.larksuite.component.universe_design.badge;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.badge.UDBadge;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\b\u0016\u0018\u00002\u00020\u0001:\u0001GB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0006\u0010\"\u001a\u00020#J*\u0010$\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0012\u0010%\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\u0018\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH\u0014J\u0010\u0010+\u001a\u00020#2\b\b\u0001\u0010,\u001a\u00020\tJ\u0010\u0010-\u001a\u00020#2\b\b\u0001\u0010.\u001a\u00020\tJ\u000e\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020\u0011J\u000e\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\u0013J\u000e\u00103\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u00103\u001a\u00020#2\b\b\u0001\u00104\u001a\u00020\tJ\u000e\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020\u0017J\u0010\u00107\u001a\u00020#2\b\b\u0001\u0010,\u001a\u00020\tJ\u0010\u00108\u001a\u00020#2\b\b\u0001\u0010.\u001a\u00020\tJ\u000e\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020\u0011J\u0010\u0010;\u001a\u00020#2\b\b\u0001\u0010,\u001a\u00020\tJ\u0010\u0010<\u001a\u00020#2\b\b\u0001\u0010.\u001a\u00020\tJ\u000e\u0010=\u001a\u00020#2\u0006\u0010:\u001a\u00020\u0011J\u0010\u0010>\u001a\u00020#2\b\b\u0001\u0010?\u001a\u00020\tJ\u000e\u0010>\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010@\u001a\u00020#2\b\b\u0001\u0010\u001e\u001a\u00020\tJ\u0010\u0010A\u001a\u00020#2\b\b\u0001\u0010.\u001a\u00020\tJ\u000e\u0010B\u001a\u00020#2\u0006\u0010C\u001a\u00020\tJ\u000e\u0010D\u001a\u00020#2\u0006\u0010 \u001a\u00020\u0011J\u000e\u0010E\u001a\u00020#2\u0006\u00106\u001a\u00020\u0011J\b\u0010F\u001a\u00020#H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/larksuite/component/universe_design/badge/UDBadgeView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "badge", "Lcom/larksuite/component/universe_design/badge/UDBadge;", "badgeColor", "badgeSize", "", "badgeType", "Lcom/larksuite/component/universe_design/badge/UDBadge$BadgeType;", "icon", "Landroid/graphics/drawable/Drawable;", "iconPadding", "Landroid/graphics/RectF;", "innerBorderColor", "innerBorderWidth", "outerBorderColor", "outerBorderWidth", "text", "", "textColor", "textMaxLength", "textSize", "textWidthPadding", "applyChanges", "", "init", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setBadgeColor", "color", "setBadgeColorRes", "colorRes", "setBadgeSize", "size", "setBadgeType", ShareHitPoint.f121869d, "setIcon", "iconResId", "setIconPadding", "padding", "setInnerBorderColor", "setInnerBorderColorRes", "setInnerBorderWidth", "width", "setOuterBorderColor", "setOuterBorderColorRes", "setOuterBorderWidth", "setText", "textResId", "setTextColor", "setTextColorRes", "setTextMaxLength", "maxLength", "setTextSize", "setTextWidthPadding", "updateModel", "Builder", "universe-ui-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDBadgeView extends View {

    /* renamed from: a */
    public String f63049a;

    /* renamed from: b */
    public Drawable f63050b;

    /* renamed from: c */
    private UDBadge.BadgeType f63051c;

    /* renamed from: d */
    private float f63052d;

    /* renamed from: e */
    private int f63053e;

    /* renamed from: f */
    private float f63054f;

    /* renamed from: g */
    private int f63055g;

    /* renamed from: h */
    private float f63056h;

    /* renamed from: i */
    private int f63057i;

    /* renamed from: j */
    private float f63058j;

    /* renamed from: k */
    private int f63059k;

    /* renamed from: l */
    private float f63060l;

    /* renamed from: m */
    private int f63061m;

    /* renamed from: n */
    private RectF f63062n;

    /* renamed from: o */
    private UDBadge f63063o;

    /* renamed from: b */
    public final void mo90238b() {
        mo90237a();
        if (isAttachedToWindow()) {
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo90237a() {
        boolean z;
        UDBadge uDBadge = this.f63063o;
        UDBadge.Model dVar = new UDBadge.Model();
        dVar.mo90212a(this.f63051c);
        dVar.mo90208a(this.f63052d);
        dVar.mo90209a(this.f63053e);
        dVar.mo90216b(this.f63054f);
        dVar.mo90217b(this.f63055g);
        dVar.mo90220c(this.f63056h);
        dVar.mo90221c(this.f63057i);
        dVar.mo90218b(this.f63049a);
        dVar.mo90224d(this.f63059k);
        dVar.mo90223d(this.f63058j);
        dVar.mo90226e(this.f63060l);
        dVar.mo90227e(this.f63061m);
        dVar.mo90211a(this.f63050b);
        dVar.mo90210a(this.f63062n);
        String str = this.f63049a;
        if (str != null) {
            boolean z2 = true;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || str.length() <= this.f63061m) {
                z2 = false;
            }
            Drawable drawable = null;
            if (!z2) {
                str = null;
            }
            if (str != null) {
                Drawable drawable2 = getContext().getDrawable(R.drawable.ud_icon_more_outlined);
                if (drawable2 != null) {
                    drawable = drawable2.mutate();
                    Context context = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    drawable.setTint(UDColorUtils.getColor(context, R.color.static_white));
                }
                dVar.mo90211a(drawable);
                dVar.mo90212a(UDBadge.BadgeType.ICON);
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                float a = UDDimenUtils.m93307a(context2, 4.0f);
                dVar.mo90210a(new RectF(a, BitmapDescriptorFactory.HUE_RED, a, BitmapDescriptorFactory.HUE_RED));
            }
        }
        uDBadge.mo90197a(dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/larksuite/component/universe_design/badge/UDBadgeView$Builder;", "", "()V", "icon", "Landroid/graphics/drawable/Drawable;", "iconResId", "", "style", "text", "", "textResId", "build", "Lcom/larksuite/component/universe_design/badge/UDBadgeView;", "context", "Landroid/content/Context;", "setIcon", "setStyle", "setText", "universe-ui-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.badge.UDBadgeView$a */
    public static final class Builder {

        /* renamed from: a */
        private int f63064a;

        /* renamed from: b */
        private int f63065b = -1;

        /* renamed from: c */
        private int f63066c = -1;

        /* renamed from: a */
        public final Builder mo90261a(int i) {
            this.f63064a = i;
            return this;
        }

        /* renamed from: a */
        public final UDBadgeView mo90262a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            UDBadgeView uDBadgeView = new UDBadgeView(context, null, 0, this.f63064a);
            String str = uDBadgeView.f63049a;
            if (str != null) {
                uDBadgeView.setText(str);
            } else {
                int i = this.f63065b;
                if (i > 0) {
                    uDBadgeView.setText(i);
                }
            }
            Drawable drawable = uDBadgeView.f63050b;
            if (drawable != null) {
                uDBadgeView.setIcon(drawable);
            } else if (this.f63065b > 0) {
                uDBadgeView.setIcon(this.f63066c);
            }
            uDBadgeView.mo90237a();
            return uDBadgeView;
        }
    }

    public final void setBadgeColor(int i) {
        this.f63053e = i;
    }

    public final void setBadgeSize(float f) {
        this.f63052d = f;
    }

    public final void setInnerBorderColor(int i) {
        this.f63057i = i;
    }

    public final void setInnerBorderWidth(float f) {
        this.f63056h = f;
    }

    public final void setOuterBorderColor(int i) {
        this.f63055g = i;
    }

    public final void setOuterBorderWidth(float f) {
        this.f63054f = f;
    }

    public final void setTextColor(int i) {
        this.f63059k = i;
    }

    public final void setTextMaxLength(int i) {
        this.f63061m = i;
    }

    public final void setTextSize(float f) {
        this.f63058j = f;
    }

    public final void setTextWidthPadding(float f) {
        this.f63060l = f;
    }

    public final void setBadgeType(UDBadge.BadgeType badgeType) {
        Intrinsics.checkParameterIsNotNull(badgeType, ShareHitPoint.f121869d);
        this.f63051c = badgeType;
    }

    public final void setIcon(Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(drawable, "icon");
        this.f63050b = drawable;
    }

    public final void setIconPadding(RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "padding");
        this.f63062n = rectF;
    }

    public final void setText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.f63049a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDBadgeView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f63063o.mo90196a(canvas);
    }

    public final void setBadgeColorRes(int i) {
        this.f63053e = ContextCompat.getColor(getContext(), i);
    }

    public final void setIcon(int i) {
        this.f63050b = ContextCompat.getDrawable(getContext(), i);
    }

    public final void setInnerBorderColorRes(int i) {
        this.f63057i = ContextCompat.getColor(getContext(), i);
    }

    public final void setOuterBorderColorRes(int i) {
        this.f63055g = ContextCompat.getColor(getContext(), i);
    }

    public final void setTextColorRes(int i) {
        this.f63059k = ContextCompat.getColor(getContext(), i);
    }

    public final void setText(int i) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.f63049a = context.getResources().getString(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension((int) this.f63063o.mo90199c(), (int) this.f63063o.mo90200d());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDBadgeView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDBadgeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63051c = UDBadge.BadgeType.UNKNOWN;
        this.f63061m = 3;
        this.f63063o = new UDBadge();
        m92420a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private final void m92420a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_badge_color, R.attr.ud_badge_icon, R.attr.ud_badge_iconPadding, R.attr.ud_badge_innerBorderColor, R.attr.ud_badge_innerBorderWidth, R.attr.ud_badge_outerBorderColor, R.attr.ud_badge_outerBorderWidth, R.attr.ud_badge_size, R.attr.ud_badge_text, R.attr.ud_badge_textColor, R.attr.ud_badge_textMaxLength, R.attr.ud_badge_textSize, R.attr.ud_badge_textWidthPadding, R.attr.ud_badge_type}, i, i2);
        this.f63051c = UDBadge.f63020b.mo90202a(obtainStyledAttributes.getInt(13, -1));
        this.f63052d = obtainStyledAttributes.getDimension(7, UDDimenUtils.m93307a(context, 16.0f));
        this.f63053e = obtainStyledAttributes.getColor(0, 0);
        this.f63054f = obtainStyledAttributes.getDimension(6, BitmapDescriptorFactory.HUE_RED);
        this.f63055g = obtainStyledAttributes.getColor(5, 0);
        this.f63056h = obtainStyledAttributes.getDimension(4, BitmapDescriptorFactory.HUE_RED);
        this.f63057i = obtainStyledAttributes.getColor(3, 0);
        this.f63049a = obtainStyledAttributes.getString(8);
        this.f63059k = obtainStyledAttributes.getColor(9, 0);
        this.f63058j = obtainStyledAttributes.getDimension(11, (float) UDDimenUtils.m93312c(context, 12.0f));
        this.f63060l = obtainStyledAttributes.getDimension(12, BitmapDescriptorFactory.HUE_RED);
        this.f63061m = obtainStyledAttributes.getInt(10, this.f63061m);
        this.f63050b = obtainStyledAttributes.getDrawable(1);
        float dimension = obtainStyledAttributes.getDimension(2, UDDimenUtils.m93307a(context, 4.0f));
        this.f63062n = new RectF(dimension, dimension, dimension, dimension);
        obtainStyledAttributes.recycle();
        if (attributeSet != null || i != 0 || i2 != 0) {
            mo90237a();
        }
    }
}
