package com.ss.android.vc.meeting.module.meetingdialog.pstn.country;

import android.app.Activity;
import android.view.View;
import com.larksuite.framework.utils.KeyboardUtils;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountrySelectView;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.country.c */
public class C62410c extends AbstractView$OnAttachStateChangeListenerC61215b implements CountrySelectView.AbstractC62403a, AbstractC62416f {

    /* renamed from: d */
    protected CountrySelectView f156984d;

    /* renamed from: e */
    private int f156985e = -1;

    /* renamed from: f */
    private AbstractC62411a f156986f;

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.country.c$a */
    public interface AbstractC62411a {
        void onSelected(CountryInfo countryInfo);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountrySelectView.AbstractC62403a
    /* renamed from: k */
    public void mo215092k() {
        dismiss();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        super.mo211642i();
        mo211633b(this.f156985e);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        mo215803l();
        KeyboardUtils.hideKeyboard(bL_());
        this.f156984d.mo215769a(this.f153299a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo215803l() {
        if (bL_() != null) {
            this.f156985e = bL_().getWindow().getStatusBarColor();
            bM_();
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.AbstractC62416f
    /* renamed from: a */
    public void mo215801a(AbstractC62411a aVar) {
        this.f156986f = aVar;
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.AbstractC62416f
    /* renamed from: b */
    public void mo215802b(String str) {
        this.f156984d.setSelectedCountryCode(str);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountrySelectView.AbstractC62403a
    /* renamed from: a */
    public void mo215786a(CountryInfo countryInfo) {
        dismiss();
        AbstractC62411a aVar = this.f156986f;
        if (aVar != null) {
            aVar.onSelected(countryInfo);
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        CountrySelectView countrySelectView = new CountrySelectView(activity);
        this.f156984d = countrySelectView;
        countrySelectView.setActionListener(this);
        return this.f156984d;
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
        CountrySelectView countrySelectView = this.f156984d;
        if (countrySelectView != null) {
            countrySelectView.mo215771a(z);
        }
    }

    public C62410c(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }
}
