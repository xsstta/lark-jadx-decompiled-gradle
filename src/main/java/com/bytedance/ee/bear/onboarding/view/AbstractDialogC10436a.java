package com.bytedance.ee.bear.onboarding.view;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.facade.common.AbstractC7712i;
import com.bytedance.ee.bear.facade.common.AbstractC7716j;
import com.bytedance.ee.bear.onboarding.export.AbstractC10400d;
import com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle;
import com.bytedance.ee.bear.widgets.dialog.BaseDialog;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p709l.AbstractC13696d;
import com.bytedance.ee.util.p709l.C13703h;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.onboarding.view.a */
public abstract class AbstractDialogC10436a extends BaseDialog implements AbstractC7716j {

    /* renamed from: a */
    protected View f28022a;

    /* renamed from: b */
    protected boolean f28023b;

    /* renamed from: c */
    protected View.OnAttachStateChangeListener f28024c;

    /* renamed from: d */
    protected AbstractC10400d.AbstractC10402b f28025d;

    /* renamed from: e */
    private Window f28026e;

    /* renamed from: f */
    private C13703h f28027f;

    /* renamed from: g */
    private FragmentActivity f28028g;

    /* renamed from: h */
    private LifecycleObserver f28029h;

    /* renamed from: i */
    private View.OnAttachStateChangeListener f28030i;

    /* renamed from: j */
    private View f28031j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo39697a(int i, int i2, int i3);

    /* renamed from: a */
    private void mo39712a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f28022a, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    /* renamed from: b */
    private void m43356b() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f28022a, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public void dismiss() {
        if (isShowing() && !this.f28028g.isFinishing() && !this.f28028g.isDestroyed()) {
            super.dismiss();
            m43356b();
            this.f28027f.disable();
            C13479a.m54772d("OnBoardingManager..", "Dialog dismiss, hasAction: " + this.f28023b);
            AbstractC10400d.AbstractC10402b bVar = this.f28025d;
            if (bVar != null) {
                bVar.mo39601a(this.f28023b);
            }
            AbstractC7712i iVar = (AbstractC7712i) AbstractC7710h.C7711a.m30833a(this.f28028g, AbstractC7712i.class);
            if (iVar != null) {
                iVar.mo30181b(this);
            }
            Window window = this.f28026e;
            if (!(window == null || this.f28030i == null)) {
                window.getDecorView().removeOnAttachStateChangeListener(this.f28030i);
            }
            View view = this.f28031j;
            if (view != null) {
                view.removeOnAttachStateChangeListener(this.f28024c);
            }
            this.f28028g.getLifecycle().removeObserver(this.f28029h);
        }
    }

    @Override // com.bytedance.ee.bear.widgets.dialog.BaseDialog
    public void show() {
        FragmentActivity fragmentActivity = this.f28028g;
        if (fragmentActivity != null && !fragmentActivity.isFinishing() && !isShowing()) {
            super.show();
            mo39712a();
            AbstractC7712i iVar = (AbstractC7712i) AbstractC7710h.C7711a.m30833a(this.f28028g, AbstractC7712i.class);
            if (iVar != null) {
                iVar.mo30180a(this);
            }
            this.f28029h = new BaseOnBoardingDialog$3(this);
            this.f28028g.getLifecycle().addObserver(this.f28029h);
            C13703h hVar = new C13703h(getContext(), new C13703h.AbstractC13704a() {
                /* class com.bytedance.ee.bear.onboarding.view.$$Lambda$a$KdLSewTtDmDsQJ0PoQSwqoBQN8 */

                @Override // com.bytedance.ee.util.p709l.C13703h.AbstractC13704a
                public final void onOrientationChanged(AbstractC13696d dVar) {
                    AbstractDialogC10436a.this.m43355a((AbstractDialogC10436a) dVar);
                }
            });
            this.f28027f = hVar;
            if (hVar.canDetectOrientation()) {
                this.f28027f.enable();
            }
            View view = this.f28031j;
            if (view != null) {
                view.addOnAttachStateChangeListener(this.f28024c);
            }
        }
    }

    /* renamed from: a */
    public void mo39698a(View view) {
        this.f28031j = view;
    }

    /* renamed from: a */
    public void mo39700a(AbstractC10400d.AbstractC10402b bVar) {
        this.f28025d = bVar;
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7716j
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        dismiss();
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m43355a(AbstractC13696d dVar) {
        C13479a.m54772d("BaseOnBoardingDialog", "onOrientationChange, orientation: " + dVar);
        if (dVar.mo50654c()) {
            dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39699a(OnBoardingColorStyle onBoardingColorStyle) {
        if (onBoardingColorStyle != null) {
            mo39697a(C13749l.m55755c(getContext(), onBoardingColorStyle.getBgColorRes()), C13749l.m55755c(getContext(), onBoardingColorStyle.getShadowColorRes()), C13749l.m55755c(getContext(), onBoardingColorStyle.getMaskColorRes()));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.flags |= 8;
            window.setAttributes(attributes);
            if (this.f28026e != null) {
                window.getDecorView().setSystemUiVisibility(this.f28026e.getDecorView().getSystemUiVisibility());
                this.f28030i = new View.OnAttachStateChangeListener() {
                    /* class com.bytedance.ee.bear.onboarding.view.AbstractDialogC10436a.View$OnAttachStateChangeListenerC104382 */

                    public void onViewAttachedToWindow(View view) {
                    }

                    public void onViewDetachedFromWindow(View view) {
                        AbstractDialogC10436a.this.dismiss();
                    }
                };
                this.f28026e.getDecorView().addOnAttachStateChangeListener(this.f28030i);
            }
            ((ViewGroup) window.getDecorView()).addView(this.f28022a);
        }
    }

    public AbstractDialogC10436a(FragmentActivity fragmentActivity, Window window) {
        this(fragmentActivity, window, 2131886736);
    }

    public AbstractDialogC10436a(FragmentActivity fragmentActivity, Window window, int i) {
        super(fragmentActivity, i);
        this.f28024c = new View.OnAttachStateChangeListener() {
            /* class com.bytedance.ee.bear.onboarding.view.AbstractDialogC10436a.View$OnAttachStateChangeListenerC104371 */

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                AbstractDialogC10436a.this.dismiss();
            }
        };
        this.f28026e = window;
        this.f28028g = fragmentActivity;
    }
}
