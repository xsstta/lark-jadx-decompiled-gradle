package com.ss.android.vc.meeting.module.fastentry;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.widget.VCFloatLayout;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow;
import com.ss.android.vc.meeting.module.floatingwindow.FloatWindowLaunchType;
import com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vcxp.C63801c;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;

@XClass
public class FastEntryWindow extends BaseFloatingWindow implements AbstractC61660c {

    /* renamed from: k */
    private FastEntryFloatLayout f154670k;

    /* renamed from: l */
    private FrameLayout f154671l;

    @Override // com.ss.android.vc.meeting.module.fastentry.AbstractC61660c
    /* renamed from: f */
    public FrameLayout mo213580f() {
        return this.f154762c;
    }

    private FastEntryWindow() {
        super(null, IFloatWindowPresent.FloatWindowType.FAST_ENTRY);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow
    @XMethod(runOnProcess = XProcess.VC)
    public boolean checkValid() {
        return super.checkValid();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow
    /* renamed from: g */
    public boolean mo213581g() {
        return C63801c.m250503d();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow
    /* renamed from: h */
    public boolean mo213582h() {
        return C63801c.m250501b();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: t */
    private /* synthetic */ void m240656t() {
        super.showMeetingFloatingWindowFinally();
        if (C63801c.m250503d()) {
            mo213583i();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow
    @XMethod
    public void showMeetingFloatingWindowFinally() {
        C26171w.m94675a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.fastentry.$$Lambda$FastEntryWindow$YxDpR_nofTNwH7Uf24sM2oSqZHs */

            public final void run() {
                FastEntryWindow.this.m240656t();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbsFloatingWindow, com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow
    @XMethod(isReleaseMethod = true, runOnProcess = XProcess.Main)
    public void dismiss() {
        C60700b.m235851b("FastEntryWindow", "[dismiss]", "");
        ActivityFloatingView.m240633b().removeView();
        super.dismiss();
    }

    @Override // com.ss.android.vc.meeting.module.fastentry.AbstractC61660c
    @XMethod
    public void dismissFastEntry() {
        if (isFastEntryShown()) {
            C63742at.m250087c(mo212181b().mo212056e(), false);
        }
        if (this.f154762c != null) {
            this.f154762c.setVisibility(4);
        }
        mo213669n();
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow
    /* renamed from: i */
    public void mo213583i() {
        if (this.f154670k != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 5;
            this.f154670k.mo208525a(layoutParams, (VCFloatLayout.AbstractC60820a) null);
        }
    }

    @Override // com.ss.android.vc.meeting.module.fastentry.AbstractC61660c
    @XMethod
    public boolean isFastEntryShown() {
        if (this.f154762c == null || this.f154762c.getParent() == null || this.f154762c.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.fastentry.AbstractC61660c
    @XMethod
    public void showFastEntry() {
        if (this.f154762c != null) {
            this.f154762c.setVisibility(0);
        }
        C63742at.m250087c(mo212181b().mo212056e(), true);
    }

    /* renamed from: q */
    private void m240653q() {
        if (C63801c.m250498a()) {
            if (mo212181b() != null) {
                mo212181b().mo212047a(DisplayMode.FAST_ENTRY, hashCode());
            }
            this.f154762c = new FrameLayout(ar.m236698c());
        }
        if (C63801c.m250502c()) {
            m240654r();
            m240655s();
        }
    }

    /* renamed from: s */
    private void m240655s() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = C60776r.m236148f();
        layoutParams.bottomMargin = UIHelper.dp2px(8.0f);
        layoutParams.leftMargin = UIHelper.dp2px(8.0f);
        layoutParams.rightMargin = UIHelper.dp2px(8.0f);
        C26171w.m94675a(new Runnable(layoutParams) {
            /* class com.ss.android.vc.meeting.module.fastentry.$$Lambda$FastEntryWindow$8bXlgfcpDw9xRaeAYN7ilGQkMuY */
            public final /* synthetic */ FrameLayout.LayoutParams f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                FastEntryWindow.this.m240649a((FastEntryWindow) this.f$1);
            }
        });
    }

    /* renamed from: r */
    private void m240654r() {
        if (mo212181b() == null) {
            C60700b.m235864f("FastEntryWindow", "[initFloatView]", "meeting is null");
        }
        C60700b.m235851b("FastEntryWindow", "[initFloatLayout]", "");
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(ar.m236698c()).inflate(R.layout.fast_entry_float_layout, (ViewGroup) null);
        this.f154671l = frameLayout;
        this.f154670k = (FastEntryFloatLayout) frameLayout.findViewById(R.id.fast_entry_float_layout);
        this.f154762c = (FrameLayout) this.f154671l.findViewById(R.id.fast_entry_window);
        this.f154670k.setStickyMode(VCFloatLayout.StickyMode.AUTO);
    }

    public FastEntryWindow(C61303k kVar) {
        super(kVar, IFloatWindowPresent.FloatWindowType.FAST_ENTRY);
        m240653q();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m240649a(FrameLayout.LayoutParams layoutParams) {
        ActivityFloatingView.m240633b().mo213568a(this.f154671l, layoutParams);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m240652b(long j) {
        super.mo213576a(j);
        if (C63801c.m250503d()) {
            mo213583i();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow
    @XMethod
    public void showStaticFloatingWindowFinally(boolean z) {
        C26171w.m94675a(new Runnable(z) {
            /* class com.ss.android.vc.meeting.module.fastentry.$$Lambda$FastEntryWindow$Eu6jeIp4BQuBC536KPUK4tx1Bvw */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                FastEntryWindow.this.m240650a((FastEntryWindow) this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m240650a(boolean z) {
        super.showStaticFloatingWindowFinally(z);
        if (C63801c.m250503d()) {
            mo213583i();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow
    /* renamed from: a */
    public void mo213576a(long j) {
        C26171w.m94675a(new Runnable(j) {
            /* class com.ss.android.vc.meeting.module.fastentry.$$Lambda$FastEntryWindow$TEjefRDmUxHWDgRyzBsm1mM8nE */
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                FastEntryWindow.this.m240652b((FastEntryWindow) this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m240651a(boolean z, boolean z2) {
        super.showCallFloatWindowInternal(z, z2);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow
    @XMethod
    public void showCallFloatWindowInternal(boolean z, boolean z2) {
        C26171w.m94675a(new Runnable(z, z2) {
            /* class com.ss.android.vc.meeting.module.fastentry.$$Lambda$FastEntryWindow$sOgTlG6ZMOF4fjQ57D1mXv4GUk8 */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                FastEntryWindow.this.m240651a((FastEntryWindow) this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow
    @XMethod
    public void showFloatInternal(long j, FloatWindowLaunchType floatWindowLaunchType, VideoChat videoChat) {
        super.showFloatInternal(j, floatWindowLaunchType, videoChat);
    }
}
