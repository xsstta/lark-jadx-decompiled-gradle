package com.ss.android.lark.chatwindow.view.firsttip;

import android.view.View;
import android.widget.PopupWindow;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chatwindow.view.firsttip.TipPopupWindow;
import com.ss.android.lark.dependency.AbstractC36508v;
import com.ss.android.lark.statistics.pin.ChatPinHitPoint;

/* renamed from: com.ss.android.lark.chatwindow.view.firsttip.c */
public class C35287c {

    /* renamed from: a */
    public static boolean f91158a;

    /* renamed from: a */
    public static void m137805a(View view) {
        m137806a(view, "all_view_pin", TipPopupWindow.WHICH.PIN_SLIDE_MENU);
    }

    /* renamed from: a */
    private static void m137806a(final View view, final String str, final TipPopupWindow.WHICH which) {
        final AbstractC36508v k = C29990c.m110930b().mo134583k();
        if (k.mo134722b(str) && !f91158a && view != null) {
            f91158a = true;
            final C352881 r1 = new C35293e() {
                /* class com.ss.android.lark.chatwindow.view.firsttip.C35287c.C352881 */

                @Override // com.ss.android.lark.chatwindow.view.firsttip.C35275a
                /* renamed from: b */
                public void mo129828b() {
                    C35287c.f91158a = false;
                    k.mo134719a(str, true);
                    mo129850c();
                    super.mo129828b();
                }

                @Override // com.ss.android.lark.chatwindow.view.firsttip.AbstractC35292d, com.ss.android.lark.chatwindow.view.firsttip.C35275a
                /* renamed from: a */
                public void mo129827a() {
                    ChatPinHitPoint.f135899a.mo187695a();
                    TipPopupWindow tipPopupWindow = new TipPopupWindow(view.getContext(), which);
                    tipPopupWindow.mo129821a(view, new PopupWindow.OnDismissListener() {
                        /* class com.ss.android.lark.chatwindow.view.firsttip.C35287c.C352881.C352891 */

                        public void onDismiss() {
                            C352881.this.mo129851d();
                        }
                    }, new TipPopupWindow.AbstractC35274a() {
                        /* class com.ss.android.lark.chatwindow.view.firsttip.C35287c.C352881.C352902 */

                        @Override // com.ss.android.lark.chatwindow.view.firsttip.TipPopupWindow.AbstractC35274a
                        /* renamed from: a */
                        public void mo129826a() {
                        }
                    });
                    mo129849a(tipPopupWindow);
                }
            };
            view.postDelayed(new Runnable() {
                /* class com.ss.android.lark.chatwindow.view.firsttip.C35287c.RunnableC352912 */

                public void run() {
                    r1.mo129827a();
                }
            }, 500);
        }
    }
}
