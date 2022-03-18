package com.lynx.tasm.behavior.ui.background;

import android.graphics.PointF;
import com.lynx.tasm.base.LLog;
import java.util.List;

public class BackgroundRadialGradientLayer extends AbstractC26751a {

    /* renamed from: g */
    private ExtentKeyword f66322g = ExtentKeyword.FarthestCorner;

    /* renamed from: h */
    private PointF f66323h;

    public enum ExtentKeyword {
        FarthestCorner,
        ClosestCorner,
        FarthestSide,
        ClosestSide
    }

    /* renamed from: com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer$1 */
    static /* synthetic */ class C267501 {

        /* renamed from: a */
        static final /* synthetic */ int[] f66324a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer$ExtentKeyword[] r0 = com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer.ExtentKeyword.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer.C267501.f66324a = r0
                com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer$ExtentKeyword r1 = com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer.ExtentKeyword.ClosestSide     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer.C267501.f66324a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer$ExtentKeyword r1 = com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer.ExtentKeyword.ClosestCorner     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer.C267501.f66324a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer$ExtentKeyword r1 = com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer.ExtentKeyword.FarthestSide     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer.C267501.f66324a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer$ExtentKeyword r1 = com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer.ExtentKeyword.FarthestCorner     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer.C267501.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo95156a(ExtentKeyword extentKeyword) {
        this.f66322g = extentKeyword;
    }

    public BackgroundRadialGradientLayer(List<String> list) {
        int i;
        float f;
        float f2 = 0.5f;
        this.f66323h = new PointF(0.5f, 0.5f);
        if (list == null || list.size() < 2) {
            LLog.m96429e("lynx", "Error params for BackgroundLinearGradientLayer's constructor.");
            return;
        }
        String[] split = list.get(0).split(" ");
        String str = split[0];
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1682973049:
                if (str.equals("farthest-corner")) {
                    c = 0;
                    break;
                }
                break;
            case -1252676087:
                if (str.equals("farthest-side")) {
                    c = 1;
                    break;
                }
                break;
            case -659963829:
                if (str.equals("closest-side")) {
                    c = 2;
                    break;
                }
                break;
            case 977823817:
                if (str.equals("closest-corner")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                mo95156a(ExtentKeyword.FarthestCorner);
                i = 1;
                break;
            case 1:
                mo95156a(ExtentKeyword.FarthestSide);
                i = 1;
                break;
            case 2:
                mo95156a(ExtentKeyword.ClosestSide);
                i = 1;
                break;
            case 3:
                mo95156a(ExtentKeyword.ClosestCorner);
                i = 1;
                break;
            default:
                mo95156a(ExtentKeyword.FarthestCorner);
                i = 0;
                break;
        }
        if (i == 1 && split.length >= 3 && split[1].equals("at")) {
            if (split[2].endsWith("%")) {
                f = Float.valueOf(split[2].substring(0, split[2].length() - 1)).floatValue() / 100.0f;
            } else {
                f = Float.valueOf(split[2]).floatValue();
            }
            if (split.length >= 4) {
                if (split[3].endsWith("%")) {
                    f2 = Float.valueOf(split[3].substring(0, split[3].length() - 1)).floatValue() / 100.0f;
                } else {
                    f2 = Float.valueOf(split[3]).floatValue();
                }
            }
            this.f66323h = new PointF(f, f2);
        }
        mo95158a(list, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setBounds(android.graphics.Rect r10) {
        /*
        // Method dump skipped, instructions count: 343
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer.setBounds(android.graphics.Rect):void");
    }
}
