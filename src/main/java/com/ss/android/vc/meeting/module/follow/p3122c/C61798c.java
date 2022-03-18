package com.ss.android.vc.meeting.module.follow.p3122c;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.ttm.player.MediaPlayer;

/* renamed from: com.ss.android.vc.meeting.module.follow.c.c */
public class C61798c extends AbstractView$OnAttachStateChangeListenerC61219a implements AbstractC61222a {

    /* renamed from: h */
    C61800e f155105h;

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public void mo211671a(boolean z) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: b */
    public int mo211673b(boolean z) {
        return -2;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: m */
    public int mo211684m() {
        return MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: j */
    public void mo211681j() {
        super.mo211681j();
        C61800e eVar = this.f155105h;
        if (eVar != null) {
            eVar.mo214076a();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public View mo211669a(Activity activity) {
        C61800e eVar = new C61800e();
        this.f155105h = eVar;
        return eVar.mo214075a(activity, this.f153319b, this);
    }

    public C61798c(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }
}
