package com.lynx.tasm.behavior.ui.background;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.utils.ColorUtils;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.background.a */
public abstract class AbstractC26751a extends AbstractC26753c {

    /* renamed from: f */
    protected static float f66325f = -2.0f;

    /* renamed from: a */
    protected Shader f66326a;

    /* renamed from: b */
    protected int f66327b;

    /* renamed from: c */
    protected int f66328c;

    /* renamed from: d */
    protected int[] f66329d = null;

    /* renamed from: e */
    protected float[] f66330e = null;

    /* renamed from: g */
    private final Paint f66331g = new Paint(1);

    @Override // com.lynx.tasm.behavior.ui.background.AbstractC26753c
    /* renamed from: a */
    public void mo53843a(int i, int i2) {
    }

    @Override // com.lynx.tasm.behavior.ui.background.AbstractC26753c
    /* renamed from: a */
    public boolean mo53845a() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.background.AbstractC26753c
    /* renamed from: d */
    public void mo53848d() {
    }

    @Override // com.lynx.tasm.behavior.ui.background.AbstractC26753c
    /* renamed from: e */
    public void mo53850e() {
    }

    @Override // com.lynx.tasm.behavior.ui.background.AbstractC26753c
    /* renamed from: b */
    public int mo53846b() {
        return this.f66327b;
    }

    @Override // com.lynx.tasm.behavior.ui.background.AbstractC26753c
    /* renamed from: c */
    public int mo53847c() {
        return this.f66328c;
    }

    /* renamed from: f */
    public Shader mo95160f() {
        return this.f66326a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Object[] mo95161g() {
        float[] fArr;
        int[] iArr = this.f66329d;
        if (iArr == null || (fArr = this.f66330e) == null) {
            return null;
        }
        int length = iArr.length;
        if (fArr[0] < BitmapDescriptorFactory.HUE_RED || fArr[length - 1] > 1.0f) {
            return m97124i();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object[] m97124i() {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.background.AbstractC26751a.m97124i():java.lang.Object[]");
    }

    public void draw(Canvas canvas) {
        if (this.f66326a == null) {
            LLog.m96429e("gradient", "BackgroundGradientLayer.draw() must be called after setBounds()");
        }
        this.f66331g.setShader(this.f66326a);
        if (mo95165h() != null) {
            canvas.drawPath(mo95165h(), this.f66331g);
        } else {
            canvas.drawRect(getBounds(), this.f66331g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95158a(List<String> list, int i) {
        String str;
        float f;
        float[] fArr;
        this.f66329d = null;
        this.f66330e = null;
        int i2 = 0;
        while (i < list.size()) {
            String str2 = list.get(i);
            int indexOf = str2.indexOf(")");
            if (indexOf > 0) {
                str = str2.substring(0, indexOf);
                str2 = str2.substring(indexOf);
            } else {
                str = null;
            }
            String[] split = str2.split(" ");
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(split[0]);
            String sb2 = sb.toString();
            if (ColorUtils.m97897b(sb2)) {
                if (this.f66329d == null) {
                    this.f66329d = new int[(list.size() - i)];
                }
                this.f66329d[i2] = ColorUtils.m97896a(sb2);
                int i3 = i2 + 1;
                if (split.length > 1) {
                    if (split[1].endsWith("%")) {
                        f = Float.valueOf(split[1].substring(0, split[1].length() - 1)).floatValue() / 100.0f;
                    } else {
                        f = Float.valueOf(split[1]).floatValue();
                    }
                    if (this.f66330e == null) {
                        this.f66330e = new float[this.f66329d.length];
                        int i4 = 1;
                        while (true) {
                            fArr = this.f66330e;
                            if (i4 >= fArr.length) {
                                break;
                            }
                            fArr[i4] = f66325f;
                            i4++;
                        }
                        fArr[0] = 0.0f;
                    }
                    this.f66330e[i2] = f;
                    int i5 = 1;
                    while (i5 < i2 && this.f66330e[i5] != f66325f) {
                        i5++;
                    }
                    if (i5 != i2) {
                        float[] fArr2 = this.f66330e;
                        float f2 = fArr2[i5 - 1];
                        float f3 = fArr2[i2];
                        float f4 = (float) ((i2 - i5) + 1);
                        for (int i6 = i5; i6 < i2; i6++) {
                            this.f66330e[i6] = (((f3 - f2) / f4) * ((float) ((i6 - i5) + 1))) + f2;
                        }
                    }
                }
                i2 = i3;
            }
            i++;
        }
        float[] fArr3 = this.f66330e;
        if (fArr3 != null && fArr3[fArr3.length - 1] == f66325f) {
            int length = fArr3.length - 1;
            fArr3[length] = 1.0f;
            int i7 = 1;
            while (i7 < length && this.f66330e[i7] != f66325f) {
                i7++;
            }
            if (i7 != length) {
                float[] fArr4 = this.f66330e;
                float f5 = fArr4[i7 - 1];
                float f6 = fArr4[length];
                float f7 = (float) ((length - i7) + 1);
                for (int i8 = i7; i8 < length; i8++) {
                    this.f66330e[i8] = (((f6 - f5) / f7) * ((float) ((i8 - i7) + 1))) + f5;
                }
            }
        }
    }

    /* renamed from: a */
    private static int m97122a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }

    /* renamed from: b */
    private static int m97123b(int i, int i2, float f) {
        return Color.argb(m97122a(Color.alpha(i), Color.alpha(i2), f), m97122a(Color.red(i), Color.red(i2), f), m97122a(Color.green(i), Color.green(i2), f), m97122a(Color.blue(i), Color.blue(i2), f));
    }
}
