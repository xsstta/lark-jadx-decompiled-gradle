package com.ss.android.vc.common.p3083e;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.vc.common.p3077b.C60700b;

/* renamed from: com.ss.android.vc.common.e.k */
public class C60762k {

    /* renamed from: a */
    public AbstractC60764a f151943a;

    /* renamed from: b */
    public View f151944b;

    /* renamed from: c */
    private final String f151945c = "SoftKeyboardState";

    /* renamed from: d */
    private ViewTreeObserver.OnGlobalLayoutListener f151946d;

    /* renamed from: com.ss.android.vc.common.e.k$a */
    public interface AbstractC60764a {
        void onKeyboardStateChanged(boolean z, int i);
    }

    /* renamed from: a */
    public void mo208368a() {
        View view = this.f151944b;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f151946d);
        }
    }

    /* renamed from: b */
    private void m236100b() {
        if (this.f151946d == null) {
            this.f151946d = new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.ss.android.vc.common.p3083e.C60762k.ViewTreeObserver$OnGlobalLayoutListenerC607631 */

                /* renamed from: b */
                private final Rect f151948b;

                /* renamed from: c */
                private int f151949c;

                /* renamed from: d */
                private int f151950d;

                public void onGlobalLayout() {
                    boolean z;
                    C60762k.this.f151944b.getWindowVisibleDisplayFrame(this.f151948b);
                    int height = this.f151948b.height();
                    int width = this.f151948b.width();
                    int i = height - this.f151949c;
                    C60700b.m235851b("SoftKeyboardState", "[onGlobalLayout]", "called " + height + "  " + this.f151949c);
                    int i2 = this.f151949c;
                    if ((width >= i2 || height <= this.f151950d) && width != this.f151950d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C60700b.m235851b("SoftKeyboardState", "[onGlobalLayout2]", "onOrientation changed, filter!");
                    } else if (i2 != 0) {
                        if (i < -120) {
                            if (C60762k.this.f151943a != null) {
                                C60762k.this.f151943a.onKeyboardStateChanged(true, Math.abs(i));
                            }
                        } else if (i > 120 && C60762k.this.f151943a != null) {
                            C60762k.this.f151943a.onKeyboardStateChanged(false, Math.abs(i));
                        }
                    }
                    this.f151949c = height;
                    this.f151950d = width;
                }

                {
                    Rect rect = new Rect();
                    this.f151948b = rect;
                    this.f151949c = rect.height();
                    this.f151950d = rect.width();
                }
            };
        }
        View view = this.f151944b;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f151946d);
        }
    }

    /* renamed from: a */
    public void mo208369a(AbstractC60764a aVar) {
        this.f151943a = aVar;
    }

    public C60762k(View view) {
        this.f151944b = view;
        m236100b();
    }

    public C60762k(Activity activity) {
        this.f151944b = activity.findViewById(16908290);
        m236100b();
    }
}
