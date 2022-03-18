package com.bytedance.ee.bear.drive.biz.preview.screen;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1144ai;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.mimetype.MimeTypeCategory;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13727b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.drive.biz.preview.screen.a */
public class C6706a {

    /* renamed from: a */
    public View f18275a;

    /* renamed from: b */
    public View f18276b;

    /* renamed from: c */
    public Activity f18277c;

    /* renamed from: d */
    public int f18278d;

    /* renamed from: e */
    public int f18279e;

    /* renamed from: f */
    public boolean f18280f;

    /* renamed from: g */
    private boolean f18281g;

    /* renamed from: h */
    private View f18282h;

    /* renamed from: i */
    private AnimatorSet f18283i = new AnimatorSet();

    /* renamed from: j */
    private AnimatorSet f18284j = new AnimatorSet();

    /* renamed from: k */
    private AbstractC7095c f18285k;

    /* renamed from: l */
    private int f18286l;

    /* renamed from: m */
    private String f18287m;

    /* renamed from: n */
    private DriveFullScreenVM f18288n;

    /* renamed from: a */
    public boolean mo26423a() {
        return this.f18281g;
    }

    /* renamed from: c */
    public boolean mo26426c() {
        Activity activity = this.f18277c;
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo26427d() {
        this.f18283i.cancel();
        this.f18284j.cancel();
    }

    /* renamed from: g */
    private boolean m26450g() {
        if (this.f18285k.mo27717f(this.f18287m, null) || this.f18286l == 1) {
            return true;
        }
        if (!this.f18280f || (!C6892d.m27246d(this.f18287m) && !C6892d.m27249g(this.f18287m))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo26424b() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f18282h.getLayoutParams();
        if (this.f18282h.getId() == R.id.drive_sdk_preview_viewpager) {
            layoutParams.addRule(3, R.id.drive_sdk_main_title_bar_root_fl);
            layoutParams.addRule(2, R.id.drive_extra_fileinfo);
        }
        this.f18282h.setPadding(0, 0, 0, 0);
    }

    /* renamed from: e */
    private void m26448e() {
        Animator ofInt = ValueAnimator.ofInt(0);
        long j = (long) 100;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f18275a, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(j);
        View view = this.f18276b;
        if (view != null) {
            ofInt = ObjectAnimator.ofFloat(view, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(j);
        }
        this.f18283i.playTogether(duration, ofInt);
        this.f18283i.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.drive.biz.preview.screen.C6706a.C67071 */

            public void onAnimationEnd(Animator animator) {
                if (C6706a.this.f18276b != null) {
                    C6706a aVar = C6706a.this;
                    aVar.mo26418a(aVar.f18276b, 0);
                }
                if (C6706a.this.f18275a != null) {
                    C6706a aVar2 = C6706a.this;
                    aVar2.mo26418a(aVar2.f18275a, 0);
                }
            }
        });
        Animator ofInt2 = ValueAnimator.ofInt(0);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f18275a, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(j);
        View view2 = this.f18276b;
        if (view2 != null) {
            ofInt2 = ObjectAnimator.ofFloat(view2, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(j);
        }
        this.f18284j.playTogether(duration2, ofInt2);
        this.f18284j.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.drive.biz.preview.screen.C6706a.C67082 */

            public void onAnimationStart(Animator animator) {
                if (C6706a.this.f18276b != null) {
                    C6706a.this.f18276b.setVisibility(0);
                    C6706a aVar = C6706a.this;
                    aVar.mo26418a(aVar.f18276b, C6706a.this.f18278d);
                }
                if (C6706a.this.f18275a != null) {
                    C6706a.this.f18275a.setVisibility(0);
                    C6706a aVar2 = C6706a.this;
                    aVar2.mo26418a(aVar2.f18275a, C6706a.this.f18279e);
                }
            }
        });
    }

