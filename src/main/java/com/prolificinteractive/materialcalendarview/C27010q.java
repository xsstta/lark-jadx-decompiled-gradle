package com.prolificinteractive.materialcalendarview;

import android.animation.Animator;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26990g;
import com.ss.ttm.player.MediaPlayer;

/* renamed from: com.prolificinteractive.materialcalendarview.q */
class C27010q {

    /* renamed from: a */
    public final TextView f67071a;

    /* renamed from: b */
    public final int f67072b;

    /* renamed from: c */
    public final Interpolator f67073c = new DecelerateInterpolator(2.0f);

    /* renamed from: d */
    public int f67074d = 0;

    /* renamed from: e */
    private AbstractC26990g f67075e;

    /* renamed from: f */
    private final int f67076f;

    /* renamed from: g */
    private final int f67077g;

    /* renamed from: h */
    private long f67078h = 0;

    /* renamed from: i */
    private CalendarDay f67079i = null;

    /* renamed from: a */
    public int mo96107a() {
        return this.f67074d;
    }

    /* renamed from: b */
    public void mo96112b(CalendarDay calendarDay) {
        this.f67079i = calendarDay;
    }

    /* renamed from: a */
    public void mo96108a(int i) {
        this.f67074d = i;
    }

    /* renamed from: a */
    public void mo96111a(AbstractC26990g gVar) {
        this.f67075e = gVar;
    }

    public C27010q(TextView textView) {
        this.f67071a = textView;
        Resources resources = textView.getResources();
        this.f67076f = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        this.f67072b = m98174a(resources, 17694720) / 2;
        this.f67077g = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
    }

    /* renamed from: a */
    public void mo96110a(CalendarDay calendarDay) {
        long currentTimeMillis = System.currentTimeMillis();
        if (calendarDay != null) {
            if (TextUtils.isEmpty(this.f67071a.getText()) || currentTimeMillis - this.f67078h < ((long) this.f67076f)) {
                m98175a(currentTimeMillis, calendarDay, false);
            }
            if (calendarDay.equals(this.f67079i)) {
                return;
            }
            if (calendarDay.mo95892c() != this.f67079i.mo95892c() || calendarDay.mo95889b() != this.f67079i.mo95889b()) {
                m98175a(currentTimeMillis, calendarDay, true);
            }
        }
    }

    /* renamed from: a */
    public void mo96109a(TextView textView, int i) {
        if (this.f67074d == 1) {
            textView.setTranslationX((float) i);
        } else {
            textView.setTranslationY((float) i);
        }
    }

    /* renamed from: a */
    public static int m98174a(Resources resources, int i) throws Resources.NotFoundException {
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
    private void m98175a(long j, CalendarDay calendarDay, boolean z) {
        int i;
        this.f67071a.animate().cancel();
        mo96109a(this.f67071a, 0);
        this.f67071a.setAlpha(1.0f);
        this.f67078h = j;
        final CharSequence a = this.f67075e.mo96015a(calendarDay);
        if (!z) {
            this.f67071a.setText(a);
        } else {
            int i2 = this.f67077g;
            if (this.f67079i.mo95887a(calendarDay)) {
                i = 1;
            } else {
                i = -1;
            }
            final int i3 = i2 * i;
            ViewPropertyAnimator animate = this.f67071a.animate();
            if (this.f67074d == 1) {
                animate.translationX((float) (i3 * -1));
            } else {
                animate.translationY((float) (i3 * -1));
            }
            animate.alpha(BitmapDescriptorFactory.HUE_RED).setDuration((long) this.f67072b).setInterpolator(this.f67073c).setListener(new C26983a() {
                /* class com.prolificinteractive.materialcalendarview.C27010q.C270111 */

                @Override // com.prolificinteractive.materialcalendarview.C26983a
                public void onAnimationCancel(Animator animator) {
                    C27010q qVar = C27010q.this;
                    qVar.mo96109a(qVar.f67071a, 0);
                    C27010q.this.f67071a.setAlpha(1.0f);
                }

                @Override // com.prolificinteractive.materialcalendarview.C26983a
                public void onAnimationEnd(Animator animator) {
                    C27010q.this.f67071a.setText(a);
                    C27010q qVar = C27010q.this;
                    qVar.mo96109a(qVar.f67071a, i3);
                    ViewPropertyAnimator animate = C27010q.this.f67071a.animate();
                    if (C27010q.this.f67074d == 1) {
                        animate.translationX(BitmapDescriptorFactory.HUE_RED);
                    } else {
                        animate.translationY(BitmapDescriptorFactory.HUE_RED);
                    }
                    animate.alpha(1.0f).setDuration((long) C27010q.this.f67072b).setInterpolator(C27010q.this.f67073c).setListener(new C26983a()).start();
                }
            }).start();
        }
        this.f67079i = calendarDay;
    }
}
