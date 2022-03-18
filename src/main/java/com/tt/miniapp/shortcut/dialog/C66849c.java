package com.tt.miniapp.shortcut.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.tt.miniapp.view.p3348a.C67159a;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.shortcut.dialog.c */
public class C66849c {

    /* renamed from: com.tt.miniapp.shortcut.dialog.c$a */
    public interface AbstractC66856a {
        /* renamed from: a */
        void mo232764a();

        /* renamed from: b */
        void mo232765b();

        /* renamed from: c */
        void mo232766c();
    }

    /* renamed from: b */
    private static boolean m260797b(C66845a aVar) {
        C66848b bVar;
        if (aVar == null || (bVar = aVar.f168614b) == null || bVar.mo232781c() == null || bVar.mo232781c().isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m260796a(C66845a aVar) {
        C66857d dVar;
        C66858e a;
        if (aVar == null || (dVar = aVar.f168613a) == null || (a = dVar.mo232788a()) == null || TextUtils.isEmpty(a.mo232791a())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Dialog m260793a(C66845a aVar, AbstractC66856a aVar2) {
        int i;
        int i2;
        WindowManager.LayoutParams attributes;
        if (aVar == null) {
            return null;
        }
        Context context = aVar.f168615c;
        if (!(context instanceof Activity)) {
            return null;
        }
        if (aVar2 != null) {
            aVar2.mo232766c();
        }
        boolean a = m260796a(aVar);
        boolean b = m260797b(aVar);
        if (!a && !b) {
            return null;
        }
        Dialog dialog = new Dialog(context, R.style.microapp_m_DialogTheme);
        View inflate = LayoutInflater.from(context).inflate(R.layout.microapp_m_shortcut_dialog, (ViewGroup) null);
        dialog.setContentView(inflate);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        TextView textView = (TextView) inflate.findViewById(R.id.microapp_m_tv_title);
        ScrollView scrollView = (ScrollView) inflate.findViewById(R.id.microapp_m_sv_content_container);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.microapp_m_ll_buttons_container);
        TextView textView2 = (TextView) inflate.findViewById(R.id.microapp_m_tv_content);
        TextView textView3 = (TextView) inflate.findViewById(R.id.microapp_m_tv_cancel);
        TextView textView4 = (TextView) inflate.findViewById(R.id.microapp_m_tv_confirm);
        C66857d dVar = aVar.f168613a;
        aVar.mo232775a(textView, dVar.mo232788a());
        if (dVar.mo232789b()) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setGravity(dVar.mo232790c());
        C66848b bVar = aVar.f168614b;
        aVar.mo232776a(textView2, bVar.mo232781c());
        if (bVar.mo232779a()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView2.setVisibility(i2);
        textView2.setGravity(bVar.mo232780b());
        m260794a(context, inflate, textView, scrollView, linearLayout, textView2, a, b);
        aVar.mo232775a(textView4, aVar.f168616d.mo232788a());
        aVar.mo232775a(textView3, aVar.f168617e.mo232788a());
        m260795a(aVar2, dialog, inflate, textView3, textView4);
        Window window = dialog.getWindow();
        if (!(window == null || (attributes = window.getAttributes()) == null)) {
            attributes.gravity = 17;
        }
        Activity activity = (Activity) context;
        if (activity.isFinishing() || activity.isDestroyed()) {
            return null;
        }
        dialog.show();
        return dialog;
    }

    /* renamed from: a */
    private static void m260795a(final AbstractC66856a aVar, final Dialog dialog, View view, TextView textView, TextView textView2) {
        C67159a aVar2 = new C67159a(0.14d, 1.0d, 0.34d, 1.0d);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "scaleX", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(350L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "scaleY", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(350L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(100L);
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration3).with(duration).with(duration2);
        animatorSet.setInterpolator(aVar2);
        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            /* class com.tt.miniapp.shortcut.dialog.C66849c.DialogInterface$OnShowListenerC668501 */

            public void onShow(DialogInterface dialogInterface) {
                animatorSet.start();
            }
        });
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(450L);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(450L);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(150L);
        duration6.addListener(new AnimatorListenerAdapter() {
            /* class com.tt.miniapp.shortcut.dialog.C66849c.C668512 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                dialog.dismiss();
            }
        });
        final AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(duration6).with(duration4).with(duration5);
        animatorSet2.setInterpolator(aVar2);
        textView2.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.shortcut.dialog.C66849c.View$OnClickListenerC668523 */

            public void onClick(View view) {
                AbstractC66856a aVar = aVar;
                if (aVar != null) {
                    aVar.mo232764a();
                }
                animatorSet2.start();
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.shortcut.dialog.C66849c.View$OnClickListenerC668534 */

            public void onClick(View view) {
                AbstractC66856a aVar = aVar;
                if (aVar != null) {
                    aVar.mo232765b();
                }
                animatorSet2.start();
            }
        });
    }

    /* renamed from: a */
    private static void m260794a(final Context context, final View view, final TextView textView, final ScrollView scrollView, final LinearLayout linearLayout, final TextView textView2, boolean z, boolean z2) {
        if (!z) {
            textView.setVisibility(8);
        }
        if (!z2) {
            textView2.setVisibility(8);
        }
        textView.post(new Runnable() {
            /* class com.tt.miniapp.shortcut.dialog.C66849c.RunnableC668545 */

            public void run() {
                textView2.post(new Runnable() {
                    /* class com.tt.miniapp.shortcut.dialog.C66849c.RunnableC668545.RunnableC668551 */

                    public void run() {
                        int b = C67590h.m263081b(context, (float) view.getMeasuredHeight());
                        int b2 = C67590h.m263081b(context, (float) linearLayout.getMeasuredHeight());
                        int lineCount = textView.getLineCount();
                        int lineCount2 = textView2.getLineCount();
                        if (lineCount >= 1 && lineCount2 == 0) {
                            scrollView.setPadding(scrollView.getPaddingLeft(), 0, scrollView.getPaddingRight(), scrollView.getPaddingBottom());
                            float b3 = (float) (((b - b2) - C67590h.m263081b(context, (float) ((textView.getMeasuredHeight() - textView.getPaddingTop()) - textView.getPaddingBottom()))) / 2);
                            textView.setPadding(textView.getPaddingLeft(), (int) C67590h.m263065a(context, b3), textView.getPaddingRight(), (int) C67590h.m263065a(context, b3));
                        } else if (lineCount != 0) {
                        } else {
                            if (lineCount2 == 1 || lineCount2 == 2) {
                                scrollView.setPadding(scrollView.getPaddingLeft(), 0, scrollView.getPaddingRight(), scrollView.getPaddingBottom());
                                float b4 = (float) (((b - b2) - C67590h.m263081b(context, (float) ((textView2.getMeasuredHeight() - textView2.getPaddingTop()) - textView2.getPaddingBottom()))) / 2);
                                textView2.setPadding(textView2.getPaddingLeft(), (int) C67590h.m263065a(context, b4), textView2.getPaddingRight(), (int) C67590h.m263065a(context, b4));
                            }
                        }
                    }
                });
            }
        });
    }
}
