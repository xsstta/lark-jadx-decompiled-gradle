package com.tt.miniapp.view.loading;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.tt.miniapphost.util.C67590h;

public class NewLoadingView extends FrameLayout {

    /* renamed from: A */
    AnimatorSet f169546A;

    /* renamed from: B */
    AnimatorSet f169547B;

    /* renamed from: C */
    AnimatorSet f169548C;

    /* renamed from: a */
    LoadingPoint f169549a;

    /* renamed from: b */
    LoadingPoint f169550b;

    /* renamed from: c */
    LoadingPoint f169551c;

    /* renamed from: d */
    int f169552d;

    /* renamed from: e */
    int f169553e;

    /* renamed from: f */
    int f169554f;

    /* renamed from: g */
    int[] f169555g;

    /* renamed from: h */
    int[] f169556h;

    /* renamed from: i */
    int[] f169557i;

    /* renamed from: j */
    RelativeLayout f169558j;

    /* renamed from: k */
    RelativeLayout f169559k;

    /* renamed from: l */
    RelativeLayout f169560l;

    /* renamed from: m */
    FrameLayout f169561m;

    /* renamed from: n */
    ObjectAnimator f169562n;

    /* renamed from: o */
    ObjectAnimator f169563o;

    /* renamed from: p */
    ObjectAnimator f169564p;

    /* renamed from: q */
    ObjectAnimator f169565q;

    /* renamed from: r */
    ObjectAnimator f169566r;

    /* renamed from: s */
    ObjectAnimator f169567s;

    /* renamed from: t */
    ObjectAnimator f169568t;

    /* renamed from: u */
    ObjectAnimator f169569u;

    /* renamed from: v */
    ObjectAnimator f169570v;

    /* renamed from: w */
    ObjectAnimator f169571w;

    /* renamed from: x */
    ObjectAnimator f169572x;

    /* renamed from: y */
    ObjectAnimator f169573y;

    /* renamed from: z */
    AnimatorSet f169574z;

    /* renamed from: b */
    public void mo233636b() {
        AnimatorSet animatorSet = this.f169574z;
        if (animatorSet != null) {
            if (animatorSet.isRunning()) {
                AppBrandLogger.m52828d("tma_NewLoadingView", "set.cancelDownload()");
                this.f169574z.removeAllListeners();
                this.f169574z.end();
                this.f169574z.cancel();
            }
            this.f169574z = null;
        }
    }

