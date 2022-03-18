package com.lynx.tasm.behavior.ui.background;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Shader;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class BackgroundLinearGradientLayer extends AbstractC26751a {

    /* renamed from: g */
    private double f66319g;

    /* renamed from: h */
    private GradientLineDirectionType f66320h;

    public enum GradientLineDirectionType {
        None,
        ToTop,
        ToBottom,
        ToLeft,
        ToRight,
        ToTopRight,
        ToTopLeft,
        ToBottomRight,
        ToBottomLeft,
        Angle
    }

    /* renamed from: com.lynx.tasm.behavior.ui.background.BackgroundLinearGradientLayer$1 */
    static /* synthetic */ class C267491 {

        /* renamed from: a */
        static final /* synthetic */ int[] f66321a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.background.BackgroundLinearGradientLayer.C267491.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo95154a(GradientLineDirectionType gradientLineDirectionType) {
        this.f66320h = gradientLineDirectionType;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        if (r2.equals("to bottom right") == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BackgroundLinearGradientLayer(java.util.List<java.lang.String> r7) {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.background.BackgroundLinearGradientLayer.<init>(java.util.List):void");
    }

    public void setBounds(Rect rect) {
        int[] iArr;
        float[] fArr;
        PointF pointF;
        this.f66327b = Math.max(rect.width(), 1);
        this.f66328c = Math.max(rect.height(), 1);
        Object[] g = mo95161g();
        if (g == null) {
            iArr = this.f66329d;
        } else {
            iArr = (int[]) g[0];
        }
        if (g == null) {
            fArr = this.f66330e;
        } else {
            fArr = (float[]) g[1];
        }
        if (iArr != null) {
            float f = ((((float) this.f66327b) * 2.0f) * ((float) this.f66328c)) / ((float) ((this.f66327b * this.f66327b) + (this.f66328c * this.f66328c)));
            switch (C267491.f66321a[this.f66320h.ordinal()]) {
                case 1:
                    this.f66326a = new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) this.f66328c, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, iArr, fArr, Shader.TileMode.CLAMP);
                    break;
                case 2:
                    this.f66326a = new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) this.f66328c, iArr, fArr, Shader.TileMode.CLAMP);
                    break;
                case 3:
                    this.f66326a = new LinearGradient((float) this.f66327b, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, iArr, fArr, Shader.TileMode.CLAMP);
                    break;
                case 4:
                    this.f66326a = new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) this.f66327b, (float) BitmapDescriptorFactory.HUE_RED, iArr, fArr, Shader.TileMode.CLAMP);
                    break;
                case 5:
                    this.f66326a = new LinearGradient(((float) this.f66327b) - (((float) this.f66328c) * f), ((float) this.f66327b) * f, (float) this.f66327b, (float) BitmapDescriptorFactory.HUE_RED, iArr, fArr, Shader.TileMode.CLAMP);
                    break;
                case 6:
                    this.f66326a = new LinearGradient(((float) this.f66328c) * f, ((float) this.f66327b) * f, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, iArr, fArr, Shader.TileMode.CLAMP);
                    break;
                case 7:
                    this.f66326a = new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, ((float) this.f66328c) * f, ((float) this.f66327b) * f, iArr, fArr, Shader.TileMode.CLAMP);
                    break;
                case 8:
                    this.f66326a = new LinearGradient((float) this.f66327b, (float) BitmapDescriptorFactory.HUE_RED, ((float) this.f66327b) - (((float) this.f66328c) * f), ((float) this.f66327b) * f, iArr, fArr, Shader.TileMode.CLAMP);
                    break;
                case 9:
                    PointF pointF2 = new PointF();
                    PointF pointF3 = new PointF();
                    PointF pointF4 = new PointF((float) (this.f66327b / 2), (float) (this.f66328c / 2));
                    float sin = (float) Math.sin(this.f66319g);
                    float cos = (float) Math.cos(this.f66319g);
                    float tan = (float) Math.tan(this.f66319g);
                    int i = (sin > BitmapDescriptorFactory.HUE_RED ? 1 : (sin == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    if (i >= 0 && cos >= BitmapDescriptorFactory.HUE_RED) {
                        pointF = new PointF((float) this.f66327b, BitmapDescriptorFactory.HUE_RED);
                    } else if (i >= 0 && cos < BitmapDescriptorFactory.HUE_RED) {
                        pointF = new PointF((float) this.f66327b, (float) this.f66328c);
                    } else if (sin >= BitmapDescriptorFactory.HUE_RED || cos >= BitmapDescriptorFactory.HUE_RED) {
                        pointF = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    } else {
                        pointF = new PointF(BitmapDescriptorFactory.HUE_RED, (float) this.f66328c);
                    }
                    float f2 = ((pointF4.y - pointF.y) - (pointF4.x * tan)) + (pointF.x * tan);
                    pointF3.x = pointF4.x + ((sin * f2) / ((sin * tan) + cos));
                    pointF3.y = pointF4.y - (f2 / ((tan * tan) + 1.0f));
                    pointF2.x = (pointF4.x * 2.0f) - pointF3.x;
                    pointF2.y = (pointF4.y * 2.0f) - pointF3.y;
                    this.f66326a = new LinearGradient(pointF2.x, pointF2.y, pointF3.x, pointF3.y, iArr, fArr, Shader.TileMode.CLAMP);
                    break;
                default:
                    this.f66326a = new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, iArr, fArr, Shader.TileMode.CLAMP);
                    break;
            }
        } else {
            this.f66326a = null;
        }
        super.setBounds(rect);
    }
}
