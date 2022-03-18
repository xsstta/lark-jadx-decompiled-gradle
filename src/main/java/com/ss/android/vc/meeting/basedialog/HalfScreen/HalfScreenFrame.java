package com.ss.android.vc.meeting.basedialog.HalfScreen;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.meeting.basedialog.SwipableLayout;
import com.ss.android.vc.meeting.module.p3130k.C61999a;

public class HalfScreenFrame extends FrameLayout {

    /* renamed from: a */
    public View f153307a;

    /* renamed from: b */
    public AbstractView$OnAttachStateChangeListenerC61219a f153308b;

    /* renamed from: c */
    private AnimationType f153309c;

    /* renamed from: d */
    private View f153310d;

    /* renamed from: e */
    private SwipableLayout f153311e;

    /* renamed from: f */
    private View f153312f;

    /* renamed from: g */
    private Activity f153313g;

    /* renamed from: h */
    private int f153314h;

    /* renamed from: i */
    private int f153315i;

    public enum AnimationType {
        RIGHT_IN_OUT,
        BOTTOM_IN_OUT
    }

    /* renamed from: a */
    public void mo211652a(boolean z, int i, int i2) {
    }

    public SwipableLayout getContentLayout() {
        return this.f153311e;
    }

    public View getTopHandleView() {
        return this.f153307a;
    }

    /* renamed from: c */
    public boolean mo211654c() {
        return C61999a.m242220f();
    }

    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m238064h() {
        View view = this.f153310d;
        if (view != null) {
            view.setBackgroundColor(C60773o.m236126d(R.color.bg_mask));
        }
    }

    /* renamed from: a */
    public void mo211649a() {
        if (this.f153309c == AnimationType.RIGHT_IN_OUT) {
            m238060d();
        } else {
            m238062f();
        }
    }

