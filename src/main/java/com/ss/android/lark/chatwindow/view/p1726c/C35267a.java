package com.ss.android.lark.chatwindow.view.p1726c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chatwindow.view.p1726c.C35267a;

/* renamed from: com.ss.android.lark.chatwindow.view.c.a */
public class C35267a extends BasePopupWindow {

    /* renamed from: a */
    public LKUILottieAnimationView f91113a;

    /* renamed from: b */
    private Activity f91114b;

    /* renamed from: c */
    private View f91115c;

    /* renamed from: d */
    private TextView f91116d;

    /* renamed from: e */
    private TextView f91117e;

    /* renamed from: f */
    private TextView f91118f;

    /* renamed from: g */
    private AnimatorSet f91119g;

    /* renamed from: h */
    private ObjectAnimator f91120h;

    /* renamed from: i */
    private ObjectAnimator f91121i;

    /* renamed from: com.ss.android.lark.chatwindow.view.c.a$a */
    public interface AbstractC35269a {
        /* renamed from: a */
        void mo129815a();

        /* renamed from: b */
        void mo129816b();

        /* renamed from: c */
        void mo129817c();
    }

    @Override // com.larksuite.framework.ui.BasePopupWindow
    public void dismiss() {
        LKUILottieAnimationView lKUILottieAnimationView = this.f91113a;
        if (lKUILottieAnimationView != null && lKUILottieAnimationView.isAnimating()) {
            this.f91113a.cancelAnimation();
        }
        super.dismiss();
    }

    /* renamed from: a */
    public void mo129813a(String str) {
        TextView textView = this.f91116d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public void mo100027a(View view) {
        if (view.getWindowToken() != null) {
            showAtLocation(view, 17, 0, 0);
            m137768b(view);
        }
    }

    /* renamed from: b */
    private void m137768b(View view) {
        if (this.f91115c != null) {
            if (this.f91119g == null) {
                this.f91119g = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f91115c, "scaleX", BitmapDescriptorFactory.HUE_RED, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f91115c, "scaleY", BitmapDescriptorFactory.HUE_RED, 1.0f);
                this.f91120h = ObjectAnimator.ofFloat(this.f91115c, "translationX", BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                this.f91121i = ObjectAnimator.ofFloat(this.f91115c, "translationY", BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                this.f91119g.setDuration(500L);
                this.f91119g.playTogether(ofFloat, ofFloat2, this.f91120h, this.f91121i);
                this.f91119g.setInterpolator(new AccelerateInterpolator());
                this.f91119g.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.lark.chatwindow.view.p1726c.C35267a.C352681 */

                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C35267a.this.f91113a.playAnimation();
                    }
                });
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int realScreenHeight = DeviceUtils.getRealScreenHeight(view.getContext());
            int screenWidth = DeviceUtils.getScreenWidth(view.getContext());
            this.f91120h.setFloatValues(((float) iArr[0]) - (((float) screenWidth) / 2.0f), 0.0f);
            this.f91121i.setFloatValues(((float) iArr[1]) - (((float) realScreenHeight) / 2.0f), 0.0f);
            this.f91119g.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m137770c(AbstractC35269a aVar, View view) {
        if (aVar != null) {
            aVar.mo129817c();
        }
    }

    public C35267a(Activity activity, AbstractC35269a aVar) {
        super(-2, -2);
        this.f91114b = activity;
        m137766a(activity, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m137767a(AbstractC35269a aVar, View view) {
        if (aVar != null) {
            aVar.mo129815a();
            dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m137769b(AbstractC35269a aVar, View view) {
        if (aVar != null) {
            aVar.mo129816b();
            dismiss();
        }
    }

    /* renamed from: a */
    private void m137766a(Activity activity, AbstractC35269a aVar) {
        View inflate = LayoutInflater.from(activity).inflate(R.layout.popup_auto_translate_setting, (ViewGroup) null);
        this.f91115c = inflate;
        this.f91113a = (LKUILottieAnimationView) inflate.findViewById(R.id.translate_anim_iv);
        this.f91116d = (TextView) this.f91115c.findViewById(R.id.language_option);
        this.f91117e = (TextView) this.f91115c.findViewById(R.id.language_option_cancel);
        this.f91118f = (TextView) this.f91115c.findViewById(R.id.language_option_confirm);
        setContentView(this.f91115c);
        this.f91116d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatwindow.view.p1726c.$$Lambda$a$GGFR2Zz47FptuX9xe6H9_VlNL6c */

            public final void onClick(View view) {
                C35267a.lambda$GGFR2Zz47FptuX9xe6H9_VlNL6c(C35267a.AbstractC35269a.this, view);
            }
        });
        this.f91117e.setOnClickListener(new View.OnClickListener(aVar) {
            /* class com.ss.android.lark.chatwindow.view.p1726c.$$Lambda$a$aa1vkNdzM77wVZZfwFljoyC8gg */
            public final /* synthetic */ C35267a.AbstractC35269a f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C35267a.m270476lambda$aa1vkNdzM77wVZZfwFljoyC8gg(C35267a.this, this.f$1, view);
            }
        });
        this.f91118f.setOnClickListener(new View.OnClickListener(aVar) {
            /* class com.ss.android.lark.chatwindow.view.p1726c.$$Lambda$a$lTVecbvxG7r5Oxh8nPZ2qmb7UnU */
            public final /* synthetic */ C35267a.AbstractC35269a f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C35267a.lambda$lTVecbvxG7r5Oxh8nPZ2qmb7UnU(C35267a.this, this.f$1, view);
            }
        });
    }
}