    /* renamed from: a */
    public void mo233633a() {
        LoadingPoint loadingPoint = this.f169549a;
        int[] iArr = this.f169555g;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(loadingPoint, "color", iArr[0], iArr[1]);
        this.f169562n = ofInt;
        ofInt.setDuration(300L);
        this.f169562n.setEvaluator(new ArgbEvaluator());
        this.f169562n.setRepeatMode(2);
        this.f169562n.setRepeatCount(-1);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f169549a, "scaleX", 1.0f, 1.2f);
        this.f169563o = ofFloat;
        ofFloat.setDuration(300L);
        this.f169563o.setInterpolator(new LinearInterpolator());
        this.f169563o.setRepeatMode(2);
        this.f169563o.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f169549a, "scaleY", 1.0f, 1.2f);
        this.f169564p = ofFloat2;
        ofFloat2.setDuration(300L);
        this.f169564p.setInterpolator(new LinearInterpolator());
        this.f169564p.setRepeatMode(2);
        this.f169564p.setRepeatCount(-1);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f169549a, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f169565q = ofFloat3;
        ofFloat3.setDuration(300L);
        this.f169565q.setInterpolator(new LinearInterpolator());
        this.f169565q.setRepeatMode(2);
        this.f169565q.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f169546A = animatorSet;
        animatorSet.playTogether(this.f169562n, this.f169563o, this.f169564p);
        LoadingPoint loadingPoint2 = this.f169550b;
        int[] iArr2 = this.f169556h;
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(loadingPoint2, "color", iArr2[0], iArr2[1]);
        this.f169566r = ofInt2;
        ofInt2.setDuration(300L);
        this.f169566r.setEvaluator(new ArgbEvaluator());
        this.f169566r.setRepeatMode(2);
        this.f169566r.setRepeatCount(-1);
        this.f169566r.setStartDelay(100);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f169550b, "scaleX", 1.0f, 1.2f);
        this.f169567s = ofFloat4;
        ofFloat4.setDuration(300L);
        this.f169567s.setInterpolator(new LinearInterpolator());
        this.f169567s.setRepeatMode(2);
        this.f169567s.setRepeatCount(-1);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f169550b, "scaleY", 1.0f, 1.2f);
        this.f169568t = ofFloat5;
        ofFloat5.setDuration(300L);
        this.f169568t.setInterpolator(new LinearInterpolator());
        this.f169568t.setRepeatMode(2);
        this.f169568t.setRepeatCount(-1);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f169550b, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f169569u = ofFloat6;
        ofFloat6.setDuration(300L);
        this.f169569u.setInterpolator(new LinearInterpolator());
        this.f169569u.setRepeatMode(2);
        this.f169569u.setRepeatCount(-1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f169547B = animatorSet2;
        animatorSet2.playTogether(this.f169566r, this.f169567s, this.f169568t);
        this.f169547B.setStartDelay(100);
        LoadingPoint loadingPoint3 = this.f169551c;
        int[] iArr3 = this.f169557i;
        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(loadingPoint3, "color", iArr3[0], iArr3[1]);
        this.f169570v = ofInt3;
        ofInt3.setDuration(300L);
        this.f169570v.setEvaluator(new ArgbEvaluator());
        this.f169570v.setRepeatMode(2);
        this.f169570v.setRepeatCount(-1);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f169551c, "scaleX", 1.0f, 1.2f);
        this.f169571w = ofFloat7;
        ofFloat7.setDuration(300L);
        this.f169571w.setInterpolator(new LinearInterpolator());
        this.f169571w.setRepeatMode(2);
        this.f169571w.setRepeatCount(-1);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f169551c, "scaleY", 1.0f, 1.2f);
        this.f169572x = ofFloat8;
        ofFloat8.setDuration(300L);
        this.f169572x.setInterpolator(new LinearInterpolator());
        this.f169572x.setRepeatMode(2);
        this.f169572x.setRepeatCount(-1);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f169551c, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f169573y = ofFloat9;
        ofFloat9.setDuration(300L);
        this.f169573y.setInterpolator(new LinearInterpolator());
        this.f169573y.setRepeatMode(2);
        this.f169573y.setRepeatCount(-1);
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f169548C = animatorSet3;
        animatorSet3.playTogether(this.f169570v, this.f169571w, this.f169572x);
        this.f169548C.setStartDelay(200);
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f169574z = animatorSet4;
        animatorSet4.playTogether(this.f169546A, this.f169547B, this.f169548C);
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        path.cubicTo(0.48f, 0.04f, 0.52f, 0.96f, 1.0f, 1.0f);
        this.f169574z.setInterpolator(PathInterpolatorCompat.create(0.48f, 0.04f, 0.52f, 0.96f));
        this.f169574z.start();
    }

    public void setLoadingPoint1AnimColor(int[] iArr) {
        this.f169555g = iArr;
    }

    public void setLoadingPoint1OrgColor(int i) {
        this.f169552d = i;
    }

    public void setLoadingPoint2AnimColor(int[] iArr) {
        this.f169556h = iArr;
    }

    public void setLoadingPoint2OrgColor(int i) {
        this.f169553e = i;
    }

    public void setLoadingPoint3AnimColor(int[] iArr) {
        this.f169557i = iArr;
    }

    public void setLoadingPoint3OrgColor(int i) {
        this.f169554f = i;
    }

    public NewLoadingView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo233634a(final double d) {
        this.f169549a.post(new Runnable() {
            /* class com.tt.miniapp.view.loading.NewLoadingView.RunnableC672001 */

            public void run() {
                NewLoadingView.this.f169549a.setColor(NewLoadingView.this.f169552d);
                NewLoadingView.this.f169549a.setAlpha(1.0f);
                NewLoadingView.this.f169549a.setScaleX(1.0f);
                NewLoadingView.this.f169549a.setScaleY(1.0f);
                NewLoadingView.this.f169549a.mo233628a((int) (((double) C67590h.m263065a(NewLoadingView.this.getContext(), 11.0f)) * d), 0);
            }
        });
        this.f169550b.post(new Runnable() {
            /* class com.tt.miniapp.view.loading.NewLoadingView.RunnableC672012 */

            public void run() {
                NewLoadingView.this.f169550b.setColor(NewLoadingView.this.f169553e);
                NewLoadingView.this.f169550b.setAlpha(1.0f);
                NewLoadingView.this.f169550b.setScaleX(1.0f);
                NewLoadingView.this.f169550b.setScaleY(1.0f);
                NewLoadingView.this.f169550b.mo233628a(0, 0);
            }
        });
        this.f169551c.post(new Runnable() {
            /* class com.tt.miniapp.view.loading.NewLoadingView.RunnableC672023 */

            public void run() {
                NewLoadingView.this.f169551c.setColor(NewLoadingView.this.f169554f);
                NewLoadingView.this.f169551c.setAlpha(1.0f);
                NewLoadingView.this.f169551c.setScaleX(1.0f);
                NewLoadingView.this.f169551c.setScaleY(1.0f);
                NewLoadingView.this.f169551c.mo233628a((int) (((double) (-C67590h.m263065a(NewLoadingView.this.getContext(), 12.0f))) * d), 0);
            }
        });
        invalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo233635a(Context context) {
        this.f169549a = new LoadingPoint(context);
        this.f169550b = new LoadingPoint(context);
        this.f169551c = new LoadingPoint(context);
        this.f169558j = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) C67590h.m263065a(context, 5.0f), (int) C67590h.m263065a(context, 8.0f));
        layoutParams.addRule(14);
        this.f169558j.addView(this.f169549a, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f169559k = relativeLayout;
        relativeLayout.addView(this.f169550b, layoutParams);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        this.f169560l = relativeLayout2;
        relativeLayout2.addView(this.f169551c, layoutParams);
        this.f169561m = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        this.f169561m.addView(this.f169558j, layoutParams2);
        this.f169561m.addView(this.f169559k, layoutParams2);
        this.f169561m.addView(this.f169560l, layoutParams2);
        addView(this.f169561m, new FrameLayout.LayoutParams(150, -2, 17));
    }

    public NewLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f169554f = Color.parseColor("#33FFFFFF");
        this.f169555g = new int[]{Color.parseColor("#4dFFFFFF"), Color.parseColor("#33FFFFFF")};
        this.f169556h = new int[]{Color.parseColor("#4dFFFFFF"), Color.parseColor("#33FFFFFF")};
        this.f169557i = new int[]{Color.parseColor("#4dFFFFFF"), Color.parseColor("#33FFFFFF")};
        mo233635a(context);
    }
}
