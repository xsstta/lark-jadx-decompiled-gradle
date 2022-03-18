package com.larksuite.component.ignition.widget.message_card_header;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 22\u00020\u0001:\u00012B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002JH\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000bH\u0002J\b\u0010*\u001a\u00020\u0004H\u0016J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u0004H\u0016J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u0004H\u0016J\u0012\u0010/\u001a\u00020\u001c2\b\u00100\u001a\u0004\u0018\u000101H\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u00148B@BX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u00063"}, d2 = {"Lcom/larksuite/component/ignition/widget/message_card_header/MessageCardHeaderDrawable;", "Landroid/graphics/drawable/ColorDrawable;", "()V", "value", "", "baseColor", "getBaseColor", "()I", "setBaseColor", "(I)V", "density", "", "getDensity", "()F", "setDensity", "(F)V", "paint", "Landroid/graphics/Paint;", "primaryColor", "shader1", "Landroid/graphics/Shader;", "shader2", "shader3", "getShader3", "()Landroid/graphics/Shader;", "setShader3", "(Landroid/graphics/Shader;)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawCircle1", "drawCircle2", "drawCircle3", "drawCircleImpl", "shader", "translationX", "translationY", "scaleX", "scaleY", "rotation", "radius", "getOpacity", "setAlpha", "alpha", "setColor", "color", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "Companion", "ignition-widget-message-card-header_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.component.ignition.widget.b.a */
public final class MessageCardHeaderDrawable extends ColorDrawable {

    /* renamed from: a */
    public static final Companion f59994a = new Companion(null);

    /* renamed from: b */
    private final Paint f59995b = new Paint();

    /* renamed from: c */
    private Shader f59996c;

    /* renamed from: d */
    private Shader f59997d;

    /* renamed from: e */
    private int f59998e;

    /* renamed from: f */
    private int f59999f;

    /* renamed from: g */
    private float f60000g = 2.25f;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/larksuite/component/ignition/widget/message_card_header/MessageCardHeaderDrawable$Companion;", "", "()V", "CIRCLE_1_RADIUS", "", "CIRCLE_1_ROTATION", "CIRCLE_1_SCALE_Y", "CIRCLE_1_TRANSLATION_X", "CIRCLE_1_TRANSLATION_Y", "CIRCLE_2_RADIUS", "CIRCLE_2_ROTATION", "CIRCLE_2_SCALE_Y", "CIRCLE_2_TRANSLATION_X", "CIRCLE_2_TRANSLATION_Y", "CIRCLE_3_RADIUS", "CIRCLE_3_ROTATION", "CIRCLE_3_SCALE_Y", "CIRCLE_3_TRANSLATION_X", "CIRCLE_3_TRANSLATION_Y", "DESIGN_HALF_HEIGHT", "DESIGN_HALF_WIDTH", "ignition-widget-message-card-header_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.larksuite.component.ignition.widget.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final Shader m88787a() {
        return this.f59996c;
    }

    /* renamed from: a */
    private final void m88790a(Shader shader) {
        this.f59996c = shader;
    }

    /* renamed from: a */
    public final void mo87033a(float f) {
        this.f60000g = f;
    }

    public void setColor(int i) {
        super.setColor(i);
        this.f59998e = i;
        invalidateSelf();
    }

    /* renamed from: a */
    private final void m88788a(Canvas canvas) {
        Shader shader = this.f59996c;
        if (shader == null) {
            Intrinsics.throwNpe();
        }
        m88789a(canvas, shader, -320.0f, 10.0f, 1.0f, 0.33f, BitmapDescriptorFactory.HUE_RED, 240.0f);
    }

    /* renamed from: b */
    private final void m88791b(Canvas canvas) {
        Shader shader = this.f59997d;
        if (shader == null) {
            Intrinsics.throwNpe();
        }
        m88789a(canvas, shader, 10.0f, -80.0f, 1.0f, 0.875f, -45.0f, 210.0f);
    }

    /* renamed from: c */
    private final void m88792c(Canvas canvas) {
        Shader a = m88787a();
        if (a == null) {
            Intrinsics.throwNpe();
        }
        m88789a(canvas, a, 296.0f, 30.0f, 1.0f, 0.33f, BitmapDescriptorFactory.HUE_RED, 240.0f);
    }

    /* renamed from: a */
    public final void mo87034a(int i) {
        if (this.f59999f != i) {
            this.f59999f = i;
            Shader shader = null;
            this.f59996c = shader;
            m88790a(shader);
            this.f59995b.setShader(shader);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        canvas.drawColor(this.f59998e);
        if (Build.VERSION.SDK_INT >= 26) {
            if (this.f59996c == null || this.f59997d == null || m88787a() == null) {
                int i = this.f59999f;
                int[] iArr = {i, i, 0};
                float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.33f, 1.0f};
                this.f59996c = new RadialGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, 240.0f, iArr, fArr, Shader.TileMode.CLAMP);
                this.f59997d = new RadialGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, 210.0f, iArr, fArr, Shader.TileMode.CLAMP);
            }
            float f = this.f60000g;
            int save = canvas.save();
            canvas.scale(f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            try {
                save = canvas.save();
                canvas.translate(300.0f, 70.0f);
                try {
                    m88788a(canvas);
                    m88791b(canvas);
                    m88792c(canvas);
                    canvas.restoreToCount(save);
                } finally {
                    canvas.restoreToCount(save);
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: a */
    private final void m88789a(Canvas canvas, Shader shader, float f, float f2, float f3, float f4, float f5, float f6) {
        this.f59995b.setShader(shader);
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            int save2 = canvas.save();
            canvas.scale(f3, f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            try {
                save = canvas.save();
                canvas.rotate(f5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                float f7 = -f6;
                try {
                    canvas.drawOval(f7, f7, f6, f6, this.f59995b);
                    canvas.restoreToCount(save);
                    canvas.restoreToCount(save2);
                } finally {
                    canvas.restoreToCount(save);
                }
            } finally {
                canvas.restoreToCount(save2);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
