package com.ss.android.lark.widget.photo_picker.gallery.pageturner;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.widget.photo_picker.p2951f.C58662k;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.pageturner.a */
public class C58822a {

    /* renamed from: a */
    public PageTurner f145377a;

    /* renamed from: b */
    public PageTurner f145378b;

    /* renamed from: c */
    public AbstractC58827a f145379c;

    /* renamed from: d */
    private View f145380d;

    /* renamed from: e */
    private boolean f145381e = true;

    /* renamed from: f */
    private ValueAnimator f145382f;

    /* renamed from: g */
    private ValueAnimator f145383g;

    /* renamed from: h */
    private int[] f145384h = new int[2];

    /* renamed from: i */
    private int[] f145385i = new int[2];

    /* renamed from: j */
    private boolean f145386j = true;

    /* renamed from: k */
    private boolean f145387k = true;

    /* renamed from: l */
    private Context f145388l;

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.pageturner.a$a */
    public interface AbstractC58827a {
        /* renamed from: a */
        void mo199005a(int i);
    }

    /* renamed from: b */
    public void mo199271b() {
        this.f145382f.cancel();
        this.f145383g.cancel();
    }

    /* renamed from: c */
    public void mo199273c() {
        this.f145381e = false;
        this.f145377a.setVisibility(4);
        this.f145378b.setVisibility(4);
    }

    /* renamed from: d */
    private void m228091d() {
        this.f145377a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.pageturner.C58822a.View$OnClickListenerC588231 */

            public void onClick(View view) {
                if (C58822a.this.f145379c != null) {
                    C58822a.this.f145379c.mo199005a(0);
                }
            }
        });
        this.f145378b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.pageturner.C58822a.View$OnClickListenerC588242 */

            public void onClick(View view) {
                if (C58822a.this.f145379c != null) {
                    C58822a.this.f145379c.mo199005a(1);
                }
            }
        });
        m228093e();
    }

    /* renamed from: a */
    public void mo199266a() {
        if (this.f145381e) {
            this.f145377a.setViewHovered(false);
            this.f145378b.setViewHovered(false);
            if (!this.f145383g.isRunning()) {
                this.f145382f.cancel();
                this.f145383g.start();
            }
        }
    }

    /* renamed from: e */
    private void m228093e() {
        this.f145382f = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(300L);
        this.f145383g = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(300L);
        this.f145382f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.pageturner.C58822a.C588253 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C58822a.this.f145378b.setAlpha(floatValue);
                C58822a.this.f145377a.setAlpha(floatValue);
            }
        });
        this.f145383g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.pageturner.C58822a.C588264 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C58822a.this.f145378b.setAlpha(floatValue);
                C58822a.this.f145377a.setAlpha(floatValue);
                if (floatValue == BitmapDescriptorFactory.HUE_RED) {
                    C58822a.this.f145378b.setVisibility(4);
                    C58822a.this.f145377a.setVisibility(4);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo199269a(AbstractC58827a aVar) {
        this.f145379c = aVar;
    }

    /* renamed from: a */
    public void mo199270a(boolean z) {
        this.f145387k = z;
        if (!z) {
            this.f145377a.setVisibility(4);
        }
    }

    /* renamed from: b */
    private void m228089b(MotionEvent motionEvent) {
        boolean a = C58662k.m227537a(this.f145377a, motionEvent);
        this.f145378b.setViewHovered(C58662k.m227537a(this.f145378b, motionEvent));
        this.f145377a.setViewHovered(a);
    }

    /* renamed from: d */
    private boolean m228092d(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (motionEvent.getX() >= ((float) (this.f145384h[0] - UIUtils.dp2px(this.f145388l, 50.0f)))) {
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getY() <= 80.0f || motionEvent.getY() >= ((float) (this.f145380d.getHeight() - 80))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo199272b(boolean z) {
        this.f145386j = z;
        if (!z) {
            this.f145378b.setVisibility(4);
        }
    }

    /* renamed from: c */
    private boolean m228090c(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (motionEvent.getX() <= ((float) (this.f145385i[0] + this.f145377a.getWidth() + UIUtils.dp2px(this.f145388l, 50.0f)))) {
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getY() <= 80.0f || motionEvent.getY() >= ((float) (this.f145380d.getHeight() - 80))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo199267a(MotionEvent motionEvent) {
        int i;
        if (this.f145381e) {
            m228089b(motionEvent);
            if (!this.f145382f.isRunning()) {
                if (this.f145378b.getVisibility() != 0 || this.f145377a.getVisibility() != 0) {
                    if (this.f145377a.getVisibility() == 0 && !this.f145386j) {
                        return;
                    }
                    if (this.f145378b.getVisibility() != 0 || this.f145387k) {
                        PageTurner pageTurner = this.f145378b;
                        int i2 = 0;
                        if (this.f145386j) {
                            i = 0;
                        } else {
                            i = 4;
                        }
                        pageTurner.setVisibility(i);
                        PageTurner pageTurner2 = this.f145377a;
                        if (!this.f145387k) {
                            i2 = 4;
                        }
                        pageTurner2.setVisibility(i2);
                        this.f145378b.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        this.f145377a.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        this.f145383g.cancel();
                        this.f145382f.start();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo199268a(MotionEvent motionEvent, boolean z) {
        this.f145378b.getLocationInWindow(this.f145384h);
        this.f145377a.getLocationInWindow(this.f145385i);
        if (m228092d(motionEvent) || m228090c(motionEvent)) {
            mo199267a(motionEvent);
        } else if (z) {
            mo199266a();
        }
    }

    public C58822a(Context context, PageTurner pageTurner, PageTurner pageTurner2, View view) {
        this.f145388l = context;
        this.f145377a = pageTurner;
        this.f145378b = pageTurner2;
        this.f145380d = view;
        m228091d();
    }
}
