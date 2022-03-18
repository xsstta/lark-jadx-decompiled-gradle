package com.ss.android.lark.feed.app.view;

import android.animation.ValueAnimator;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent;
import com.ss.android.lark.feed.app.shortcut.ShortCutStausManager;
import com.ss.android.lark.feed.app.shortcut.ShortcutBtnItemView;
import com.ss.android.lark.feed.statistics.shortcut.ShortcutHitPoint;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.feed.app.view.i */
public class C37997i {

    /* renamed from: a */
    public final RecyclerView f97548a;

    /* renamed from: b */
    public final ShortCutCoverView f97549b;

    /* renamed from: c */
    public final View f97550c;

    /* renamed from: d */
    public final LinearLayout.LayoutParams f97551d;

    /* renamed from: e */
    public final FrameLayout.LayoutParams f97552e;

    /* renamed from: f */
    public final FrameLayout.LayoutParams f97553f;

    /* renamed from: g */
    public int f97554g;

    /* renamed from: h */
    public final int f97555h = UIHelper.dp2px(60.0f);

    /* renamed from: i */
    public final int f97556i = UIHelper.dp2px(C38004j.f97573a);

    /* renamed from: j */
    private ShortcutBtnItemView f97557j;

    /* renamed from: k */
    private final Interpolator f97558k = PathInterpolatorCompat.create(0.26f, 1.0f, 0.48f, 1.0f);

    /* renamed from: l */
    private int f97559l;

    /* renamed from: m */
    private int f97560m;

    /* renamed from: n */
    private final int f97561n = UIHelper.dp2px(C38004j.f97575c);

    /* renamed from: b */
    public void mo139061b() {
        this.f97548a.setLayoutParams(this.f97551d);
        this.f97549b.setLayoutParams(this.f97552e);
        this.f97550c.setLayoutParams(this.f97553f);
    }

