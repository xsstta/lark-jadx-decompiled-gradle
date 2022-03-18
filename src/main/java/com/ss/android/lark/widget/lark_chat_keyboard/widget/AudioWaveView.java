package com.ss.android.lark.widget.lark_chat_keyboard.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.utils.UIHelper;

public class AudioWaveView extends View {

    /* renamed from: a */
    private Paint f144019a = new Paint(1);

    /* renamed from: b */
    private Paint f144020b = new Paint(1);

    /* renamed from: c */
    private int f144021c = Color.rgb(255, 255, 255);

    /* renamed from: d */
    private int f144022d = Color.argb(51, 255, 255, 255);

    /* renamed from: e */
    private float f144023e = ((float) UIHelper.dp2px(2.0f));

    /* renamed from: f */
    private float f144024f = ((float) UIHelper.dp2px(5.0f));

    /* renamed from: g */
    private float f144025g;

    /* renamed from: h */
    private float f144026h;

    /* renamed from: i */
    private float f144027i;

    /* renamed from: j */
    private float f144028j;

    /* renamed from: k */
    private int f144029k;

    /* renamed from: l */
    private int f144030l;

    /* renamed from: m */
    private byte[] f144031m;

    /* renamed from: n */
    private int f144032n;

    /* renamed from: o */
    private int f144033o;

    public int getProgress() {
        return this.f144032n;
    }

    public byte[] getWaveformBytes() {
        return this.f144031m;
    }

    public void setProgress(int i) {
        this.f144032n = i;
        invalidate();
    }

    public void setWaveformBytes(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            this.f144031m = new byte[64];
        } else {
            this.f144031m = bArr;
        }
        invalidate();
    }

    public AudioWaveView(Context context) {
        super(context);
        float dp2px = (float) UIHelper.dp2px(22.0f);
        this.f144025g = dp2px;
        this.f144026h = (dp2px - this.f144024f) / 2.0f;
        this.f144027i = (float) UIHelper.dp2px(2.0f);
        this.f144028j = (float) UIHelper.dp2px(4.0f);
        this.f144033o = 100;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        byte[] bArr = this.f144031m;
        if (bArr != null && (i = this.f144029k) != 0) {
            float f = ((float) i) / (this.f144023e + this.f144028j);
            if (f > 0.1f) {
                int i4 = 5;
                int length = (bArr.length * 8) / 5;
                float f2 = ((float) length) / f;
                float f3 = BitmapDescriptorFactory.HUE_RED;
                this.f144019a.setColor(this.f144022d);
                this.f144020b.setColor(this.f144021c);
                int i5 = 2;
                int i6 = this.f144030l / 2;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i7 < length) {
                    if (i7 != i8) {
                        i2 = length;
                    } else {
                        int i10 = i8;
                        int i11 = 0;
                        while (i8 == i10) {
                            f3 += f2;
                            i10 = (int) f3;
                            i11++;
                        }
                        int i12 = i7 * 5;
                        int i13 = i12 / 8;
                        int i14 = i12 - (i13 * 8);
                        int i15 = 8 - i14;
                        int i16 = 5 - i15;
                        byte min = (byte) ((this.f144031m[i13] >> i14) & ((i5 << (Math.min(i4, i15) - 1)) - 1));
                        if (i16 > 0) {
                            int i17 = i13 + 1;
                            byte[] bArr2 = this.f144031m;
                            if (i17 < bArr2.length) {
                                min = (byte) (((byte) (min << i16)) | (bArr2[i17] & ((i5 << (i16 - 1)) - 1)));
                            }
                        }
                        float f4 = ((float) this.f144029k) * ((((float) this.f144032n) * 1.0f) / ((float) this.f144033o));
                        int i18 = 0;
                        while (i18 < i11) {
                            float f5 = this.f144023e;
                            float f6 = (float) ((int) (((float) i9) * (this.f144028j + f5)));
                            int i19 = (f6 > f4 ? 1 : (f6 == f4 ? 0 : -1));
                            if (i19 > 0 || f5 + f6 > f4) {
                                i3 = length;
                                float f7 = (float) i6;
                                float f8 = (float) min;
                                float max = f7 - Math.max(this.f144024f / 2.0f, (this.f144026h * f8) / 31.0f);
                                float f9 = f6 + this.f144023e;
                                float max2 = f7 + Math.max(this.f144024f / 2.0f, (this.f144026h * f8) / 31.0f);
                                float f10 = this.f144027i;
                                canvas.drawRoundRect(f6, max, f9, max2, f10, f10, this.f144019a);
                                if (i19 <= 0) {
                                    float max3 = f7 - Math.max(this.f144024f / 2.0f, (this.f144026h * f8) / 31.0f);
                                    float max4 = f7 + Math.max(this.f144024f / 2.0f, (this.f144026h * f8) / 31.0f);
                                    float f11 = this.f144027i;
                                    canvas.drawRoundRect(f6, max3, f4, max4, f11, f11, this.f144020b);
                                }
                            } else {
                                float f12 = (float) i6;
                                i3 = length;
                                float f13 = (float) min;
                                float max5 = f12 - Math.max(this.f144024f / 2.0f, (this.f144026h * f13) / 31.0f);
                                float f14 = f6 + this.f144023e;
                                float max6 = f12 + Math.max(this.f144024f / 2.0f, (this.f144026h * f13) / 31.0f);
                                float f15 = this.f144027i;
                                canvas.drawRoundRect(f6, max5, f14, max6, f15, f15, this.f144020b);
                            }
                            i9++;
                            i18++;
                            length = i3;
                        }
                        i2 = length;
                        i8 = i10;
                    }
                    i7++;
                    length = i2;
                    i4 = 5;
                    i5 = 2;
                }
            }
        }
    }

    public AudioWaveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float dp2px = (float) UIHelper.dp2px(22.0f);
        this.f144025g = dp2px;
        this.f144026h = (dp2px - this.f144024f) / 2.0f;
        this.f144027i = (float) UIHelper.dp2px(2.0f);
        this.f144028j = (float) UIHelper.dp2px(4.0f);
        this.f144033o = 100;
    }

    public AudioWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float dp2px = (float) UIHelper.dp2px(22.0f);
        this.f144025g = dp2px;
        this.f144026h = (dp2px - this.f144024f) / 2.0f;
        this.f144027i = (float) UIHelper.dp2px(2.0f);
        this.f144028j = (float) UIHelper.dp2px(4.0f);
        this.f144033o = 100;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f144029k = i;
        this.f144030l = i2;
    }
}
