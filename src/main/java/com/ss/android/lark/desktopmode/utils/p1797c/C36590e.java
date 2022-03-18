package com.ss.android.lark.desktopmode.utils.p1797c;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import com.ss.android.lark.log.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.ss.android.lark.desktopmode.utils.c.e */
public class C36590e implements AbstractC36588c {
    @Override // com.ss.android.lark.desktopmode.utils.p1797c.AbstractC36588c
    /* renamed from: a */
    public int[] mo134974a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: b */
    private Rect m144342b(View view) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        Rect rect = new Rect();
        Class<?> cls = Class.forName("smartisanos.api.ViewSmt");
        Object invoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        cls.getDeclaredMethod("getRealBoundsOnScreen", View.class, Rect.class).invoke(invoke, view, rect);
        return rect;
    }

    @Override // com.ss.android.lark.desktopmode.utils.p1797c.AbstractC36588c
    /* renamed from: a */
    public Rect mo134973a(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        Rect rect = new Rect();
        try {
            Class.forName("android.view.View").getDeclaredMethod("getRealBoundsOnScreen", Rect.class).invoke(decorView, rect);
            return rect;
        } catch (NoSuchMethodException e) {
            try {
                return m144342b(decorView);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                Log.m165383e("TNTDesktopWindowMeasure", "get activity coordination fail: " + e.getMessage());
                return rect;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InvocationTargetException e2) {
            Log.m165383e("TNTDesktopWindowMeasure", "get activity coordination fail: " + e2.getMessage());
            return rect;
        }
    }

    @Override // com.ss.android.lark.desktopmode.utils.p1797c.AbstractC36588c
    /* renamed from: b */
    public int[] mo134975b(Activity activity) {
        Display defaultDisplay;
        Display.Mode mode;
        int[] iArr = new int[2];
        if (!(Build.VERSION.SDK_INT < 24 || (defaultDisplay = activity.getWindowManager().getDefaultDisplay()) == null || (mode = defaultDisplay.getMode()) == null)) {
            Log.m165379d("TNTDesktopWindowMeasure", "w=" + mode.getPhysicalWidth() + ", h=" + mode.getPhysicalHeight());
            iArr[0] = mode.getPhysicalWidth();
            iArr[1] = mode.getPhysicalHeight();
        }
        return iArr;
    }
}
