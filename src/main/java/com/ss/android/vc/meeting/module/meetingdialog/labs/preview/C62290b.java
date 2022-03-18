package com.ss.android.vc.meeting.module.meetingdialog.labs.preview;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62263l;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsScene;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.preview.b */
public class C62290b extends C62263l {

    /* renamed from: e */
    protected LabsScene f156505e;

    /* renamed from: f */
    protected String f156506f;

    /* renamed from: g */
    private boolean f156507g;

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.C62263l
    /* renamed from: l */
    public void mo215358l() {
        super.mo215358l();
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.module.meetingdialog.labs.C62263l, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        this.f156507g = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.module.meetingdialog.labs.C62263l
    /* renamed from: j */
    public void mo211643j() {
        super.mo211643j();
        this.f156507g = false;
    }

    /* renamed from: n */
    public void mo215418n() {
        if (this.f156432d != null && this.f156507g) {
            this.f156432d.mo215218k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo215417m() {
        if (this.f156432d != null) {
            this.f156432d.setActionListener(this);
            this.f156432d.setScene(this.f156505e);
            this.f156432d.setEnvId(this.f156506f);
            this.f156432d.mo215201a(this.f153299a);
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.module.meetingdialog.labs.C62263l
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        this.f156432d = new LabsPreviewView(activity);
        return this.f156432d;
    }

    public C62290b(Activity activity, C61303k kVar, LabsScene labsScene, String str) {
        super(activity, kVar);
        this.f156505e = labsScene;
        this.f156506f = str;
        mo215417m();
    }
}
