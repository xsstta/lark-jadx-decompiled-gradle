package com.ss.android.lark.p1830f;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import com.by.inflate_lib.p099a.C2600a;
import com.larksuite.framework.utils.UIUtils;

/* renamed from: com.ss.android.lark.f.d */
public class C37039d {
    /* renamed from: a */
    public static float m146113a(C2600a aVar) throws IllegalArgumentException {
        if (aVar instanceof C2600a.C2602b) {
            return Float.parseFloat(aVar.f8294a);
        }
        throw new IllegalArgumentException("Unsupported ParamsType: " + aVar.f8294a);
    }

    /* renamed from: b */
    public static boolean m146118b(C2600a aVar) throws IllegalArgumentException {
        if (aVar instanceof C2600a.C2602b) {
            return Boolean.parseBoolean(aVar.f8294a);
        }
        throw new IllegalArgumentException("Unsupported ParamsType: " + aVar.f8294a);
    }

    /* renamed from: a */
    public static int m146114a(Context context, C2600a aVar) throws IllegalArgumentException {
        if ((aVar instanceof C2600a.C2601a) && ((C2600a.C2601a) aVar).f8295b.equals("color")) {
            return UIUtils.getColor(context, Integer.parseInt(aVar.f8294a));
        }
        throw new IllegalArgumentException("Unsupported ParamsType: " + aVar.f8294a);
    }

    /* renamed from: b */
    public static float m146117b(Context context, C2600a aVar) throws IllegalArgumentException {
        if ((aVar instanceof C2600a.C2601a) && ((C2600a.C2601a) aVar).f8295b.equals("dimen")) {
            return context.getResources().getDimension(Integer.parseInt(aVar.f8294a));
        }
        if (aVar instanceof C2600a.C2603c) {
            C2600a.C2603c cVar = (C2600a.C2603c) aVar;
            String str = cVar.f8296b;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case 3212:
                    if (str.equals("dp")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3592:
                    if (str.equals("px")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3677:
                    if (str.equals("sp")) {
                        c = 2;
                        break;
                    }
                    break;
                case 99467:
                    if (str.equals("dip")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 3:
                    return TypedValue.applyDimension(1, Float.parseFloat(aVar.f8294a), context.getResources().getDisplayMetrics());
                case 1:
                    return TypedValue.applyDimension(0, Float.parseFloat(aVar.f8294a), context.getResources().getDisplayMetrics());
                case 2:
                    return TypedValue.applyDimension(2, Float.parseFloat(aVar.f8294a), context.getResources().getDisplayMetrics());
                default:
                    throw new IllegalArgumentException("unknown dimen type: " + cVar.f8296b);
            }
        } else {
            throw new IllegalArgumentException("Unsupported ParamsType: " + aVar.f8294a);
        }
    }

    /* renamed from: a */
    private static Drawable m146115a(int i, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) i2);
        gradientDrawable.setColor(i);
        if (i4 > 0) {
            gradientDrawable.setStroke(i4, i3);
        }
        return gradientDrawable;
    }

    /* renamed from: a */
    public static StateListDrawable m146116a(int i, int i2, int i3, int i4, int i5, int i6) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, m146115a(i2, i4, i5, i6));
        stateListDrawable.addState(new int[]{-16842910}, m146115a(i3, i4, i5, i6));
        stateListDrawable.addState(new int[0], m146115a(i, i4, i5, i6));
        return stateListDrawable;
    }
}
