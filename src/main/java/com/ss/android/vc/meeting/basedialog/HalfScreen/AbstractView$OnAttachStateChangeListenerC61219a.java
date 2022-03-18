package com.ss.android.vc.meeting.basedialog.HalfScreen;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import androidx.p034e.p035a.C0978a;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.basedialog.C61227f;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a;
import com.ss.android.vc.meeting.basedialog.SwipableLayout;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.MeetingActivity;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.multi.InMeetingFragment;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.basedialog.HalfScreen.a */
public abstract class AbstractView$OnAttachStateChangeListenerC61219a implements View.OnAttachStateChangeListener, AbstractC61214a, AbstractC61222a {

    /* renamed from: a */
    protected Activity f153318a;

    /* renamed from: b */
    protected C61303k f153319b;

    /* renamed from: c */
    public HalfScreenFrame f153320c;

    /* renamed from: d */
    protected boolean f153321d;

    /* renamed from: e */
    protected Boolean f153322e;

    /* renamed from: f */
    protected Boolean f153323f;

    /* renamed from: g */
    protected List<LanguageType> f153324g;

    /* renamed from: h */
    private AbstractC61222a.AbstractC61223a f153325h;

    /* renamed from: i */
    private BroadcastReceiver f153326i = new BroadcastReceiver() {
        /* class com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a.C612201 */

        public void onReceive(Context context, Intent intent) {
            if ("action.broadcast.orientation".equals(intent.getAction()) && AbstractView$OnAttachStateChangeListenerC61219a.this.f153320c != null) {
                boolean booleanExtra = intent.getBooleanExtra("orientation_landscape", false);
                AbstractView$OnAttachStateChangeListenerC61219a.this.f153320c.mo211652a(booleanExtra, AbstractView$OnAttachStateChangeListenerC61219a.this.mo211673b(booleanExtra), AbstractView$OnAttachStateChangeListenerC61219a.this.mo211682k());
                AbstractView$OnAttachStateChangeListenerC61219a.this.mo211671a(booleanExtra);
            }
        }
    };

    /* renamed from: a */
    public abstract View mo211669a(Activity activity);

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public /* synthetic */ void mo211610a(String str) {
        AbstractC61222a.CC.$default$a(this, str);
    }

    /* renamed from: a */
    public abstract void mo211671a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo211672a(int i, int i2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo211673b(boolean z) {
        return -2;
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: b */
    public /* synthetic */ boolean mo211613b() {
        return AbstractC61222a.CC.$default$b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo211674c(boolean z) {
        return -2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo211679h() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo211680i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo211681j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo211683l() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo211684m() {
        return LocationRequest.PRIORITY_INDOOR;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo211685n() {
        return -1;
    }

    /* renamed from: d */
    public C61303k mo211675d() {
        return this.f153319b;
    }

    /* renamed from: f */
    public Activity mo211677f() {
        return this.f153318a;
    }

    /* renamed from: g */
    public boolean mo211678g() {
        return C61999a.m242220f();
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a
    public boolean bS_() {
        if (mo211679h()) {
            return false;
        }
        dismiss();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public SwipableLayout mo211676e() {
        HalfScreenFrame halfScreenFrame = this.f153320c;
        if (halfScreenFrame != null) {
            return halfScreenFrame.getContentLayout();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo211682k() {
        if (mo211678g()) {
            return C60773o.m236115a(100.0d);
        }
        return 0;
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        this.f153321d = false;
        mo211680i();
        Activity activity = this.f153318a;
        if (activity != null && (activity instanceof MeetingActivity)) {
            ((MeetingActivity) activity).mo212776b(this);
        }
        if (this.f153320c != null && C60773o.m236120a(this.f153318a)) {
            this.f153320c.mo211653b();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        FrameLayout frameLayout;
        InMeetingFragment z;
        Activity activity = this.f153318a;
        if (!(activity instanceof ByteRTCMeetingActivity) || (z = ((ByteRTCMeetingActivity) activity).mo215865z()) == null) {
            frameLayout = null;
        } else {
            frameLayout = z.mo212941t();
        }
        if (frameLayout == null) {
            frameLayout = m238079c(this.f153318a);
        }
        if (frameLayout != null && this.f153320c != null) {
            frameLayout.addView(this.f153320c, new FrameLayout.LayoutParams(-1, -1));
            mo211671a(mo211678g());
            this.f153320c.mo211649a();
            this.f153321d = true;
            Activity activity2 = this.f153318a;
            if (activity2 instanceof MeetingActivity) {
                ((MeetingActivity) activity2).mo212771a(this);
            }
            C61227f.m238148c().mo211722a(this);
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211609a(AbstractC61222a.AbstractC61223a aVar) {
        this.f153325h = aVar;
    }

    /* renamed from: c */
    private FrameLayout m238079c(Activity activity) {
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
    public void mo211670a(int i) {
        if (mo211676e() != null) {
            mo211676e().getBackground().setColorFilter(C60773o.m236126d(i), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public void onViewAttachedToWindow(View view) {
        C60700b.m235851b("MeetingHalfScreenDialog", "[onViewAttachedToWindow]", "" + this);
        C0978a.m4782a(ar.m236694a()).mo4991a(this.f153326i, new IntentFilter("action.broadcast.orientation"));
    }

    /* renamed from: b */
    private void m238078b(Activity activity) {
        if (activity == null) {
            C60700b.m235864f("MeetingHalfScreenDialog", "[initDialog]", "activity is null");
            return;
        }
        HalfScreenFrame halfScreenFrame = new HalfScreenFrame(activity);
        this.f153320c = halfScreenFrame;
        halfScreenFrame.setInOutAnimDuration(mo211684m());
        this.f153320c.mo211651a(activity, mo211669a(activity));
        this.f153320c.mo211650a(mo211673b(mo211678g()), mo211685n(), mo211682k());
        this.f153320c.setDialog(this);
        this.f153320c.setCanSwipeClose(mo211683l());
        this.f153320c.addOnAttachStateChangeListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        C60700b.m235851b("MeetingHalfScreenDialog", "[onViewDetachedFromWindow]", "" + this);
        C0978a.m4782a(ar.m236694a()).mo4990a(this.f153326i);
        Activity activity = this.f153318a;
        if (activity != null && (activity instanceof MeetingActivity)) {
            ((MeetingActivity) activity).mo212776b(this);
        }
        C61227f.m238148c().mo211724b(this);
        mo211681j();
        AbstractC61222a.AbstractC61223a aVar = this.f153325h;
        if (aVar != null) {
            aVar.bY_();
            this.f153325h = null;
        }
    }

    public AbstractView$OnAttachStateChangeListenerC61219a(Activity activity, C61303k kVar) {
        this.f153318a = activity;
        this.f153319b = kVar;
        m238078b(activity);
    }

    public AbstractView$OnAttachStateChangeListenerC61219a(Activity activity, C61303k kVar, Boolean bool, Boolean bool2, List<LanguageType> list) {
        this.f153318a = activity;
        this.f153319b = kVar;
        this.f153322e = bool;
        this.f153323f = bool2;
        this.f153324g = list;
        m238078b(activity);
    }
}
