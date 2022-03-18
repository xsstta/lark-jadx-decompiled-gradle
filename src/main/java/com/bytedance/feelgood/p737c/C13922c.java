package com.bytedance.feelgood.p737c;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.feelgood.c.c */
public class C13922c {

    /* renamed from: a */
    private View f36399a;

    /* renamed from: b */
    private int f36400b;

    /* renamed from: c */
    private FrameLayout.LayoutParams f36401c = ((FrameLayout.LayoutParams) this.f36399a.getLayoutParams());

    /* renamed from: d */
    private final int f36402d;

    /* renamed from: e */
    private Window f36403e;

    /* renamed from: a */
    private boolean m56362a(int i, int i2) {
        return (i & i2) == Integer.MIN_VALUE;
    }

    /* renamed from: b */
    private int m56363b() {
        Rect rect = new Rect();
        this.f36399a.getWindowVisibleDisplayFrame(rect);
        return rect.bottom - rect.top;
    }

    /* renamed from: a */
    public void mo51268a() {
        Window window;
        if ((this.f36399a.getContext() instanceof Activity) && (window = this.f36403e) != null && m56362a(window.getAttributes().flags, Integer.MIN_VALUE)) {
            int b = m56363b();
            int height = this.f36399a.getRootView().getHeight();
            m56360a(this.f36399a.getContext());
            if (height - b > height / 4) {
                this.f36401c.height = b;
            } else {
                this.f36401c.height = -1;
            }
            this.f36399a.requestLayout();
            this.f36400b = b;
        }
    }

    /* renamed from: a */
    public static int m56360a(Context context) {
        float f;
        try {
            int identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize) {
                    return dimensionPixelSize2;
                }
                float f2 = (((float) dimensionPixelSize) * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density;
                if (f2 >= BitmapDescriptorFactory.HUE_RED) {
                    f = f2 + 0.5f;
                } else {
                    f = f2 - 0.5f;
                }
                return (int) f;
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    /* renamed from: a */
    public static void m56361a(View view, Window window) {
        new C13922c(view, window);
    }

    private C13922c(View view, Window window) {
        this.f36402d = m56360a((Activity) view.getContext());
        this.f36399a = view;
        this.f36403e = window;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.bytedance.feelgood.p737c.C13922c.ViewTreeObserver$OnGlobalLayoutListenerC139231 */

            public void onGlobalLayout() {
                C13922c.this.mo51268a();
            }
        });
    }
}
