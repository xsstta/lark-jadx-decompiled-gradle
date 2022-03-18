package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.AbstractC0912n;
import androidx.core.view.C0883ab;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.internal.r */
public class C22365r {

    /* renamed from: com.google.android.material.internal.r$a */
    public interface AbstractC22370a {
        /* renamed from: a */
        C0883ab mo76565a(View view, C0883ab abVar, C22371b bVar);
    }

    /* renamed from: com.google.android.material.internal.r$b */
    public static class C22371b {

        /* renamed from: a */
        public int f54798a;

        /* renamed from: b */
        public int f54799b;

        /* renamed from: c */
        public int f54800c;

        /* renamed from: d */
        public int f54801d;

        /* renamed from: a */
        public void mo77877a(View view) {
            ViewCompat.m4058b(view, this.f54798a, this.f54799b, this.f54800c, this.f54801d);
        }

        public C22371b(C22371b bVar) {
            this.f54798a = bVar.f54798a;
            this.f54799b = bVar.f54799b;
            this.f54800c = bVar.f54800c;
            this.f54801d = bVar.f54801d;
        }

        public C22371b(int i, int i2, int i3, int i4) {
            this.f54798a = i;
            this.f54799b = i2;
            this.f54800c = i3;
            this.f54801d = i4;
        }
    }

    /* renamed from: b */
    public static void m81025b(final View view) {
        view.requestFocus();
        view.post(new Runnable() {
            /* class com.google.android.material.internal.C22365r.RunnableC223661 */

            public void run() {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
            }
        });
    }

    /* renamed from: g */
    public static AbstractC22364q m81030g(View view) {
        return m81028e(m81029f(view));
    }

    /* renamed from: a */
    public static boolean m81024a(View view) {
        if (ViewCompat.m4082h(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m81026c(View view) {
        if (ViewCompat.m4015I(view)) {
            ViewCompat.m4108w(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                /* class com.google.android.material.internal.C22365r.View$OnAttachStateChangeListenerC223694 */

                public void onViewDetachedFromWindow(View view) {
                }

                public void onViewAttachedToWindow(View view) {
                    view.removeOnAttachStateChangeListener(this);
                    ViewCompat.m4108w(view);
                }
            });
        }
    }

    /* renamed from: d */
    public static float m81027d(View view) {
        float f = BitmapDescriptorFactory.HUE_RED;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ViewCompat.m4104s((View) parent);
        }
        return f;
    }

    /* renamed from: e */
    public static AbstractC22364q m81028e(View view) {
        if (view == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            return new C22363p(view);
        }
        return C22361o.m81008a(view);
    }

    /* renamed from: f */
    public static ViewGroup m81029f(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* renamed from: a */
    public static float m81020a(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static PorterDuff.Mode m81021a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static void m81023a(View view, final AbstractC22370a aVar) {
        final C22371b bVar = new C22371b(ViewCompat.m4094l(view), view.getPaddingTop(), ViewCompat.m4097m(view), view.getPaddingBottom());
        ViewCompat.m4044a(view, new AbstractC0912n() {
            /* class com.google.android.material.internal.C22365r.C223683 */

            @Override // androidx.core.view.AbstractC0912n
            public C0883ab onApplyWindowInsets(View view, C0883ab abVar) {
                return aVar.mo76565a(view, abVar, new C22371b(bVar));
            }
        });
        m81026c(view);
    }

    /* renamed from: a */
    public static void m81022a(View view, AttributeSet attributeSet, int i, int i2, final AbstractC22370a aVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets}, i, i2);
        final boolean z = obtainStyledAttributes.getBoolean(0, false);
        final boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        final boolean z3 = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        m81023a(view, new AbstractC22370a() {
            /* class com.google.android.material.internal.C22365r.C223672 */

            @Override // com.google.android.material.internal.C22365r.AbstractC22370a
            /* renamed from: a */
            public C0883ab mo76565a(View view, C0883ab abVar, C22371b bVar) {
                if (z) {
                    bVar.f54801d += abVar.mo4647d();
                }
                boolean a = C22365r.m81024a(view);
                if (z2) {
                    if (a) {
                        bVar.f54800c += abVar.mo4642a();
                    } else {
                        bVar.f54798a += abVar.mo4642a();
                    }
                }
                if (z3) {
                    if (a) {
                        bVar.f54798a += abVar.mo4646c();
                    } else {
                        bVar.f54800c += abVar.mo4646c();
                    }
                }
                bVar.mo77877a(view);
                AbstractC22370a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo76565a(view, abVar, bVar);
                }
                return abVar;
            }
        });
    }
}
