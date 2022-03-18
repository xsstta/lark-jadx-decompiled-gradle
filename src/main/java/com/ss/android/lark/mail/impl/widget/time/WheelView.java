package com.ss.android.lark.mail.impl.widget.time;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.wheelpicker.C59264i;
import com.ss.android.lark.widget.wheelpicker.WheelView;
import java.util.concurrent.TimeUnit;

public class WheelView extends com.ss.android.lark.widget.wheelpicker.WheelView {

    /* renamed from: W */
    private float f111881W = 2.5f;

    /* renamed from: a */
    protected int f111882a;
    private int aa;
    private float ab;
    private int ac = UIHelper.getColor(R.color.text_disable);
    private int ad = 0;

    /* renamed from: b */
    public AbstractC44098k f111883b;

    public void invalidate() {
        super.invalidate();
        if (this.f111882a != this.f147175O) {
            this.f111882a = this.f147175O;
            AbstractC44098k kVar = this.f111883b;
            if (kVar != null) {
                kVar.mo156874a(this.f147175O);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.wheelpicker.WheelView
    /* renamed from: b */
    public void mo156843b() {
        if (this.f147199s < 1.0f) {
            this.f147199s = 1.0f;
        } else if (this.f147199s > 4.0f) {
            this.f147199s = 4.0f;
        } else if (this.f147199s == 1.6f) {
            this.f147199s = 2.5f;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.wheelpicker.WheelView
    /* renamed from: a */
    public void mo156841a() {
        String str;
        this.f147188h.setTextScaleX(1.176f);
        this.f147188h.setTextSize(((float) this.f147191k) * 1.176f);
        Rect rect = new Rect();
        if (this.f147190j instanceof AbstractC44097j) {
            str = ((AbstractC44097j) this.f147190j).aQ_();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            this.f147188h.getTextBounds(str, 0, str.length(), rect);
            this.f147192l = rect.width();
        } else {
            int a = this.f147190j.mo156880a();
            if (a > 1) {
                for (int i = 1; i < 3; i++) {
                    m174576a(rect, (a - 1) * (i / 2));
                }
            } else if (a > 0) {
                m174576a(rect, 0);
            }
        }
        this.f147188h.getTextBounds("星期", 0, 2, rect);
        this.f147193m = rect.height() + 2;
        this.f147194n = this.f147199s * ((float) this.f147193m);
    }

    /* renamed from: a */
    public void mo156842a(int i) {
        this.ad = i;
    }

    public void setDividerWidth(float f) {
        this.ab = f;
    }

    public void setTextXOffset(int i) {
        this.aa = i;
        if (i != 0) {
            this.f147188h.setTextScaleX(1.0f);
        }
    }

    public WheelView(Context context) {
        super(context);
    }

    @Override // com.ss.android.lark.widget.wheelpicker.WheelView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.f111883b.mo156873a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public void mo156844b(int i) {
        int i2;
        if (i != 0) {
            mo201488d();
            if (isShown()) {
                this.f147176P = (int) (((float) i) * this.f147194n);
                int i3 = (int) (((this.f147204x % this.f147194n) + this.f147194n) % this.f147194n);
                float f = (float) i3;
                if (f > this.f147194n / 2.0f) {
                    i2 = (int) (this.f147194n - f);
                } else {
                    i2 = -i3;
                }
                this.f147173M = this.f147186f.scheduleWithFixedDelay(new C59264i(this, this.f147176P + i2), 0, 10, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: a */
    private int m174575a(Object[] objArr) {
        float f = this.f147204x % this.f147194n;
        for (int i = 0; i < this.f147162B; i++) {
            double d = (double) (((this.f147194n * ((float) i)) - f) / ((float) this.f147166F));
            float f2 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
            if (f2 < 90.0f && f2 > -90.0f) {
                float cos = (float) (((((double) this.f147166F) - (Math.cos(d) * ((double) this.f147166F))) - ((Math.sin(d) * ((double) this.f147193m)) / 2.0d)) + ((Math.sin(d) - 1.0d) * ((double) this.f147193m)));
                if (cos > this.f147201u || ((float) this.f147193m) + cos < this.f147201u) {
                    if (cos > this.f147202v || ((float) this.f147193m) + cos < this.f147202v) {
                        if (cos >= this.f147201u && ((float) this.f147193m) + cos <= this.f147202v) {
                            return i;
                        }
                    } else if (this.f147202v - cos > (cos + ((float) this.f147193m)) - this.f147202v) {
                        return i;
                    }
                } else if (this.f147201u - cos < (cos + ((float) this.f147193m)) - this.f147201u) {
                    return i;
                }
            }
        }
        return objArr.length / 2;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.wheelpicker.WheelView
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        float f;
        float f2;
        if (this.f147190j != null) {
            float f3 = ((float) ((int) (this.f147204x / this.f147194n))) * this.f147194n;
            float f4 = this.f147204x % this.f147194n;
            if (Math.abs(f4) < this.f111881W) {
                this.f147204x = f3;
            } else if (this.f147194n - Math.abs(f4) < this.f111881W) {
                if (this.f147204x > BitmapDescriptorFactory.HUE_RED) {
                    f2 = this.f147194n;
                } else {
                    f2 = -this.f147194n;
                }
                this.f147204x = f3 + f2;
            }
            if (this.f147205y < 0) {
                this.f147205y = 0;
            }
            if (this.f147205y >= this.f147190j.mo156880a()) {
                this.f147205y = this.f147190j.mo156880a() - 1;
            }
            Object[] objArr = this.f147182V;
            this.f147161A = (int) (this.f147204x / this.f147194n);
            try {
                this.f147206z = this.f147205y + (this.f147161A % this.f147190j.mo156880a());
            } catch (ArithmeticException e) {
                Log.m165384e("WheelView", "adapter.getItemsCount() == 0: ", e);
            }
            if (!this.f147200t) {
                if (this.f147206z < 0) {
                    this.f147206z = 0;
                }
                if (this.f147206z > this.f147190j.mo156880a() - 1) {
                    this.f147206z = this.f147190j.mo156880a() - 1;
                }
            } else {
                if (this.f147206z < 0) {
                    this.f147206z += this.f147190j.mo156880a();
                }
                if (this.f147206z > this.f147190j.mo156880a() - 1) {
                    this.f147206z -= this.f147190j.mo156880a();
                }
            }
            float f5 = this.f147204x % this.f147194n;
            for (int i3 = 0; i3 < this.f147162B; i3++) {
                int i4 = this.f147206z - ((this.f147162B / 2) - i3);
                if (this.f147200t) {
                    objArr[i3] = this.f147190j.mo156885b(mo201486c(i4));
                } else if (i4 < 0) {
                    objArr[i3] = "";
                } else if (i4 > this.f147190j.mo156880a() - 1) {
                    objArr[i3] = "";
                } else {
                    objArr[i3] = this.f147190j.mo156885b(i4);
                }
            }
            float strokeWidth = this.f147189i.getStrokeWidth();
            int color = this.f147189i.getColor();
            if (this.ab > BitmapDescriptorFactory.HUE_RED) {
                this.f147189i.setStrokeWidth(this.ab);
            }
            this.f147189i.setColor(UIHelper.getColor(R.color.line_border_card));
            if (this.f147169I == WheelView.DividerType.WRAP) {
                if (TextUtils.isEmpty(this.f147174N)) {
                    i2 = (this.f147164D - this.f147192l) / 2;
                } else {
                    i2 = (this.f147164D - this.f147192l) / 4;
                }
                float f6 = (float) (i2 - 12);
                if (f6 <= BitmapDescriptorFactory.HUE_RED) {
                    f = 10.0f;
                } else {
                    f = f6;
                }
                float f7 = ((float) this.f147164D) - f;
                canvas.drawLine(f, this.f147201u, f7, this.f147201u, this.f147189i);
                canvas.drawLine(f, this.f147202v, f7, this.f147202v, this.f147189i);
            } else if (this.f147169I == WheelView.DividerType.FILL) {
                canvas.drawLine(BitmapDescriptorFactory.HUE_RED, this.f147201u, (float) this.f147164D, this.f147201u, this.f147189i);
                canvas.drawLine(BitmapDescriptorFactory.HUE_RED, this.f147202v, (float) this.f147164D, this.f147202v, this.f147189i);
            }
            this.f147189i.setStrokeWidth(strokeWidth);
            this.f147189i.setColor(color);
            if (!TextUtils.isEmpty(this.f147174N) && this.f147172L) {
                canvas.drawText(this.f147174N, ((float) ((this.f147164D - mo201481a(this.f147188h, this.f147174N)) - 80)) - this.f147181U, this.f147203w, this.f147188h);
            }
            int a = m174575a(objArr);
            for (int i5 = 0; i5 < this.f147162B; i5++) {
                canvas.save();
                double d = (double) (((this.f147194n * ((float) i5)) - f5) / ((float) this.f147166F));
                float f8 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
                if (f8 >= 90.0f || f8 <= -90.0f) {
                    canvas.restore();
                } else {
                    float pow = (float) Math.pow((double) (Math.abs(f8) / 90.0f), 2.2d);
                    String a2 = (this.f147172L || TextUtils.isEmpty(this.f147174N) || TextUtils.isEmpty(mo201482a(objArr[i5]))) ? mo201482a(objArr[i5]) : mo201482a(objArr[i5]) + this.f147174N;
                    mo201487c(a2);
                    mo177664a(a2);
                    mo177665b(a2);
                    float cos = (float) (((((double) this.f147166F) - (Math.cos(d) * ((double) this.f147166F))) - ((Math.sin(d) * ((double) this.f147193m)) / 2.0d)) + ((Math.sin(d) - 1.0d) * ((double) this.f147193m)));
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, cos);
                    if (cos <= this.f147201u && ((float) this.f147193m) + cos >= this.f147201u) {
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f147164D, this.f147201u - cos);
                        if (m174577a(i5, a)) {
                            this.f147187g.setColor(this.ac);
                        } else {
                            this.f147187g.setColor(this.f147196p);
                        }
                        canvas.drawText(a2, (float) this.f147180T, (float) this.f147193m, this.f147187g);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, this.f147201u - cos, (float) this.f147164D, (float) ((int) this.f147194n));
                        if (m174577a(i5, a)) {
                            this.f147188h.setColor(this.ac);
                        } else {
                            this.f147188h.setColor(this.f147197q);
                        }
                        canvas.drawText(a2, (float) this.f147179S, ((float) this.f147193m) - this.f147181U, this.f147188h);
                        canvas.restore();
                        if (this.f147201u - cos < (cos + ((float) this.f147193m)) - this.f147201u) {
                            this.f147175O = this.f147190j.mo156882a(objArr[i5]);
                        }
                    } else if (cos <= this.f147202v && ((float) this.f147193m) + cos >= this.f147202v) {
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f147164D, this.f147202v - cos);
                        if (m174577a(i5, a)) {
                            this.f147188h.setColor(this.ac);
                        } else {
                            this.f147188h.setColor(this.f147197q);
                        }
                        canvas.drawText(a2, (float) this.f147179S, ((float) this.f147193m) - this.f147181U, this.f147188h);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, this.f147202v - cos, (float) this.f147164D, (float) ((int) this.f147194n));
                        canvas.drawText(a2, (float) this.f147180T, (float) this.f147193m, this.f147187g);
                        canvas.restore();
                        if (this.f147202v - cos > (cos + ((float) this.f147193m)) - this.f147202v) {
                            this.f147175O = this.f147190j.mo156882a(objArr[i5]);
                        }
                    } else if (cos < this.f147201u || ((float) this.f147193m) + cos > this.f147202v) {
                        canvas.save();
                        canvas.clipRect(0, 0, this.f147164D, (int) this.f147194n);
                        Paint paint = this.f147187g;
                        int i6 = this.aa;
                        int i7 = -1;
                        if (i6 == 0) {
                            i = 0;
                        } else if (i6 > 0) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        if (f8 <= BitmapDescriptorFactory.HUE_RED) {
                            i7 = 1;
                        }
                        paint.setTextSkewX(((float) (i * i7)) * 0.5f * pow);
                        this.f147187g.setAlpha((int) ((1.0f - pow) * 255.0f));
                        if (m174577a(i5, a)) {
                            this.f147187g.setColor(this.ac);
                        } else {
                            this.f147187g.setColor(this.f147196p);
                        }
                        canvas.drawText(a2, ((float) this.f147180T) + (((float) this.aa) * pow), (float) this.f147193m, this.f147187g);
                        canvas.restore();
                        canvas.restore();
                        this.f147188h.setTextSize((float) this.f147191k);
                    } else {
                        canvas.scale(1.0f, 1.176f);
                        float f9 = (((float) this.f147193m) * 0.916f) - this.f147181U;
                        if (m174577a(i5, a)) {
                            this.f147188h.setColor(this.ac);
                        } else {
                            this.f147188h.setColor(this.f147197q);
                        }
                        canvas.drawText(a2, (float) this.f147179S, f9, this.f147188h);
                        this.f147175O = this.f147190j.mo156882a(objArr[i5]);
                    }
                    canvas.restore();
                    this.f147188h.setTextSize((float) this.f147191k);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m174577a(int i, int i2) {
        if (i - i2 < this.ad) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m174576a(Rect rect, int i) {
        String a = mo201482a(this.f147190j.mo156885b(i));
        this.f147188h.getTextBounds(a, 0, a.length(), rect);
        int width = rect.width();
        if (width > this.f147192l) {
            this.f147192l = width;
        }
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
