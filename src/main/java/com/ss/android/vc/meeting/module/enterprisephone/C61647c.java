package com.ss.android.vc.meeting.module.enterprisephone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.vc.meeting.module.enterprisephone.c */
public class C61647c extends AbstractC61645a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.enterprisephone.AbstractC61645a
    /* renamed from: a */
    public int mo213537a() {
        return R.layout.vc_fragment_enterprise_phone_dial_pad;
    }

    /* renamed from: a */
    public static C61647c m240601a(Intent intent) {
        C61647c cVar = new C61647c();
        cVar.setArguments(new Bundle());
        return cVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.enterprisephone.AbstractC61645a
    /* renamed from: a */
    public void mo213538a(View view, Bundle bundle) {
        getLifecycle().addObserver(new EnterprisePhoneDialObserver(this));
    }
}
