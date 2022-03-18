package com.ss.android.vc.meeting.basedialog.FullScreen;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.p034e.p035a.C0978a;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.basedialog.C61227f;
import com.ss.android.vc.meeting.basedialog.FullScreen.FullScreenFrame;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.MeetingActivity;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.multi.InMeetingFragment;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.preview.facade.MeetingPreviewActivity;
import com.ss.android.vc.meeting.module.sharebox.LocalSharePrepareActivity;
import com.ss.android.vc.meeting.module.tab3.detail.VcTab3DetailActivity;

/* renamed from: com.ss.android.vc.meeting.basedialog.FullScreen.b */
public abstract class AbstractView$OnAttachStateChangeListenerC61215b implements View.OnAttachStateChangeListener, AbstractC61214a, AbstractC61222a {

    /* renamed from: a */
    protected C61303k f153299a;

    /* renamed from: b */
    protected Boolean f153300b;

    /* renamed from: c */
    public FullScreenFrame f153301c;

    /* renamed from: d */
    private final Activity f153302d;

    /* renamed from: e */
    private AbstractC61222a.AbstractC61223a f153303e;

    /* renamed from: f */
    private View f153304f;

    /* renamed from: g */
    private final BroadcastReceiver f153305g;

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public /* synthetic */ void mo211610a(String str) {
        AbstractC61222a.CC.$default$a(this, str);
    }

