package com.ss.android.lark.integrator.p2019f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.core.content.res.C0760e;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.f.c */
public class C39407c {

    /* renamed from: a */
    public static ICoreApi f100744a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* renamed from: b */
    private static volatile boolean f100745b;

    /* renamed from: c */
    private static final PassportLog f100746c = PassportLog.f123351c.mo171474a();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.integrator.f.c$a */
    public interface AbstractC39416a {
        /* renamed from: a */
        void mo143253a(Bitmap bitmap);
    }

    /* renamed from: a */
    public static synchronized boolean m155646a() {
        boolean z;
        synchronized (C39407c.class) {
            z = f100745b;
        }
        return z;
    }

    /* renamed from: a */
    public static synchronized void m155645a(boolean z) {
        synchronized (C39407c.class) {
            f100745b = z;
        }
    }

    /* renamed from: a */
    public static void m155638a(Activity activity) {
        m155645a(true);
        Bundle bundle = new Bundle();
        bundle.putBoolean("transition", true);
        f100744a.launchMainWindow(activity, "", bundle);
    }

    /* renamed from: b */
    public static void m155647b(Activity activity) {
        if (!DesktopUtil.m144301a((Context) activity)) {
            PassportLog passportLog = f100746c;
            passportLog.mo171465b("TenantAnimSwitcher", "showSwitchAnimStageTwoIfNeed");
            if (m155646a()) {
                m155650d(activity);
            } else {
                passportLog.mo171465b("TenantAnimSwitcher", "do not needShowStageTwo");
            }
        }
    }

