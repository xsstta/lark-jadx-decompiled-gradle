package com.larksuite.framework.ui.dragger;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* renamed from: com.larksuite.framework.ui.dragger.a */
class C26200a {
    /* renamed from: a */
    public static Rect m94770a(View view, View view2) {
        Point point = new Point();
        m94769a(view, view2, point);
        return new Rect(point.x, point.y, point.x + view.getWidth(), point.y + view.getHeight());
    }

    /* renamed from: a */
    public static float m94769a(View view, View view2, Point point) {
        ArrayList arrayList = new ArrayList();
        float[] fArr = {(float) point.x, (float) point.y};
        View view3 = view;
        while (view3 != view2 && view3 != null) {
            arrayList.add(view3);
            view3 = (View) view3.getParent();
        }
        arrayList.add(view2);
        float f = 1.0f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view4 = (View) arrayList.get(i);
            if (view4 != null) {
                if (view4 != view) {
                    fArr[0] = fArr[0] - ((float) view4.getScrollX());
                    fArr[1] = fArr[1] - ((float) view4.getScrollY());
                }
                Matrix matrix = view4.getMatrix();
                if (matrix != null) {
                    matrix.mapPoints(fArr);
                }
                fArr[0] = fArr[0] + ((float) view4.getLeft());
                fArr[1] = fArr[1] + ((float) view4.getTop());
                f *= view4.getScaleX();
            }
        }
        point.x = Math.round(fArr[0]);
        point.y = Math.round(fArr[1]);
        return f;
    }

    /* renamed from: b */
    public static float m94771b(View view, View view2, Point point) {
        View view3;
        ArrayList arrayList = new ArrayList();
        float[] fArr = {(float) point.x, (float) point.y};
        while (view != view2) {
            arrayList.add(view);
            view = (View) view.getParent();
        }
        arrayList.add(view2);
        float f = 1.0f;
        Matrix matrix = new Matrix();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            View view4 = (View) arrayList.get(size);
            if (size > 0) {
                view3 = (View) arrayList.get(size - 1);
            } else {
                view3 = null;
            }
            fArr[0] = fArr[0] + ((float) view4.getScrollX());
            fArr[1] = fArr[1] + ((float) view4.getScrollY());
            if (view3 != null) {
                fArr[0] = fArr[0] - ((float) view3.getLeft());
                fArr[1] = fArr[1] - ((float) view3.getTop());
                view3.getMatrix().invert(matrix);
                matrix.mapPoints(fArr);
                f *= view3.getScaleX();
            }
        }
        point.x = Math.round(fArr[0]);
        point.y = Math.round(fArr[1]);
        return f;
    }
}
