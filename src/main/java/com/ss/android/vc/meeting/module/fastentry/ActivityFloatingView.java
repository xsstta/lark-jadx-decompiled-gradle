package com.ss.android.vc.meeting.module.fastentry;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.thread.C26171w;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XSingleton;
import java.lang.ref.WeakReference;

@XClass(isSingleton = true)
public class ActivityFloatingView {

    /* renamed from: a */
    private WeakReference<Activity> f154662a;

    /* renamed from: b */
    private View f154663b;

    /* renamed from: c */
    private FrameLayout.LayoutParams f154664c;

    /* renamed from: d */
    private ViewPropertyAnimator f154665d;

    /* renamed from: e */
    private boolean f154666e;

    /* renamed from: f */
    private boolean f154667f;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.fastentry.ActivityFloatingView$a */
    public static class C61657a {

        /* renamed from: a */
        public static final ActivityFloatingView f154668a = new ActivityFloatingView();
    }

    private ActivityFloatingView() {
    }

    @XSingleton
    /* renamed from: b */
    public static ActivityFloatingView m240633b() {
        return C61657a.f154668a;
    }

    /* renamed from: a */
    public void mo213565a() {
        ViewPropertyAnimator viewPropertyAnimator;
        if (this.f154663b != null && (viewPropertyAnimator = this.f154665d) != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @XMethod
    public void removeView() {
        C60700b.m235851b("ActivityFloatingView", "[removeView]", this.f154667f + ", " + this.f154663b);
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.fastentry.$$Lambda$ActivityFloatingView$8el1Q4G1HlmyfQVO8LzETjSFVwk */

            public final void run() {
                ActivityFloatingView.this.m240637d();
            }
        });
    }

    /* renamed from: c */
    private void m240636c() {
        if (this.f154663b != null) {
            WeakReference<Activity> weakReference = this.f154662a;
            if (weakReference == null || weakReference.get() == null) {
                Activity c = VCAppLifeCycle.m236256c();
                if (c != null && !(c instanceof ByteRTCMeetingActivity)) {
                    this.f154662a = new WeakReference<>(c);
                } else {
                    return;
                }
            }
            C60700b.m235851b("ActivityFloatingView", "[attachViewToWindow]", this.f154667f + ", " + this.f154663b);
            if (this.f154667f) {
                if (this.f154663b.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.f154663b.getParent()).removeView(this.f154663b);
                }
                VideoChatModuleDependency.getMultiTaskDependency().mo196448a(this.f154663b, this.f154662a.get());
                return;
            }
            FrameLayout c2 = m240635c(this.f154662a.get());
            if (this.f154663b.getParent() == null || !(this.f154663b.getParent() instanceof ViewGroup)) {
                FrameLayout.LayoutParams layoutParams = this.f154664c;
                if (layoutParams != null) {
                    c2.addView(this.f154663b, layoutParams);
                } else {
                    c2.addView(this.f154663b);
                }
            } else {
                ViewGroup viewGroup = (ViewGroup) this.f154663b.getParent();
                if (viewGroup != c2) {
                    if (viewGroup != null) {
                        viewGroup.removeView(this.f154663b);
                    }
                    FrameLayout.LayoutParams layoutParams2 = this.f154664c;
                    if (layoutParams2 != null) {
                        c2.addView(this.f154663b, layoutParams2);
                    } else {
                        c2.addView(this.f154663b);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m240637d() {
        ViewGroup viewGroup;
        WeakReference<Activity> weakReference;
        if (this.f154667f) {
            if (this.f154663b == null || (weakReference = this.f154662a) == null || weakReference.get() == null) {
                View view = this.f154663b;
                if (view != null && (view.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.f154663b.getParent()).removeView(this.f154663b);
                }
            } else {
                C60700b.m235851b("ActivityFloatingView", "[removeView2]", "removeActivityFloatWindow");
                VideoChatModuleDependency.getMultiTaskDependency().mo196452b(this.f154663b, this.f154662a.get());
            }
            this.f154667f = false;
        } else {
            View view2 = this.f154663b;
            if (!(view2 == null || view2.getParent() == null || !(this.f154663b.getParent() instanceof ViewGroup) || (viewGroup = (ViewGroup) this.f154663b.getParent()) == null)) {
                viewGroup.removeView(this.f154663b);
            }
        }
        WeakReference<Activity> weakReference2 = this.f154662a;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.f154662a = null;
        }
        this.f154663b = null;
        this.f154664c = null;
        ViewPropertyAnimator viewPropertyAnimator = this.f154665d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f154665d = null;
        VideoChatModuleDependency.getLifeCycleDependency().removeActivityObserver(ActivityFloatingLifeCycle.m240666a());
    }

    /* renamed from: a */
    public void mo213569a(boolean z) {
        this.f154666e = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m240634b(long j) {
        View view = this.f154663b;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(j);
            this.f154665d = duration;
            duration.start();
        }
    }

    /* renamed from: c */
    private FrameLayout m240635c(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            return (FrameLayout) activity.getWindow().getDecorView();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public void mo213567a(Activity activity) {
        if (activity != null) {
            this.f154662a = new WeakReference<>(activity);
        }
        WeakReference<Activity> weakReference = this.f154662a;
        if (weakReference != null && weakReference.get() != null && this.f154663b != null) {
            m240636c();
        }
    }

    /* renamed from: b */
    public void mo213570b(Activity activity) {
        WeakReference<Activity> weakReference = this.f154662a;
        if ((weakReference != null && weakReference.get() == activity) || this.f154663b == null) {
            if (this.f154667f && this.f154663b != null) {
                VideoChatModuleDependency.getMultiTaskDependency().mo196452b(this.f154663b, this.f154662a.get());
            }
            WeakReference<Activity> weakReference2 = this.f154662a;
            if (weakReference2 != null) {
                weakReference2.clear();
                this.f154662a = null;
            }
        }
    }

    /* renamed from: a */
    public void mo213566a(long j) {
        View view = this.f154663b;
        if (view != null) {
            if (this.f154666e) {
                view.setAlpha(1.0f);
            } else if (j != 0) {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                C26171w.m94676a(new Runnable(j) {
                    /* class com.ss.android.vc.meeting.module.fastentry.$$Lambda$ActivityFloatingView$vJQlD6kd0UHkRXzQW6kCL86NhM */
                    public final /* synthetic */ long f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        ActivityFloatingView.this.m240634b((ActivityFloatingView) this.f$1);
                    }
                }, 400);
            }
        }
    }

    /* renamed from: a */
    public void mo213568a(View view, FrameLayout.LayoutParams layoutParams) {
        m240632a(view, layoutParams, false);
    }

    /* renamed from: a */
    private void m240632a(View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        VideoChatModuleDependency.getLifeCycleDependency().addActivityObserver(ActivityFloatingLifeCycle.m240666a());
        if (this.f154663b != null) {
            C60700b.m235851b("ActivityFloatingView", "[addViewInner]", "please remove view first");
            return;
        }
        C60700b.m235851b("ActivityFloatingView", "[addViewInner2]", z + ", " + view);
        this.f154667f = z;
        this.f154663b = view;
        this.f154664c = layoutParams;
        m240636c();
    }
}