    /* renamed from: b */
    public abstract View mo211632b(Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo211633b(int i) {
    }

    /* renamed from: b */
    public abstract void mo211634b(boolean z);

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: b */
    public /* synthetic */ boolean mo211613b() {
        return AbstractC61222a.CC.$default$b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo211641h() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo211642i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo211643j() {
    }

    public Activity bL_() {
        return this.f153302d;
    }

    /* renamed from: g */
    public boolean mo211640g() {
        return C61999a.m242220f();
    }

    /* access modifiers changed from: protected */
    public void bM_() {
        mo211630a(C60773o.m236126d(R.color.bg_body));
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a
    public boolean bS_() {
        if (mo211641h()) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.basedialog.FullScreen.$$Lambda$b$mA2UD0WnANZVGpz7SCxNcdqDWdA */

            public final void run() {
                AbstractView$OnAttachStateChangeListenerC61215b.lambda$mA2UD0WnANZVGpz7SCxNcdqDWdA(AbstractView$OnAttachStateChangeListenerC61215b.this);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo211639f() {
        if (bL_() == null || bL_().getWindow() == null) {
            return 0;
        }
        int i = bL_().getWindow().getAttributes().softInputMode;
        bL_().getWindow().setSoftInputMode(51);
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void mo215092k() {
        mo211642i();
        Activity activity = this.f153302d;
        if (activity != null && (activity instanceof MeetingActivity)) {
            ((MeetingActivity) activity).mo212776b(this);
        }
        Activity activity2 = this.f153302d;
        if (activity2 != null && (activity2 instanceof MeetingPreviewActivity)) {
            ((MeetingPreviewActivity) activity2).mo216698b(this);
        }
        Activity activity3 = this.f153302d;
        if (activity3 != null && (activity3 instanceof LocalSharePrepareActivity)) {
            ((LocalSharePrepareActivity) activity3).mo217745b(this);
        }
        Activity activity4 = this.f153302d;
        if (activity4 instanceof VcTab3DetailActivity) {
            ((VcTab3DetailActivity) activity4).mo219122b(this);
        }
        if (this.f153301c != null && C60773o.m236120a(this.f153302d)) {
            this.f153301c.mo211625b();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        FrameLayout frameLayout;
        FrameLayout.LayoutParams layoutParams;
        InMeetingFragment z;
        Activity activity = this.f153302d;
        if (!(activity instanceof ByteRTCMeetingActivity) || (z = ((ByteRTCMeetingActivity) activity).mo215865z()) == null) {
            frameLayout = null;
        } else {
            frameLayout = z.mo212941t();
        }
        if (frameLayout == null) {
            frameLayout = m238038c(this.f153302d);
        }
        if (frameLayout != null && this.f153301c != null) {
            if (DesktopUtil.m144307b()) {
                layoutParams = new FrameLayout.LayoutParams(UIHelper.dp2px(440.0f), UIHelper.dp2px(560.0f));
                layoutParams.topMargin = C60776r.m236148f() / 2;
                layoutParams.gravity = 17;
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            if (this.f153301c.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.f153301c.getParent()).removeView(this.f153301c);
            }
            frameLayout.addView(this.f153301c, layoutParams);
            mo211634b(mo211640g());
            this.f153301c.mo211624a();
            Activity activity2 = this.f153302d;
            if (activity2 instanceof MeetingActivity) {
                ((MeetingActivity) activity2).mo212771a(this);
            }
            Activity activity3 = this.f153302d;
            if (activity3 instanceof MeetingPreviewActivity) {
                ((MeetingPreviewActivity) activity3).mo216697a(this);
            }
            Activity activity4 = this.f153302d;
            if (activity4 instanceof LocalSharePrepareActivity) {
                ((LocalSharePrepareActivity) activity4).mo217743a(this);
            }
            Activity activity5 = this.f153302d;
            if (activity5 instanceof VcTab3DetailActivity) {
                ((VcTab3DetailActivity) activity5).mo219120a(this);
            }
            C61227f.m238148c().mo211722a(this);
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211609a(AbstractC61222a.AbstractC61223a aVar) {
        this.f153303e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m238039e(int i) {
        View view = this.f153304f;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    /* renamed from: a */
    public AbstractView$OnAttachStateChangeListenerC61215b mo211628a(Activity activity) {
        return mo211629a(activity, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211630a(int i) {
        C60735ab.m236001a(new Runnable(i) {
            /* class com.ss.android.vc.meeting.basedialog.FullScreen.$$Lambda$b$3Mtex5QpIt6NiBd3BcbsAkxGYI */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractView$OnAttachStateChangeListenerC61215b.m271171lambda$3Mtex5QpIt6NiBd3BcbsAkxGYI(AbstractView$OnAttachStateChangeListenerC61215b.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public <T extends View> T mo211638d(int i) {
        FullScreenFrame fullScreenFrame = this.f153301c;
        if (fullScreenFrame != null) {
            return (T) fullScreenFrame.findViewById(i);
        }
        return null;
    }

    public void t_(boolean z) {
        int i;
        View view = this.f153304f;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: c */
    private FrameLayout m238038c(Activity activity) {
        if (activity == null) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(16908290);
        if (frameLayout != null) {
            return frameLayout;
        }
        try {
            return (FrameLayout) activity.getWindow().getDecorView();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public void mo211631a(FullScreenFrame.AnimationType animationType) {
        FullScreenFrame fullScreenFrame = this.f153301c;
        if (fullScreenFrame != null) {
            fullScreenFrame.setAnimationType(animationType);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo211637c(int i) {
        if (bL_() != null && i != -1) {
            bL_().getWindow().setSoftInputMode(i);
        }
    }

    public void onViewAttachedToWindow(View view) {
        C60700b.m235851b("MeetingFullScreenDialog", "[onViewAttachedToWindow]", "" + this);
        C0978a.m4782a(ar.m236694a()).mo4991a(this.f153305g, new IntentFilter("action.broadcast.orientation"));
    }

    public void onViewDetachedFromWindow(View view) {
        C60700b.m235851b("MeetingFullScreenDialog", "[onViewDetachedFromWindow]", "" + this);
        C0978a.m4782a(ar.m236694a()).mo4990a(this.f153305g);
        Activity activity = this.f153302d;
        if (activity != null && (activity instanceof MeetingActivity)) {
            ((MeetingActivity) activity).mo212776b(this);
        }
        Activity activity2 = this.f153302d;
        if (activity2 != null && (activity2 instanceof MeetingPreviewActivity)) {
            ((MeetingPreviewActivity) activity2).mo216698b(this);
        }
        C61227f.m238148c().mo211724b(this);
        mo211643j();
        AbstractC61222a.AbstractC61223a aVar = this.f153303e;
        if (aVar != null) {
            aVar.bY_();
            this.f153303e = null;
        }
    }

    public AbstractView$OnAttachStateChangeListenerC61215b(Activity activity, C61303k kVar) {
        this.f153305g = new BroadcastReceiver() {
            /* class com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b.C612161 */

            public void onReceive(Context context, Intent intent) {
                if ("action.broadcast.orientation".equals(intent.getAction()) && AbstractView$OnAttachStateChangeListenerC61215b.this.f153301c != null) {
                    AbstractView$OnAttachStateChangeListenerC61215b.this.mo211634b(intent.getBooleanExtra("orientation_landscape", false));
                }
            }
        };
        this.f153302d = activity;
        this.f153299a = kVar;
        mo211628a(activity);
    }

    /* renamed from: a */
    public AbstractView$OnAttachStateChangeListenerC61215b mo211629a(Activity activity, boolean z) {
        FullScreenFrame.AnimationType animationType;
        if (activity == null) {
            C60700b.m235864f("MeetingFullScreenDialog", "[initDialog]", "activity is null");
            return this;
        }
        FullScreenFrame fullScreenFrame = new FullScreenFrame(activity);
        this.f153301c = fullScreenFrame;
        fullScreenFrame.setBackgroundColor(C60773o.m236126d(R.color.bg_body));
        if (!DesktopUtil.m144307b()) {
            this.f153304f = new View(activity);
            this.f153301c.addView(this.f153304f, new LinearLayout.LayoutParams(-1, C60776r.m236148f()));
        }
        this.f153301c.addView(mo211632b(activity), new LinearLayout.LayoutParams(-1, -1));
        this.f153301c.setFocusableInTouchMode(true);
        this.f153301c.requestFocus();
        this.f153301c.addOnAttachStateChangeListener(this);
        FullScreenFrame fullScreenFrame2 = this.f153301c;
        if (fullScreenFrame2 != null && z) {
            if (z) {
                animationType = FullScreenFrame.AnimationType.RIGHT_IN_OUT;
            } else {
                animationType = FullScreenFrame.AnimationType.BOTTOM_IN_OUT;
            }
            fullScreenFrame2.setAnimationType(animationType);
        }
        return this;
    }

    public AbstractView$OnAttachStateChangeListenerC61215b(Activity activity, C61303k kVar, boolean z) {
        this(activity, kVar);
        FullScreenFrame.AnimationType animationType;
        FullScreenFrame fullScreenFrame = this.f153301c;
        if (fullScreenFrame != null) {
            if (z) {
                animationType = FullScreenFrame.AnimationType.RIGHT_IN_OUT;
            } else {
                animationType = FullScreenFrame.AnimationType.BOTTOM_IN_OUT;
            }
            fullScreenFrame.setAnimationType(animationType);
        }
    }

    public AbstractView$OnAttachStateChangeListenerC61215b(Activity activity, boolean z, C61303k kVar) {
        this.f153305g = new BroadcastReceiver() {
            /* class com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b.C612161 */

            public void onReceive(Context context, Intent intent) {
                if ("action.broadcast.orientation".equals(intent.getAction()) && AbstractView$OnAttachStateChangeListenerC61215b.this.f153301c != null) {
                    AbstractView$OnAttachStateChangeListenerC61215b.this.mo211634b(intent.getBooleanExtra("orientation_landscape", false));
                }
            }
        };
        this.f153302d = activity;
        this.f153299a = kVar;
        if (z) {
            mo211628a(activity);
        }
    }

    public AbstractView$OnAttachStateChangeListenerC61215b(Activity activity, C61303k kVar, Boolean bool, boolean z) {
        this.f153305g = new BroadcastReceiver() {
            /* class com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b.C612161 */

            public void onReceive(Context context, Intent intent) {
                if ("action.broadcast.orientation".equals(intent.getAction()) && AbstractView$OnAttachStateChangeListenerC61215b.this.f153301c != null) {
                    AbstractView$OnAttachStateChangeListenerC61215b.this.mo211634b(intent.getBooleanExtra("orientation_landscape", false));
                }
            }
        };
        this.f153302d = activity;
        this.f153299a = kVar;
        this.f153300b = bool;
        mo211628a(activity);
        if (this.f153301c == null || !bool.booleanValue() || z) {
            FullScreenFrame fullScreenFrame = this.f153301c;
            if (fullScreenFrame != null) {
                fullScreenFrame.setAnimationType(FullScreenFrame.AnimationType.RIGHT_IN_OUT);
                return;
            }
            return;
        }
        this.f153301c.setAnimationType(FullScreenFrame.AnimationType.BOTTOM_IN_OUT);
    }
}
