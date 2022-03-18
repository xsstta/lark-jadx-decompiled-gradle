package com.larksuite.component.ui.p1153e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.larksuite.component.ui.e.d */
public class C25655d {
    /* renamed from: b */
    public static int m91903b(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public static C25654c m91902a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return new C25654c(point.x, point.y);
    }

    /* renamed from: a */
    public static float m91900a(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static int m91904b(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static Drawable m91901a(Context context, int i) {
        if (i == 0) {
            return null;
        }
        return context.getResources().getDrawable(i);
    }
}
