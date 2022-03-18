package com.ss.android.vc.meeting.module.interpretation.p3127b;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.interpretation.View$OnClickListenerC61981i;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.b.k */
public class C61954k extends AbstractView$OnAttachStateChangeListenerC61219a {

    /* renamed from: h */
    private View$OnClickListenerC61981i f155605h;

    /* renamed from: i */
    private int f155606i = -10;

    /* renamed from: o */
    private void m242055o() {
    }

    /* renamed from: p */
    private void m242056p() {
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        super.dismiss();
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        m242055o();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: i */
    public void mo211680i() {
        super.mo211680i();
        m242056p();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: j */
    public void mo211681j() {
        this.f155605h.mo214559b();
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public void mo211671a(boolean z) {
        View$OnClickListenerC61981i iVar = this.f155605h;
        if (iVar != null) {
            iVar.mo214560b(Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public View mo211669a(Activity activity) {
        View$OnClickListenerC61981i iVar = new View$OnClickListenerC61981i(activity, this.f153319b, this, this.f153322e, this.f153323f, this.f153324g);
        this.f155605h = iVar;
        return iVar.mo214557a((Boolean) false);
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public boolean mo211672a(int i, int i2) {
        View$OnClickListenerC61981i iVar;
        if (i != 1 || (iVar = this.f155605h) == null) {
            return false;
        }
        return iVar.mo214561c();
    }

    public C61954k(Activity activity, C61303k kVar, Boolean bool, Boolean bool2, List<LanguageType> list) {
        super(activity, kVar, bool, bool2, list);
    }
}
