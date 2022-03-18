package com.tt.miniapp.view.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.view.dialog.DialogC67177b;
import com.tt.miniapp.view.p3348a.C67159a;
import com.tt.miniapphost.entity.C67533i;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.view.dialog.c */
public class C67179c {

    /* renamed from: com.tt.miniapp.view.dialog.c$a */
    public interface AbstractC67189a {
        /* renamed from: a */
        void mo231527a();

        /* renamed from: a */
        void mo231528a(int i);
    }

    /* renamed from: com.tt.miniapp.view.dialog.c$b */
    public interface AbstractC67190b {
        /* renamed from: a */
        void mo231531a();

        /* renamed from: b */
        void mo231532b();

        /* renamed from: c */
        void mo231533c();
    }

    /* renamed from: a */
    public static void m261840a(Window window) {
        if (window != null) {
            window.setFlags(8, 8);
        }
    }

    /* renamed from: b */
    public static void m261842b(Window window) {
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(5894);
            window.clearFlags(8);
        }
    }

    /* renamed from: a */
    public static int m261834a(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    /* renamed from: a */
    public static int[] m261841a(Context context, boolean z) {
        boolean z2;
        int i;
        float f;
        int i2;
        float b = ((float) C67590h.m263081b(context, (float) C67043j.m261275b(context))) / ((float) m261834a(context.getResources(), (int) R.integer.microapp_m_modal_dialog_base_screen_width));
        if (context.getResources().getConfiguration().orientation == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i = m261834a(context.getResources(), (int) R.integer.microapp_m_modal_dialog_base_max_width);
        } else {
            i = (int) (((float) m261834a(context.getResources(), (int) R.integer.microapp_m_modal_dialog_base_max_width)) * b);
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.7f;
        }
        if (z2) {
            i2 = C67590h.m263081b(context, ((float) C67043j.m261267a(context)) * f);
        } else {
            i2 = (int) (((float) m261834a(context.getResources(), (int) R.integer.microapp_m_modal_dialog_base_max_height)) * b);
        }
        return new int[]{i, i2};
    }

    /* renamed from: a */
    public static void m261837a(final Context context, final View view, boolean z) {
        int[] a = m261841a(context, z);
        int i = a[0];
        final int i2 = a[1];
        view.getLayoutParams().width = (int) C67590h.m263065a(context, (float) i);
        view.post(new Runnable() {
            /* class com.tt.miniapp.view.dialog.C67179c.RunnableC671823 */

            public void run() {
                boolean z;
                if (C67590h.m263081b(context, (float) view.getMeasuredHeight()) > i2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    view.getLayoutParams().height = (int) C67590h.m263065a(context, (float) i2);
                    if (C67043j.m261278c() || (C67043j.m261271a().contentEquals("vivo") && Build.MODEL.contentEquals("vivo X21A"))) {
                        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = (C67043j.m261267a(context) - i2) / 2;
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m261839a(Context context, String[] strArr, final AbstractC67189a aVar) {
        if (context instanceof Activity) {
            DialogC67177b.C67178a aVar2 = new DialogC67177b.C67178a(context);
            aVar2.mo233572a(strArr, new DialogInterface.OnClickListener() {
                /* class com.tt.miniapp.view.dialog.C67179c.DialogInterface$OnClickListenerC671801 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    AbstractC67189a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo231528a(i);
                    }
                }
            });
            aVar2.mo233571a(new DialogInterface.OnCancelListener() {
                /* class com.tt.miniapp.view.dialog.C67179c.DialogInterface$OnCancelListenerC671812 */

                public void onCancel(DialogInterface dialogInterface) {
                    AbstractC67189a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo231527a();
                    }
                }
            });
            DialogC67177b a = aVar2.mo233573a();
            a.setCanceledOnTouchOutside(true);
            if (!((Activity) context).isFinishing()) {
                a.show();
            }
        }
    }

    /* renamed from: a */
    public static Dialog m261835a(Context context, AbstractC67190b bVar, String str, String str2, String str3, String str4) {
        if (!(context instanceof Activity)) {
            return null;
        }
        bVar.mo231533c();
        Dialog dialog = new Dialog(context, R.style.microapp_m_DialogTheme);
        View inflate = LayoutInflater.from(context).inflate(R.layout.microapp_m_modal_dialog, (ViewGroup) null);
        dialog.setContentView(inflate);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        m261837a(context, inflate, false);
        TextView textView = (TextView) inflate.findViewById(R.id.microapp_m_tv_title);
        ScrollView scrollView = (ScrollView) inflate.findViewById(R.id.microapp_m_sv_content_container);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.microapp_m_ll_buttons_container);
        TextView textView2 = (TextView) inflate.findViewById(R.id.microapp_m_tv_content);
        TextView textView3 = (TextView) inflate.findViewById(R.id.microapp_m_tv_cancel);
        View findViewById = inflate.findViewById(R.id.microapp_m_div_between_cancel_and_confirm);
        TextView textView4 = (TextView) inflate.findViewById(R.id.microapp_m_tv_confirm);
        textView.setText(str);
        textView2.setText(str2);
        boolean z = !TextUtils.isEmpty(str);
        boolean z2 = !TextUtils.isEmpty(str2);
        if (!z && !z2) {
            return null;
        }
        m261836a(context, inflate, textView, scrollView, linearLayout, textView2, z, z2);
        m261838a(context, bVar, str3, str4, dialog, inflate, textView3, findViewById, textView4);
        Activity activity = (Activity) context;
        if (activity.isFinishing() || activity.isDestroyed()) {
            return null;
        }
        dialog.show();
        return dialog;
    }

    /* renamed from: a */
    private static void m261836a(final Context context, final View view, final TextView textView, final ScrollView scrollView, final LinearLayout linearLayout, final TextView textView2, boolean z, boolean z2) {
        if (!z) {
            textView.setVisibility(8);
        }
        if (!z2) {
            textView2.setVisibility(8);
        }
        textView.post(new Runnable() {
            /* class com.tt.miniapp.view.dialog.C67179c.RunnableC671878 */

            public void run() {
                textView2.post(new Runnable() {
                    /* class com.tt.miniapp.view.dialog.C67179c.RunnableC671878.RunnableC671881 */

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

    /* renamed from: a */
    private static void m261838a(Context context, final AbstractC67190b bVar, String str, String str2, final Dialog dialog, View view, TextView textView, View view2, TextView textView2) {
        C67159a aVar = new C67159a(0.14d, 1.0d, 0.34d, 1.0d);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "scaleX", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(350L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "scaleY", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(350L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(100L);
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration3).with(duration).with(duration2);
        animatorSet.setInterpolator(aVar);
        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            /* class com.tt.miniapp.view.dialog.C67179c.DialogInterface$OnShowListenerC671834 */

            public void onShow(DialogInterface dialogInterface) {
                animatorSet.start();
            }
        });
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(450L);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(450L);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(150L);
        duration6.addListener(new AnimatorListenerAdapter() {
            /* class com.tt.miniapp.view.dialog.C67179c.C671845 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                dialog.dismiss();
            }
        });
        final AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(duration6).with(duration4).with(duration5);
        animatorSet2.setInterpolator(aVar);
        String trimString = CharacterUtils.trimString(str, 8, false, null);
        if (TextUtils.isEmpty(trimString)) {
            trimString = context.getText(R.string.microapp_m_confirm).toString();
        }
        textView2.setTextColor(Color.parseColor(C67533i.m262676a().mo234523c()));
        textView2.setText(trimString);
        textView2.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.view.dialog.C67179c.View$OnClickListenerC671856 */

            public void onClick(View view) {
                AbstractC67190b bVar = bVar;
                if (bVar != null) {
                    bVar.mo231531a();
                }
                animatorSet2.start();
            }
        });
        String trimString2 = CharacterUtils.trimString(str2, 8, false, null);
        if (TextUtils.isEmpty(trimString2)) {
            textView.setVisibility(8);
            view2.setVisibility(8);
        }
        textView.setTextColor(Color.parseColor(C67533i.m262676a().mo234531k()));
        textView.setText(trimString2);
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.view.dialog.C67179c.View$OnClickListenerC671867 */

            public void onClick(View view) {
                AbstractC67190b bVar = bVar;
                if (bVar != null) {
                    bVar.mo231532b();
                }
                animatorSet2.start();
            }
        });
    }
}
