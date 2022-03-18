package com.tt.miniapp.toast;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.util.C67590h;
import com.tt.refer.common.util.C67866g;
import java.lang.ref.WeakReference;
import java.util.List;

public class ToastManager {

    /* renamed from: com.tt.miniapp.toast.ToastManager$a */
    public static class C66967a {

        /* renamed from: a */
        public boolean f168889a;

        /* renamed from: b */
        public WeakReference<Activity> f168890b;

        /* renamed from: c */
        public View f168891c;

        /* renamed from: d */
        public int f168892d;

        /* renamed from: e */
        public ProgressBar f168893e;

        /* renamed from: f */
        public AlphaAnimation f168894f;

        /* renamed from: g */
        private long f168895g;

        /* renamed from: h */
        private Runnable f168896h = new Runnable() {
            /* class com.tt.miniapp.toast.ToastManager.C66967a.RunnableC669681 */

            public void run() {
                ViewGroup a;
                Activity activity = C66967a.this.f168890b.get();
                if (C66967a.this.f168891c != null && C66967a.this.f168891c.getParent() != null) {
                    if (C66967a.this.f168893e != null) {
                        C66967a.this.f168893e.setVisibility(8);
                    }
                    C66967a.this.f168891c.clearAnimation();
                    if (!(activity == null || (a = C66967a.m261043a(activity)) == null)) {
                        a.removeView(C66967a.this.f168891c);
                    }
                    ToastManager.removeToast(C66967a.this);
                    C66967a.this.f168889a = false;
                }
            }
        };

        /* renamed from: i */
        private Runnable f168897i = new Runnable() {
            /* class com.tt.miniapp.toast.ToastManager.C66967a.RunnableC669692 */

            public void run() {
                Activity activity = C66967a.this.f168890b.get();
                View view = C66967a.this.f168891c;
                if (view != null && activity != null) {
                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                    ViewGroup a = C66967a.m261043a(activity);
                    if (!(a == null || view.getParent() == null)) {
                        a.removeView(view);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    if (C66967a.this.f168892d == 0) {
                        layoutParams.gravity = 81;
                        layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 80.0f, displayMetrics);
                    } else {
                        layoutParams.gravity = C66967a.this.f168892d;
                    }
                    if (a != null) {
                        a.addView(C66967a.this.f168891c, layoutParams);
                    }
                    C66967a.this.mo232989d();
                    ToastManager.addToast(C66967a.this);
                }
            }
        };

        /* renamed from: j */
        private final Runnable f168898j = new Runnable() {
            /* class com.tt.miniapp.toast.ToastManager.C66967a.RunnableC669703 */

            public void run() {
                if (C66967a.this.f168889a) {
                    C66967a.this.f168891c.startAnimation(C66967a.this.f168894f);
                }
            }
        };

        /* renamed from: c */
        public long mo232988c() {
            return this.f168895g;
        }

        /* renamed from: b */
        public void mo232987b() {
            C67866g.m264031b(this.f168897i);
            C67866g.m264027a(this.f168896h);
        }

        /* renamed from: a */
        public void mo232983a() {
            if (this.f168891c != null) {
                C67866g.m264027a(this.f168897i);
                return;
            }
            throw new RuntimeException("setView must have been called");
        }

        /* renamed from: d */
        public void mo232989d() {
            if (!this.f168889a) {
                this.f168889a = true;
                AlphaAnimation alphaAnimation = new AlphaAnimation((float) BitmapDescriptorFactory.HUE_RED, 1.0f);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, (float) BitmapDescriptorFactory.HUE_RED);
                this.f168894f = alphaAnimation2;
                alphaAnimation2.setDuration(200);
                alphaAnimation.setDuration(200);
                this.f168891c.setVisibility(0);
                AppBrandLogger.m52828d("tma_ToastManager", "startAnimation ", Long.valueOf(mo232988c() - 200), " ", Long.valueOf(mo232988c()));
                C67866g.m264028a(this.f168898j, mo232988c() - 200);
                C67866g.m264028a(this.f168896h, mo232988c());
            }
        }

        /* renamed from: a */
        public void mo232984a(int i) {
            this.f168892d = i;
        }

