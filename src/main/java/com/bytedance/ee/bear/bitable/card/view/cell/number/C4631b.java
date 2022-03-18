package com.bytedance.ee.bear.bitable.card.view.cell.number;

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.number.b */
public class C4631b {

    /* renamed from: a */
    public View f13686a;

    /* renamed from: b */
    private STNumberKeyboardView f13687b;

    /* renamed from: c */
    private TextView f13688c;

    /* renamed from: d */
    private boolean f13689d;

    /* renamed from: e */
    private AbstractC4633a f13690e;

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.number.b$a */
    public interface AbstractC4633a {
        void onDismiss(boolean z);
    }

    /* renamed from: a */
    public boolean mo18211a() {
        return this.f13689d;
    }

    /* renamed from: c */
    private boolean m19247c() {
        View view = this.f13686a;
        if (view == null || view.getAnimation() == null) {
            return false;
        }
        this.f13686a.clearAnimation();
        return true;
    }

    /* renamed from: b */
    public int mo18212b() {
        View view = this.f13686a;
        if (view == null || view.getParent() == null) {
            return 0;
        }
        return this.f13686a.getHeight();
    }

    /* renamed from: a */
    public void mo18209a(AbstractC4633a aVar) {
        this.f13690e = aVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m19246b(View view) {
        mo18210a(true);
    }

    /* renamed from: a */
    private void m19245a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    public C4631b(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.bitable_card_number_edit_panel, (ViewGroup) null);
        this.f13686a = inflate;
        this.f13687b = (STNumberKeyboardView) inflate.findViewById(R.id.number_keyboard_view);
        this.f13687b.setKeyboard(new Keyboard(context, R.xml.bitable_number_keyboard));
        TextView textView = (TextView) this.f13686a.findViewById(R.id.confirm_tv);
        this.f13688c = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.number.$$Lambda$b$8ndJdH6BxMyKdZaPhlPSLGnImbM */

            public final void onClick(View view) {
                C4631b.this.m19246b(view);
            }
        });
    }

    /* renamed from: a */
    public void mo18210a(boolean z) {
        View view;
        if (this.f13689d && (view = this.f13686a) != null && (view.getParent() instanceof ViewGroup)) {
            this.f13689d = false;
            STNumberKeyboardView sTNumberKeyboardView = this.f13687b;
            if (sTNumberKeyboardView != null) {
                sTNumberKeyboardView.mo18193a();
            }
            AbstractC4633a aVar = this.f13690e;
            if (aVar != null) {
                aVar.onDismiss(z);
            }
            if (m19247c()) {
                mo18208a((ViewGroup) this.f13686a.getParent(), this.f13686a);
                return;
            }
            TranslateAnimation a = m19244a(BitmapDescriptorFactory.HUE_RED, 1.0f);
            a.setAnimationListener(new Animation.AnimationListener() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.number.C4631b.animationAnimation$AnimationListenerC46321 */

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    C4631b bVar = C4631b.this;
                    bVar.mo18208a((ViewGroup) bVar.f13686a.getParent(), C4631b.this.f13686a);
                }
            });
            this.f13686a.startAnimation(a);
        }
    }

    /* renamed from: a */
    private TranslateAnimation m19244a(float f, float f2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, f, 1, f2);
        translateAnimation.setDuration(200);
        return translateAnimation;
    }

    /* renamed from: a */
    public void mo18207a(ViewGroup viewGroup, Editable editable) {
        m19247c();
        m19245a(this.f13686a);
        if (viewGroup != null && this.f13686a != null) {
            this.f13689d = true;
            STNumberKeyboardView sTNumberKeyboardView = this.f13687b;
            if (sTNumberKeyboardView != null) {
                sTNumberKeyboardView.mo18194a(editable);
            }
            this.f13686a.setVisibility(0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            viewGroup.addView(this.f13686a, layoutParams);
            this.f13686a.startAnimation(m19244a(1.0f, BitmapDescriptorFactory.HUE_RED));
        }
    }

    /* renamed from: a */
    public void mo18208a(ViewGroup viewGroup, View view) {
        view.setVisibility(8);
        viewGroup.removeView(view);
    }
}