    /* renamed from: d */
    private static void m155650d(final Activity activity) {
        f100746c.mo171465b("TenantAnimSwitcher", "showSwitchAnimStageTwo now");
        m155645a(false);
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.integrator.p2019f.C39407c.RunnableC394135 */

            public void run() {
                C39407c.m155649c(activity);
            }
        });
    }

    /* renamed from: c */
    public static void m155649c(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        viewGroup.setCameraDistance(viewGroup.getContext().getResources().getDisplayMetrics().density * 15000.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(viewGroup, "rotationY", -90.0f, BitmapDescriptorFactory.HUE_RED).setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration);
        f100746c.mo171465b("TenantAnimSwitcher", "animatorSet start");
        animatorSet.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.f.c$b */
    public static class C39417b {

        /* renamed from: a */
        ViewGroup f100764a;

        /* renamed from: b */
        ImageView f100765b;

        public C39417b(ViewGroup viewGroup, ImageView imageView) {
            this.f100764a = viewGroup;
            this.f100765b = imageView;
        }
    }

    /* renamed from: a */
    public static C39417b m155637a(Activity activity, Bitmap bitmap) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        activity.getWindow().getDecorView().setBackground(C0760e.m3682a(activity.getResources(), R.drawable.signin_theme_background, null));
        ImageView imageView = new ImageView(activity);
        viewGroup.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
        imageView.setVisibility(0);
        return new C39417b(viewGroup, imageView);
    }

    /* renamed from: b */
    public static void m155648b(final Activity activity, final C39417b bVar) {
        if (!DesktopUtil.m144301a((Context) activity)) {
            f100746c.mo171465b("TenantAnimSwitcher", "showSwitchAnimStageOne");
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.integrator.p2019f.C39407c.RunnableC394103 */

                public void run() {
                    C39407c.m155644a(bVar, new AnimatorListenerAdapter() {
                        /* class com.ss.android.lark.integrator.p2019f.C39407c.RunnableC394103.C394111 */

                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            C39407c.m155638a(activity);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public static void m155639a(Activity activity, C39417b bVar) {
        if (!DesktopUtil.m144301a((Context) activity)) {
            f100746c.mo171465b("TenantAnimSwitcher", "showSwitchAnimAllStage");
            final ViewGroup viewGroup = bVar.f100764a;
            viewGroup.getChildAt(0).setVisibility(8);
            final ImageView imageView = bVar.f100765b;
            viewGroup.setCameraDistance(viewGroup.getContext().getResources().getDisplayMetrics().density * 15000.0f);
            ObjectAnimator duration = ObjectAnimator.ofFloat(viewGroup, "rotationY", BitmapDescriptorFactory.HUE_RED, 90.0f).setDuration(250L);
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.lark.integrator.p2019f.C39407c.C394092 */

                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    viewGroup.getChildAt(0).setVisibility(0);
                    viewGroup.removeView(imageView);
                }
            });
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(viewGroup, "rotationY", -90.0f, BitmapDescriptorFactory.HUE_RED).setDuration(250L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(duration).before(duration2);
            animatorSet.start();
        }
    }

    /* renamed from: a */
    public static void m155644a(C39417b bVar, final AnimatorListenerAdapter animatorListenerAdapter) {
        final ViewGroup viewGroup = bVar.f100764a;
        final ImageView imageView = bVar.f100765b;
        viewGroup.getChildAt(0).setVisibility(8);
        viewGroup.setCameraDistance(viewGroup.getContext().getResources().getDisplayMetrics().density * 15000.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(viewGroup, "rotationY", BitmapDescriptorFactory.HUE_RED, 90.0f).setDuration(200L);
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.integrator.p2019f.C39407c.C394124 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                viewGroup.getChildAt(0).setVisibility(0);
                viewGroup.removeView(imageView);
                AnimatorListenerAdapter animatorListenerAdapter = animatorListenerAdapter;
                if (animatorListenerAdapter != null) {
                    animatorListenerAdapter.onAnimationEnd(animator);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration);
        animatorSet.start();
    }

    /* renamed from: a */
    private static final void m155640a(Activity activity, PassportLog passportLog, final AbstractC39416a aVar) {
        final View rootView = ((ViewGroup) activity.findViewById(16908290)).getRootView();
        if (rootView == null) {
            passportLog.mo171471d("TenantAnimSwitcher", "getScreenshot view is null ");
            aVar.mo143253a(null);
            return;
        }
        final int width = rootView.getWidth();
        if (width <= 0) {
            passportLog.mo171471d("TenantAnimSwitcher", "getScreenshot view.getWidth() <= 0, view.getWidth() = " + width);
            aVar.mo143253a(null);
            return;
        }
        final int height = rootView.getHeight();
        if (height <= 0) {
            passportLog.mo171471d("TenantAnimSwitcher", "getScreenshot view.getHeight() <= 0, view.getHeight() = " + height);
            aVar.mo143253a(null);
        } else if (Build.VERSION.SDK_INT >= 26) {
            final Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            m155643a(activity.getWindow(), rootView, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                /* class com.ss.android.lark.integrator.p2019f.C39407c.PixelCopy$OnPixelCopyFinishedListenerC394146 */

                public void onPixelCopyFinished(int i) {
                    if (i == 0) {
                        aVar.mo143253a(createBitmap);
                    } else {
                        aVar.mo143253a(null);
                    }
                }
            });
        } else {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.integrator.p2019f.C39407c.RunnableC394157 */

                public void run() {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    rootView.draw(canvas);
                    canvas.setBitmap(null);
                    aVar.mo143253a(createBitmap);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m155641a(final Activity activity, boolean z, final PassportLog passportLog) {
        if (!DesktopUtil.m144301a((Context) activity) && !z) {
            passportLog.mo171465b("TenantAnimSwitcher", "showSwitchAnim");
            m155640a(activity, passportLog, new AbstractC39416a() {
                /* class com.ss.android.lark.integrator.p2019f.C39407c.C394081 */

                @Override // com.ss.android.lark.integrator.p2019f.C39407c.AbstractC39416a
                /* renamed from: a */
                public void mo143253a(Bitmap bitmap) {
                    if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
                        passportLog.mo171465b("TenantAnimSwitcher", "getScreenshot bitmap is invalid");
                        return;
                    }
                    C39417b a = C39407c.m155637a(activity, bitmap);
                    if (C39407c.f100744a.isInstanceOfMainActivity(activity)) {
                        C39407c.m155639a(activity, a);
                    } else {
                        C39407c.m155648b(activity, a);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private static void m155643a(Window window, View view, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        try {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            PixelCopy.request(window, new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight()), bitmap, onPixelCopyFinishedListener, handler);
        } catch (Throwable th) {
            f100746c.mo171462a("TenantAnimSwitcher", "screenshotAndroidO error", th);
            if (onPixelCopyFinishedListener != null) {
                handler.post(new Runnable(onPixelCopyFinishedListener) {
                    /* class com.ss.android.lark.integrator.p2019f.$$Lambda$c$7oKtshgBtvWnS_3Qqdd8OC7QvmU */
                    public final /* synthetic */ PixelCopy.OnPixelCopyFinishedListener f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void run() {
                        C39407c.lambda$7oKtshgBtvWnS_3Qqdd8OC7QvmU(this.f$0);
                    }
                });
            }
        }
    }
}
