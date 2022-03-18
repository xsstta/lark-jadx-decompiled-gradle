package com.ss.android.vc.meeting.module.enterprisephone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;

/* renamed from: com.ss.android.vc.meeting.module.enterprisephone.d */
public class C61648d extends AbstractC61645a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.enterprisephone.AbstractC61645a
    /* renamed from: a */
    public int mo213537a() {
        return R.layout.vc_fragment_enterprise_phone_limitation;
    }

    /* renamed from: a */
    public static C61648d m240604a(Intent intent) {
        C61648d dVar = new C61648d();
        String stringExtra = intent.getStringExtra("chat_id");
        Bundle bundle = new Bundle();
        bundle.putSerializable("open_chatter", (OpenChatter) intent.getSerializableExtra("open_chatter"));
        bundle.putString("chat_id", stringExtra);
        dVar.setArguments(bundle);
        return dVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.enterprisephone.AbstractC61645a
    /* renamed from: a */
    public void mo213538a(View view, Bundle bundle) {
        getLifecycle().addObserver(new EnterprisePhoneLimitationObserver(this));
    }
}
