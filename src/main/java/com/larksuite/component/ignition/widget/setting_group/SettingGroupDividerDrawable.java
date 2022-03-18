package com.larksuite.component.ignition.widget.setting_group;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0006H\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\rH\u0014J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0006H\u0016J\u0012\u0010'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR&\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u000b¨\u0006*"}, d2 = {"Lcom/larksuite/component/ignition/widget/setting_group/SettingGroupDividerDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "backgroundColor", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "dividerBounds", "Landroid/graphics/Rect;", "dividerColor", "getDividerColor", "setDividerColor", "leftPadding", "getLeftPadding", "setLeftPadding", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint$delegate", "Lkotlin/Lazy;", "rightPadding", "getRightPadding", "setRightPadding", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getIntrinsicHeight", "getOpacity", "onBoundsChange", "bounds", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "ignition-widget-settinggroup_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.component.ignition.widget.setting_group.b */
public final class SettingGroupDividerDrawable extends Drawable {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f60009a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SettingGroupDividerDrawable.class), "paint", "getPaint()Landroid/graphics/Paint;"))};

    /* renamed from: b */
    private int f60010b;

    /* renamed from: c */
    private int f60011c;

    /* renamed from: d */
    private int f60012d;

    /* renamed from: e */
    private int f60013e;

    /* renamed from: f */
    private final Rect f60014f = new Rect();

    /* renamed from: g */
    private final Lazy f60015g = LazyKt.lazy(C24331a.INSTANCE);

    /* renamed from: h */
    private final Context f60016h;

    /* renamed from: a */
    private final Paint m88805a() {
        Lazy lazy = this.f60015g;
        KProperty kProperty = f60009a[0];
        return (Paint) lazy.getValue();
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.component.ignition.widget.setting_group.b$a */
    static final class C24331a extends Lambda implements Function0<Paint> {
        public static final C24331a INSTANCE = new C24331a();

        C24331a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Paint invoke() {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            return paint;
        }
    }

    public int getIntrinsicHeight() {
        return UIUtils.dp2px(this.f60016h, 0.5f);
    }

    /* renamed from: a */
    public final void mo87051a(int i) {
        this.f60010b = i;
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo87052b(int i) {
        this.f60012d = i;
        invalidateSelf();
    }

    /* renamed from: c */
    public final void mo87053c(int i) {
        this.f60013e = i;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Intrinsics.checkParameterIsNotNull(rect, "bounds");
        this.f60014f.set(rect.left + this.f60010b, rect.top, rect.right - this.f60011c, rect.bottom);
    }

    public SettingGroupDividerDrawable(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f60016h = context;
        mo87052b(UIUtils.getColor(context, R.color.bg_body));
        mo87053c(UIUtils.getColor(context, R.color.line_divider_default));
        mo87051a(UIUtils.dp2px(context, 16.0f));
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        m88805a().setColor(this.f60012d);
        canvas.drawRect(getBounds(), m88805a());
        m88805a().setColor(this.f60013e);
        if (!this.f60014f.isEmpty() && getBounds().contains(this.f60014f)) {
            canvas.drawRect(this.f60014f, m88805a());
        }
    }
}