    /* renamed from: f */
    private void m26449f() {
        this.f18283i = new AnimatorSet();
        this.f18284j = new AnimatorSet();
        Animator ofInt = ValueAnimator.ofInt(0);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0);
        long j = (long) 100;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f18275a, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(j);
        View view = this.f18276b;
        if (view != null) {
            ofInt = ObjectAnimator.ofFloat(view, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(j);
        }
        if (this.f18285k.mo27717f(this.f18287m, null)) {
            ofInt2 = C13727b.m55678a(this.f18275a, this.f18279e, 0).setDuration(j);
        }
        this.f18283i.playTogether(duration, ofInt, ofInt2);
        this.f18283i.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.drive.biz.preview.screen.C6706a.C67093 */

            public void onAnimationEnd(Animator animator) {
                if (C6706a.this.f18276b != null) {
                    C6706a.this.f18276b.setVisibility(4);
                }
                if (C6706a.this.f18275a != null) {
                    C6706a.this.f18275a.setVisibility(8);
                }
            }
        });
        Animator ofInt3 = ValueAnimator.ofInt(0);
        ValueAnimator ofInt4 = ValueAnimator.ofInt(0);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f18275a, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(j);
        View view2 = this.f18276b;
        if (view2 != null) {
            ofInt3 = ObjectAnimator.ofFloat(view2, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(j);
        }
        if (this.f18285k.mo27717f(this.f18287m, null)) {
            ofInt4 = C13727b.m55678a(this.f18275a, 0, this.f18279e).setDuration(j);
        }
        this.f18284j.playTogether(duration2, ofInt3, ofInt4);
        this.f18284j.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.drive.biz.preview.screen.C6706a.C67104 */

            public void onAnimationStart(Animator animator) {
                if (C6706a.this.f18276b != null) {
                    C6706a.this.f18276b.setVisibility(0);
                }
                if (C6706a.this.f18275a != null) {
                    C6706a.this.f18275a.setVisibility(0);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo26416a(int i) {
        if (this.f18280f) {
            this.f18282h.setBackgroundColor(i);
        } else {
            mo26425b(i);
        }
    }

    /* renamed from: b */
    private void m26444b(String str) {
        m26442a(this.f18277c.getResources().getColor(R.color.static_black), str);
    }

    /* renamed from: c */
    private void m26445c(String str) {
        m26442a(this.f18277c.getResources().getColor(R.color.bg_base), str);
    }

    /* renamed from: d */
    private void m26446d(String str) {
        m26442a(this.f18277c.getResources().getColor(R.color.static_black), str);
    }

    /* renamed from: e */
    private int m26447e(String str) {
        int i;
        Resources resources = this.f18277c.getResources();
        if (this.f18285k.mo27724m(str, null)) {
            i = R.color.static_white;
        } else {
            i = R.color.bg_body_overlay;
        }
        return resources.getColor(i);
    }

    /* renamed from: b */
    public void mo26425b(int i) {
        Activity activity = this.f18277c;
        if (activity != null && activity.getWindow() != null) {
            this.f18277c.getWindow().getDecorView().setBackgroundColor(i);
        }
    }

    /* renamed from: a */
    public void mo26420a(String str) {
        if (mo26426c()) {
            mo26422a(!this.f18281g, str);
        }
    }

    /* renamed from: a */
    public void mo26421a(boolean z) {
        if (mo26426c()) {
            if (z) {
                this.f18281g = true;
                int color = this.f18277c.getResources().getColor(R.color.static_black);
                this.f18277c.getWindow().setStatusBarColor(color);
                this.f18277c.getWindow().setNavigationBarColor(color);
                mo26416a(color);
                View view = this.f18276b;
                if (view != null) {
                    m26443b(view, 0);
                }
                m26443b(this.f18275a, 0);
            } else {
                this.f18281g = false;
                this.f18277c.getWindow().setStatusBarColor(this.f18288n.getOriginStatusBarColor());
                this.f18277c.getWindow().setNavigationBarColor(this.f18288n.getOriginNavigationBarColor());
                mo26416a(m26447e("PNG"));
                View view2 = this.f18276b;
                if (view2 != null) {
                    m26443b(view2, this.f18278d);
                }
                m26443b(this.f18275a, this.f18279e);
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f18282h.getLayoutParams();
            layoutParams.alignWithParent = true;
            this.f18282h.setLayoutParams(layoutParams);
            this.f18288n.getLiveFullScreen().mo5926a(Boolean.valueOf(this.f18281g));
        }
    }

    /* renamed from: b */
    private void m26443b(View view, int i) {
        view.getLayoutParams().height = i;
        view.requestLayout();
    }

    /* renamed from: a */
    public void mo26418a(View view, int i) {
        view.getLayoutParams().height = i;
        view.requestLayout();
    }

    /* renamed from: a */
    private void m26442a(final int i, String str) {
        this.f18283i.cancel();
        this.f18284j.cancel();
        if (m26450g()) {
            m26449f();
        }
        if (this.f18281g) {
            this.f18283i.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.ee.bear.drive.biz.preview.screen.C6706a.C67115 */

                public void onAnimationEnd(Animator animator) {
                    if (C6706a.this.mo26426c() && !C6706a.this.f18280f) {
                        C6706a.this.mo26416a(i);
                        C6706a.this.f18277c.getWindow().setStatusBarColor(i);
                        C6706a.this.f18277c.getWindow().setNavigationBarColor(i);
                    }
                }
            });
            this.f18283i.start();
            return;
        }
        if (!this.f18280f) {
            this.f18277c.getWindow().setStatusBarColor(this.f18288n.getOriginStatusBarColor());
            this.f18277c.getWindow().setNavigationBarColor(this.f18288n.getOriginNavigationBarColor());
            mo26416a(m26447e(str));
        }
        this.f18284j.start();
    }

    /* renamed from: a */
    public void mo26417a(Activity activity, boolean z) {
        if (!C13726a.m55676b(activity) || activity.getWindow() == null) {
            C13479a.m54775e("DRIVE_PREVIEW_FLOW", "requestVideoFullScreen, activity=" + activity);
            return;
        }
        if (z) {
            activity.getWindow().addFlags(1024);
            this.f18275a.setVisibility(8);
        } else {
            activity.getWindow().clearFlags(1024);
            this.f18275a.setVisibility(0);
        }
        this.f18281g = z;
        this.f18288n.getLiveFullScreen().mo5926a(Boolean.valueOf(this.f18281g));
    }

    /* renamed from: a */
    public void mo26422a(boolean z, String str) {
        int i;
        if (mo26426c()) {
            this.f18281g = z;
            if (this.f18285k.mo27717f(str, null)) {
                m26445c(str);
            } else if (this.f18285k.mo27715d(str, null)) {
                m26444b(str);
            } else if (this.f18285k.mo27714c(str, null)) {
                m26446d(str);
            } else {
                if (C6892d.m27245c(this.f18287m)) {
                    i = R.color.bg_body;
                } else {
                    i = R.color.bg_body_overlay;
                }
                m26442a(this.f18277c.getResources().getColor(i), str);
            }
            this.f18288n.getLiveFullScreen().mo5926a(Boolean.valueOf(this.f18281g));
        }
    }

    /* renamed from: a */
    public void mo26419a(MimeTypeCategory mimeTypeCategory, String str, int i, boolean z) {
        if (mo26426c()) {
            this.f18287m = str;
            this.f18286l = i;
            if (mimeTypeCategory == MimeTypeCategory.IMAGE || z) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f18282h.getLayoutParams();
                layoutParams.removeRule(3);
                layoutParams.removeRule(2);
                return;
            }
            mo26424b();
        }
    }

    public C6706a(AbstractC7095c cVar, View view, View view2, View view3, boolean z, FragmentActivity fragmentActivity) {
        boolean z2 = false;
        this.f18280f = false;
        this.f18286l = 0;
        this.f18285k = cVar;
        this.f18275a = view;
        this.f18276b = view2;
        this.f18282h = view3;
        this.f18280f = z;
        this.f18277c = fragmentActivity;
        if (mo26426c()) {
            this.f18278d = this.f18277c.getResources().getDimensionPixelSize(R.dimen.drive_main_page_file_extra_view);
            this.f18279e = this.f18277c.getResources().getDimensionPixelSize(R.dimen.drive_main_page_title_bar_height);
            m26448e();
        }
        DriveFullScreenVM bVar = (DriveFullScreenVM) new C1144ai(fragmentActivity).mo6005a(DriveFullScreenVM.class);
        this.f18288n = bVar;
        if (bVar.getLiveFullScreen().mo5927b() != null && this.f18288n.getLiveFullScreen().mo5927b().booleanValue()) {
            z2 = true;
        }
        this.f18281g = z2;
    }
}