    /* renamed from: d */
    private void m238060d() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setDuration((long) this.f153314h);
        startAnimation(translateAnimation);
    }

    /* renamed from: e */
    private void m238061e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, BitmapDescriptorFactory.HUE_RED, 1, 1.0f, 0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setDuration((long) this.f153314h);
        startAnimation(translateAnimation);
    }

    /* renamed from: f */
    private void m238062f() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, 1, 1.0f, 1, BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setDuration((long) this.f153314h);
        startAnimation(translateAnimation);
    }

    /* renamed from: g */
    private void m238063g() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, 1.0f);
        translateAnimation.setDuration((long) this.f153314h);
        startAnimation(translateAnimation);
    }

    /* renamed from: b */
    public void mo211653b() {
        ViewGroup viewGroup;
        View view = this.f153310d;
        if (view != null) {
            view.setBackgroundColor(C60773o.m236126d(R.color.lkui_transparent));
        }
        if (this.f153309c == AnimationType.RIGHT_IN_OUT) {
            m238061e();
        } else {
            m238063g();
        }
        if (!(getParent() == null || !(getParent() instanceof ViewGroup) || (viewGroup = (ViewGroup) getParent()) == null)) {
            viewGroup.removeView(this);
        }
        this.f153308b = null;
    }

    public void setAnimationType(AnimationType animationType) {
        this.f153309c = animationType;
    }

    public void setDialog(AbstractView$OnAttachStateChangeListenerC61219a aVar) {
        this.f153308b = aVar;
    }

    public void setInOutAnimDuration(int i) {
        this.f153314h = i;
    }

    public HalfScreenFrame(Context context) {
        this(context, null);
    }

    public void setCanSwipeClose(boolean z) {
        SwipableLayout swipableLayout = this.f153311e;
        if (swipableLayout != null) {
            swipableLayout.setCanSwipeClose(z);
        }
    }

    /* renamed from: a */
    private void m238059a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.meeting_half_dialog, (ViewGroup) this, true);
        this.f153310d = inflate.findViewById(R.id.dialog_dismiss);
        this.f153307a = inflate.findViewById(R.id.dialog_handle);
        SwipableLayout swipableLayout = (SwipableLayout) inflate.findViewById(R.id.dialog_content);
        this.f153311e = swipableLayout;
        View view = this.f153312f;
        if (view != null) {
            swipableLayout.addView(view, new LinearLayout.LayoutParams(-1, -2));
        }
        this.f153311e.setBackground(C60773o.m236128f(R.drawable.base_dialog_light));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f153311e.getLayoutParams();
        if (mo211654c()) {
            layoutParams.topMargin = 0;
        } else {
            layoutParams.topMargin = (int) (((double) C60776r.m236146d()) * 0.2d);
        }
        this.f153311e.setLayoutParams(layoutParams);
        this.f153310d.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.basedialog.HalfScreen.HalfScreenFrame.C612171 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (HalfScreenFrame.this.f153308b != null) {
                    HalfScreenFrame.this.f153308b.dismiss();
                }
            }
        });
        C60735ab.m236002a(new Runnable() {
            /* class com.ss.android.vc.meeting.basedialog.HalfScreen.$$Lambda$HalfScreenFrame$ZH41tdnp1ODEMYDcghDaOaXFhm4 */

            public final void run() {
                HalfScreenFrame.lambda$ZH41tdnp1ODEMYDcghDaOaXFhm4(HalfScreenFrame.this);
            }
        }, (long) this.f153314h);
        this.f153311e.setOnLayoutSwipeListener(new SwipableLayout.AbstractC61221a() {
            /* class com.ss.android.vc.meeting.basedialog.HalfScreen.HalfScreenFrame.C612182 */

            @Override // com.ss.android.vc.meeting.basedialog.SwipableLayout.AbstractC61221a
            /* renamed from: e */
            public void mo211667e() {
            }

            @Override // com.ss.android.vc.meeting.basedialog.SwipableLayout.AbstractC61221a
            /* renamed from: f */
            public void mo211668f() {
            }

            @Override // com.ss.android.vc.meeting.basedialog.SwipableLayout.AbstractC61221a
            /* renamed from: c */
            public int mo211665c() {
                return HalfScreenFrame.this.f153307a.getHeight();
            }

            @Override // com.ss.android.vc.meeting.basedialog.SwipableLayout.AbstractC61221a
            /* renamed from: d */
            public void mo211666d() {
                if (HalfScreenFrame.this.f153308b != null) {
                    HalfScreenFrame.this.f153308b.dismiss();
                }
            }

            @Override // com.ss.android.vc.meeting.basedialog.SwipableLayout.AbstractC61221a
            /* renamed from: a */
            public int mo211662a() {
                if (HalfScreenFrame.this.f153308b != null) {
                    return HalfScreenFrame.this.f153308b.mo211673b(HalfScreenFrame.this.mo211654c());
                }
                return -2;
            }

            @Override // com.ss.android.vc.meeting.basedialog.SwipableLayout.AbstractC61221a
            /* renamed from: b */
            public int mo211664b() {
                if (HalfScreenFrame.this.f153308b != null) {
                    return HalfScreenFrame.this.f153308b.mo211674c(HalfScreenFrame.this.mo211654c());
                }
                return -2;
            }

            @Override // com.ss.android.vc.meeting.basedialog.SwipableLayout.AbstractC61221a
            /* renamed from: a */
            public boolean mo211663a(int i, int i2) {
                if (HalfScreenFrame.this.f153308b != null) {
                    return HalfScreenFrame.this.f153308b.mo211672a(i, i2);
                }
                return false;
            }
        });
    }

    /* renamed from: a */
    public void mo211651a(Activity activity, View view) {
        this.f153312f = view;
        m238059a(activity);
    }

    public HalfScreenFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3 = getResources().getConfiguration().orientation;
        if (this.f153315i != i3) {
            this.f153315i = i3;
            AbstractView$OnAttachStateChangeListenerC61219a aVar = this.f153308b;
            if (i3 == 2) {
                z = true;
            } else {
                z = false;
            }
            mo211650a(aVar.mo211673b(z), -1, this.f153308b.mo211682k());
        }
        super.onMeasure(i, i2);
    }

    public HalfScreenFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f153309c = AnimationType.BOTTOM_IN_OUT;
        this.f153314h = LocationRequest.PRIORITY_INDOOR;
        this.f153313g = (Activity) context;
        setClickable(true);
        setFocusable(true);
    }

    /* renamed from: a */
    public void mo211650a(int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f153311e.getLayoutParams();
        layoutParams.leftMargin = i3;
        layoutParams.rightMargin = i3;
        layoutParams.height = i;
        this.f153311e.setLayoutParams(layoutParams);
        if (i2 > 0) {
            this.f153311e.setMinimumHeight(i2);
        }
    }
}
