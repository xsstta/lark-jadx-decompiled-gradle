package com.ss.android.vc.meeting.module.p3148o.p3149a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.basedialog.DesktopBaseUpPopopWindow;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61373b;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.C62557a;

/* renamed from: com.ss.android.vc.meeting.module.o.a.a */
public class C62556a extends DesktopBaseUpPopopWindow implements AbstractC61222a, C61373b.AbstractC61374a, C61388g.AbstractC61393a {

    /* renamed from: a */
    private View f157452a;

    /* renamed from: b */
    private C61303k f157453b;

    /* renamed from: c */
    private C62557a f157454c;

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212617a(InterpreterSetting interpreterSetting, InterpreterSetting interpreterSetting2) {
        C61388g.AbstractC61393a.CC.$default$a(this, interpreterSetting, interpreterSetting2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212618a(LanguageType languageType, LanguageType languageType2) {
        C61388g.AbstractC61393a.CC.$default$a(this, languageType, languageType2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212619a(Participant participant) {
        C61388g.AbstractC61393a.CC.$default$a(this, participant);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: b */
    public /* synthetic */ void mo212621b(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$b(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: b */
    public /* synthetic */ void mo212445b(boolean z) {
        C61373b.AbstractC61374a.CC.$default$b(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bB_() {
        C61388g.AbstractC61393a.CC.$default$bB_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void bC_() {
        C61373b.AbstractC61374a.CC.$default$bC_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bD_() {
        C61388g.AbstractC61393a.CC.$default$bD_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void bF_() {
        C61373b.AbstractC61374a.CC.$default$bF_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bG_() {
        C61388g.AbstractC61393a.CC.$default$bG_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void bX_() {
        C61373b.AbstractC61374a.CC.$default$bX_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: c */
    public /* synthetic */ void mo212449c(boolean z) {
        C61373b.AbstractC61374a.CC.$default$c(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void c_(String str, String str2) {
        C61373b.AbstractC61374a.CC.$default$c_(this, str, str2);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: d */
    public /* synthetic */ void mo212451d(boolean z) {
        C61373b.AbstractC61374a.CC.$default$d(this, z);
    }

    @Override // com.ss.android.vc.meeting.basedialog.DesktopBaseUpPopopWindow
    /* renamed from: g */
    public void mo211708g() {
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void onOnlyPresenterCanAnnotateChanged(boolean z) {
        C61373b.AbstractC61374a.CC.$default$onOnlyPresenterCanAnnotateChanged(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void onSelfRtcModeUpdate(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$onSelfRtcModeUpdate(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.basedialog.DesktopBaseUpPopopWindow, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        m244682m();
        super.mo211606a();
    }

    @Override // com.ss.android.vc.meeting.basedialog.DesktopBaseUpPopopWindow
    /* renamed from: e */
    public int mo211706e() {
        return UIHelper.dp2px(280.0f);
    }

    @Override // com.ss.android.vc.meeting.basedialog.DesktopBaseUpPopopWindow
    /* renamed from: f */
    public int mo211707f() {
        return UIHelper.dp2px(44.0f);
    }

    @Override // com.ss.android.vc.meeting.basedialog.DesktopBaseUpPopopWindow
    /* renamed from: d */
    public View mo211705d() {
        if (mo211709h() == null) {
            return null;
        }
        View inflate = LayoutInflater.from(mo211709h()).inflate(R.layout.desktop_setting_host_control_window, (ViewGroup) null);
        this.f157452a = inflate;
        return inflate;
    }

    @Override // com.ss.android.vc.meeting.basedialog.DesktopBaseUpPopopWindow, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        super.dismiss();
        this.f157453b.mo212091I().mo212494b().mo212597b(this);
        this.f157453b.mo212091I().mo212498e().mo212444b(this);
    }

    /* renamed from: m */
    private void m244682m() {
        this.f157453b.mo212091I().mo212494b().mo212593a(this);
        this.f157453b.mo212091I().mo212498e().mo212443a(this);
        C62557a aVar = new C62557a(this.f157453b, this);
        this.f157454c = aVar;
        aVar.mo216328b(this.f157452a);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public void i_(boolean z) {
        C62557a aVar = this.f157454c;
        if (aVar != null) {
            aVar.mo216326a(z);
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public void mo212620a(Participant participant, Participant participant2) {
        if (!this.f157453b.aa().mo216284l()) {
            dismiss();
        }
    }

    public C62556a(Activity activity, View view, C61303k kVar) {
        super(activity, view);
        this.f157453b = kVar;
    }
}
