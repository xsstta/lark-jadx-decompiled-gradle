package com.ss.android.vc.meeting.module.meetingdialog.labs.preview;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.basedialog.PreviewBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsScene;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.preview.a */
public class C62289a extends PreviewBaseDesktopDialog implements AbstractC62216c.AbstractC62218b.AbstractC62219a {

    /* renamed from: a */
    protected LabsView f156501a;

    /* renamed from: b */
    private boolean f156502b;

    /* renamed from: c */
    private LabsScene f156503c;

    /* renamed from: d */
    private String f156504d;

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c.AbstractC62218b.AbstractC62219a
    public void bN_() {
        dismiss();
    }

    @Override // com.ss.android.vc.meeting.basedialog.PreviewBaseDesktopDialog, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        this.f156502b = true;
    }

    @Override // com.ss.android.vc.meeting.basedialog.PreviewBaseDesktopDialog
    /* renamed from: e */
    public void mo211727e() {
        LabsView labsView = this.f156501a;
        if (labsView != null) {
            labsView.mo215220m();
        }
        this.f156502b = false;
    }

    @Override // com.ss.android.vc.meeting.basedialog.PreviewBaseDesktopDialog
    /* renamed from: f */
    public View mo211728f() {
        LabsPreviewView labsPreviewView = new LabsPreviewView(mo211729g());
        this.f156501a = labsPreviewView;
        return labsPreviewView;
    }

    /* renamed from: i */
    public void mo215416i() {
        LabsView labsView = this.f156501a;
        if (labsView != null && this.f156502b) {
            labsView.mo215218k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo215415h() {
        LabsView labsView = this.f156501a;
        if (labsView != null) {
            labsView.setActionListener(this);
            this.f156501a.setScene(this.f156503c);
            this.f156501a.setEnvId(this.f156504d);
            this.f156501a.mo215201a((C61303k) null);
        }
    }

    public C62289a(Activity activity, LabsScene labsScene, String str) {
        super(activity);
        this.f156503c = labsScene;
        mo215415h();
    }
}
