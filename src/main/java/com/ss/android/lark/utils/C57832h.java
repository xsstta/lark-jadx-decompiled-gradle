package com.ss.android.lark.utils;

import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.larksuite.component.ui.toast.C25707a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.utils.h */
public class C57832h {

    /* renamed from: a */
    public static C25707a f142448a;

    /* renamed from: b */
    private static long f142449b;

    /* renamed from: c */
    private static int f142450c;

    /* renamed from: com.ss.android.lark.utils.h$a */
    public interface AbstractC57834a {

        /* renamed from: a */
        public static final AbstractC57834a f142451a = new AbstractC57834a() {
            /* class com.ss.android.lark.utils.C57832h.AbstractC57834a.C578351 */

            @Override // com.ss.android.lark.utils.C57832h.AbstractC57834a
            /* renamed from: a */
            public void mo196183a() {
                if (C57832h.f142448a != null) {
                    C57832h.f142448a.mo90181a();
                }
            }

            @Override // com.ss.android.lark.utils.C57832h.AbstractC57834a
            /* renamed from: a */
            public void mo196184a(CharSequence charSequence, long j) {
                C57832h.f142448a = LKUIToast.newGlobal(LarkContext.getApplication(), charSequence.toString());
                C57832h.f142448a.mo90187a(j);
            }
        };

        /* renamed from: a */
        void mo196183a();

        /* renamed from: a */
        void mo196184a(CharSequence charSequence, long j);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.utils.h$b */
    public static class C57836b {

        /* renamed from: a */
        public static final View$OnTouchListenerC57838d f142452a = new View$OnTouchListenerC57838d();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.utils.h$d */
    public static class View$OnTouchListenerC57838d implements View.OnTouchListener {
        private View$OnTouchListenerC57838d() {
        }

        /* renamed from: a */
        public static View$OnTouchListenerC57838d m224500a() {
            return C57836b.f142452a;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                m224501a(view, true);
            } else if (action == 1 || action == 3) {
                m224501a(view, false);
            }
            return false;
        }

        /* renamed from: a */
        private void m224501a(View view, boolean z) {
            Object tag = view.getTag(-1);
            if (tag instanceof Float) {
                float f = 1.0f;
                if (z) {
                    f = 1.0f + ((Float) tag).floatValue();
                }
                view.animate().scaleX(f).scaleY(f).setDuration(200).start();
            }
        }
    }

    /* renamed from: a */
    public static void m224491a(View[] viewArr, float[] fArr) {
        if (!(viewArr == null || viewArr.length == 0)) {
            for (int i = 0; i < viewArr.length; i++) {
                if (fArr == null || i >= fArr.length) {
                    m224487a(viewArr[i], -0.08f);
                } else {
                    m224487a(viewArr[i], fArr[i]);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m224485a() {
        m224489a(UIHelper.getString(R.string.Lark_Guide_ExitWarning), 2000, AbstractC57834a.f142451a);
    }

    /* renamed from: b */
    private static void m224492b() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        LarkContext.getApplication().startActivity(intent);
    }

    /* renamed from: com.ss.android.lark.utils.h$c */
    public static abstract class AbstractView$OnClickListenerC57837c implements View.OnClickListener {

        /* renamed from: a */
        private final int f142453a;

        /* renamed from: b */
        private final long f142454b;

        /* renamed from: c */
        private long f142455c;

        /* renamed from: d */
        private int f142456d;

        /* renamed from: a */
        public abstract void mo146063a(View view);

        /* renamed from: a */
        public abstract void mo146064a(View view, int i);

        public AbstractView$OnClickListenerC57837c(int i) {
            this(i, 666);
        }

        public void onClick(View view) {
            if (this.f142453a <= 1) {
                mo146063a(view);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f142455c < this.f142454b) {
                int i = this.f142456d + 1;
                this.f142456d = i;
                int i2 = this.f142453a;
                if (i == i2) {
                    mo146063a(view);
                } else if (i < i2) {
                    mo146064a(view, i);
                } else {
                    this.f142456d = 1;
                    mo146064a(view, 1);
                }
            } else {
                this.f142456d = 1;
                mo146064a(view, 1);
            }
            this.f142455c = currentTimeMillis;
        }

        public AbstractView$OnClickListenerC57837c(int i, long j) {
            this.f142453a = i;
            this.f142454b = j;
        }
    }

    /* renamed from: a */
    public static void m224486a(View view) {
        m224493b(view, 0.9f);
    }

    /* renamed from: a */
    private static ColorMatrixColorFilter m224482a(float f) {
        return new ColorMatrixColorFilter(new ColorMatrix(new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f}));
    }

    /* renamed from: a */
    public static void m224490a(View... viewArr) {
        m224491a(viewArr, (float[]) null);
    }

    /* renamed from: a */
    private static Drawable m224483a(Drawable drawable, float f) {
        drawable.setColorFilter(m224482a(f));
        return drawable;
    }

    /* renamed from: b */
    public static void m224493b(View view, float f) {
        m224488a(view, 5, f);
    }

    /* renamed from: a */
    public static void m224487a(View view, float f) {
        if (view != null) {
            view.setTag(-1, Float.valueOf(f));
            view.setClickable(true);
            view.setOnTouchListener(View$OnTouchListenerC57838d.m224500a());
        }
    }

    /* renamed from: a */
    private static Drawable m224484a(Drawable drawable, int i, float f) {
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        if (drawable.getConstantState() == null) {
            return drawable;
        }
        Drawable mutate = drawable.getConstantState().newDrawable().mutate();
        if (i == 5) {
            mutate = m224483a(mutate, f);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, mutate);
        stateListDrawable.addState(StateSet.WILD_CARD, drawable);
        return stateListDrawable;
    }

    /* renamed from: a */
    private static void m224488a(View view, int i, float f) {
        if (view != null) {
            Drawable background = view.getBackground();
            int i2 = -i;
            Object tag = view.getTag(i2);
            if (tag instanceof Drawable) {
                ViewCompat.m4039a(view, (Drawable) tag);
                return;
            }
            Drawable a = m224484a(background, i, f);
            ViewCompat.m4039a(view, a);
            view.setTag(i2, a);
        }
    }

    /* renamed from: a */
    public static void m224489a(CharSequence charSequence, long j, AbstractC57834a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f142449b < j) {
            int i = f142450c + 1;
            f142450c = i;
            if (i == 2) {
                m224492b();
                aVar.mo196183a();
                f142449b = 0;
                return;
            }
            return;
        }
        f142450c = 1;
        aVar.mo196184a(charSequence, j);
        f142449b = currentTimeMillis;
    }
}