    /* renamed from: c */
    public void mo139063c() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f97548a.getLayoutParams();
        if (layoutParams.height == this.f97556i) {
            ShortCutStausManager.m148791a().mo138568a(ShortCutStausManager.ShortCutStatus.CLOSE);
        } else if (layoutParams.height == ShortCutStausManager.m148791a().mo138581h()) {
            ShortCutStausManager.m148791a().mo138568a(ShortCutStausManager.ShortCutStatus.OPEN);
        } else {
            ShortCutStausManager.m148791a().mo138568a(ShortCutStausManager.ShortCutStatus.OPENDING);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.feed.app.view.i$6 */
    public static /* synthetic */ class C380036 {

        /* renamed from: a */
        static final /* synthetic */ int[] f97572a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent$AnimationStatus[] r0 = com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent.AnimationStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.feed.app.view.C37997i.C380036.f97572a = r0
                com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent$AnimationStatus r1 = com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent.AnimationStatus.OPEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.feed.app.view.C37997i.C380036.f97572a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent$AnimationStatus r1 = com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent.AnimationStatus.CLOSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.feed.app.view.C37997i.C380036.f97572a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent$AnimationStatus r1 = com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent.AnimationStatus.OPENDING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.feed.app.view.C37997i.C380036.f97572a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent$AnimationStatus r1 = com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent.AnimationStatus.TOUCH_UP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.feed.app.view.C37997i.C380036.f97572a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent$AnimationStatus r1 = com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent.AnimationStatus.UPDATE_SHORTCUT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.feed.app.view.C37997i.C380036.f97572a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent$AnimationStatus r1 = com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent.AnimationStatus.TENANT_CHANGE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.view.C37997i.C380036.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo139059a() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f97548a.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f97549b.getLayoutParams();
        layoutParams2.height = 0;
        layoutParams.height = this.f97556i;
        this.f97548a.setLayoutParams(layoutParams);
        this.f97549b.setLayoutParams(layoutParams2);
        if (!ShortCutStausManager.m148791a().mo138578e()) {
            ShortcutHitPoint.m149842b(false);
            mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.ROTATE_BTN, BitmapDescriptorFactory.HUE_RED));
            mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.BADGE_ALPHA, BitmapDescriptorFactory.HUE_RED));
            mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.BTN_TEXT, BitmapDescriptorFactory.HUE_RED));
            ShortCutStausManager.m148791a().mo138568a(ShortCutStausManager.ShortCutStatus.CLOSE);
        }
    }

    /* renamed from: d */
    public void mo139064d() {
        if (this.f97548a.getAdapter().getItemCount() > ShortCutStausManager.m148791a().mo138579f()) {
            for (int i = 0; i < this.f97548a.getAdapter().getItemCount(); i++) {
                if (this.f97548a.getLayoutManager().findViewByPosition(i) instanceof ShortcutBtnItemView) {
                    this.f97557j = (ShortcutBtnItemView) this.f97548a.getLayoutManager().findViewByPosition(i);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo139062b(ShortcutAnimationEvent shortcutAnimationEvent) {
        ShortcutBtnItemView shortcutBtnItemView = this.f97557j;
        if (shortcutBtnItemView != null) {
            shortcutBtnItemView.mo138583a(shortcutAnimationEvent);
        }
    }

    /* renamed from: a */
    public void mo139060a(ShortcutAnimationEvent shortcutAnimationEvent) {
        ShortcutBtnItemView shortcutBtnItemView = this.f97557j;
        if (shortcutBtnItemView == null || shortcutBtnItemView.getParent() == null) {
            mo139064d();
        }
        if (shortcutAnimationEvent != null) {
            final int min = Math.min(DeviceUtils.getScreenHeight(this.f97548a.getContext()), ShortCutStausManager.m148791a().mo138581h());
            switch (C380036.f97572a[shortcutAnimationEvent.mo138461c().ordinal()]) {
                case 1:
                    mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.BTN_TEXT, 1.0f));
                    ShortcutHitPoint.m149839a(false);
                    ShortCutStausManager.m148791a().mo138568a(ShortCutStausManager.ShortCutStatus.OPENDING);
                    ShortCutStausManager.m148791a().mo138570a(true);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                    ofFloat.setDuration(300L);
                    ofFloat.setRepeatCount(0);
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.ss.android.lark.feed.app.view.C37997i.C379981 */

                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            C37997i.this.f97551d.height = (int) (((float) C37997i.this.f97556i) + (((float) (min - C37997i.this.f97556i)) * floatValue));
                            C37997i.this.f97553f.height = C37997i.this.f97551d.height - C37997i.this.f97556i;
                            C37997i.this.f97550c.setLayoutParams(C37997i.this.f97553f);
                            C37997i.this.f97548a.setLayoutParams(C37997i.this.f97551d);
                            C37997i.this.f97550c.setAlpha(1.0f - (((floatValue - 0.2f) * 10.0f) / 8.0f));
                            C37997i.this.mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.ROTATE_BTN, (((float) (C37997i.this.f97551d.height - C37997i.this.f97556i)) * 1.0f) / ((float) (min - C37997i.this.f97556i))));
                            C37997i.this.mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.BADGE_ALPHA, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                            if (floatValue == 1.0f) {
                                C37997i.this.f97553f.height = 0;
                                C37997i.this.f97551d.height = ShortCutStausManager.m148791a().mo138581h();
                                C37997i.this.mo139061b();
                                ShortCutStausManager.m148791a().mo138568a(ShortCutStausManager.ShortCutStatus.OPEN);
                                ShortCutStausManager.m148791a().mo138570a(false);
                            }
                        }
                    });
                    ofFloat.start();
                    return;
                case 2:
                    mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.BTN_TEXT, BitmapDescriptorFactory.HUE_RED));
                    ShortcutHitPoint.m149842b(true);
                    ShortCutStausManager.m148791a().mo138568a(ShortCutStausManager.ShortCutStatus.OPENDING);
                    ShortCutStausManager.m148791a().mo138570a(true);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                    ofFloat2.setDuration(300L);
                    ofFloat2.setRepeatCount(0);
                    ofFloat2.setInterpolator(this.f97558k);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.ss.android.lark.feed.app.view.C37997i.C379992 */

                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            C37997i.this.f97551d.height = (int) (((float) C37997i.this.f97556i) + (((float) (min - C37997i.this.f97556i)) * (1.0f - floatValue)));
                            C37997i.this.f97553f.height = C37997i.this.f97551d.height - C37997i.this.f97556i;
                            C37997i.this.f97550c.setAlpha(floatValue * 1.0f);
                            C37997i.this.mo139061b();
                            C37997i.this.mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.ROTATE_BTN, (((float) (C37997i.this.f97551d.height - C37997i.this.f97556i)) * 1.0f) / ((float) (min - C37997i.this.f97556i))));
                            C37997i.this.mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.BADGE_ALPHA, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                            if (floatValue == 1.0f) {
                                ShortCutStausManager.m148791a().mo138568a(ShortCutStausManager.ShortCutStatus.CLOSE);
                                ShortCutStausManager.m148791a().mo138570a(false);
                            }
                        }
                    });
                    ofFloat2.start();
                    ShortCutStausManager.m148791a().mo138568a(ShortCutStausManager.ShortCutStatus.CLOSE);
                    return;
                case 3:
                    if (ShortCutStausManager.m148791a().mo138578e()) {
                        this.f97551d.height = this.f97556i;
                    }
                    if (this.f97548a.getAdapter().getItemCount() > ShortCutStausManager.m148791a().mo138579f()) {
                        if (ShortCutStausManager.m148791a().mo138578e()) {
                            ShortcutHitPoint.m149839a(true);
                        }
                        float b = shortcutAnimationEvent.mo138460b();
                        int i = this.f97559l;
                        if (b * ((float) i) < BitmapDescriptorFactory.HUE_RED) {
                            this.f97559l = 0;
                        } else {
                            this.f97559l = (int) (((float) i) + shortcutAnimationEvent.mo138460b());
                        }
                        if (Math.abs(this.f97559l) > 3) {
                            this.f97560m = this.f97559l;
                        }
                        float b2 = (float) ((int) shortcutAnimationEvent.mo138460b());
                        this.f97551d.height += (int) (b2 / ((float) ((this.f97551d.height + 600) / 600)));
                        LinearLayout.LayoutParams layoutParams = this.f97551d;
                        layoutParams.height = Math.max(layoutParams.height, this.f97556i);
                        if (this.f97552e.height < this.f97555h && this.f97551d.height - this.f97556i > this.f97555h && !DesktopUtil.m144307b()) {
                            ((Vibrator) this.f97548a.getContext().getSystemService("vibrator")).vibrate(new long[]{10, 100}, -1);
                        }
                        this.f97552e.height = Math.max(0, this.f97551d.height - this.f97556i);
                        this.f97553f.height = this.f97552e.height;
                        this.f97549b.setCircleValues(this.f97551d.height - this.f97556i);
                        mo139061b();
                        mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.ROTATE_BTN, Math.min(1.0f, (((float) (this.f97551d.height - this.f97556i)) * 1.0f) / ((float) (ShortCutStausManager.m148791a().mo138581h() - this.f97556i)))));
                        if (this.f97551d.height == this.f97556i) {
                            ShortCutStausManager.m148791a().mo138568a(ShortCutStausManager.ShortCutStatus.CLOSE);
                            return;
                        } else {
                            ShortCutStausManager.m148791a().mo138568a(ShortCutStausManager.ShortCutStatus.OPENDING);
                            return;
                        }
                    } else {
                        return;
                    }
                case 4:
                    if (ShortCutStausManager.m148791a().mo138575c()) {
                        ShortCutStausManager.m148791a().mo138570a(true);
                        if (this.f97551d.height < this.f97556i + this.f97555h || this.f97560m < 0) {
                            this.f97550c.setAlpha(1.0f);
                            this.f97553f.height = 0;
                            this.f97550c.setLayoutParams(this.f97553f);
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                            ofFloat3.setDuration(300L);
                            ofFloat3.setRepeatCount(0);
                            ofFloat3.setInterpolator(this.f97558k);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                /* class com.ss.android.lark.feed.app.view.C37997i.C380003 */

                                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    C37997i.this.f97551d.height = (int) (((float) C37997i.this.f97556i) + (((float) (C37997i.this.f97551d.height - C37997i.this.f97556i)) * (1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())));
                                    C37997i.this.f97552e.height = (int) (((float) C37997i.this.f97552e.height) * (1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                                    C37997i.this.f97549b.setCircleValues(C37997i.this.f97551d.height - C37997i.this.f97556i);
                                    C37997i.this.mo139061b();
                                    C37997i.this.mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.ROTATE_BTN, Math.min(1.0f, (((float) (C37997i.this.f97551d.height - C37997i.this.f97556i)) * 1.0f) / ((float) (min - C37997i.this.f97556i)))));
                                    if (((Float) valueAnimator.getAnimatedValue()).floatValue() == 1.0f) {
                                        C37997i.this.mo139063c();
                                        ShortCutStausManager.m148791a().mo138570a(false);
                                    }
                                }
                            });
                            ofFloat3.start();
                            return;
                        }
                        this.f97549b.setShowCircle(false);
                        this.f97548a.setLayoutParams(this.f97552e);
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                        ofFloat4.setDuration(300L);
                        ofFloat4.setRepeatCount(0);
                        ofFloat4.setInterpolator(this.f97558k);
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            /* class com.ss.android.lark.feed.app.view.C37997i.C380014 */

                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                C37997i.this.f97551d.height = (int) (((float) C37997i.this.f97551d.height) + (((float) (min - C37997i.this.f97551d.height)) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                                C37997i.this.f97553f.height = C37997i.this.f97551d.height - C37997i.this.f97556i;
                                FrameLayout.LayoutParams layoutParams = C37997i.this.f97552e;
                                int i = C37997i.this.f97551d.height;
                                C37997i iVar = C37997i.this;
                                int i2 = iVar.f97554g;
                                iVar.f97554g = i2 + 1;
                                layoutParams.height = Math.max(0, i - ((DeviceUtils.getScreenHeight(C37997i.this.f97548a.getContext()) / 10) * i2));
                                C37997i.this.f97549b.setCircleValues(C37997i.this.f97551d.height - C37997i.this.f97556i);
                                C37997i.this.mo139061b();
                                C37997i.this.f97550c.setAlpha(1.0f - (((floatValue - 0.2f) * 10.0f) / 8.0f));
                                C37997i.this.mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.ROTATE_BTN, Math.min(1.0f, (((float) (C37997i.this.f97551d.height - C37997i.this.f97556i)) * 1.0f) / ((float) (min - C37997i.this.f97556i)))));
                                C37997i.this.mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.BADGE_ALPHA, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                                C37997i.this.mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.BTN_TEXT, 1.0f));
                                if (((Float) valueAnimator.getAnimatedValue()).floatValue() == 1.0f) {
                                    C37997i.this.f97551d.height = ShortCutStausManager.m148791a().mo138581h();
                                    C37997i.this.f97548a.setLayoutParams(C37997i.this.f97551d);
                                    C37997i.this.f97553f.height = 0;
                                    C37997i.this.f97552e.height = 0;
                                    C37997i.this.f97554g = 0;
                                    C37997i.this.f97550c.setAlpha(1.0f);
                                    C37997i.this.mo139061b();
                                    C37997i.this.f97549b.setShowCircle(true);
                                    C37997i.this.f97550c.setAlpha(BitmapDescriptorFactory.HUE_RED);
                                    C37997i.this.mo139063c();
                                    ShortCutStausManager.m148791a().mo138570a(false);
                                }
                            }
                        });
                        ofFloat4.start();
                        return;
                    }
                    return;
                case 5:
                    int itemCount = ((this.f97548a.getAdapter().getItemCount() + ShortCutStausManager.m148791a().mo138579f()) - 1) / ShortCutStausManager.m148791a().mo138579f();
                    int i2 = (this.f97556i * itemCount) + this.f97561n;
                    ShortCutStausManager.m148791a().mo138574c(itemCount);
                    ShortCutStausManager.m148791a().mo138576d(i2);
                    if (ShortCutStausManager.m148791a().mo138577d()) {
                        final int i3 = this.f97551d.height;
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                        ofFloat5.setDuration(100L);
                        ofFloat5.setRepeatCount(0);
                        ofFloat5.setInterpolator(this.f97558k);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            /* class com.ss.android.lark.feed.app.view.C37997i.C380025 */

                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                C37997i.this.f97551d.height = (int) (((float) i3) + (((float) (ShortCutStausManager.m148791a().mo138581h() - i3)) * floatValue));
                                C37997i.this.f97548a.setLayoutParams(C37997i.this.f97551d);
                            }
                        });
                        ofFloat5.start();
                    }
                    if (this.f97548a.getAdapter().getItemCount() == ShortCutStausManager.m148791a().mo138579f()) {
                        ShortCutStausManager.m148791a().mo138568a(ShortCutStausManager.ShortCutStatus.CLOSE);
                        return;
                    }
                    return;
                case 6:
                    ShortCutStausManager.m148791a().mo138568a(ShortCutStausManager.ShortCutStatus.CLOSE);
                    mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.ROTATE_BTN, BitmapDescriptorFactory.HUE_RED));
                    mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.BADGE_ALPHA, BitmapDescriptorFactory.HUE_RED));
                    mo139062b(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.BTN_TEXT, BitmapDescriptorFactory.HUE_RED));
                    this.f97551d.height = this.f97556i;
                    this.f97552e.height = 0;
                    this.f97553f.height = 0;
                    mo139061b();
                    return;
                default:
                    return;
            }
        }
    }

    public C37997i(RecyclerView recyclerView, ShortCutCoverView shortCutCoverView, View view) {
        this.f97548a = recyclerView;
        this.f97549b = shortCutCoverView;
        this.f97550c = view;
        this.f97551d = (LinearLayout.LayoutParams) recyclerView.getLayoutParams();
        this.f97552e = (FrameLayout.LayoutParams) shortCutCoverView.getLayoutParams();
        this.f97553f = (FrameLayout.LayoutParams) view.getLayoutParams();
    }
}
