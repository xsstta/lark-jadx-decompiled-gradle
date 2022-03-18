package com.ss.android.lark.inv.export.util;

import android.view.View;

/* renamed from: com.ss.android.lark.inv.export.util.e */
public class C40103e {

    /* renamed from: com.ss.android.lark.inv.export.util.e$a */
    public static abstract class AbstractView$OnClickListenerC40105a implements View.OnClickListener {

        /* renamed from: a */
        private static final Runnable f101942a = new Runnable() {
            /* class com.ss.android.lark.inv.export.util.C40103e.AbstractView$OnClickListenerC40105a.RunnableC401061 */

            public void run() {
                AbstractView$OnClickListenerC40105a.f101943b = true;
            }
        };

        /* renamed from: b */
        public static boolean f101943b = true;

        /* renamed from: c */
        private long f101944c;

        /* renamed from: d */
        private boolean f101945d;

        /* renamed from: a */
        public abstract void mo145670a(View view);

        public AbstractView$OnClickListenerC40105a() {
            this(true, 1000);
        }

        public final void onClick(View view) {
            if (this.f101945d) {
                if (f101943b) {
                    f101943b = false;
                    view.postDelayed(f101942a, this.f101944c);
                    mo145670a(view);
                }
            } else if (m159010a(view, this.f101944c)) {
                mo145670a(view);
            }
        }

        /* renamed from: a */
        private static boolean m159010a(View view, long j) {
            return C40110i.m159020a(view, j);
        }

        public AbstractView$OnClickListenerC40105a(boolean z, long j) {
            this.f101945d = z;
            this.f101944c = j;
        }
    }

    /* renamed from: a */
    public static void m159005a(View view, View.OnClickListener onClickListener) {
        m159007a(new View[]{view}, onClickListener);
    }

    /* renamed from: a */
    public static void m159007a(View[] viewArr, View.OnClickListener onClickListener) {
        m159006a(viewArr, 1000, onClickListener);
    }

    /* renamed from: a */
    public static void m159006a(View[] viewArr, long j, View.OnClickListener onClickListener) {
        m159008a(viewArr, false, j, onClickListener);
    }

    /* renamed from: a */
    public static void m159004a(View view, long j, View.OnClickListener onClickListener) {
        m159006a(new View[]{view}, j, onClickListener);
    }

    /* renamed from: a */
    private static void m159008a(View[] viewArr, boolean z, long j, final View.OnClickListener onClickListener) {
        if (!(viewArr == null || viewArr.length == 0 || onClickListener == null)) {
            for (View view : viewArr) {
                if (view != null) {
                    view.setOnClickListener(new AbstractView$OnClickListenerC40105a(z, j) {
                        /* class com.ss.android.lark.inv.export.util.C40103e.C401041 */

                        @Override // com.ss.android.lark.inv.export.util.C40103e.AbstractView$OnClickListenerC40105a
                        /* renamed from: a */
                        public void mo145670a(View view) {
                            onClickListener.onClick(view);
                        }
                    });
                }
            }
        }
    }
}
