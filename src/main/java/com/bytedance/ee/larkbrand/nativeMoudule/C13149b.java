package com.bytedance.ee.larkbrand.nativeMoudule;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.p649d.C12989b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.util.C67590h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.b */
public class C13149b {

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.b$a */
    public static class C13153a {

        /* renamed from: a */
        public boolean f34863a;

        /* renamed from: b */
        public View f34864b;

        /* renamed from: c */
        public AlphaAnimation f34865c;

        /* renamed from: d */
        private Activity f34866d;

        /* renamed from: e */
        private long f34867e;

        /* renamed from: f */
        private int f34868f;

        /* renamed from: g */
        private ProgressBar f34869g;

        /* renamed from: h */
        private boolean f34870h;

        /* renamed from: i */
        private View f34871i;

        /* renamed from: j */
        private ViewGroup f34872j;

        /* renamed from: k */
        private final Runnable f34873k = new Runnable() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.C13149b.C13153a.RunnableC131563 */

            public void run() {
                C13153a.this.mo49215d();
            }
        };

        /* renamed from: l */
        private final Runnable f34874l = new Runnable() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.C13149b.C13153a.RunnableC131574 */

            public void run() {
                if (C13153a.this.f34863a) {
                    C13153a.this.f34864b.startAnimation(C13153a.this.f34865c);
                }
            }
        };

        /* renamed from: m */
        private Handler f34875m = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        public long mo49214c() {
            return this.f34867e;
        }

        /* renamed from: a */
        public void mo49205a() {
            if (this.f34864b != null) {
                m53765e();
                return;
            }
            throw new RuntimeException("setView must have been called");
        }

        /* renamed from: b */
        public void mo49212b() {
            View view = this.f34864b;
            if (view != null && view.getParent() != null) {
                m53762a(this.f34866d).removeView(this.f34864b);
            }
        }

        /* renamed from: d */
        public void mo49215d() {
            View view = this.f34864b;
            if (view != null && view.getParent() != null) {
                ProgressBar progressBar = this.f34869g;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                m53762a(this.f34866d).removeView(this.f34864b);
                C13149b.m53761b(this);
                this.f34863a = false;
            }
        }

        /* renamed from: e */
        private void m53765e() {
            View view = this.f34864b;
            if (view != null) {
                ViewGroup a = m53762a(this.f34866d);
                if (view.getParent() != null) {
                    a.removeView(view);
                }
                if (this.f34868f == 0) {
                    ((FrameLayout.LayoutParams) this.f34871i.getLayoutParams()).gravity = 81;
                    ((FrameLayout.LayoutParams) this.f34871i.getLayoutParams()).bottomMargin = (int) TypedValue.applyDimension(1, 80.0f, this.f34866d.getResources().getDisplayMetrics());
                } else {
                    ((FrameLayout.LayoutParams) this.f34871i.getLayoutParams()).gravity = this.f34868f;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.topMargin = (int) (C67590h.m263065a(this.f34866d, 44.0f) + ((float) C67043j.m261285g(this.f34866d)));
                a.addView(this.f34864b, layoutParams);
                m53766f();
                C13149b.m53759a(this);
            }
        }

        /* renamed from: f */
        private void m53766f() {
            if (!this.f34863a) {
                this.f34863a = true;
                AlphaAnimation alphaAnimation = new AlphaAnimation((float) BitmapDescriptorFactory.HUE_RED, 1.0f);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, (float) BitmapDescriptorFactory.HUE_RED);
                this.f34865c = alphaAnimation2;
                alphaAnimation2.setDuration(200);
                alphaAnimation.setDuration(200);
                this.f34864b.setVisibility(0);
                AppBrandLogger.m52828d("LarkToastManager", "startAnimation " + (mo49214c() - 200) + " " + mo49214c());
                this.f34875m.postDelayed(this.f34874l, mo49214c() - 200);
                this.f34875m.postDelayed(this.f34873k, mo49214c());
            }
        }

        /* renamed from: a */
        private void m53764a(ProgressBar progressBar) {
            this.f34869g = progressBar;
        }

        /* renamed from: b */
        public void mo49213b(View view) {
            this.f34871i = view;
        }

        /* renamed from: a */
        public void mo49206a(int i) {
            this.f34868f = i;
        }

        /* renamed from: a */
        private ViewGroup m53762a(Activity activity) {
            ViewGroup viewGroup = this.f34872j;
            if (viewGroup != null) {
                return viewGroup;
            }
            return (ViewGroup) activity.findViewById(16908290);
        }

        public C13153a(Activity activity) {
            this.f34866d = activity;
        }

        /* renamed from: a */
        public void mo49207a(long j) {
            if (j == 0) {
                this.f34867e = 2000;
            } else if (j == 1) {
                this.f34867e = 3500;
            } else {
                this.f34867e = j;
            }
        }

        /* renamed from: a */
        public void mo49208a(View view) {
            this.f34864b = view;
        }

        /* renamed from: a */
        public void mo49209a(ViewGroup viewGroup) {
            this.f34872j = viewGroup;
        }

        /* renamed from: a */
        public void mo49210a(CharSequence charSequence) {
            View view = this.f34864b;
            if (view != null) {
                TextView textView = (TextView) view.findViewById(R.id.text);
                if (textView != null) {
                    textView.setText(charSequence);
                    return;
                }
                throw new RuntimeException("This Toast was not created with Toast.makeText()");
            }
            throw new RuntimeException("This Toast was not created with Toast.makeText()");
        }

        /* renamed from: a */
        public void mo49211a(boolean z) {
            this.f34870h = z;
        }

        /* renamed from: a */
        public static C13153a m53763a(final Activity activity, ViewGroup viewGroup, boolean z, CharSequence charSequence, long j, String str) {
            C13153a aVar = new C13153a(activity);
            View inflate = View.inflate(activity, R.layout.lark_brand_popup_toast, null);
            final LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.real_toast);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
            final TextView textView = (TextView) inflate.findViewById(R.id.text);
            inflate.setClickable(z);
            aVar.mo49209a(viewGroup);
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            }
            if (TextUtils.equals(str, "success")) {
                imageView.setVisibility(0);
                imageView.setImageDrawable(activity.getResources().getDrawable(2131234659));
                textView.setMaxLines(1);
                textView.setSingleLine();
            } else if (TextUtils.equals(str, "loading")) {
                imageView.setVisibility(8);
                ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.loading_progress);
                progressBar.setVisibility(0);
                aVar.m53764a(progressBar);
                textView.setMaxLines(1);
                textView.setSingleLine();
            } else {
                textView.setMaxLines(2);
                imageView.setVisibility(8);
                final ViewTreeObserver$OnPreDrawListenerC131541 r9 = new ViewTreeObserver.OnPreDrawListener() {
                    /* class com.bytedance.ee.larkbrand.nativeMoudule.C13149b.C13153a.ViewTreeObserver$OnPreDrawListenerC131541 */

                    public boolean onPreDraw() {
                        AppBrandLogger.m52830i("LarkToastManager", "preDraw, textView:" + textView + " viewTree:" + textView.getViewTreeObserver() + " listener:" + this);
                        if (textView.getLineCount() > 1) {
                            linearLayout.setBackground(activity.getDrawable(R.drawable.lark_brand_toast_large_bg));
                        }
                        textView.getViewTreeObserver().removeOnPreDrawListener(this);
                        return false;
                    }
                };
                textView.getViewTreeObserver().addOnPreDrawListener(r9);
                textView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    /* class com.bytedance.ee.larkbrand.nativeMoudule.C13149b.C13153a.View$OnAttachStateChangeListenerC131552 */

                    public void onViewAttachedToWindow(View view) {
                    }

                    public void onViewDetachedFromWindow(View view) {
                        AppBrandLogger.m52830i("LarkToastManager", "detachView, textView:" + view + " viewTree:" + textView.getViewTreeObserver() + " listener:" + r9);
                        view.getViewTreeObserver().removeOnPreDrawListener(r9);
                    }
                });
                textView.setTag(r9);
            }
            aVar.mo49213b(linearLayout);
            aVar.mo49208a(inflate);
            aVar.mo49210a(charSequence);
            aVar.mo49207a(j);
            aVar.mo49211a(z);
            return aVar;
        }
    }

    /* renamed from: a */
    public static void m53755a() {
        AppBrandLogger.m52830i("LarkToastManager", "hide toast");
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.C13149b.RunnableC131523 */

            public void run() {
                for (C13153a aVar : C12989b.m53447a().f34594c) {
                    aVar.mo49212b();
                }
            }
        });
    }

    /* renamed from: b */
    public static void m53761b(C13153a aVar) {
        if (aVar != null) {
            C12989b.m53447a().f34594c.remove(aVar);
        }
    }

    /* renamed from: a */
    public static void m53759a(C13153a aVar) {
        if (aVar != null) {
            C12989b.m53447a().f34594c.add(aVar);
        }
    }

    /* renamed from: a */
    public static void m53757a(Context context, CharSequence charSequence) {
        m53758a(context, null, charSequence, 2000, null);
    }

    /* renamed from: a */
    private static boolean m53760a(Context context, ViewGroup viewGroup) {
        if (viewGroup != null || ((context instanceof Activity) && ((Activity) context).findViewById(16908290) != null)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m53758a(Context context, String str, CharSequence charSequence, long j, String str2) {
        m53756a(context, null, str, charSequence, j, str2);
    }

    /* renamed from: a */
    public static void m53756a(final Context context, final ViewGroup viewGroup, String str, final CharSequence charSequence, final long j, final String str2) {
        final boolean z;
        Handler handler = new Handler(Looper.getMainLooper());
        if (!m53760a(context, viewGroup)) {
            AppBrandLogger.m52830i("LarkToastManager", "isSupportCustomToast not support");
            handler.post(new Runnable() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.C13149b.RunnableC131501 */

                public void run() {
                    Context context = context;
                    if (context != null) {
                        UDToast.build(context).mo91643a(charSequence).mo91640a(-2L).mo91656k();
                    }
                }
            });
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                z = new JSONObject(str).optBoolean("mask");
            } catch (JSONException e) {
                e.printStackTrace();
                AppBrandLogger.m52829e("LarkToastManager", "show toast error", e);
            }
            AppBrandLogger.m52830i("LarkToastManager", "show toast");
            handler.post(new Runnable() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.C13149b.RunnableC131512 */

                public void run() {
                    for (C13153a aVar : C12989b.m53447a().f34594c) {
                        aVar.mo49212b();
                    }
                    C13153a a = C13153a.m53763a((Activity) context, viewGroup, z, charSequence, j, str2);
                    a.mo49206a(17);
                    a.mo49205a();
                }
            });
        }
        z = false;
        AppBrandLogger.m52830i("LarkToastManager", "show toast");
        handler.post(new Runnable() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.C13149b.RunnableC131512 */

            public void run() {
                for (C13153a aVar : C12989b.m53447a().f34594c) {
                    aVar.mo49212b();
                }
                C13153a a = C13153a.m53763a((Activity) context, viewGroup, z, charSequence, j, str2);
                a.mo49206a(17);
                a.mo49205a();
            }
        });
    }
}
