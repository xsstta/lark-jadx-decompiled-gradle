package com.larksuite.component.ignition.widget.squircle;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\"\u001a\u00020#2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010(\u001a\u00020#H\u0002J\u0010\u0010)\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0014J(\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0014J\f\u0010/\u001a\u00020#*\u00020\u0015H\u0002J\f\u00100\u001a\u00020#*\u00020\u0015H\u0002R&\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t8\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t8\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t8\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/larksuite/component/ignition/widget/squircle/SquircleImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "borderColor", "getBorderColor", "()I", "setBorderColor", "(I)V", "borderWidth", "getBorderWidth", "setBorderWidth", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint$delegate", "Lkotlin/Lazy;", "radius", "getRadius", "setRadius", "rectPath", "Landroid/graphics/Path;", "squirclePath", "xfermode", "Landroid/graphics/PorterDuffXfermode;", "applyStyle", "", "draw", "canvas", "Landroid/graphics/Canvas;", "drawBorder", "ensurePath", "onDraw", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "setBorderMode", "setClipMode", "ignition-widget-squircle_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SquircleImageView extends AppCompatImageView {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f60021a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SquircleImageView.class), "paint", "getPaint()Landroid/graphics/Paint;"))};

    /* renamed from: b */
    private final PorterDuffXfermode f60022b;

    /* renamed from: c */
    private int f60023c;

    /* renamed from: d */
    private int f60024d;

    /* renamed from: e */
    private int f60025e;

    /* renamed from: f */
    private final Lazy f60026f;

    /* renamed from: g */
    private final Path f60027g;

    /* renamed from: h */
    private final Path f60028h;

    private final Paint getPaint() {
        Lazy lazy = this.f60026f;
        KProperty kProperty = f60021a[0];
        return (Paint) lazy.getValue();
    }

    public final int getBorderColor() {
        return this.f60025e;
    }

    public final int getBorderWidth() {
        return this.f60024d;
    }

    public final int getRadius() {
        return this.f60023c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.component.ignition.widget.squircle.SquircleImageView$a */
    static final class C24332a extends Lambda implements Function0<Paint> {
        public static final C24332a INSTANCE = new C24332a();

        C24332a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Paint invoke() {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            return paint;
        }
    }

    /* renamed from: a */
    private final void m88825a() {
        this.f60028h.reset();
        C24333a.m88828a(this.f60028h, new Rect(0, 0, getWidth(), getHeight()), this.f60023c);
        this.f60027g.reset();
        float f = (float) 1;
        this.f60027g.addRect(-1.0f, -1.0f, f + ((float) getWidth()), f + ((float) getHeight()), Path.Direction.CW);
        this.f60027g.op(this.f60028h, Path.Op.DIFFERENCE);
    }

    public final void setBorderColor(int i) {
        this.f60025e = i;
        invalidate();
    }

    public final void setBorderWidth(int i) {
        this.f60024d = i;
        invalidate();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SquircleImageView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    private final void setBorderMode(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setXfermode(null);
    }

    private final void setClipMode(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(this.f60022b);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        m88826a(canvas);
    }

    public final void setRadius(int i) {
        if (i != this.f60023c) {
            m88825a();
            this.f60023c = i;
        }
    }

    /* renamed from: a */
    private final void m88826a(Canvas canvas) {
        if (this.f60024d > 0) {
            setBorderMode(getPaint());
            getPaint().setColor(this.f60025e);
            getPaint().setStrokeWidth(((float) this.f60024d) * 2.0f);
            canvas.drawPath(this.f60028h, getPaint());
        }
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        int saveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight(), null);
        super.draw(canvas);
        setClipMode(getPaint());
        canvas.drawPath(this.f60027g, getPaint());
        canvas.restoreToCount(saveLayer);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SquircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m88827a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.border_color, R.attr.border_width, R.attr.radius}, i, 0);
        setRadius(obtainStyledAttributes.getDimensionPixelSize(2, this.f60023c));
        setBorderWidth(obtainStyledAttributes.getDimensionPixelSize(1, this.f60024d));
        setBorderColor(obtainStyledAttributes.getColor(0, this.f60025e));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SquircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f60022b = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f60026f = LazyKt.lazy(C24332a.INSTANCE);
        this.f60027g = new Path();
        this.f60028h = new Path();
        m88827a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            m88825a();
        }
    }
}
