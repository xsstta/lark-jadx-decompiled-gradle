package com.ss.android.vc.meeting.module.meetingdialog.pstn.country;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.C62410c;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountrySelectView;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.country.b */
public class C62409b extends MeetingBaseDesktopDialog implements CountrySelectView.AbstractC62403a, AbstractC62416f {

    /* renamed from: a */
    private CountrySelectView f156982a;

    /* renamed from: b */
    private C62410c.AbstractC62411a f156983b;

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountrySelectView.AbstractC62403a
    /* renamed from: k */
    public void mo215787k() {
        dismiss();
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        this.f156982a.mo215769a(mo211719j());
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        CountrySelectView countrySelectView = new CountrySelectView(mo211718i());
        this.f156982a = countrySelectView;
        countrySelectView.setActionListener(this);
        return this.f156982a;
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.AbstractC62416f
    /* renamed from: a */
    public void mo215801a(C62410c.AbstractC62411a aVar) {
        this.f156983b = aVar;
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.AbstractC62416f
    /* renamed from: b */
    public void mo215802b(String str) {
        this.f156982a.setSelectedCountryCode(str);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountrySelectView.AbstractC62403a
    /* renamed from: a */
    public void mo215786a(CountryInfo countryInfo) {
        dismiss();
        C62410c.AbstractC62411a aVar = this.f156983b;
        if (aVar != null) {
            aVar.onSelected(countryInfo);
        }
    }

    public C62409b(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }
}
