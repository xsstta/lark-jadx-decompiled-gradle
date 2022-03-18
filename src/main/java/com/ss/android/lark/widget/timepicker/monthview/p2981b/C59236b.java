package com.ss.android.lark.widget.timepicker.monthview.p2981b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.widget.EdgeEffect;
import androidx.core.widget.C0941d;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.framework.utils.Reflect;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.widget.timepicker.monthview.b.b */
public class C59236b {

    /* renamed from: com.ss.android.lark.widget.timepicker.monthview.b.b$a */
    public static class C59238a extends EdgeEffect {
        public boolean draw(Canvas canvas) {
            return false;
        }

        public void onAbsorb(int i) {
        }

        public void onPull(float f, float f2) {
        }

        public void onRelease() {
        }

        public C59238a(Context context) {
            super(context);
        }
    }

    /* renamed from: a */
    public static void m230066a(ViewPager viewPager) {
        if (C26326z.m95337a()) {
            m230067a(viewPager, "mLeftEdge", new C59238a(viewPager.getContext()));
            m230067a(viewPager, "mRightEdge", new C59238a(viewPager.getContext()));
        }
    }

    /* renamed from: a */
    public static GradientDrawable m230065a(int i, int i2, int i3) {
        C592371 r0 = new GradientDrawable() {
            /* class com.ss.android.lark.widget.timepicker.monthview.p2981b.C59236b.C592371 */

            public int getOpacity() {
                return -3;
            }
        };
        r0.setShape(1);
        r0.setColor(i);
        if (i2 >= 0) {
            r0.setStroke(i2, i3);
        }
        return r0;
    }

    /* renamed from: a */
    private static void m230067a(ViewPager viewPager, String str, EdgeEffect edgeEffect) {
        try {
            Reflect.m94918a(viewPager).mo93334a(str, edgeEffect);
        } catch (Exception e) {
            Log.m165378d(e.toString());
            try {
                Reflect.m94918a((C0941d) Reflect.m94918a(viewPager).mo93335a(str, C0941d.class).mo93337a()).mo93334a("mEdgeEffect", edgeEffect);
            } catch (Exception e2) {
                Log.m165378d(e2.toString());
            }
        }
    }
}