        /* renamed from: a */
        public void mo232986a(View view) {
            this.f168891c = view;
        }

        /* renamed from: a */
        public static ViewGroup m261043a(Activity activity) {
            return (ViewGroup) activity.findViewById(16908290);
        }

        public C66967a(Activity activity) {
            this.f168890b = new WeakReference<>(activity);
        }

        /* renamed from: a */
        public void mo232985a(long j) {
            if (j == 0) {
                this.f168895g = 2000;
            } else if (j == 1) {
                this.f168895g = 3500;
            } else {
                this.f168895g = j;
            }
        }

        /* renamed from: a */
        public static C66967a m261044a(Activity activity, CharSequence charSequence, long j, String str) {
            C66967a aVar = new C66967a(activity);
            View inflate = View.inflate(activity, R.layout.microapp_m_popup_toast, null);
            TextView textView = (TextView) inflate.findViewById(R.id.microapp_m_text);
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setMinWidth((int) C67590h.m263065a(activity, 108.0f));
            textView.setMaxWidth((int) C67590h.m263065a(activity, 168.0f));
            textView.setText(charSequence);
            if (TextUtils.equals(str, "success")) {
                ImageView imageView = (ImageView) inflate.findViewById(R.id.microapp_m_icon);
                imageView.setVisibility(0);
                imageView.setImageDrawable(activity.getResources().getDrawable(2131234659));
                textView.setMaxLines(1);
            } else if (TextUtils.equals(str, "loading")) {
                inflate.findViewById(R.id.microapp_m_loading_progress).setVisibility(0);
                textView.setMaxLines(1);
            } else if (TextUtils.equals(str, "fail")) {
                ImageView imageView2 = (ImageView) inflate.findViewById(R.id.microapp_m_icon);
                imageView2.setVisibility(0);
                imageView2.setImageDrawable(activity.getResources().getDrawable(2131234657));
                textView.setMaxLines(1);
            }
            aVar.mo232986a(inflate);
            aVar.mo232985a(j);
            return aVar;
        }
    }

    public static List<C66967a> getToastContainer() {
        return ContextSingletonInstance.getInstance().toastContainer;
    }

    public static void clearToast() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.tt.miniapp.toast.ToastManager.RunnableC669664 */

            public void run() {
                for (C66967a aVar : ToastManager.getToastContainer()) {
                    aVar.mo232987b();
                }
            }
        });
    }

    public static void hideToast() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.tt.miniapp.toast.ToastManager.RunnableC669653 */

            public void run() {
                for (C66967a aVar : ToastManager.getToastContainer()) {
                    aVar.mo232987b();
                }
            }
        });
    }

    private static boolean isSupportCustomToast(Context context) {
        return context instanceof Activity;
    }

    public static void addToast(C66967a aVar) {
        if (aVar != null) {
            getToastContainer().add(aVar);
        }
    }

    public static void removeToast(C66967a aVar) {
        if (aVar != null) {
            getToastContainer().remove(aVar);
        }
    }

    public static void showShortToast(Context context, CharSequence charSequence) {
        showToast(context, charSequence, 2000, null);
    }

    public static void showToast(Context context, CharSequence charSequence, long j) {
        showToast(context, charSequence, j, null);
    }

    public static void showToast(final Context context, final CharSequence charSequence, final long j, final String str) {
        Handler handler = new Handler(Looper.getMainLooper());
        if (!isSupportCustomToast(context)) {
            AppBrandLogger.m52828d("tma_ToastManager", "isSupportCustomToast not suppot");
            handler.post(new Runnable() {
                /* class com.tt.miniapp.toast.ToastManager.RunnableC669631 */

                public void run() {
                    UDToast.build(context).mo91643a(charSequence).mo91640a(-2L).mo91656k();
                }
            });
            return;
        }
        handler.post(new Runnable() {
            /* class com.tt.miniapp.toast.ToastManager.RunnableC669642 */

            public void run() {
                for (C66967a aVar : ToastManager.getToastContainer()) {
                    aVar.mo232987b();
                }
                C66967a a = C66967a.m261044a((Activity) context, charSequence, j, str);
                a.mo232984a(17);
                a.mo232983a();
            }
        });
    }
}
