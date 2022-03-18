package com.ss.android.lark.pin.impl.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.wheelpicker.AbstractC59265j;
import com.ss.android.lark.widget.wheelpicker.WheelView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0014J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0014J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/pin/impl/view/PinSubscribeWheelView;", "Lcom/ss/android/lark/widget/wheelpicker/WheelView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defaultTextTargetSkewx", "", "tag", "", "textXOffset", "", "initPaints", "", "judgeLineSpace", "measuredCenterContentStart", "content", "measuredOutContentStart", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PinSubscribeWheelView extends WheelView {

    /* renamed from: W */
    private int f128496W;

    /* renamed from: a */
    private final String f128497a = "PinSubscribeWheelView";

    /* renamed from: b */
    private final float f128498b = 0.5f;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.wheelpicker.WheelView
    /* renamed from: b */
    public void mo156843b() {
        if (this.f147199s < 1.0f) {
            this.f147199s = 1.0f;
        } else if (this.f147199s > 4.0f) {
            this.f147199s = 4.0f;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.wheelpicker.WheelView
    /* renamed from: c */
    public void mo177666c() {
        this.f147187g = new Paint();
        Paint paint = this.f147187g;
        Intrinsics.checkExpressionValueIsNotNull(paint, "paintOuterText");
        paint.setColor(this.f147196p);
        Paint paint2 = this.f147187g;
        Intrinsics.checkExpressionValueIsNotNull(paint2, "paintOuterText");
        paint2.setAntiAlias(true);
        Paint paint3 = this.f147187g;
        Intrinsics.checkExpressionValueIsNotNull(paint3, "paintOuterText");
        paint3.setTypeface(this.f147195o);
        Paint paint4 = this.f147187g;
        Intrinsics.checkExpressionValueIsNotNull(paint4, "paintOuterText");
        paint4.setTextSize((float) this.f147191k);
        this.f147188h = new Paint();
        Paint paint5 = this.f147188h;
        Intrinsics.checkExpressionValueIsNotNull(paint5, "paintCenterText");
        paint5.setColor(this.f147197q);
        Paint paint6 = this.f147188h;
        Intrinsics.checkExpressionValueIsNotNull(paint6, "paintCenterText");
        paint6.setAntiAlias(true);
        Paint paint7 = this.f147188h;
        Intrinsics.checkExpressionValueIsNotNull(paint7, "paintCenterText");
        paint7.setTypeface(this.f147195o);
        Paint paint8 = this.f147188h;
        Intrinsics.checkExpressionValueIsNotNull(paint8, "paintCenterText");
        paint8.setTextSize((float) this.f147191k);
        this.f147189i = new Paint();
        Paint paint9 = this.f147189i;
        Intrinsics.checkExpressionValueIsNotNull(paint9, "paintIndicator");
        paint9.setColor(this.f147198r);
        Paint paint10 = this.f147189i;
        Intrinsics.checkExpressionValueIsNotNull(paint10, "paintIndicator");
        paint10.setAntiAlias(true);
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
    }

    public PinSubscribeWheelView(Context context) {
        super(context);
    }

    @Override // com.ss.android.lark.widget.wheelpicker.WheelView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.wheelpicker.WheelView
    /* renamed from: a */
    public void mo177664a(String str) {
        double d;
        double d2;
        Intrinsics.checkParameterIsNotNull(str, "content");
        Rect rect = new Rect();
        this.f147188h.getTextBounds(str, 0, str.length(), rect);
        int i = this.f147178R;
        if (i == 3) {
            this.f147179S = 0;
        } else if (i == 5) {
            this.f147179S = (this.f147164D - rect.width()) - ((int) this.f147181U);
        } else if (i == 17) {
            if (this.f147171K || this.f147174N == null || Intrinsics.areEqual(this.f147174N, "") || !this.f147172L) {
                d2 = (double) (this.f147164D - rect.width());
                d = 0.5d;
            } else {
                d2 = (double) (this.f147164D - rect.width());
                d = 0.25d;
            }
            this.f147179S = (int) (d2 * d);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.wheelpicker.WheelView
    /* renamed from: b */
    public void mo177665b(String str) {
        double d;
        double d2;
        Intrinsics.checkParameterIsNotNull(str, "content");
        Rect rect = new Rect();
        this.f147188h.getTextBounds(str, 0, str.length(), rect);
        int i = this.f147178R;
        if (i == 3) {
            this.f147180T = 0;
        } else if (i == 5) {
            this.f147180T = (this.f147164D - rect.width()) - ((int) this.f147181U);
        } else if (i == 17) {
            if (this.f147171K || this.f147174N == null || Intrinsics.areEqual(this.f147174N, "") || !this.f147172L) {
                d2 = (double) (this.f147164D - rect.width());
                d = 0.5d;
            } else {
                d2 = (double) (this.f147164D - rect.width());
                d = 0.25d;
            }
            this.f147180T = (int) (d2 * d);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.wheelpicker.WheelView
    public void onDraw(Canvas canvas) {
        Object[] objArr;
        String str;
        int i;
        int i2;
        float f;
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (this.f147190j != null) {
            if (this.f147205y < 0) {
                this.f147205y = 0;
            }
            int i3 = this.f147205y;
            AbstractC59265j jVar = this.f147190j;
            Intrinsics.checkExpressionValueIsNotNull(jVar, "adapter");
            if (i3 >= jVar.mo156880a()) {
                AbstractC59265j jVar2 = this.f147190j;
                Intrinsics.checkExpressionValueIsNotNull(jVar2, "adapter");
                this.f147205y = jVar2.mo156880a() - 1;
            }
            Object[] objArr2 = new Object[this.f147162B];
            this.f147161A = (int) (this.f147204x / this.f147194n);
            try {
                int i4 = this.f147205y;
                int i5 = this.f147161A;
                AbstractC59265j jVar3 = this.f147190j;
                Intrinsics.checkExpressionValueIsNotNull(jVar3, "adapter");
                this.f147206z = i4 + (i5 % jVar3.mo156880a());
            } catch (ArithmeticException unused) {
                Log.m165383e(this.f128497a, "error！adapter.getItemsCount() == 0，datas are not the same");
            }
            if (!this.f147200t) {
                if (this.f147206z < 0) {
                    this.f147206z = 0;
                }
                int i6 = this.f147206z;
                AbstractC59265j jVar4 = this.f147190j;
                Intrinsics.checkExpressionValueIsNotNull(jVar4, "adapter");
                if (i6 > jVar4.mo156880a() - 1) {
                    AbstractC59265j jVar5 = this.f147190j;
                    Intrinsics.checkExpressionValueIsNotNull(jVar5, "adapter");
                    this.f147206z = jVar5.mo156880a() - 1;
                }
            } else {
                if (this.f147206z < 0) {
                    AbstractC59265j jVar6 = this.f147190j;
                    Intrinsics.checkExpressionValueIsNotNull(jVar6, "adapter");
                    this.f147206z = jVar6.mo156880a() + this.f147206z;
                }
                int i7 = this.f147206z;
                AbstractC59265j jVar7 = this.f147190j;
                Intrinsics.checkExpressionValueIsNotNull(jVar7, "adapter");
                if (i7 > jVar7.mo156880a() - 1) {
                    int i8 = this.f147206z;
                    AbstractC59265j jVar8 = this.f147190j;
                    Intrinsics.checkExpressionValueIsNotNull(jVar8, "adapter");
                    this.f147206z = i8 - jVar8.mo156880a();
                }
            }
            float f2 = this.f147204x % this.f147194n;
            for (int i9 = 0; i9 < this.f147162B; i9++) {
                int i10 = this.f147206z - ((this.f147162B / 2) - i9);
                if (this.f147200t) {
                    objArr2[i9] = this.f147190j.mo156885b(mo201486c(i10));
                } else if (i10 < 0) {
                    objArr2[i9] = null;
                } else {
                    AbstractC59265j jVar9 = this.f147190j;
                    Intrinsics.checkExpressionValueIsNotNull(jVar9, "adapter");
                    if (i10 > jVar9.mo156880a() - 1) {
                        objArr2[i9] = null;
                    } else {
                        objArr2[i9] = this.f147190j.mo156885b(i10);
                    }
                }
            }
            if (this.f147169I == WheelView.DividerType.WRAP) {
                if (TextUtils.isEmpty(this.f147174N)) {
                    i2 = (this.f147164D - this.f147192l) / 2;
                } else {
                    i2 = (this.f147164D - this.f147192l) / 4;
                }
                float f3 = (float) (i2 - 12);
                if (f3 <= ((float) 0)) {
                    f = 10.0f;
                } else {
                    f = f3;
                }
                float f4 = ((float) this.f147164D) - f;
                canvas.drawLine(f, this.f147201u, f4, this.f147201u, this.f147189i);
                canvas.drawLine(f, this.f147202v, f4, this.f147202v, this.f147189i);
            } else if (this.f147169I == WheelView.DividerType.FILL) {
                canvas.drawLine(BitmapDescriptorFactory.HUE_RED, this.f147201u, (float) this.f147164D, this.f147201u, this.f147189i);
                canvas.drawLine(BitmapDescriptorFactory.HUE_RED, this.f147202v, (float) this.f147164D, this.f147202v, this.f147189i);
            }
            if (!TextUtils.isEmpty(this.f147174N) && this.f147172L) {
                canvas.drawText(this.f147174N, ((float) (this.f147164D - mo201481a(this.f147188h, this.f147174N))) - this.f147181U, this.f147203w, this.f147188h);
            }
            int i11 = 0;
            while (i11 < this.f147162B) {
                canvas.save();
                double d = (double) (((this.f147194n * ((float) i11)) - f2) / ((float) this.f147166F));
                float f5 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
                if (f5 >= 90.0f || f5 <= -90.0f) {
                    objArr = objArr2;
                    canvas.restore();
                } else {
                    float pow = (float) Math.pow((double) (Math.abs(f5) / 90.0f), 2.2d);
                    if (this.f147172L || TextUtils.isEmpty(this.f147174N) || TextUtils.isEmpty(mo201482a(objArr2[i11]))) {
                        str = mo201482a(objArr2[i11]);
                        Intrinsics.checkExpressionValueIsNotNull(str, "getContentText(visibles[counter])");
                    } else {
                        str = mo201482a(objArr2[i11]) + this.f147174N;
                    }
                    mo201487c(str);
                    mo177664a(str);
                    mo177665b(str);
                    objArr = objArr2;
                    float cos = (float) (((((double) this.f147166F) - (Math.cos(d) * ((double) this.f147166F))) - ((Math.sin(d) * ((double) this.f147193m)) / 2.0d)) + ((Math.sin(d) - ((double) 1)) * ((double) this.f147193m)));
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, cos);
                    if (cos <= this.f147201u && ((float) this.f147193m) + cos >= this.f147201u) {
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f147164D, this.f147201u - cos);
                        Paint paint = this.f147187g;
                        Intrinsics.checkExpressionValueIsNotNull(paint, "paintOuterText");
                        paint.setAlpha((int) ((((float) 1) - pow) * ((float) 255)));
                        canvas.drawText(str, (float) this.f147180T, (float) this.f147193m, this.f147187g);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, this.f147201u - cos, (float) this.f147164D, (float) ((int) this.f147194n));
                        canvas.drawText(str, (float) this.f147179S, ((float) this.f147193m) - this.f147181U, this.f147188h);
                        canvas.restore();
                    } else if (cos <= this.f147202v && ((float) this.f147193m) + cos >= this.f147202v) {
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f147164D, this.f147202v - cos);
                        canvas.drawText(str, (float) this.f147179S, ((float) this.f147193m) - this.f147181U, this.f147188h);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, this.f147202v - cos, (float) this.f147164D, (float) ((int) this.f147194n));
                        Paint paint2 = this.f147187g;
                        Intrinsics.checkExpressionValueIsNotNull(paint2, "paintOuterText");
                        paint2.setAlpha((int) ((((float) 1) - pow) * ((float) 255)));
                        canvas.drawText(str, (float) this.f147180T, (float) this.f147193m, this.f147187g);
                        canvas.restore();
                    } else if (cos < this.f147201u || ((float) this.f147193m) + cos > this.f147202v) {
                        canvas.save();
                        canvas.clipRect(0, 0, this.f147164D, (int) this.f147194n);
                        Paint paint3 = this.f147187g;
                        Intrinsics.checkExpressionValueIsNotNull(paint3, "paintOuterText");
                        int i12 = this.f128496W;
                        int i13 = -1;
                        if (i12 == 0) {
                            i = 0;
                        } else if (i12 > 0) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        float f6 = (float) i;
                        if (f5 <= ((float) 0)) {
                            i13 = 1;
                        }
                        paint3.setTextSkewX(f6 * ((float) i13) * 0.5f * pow);
                        Paint paint4 = this.f147187g;
                        Intrinsics.checkExpressionValueIsNotNull(paint4, "paintOuterText");
                        paint4.setAlpha((int) ((((float) 1) - pow) * ((float) 255)));
                        canvas.drawText(str, ((float) this.f147180T) + (((float) this.f128496W) * pow), (float) this.f147193m, this.f147187g);
                        canvas.restore();
                        canvas.restore();
                        Paint paint5 = this.f147188h;
                        Intrinsics.checkExpressionValueIsNotNull(paint5, "paintCenterText");
                        paint5.setTextSize((float) this.f147191k);
                    } else {
                        canvas.scale(1.0f, 1.176f);
                        canvas.drawText(str, (float) this.f147179S, (((float) this.f147193m) * 0.916f) - this.f147181U, this.f147188h);
                        this.f147175O = this.f147190j.mo156882a(objArr[i11]);
                    }
                    canvas.restore();
                    Paint paint52 = this.f147188h;
                    Intrinsics.checkExpressionValueIsNotNull(paint52, "paintCenterText");
                    paint52.setTextSize((float) this.f147191k);
                }
                i11++;
                objArr2 = objArr;
            }
        }
    }

    public PinSubscribeWheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
