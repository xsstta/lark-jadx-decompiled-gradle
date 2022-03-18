package com.bytedance.ee.bear.quoto.p525b;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.quoto.SingleFileExceedQuotaFragment;
import com.bytedance.ee.bear.quoto.SingleFileQuotaConfig;

/* renamed from: com.bytedance.ee.bear.quoto.b.c */
public class C10563c implements AbstractC10561a {

    /* renamed from: a */
    private Long f28337a;

    /* renamed from: b */
    private SingleFileQuotaConfig f28338b;

    @Override // com.bytedance.ee.bear.quoto.p525b.AbstractC10561a
    /* renamed from: a */
    public void mo40009a(FragmentActivity fragmentActivity) {
        SingleFileExceedQuotaFragment.m43823a(fragmentActivity, this.f28338b, this.f28337a.longValue());
    }

    public C10563c(Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null) {
            this.f28337a = Long.valueOf(extras.getLong("key_file_size"));
            this.f28338b = (SingleFileQuotaConfig) extras.getParcelable("key_quota_config");
        }
    }
}
